package es.bcn.gpa.gpaserveis.web.rest.controller;

import static org.apache.commons.lang.math.NumberUtils.INTEGER_ZERO;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import es.bcn.gpa.gpaserveis.business.AuditServeisService;
import es.bcn.gpa.gpaserveis.business.ServeisService;
import es.bcn.gpa.gpaserveis.business.dto.RespostaResultatBDTO;
import es.bcn.gpa.gpaserveis.business.dto.audit.AuditServeisBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.ActualitzarDeclaracioResponsableBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.ActualitzarDocumentEntradaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.CrearDeclaracioResponsableBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.CrearDocumentEntradaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.CrearDocumentTramitacioBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.DescarregarDocumentExpedientBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.DocumentsEntradaCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.DocumentsTramitacioCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.EsborrarDocumentBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.GuardarDocumentEntradaFitxerBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaAportarDocumentSollicitudBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaDocumentsEntradaCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaDocumentsTramitacioCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaEsborrarDocumentEntradaSollicitudBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaSubstituirDocumentSollicitudBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaUploadDocumentSollicitudBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.DadesExpedientBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.DadesSollicitudBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsCanviarEstatBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsRegistrarSollicitudBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.GestionarAvisosPerAccioBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaActualitzarTerceraPersonaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaCrearTerceraPersonaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaEsborrarTerceraPersonaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaSollicitudsActualitzarBDTO;
import es.bcn.gpa.gpaserveis.business.dto.procediments.DadesOperacioCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.procediments.DadesProcedimentBDTO;
import es.bcn.gpa.gpaserveis.business.dto.procediments.RespostaDadesOperacioCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.sollicituds.RespostaSollicitudCrearBDTO;
import es.bcn.gpa.gpaserveis.business.dto.sollicituds.RespostaSollicitudsRegistrarBDTO;
import es.bcn.gpa.gpaserveis.business.dto.sollicituds.SollicitudsActualitzarBDTO;
import es.bcn.gpa.gpaserveis.business.dto.sollicituds.SollicitudsCrearBDTO;
import es.bcn.gpa.gpaserveis.business.dto.tramits.TramitsOvtCercaBDTO;
import es.bcn.gpa.gpaserveis.business.exception.GPAServeisServiceException;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfDocsTramPolitiquesSig;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfdocstramTramitsOvt;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfiguracioDocsEntradaRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfiguracioDocsTramitacio;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfiguracioDocsTramitacioRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConsultarSignaturaResponse;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsEntActualizarRegistre;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsEntradaRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsFisics;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsTramitacioRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.RespostaPlantillaDocVinculada;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.SignarSegellDocument;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.TipusMime;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ActualitzarDadesSollicitudSollicituds;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.CrearSollicitud;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ExpedientCanviEstat;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ExpedientsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.GestionarAvisosPerAccio;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PersonesSollicitudRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RegistreDocumentacioExpedient;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RespostaCrearRegistreExpedient;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.SollicitudActualitzarRegistre;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.SollicitudsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ReqOperatiusTramOvt;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.AccionsEstatsRDTO;
import es.bcn.gpa.gpaserveis.web.exception.GPAApiParamValidationException;
import es.bcn.gpa.gpaserveis.web.initialization.interceptor.ClientEntity;
import es.bcn.gpa.gpaserveis.web.rest.controller.handler.ServeisRestControllerExceptionHandler;
import es.bcn.gpa.gpaserveis.web.rest.controller.helper.ServeisRestControllerSagaHelper;
import es.bcn.gpa.gpaserveis.web.rest.controller.helper.ServeisRestControllerValidationHelper;
import es.bcn.gpa.gpaserveis.web.rest.controller.helper.ServeisRestControllerVisibilitatHelper;
import es.bcn.gpa.gpaserveis.web.rest.controller.helper.bean.ValidateDadesOperacioResultat;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.Constants;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.ErrorPrincipal;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.Resultat;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.common.BooleanApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.IdiomaPlantillaDocApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.OrigenApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.RevisioApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.TipusDocumentacioVinculadaApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.TipusMimeApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.TipusSignaturaApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.expedient.AccioTramitadorApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.expedient.RelacioPersonaApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.expedient.TipusIniciacioSollicitudApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.procediment.SuportConfeccioApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.procediment.TramitOvtApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.mapper.cerca.expedient.ExpedientsApiParamToInternalMapper;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.mapper.consulta.atributs.DadesOperacioApiParamToInternalMapper;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.document.IdiomaPlantillaDocApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.PersonesRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.ActualitzarTerceraPersonaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.CrearTerceraPersonaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.RespostaActualitzarTerceraPersonaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.RespostaCrearTerceraPersonaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.RespostaEsborrarTerceraPersonaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.TerceraPersonaSollicitudRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.aportar.DocumentAportatCrearRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.aportar.DocumentacioAportarSollicitudRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.aportar.RespostaAportarDocumentSollicitudRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.esborrar.RespostaEsborrarDocumentSollicitudRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.substituir.DocumentAportatSubstituirRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.substituir.RespostaSubstituirDocumentSollicitudRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.upload.RespostaUploadDocumentSollicitudRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.sollicituds.actualitzar.RespostaActualitzarSollicitudRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.sollicituds.actualitzar.SollicitudActualitzarRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.sollicituds.crear.RespostaCrearSollicitudRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.sollicituds.crear.SollicitudCrearRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.sollicituds.helper.SollicitudActualitzarHelper;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.sollicituds.helper.SollicitudCrearHelper;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.sollicituds.registrar.RespostaRegistrarSollicitudRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.sollicituds.registrar.SollicitudRegistrarRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.sollicituds.RespostaConsultaSollicitudsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.sollicituds.SollicitudConsultaRDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Extension;
import io.swagger.annotations.ExtensionProperty;
import lombok.extern.apachecommons.CommonsLog;
import net.opentrends.openframe.services.configuration.annotation.EntornPropertySource;
import net.opentrends.openframe.services.rest.http.HttpHeaders;
import net.opentrends.openframe.services.rest.http.ResponseEntity;

/**
 * The Class ServeisPortalRestController.
 */
@RestController
@RequestMapping(value = "/serveis/portal", produces = MediaType.APPLICATION_JSON_VALUE)
@Lazy(true)
@Api(value = "Serveis Portal API", tags = "Serveis Portal API")

/** The Constant log. */
@CommonsLog
@EntornPropertySource(value = { "classpath:/app/config/gpaserveis.properties" })
public class ServeisPortalSollicitudRestController extends BaseRestController {

	/** The Constant BASE_MAPPING_SOLLICITUD. */
	private static final String BASE_MAPPING_SOLLICITUD = "/sollicituds/{idSollicitud}";

	/** The Constant BASE_MAPPING_SOLLICITUD_DOCUMENTACIO. */
	private static final String BASE_MAPPING_SOLLICITUD_DOCUMENTACIO = BASE_MAPPING_SOLLICITUD + "/documentacio";

	/** The serveis service. */
	@Autowired
	private ServeisService serveisService;

	/** The model mapper. */
	@Autowired
	private ModelMapper modelMapper;

	/** The expedients id organ. */
	@Value("${expedients.id.organ}")
	private String expedientsIdOrgan;

	/** The client entity. */
	@Autowired
	private ClientEntity clientEntity;

	/** The audit serveis service. */
	@Autowired
	private AuditServeisService auditServeisService;

	/**
	 * A aportar documentacio sollicitud.
	 *
	 * @param idSollicitud
	 *            the id sollicitud
	 * @param documentacioAportar
	 *            the documentacio aportar
	 * @return the resposta sollicitud aportar document RDTO
	 * @throws GPAServeisServiceException
	 */
	@PostMapping(BASE_MAPPING_SOLLICITUD_DOCUMENTACIO)
	@ApiOperation(nickname = "aportarDocumentacioSollicitudPortal", value = "Aportar documentaci?? a la sol??licitud", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaAportarDocumentSollicitudRDTO aportarDocumentacioSollicitud(
	        @ApiParam(value = "Id de la sol??licitud", required = true) @PathVariable BigDecimal idSollicitud,
	        @ApiParam(value = "Dades de la creaci?? del document") @RequestBody DocumentacioAportarSollicitudRDTO documentacioAportarSollicitud)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		GPAServeisServiceException ex = null;

		RespostaAportarDocumentSollicitudRDTO respostaAportarDocumentSollicitudRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_APORTAR_DOCUMENTACIO);
		List<DocsEntradaRDTO> docsEntradaRDTORespostaList = null;
		DadesSollicitudBDTO dadesSollicitudBDTO = null;
		List<ConfiguracioDocsEntradaRDTO> configuacioActualizar = null;
		try {

			// Buscar la sol y a partir de la sol obtener el expedient
			dadesSollicitudBDTO = serveisService.consultarDadesSollicitudPerVisibilitat(idSollicitud);
			ServeisRestControllerValidationHelper.validateSollicitud(dadesSollicitudBDTO, Resultat.ERROR_APORTAR_DOCUMENTACIO);
			// dadesExpedientBDTO =
			// serveisService.consultarDadesBasiquesExpedient(dadesSollicitudBDTO.getExpedientsRDTO().getId());

			// Las configuraciones de documentaci??n indicadas deben estar
			// asociadas al procedimiento del expediente
			DocumentsEntradaCercaBDTO documentsEntradaCercaBDTO = new DocumentsEntradaCercaBDTO(
			        dadesSollicitudBDTO.getExpedientsRDTO().getConfiguracioDocumentacioProc(), null);
			RespostaDocumentsEntradaCercaBDTO respostaDocumentsEntradaCercaBDTO = serveisService
			        .cercaConfiguracioDocumentacioEntrada(documentsEntradaCercaBDTO);
			HashMap<String, ConfiguracioDocsEntradaRDTO> map = ServeisRestControllerValidationHelper
			        .validateConfiguracioDocumentacioAportada(respostaDocumentsEntradaCercaBDTO.getConfiguracioDocsEntradaRDTOList(),
			                documentacioAportarSollicitud.getDocumentacio(), Resultat.ERROR_APORTAR_DOCUMENTACIO);

			configuacioActualizar = new ArrayList<>();
			for (DocumentAportatCrearRDTO documentAportatCrearRDTO : documentacioAportarSollicitud.getDocumentacio()) {
				for (ConfiguracioDocsEntradaRDTO configuracioDocsEntradaRDTO : respostaDocumentsEntradaCercaBDTO
				        .getConfiguracioDocsEntradaRDTOList()) {
					if (documentAportatCrearRDTO.getConfiguracioDocumentacio()
					        .equalsIgnoreCase(configuracioDocsEntradaRDTO.getUniqueId().toString())) {
						configuacioActualizar.add(configuracioDocsEntradaRDTO);
					}
				}
			}
			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersonesSollicitud(clientEntity, serveisService, null,
			        configuacioActualizar, null, null, dadesSollicitudBDTO, null, Resultat.ERROR_APORTAR_DOCUMENTACIO);

			// Se construye el modelo para la llamada a la operaci??n de aportar
			// documentaci??
			if (CollectionUtils.isNotEmpty(documentacioAportarSollicitud.getDocumentacio())) {
				docsEntradaRDTORespostaList = new ArrayList<DocsEntradaRDTO>();
				DocsEntradaRDTO docsEntradaRDTOResposta = null;
				for (DocumentAportatCrearRDTO documentAportatCrearRDTO : documentacioAportarSollicitud.getDocumentacio()) {
					DocsEntradaRDTO docsEntradaRDTO = modelMapper.map(documentAportatCrearRDTO, DocsEntradaRDTO.class);
					docsEntradaRDTO.setRevisio(RevisioApiParamValue.PENDENT.getInternalValue());
					docsEntradaRDTO.setOrigen(docsEntradaRDTO.getOrigen() == null ? OrigenApiParamValue.EXTERN.getInternalValue()
					        : docsEntradaRDTO.getOrigen());
					docsEntradaRDTO.setNou(NumberUtils.INTEGER_ONE);
					docsEntradaRDTO.setConfigDocEntrada(map.get(String.valueOf(docsEntradaRDTO.getConfigDocEntrada())).getId());
					docsEntradaRDTO.setDocsTercers(NumberUtils.INTEGER_ONE);
					docsEntradaRDTO.setSollicitudIdext(idSollicitud);
					docsEntradaRDTO.setEsborrany(1);

					BigDecimal idPersone = ServeisRestControllerValidationHelper.getIdUsuariInteressat(clientEntity,
					        dadesSollicitudBDTO.getPersonesInteressades(), dadesSollicitudBDTO.getSollicitant(),
					        dadesSollicitudBDTO.getRepresentant());
					if (idPersone != null) {
						docsEntradaRDTO.setPersonaIdext(idPersone);
					}

					if (BooleanUtils.isTrue(documentAportatCrearRDTO.getDeclaracioResponsable())) {
						CrearDeclaracioResponsableBDTO crearDeclaracioResponsableBDTO = new CrearDeclaracioResponsableBDTO(
						        dadesSollicitudBDTO.getExpedientsRDTO().getId(), docsEntradaRDTO);
						docsEntradaRDTOResposta = serveisService.crearDeclaracioResponsable(crearDeclaracioResponsableBDTO);
					} else {
						CrearDocumentEntradaBDTO crearDocumentEntradaBDTO = new CrearDocumentEntradaBDTO(
						        dadesSollicitudBDTO.getExpedientsRDTO().getId(), docsEntradaRDTO);
						docsEntradaRDTOResposta = serveisService.crearDocumentEntrada(crearDocumentEntradaBDTO);

						// Avisos. ACCIONS_ESTATS: 2, 3, 4, 5, 6, 7, 202
						GestionarAvisosPerAccio gestionarAvisosPerAccio = new GestionarAvisosPerAccio();
						for (AccionsEstatsRDTO accionsEstatsRDTO : dadesSollicitudBDTO.getAccionsDisponibles()) {
							if (accionsEstatsRDTO.getAccio()
							        .compareTo(AccioTramitadorApiParamValue.APORTAR_DOCUMENTACIO.getInternalValue()) == INTEGER_ZERO) {
								gestionarAvisosPerAccio.setIdAccioEstat(accionsEstatsRDTO.getId());
								break;
							}
						}
						GestionarAvisosPerAccioBDTO gestionarAvisosPerAccioBDTO = new GestionarAvisosPerAccioBDTO(gestionarAvisosPerAccio,
						        dadesSollicitudBDTO.getExpedientsRDTO().getId());
						serveisService.gestionarAvisosPerAccio(gestionarAvisosPerAccioBDTO);
					}
					docsEntradaRDTORespostaList.add(docsEntradaRDTOResposta);
				}
			}
		} catch (GPAApiParamValidationException e) {
			log.error("aportarDocumentacioExpedient(BigDecimal, List<DocumentAportatCrearRDTO>)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} catch (Exception e) {
			log.error("aportarDocumentacioExpedient(BigDecimal, List<DocumentAportatCrearRDTO>)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_APORTAR_DOCUMENTACIO, e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/sollicituds/" + idSollicitud + "/documentacio");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Aportar documentaci?? a la sol??licitud");

			auditServeisService.registrarAuditServeisPortalSollicituds(auditServeisBDTO, documentacioAportarSollicitud,
			        respostaResultatBDTO, ex);
		}

		RespostaAportarDocumentSollicitudBDTO respostaAportarDocumentSollicitudBDTO = new RespostaAportarDocumentSollicitudBDTO(
		        docsEntradaRDTORespostaList, (dadesSollicitudBDTO != null && dadesSollicitudBDTO.getExpedientsRDTO() != null)
		                ? dadesSollicitudBDTO.getExpedientsRDTO() : null,
		        (dadesSollicitudBDTO != null ? dadesSollicitudBDTO.getSollicitudsRDTO() : null), respostaResultatBDTO);
		respostaAportarDocumentSollicitudRDTO = modelMapper.map(respostaAportarDocumentSollicitudBDTO,
		        RespostaAportarDocumentSollicitudRDTO.class);

		return respostaAportarDocumentSollicitudRDTO;
	}

	/**
	 * Esborrar document.
	 *
	 * @param idSollicitud
	 *            the id sollicitud
	 * @param idDocument
	 *            the id document
	 * @return the resposta esborrar document RDTO
	 * @throws GPAServeisServiceException
	 */
	@DeleteMapping(BASE_MAPPING_SOLLICITUD_DOCUMENTACIO + "/{idDocument}")
	@ApiOperation(nickname = "esborrarDocumentPortal", value = "Esborrar un document de la sollicitud", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaEsborrarDocumentSollicitudRDTO esborrarDocument(
	        @ApiParam(value = "Identificador de la sol??licitud", required = true) @PathVariable BigDecimal idSollicitud,
	        @ApiParam(value = "Identificador del document", required = true) @PathVariable BigDecimal idDocument)
	        throws GPAServeisServiceException {
		if (log.isDebugEnabled()) {
			log.debug("esborrarDocument(BigDecimal, BigDecimal) - inici"); //$NON-NLS-1$
		}

		String resultatAudit = "OK";
		GPAServeisServiceException ex = null;

		RespostaEsborrarDocumentSollicitudRDTO respostaEsborrarDocumentSollicitudRDTO = null;
		DocsEntradaRDTO docsEntradaRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_ESBORRAR_DOCUMENT);
		DadesSollicitudBDTO dadesSollicitudBDTO = null;
		try {
			dadesSollicitudBDTO = serveisService.consultarDadesSollicitudPerVisibilitat(idSollicitud);
			ServeisRestControllerValidationHelper.validateSollicitud(dadesSollicitudBDTO, Resultat.ERROR_ESBORRAR_DOCUMENT);

			// El id del documento debe existir y pertenecer a la solicitud
			// indicada
			docsEntradaRDTO = serveisService.consultarDadesDocumentAportat(idDocument);
			ServeisRestControllerValidationHelper.validateDocumentAportat(docsEntradaRDTO, dadesSollicitudBDTO,
			        Resultat.ERROR_ESBORRAR_DOCUMENT);

			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersonesSollicitud(clientEntity, serveisService, null, null,
			        docsEntradaRDTO, null, dadesSollicitudBDTO, null, Resultat.ERROR_ESBORRAR_DOCUMENT);

			// Se construye el modelo para la llamada a la operaci??n de esborrar
			// document
			EsborrarDocumentBDTO esborrarDocumentBDTO = new EsborrarDocumentBDTO(dadesSollicitudBDTO.getExpedientsRDTO().getId(),
			        idDocument);

			serveisService.esBorrarDocumentacioEntrada(esborrarDocumentBDTO);

			// Avisos. ACCIONS_ESTATS: 122, 123, 124, 125, 126, 127, 180, 181
			GestionarAvisosPerAccio gestionarAvisosPerAccio = new GestionarAvisosPerAccio();
			for (AccionsEstatsRDTO accionsEstatsRDTO : dadesSollicitudBDTO.getAccionsDisponibles()) {
				if (accionsEstatsRDTO.getAccio()
				        .compareTo(AccioTramitadorApiParamValue.ESBORRAR_DOCUMENT.getInternalValue()) == INTEGER_ZERO) {
					gestionarAvisosPerAccio.setIdAccioEstat(accionsEstatsRDTO.getId());
					break;
				}
			}
			GestionarAvisosPerAccioBDTO gestionarAvisosPerAccioBDTO = new GestionarAvisosPerAccioBDTO(gestionarAvisosPerAccio,
			        dadesSollicitudBDTO.getExpedientsRDTO().getId());
			serveisService.gestionarAvisosPerAccio(gestionarAvisosPerAccioBDTO);

		} catch (GPAApiParamValidationException e) {
			log.error("esborrarDocument(BigDecimal, BigDecimal)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} catch (Exception e) {
			log.error("esborrarDocument(BigDecimal, BigDecimal)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_ESBORRAR_DOCUMENT, e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/sollicituds/" + idSollicitud + "/documentacio/" + idDocument);
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("DELETE");
			auditServeisBDTO.setValueAccio("Esborrar un document de la sollicitud");

			auditServeisService.registrarAuditServeisPortalSollicituds(auditServeisBDTO, null, respostaResultatBDTO, ex);
		}

		ExpedientsRDTO expedientsRDTO = (dadesSollicitudBDTO != null) ? dadesSollicitudBDTO.getExpedientsRDTO() : null;
		RespostaEsborrarDocumentEntradaSollicitudBDTO respostaEsborrarDocumentEntradaSollicitudBDTO = new RespostaEsborrarDocumentEntradaSollicitudBDTO(
		        expedientsRDTO, docsEntradaRDTO, respostaResultatBDTO,
		        (dadesSollicitudBDTO != null && dadesSollicitudBDTO.getSollicitudsRDTO() != null) ? dadesSollicitudBDTO.getSollicitudsRDTO()
		                : null);
		respostaEsborrarDocumentSollicitudRDTO = modelMapper.map(respostaEsborrarDocumentEntradaSollicitudBDTO,
		        RespostaEsborrarDocumentSollicitudRDTO.class);

		if (log.isDebugEnabled()) {
			log.debug("esborrarDocument(BigDecimal, BigDecimal) - fi"); //$NON-NLS-1$
		}
		return respostaEsborrarDocumentSollicitudRDTO;
	}

	/**
	 * Upload document sol??licitud.
	 *
	 * @param idSollicitud
	 *            the id sollicitud
	 * @param idDocument
	 *            the id document
	 * @param file
	 *            the file
	 * @return the resposta upload document RDTO
	 * @throws GPAServeisServiceException
	 */
	@PostMapping(value = BASE_MAPPING_SOLLICITUD_DOCUMENTACIO + "/{idDocument}/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	@ApiOperation(nickname = "uploadDocumentSollicitudPortal", value = "Pujar el contingut d'un document de la sol??licitud al gestor documental", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	@ApiImplicitParams({
	        @ApiImplicitParam(name = "idGestorDocumental", value = "Identificador Gestor Documental", dataType = "string", paramType = "form", required = false) })
	public RespostaUploadDocumentSollicitudRDTO uploadDocumentSollicitud(
	        @ApiParam(value = "Id de la sol??licitud", required = true) @PathVariable BigDecimal idSollicitud,
	        @ApiParam(value = "Identificador del document", required = true) @PathVariable BigDecimal idDocument,
	        @ApiParam(value = "Fitxer") @RequestParam(name = "file", required = false) MultipartFile file,
	        @ApiParam(value = "Identificador Gestor Documental") @RequestParam(name = "idGestorDocumental", required = false) String idGestorDocumental)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		GPAServeisServiceException ex = null;

		RespostaUploadDocumentSollicitudRDTO respostaUploadDocumentSollicitudRDTO = null;
		DadesSollicitudBDTO dadesSollicitudBDTO = null;
		DocsEntradaRDTO docsEntradaRDTOResposta = null;
		DocsEntradaRDTO docsEntradaRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_UPLOAD_DOCUMENT);
		try {
			dadesSollicitudBDTO = serveisService.consultarDadesSollicitudPerVisibilitat(idSollicitud);
			ServeisRestControllerValidationHelper.validateSollicitud(dadesSollicitudBDTO, Resultat.ERROR_UPLOAD_DOCUMENT);

			// El id del documento debe existir y pertenecer a la solicitud
			// indicada
			docsEntradaRDTO = serveisService.consultarDadesDocumentAportat(idDocument);
			ServeisRestControllerValidationHelper.validateDocumentAportat(docsEntradaRDTO, dadesSollicitudBDTO,
			        Resultat.ERROR_UPLOAD_DOCUMENT);

			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersonesSollicitud(clientEntity, serveisService, null, null,
			        docsEntradaRDTO, null, dadesSollicitudBDTO, null, Resultat.ERROR_UPLOAD_DOCUMENT);

			// Se valida que venga file o idgestor documental para decidir que
			// operacion realizar
			ServeisRestControllerValidationHelper.validateEntradaUpload(file, idGestorDocumental, Resultat.ERROR_UPLOAD_DOCUMENT);

			// No hay una acci??n asociada al upload
			if (file != null) {
				// No se debe permitir subir un fichero a una Declaraci??n
				// Responsable
				ServeisRestControllerValidationHelper.validateDocumentUpload(docsEntradaRDTO, Resultat.ERROR_UPLOAD_DOCUMENT);

				// Se construye el modelo para la llamada a la operaci??n de
				// upload document
				GuardarDocumentEntradaFitxerBDTO guardarDocumentEntradaFitxerBDTO = new GuardarDocumentEntradaFitxerBDTO(
				        dadesSollicitudBDTO.getExpedientsRDTO().getId(), docsEntradaRDTO, file, null);
				docsEntradaRDTOResposta = serveisService.guardarDocumentEntradaFitxer(guardarDocumentEntradaFitxerBDTO);
			}
			if (StringUtils.isNotEmpty(idGestorDocumental)) {
				GuardarDocumentEntradaFitxerBDTO guardarDocumentEntradaFitxerBDTO = new GuardarDocumentEntradaFitxerBDTO(
				        dadesSollicitudBDTO.getExpedientsRDTO().getId(), docsEntradaRDTO, null, idGestorDocumental);

				// En caso de que la subida del documento sea desde el portal
				// del informador se tratar??n de documentos escaneados con DOCEO
				// y habr?? que copiar el contenido en el documento original
				// relacionado, que se asociar?? al docEntrada de GPA
				if (!ServeisRestControllerVisibilitatHelper.esUsuariCiutada(clientEntity)) {
					docsEntradaRDTOResposta = serveisService
					        .guardarDocumentEntradaEscanejatGestorDocumental(guardarDocumentEntradaFitxerBDTO);
				} else {
					docsEntradaRDTOResposta = serveisService.guardarDocumentEntradaGestorDocumental(guardarDocumentEntradaFitxerBDTO);
				}
			}

			// Si el documento de entrada est?? basado en plantilla se deber??
			// almacenar el XML de datos en la posici??n 1
			if (docsEntradaRDTOResposta != null && docsEntradaRDTO.getConfiguracioDocsEntrada() != null
			        && SuportConfeccioApiParamValue.PLANTILLA.getInternalValue()
			                .equals(docsEntradaRDTO.getConfiguracioDocsEntrada().getSuportConfeccio())) {
				// Se guarda el XML de datos en la posici??n 1 del objeto
				// documental del documento de solicitud (basado en plantilla)
				String xmlSolicitud = guardarXMLSollicitud(dadesSollicitudBDTO, docsEntradaRDTOResposta.getCodi());
				// calculamos el hash del XML y actualizamos la solicitud
				// con el hash
				String hash = DigestUtils.sha256Hex(xmlSolicitud);
				SollicitudsRDTO sollicitud = dadesSollicitudBDTO.getSollicitudsRDTO();
				sollicitud.setHash(hash);
				serveisService.updateSollicitud(sollicitud);
			}

		} catch (GPAApiParamValidationException e) {
			log.error("uploadDocumentExpedient(BigDecimal, BigDecimal, MultipartFile)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} catch (Exception e) {
			log.error("uploadDocumentExpedient(BigDecimal, BigDecimal, MultipartFile)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_UPLOAD_DOCUMENT, e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/sollicituds/" + idSollicitud + "/documentacio/" + idDocument + "/upload");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Pujar el contingut d'un document de la sol??licitud al gestor documental");

			auditServeisService.registrarAuditServeisPortalSollicituds(auditServeisBDTO, null, respostaResultatBDTO, ex);
		}

		RespostaUploadDocumentSollicitudBDTO respostaUploadDocumentSollicitudBDTO = new RespostaUploadDocumentSollicitudBDTO(
		        docsEntradaRDTOResposta, dadesSollicitudBDTO != null ? dadesSollicitudBDTO.getExpedientsRDTO() : null, respostaResultatBDTO,
		        dadesSollicitudBDTO != null ? dadesSollicitudBDTO.getSollicitudsRDTO() : null);
		respostaUploadDocumentSollicitudRDTO = modelMapper.map(respostaUploadDocumentSollicitudBDTO,
		        RespostaUploadDocumentSollicitudRDTO.class);

		return respostaUploadDocumentSollicitudRDTO;
	}

	/**
	 * Descarregar document expedient.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @param idDocument
	 *            the id document
	 * @return the response entity
	 * @throws GPAServeisServiceException
	 */
	@GetMapping(value = BASE_MAPPING_SOLLICITUD_DOCUMENTACIO + "/{idDocument}", produces = "*/*")
	@ApiOperation(nickname = "descarregarDocumentSollicitudPortal", value = "Descarregar document de la sol??licitud", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public ResponseEntity<byte[]> descarregarDocumentSollicitud(
	        @ApiParam(value = "Id de la sol??licitud", required = true) @PathVariable BigDecimal idSollicitud,
	        @ApiParam(value = "Identificador del document", required = true) @PathVariable BigDecimal idDocument)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		GPAServeisServiceException ex = null;
		ResponseEntity<byte[]> responseEntity = null;

		DadesSollicitudBDTO dadesSollicitudBDTO = null;
		DocsEntradaRDTO docsEntradaRDTO = null;
		DocsTramitacioRDTO docsTramitacioRDTO = null;
		try {
			dadesSollicitudBDTO = serveisService.consultarDadesSollicitudPerVisibilitat(idSollicitud);
			ServeisRestControllerValidationHelper.validateDescargaDocumentSollicitud(dadesSollicitudBDTO,
			        Resultat.ERROR_DESCARREGAR_DOCUMENT);

			docsEntradaRDTO = serveisService.consultarDadesDocumentAportat(idDocument);
			docsTramitacioRDTO = serveisService.consultarDadesDocumentGenerat(idDocument);

			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersonesSollicitud(clientEntity, serveisService, null, null,
			        docsEntradaRDTO, docsTramitacioRDTO, dadesSollicitudBDTO, null, Resultat.ERROR_DESCARREGAR_DOCUMENT);

			// El id del documento debe existir y pertenecer al expediente de la
			// solicitud
			DocsRDTO docsRDTO = serveisService.consultarDadesDocument(idDocument);
			ServeisRestControllerValidationHelper.validateDocument(docsRDTO, dadesSollicitudBDTO.getExpedientsRDTO(),
			        Resultat.ERROR_DESCARREGAR_DOCUMENT);

			// Se construye el modelo para la llamada a la operaci??n de
			// descarregar document
			DescarregarDocumentExpedientBDTO descarregarDocumentExpedientBDTO = new DescarregarDocumentExpedientBDTO(
			        dadesSollicitudBDTO.getExpedientsRDTO().getId(), idDocument);
			byte[] result = serveisService.descarregarDocumentExpedient(descarregarDocumentExpedientBDTO);

			HttpHeaders headers = new HttpHeaders();
			headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
			headers.add("Pragma", "no-cache");
			headers.add("Expires", "0");
			headers.add("Content-Length", String.valueOf(result.length));
			headers.add("Content-Type", MediaType.APPLICATION_OCTET_STREAM_VALUE);
			String filename = docsRDTO.getDocsFisics().getNom();
			headers.add("Content-Disposition", "attachment; filename=\"" + filename + "\"");

			responseEntity = new ResponseEntity<byte[]>(result, headers, HttpStatus.OK);

		} catch (GPAApiParamValidationException e) {
			log.error("descarregarDocumentSollicitud(BigDecimal, BigDecimal)", e); //$NON-NLS-1$ type
			responseEntity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} catch (Exception e) {
			log.error("descarregarDocumentSollicitud(BigDecimal, BigDecimal)", e); //$NON-NLS-1$
			responseEntity = new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/sollicituds/" + idSollicitud + "/documentacio/" + idDocument);
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Descarregar document de la sol??licitud");

			auditServeisService.registrarAuditServeisPortalSollicituds(auditServeisBDTO, null, responseEntity, ex);
		}
		return responseEntity;
	}

	/**
	 * Substituir document sollicitud.
	 *
	 * @param idSollicitud
	 *            the id sollicitud
	 * @param idDocument
	 *            the id document
	 * @param documentSubstituir
	 *            the document substituir
	 * @return the resposta substituir document sollicitud RDTO
	 * @throws GPAServeisServiceException
	 */
	@PostMapping(BASE_MAPPING_SOLLICITUD_DOCUMENTACIO + "/{idDocument}/substituir")
	@ApiOperation(nickname = "substituirDocumentSollicitudPortal", value = "Substituir les dades d'un document de la sol??licitud", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaSubstituirDocumentSollicitudRDTO substituirDocumentSollicitud(
	        @ApiParam(value = "Id de la sol??licitud", required = true) @PathVariable BigDecimal idSollicitud,
	        @ApiParam(value = "Identificador del document", required = true) @PathVariable BigDecimal idDocument,
	        @ApiParam(value = "Dades de la versi?? del document") @RequestBody DocumentAportatSubstituirRDTO documentSubstituir)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		GPAServeisServiceException ex = null;

		RespostaSubstituirDocumentSollicitudRDTO respostaSubstituirDocumentSollicitudRDTO = null;
		DocsEntradaRDTO docsEntradaRDTO = null;
		DocsEntradaRDTO docsEntradaRDTOResposta = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_SUBSTITUIR_DOCUMENT);
		DadesSollicitudBDTO dadesSollicitudBDTO = null;
		try {
			// El id de sollicitud debe existir
			dadesSollicitudBDTO = serveisService.consultarDadesSollicitudPerVisibilitat(idSollicitud);
			ServeisRestControllerValidationHelper.validateSollicitud(dadesSollicitudBDTO, Resultat.ERROR_SUBSTITUIR_DOCUMENT);

			// El id del documento debe existir y pertenecer a la solicitud
			// indicada
			docsEntradaRDTO = serveisService.consultarDadesDocumentAportat(idDocument);
			ServeisRestControllerValidationHelper.validateDocumentAportat(docsEntradaRDTO, dadesSollicitudBDTO,
			        Resultat.ERROR_SUBSTITUIR_DOCUMENT);

			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersonesSollicitud(clientEntity, serveisService, null, null,
			        docsEntradaRDTO, null, dadesSollicitudBDTO, null, Resultat.ERROR_SUBSTITUIR_DOCUMENT);

			// La configuraci??n de documentaci??n indicada debe estar asociada al
			// procedimiento del expediente
			DocumentsEntradaCercaBDTO documentsEntradaCercaBDTO = new DocumentsEntradaCercaBDTO(
			        dadesSollicitudBDTO.getExpedientsRDTO().getConfiguracioDocumentacioProc(), null);
			RespostaDocumentsEntradaCercaBDTO respostaDocumentsEntradaCercaBDTO = serveisService
			        .cercaConfiguracioDocumentacioEntrada(documentsEntradaCercaBDTO);
			HashMap<String, ConfiguracioDocsEntradaRDTO> map = ServeisRestControllerValidationHelper
			        .validateConfiguracioDocumentacioSubstituir(respostaDocumentsEntradaCercaBDTO.getConfiguracioDocsEntradaRDTOList(),
			                documentSubstituir, Resultat.ERROR_SUBSTITUIR_DOCUMENT);

			// Se construye el modelo para la llamada a la operaci??n de aportar
			// documentaci??
			DocsEntradaRDTO docsEntradaRDTOSubstituir = modelMapper.map(documentSubstituir, DocsEntradaRDTO.class);
			docsEntradaRDTOSubstituir.setId(docsEntradaRDTO.getId());
			docsEntradaRDTOSubstituir.setDocumentacio(docsEntradaRDTO.getDocumentacio());
			docsEntradaRDTOSubstituir.setRevisio(docsEntradaRDTO.getRevisio());
			docsEntradaRDTOSubstituir.setConfigDocEntrada(map.get(String.valueOf(docsEntradaRDTOSubstituir.getConfigDocEntrada())).getId());
			docsEntradaRDTOSubstituir.setEsborrany(1);
			if (docsEntradaRDTO.getDocsFisics() != null && docsEntradaRDTOSubstituir.getDocsFisics() != null) {
				docsEntradaRDTOSubstituir.getDocsFisics().setId(docsEntradaRDTO.getDocsFisics().getId());
			}

			if (docsEntradaRDTO.getDeclaracioResponsable()
			        .compareTo(BooleanApiParamValue.TRUE.getInternalValue()) == NumberUtils.INTEGER_ZERO) {
				ActualitzarDeclaracioResponsableBDTO actualitzarDeclaracioResponsableBDTO = new ActualitzarDeclaracioResponsableBDTO(
				        dadesSollicitudBDTO.getExpedientsRDTO().getId(), docsEntradaRDTOSubstituir);
				docsEntradaRDTOResposta = serveisService.actualitzarDeclaracioResponsable(actualitzarDeclaracioResponsableBDTO);
			} else {
				ActualitzarDocumentEntradaBDTO actualitzarDocumentEntradaBDTO = new ActualitzarDocumentEntradaBDTO(
				        dadesSollicitudBDTO.getExpedientsRDTO().getId(), docsEntradaRDTOSubstituir);
				docsEntradaRDTOResposta = serveisService.actualitzarDocumentEntrada(actualitzarDocumentEntradaBDTO);

				// Avisos. ACCIONS_ESTATS: 50, 51, 52, 53, 54, 55, 148, 149
				GestionarAvisosPerAccio gestionarAvisosPerAccio = new GestionarAvisosPerAccio();
				for (AccionsEstatsRDTO accionsEstatsRDTO : dadesSollicitudBDTO.getAccionsDisponibles()) {
					if (accionsEstatsRDTO.getAccio()
					        .compareTo(AccioTramitadorApiParamValue.SUBSTITUIR_DOCUMENT.getInternalValue()) == INTEGER_ZERO) {
						gestionarAvisosPerAccio.setIdAccioEstat(accionsEstatsRDTO.getId());
						break;
					}
				}
				GestionarAvisosPerAccioBDTO gestionarAvisosPerAccioBDTO = new GestionarAvisosPerAccioBDTO(gestionarAvisosPerAccio,
				        dadesSollicitudBDTO.getExpedientsRDTO().getId());
				serveisService.gestionarAvisosPerAccio(gestionarAvisosPerAccioBDTO);
			}

		} catch (GPAApiParamValidationException e) {
			log.error("substituirDocumentExpedient(BigDecimal, BigDecimal, List<DocumentAportatCrearRDTO>)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} catch (Exception e) {
			log.error("substituirDocumentExpedient(BigDecimal, BigDecimal, List<DocumentAportatCrearRDTO>)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_SUBSTITUIR_DOCUMENT, e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/sollicituds/" + idSollicitud + "/documentacio/" + idDocument + "/substituir");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Substituir les dades d'un document de la sol??licitud");

			auditServeisService.registrarAuditServeisPortalSollicituds(auditServeisBDTO, documentSubstituir, respostaResultatBDTO, ex);
		}

		RespostaSubstituirDocumentSollicitudBDTO respostaSubstituirDocumentSollicitudBDTO = new RespostaSubstituirDocumentSollicitudBDTO(
		        docsEntradaRDTOResposta,
		        (dadesSollicitudBDTO != null && dadesSollicitudBDTO.getExpedientsRDTO() != null) ? dadesSollicitudBDTO.getExpedientsRDTO()
		                : null,
		        respostaResultatBDTO, (dadesSollicitudBDTO != null && dadesSollicitudBDTO.getSollicitudsRDTO() != null)
		                ? dadesSollicitudBDTO.getSollicitudsRDTO() : null);
		respostaSubstituirDocumentSollicitudRDTO = modelMapper.map(respostaSubstituirDocumentSollicitudBDTO,
		        RespostaSubstituirDocumentSollicitudRDTO.class);

		return respostaSubstituirDocumentSollicitudRDTO;
	}

	/**
	 * Crear solicitud expedient.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @param sollicitudCrearRDTO
	 *            the sollicitud crear RDTO
	 * @return the resposta crear expedient RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@PostMapping("expedients/{codiExpedient}/sollicituds")
	@ApiOperation(nickname = "crearSolicitudPortal", value = "Crear una sol??licitud", tags = { "Serveis Portal API" }, extensions = {
	        @Extension(name = "x-imi-roles", properties = { @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaCrearSollicitudRDTO crearSolicitud(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Dades de la creaci?? de la sol??licitud") @RequestBody SollicitudCrearRDTO sollicitudCrearRDTO)
	        throws GPAServeisServiceException {
		if (log.isDebugEnabled()) {
			log.debug("crearSolicitud(SollicitudCrearRDTO) - inici"); //$NON-NLS-1$
		}

		String resultatAudit = "OK";
		GPAServeisServiceException ex = null;

		RespostaCrearSollicitudRDTO respostaCrearSollicitudRDTO = null;
		SollicitudsRDTO returnSollicitudsRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_CREAR_SOLLICITUD);
		DadesExpedientBDTO dadesExpedientBDTO = null;
		DadesProcedimentBDTO dadesProcedimentBDTO = null;
		BigDecimal idTramitOvt = null;
		try {

			dadesExpedientBDTO = serveisService.consultarDadesBasiquesExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO, Resultat.ERROR_CREAR_SOLLICITUD);
			
			ServeisRestControllerValidationHelper.validateExpedientIsBorrant(dadesExpedientBDTO, Resultat.ERROR_CREAR_SOLLICITUD);

			// Si se indica alguna persona al menos debe indicarse el
			// Solicitante
			ServeisRestControllerValidationHelper.validateSollicitantCrearSolicitudExpedient(sollicitudCrearRDTO.getSollicitant(),
			        Resultat.ERROR_CREAR_SOLLICITUD);

			// Validaciones
			// 1- Validar que la solicitud que llega no sea SOL (Pedir a Longi)
			ServeisRestControllerValidationHelper.validateTipusSollicitud(sollicitudCrearRDTO.getCodiTramit(),
			        Resultat.ERROR_CREAR_SOLLICITUD);
			// 2- Validar que la acci??n es permitida en funci??n del tipo de
			// solicitud:
			// APO
			// Aportar documentaci??n si la acci??n es permitida
			if (StringUtils.equals(sollicitudCrearRDTO.getCodiTramit(), TramitOvtApiParamValue.APO.getApiParamValue())) {
				ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
				        AccioTramitadorApiParamValue.APORTAR_DOCUMENTACIO, Resultat.ERROR_CREAR_SOLLICITUD);
				idTramitOvt = TramitOvtApiParamValue.APO.getInternalValue();
			}
			// REQ / ALE
			// Esmenar expedient si la acci??n es permitida
			else if (StringUtils.equals(sollicitudCrearRDTO.getCodiTramit(), TramitOvtApiParamValue.REQ.getApiParamValue())
			        || StringUtils.equals(sollicitudCrearRDTO.getCodiTramit(), TramitOvtApiParamValue.ALE.getApiParamValue())) {
				ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
				        AccioTramitadorApiParamValue.RESPONDRE_REQUERIMENT_O_TRAMIT_ALLEGACIONS_O_IP, Resultat.ERROR_CREAR_SOLLICITUD);

				if (StringUtils.equals(sollicitudCrearRDTO.getCodiTramit(), TramitOvtApiParamValue.REQ.getApiParamValue())) {
					idTramitOvt = TramitOvtApiParamValue.REQ.getInternalValue();
				} else {
					idTramitOvt = TramitOvtApiParamValue.ALE.getInternalValue();
				}
			}

			// se valida que si la relacion es de persona interesada, solo
			// permita valores sollicitant y representant
			ServeisRestControllerValidationHelper.validatePersonesInteressadesExpedient(sollicitudCrearRDTO.getPersonesInteressades(),
			        Resultat.ERROR_CREAR_SOLLICITUD);

			// 1 - validar que la persona logueada esta dentro de los
			// interesados
			// 2 - validar que si hay lista de implicados, tengan
			// relacioTerceraPersona y coincida alguna definida en el
			// procedimiento
			if (sollicitudCrearRDTO.getPersonesImplicades() != null) {
				dadesProcedimentBDTO = serveisService
				        .consultarDadesBasiquesProcediment(dadesExpedientBDTO.getExpedientsRDTO().getProcedimentIdext());
			}
			ServeisRestControllerValidationHelper.validateUsuariLogueadoInteressadesExpedient(clientEntity, dadesProcedimentBDTO,
			        sollicitudCrearRDTO.getPersonesInteressades(), sollicitudCrearRDTO.getPersonesImplicades(),
			        sollicitudCrearRDTO.getSollicitant(), sollicitudCrearRDTO.getRepresentant(), idTramitOvt,
			        Resultat.ERROR_CREAR_SOLLICITUD);

			// Informaci??n del Tr??mite
			TramitsOvtCercaBDTO tramitsOvtCercaBDTO = new TramitsOvtCercaBDTO(
			        DadesOperacioApiParamToInternalMapper.getTramitOvtInternalValue(sollicitudCrearRDTO.getCodiTramit()));
			es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.TramitsOvtRDTO internalTramitsOvtRDTO = serveisService
			        .consultarDadesTramitOvt(tramitsOvtCercaBDTO);

			// Aplicamos el campo de Relaci??n correspondiente a las personas que
			// se relacionan
			sollicitudCrearRDTO.getSollicitant().setRelacio(RelacioPersonaApiParamValue.SOLLICITANT.getApiParamValue());
			if (sollicitudCrearRDTO.getRepresentant() != null) {
				sollicitudCrearRDTO.getRepresentant().setRelacio(RelacioPersonaApiParamValue.REPRESENTANT.getApiParamValue());
			}

			if (sollicitudCrearRDTO.getPersonesInteressades() != null) {
				for (PersonesRDTO personaSollicitud : sollicitudCrearRDTO.getPersonesInteressades()) {
					if (personaSollicitud.getRelacio() == null)
						personaSollicitud.setRelacio(RelacioPersonaApiParamValue.REPRESENTANT.getApiParamValue());
				}
			}

			SollicitudCrearHelper sollicitudCrearHelper = new SollicitudCrearHelper(sollicitudCrearRDTO, internalTramitsOvtRDTO.getId(),
			        dadesExpedientBDTO.getExpedientsRDTO().getId());

			SollicitudsRDTO sollicitudsRDTO = modelMapper.map(sollicitudCrearHelper, SollicitudsRDTO.class);
			sollicitudsRDTO.setIniciacio(TipusIniciacioSollicitudApiParamValue.SOLLICITUD.getInternalValue());
			SollicitudsCrearBDTO sollicitudCrearBDTO = new SollicitudsCrearBDTO(sollicitudsRDTO);

			returnSollicitudsRDTO = serveisService.crearSollicitud(sollicitudCrearBDTO);

		} catch (GPAApiParamValidationException e) {
			log.error("crearSolicitud(SollicitudCrearRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} catch (Exception e) {
			log.error("crearSolicitud(SollicitudCrearRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_CREAR_SOLLICITUD, e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient + "/sollicituds");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Crear una sol??licitud");

			auditServeisService.registrarAuditServeisPortalSollicituds(auditServeisBDTO, sollicitudCrearRDTO, respostaResultatBDTO, ex);
		}

		RespostaSollicitudCrearBDTO respostaSollicitudCrearBDTO = new RespostaSollicitudCrearBDTO(returnSollicitudsRDTO,
		        respostaResultatBDTO, (dadesExpedientBDTO != null && dadesExpedientBDTO.getExpedientsRDTO() != null)
		                ? dadesExpedientBDTO.getExpedientsRDTO() : null);
		respostaCrearSollicitudRDTO = modelMapper.map(respostaSollicitudCrearBDTO, RespostaCrearSollicitudRDTO.class);

		if (log.isDebugEnabled()) {
			log.debug("crearSolicitud(SolicitudsCrearRDTO) - fi"); //$NON-NLS-1$
		}
		return respostaCrearSollicitudRDTO;
	}

	/**
	 * Actualitzar solicitud expedient.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @param solicitudExpedient
	 *            the solicitud expedient
	 * @return the resposta actualitzar expedient RDTO
	 * @throws GPAServeisServiceException
	 */
	@PostMapping("/sollicituds/{idSollicitud}")
	@ApiOperation(nickname = "actualitzarSollicitudPortal", value = "Actualitzar dades de la sol??licitud de la sol??licitud", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaActualitzarSollicitudRDTO actualitzarSollicitud(
	        @ApiParam(value = "Id de la sol??licitud", required = true) @PathVariable BigDecimal idSollicitud,
	        @ApiParam(value = "Dades de la actualitzaci?? de l'expedient") @RequestBody SollicitudActualitzarRDTO sollicitudActualitzar)
	        throws GPAServeisServiceException {
		if (log.isDebugEnabled()) {
			log.debug("actualitzarSolicitudExpedient(BigDecimal, ExpedientActualitzarRDTO) - inici"); //$NON-NLS-1$
		}

		String resultatAudit = "OK";
		GPAServeisServiceException ex = null;

		RespostaActualitzarSollicitudRDTO respostaActualitzarSollicitudsRDTO = null;
		SollicitudsRDTO returnSollicitudsRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_ACTUALITZAR_SOLLICITUD);
		try {
			// El Id de sol??licitud debe existir
			DadesSollicitudBDTO dadesSollicitudBDTO = serveisService.consultarDadesSollicitudPerVisibilitat(idSollicitud);
			ServeisRestControllerValidationHelper.validateActualitzarSollicitud(dadesSollicitudBDTO, sollicitudActualitzar,
			        Resultat.ERROR_ACTUALITZAR_SOLLICITUD);

			// Recuperamos los dadesExpedientBDTO para la validaci??n del estado
			BigDecimal visibilitat = BigDecimal.ONE;
			DadesExpedientBDTO dadesExpedientBDTO = serveisService.consultarDadesExpedient(dadesSollicitudBDTO.getExpedientsRDTO().getId(),
			        visibilitat);

			// Si se indica alguna persona al menos debe indicarse el
			// Solicitante
			ServeisRestControllerValidationHelper.validateSollicitantActualitzarSolicitudExpedient(sollicitudActualitzar.getSollicitant(),
			        sollicitudActualitzar.getRepresentant());

			// se valida que si la relacion es de persona interesada, solo
			// permita valores sollicitant y representant
			ServeisRestControllerValidationHelper.validatePersonesInteressadesExpedient(sollicitudActualitzar.getPersonesInteressades(),
			        Resultat.ERROR_ACTUALITZAR_SOLLICITUD);

			// Actualizar Solicitante / Representante / Dades d'Operaci?? si se
			// incluyen en los datos de la petici??n y si la acci??n es permitida
			if (sollicitudActualitzar.getSollicitant() != null || CollectionUtils.isNotEmpty(sollicitudActualitzar.getDadesOperacio())) {
				ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
				        AccioTramitadorApiParamValue.INFORMAR_DADES_EXPEDIENT, Resultat.ERROR_ACTUALITZAR_SOLLICITUD);
			}

			// 1 - validar que la persona logueada esta dentro de los
			// interesados
			// 2 - validar que si hay lista de implicados, tengan
			// relacioTerceraPersona y coincida alguna definida en el
			// procedimiento
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersonesSollicitud(clientEntity, serveisService, null, null,
			        null, null, dadesSollicitudBDTO, dadesSollicitudBDTO.getSollicitudsRDTO().getTramitOvtIdext(),
			        Resultat.ERROR_ACTUALITZAR_SOLLICITUD);

			// Se obtienen los Dades d'Operaci?? del procedimiento y se valida
			// que los c??digos indicados existen. Se aprovecha para recuperar
			// los identificadores de los campos
			ValidateDadesOperacioResultat validateDadesOperacioResultat = null;
			if (CollectionUtils.isNotEmpty(sollicitudActualitzar.getDadesOperacio())) {
				DadesOperacioCercaBDTO dadesOperacioCercaBDTO = new DadesOperacioCercaBDTO(
				        dadesExpedientBDTO.getExpedientsRDTO().getProcedimentIdext(), null);
				RespostaDadesOperacioCercaBDTO respostaDadesOperacioCercaBDTO = serveisService.cercaDadesOperacio(dadesOperacioCercaBDTO);
				validateDadesOperacioResultat = ServeisRestControllerValidationHelper.validateDadesOperacioActualitzarSolicitudExpedient(
				        sollicitudActualitzar.getDadesOperacio(), respostaDadesOperacioCercaBDTO.getDadesGrupsRDTOList(),
				        dadesExpedientBDTO.getExpedientsRDTO().getId(), dadesSollicitudBDTO.getSollicitudsRDTO().getId(), true);

			}

			// Aplicamos el campo de Relaci??n correspondiente a las personas que
			// se relacionan
			if (sollicitudActualitzar.getSollicitant() != null) {
				sollicitudActualitzar.getSollicitant().setRelacio(RelacioPersonaApiParamValue.SOLLICITANT.getApiParamValue());
			}
			if (sollicitudActualitzar.getRepresentant() != null) {
				sollicitudActualitzar.getRepresentant().setRelacio(RelacioPersonaApiParamValue.REPRESENTANT.getApiParamValue());
			}

			if (sollicitudActualitzar.getPersonesInteressades() != null) {
				for (PersonesRDTO personaSollicitud : sollicitudActualitzar.getPersonesInteressades()) {
					if (personaSollicitud.getRelacio() == null)
						personaSollicitud.setRelacio(RelacioPersonaApiParamValue.REPRESENTANT.getApiParamValue());
				}
			}

			SollicitudActualitzarHelper sollicitudActualitzarHelper = new SollicitudActualitzarHelper(sollicitudActualitzar);

			// Se construye el modelo para la llamada a la operaci??n de
			// actualizaci??n
			SollicitudsRDTO sollicitudsRDTO = modelMapper.map(sollicitudActualitzarHelper, SollicitudsRDTO.class);
			// Se indica el id de la Solicitud recibido como path variable
			sollicitudsRDTO.setId(dadesSollicitudBDTO.getSollicitudsRDTO().getId());
			// Tambi??n establecemos el id del Expediente, pues se usa para
			// guardar el hist??rico
			sollicitudsRDTO.setExpedient(dadesSollicitudBDTO.getExpedientsRDTO().getId());

			ActualitzarDadesSollicitudSollicituds actualitzarDadesSollicitudSollicituds = new ActualitzarDadesSollicitudSollicituds();
			actualitzarDadesSollicitudSollicituds.setSollicitud(sollicitudsRDTO);
			if (validateDadesOperacioResultat != null) {
				actualitzarDadesSollicitudSollicituds.setDadesEspecifiques(validateDadesOperacioResultat.getDadesEspecifiquesRDTOList());
				actualitzarDadesSollicitudSollicituds
				        .setDadesEspecifiquesRepetibles(validateDadesOperacioResultat.getDadesEspecifiquesRepetiblesRDTOList());
			}
			SollicitudsActualitzarBDTO sollicitudsActualitzarBDTO = new SollicitudsActualitzarBDTO(actualitzarDadesSollicitudSollicituds);
			returnSollicitudsRDTO = serveisService.actualitzarDadesSollicitudSollicituds(sollicitudsActualitzarBDTO);

		} catch (GPAApiParamValidationException e) {
			log.error("actualitzarSolicitudExpedient(BigDecimal, ExpedientActualitzarRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} catch (Exception e) {
			log.error("actualitzarSolicitudExpedient(BigDecimal, ExpedientActualitzarRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_ACTUALITZAR_SOLLICITUD, e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/sollicituds/" + idSollicitud);
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Actualitzar dades de la sol??licitud de la sol??licitud");

			auditServeisService.registrarAuditServeisPortalSollicituds(auditServeisBDTO, sollicitudActualitzar, respostaResultatBDTO, ex);
		}

		RespostaSollicitudsActualitzarBDTO respostaSollicitudsActualitzarBDTO = new RespostaSollicitudsActualitzarBDTO(
		        returnSollicitudsRDTO, respostaResultatBDTO);
		respostaActualitzarSollicitudsRDTO = modelMapper.map(respostaSollicitudsActualitzarBDTO, RespostaActualitzarSollicitudRDTO.class);

		if (log.isDebugEnabled()) {
			log.debug("actualitzarSolicitud(BigDecimal, SolicitudsActualitzarRDTO) - fi"); //$NON-NLS-1$
		}
		return respostaActualitzarSollicitudsRDTO;
	}

	/**
	 * Consultar dades sollicitud.
	 *
	 * @param idSollicitud
	 *            the id sollicitud
	 * @return the resposta consulta sollicituds RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping("/sollicituds/{idSollicitud}")
	@ApiOperation(nickname = "consultarDadesSollicitudPortal", value = "Consultar les dades de la sol??licitud", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaConsultaSollicitudsRDTO consultarDadesSollicitud(
	        @ApiParam(value = "Identificador de la sol??licitud", required = true) @PathVariable BigDecimal idSollicitud)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		GPAServeisServiceException ex = null;

		RespostaConsultaSollicitudsRDTO respostaConsultaSollicitudsRDTO = new RespostaConsultaSollicitudsRDTO();

		BigDecimal visibilitat = BigDecimal.ONE;

		try {

			// TODO Si la solicitud que estoy consultando es un ESBORRANY y
			// adem??s no es m??o, no puedo verlo. Se mantiene el pack Solicitante
			// / Representante como la misma entidad de cara a esta visibilidad
			// Es una regla transversal como la de expedients: No puedo ver
			// esborranys que no sean m??os.

			visibilitat = ServeisRestControllerVisibilitatHelper.obtenirVisibilitatSollicitud(clientEntity, serveisService, idSollicitud,
			        Resultat.ERROR_CONSULTAR_SOLLICITUD);

			// Datos principales de la solicitud
			DadesSollicitudBDTO dadesSollicitudBDTO = serveisService.consultarDadesSollicitud(idSollicitud, visibilitat);

			// El identificador de la solicitud debe ser v??lido
			if (dadesSollicitudBDTO.getSollicitudsRDTO() == null) {
				throw new GPAServeisServiceException(ErrorPrincipal.ERROR_SOLLICITUDS_NOT_FOUND.getDescripcio());
			}
			SollicitudConsultaRDTO sollicitudConsultaRDTO = modelMapper.map(dadesSollicitudBDTO, SollicitudConsultaRDTO.class);

			respostaConsultaSollicitudsRDTO.setSollicitud(sollicitudConsultaRDTO);
		} catch (GPAApiParamValidationException e) {
			log.error("consultarDadesExpedient(String)", e); //$NON-NLS-1$
			throw new GPAServeisServiceException(
			        e.getErrorPrincipal() != null ? e.getErrorPrincipal().getDescripcio() : e.getResultat().getDescripcio());
		} catch (GPAServeisServiceException e) {
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} catch (Exception e) {
			log.error("consultarDadesExpedient(String)", e); //$NON-NLS-1$
			throw new GPAServeisServiceException(e.getMessage());
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/sollicituds/" + idSollicitud);
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Consultar les dades de la sol??licitud");

			auditServeisService.registrarAuditServeisPortalSollicituds(auditServeisBDTO, null, respostaConsultaSollicitudsRDTO, ex);

		}

		return respostaConsultaSollicitudsRDTO;
	}

	/**
	 * Exportar dades sollicitud xml.
	 *
	 * @param idSollicitud
	 *            the id sollicitud
	 * @return the response entity
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping(value = "/sollicituds/{idSollicitud}/report/exportacio-xml", produces = MediaType.TEXT_PLAIN_VALUE)
	@ApiOperation(nickname = "exportarDadesSollicitudXmlPortal", value = "Exporta les dades de la sol??licitud en format XML", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public ResponseEntity<String> exportarDadesSollicitudXml(
	        @ApiParam(value = "Identificador de la sol??licitud", required = true) @PathVariable BigDecimal idSollicitud,
	        @ApiParam(value = "Codi CSV") @RequestParam(name = "codiCSV", required = false) String codiCSV)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		GPAServeisServiceException ex = null;

		BigDecimal visibilitat = BigDecimal.ONE;

		SollicitudConsultaRDTO sollicitudConsultaRDTO = null;
		String dadesXmlBase64 = null;

		try {
			visibilitat = ServeisRestControllerVisibilitatHelper.obtenirVisibilitatSollicitud(clientEntity, serveisService, idSollicitud,
			        Resultat.ERROR_CONSULTAR_SOLLICITUD);

			// Datos principales de la solicitud
			DadesSollicitudBDTO dadesSollicitudBDTO = serveisService.consultarDadesSollicitud(idSollicitud, visibilitat);

			// El identificador de la solicitud debe ser v??lido
			if (dadesSollicitudBDTO.getSollicitudsRDTO() == null) {
				throw new GPAServeisServiceException(ErrorPrincipal.ERROR_SOLLICITUDS_NOT_FOUND.getDescripcio());
			}

			// TODO Validaci??n de que la solicitud se encuentre registrada (El
			// XML
			// se recupera de Documentum)

			sollicitudConsultaRDTO = modelMapper.map(dadesSollicitudBDTO, SollicitudConsultaRDTO.class);
			sollicitudConsultaRDTO.setCodiCSV(codiCSV);

			// TODO Recuperar el XML de Documentum
			dadesXmlBase64 = serveisService.crearXmlDadesSollicitud(sollicitudConsultaRDTO);
		} catch (GPAApiParamValidationException e) {
			log.error("consultarDadesExpedient(String)", e); //$NON-NLS-1$
			throw new GPAServeisServiceException(
			        e.getErrorPrincipal() != null ? e.getErrorPrincipal().getDescripcio() : e.getResultat().getDescripcio());
		} catch (GPAServeisServiceException e) {
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} catch (Exception e) {
			log.error("consultarDadesExpedient(String)", e); //$NON-NLS-1$
			throw new GPAServeisServiceException(e.getMessage());
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/sollicituds/" + idSollicitud + "/report/exportacio-xml");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Exporta les dades de la sol??licitud en format XML");

			auditServeisService.registrarAuditServeisPortalSollicituds(auditServeisBDTO, codiCSV, sollicitudConsultaRDTO, ex);
		}
		return new ResponseEntity<String>(dadesXmlBase64, HttpStatus.OK);
	}

	/**
	 * Registrar solicitud.
	 *
	 * @param idSollicitud
	 *            the id sollicitud
	 * @return the resposta registrar sollicitud RDTO
	 * @throws GPAServeisServiceException
	 */
	@PostMapping("/sollicituds/{idSollicitud}/registre")
	@ApiOperation(nickname = "registrarSolicitudPortal", value = "Registrar la sol??licitud", tags = { "Serveis Portal API" }, extensions = {
	        @Extension(name = "x-imi-roles", properties = { @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaRegistrarSollicitudRDTO registrarSolicitud(
	        @ApiParam(value = "Id de sollicitud", required = true) @PathVariable BigDecimal idSollicitud,
	        @ApiParam(value = "Dades de l'registre de la sol??licitud", required = false) @RequestBody(required = false) SollicitudRegistrarRDTO sollicitudRegistrarRDTO)
	        throws GPAServeisServiceException {

		long startTime = System.nanoTime();

		if (log.isInfoEnabled()) {
			log.info("registrarSolicitud(BigDecimal) - inici"); //$NON-NLS-1$
			log.info("trazaTiempos: registrarSolicitud(BigDecimal) - inici"); //$NON-NLS-1$
			log.info(sollicitudRegistrarRDTO); // $NON-NLS-1$
		}

		String resultatAudit = "OK";
		GPAServeisServiceException ex = null;

		RespostaRegistrarSollicitudRDTO respostaRegistrarSollicitudRDTO = null;
		DadesSollicitudBDTO dadesSollicitudBDTO = null;
		RespostaCrearRegistreExpedient respostaCrearRegistreExpedient = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_REGISTRAR_SOLLICITUD);
		DocsTramitacioRDTO respostaCrearJustificant = null;
		ExpedientsRegistrarSollicitudBDTO expedientsRegistrarSollicitudBDTO = null;
		DocsEntActualizarRegistre docsEntActualizarRegistre = null;
		boolean registreDocumentacioAssociat = false;
		boolean registreSollicitudAssociat = false;
		ArrayList<BigDecimal> idDocsEntradaList = new ArrayList<BigDecimal>();
		RespostaSollicitudsRegistrarBDTO respostaSollicitudsRegistrarBDTO = null;
		boolean esCiutada;
		boolean teRegistre = true;
		String politicaJustificant = new String();
		try {
			esCiutada = ServeisRestControllerVisibilitatHelper.esUsuariCiutada(clientEntity);

			// Datos principales de la solicitud
			BigDecimal visibilitat = BigDecimal.ONE;
			dadesSollicitudBDTO = serveisService.consultarDadesSollicitud(idSollicitud, visibilitat);

			if (log.isInfoEnabled()) {
				log.info("trazaTiempos: registrarSolicitud(BigDecimal) - consultarDadesSollicitud - inici"); //$NON-NLS-1$
			}

			// El identificador de la solicitud debe ser v??lido, no debe ser de
			// tipo SOL y no debe estar ya registrada
			ServeisRestControllerValidationHelper.validateRegistreSollicitud(dadesSollicitudBDTO, Resultat.ERROR_REGISTRAR_SOLLICITUD);
			// obtenemos los datos del procediment para ver la configuracion de
			// registro
			DadesProcedimentBDTO dadesProcedimentBDTO = serveisService
			        .consultarDadesProcediment(dadesSollicitudBDTO.getExpedientsRDTO().getProcedimentIdext());

			// La documentaci??n vinculada a generar se determina por el tipo
			// de
			// solicitud
			BigDecimal tipusDocumentacioVinculadaInternalValue = (dadesSollicitudBDTO.getSollicitudsRDTO().getTramitOvtIdext()
			        .compareTo(TramitOvtApiParamValue.APO.getInternalValue()) == NumberUtils.INTEGER_ZERO)
			                ? TipusDocumentacioVinculadaApiParamValue.JUSTIFICANT_APORTACIO.getInternalValue()
			                : ((dadesSollicitudBDTO.getSollicitudsRDTO().getTramitOvtIdext()
			                        .compareTo(TramitOvtApiParamValue.REQ.getInternalValue()) == NumberUtils.INTEGER_ZERO)
			                                ? TipusDocumentacioVinculadaApiParamValue.JUSTIFICANT_ESMENA.getInternalValue()
			                                : (TipusDocumentacioVinculadaApiParamValue.JUSTIFICANT_ALLEGACIO.getInternalValue()));

			BigDecimal tipusSollicitudInternalValue = (dadesSollicitudBDTO.getSollicitudsRDTO().getTramitOvtIdext()
			        .compareTo(TramitOvtApiParamValue.APO.getInternalValue()) == NumberUtils.INTEGER_ZERO)
			                ? TramitOvtApiParamValue.APO.getInternalValue()
			                : ((dadesSollicitudBDTO.getSollicitudsRDTO().getTramitOvtIdext()
			                        .compareTo(TramitOvtApiParamValue.REQ.getInternalValue()) == NumberUtils.INTEGER_ZERO)
			                                ? TramitOvtApiParamValue.REQ.getInternalValue()
			                                : (TramitOvtApiParamValue.ALE.getInternalValue()));

			// comprobamos si el procedimiento tiene registro configurado para
			// el tipo de solicitud. si es administrativo, sabemos que el
			// registro es s??
			if (dadesProcedimentBDTO.getProcedimentsRDTO().getIdentificacions().getAdministratiu().intValue() == NumberUtils.INTEGER_ZERO
			        .intValue()) {
				// si no es administrativo, miramos la configuraci??n de registro
				DocumentsTramitacioCercaBDTO documentsTramitacioCercaBDTO = new DocumentsTramitacioCercaBDTO(
				        dadesProcedimentBDTO.getProcedimentsRDTO().getConfiguracioDocumentacio());
				RespostaDocumentsTramitacioCercaBDTO respostaDocumentsTramitacioCercaBDTO = serveisService
				        .cercaConfiguracioDocumentacioTramitacio(documentsTramitacioCercaBDTO);
				A: for (ReqOperatiusTramOvt reqOperatiusTramOvt : dadesProcedimentBDTO.getProcedimentsRDTO().getReqOperatius()
				        .getReqOperatiusTramOvtList()) {
					if (reqOperatiusTramOvt.getTramitOvtIdext().compareTo(tipusSollicitudInternalValue) == NumberUtils.INTEGER_ZERO
					        .intValue()) {
						teRegistre = reqOperatiusTramOvt.getTramitRegistre().intValue() == NumberUtils.INTEGER_ZERO.intValue() ? false
						        : true;
						if (!teRegistre) {
							B: for (ConfiguracioDocsTramitacioRDTO configuracioDocsTramitacioRDTO : respostaDocumentsTramitacioCercaBDTO
							        .getConfiguracioDocsTramitacioRDTOList()) {
								if (CollectionUtils.isNotEmpty(configuracioDocsTramitacioRDTO.getConfdocstramTramitsOvtList())
								        && CollectionUtils.isNotEmpty(configuracioDocsTramitacioRDTO.getConfDocsTramPolitiquesSigList())) {
									C: for (ConfdocstramTramitsOvt confdocstramTramitsOvt : configuracioDocsTramitacioRDTO
									        .getConfdocstramTramitsOvtList()) {
										if (confdocstramTramitsOvt.getTramitOvtIdext()
										        .compareTo(tipusSollicitudInternalValue) == NumberUtils.INTEGER_ZERO.intValue()
										        && configuracioDocsTramitacioRDTO.getDocumentacioVinculada().compareTo(
										                tipusDocumentacioVinculadaInternalValue) == NumberUtils.INTEGER_ZERO.intValue()) {
											politicaJustificant = configuracioDocsTramitacioRDTO.getConfDocsTramPolitiquesSigList().get(0)
											        .getPoliticaSignatura();
											break C;
										}
									}
									break B;
								}
							}
						}
						break A;
					}
				}
			}

			// 1 - validar que la persona logueada esta dentro de los
			// interesados
			ServeisRestControllerValidationHelper.validateUsuariLogueadoInteressades(clientEntity,
			        dadesSollicitudBDTO.getPersonesInteressades(), dadesSollicitudBDTO.getSollicitant(),
			        dadesSollicitudBDTO.getRepresentant(), Resultat.ERROR_REGISTRAR_SOLLICITUD);

			// Se construye el modelo para la llamada a la operaci??n de registro
			// TODO ??C??mo procedemos para registrar el XML de la solicitud?
			if (CollectionUtils.isNotEmpty(dadesSollicitudBDTO.getDocumentsAportats())) {
				for (DocsEntradaRDTO docsEntradaRDTO : dadesSollicitudBDTO.getDocumentsAportats()) {
					idDocsEntradaList.add(docsEntradaRDTO.getId());
				}
			}

			if (teRegistre) {

				CrearSollicitud registreCreacioSolicitud = new CrearSollicitud();
				registreCreacioSolicitud.setSollicitud(dadesSollicitudBDTO.getSollicitudsRDTO());
				registreCreacioSolicitud.setDocuments(idDocsEntradaList);
				if (!esCiutada) {
					registreCreacioSolicitud.setMatriculaInformador(clientEntity.getUsuariAutenticat());
				}
				expedientsRegistrarSollicitudBDTO = new ExpedientsRegistrarSollicitudBDTO(registreCreacioSolicitud);

				long startTimeCrearRegistreSol = System.nanoTime();

				respostaCrearRegistreExpedient = serveisService.crearRegistreSollicitud(expedientsRegistrarSollicitudBDTO,
				        tipusDocumentacioVinculadaInternalValue);
				registreSollicitudAssociat = true;

				if (log.isDebugEnabled()) {
					long tiempoTotal = System.nanoTime() - startTimeCrearRegistreSol;
					log.debug("trazaTiempos: registrarSolicitud(BigDecimal) - crearRegistreSollicitud - fi: " //$NON-NLS-1$
					        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
				}
				if (log.isInfoEnabled()) {
					long tiempoTotal = System.nanoTime() - startTimeCrearRegistreSol;
					log.info("trazaTiempos: registrarSolicitud(BigDecimal) - crearRegistreSollicitud - fi: " //$NON-NLS-1$
					        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
				}

			}

			// Asociar registre de la solicitud a la propia solicitud
			SollicitudActualitzarRegistre sollicitudActualitzarRegistre = new SollicitudActualitzarRegistre();
			if (teRegistre) {
				sollicitudActualitzarRegistre.setIdRegistre(respostaCrearRegistreExpedient.getRegistreAssentament().getId());
				sollicitudActualitzarRegistre.setDataPresentacio(respostaCrearRegistreExpedient.getRegistreAssentament().getDataRegistre());
			}
			if(sollicitudActualitzarRegistre.getDataPresentacio()==null){
				sollicitudActualitzarRegistre.setDataPresentacio(dadesSollicitudBDTO.getSollicitudsRDTO().getDataSollicitud());
			}
			sollicitudActualitzarRegistre.setIdSollicitud(dadesSollicitudBDTO.getSollicitudsRDTO().getId());
			if (sollicitudRegistrarRDTO != null) {
				sollicitudActualitzarRegistre.setSignaturaSollicitud(sollicitudRegistrarRDTO.getSignaturaSolicitud());
				if (!esCiutada) {
					sollicitudActualitzarRegistre.setMatriculaInformador(clientEntity.getUsuariAutenticat());
				}
			}

			long startTimeAssociarRegistreSol = System.nanoTime();
			if (log.isInfoEnabled()) {
				log.info("trazaTiempos: registrarSolicitud(BigDecimal) - associarRegistreSollicitud - inici"); //$NON-NLS-1$
			}

			serveisService.associarRegistreSollicitud(sollicitudActualitzarRegistre);

			if (log.isDebugEnabled()) {
				long tiempoTotal = System.nanoTime() - startTimeAssociarRegistreSol;
				log.debug("trazaTiempos: registrarSolicitud(BigDecimal) - associarRegistreSollicitud - fi: " //$NON-NLS-1$
				        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
			}
			if (log.isInfoEnabled()) {
				long tiempoTotal = System.nanoTime() - startTimeAssociarRegistreSol;
				log.info("trazaTiempos: registrarSolicitud(BigDecimal) - associarRegistreSollicitud - fi: " //$NON-NLS-1$
				        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
			}

			long startTimeGetPlantillaDocVinculada = System.nanoTime();
			if (log.isDebugEnabled()) {
				log.debug("trazaTiempos: registrarSolicitud(BigDecimal) - getPlantillaDocVinculada - inici"); //$NON-NLS-1$
			}
			if (log.isInfoEnabled()) {
				log.info("trazaTiempos: registrarSolicitud(BigDecimal) - getPlantillaDocVinculada - inici"); //$NON-NLS-1$
			}

			// Recoger plantilla del Justificante a generar
			// TODO Comprobar que getConfiguracioDocumentacioProc() no es nulo y
			// se est?? recuperando dentro de la consulta de dades sollicitud
			RespostaPlantillaDocVinculada respostaPlantillaDocVinculada = serveisService.getPlantillaDocVinculada(
			        dadesSollicitudBDTO.getExpedientsRDTO().getConfiguracioDocumentacioProc(), tipusDocumentacioVinculadaInternalValue);

			if (log.isDebugEnabled()) {
				long tiempoTotal = System.nanoTime() - startTimeGetPlantillaDocVinculada;
				log.debug("trazaTiempos: registrarSolicitud(BigDecimal) - getPlantillaDocVinculada - fi: " //$NON-NLS-1$
				        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
			}
			if (log.isInfoEnabled()) {
				long tiempoTotal = System.nanoTime() - startTimeGetPlantillaDocVinculada;
				log.info("trazaTiempos: registrarSolicitud(BigDecimal) - getPlantillaDocVinculada - fi: " //$NON-NLS-1$
				        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
			}

			// Generar Justificant
			DocsTramitacioRDTO docsTramitacioRDTO = new DocsTramitacioRDTO();
			ConfiguracioDocsTramitacio configuracioDocsTramitacio = new ConfiguracioDocsTramitacio();
			configuracioDocsTramitacio.setSuportEnllac(respostaPlantillaDocVinculada.getPlantilla());
			configuracioDocsTramitacio.setId(respostaPlantillaDocVinculada.getId());
			// setear la politica que nos devuelve el registro de ariadna
			ConfDocsTramPolitiquesSig confDocsTramPolitiquesSig = new ConfDocsTramPolitiquesSig();
			confDocsTramPolitiquesSig.setConfiguracioDocsTramitacio(configuracioDocsTramitacio.getId());
			confDocsTramPolitiquesSig.setOrdre(new BigDecimal(NumberUtils.INTEGER_ONE));
			if (respostaCrearRegistreExpedient != null) {
				politicaJustificant = respostaCrearRegistreExpedient.getPolitic();
			}
			confDocsTramPolitiquesSig.setPoliticaSignatura(politicaJustificant);
			confDocsTramPolitiquesSig.setModalitatIdext(TipusSignaturaApiParamValue.SEGELL.getInternalValue());
			configuracioDocsTramitacio.addConfDocsTramPolitiquesSigListItem(confDocsTramPolitiquesSig);

			if (sollicitudRegistrarRDTO != null && !StringUtils.isEmpty(sollicitudRegistrarRDTO.getIdioma())) {
				IdiomaPlantillaDocApiParamValueTranslator idiomaPlantillaDocApiParamValueTranslator = new IdiomaPlantillaDocApiParamValueTranslator();
				docsTramitacioRDTO.setIdioma(
				        idiomaPlantillaDocApiParamValueTranslator.getInternalValueByApiParamValue(sollicitudRegistrarRDTO.getIdioma()));
			} else {
				docsTramitacioRDTO.setIdioma(IdiomaPlantillaDocApiParamValue.CASTELLA.getInternalValue());
			}
			docsTramitacioRDTO.setConfiguracioDocsTramitacio(configuracioDocsTramitacio);
			docsTramitacioRDTO.setConfigDocTramitacio(respostaPlantillaDocVinculada.getId());
			docsTramitacioRDTO.setOrigen(2);
			docsTramitacioRDTO.setDocsTercers(1);
			docsTramitacioRDTO.setSollicitudIdext(dadesSollicitudBDTO.getSollicitudsRDTO().getId());
			TipusMime tipusMime = new TipusMime();
			tipusMime.setId(TipusMimeApiParamValue.PDF.getInternalValue());
			DocsFisics docsFisics = new DocsFisics();
			docsFisics.setTipusMime(tipusMime);
			docsFisics.setTipus(TipusMimeApiParamValue.PDF.getInternalValue());
			docsTramitacioRDTO.setDocsFisics(docsFisics);
			CrearDocumentTramitacioBDTO crearDocumentTramitacioBDTO = new CrearDocumentTramitacioBDTO(
			        dadesSollicitudBDTO.getExpedientsRDTO().getId(), dadesSollicitudBDTO.getSollicitudsRDTO().getId(), docsTramitacioRDTO);

			long startTimeGuardarJustificantPlantilla = System.nanoTime();
			respostaCrearJustificant = serveisService.guardarDocumentTramitacioJustificantPlantilla(crearDocumentTramitacioBDTO);

			if (log.isDebugEnabled()) {
				long tiempoTotal = System.nanoTime() - startTimeGuardarJustificantPlantilla;
				log.debug("trazaTiempos: registrarSolicitud(BigDecimal) - guardarDocumentTramitacioJustificantPlantilla - fi: " //$NON-NLS-1$
				        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
			}
			if (log.isInfoEnabled()) {
				long tiempoTotal = System.nanoTime() - startTimeGuardarJustificantPlantilla;
				log.info("trazaTiempos: registrarSolicitud(BigDecimal) - guardarDocumentTramitacioJustificantPlantilla - fi: " //$NON-NLS-1$
				        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
			}

			// Obtener el XML y almacenarlo en el Gestor Documental .
			// Asociar el c??digo generado a nivel de Sollicitud, puesto que ser??
			// el Objeto Documental a utilizar
			String idGestorDocumental = respostaCrearJustificant.getCodi();
			// Buscamos de nuevo la solicitud para que incluya los datos de
			// registro
			dadesSollicitudBDTO = serveisService.consultarDadesSollicitud(idSollicitud, visibilitat);
			guardarXMLSollicitud(dadesSollicitudBDTO, idGestorDocumental);

			long startTimeSignarSegellDocument = System.nanoTime();
			if (log.isInfoEnabled()) {
				log.info("trazaTiempos: registrarSolicitud(BigDecimal) - signarSegellDocument - inici"); //$NON-NLS-1$
			}

			// se llama a segell para firmar el justificante de registro del
			// expediente
			SignarSegellDocument signarSegellDocumentRDTO = new SignarSegellDocument();
			signarSegellDocumentRDTO.setIdDocument(respostaCrearJustificant.getId());
			SignarSegellDocument signarSegellDocumentResponse = serveisService.signarSegellDocument(signarSegellDocumentRDTO);

			if (log.isDebugEnabled()) {
				long tiempoTotal = System.nanoTime() - startTimeSignarSegellDocument;
				log.debug("trazaTiempos: registrarSolicitud(BigDecimal) - signarSegellDocument - fi: " //$NON-NLS-1$
				        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
			}
			if (log.isInfoEnabled()) {
				long tiempoTotal = System.nanoTime() - startTimeSignarSegellDocument;
				log.info("trazaTiempos: registrarSolicitud(BigDecimal) - signarSegellDocument - fi: " //$NON-NLS-1$
				        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
			}

			// si la firma no es valida se lanza el error
			if (signarSegellDocumentResponse != null && StringUtils.isNotEmpty(signarSegellDocumentResponse.getDescError())) {

				StringBuilder strMessageError = new StringBuilder(Constants.MISSATGE_ERROR_SIGNATURES);
				throw new GPAServeisServiceException(strMessageError.append(": ").append(signarSegellDocumentResponse.getCodiError())
				        .append(": ").append(signarSegellDocumentResponse.getDescError()).toString());
			}

			// TODO Calcular Hash de documento firmado, regenerar el PDF con el
			// hash incrustado y guardarlo bajo el mismo objeto documental
			// serveisService.guardarDocumentTramitacioJustificantPlantillaSignat

			long startTimeVincularJustificanteAriadna = System.nanoTime();
			if (log.isInfoEnabled()) {
				log.info("trazaTiempos: registrarSolicitud(BigDecimal) - vincularJustificanteAriadna - inici"); //$NON-NLS-1$
			}

			// Vincular Justificante en Ariadna
			if (teRegistre) {
				ConsultarSignaturaResponse consultarSignaturaResponse = serveisService
				        .consultarSignatura(signarSegellDocumentResponse.getIdPeticio(), respostaCrearJustificant.getMigracioIdOrigen());
				if (consultarSignaturaResponse != null && consultarSignaturaResponse.getIdDocumentSignatGestorDocumental() != null) {
					// Debe vincularse a Ariadna el Justificante firmado y no el
					// original (getMigracioIdOrigenSignatura())
					RegistreDocumentacioExpedient registreDocumentacioExpedient = new RegistreDocumentacioExpedient();
					try {

						registreDocumentacioExpedient.setIdJustificant(consultarSignaturaResponse.getIdDocumentSignatGestorDocumental());
						registreDocumentacioExpedient.setNumAss(respostaCrearRegistreExpedient.getRegistreAssentament().getCodi());

						serveisService.registreDocumentacioAriadna(registreDocumentacioExpedient);
					} catch (Exception e) {
						log.error("registrarSolicitudExpedient(BigDecimal): Error retornAssentament", e);// $NON-NLS-1$

						// almacenamos el indicador de que esta pendiente el
						// retorno en el expediente para que continue el
						// registro o la accion correctamente
						dadesSollicitudBDTO.getExpedientsRDTO().setPendentRetorn(NumberUtils.INTEGER_ONE);
						serveisService.actualitzarExpedient(dadesSollicitudBDTO.getExpedientsRDTO());
					}
				}
			}

			if (log.isDebugEnabled()) {
				long tiempoTotal = System.nanoTime() - startTimeVincularJustificanteAriadna;
				log.debug("trazaTiempos: registrarSolicitud(BigDecimal) - vincularJustificanteAriadna - fi: " //$NON-NLS-1$
				        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
			}
			if (log.isInfoEnabled()) {
				long tiempoTotal = System.nanoTime() - startTimeVincularJustificanteAriadna;
				log.info("trazaTiempos: registrarSolicitud(BigDecimal) - vincularJustificanteAriadna - fi: " //$NON-NLS-1$
				        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
			}

			// Asociar registre de la solicitud a los posibles documentos
			// vinculados a la solicitud
			if (CollectionUtils.isNotEmpty(idDocsEntradaList)) {
				docsEntActualizarRegistre = new DocsEntActualizarRegistre();
				if (teRegistre) {
					docsEntActualizarRegistre.setIdRegistre(respostaCrearRegistreExpedient.getRegistreAssentament().getId());
				}
				docsEntActualizarRegistre.setListIdsDocsEnt(idDocsEntradaList);
				serveisService.associarRegistreDocsEnt(docsEntActualizarRegistre);
				registreDocumentacioAssociat = true;
			}

			long startTimeGuardarDadesEspecifiquesSol = System.nanoTime();
			if (log.isInfoEnabled()) {
				log.info("trazaTiempos: registrarSolicitud(BigDecimal) - guardarDadesEspecifiquesSollicitud - inici"); //$NON-NLS-1$
			}

			// Duplicar los Valores de Datos Espec??ficos para que quede por un
			// lado la foto inmutable en la solicitud y los datos actualizados
			// en el expediente
			// A tener en cuenta:
			// 1- Asociado a cada Dato Espec??fico puede haber 1 o N Valores
			// asociados
			// 2- Si el expediente no tiene valores para el dato espec??fico, se
			// insertan con SOLLICITUD = null
			// 3- Si el expediente ya tiene valores para el dato espec??fico, se
			// eliminan todos y se insertan los nuevos con SOLLICITUD = null
			// 4- Si el expediente tiene valores para datos espec??ficos que no
			// se informan en la solicitud, ??se deben mantener o eliminar? De
			// momento no eliminamos (lo que viene es lo que hay s??lo a nivel de
			// solicitud)
			serveisService.guardarDadesEspecifiquesSollicitud(dadesSollicitudBDTO.getSollicitudsRDTO().getId());

			if (log.isDebugEnabled()) {
				long tiempoTotal = System.nanoTime() - startTimeGuardarDadesEspecifiquesSol;
				log.debug("trazaTiempos: registrarSolicitud(BigDecimal) - guardarDadesEspecifiquesSollicitud - fi: " //$NON-NLS-1$
				        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
			}
			if (log.isInfoEnabled()) {
				long tiempoTotal = System.nanoTime() - startTimeGuardarDadesEspecifiquesSol;
				log.info("trazaTiempos: registrarSolicitud(BigDecimal) - guardarDadesEspecifiquesSollicitud - fi: " //$NON-NLS-1$
				        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
			}

			// En caso de que la operaci??n de registro se lance desde el portal
			// del Informador,
			// el formulario de solicitud (documento de instancia) estar??
			// firmado por Segell d'Organ y habr?? que copiar el contenido de
			// dicho documento firmado en el documento original
			if (!esCiutada) {
				// Par??metros disponibles:
				// - idDocumentacio -> Obtener documento basado en plantilla
				// - signaturaSolicitud -> id de Petici??n de firma que nos da
				// acceso al robjectid documento firmado
				serveisService.guardarDocumentSollicitudSignat(dadesSollicitudBDTO.getExpedientsRDTO().getDocumentacioIdext(),
				        sollicitudRegistrarRDTO.getSignaturaSolicitud());
			}

			// Cambio de estado del expediente:
			// - APO: No hay transici??n
			// - REQ: Se pasa del 3 al 2
			// - ALE: Se pasa del 5 al 4 --> GPA-3785 No hay transici??n
			// autom??tica en este caso
			if (dadesSollicitudBDTO.getSollicitudsRDTO().getTramitOvtIdext()
			        .compareTo(TramitOvtApiParamValue.REQ.getInternalValue()) == NumberUtils.INTEGER_ZERO) {
				ExpedientCanviEstat expedientCanviEstat = modelMapper.map(dadesSollicitudBDTO.getExpedientsRDTO(),
				        ExpedientCanviEstat.class);

				// obtenemos el idAccioEstat futuro
				List<AccionsEstatsRDTO> accionsEstatsRDTOList = serveisService.cercaTransicioCanviEstat(
				        AccioTramitadorApiParamValue.RESPONDRE_REQUERIMENT_O_TRAMIT_ALLEGACIONS_O_IP.getInternalValue(),
				        dadesSollicitudBDTO.getExpedientsRDTO().getIdEstat());

				// debe existir una transicion posible para el estado actual
				ServeisRestControllerValidationHelper.validateTransicioAccioDisponibleExpedient(accionsEstatsRDTOList,
				        AccioTramitadorApiParamValue.RESPONDRE_REQUERIMENT_O_TRAMIT_ALLEGACIONS_O_IP, Resultat.ERROR_REGISTRAR_EXPEDIENT);

				expedientCanviEstat.setIdAccioEstat(accionsEstatsRDTOList.get(0).getId());

				ExpedientsCanviarEstatBDTO expedientsCanviarEstatBDTO = new ExpedientsCanviarEstatBDTO(expedientCanviEstat,
				        dadesSollicitudBDTO.getExpedientsRDTO().getId());

				long startTimeCanviarEstatExpedient = System.nanoTime();
				serveisService.canviarEstatExpedient(expedientsCanviarEstatBDTO);

				if (log.isDebugEnabled()) {
					long tiempoTotal = System.nanoTime() - startTimeCanviarEstatExpedient;
					log.debug("trazaTiempos: registrarSolicitud(BigDecimal) - canviarEstatExpedient - fi: " //$NON-NLS-1$
					        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
				}
				if (log.isInfoEnabled()) {
					long tiempoTotal = System.nanoTime() - startTimeCanviarEstatExpedient;
					log.info("trazaTiempos: registrarSolicitud(BigDecimal) - canviarEstatExpedient - fi: " //$NON-NLS-1$
					        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
				}

				// Avisos. ACCIONS_ESTATS: 8, 9, 10
				GestionarAvisosPerAccio gestionarAvisosPerAccio = new GestionarAvisosPerAccio();
				gestionarAvisosPerAccio.setIdAccioEstat(accionsEstatsRDTOList.get(0).getId());
				GestionarAvisosPerAccioBDTO gestionarAvisosPerAccioBDTO = new GestionarAvisosPerAccioBDTO(gestionarAvisosPerAccio,
				        dadesSollicitudBDTO.getExpedientsRDTO().getId());
				serveisService.gestionarAvisosPerAccio(gestionarAvisosPerAccioBDTO);
			}

		} catch (GPAApiParamValidationException e) {
			log.error("registrarSolicitud(BigDecimal)", e);// $NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} catch (Exception e) {
			log.error("registrarSolicitud(BigDecimal)", e);

			ServeisRestControllerSagaHelper.sagaRegistrarSolicitud(serveisService, dadesSollicitudBDTO, respostaCrearRegistreExpedient,
			        registreSollicitudAssociat, respostaCrearJustificant, docsEntActualizarRegistre, registreDocumentacioAssociat,
			        idDocsEntradaList);

			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_REGISTRAR_SOLLICITUD, e);
			resultatAudit = "KO";
			ex = new GPAServeisServiceException(e);
		} finally {
			respostaSollicitudsRegistrarBDTO = new RespostaSollicitudsRegistrarBDTO(respostaCrearRegistreExpedient,
			        respostaCrearJustificant, dadesSollicitudBDTO != null ? dadesSollicitudBDTO.getExpedientsRDTO() : null,
			        dadesSollicitudBDTO != null ? dadesSollicitudBDTO.getSollicitudsRDTO() : null, respostaResultatBDTO);
			respostaRegistrarSollicitudRDTO = modelMapper.map(respostaSollicitudsRegistrarBDTO, RespostaRegistrarSollicitudRDTO.class);

			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/sollicituds/" + idSollicitud + "/registre");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Registrar la sol??licitud");

			auditServeisService.registrarAuditServeisPortalSollicituds(auditServeisBDTO, sollicitudRegistrarRDTO,
			        respostaSollicitudsRegistrarBDTO, ex);
		}

		if (log.isDebugEnabled()) {
			log.debug("registrarSolicitud(BigDecimal) - fi"); //$NON-NLS-1$
			long tiempoTotal = System.nanoTime() - startTime;
			log.debug("trazaTiempos: registrarSolicitud(BigDecimal) - fi: " //$NON-NLS-1$
			        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
		}
		if (log.isInfoEnabled()) {
			log.info("registrarSolicitud(BigDecimal) - fi"); //$NON-NLS-1$
			long tiempoTotal = System.nanoTime() - startTime;
			log.info("trazaTiempos: registrarSolicitud(BigDecimal) - fi: " //$NON-NLS-1$
			        + TimeUnit.MILLISECONDS.convert(tiempoTotal, TimeUnit.NANOSECONDS));
		}

		return respostaRegistrarSollicitudRDTO;
	}

	/**
	 * Incorporar tercera persona sollicituds
	 * 
	 * @param codiExpedient
	 * @param personaImplicada
	 * @return
	 */
	@PostMapping("/sollicituds/{idSollicitud}/persones")
	@ApiOperation(nickname = "incorporarTerceraPersonaPortalSollicituds", value = "Incorporar tercera persona a la sol??licitud", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaCrearTerceraPersonaRDTO incorporarTerceraPersonaSollicitud(
	        @ApiParam(value = "Id de la sol??licitud", required = true) @PathVariable BigDecimal idSollicitud,
	        @ApiParam(value = "Dades de la actualitzaci?? de la sol??licitud", required = true) @RequestBody CrearTerceraPersonaRDTO personaImplicada) {
		if (log.isDebugEnabled()) {
			log.debug("incorporarTerceraPersonaSollicitud(BigDecimal, CrearTerceraPersonaRDTO) - inici"); //$NON-NLS-1$
		}

		RespostaCrearTerceraPersonaRDTO respostaCrearTerceraPersonaRDTO = null;
		PersonesSollicitudRDTO returnPersonesSollicitudRDTO = null;
		DadesSollicitudBDTO dadesSollicitudBDTO = null;
		TerceraPersonaSollicitudRDTO terceraPersonaSollicitudRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_INCORPORAR_TERCERA_PERSONA_SOLLICITUD);
		try {
			// Datos principales de la solicitud
			dadesSollicitudBDTO = serveisService.consultarDadesSollicitudPerVisibilitat(idSollicitud);

			ServeisRestControllerValidationHelper.validateSollicitud(dadesSollicitudBDTO,
			        Resultat.ERROR_INCORPORAR_TERCERA_PERSONA_SOLLICITUD);

			DadesProcedimentBDTO dadesProcedimentBDTO = serveisService
			        .consultarDadesBasiquesProcediment(dadesSollicitudBDTO.getExpedientsRDTO().getProcedimentIdext());

			// 1 - validamos que la relacion indicada no sea vacia y que exista
			// en el procedimiento
			// 2 - validamos que el usuario logado pertenezca al expediente
			// 3 - validamos si es tercera persona su visibilidad
			ServeisRestControllerValidationHelper.validateRelacioTerceresPersones(personaImplicada.getPersona(), dadesProcedimentBDTO,
			        Resultat.ERROR_INCORPORAR_TERCERA_PERSONA_SOLLICITUD);
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersonesSollicitud(clientEntity, serveisService, null, null,
			        null, null, dadesSollicitudBDTO, null, Resultat.ERROR_INCORPORAR_TERCERA_PERSONA_SOLLICITUD);

			// Se construye el modelo para la llamada a la operaci??n de
			// actualizaci??n
			terceraPersonaSollicitudRDTO = modelMapper.map(personaImplicada, TerceraPersonaSollicitudRDTO.class);
			terceraPersonaSollicitudRDTO.getPersonesSollicitudRDTO().setEsborrany(1);

			terceraPersonaSollicitudRDTO.getPersonesSollicitudRDTO().setSollicitud(dadesSollicitudBDTO.getSollicitudsRDTO().getId());
			returnPersonesSollicitudRDTO = serveisService
			        .incorporarTerceraPersona(terceraPersonaSollicitudRDTO.getPersonesSollicitudRDTO());

		} catch (GPAApiParamValidationException e) {
			log.error("incorporarTerceraPersonaSollicitud(BigDecimal, CrearTerceraPersonaRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
		} catch (Exception e) {
			log.error("incorporarTerceraPersonaSollicitud(BigDecimal, CrearTerceraPersonaRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler
			        .handleException(Resultat.ERROR_INCORPORAR_TERCERA_PERSONA_SOLLICITUD, e);
		}

		RespostaCrearTerceraPersonaBDTO respostaCrearTerceraPersonaBDTO = new RespostaCrearTerceraPersonaBDTO(returnPersonesSollicitudRDTO,
		        dadesSollicitudBDTO != null ? dadesSollicitudBDTO.getExpedientsRDTO() : null, respostaResultatBDTO);
		respostaCrearTerceraPersonaRDTO = modelMapper.map(respostaCrearTerceraPersonaBDTO, RespostaCrearTerceraPersonaRDTO.class);

		if (log.isDebugEnabled()) {
			log.debug("incorporarTerceraPersonaSollicitud(BigDecimal, CrearTerceraPersonaRDTO) - fi"); //$NON-NLS-1$
		}
		return respostaCrearTerceraPersonaRDTO;
	}

	/**
	 * Actualitzar tercera persona sollicitud
	 * 
	 * @param codiExpedient
	 * @param personaImplicada
	 * @return
	 */
	@PutMapping("/sollicituds/{idSollicitud}/persones")
	@ApiOperation(nickname = "actualitzarTerceraPersonaPortalSollicituds", value = "Actualitza tercera persona en la sol??licitud", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaActualitzarTerceraPersonaRDTO actualitzarTerceraPersonaSollicitud(
	        @ApiParam(value = "Id de la sol??licitud", required = true) @PathVariable BigDecimal idSollicitud,
	        @ApiParam(value = "Dades de la actualitzaci?? de la sol??licitud", required = true) @RequestBody ActualitzarTerceraPersonaRDTO personaImplicada) {
		if (log.isDebugEnabled()) {
			log.debug("actualitzarTerceraPersonaSollicitud(BigDecimal, ActualitzarTerceraPersonaRDTO) - inici"); //$NON-NLS-1$
		}

		RespostaActualitzarTerceraPersonaRDTO respostaActualitzarTerceraPersonaRDTO = null;
		PersonesSollicitudRDTO returnPersonesSollicitudRDTO = null;
		DadesSollicitudBDTO dadesSollicitudBDTO = null;
		TerceraPersonaSollicitudRDTO terceraPersonaSollicitudRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_ACTUALITZAR_TERCERA_PERSONA_SOLLICITUD);
		try {
			// Datos principales de la solicitud
			dadesSollicitudBDTO = serveisService.consultarDadesSollicitudPerVisibilitat(idSollicitud);

			ServeisRestControllerValidationHelper.validateSollicitud(dadesSollicitudBDTO,
			        Resultat.ERROR_ACTUALITZAR_TERCERA_PERSONA_SOLLICITUD);

			DadesProcedimentBDTO dadesProcedimentBDTO = serveisService
			        .consultarDadesBasiquesProcediment(dadesSollicitudBDTO.getExpedientsRDTO().getProcedimentIdext());
			// 1 - validamos que la relacion indicada no sea vacia y que exista
			// en el procedimiento
			// 2 - validamos que el usuario logado pertenezca al expediente
			// 3 - validamos si es tercera persona su visibilidad
			ServeisRestControllerValidationHelper.validateRelacioTerceresPersones(personaImplicada.getPersona(), dadesProcedimentBDTO,
			        Resultat.ERROR_ACTUALITZAR_TERCERA_PERSONA_SOLLICITUD);
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersonesSollicitud(clientEntity, serveisService, null, null,
			        null, null, dadesSollicitudBDTO, null, Resultat.ERROR_ACTUALITZAR_TERCERA_PERSONA_SOLLICITUD);

			// Se construye el modelo para la llamada a la operaci??n de
			// actualizaci??n
			terceraPersonaSollicitudRDTO = modelMapper.map(personaImplicada, TerceraPersonaSollicitudRDTO.class);
			terceraPersonaSollicitudRDTO.getPersonesSollicitudRDTO().setEsborrany(1);

			terceraPersonaSollicitudRDTO.getPersonesSollicitudRDTO().setSollicitud(dadesSollicitudBDTO.getSollicitudsRDTO().getId());
			returnPersonesSollicitudRDTO = serveisService
			        .incorporarTerceraPersona(terceraPersonaSollicitudRDTO.getPersonesSollicitudRDTO());

		} catch (GPAApiParamValidationException e) {
			log.error("actualitzarTerceraPersonaSollicitud(BigDecimal, ActualitzarTerceraPersonaRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
		} catch (Exception e) {
			log.error("actualitzarTerceraPersonaSollicitud(BigDecimal, ActualitzarTerceraPersonaRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler
			        .handleException(Resultat.ERROR_ACTUALITZAR_TERCERA_PERSONA_SOLLICITUD, e);
		}

		RespostaActualitzarTerceraPersonaBDTO respostaActualitzarTerceraPersonaBDTO = new RespostaActualitzarTerceraPersonaBDTO(
		        returnPersonesSollicitudRDTO, dadesSollicitudBDTO != null ? dadesSollicitudBDTO.getExpedientsRDTO() : null,
		        respostaResultatBDTO);
		respostaActualitzarTerceraPersonaRDTO = modelMapper.map(respostaActualitzarTerceraPersonaBDTO,
		        RespostaActualitzarTerceraPersonaRDTO.class);

		if (log.isDebugEnabled()) {
			log.debug("actualitzarTerceraPersonaSollicitud(BigDecimal, ActualitzarTerceraPersonaRDTO) - fi"); //$NON-NLS-1$
		}
		return respostaActualitzarTerceraPersonaRDTO;
	}

	@DeleteMapping("/sollicituds/{idSollicitud}/persones/{idPersona}")
	@ApiOperation(nickname = "esborrarTerceraPersonaPortalSollicituds", value = "Esborrar una persona implicada en la sol??licitud", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaEsborrarTerceraPersonaRDTO esborrarTerceraPersonaSollicitud(
	        @ApiParam(value = "Id de la sol??licitud", required = true) @PathVariable BigDecimal idSollicitud,
	        @ApiParam(value = "Identificador de la persona", required = true) @PathVariable BigDecimal idPersona) {
		if (log.isDebugEnabled()) {
			log.debug("esborrarTerceraPersona(String, BigDecimal) - inici"); //$NON-NLS-1$
		}
		RespostaEsborrarTerceraPersonaRDTO respostaEsborrarTerceraPersonaRDTO = null;
		PersonesSollicitudRDTO personesSollicitudRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_ESBORRAR_TERCERA_PERSONA_SOLLICITUD);
		DadesSollicitudBDTO dadesSollicitudBDTO = null;

		try {
			// Datos principales de la solicitud
			dadesSollicitudBDTO = serveisService.consultarDadesSollicitudPerVisibilitat(idSollicitud);

			ServeisRestControllerValidationHelper.validateSollicitud(dadesSollicitudBDTO,
			        Resultat.ERROR_ESBORRAR_TERCERA_PERSONA_SOLLICITUD);

			// 1 - validar que la persona logueada esta dentro de los
			// interesados
			ServeisRestControllerValidationHelper.validateUsuariLogueadoInteressades(clientEntity,
			        dadesSollicitudBDTO.getPersonesInteressades(), dadesSollicitudBDTO.getSollicitant(),
			        dadesSollicitudBDTO.getRepresentant(), Resultat.ERROR_ESBORRAR_TERCERA_PERSONA_SOLLICITUD);

			personesSollicitudRDTO = serveisService.consultarDadesPersonaSollicitud(idPersona);

			ServeisRestControllerValidationHelper.validatePersonesSollicitudIsNotNull(personesSollicitudRDTO, idPersona.toString(),
			        Resultat.ERROR_ESBORRAR_TERCERA_PERSONA);

			// El id de la tercera persona debe existir y corresponderse con una
			// persona implicada en el expediente
			ServeisRestControllerValidationHelper.validatePersonaImplicada(dadesSollicitudBDTO.getPersonesImplicades(),
			        personesSollicitudRDTO.getPersones().getDocumentsIdentitat().getNumeroDocument(),
			        Resultat.ERROR_ESBORRAR_TERCERA_PERSONA_SOLLICITUD);

			// Validar si es sol??licitant principal, no se podra esborrar
			ServeisRestControllerValidationHelper.validatePersonaSollicitantprincipal(personesSollicitudRDTO,
			        Resultat.ERROR_ESBORRAR_TERCERA_PERSONA);

			serveisService.esborrarPersonaSollicitud(idPersona);

		} catch (GPAApiParamValidationException e) {
			log.error("esborrarTerceraPersona(String, BigDecimal)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
		} catch (Exception e) {
			log.error("esborrarTerceraPersona(String, BigDecimal)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_ESBORRAR_TERCERA_PERSONA, e);
		}

		ExpedientsRDTO expedientsRDTO = (dadesSollicitudBDTO != null) ? dadesSollicitudBDTO.getExpedientsRDTO() : null;
		RespostaEsborrarTerceraPersonaBDTO respostaEsborrarTerceraPersonaBDTO = new RespostaEsborrarTerceraPersonaBDTO(expedientsRDTO,
		        personesSollicitudRDTO, respostaResultatBDTO);
		respostaEsborrarTerceraPersonaRDTO = modelMapper.map(respostaEsborrarTerceraPersonaBDTO, RespostaEsborrarTerceraPersonaRDTO.class);

		if (log.isDebugEnabled()) {
			log.debug("esborrarTerceraPersona(String, BigDecimal) - fi"); //$NON-NLS-1$
		}
		return respostaEsborrarTerceraPersonaRDTO;
	}

	/**
	 * Guardar XML sollicitud.
	 *
	 * @param dadesSollicitudBDTO
	 *            the dades sollicitud BDTO
	 * @param idGestorDocumental
	 *            the id gestor documental
	 * @return the string
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	private String guardarXMLSollicitud(DadesSollicitudBDTO dadesSollicitudBDTO, String idGestorDocumental) throws GPAServeisServiceException {
		SollicitudConsultaRDTO sollicitudConsultaRDTO = modelMapper.map(dadesSollicitudBDTO, SollicitudConsultaRDTO.class);
		String xmlDadesSollicitudBase64 = serveisService.crearXmlDadesSollicitud(sollicitudConsultaRDTO);
		String xmlSolicitud = new String(Base64Utils.decodeFromString(xmlDadesSollicitudBase64), StandardCharsets.UTF_8);
		// Guardamos XML en pos 1 de documentum asociado al pdf (pdf: pos 0,
		// xml: pos 1)
		serveisService.guardarXmlSollicitud(idGestorDocumental, xmlSolicitud);
		return xmlSolicitud;
	}

}