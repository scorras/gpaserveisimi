package es.bcn.gpa.gpaserveis.web.rest.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.bcn.gpa.gpaserveis.business.AuditServeisService;
import es.bcn.gpa.gpaserveis.business.ServeisService;
import es.bcn.gpa.gpaserveis.business.dto.audit.AuditServeisBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.DadesExpedientBDTO;
import es.bcn.gpa.gpaserveis.business.exception.GPAServeisServiceException;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.CallbackPortaSig;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DadesSignatura;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.Constants;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.portasig.TipusCodiEstatPortasigApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.mciportasig.notificacions.MciPortasigResultatPeticioDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.mciportasig.notificacions.MciPortasigResultatPeticioRespostaDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.mciportasig.notificacions.MciPortasigSignatarisDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.apachecommons.CommonsLog;

/**
 * The Class ServeisPortalRestController.
 */
@RestController
@RequestMapping(value = "/serveis/portasignatures", produces = MediaType.APPLICATION_JSON_VALUE)
@Lazy(true)
@Api(value = "Serveis Portasignatures API", tags = "Serveis Portasignatures API")
@CommonsLog
public class ServeisPortaSignaturesRestController extends BaseRestController {

	/** The serveis service. */
	@Autowired
	private ServeisService serveisService;

	/** The audit serveis service. */
	@Autowired
	private AuditServeisService auditServeisService;

	/**
	 * Servei espec??fic que invocar?? portasignatures per informar de l'estat de
	 * les peticions.
	 *
	 * @return void
	 * @throws GPAServeisServiceException
	 */
	@PostMapping("/resultat_peticio")
	@ApiOperation(nickname = "resultatEstatPeticioSignatura", value = "Resultat de l'estat de les peticions", tags = {
	        "Serveis Portasignatures API" })
	public MciPortasigResultatPeticioRespostaDTO resultatEstatPeticio(
	        @ApiParam(value = "Resultat del portasignatures a una petici?? de vist-i-plau/signatura", required = true) @RequestBody MciPortasigResultatPeticioDTO resultatPeticio)
	        throws GPAServeisServiceException {

		if (log.isInfoEnabled()) {
			log.info("resultatEstatPeticio(MciPortasigResultatPeticioDTO) - inici"); //$NON-NLS-1$
			log.info(resultatPeticio); // $NON-NLS-1$
		}

		String resultatAudit = "OK";
		GPAServeisServiceException ex = null;

		SimpleDateFormat simpleDateFormatPortasignatures = new SimpleDateFormat(Constants.DATE_TIME_PATTERN_PORTASIGNATURES);
		DateTimeFormatter dataHoraFormatter = DateTimeFormat.forPattern(Constants.DATE_TIME_PATTERN);

		MciPortasigResultatPeticioRespostaDTO resposta = new MciPortasigResultatPeticioRespostaDTO();

		try {
			CallbackPortaSig callbackPortaSig = new CallbackPortaSig();
			callbackPortaSig.setCodiEstat(resultatPeticio.getCodiEstat());
			callbackPortaSig.setCodiPeticio(resultatPeticio.getCodiPeticio());
			MciPortasigSignatarisDTO mciPortasigSignatarisDTO = resultatPeticio.getDetallSignataris().get(0);
			callbackPortaSig.setCodiUsuari(mciPortasigSignatarisDTO.getCodiUsuari());
			callbackPortaSig.setNifUsuari(mciPortasigSignatarisDTO.getNifUsuari());
			callbackPortaSig.setNomCompletUsuari(mciPortasigSignatarisDTO.getNomCompletUsuari());
			callbackPortaSig.setTicketPeticio(mciPortasigSignatarisDTO.getTicketPeticio());
			callbackPortaSig.setTipusPeticio(mciPortasigSignatarisDTO.getTipusPeticio());

			if (mciPortasigSignatarisDTO.getCodiEstat().equals(TipusCodiEstatPortasigApiParamValue.SIGNADA.getApiParamValue())) {
				try {
					Date dateInstantSignatura = simpleDateFormatPortasignatures.parse(mciPortasigSignatarisDTO.getInstantSignatura());
					callbackPortaSig.setInstantSignatura(new DateTime(dateInstantSignatura));
				} catch (Exception e) {
					log.error("S'ha produ??t un error a l'processar la data de signatura sota el format yyyy-MM-dd'T'HH:mm:ss.SSSXXX", e);
					callbackPortaSig.setInstantSignatura(dataHoraFormatter.parseDateTime(mciPortasigSignatarisDTO.getInstantSignatura()));
				}
			} else if (mciPortasigSignatarisDTO.getCodiEstat().equals(TipusCodiEstatPortasigApiParamValue.CADUCADA.getApiParamValue())) {
				try {
					Date dateDataCaducitat = simpleDateFormatPortasignatures.parse(mciPortasigSignatarisDTO.getDataCaducitat());
					callbackPortaSig.setDataCaducitat(new DateTime(dateDataCaducitat));
				} catch (Exception e) {
					log.error("Ocurri?? un error al procesar la fecha de cancelaci??n de firma bajo el formato yyyy-MM-dd'T'HH:mm:ss.SSSXXX",
					        e);
					callbackPortaSig.setDataCaducitat(dataHoraFormatter.parseDateTime(mciPortasigSignatarisDTO.getDataCaducitat()));
				}
			}

			DadesSignatura dadesSignatura = serveisService.consultarDadesSignaturaByCodiPeticio(callbackPortaSig.getCodiPeticio());

			DadesExpedientBDTO dadesExpedientBDTO = serveisService
			        .consultarDadesBasiquesExpedientByIdDocumentacio(dadesSignatura.getIdDocumentacio());

			callbackPortaSig.setUnitatGestoraIdext(dadesExpedientBDTO.getExpedientsRDTO().getUnitatGestoraIdext());
			callbackPortaSig.setDadesSignaturaDocumentRDTO(dadesSignatura);

			serveisService.callbackPortaSig(callbackPortaSig);

		} catch (Exception e) {
			log.error("resultatEstatPeticio(MciPortasigResultatPeticioDTO)", e);
			// $NON-NLS-1$
			resposta.setCodiError("KO");
			resposta.setDescError(ExceptionUtils.getFullStackTrace(e));
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/resultat_peticio");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Resultat de l'estat de les peticions");

			auditServeisService.registrarAuditServeisPortaSignatures(auditServeisBDTO, resultatPeticio, resposta, ex);
		}

		if (log.isInfoEnabled()) {
			log.info("resultatPeticio(MciPortasigResultatPeticioDTO) - fi"); //$NON-NLS-1$
		}
		return resposta;
	}

}