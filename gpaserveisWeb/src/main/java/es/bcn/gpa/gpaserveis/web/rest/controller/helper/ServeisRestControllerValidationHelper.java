package es.bcn.gpa.gpaserveis.web.rest.controller.helper;

import static org.apache.commons.lang.math.NumberUtils.INTEGER_ONE;
import static org.apache.commons.lang.math.NumberUtils.INTEGER_ZERO;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.multipart.MultipartFile;

import es.bcn.gpa.gpaserveis.business.dto.expedients.DadesExpedientBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.DadesSollicitudBDTO;
import es.bcn.gpa.gpaserveis.business.dto.procediments.DadesProcedimentBDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfiguracioDocsEntradaRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfiguracioDocsTramitacioRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsEntradaRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsTramitacioRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.DadesEspecifiquesRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.DadesEspecifiquesValors;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ExpedientsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PersonesSollicitudRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RegistreAssentamentRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.DadesGrupsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.DadesOperValidVal;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.DadesOperacions;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.DadesOperacionsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.DadesOperacionsValidacio;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ProcedimentsUgos;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.AccionsEstatsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaunitats.UnitatsGestoresRDTO;
import es.bcn.gpa.gpaserveis.web.exception.GPAApiParamValidationException;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.Constants;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.ErrorPrincipal;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.Resultat;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.common.BooleanApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.expedient.AccioTramitadorApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.expedient.TipusRelacioApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.procediment.EstatApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.procediment.TipusCampApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.procediment.TipusValidacioApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.procediment.TramitOvtApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.TipusRelacioApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.TipusCampApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.TipusValidacioApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.DocumentsIdentitatRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.PersonesRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.aportar.DocumentAportatCrearRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.digitalitzar.DocumentDigitalitzarCrearRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.substituir.DocumentAportatSubstituirRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.actualitzar.AtributsActualitzarRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.esmena.AtributRequeritRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.esmena.DocumentRequeritCrearRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.completar.DocumentCompletatRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.digitalitzar.DocumentDigitalitzatRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.incorporar.DocumentIncorporatNouRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.intraoperabilitat.DocumentIntraoperabilitatRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.preparar.requeriment.ConfiguracioDocumentacioRequeridaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.preparar.requeriment.DadaOperacioRequeritRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.preparar.requeriment.RequerimentPreparatRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.presentar.declaracio.responsable.DeclaracioResponsablePresentadaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.expedients.tramitar.convidar.ExpedientConvidarTramitarRDTO;

/**
 * The Class ServeisRestControllerValidationHelper.
 */
public class ServeisRestControllerValidationHelper {

	/**
	 * Validate procediment crear solicitud expedient.
	 *
	 * @param dadesProcedimentBDTO
	 *            the dades procediment BDTO
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateProcedimentCrearSolicitudExpedient(DadesProcedimentBDTO dadesProcedimentBDTO)
	        throws GPAApiParamValidationException {
		if (dadesProcedimentBDTO.getProcedimentsRDTO() == null) {
			throw new GPAApiParamValidationException(Resultat.ERROR_CREAR_EXPEDIENT, ErrorPrincipal.ERROR_PROCEDIMENTS_NOT_FOUND);
		}

		if (dadesProcedimentBDTO.getProcedimentsRDTO().getEstatsProcediment().getEstat()
		        .compareTo(EstatApiParamValue.PUBLICAT.getInternalValue()) != INTEGER_ZERO) {
			throw new GPAApiParamValidationException(Resultat.ERROR_CREAR_EXPEDIENT, ErrorPrincipal.ERROR_PROCEDIMENTS_NOT_PUBLICAT);
		}
	}

	/**
	 * Validate unitat gestora.
	 *
	 * @param unitatsGestoresRDTO
	 *            the unitats gestores RDTO
	 * @param dadesProcedimentBDTO
	 *            the dades procediment BDTO
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateUnitatGestora(UnitatsGestoresRDTO unitatsGestoresRDTO, DadesProcedimentBDTO dadesProcedimentBDTO,
	        Resultat resultatError) throws GPAApiParamValidationException {
		// La Unitat Gestora debe existir, estar vigente y estar asociada al
		// procedimiento
		if (unitatsGestoresRDTO == null) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_UNITATS_NOT_FOUND);
		}

		if (unitatsGestoresRDTO.getVigent() == INTEGER_ZERO) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_UNITATS_NOT_VIGENT);
		}

		boolean unitatAssociadaProcediment = false;
		unitatAssociadaProcediment = unitatsGestoresRDTO.getId()
		        .compareTo(dadesProcedimentBDTO.getProcedimentsRDTO().getUgrIdext()) == INTEGER_ZERO;
		if (!unitatAssociadaProcediment && CollectionUtils.isNotEmpty(dadesProcedimentBDTO.getProcedimentsRDTO().getUgosList())) {
			for (ProcedimentsUgos ugo : dadesProcedimentBDTO.getProcedimentsRDTO().getUgosList()) {
				if (unitatsGestoresRDTO.getId().compareTo(ugo.getUgoIdext()) == INTEGER_ZERO) {
					unitatAssociadaProcediment = true;
					break;
				}
			}
		}
		if (!unitatAssociadaProcediment) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_UNITATS_NOT_IN_PROCEDIMENT);
		}
	}

	/**
	 * Validate unitat gestora convidada.
	 *
	 * @param idUnitatGestoraConvidada
	 *            the id unitat gestora convidada
	 * @param idUnitatGestoraExpedient
	 *            the id unitat gestora expedient
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateUnitatGestoraConvidada(BigDecimal idUnitatGestoraConvidada, BigDecimal idUnitatGestoraExpedient,
	        Resultat resultatError) throws GPAApiParamValidationException {
		// La Unitat Gestora a convidar debe ser diferente a la que tiene
		// asignada el expediente
		if (idUnitatGestoraConvidada.compareTo(idUnitatGestoraExpedient) == NumberUtils.INTEGER_ZERO) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_UNITATS_ASSIGNADA);
		}
	}

	/**
	 * Validate no exist unitat gestora convidada.
	 *
	 * @param idUnitatGestoraConvidada
	 *            the id unitat gestora convidada
	 * @param idUnitatGestoraExpedient
	 *            the id unitat gestora expedient
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateNoExistUnitatGestoraConvidada(ExpedientConvidarTramitarRDTO expedientConvidarTramitarRDTO,
			DadesExpedientBDTO dadesExpedientBDTO, Resultat resultatError) throws GPAApiParamValidationException {
		// TODO GPA-2901
		// for (EstatsUgConvidada estatsUgConvidada :
		// dadesExpedientBDTO.getExpedientsRDTO().getUgConvidadaIdextList()) {
		// if (expedientConvidarTramitarRDTO.getCodiUnitatGestoraList()
		// .contains(String.valueOf(estatsUgConvidada.getUgConvidadaIdext()))) {
		// throw new GPAApiParamValidationException(resultatError,
		// ErrorPrincipal.ERROR_UNITATS_CONVIDADA_ASSIGNADA);
		// }
		//
		// }

	}

	/**
	 * Validate expedient.
	 *
	 * @param dadesExpedientBDTO
	 *            the dades expedient BDTO
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateExpedient(DadesExpedientBDTO dadesExpedientBDTO, Resultat resultatError)
	        throws GPAApiParamValidationException {
		if (dadesExpedientBDTO.getExpedientsRDTO() == null) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_EXPEDIENTS_NOT_FOUND);
		}
	}

	/**
	 * Validate sollicitud.
	 *
	 * @param dadesSollicitudBDTO
	 *            the dades sollicitud BDTO
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateSollicitud(DadesSollicitudBDTO dadesSollicitudBDTO, Resultat resultatError)
	        throws GPAApiParamValidationException {
		if (dadesSollicitudBDTO.getSollicitudsRDTO() == null) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_SOLLICITUDS_NOT_FOUND);
		}

		if (dadesSollicitudBDTO.getSollicitudsRDTO().getRegistre() != null) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_SOLLICITUDS_REGISTRADA);
		}

		validateTipusSollicitud(dadesSollicitudBDTO, resultatError);
	}

	/**
	 * Validate tipus sollicitud.
	 *
	 * @param dadesSollicitudBDTO
	 *            the dades sollicitud BDTO
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateTipusSollicitud(DadesSollicitudBDTO dadesSollicitudBDTO, Resultat resultatError)
	        throws GPAApiParamValidationException {
		if (dadesSollicitudBDTO.getSollicitudsRDTO().getTramitOvtIdext() == TramitOvtApiParamValue.SOL.getInternalValue()) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_SOLLICITUDS_TIPUS_NOT_VALID);
		}
	}

	/**
	 * Validate expedient acumulador.
	 *
	 * @param dadesExpedientBDTO
	 *            the dades expedient BDTO
	 * @param expedientsRDTORelacionatsAcumuladorList
	 *            the expedients RDTO relacionats acumulador list
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateExpedientAcumulador(DadesExpedientBDTO dadesExpedientBDTO,
	        List<ExpedientsRDTO> expedientsRDTORelacionatsAcumuladorList, Resultat resultatError) throws GPAApiParamValidationException {
		if (dadesExpedientBDTO.getExpedientsRDTO() == null) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_EXPEDIENTS_ACUMULADOR_NOT_FOUND);
		}

		TipusRelacioApiParamValueTranslator tipusRelacioApiParamValueTranslator = new TipusRelacioApiParamValueTranslator();
		TipusRelacioApiParamValue tipusRelacioApiParamValue = null;
		if (CollectionUtils.isNotEmpty(expedientsRDTORelacionatsAcumuladorList)) {
			for (ExpedientsRDTO expedientsRDTO : expedientsRDTORelacionatsAcumuladorList) {
				tipusRelacioApiParamValue = tipusRelacioApiParamValueTranslator
				        .getEnumByInternalValue(expedientsRDTO.getRelacioTipusRelacio());
				switch (tipusRelacioApiParamValue) {
				case OBJECTE_D_ACUMULACIO:
					throw new GPAApiParamValidationException(resultatError,
					        ErrorPrincipal.ERROR_EXPEDIENTS_ACUMULADOR_NOT_VALID_JA_ACUMULAT);
				default:
					break;
				}
			}
		}
	}

	/**
	 * Validate expedient acumular.
	 *
	 * @param dadesExpedientBDTOAcumulador
	 *            the dades expedient BDTO acumulador
	 * @param dadesExpedientBDTOAcumular
	 *            the dades expedient BDTO acumular
	 * @param expedientsRDTORelacionatsAcumularList
	 *            the expedients RDTO relacionats acumular list
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateExpedientAcumular(DadesExpedientBDTO dadesExpedientBDTOAcumulador,
	        DadesExpedientBDTO dadesExpedientBDTOAcumular, List<ExpedientsRDTO> expedientsRDTORelacionatsAcumularList,
	        Resultat resultatError) throws GPAApiParamValidationException {
		if (dadesExpedientBDTOAcumular.getExpedientsRDTO() == null) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_EXPEDIENTS_ACUMULAT_NOT_FOUND);
		}

		if (dadesExpedientBDTOAcumulador.getExpedientsRDTO().getId()
		        .compareTo(dadesExpedientBDTOAcumular.getExpedientsRDTO().getId()) == NumberUtils.INTEGER_ZERO) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_EXPEDIENTS_ACUMULAT_NOT_VALID_MATEIX_EXPEDIENT);
		}

		if (dadesExpedientBDTOAcumulador.getExpedientsRDTO().getProcedimentIdext()
		        .compareTo(dadesExpedientBDTOAcumular.getExpedientsRDTO().getProcedimentIdext()) != NumberUtils.INTEGER_ZERO) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_EXPEDIENTS_ACUMULAT_NOT_VALID_MATEIX_PROCEDIMENT);
		}

		TipusRelacioApiParamValueTranslator tipusRelacioApiParamValueTranslator = new TipusRelacioApiParamValueTranslator();
		TipusRelacioApiParamValue tipusRelacioApiParamValue = null;
		if (CollectionUtils.isNotEmpty(expedientsRDTORelacionatsAcumularList)) {
			for (ExpedientsRDTO expedientsRDTO : expedientsRDTORelacionatsAcumularList) {
				tipusRelacioApiParamValue = tipusRelacioApiParamValueTranslator
				        .getEnumByInternalValue(expedientsRDTO.getRelacioTipusRelacio());
				switch (tipusRelacioApiParamValue) {
				case ACUMULAT:
					throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_EXPEDIENTS_ACUMULAT_NOT_VALID_JA_ACUMULAT);
				default:
					break;
				}
			}
		}
	}

	/**
	 * Validate accio disponible expedient.
	 *
	 * @param dadesExpedientBDTO
	 *            the dades expedient BDTO
	 * @param accioTramitadorApiParamValue
	 *            the accio tramitador api param value
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateAccioDisponibleExpedient(DadesExpedientBDTO dadesExpedientBDTO,
	        AccioTramitadorApiParamValue accioTramitadorApiParamValue, Resultat resultatError) throws GPAApiParamValidationException {
		for (AccionsEstatsRDTO accionsEstatsRDTO : dadesExpedientBDTO.getAccionsDisponibles()) {
			if (accionsEstatsRDTO.getAccio().compareTo(accioTramitadorApiParamValue.getInternalValue()) == INTEGER_ZERO) {
				return;
			}
		}
		throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_EXPEDIENTS_ACCIO_NOT_AVAILABLE,
		        accioTramitadorApiParamValue.getApiParamValue());
	}

	/**
	 * Validate accio tornar enrere disponible expedient.
	 *
	 * @param idEstat
	 *            the id estat
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateAccioTornarEnrereDisponibleExpedient(BigDecimal idEstat, Resultat resultatError)
	        throws GPAApiParamValidationException {
		if ((idEstat == null) || (Constants.ESTAT_EXPEDIENT_EN_PREPARACIO.compareTo(idEstat) == INTEGER_ZERO)
		        || (Constants.ESTAT_EXPEDIENT_SOLLICITUD_EN_REVISIO.compareTo(idEstat) == INTEGER_ZERO)) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_EXPEDIENTS_ACCIO_NOT_AVAILABLE);
		}
	}

	/**
	 * Validate sollicitant actualitzar solicitud expedient.
	 *
	 * @param sollicitant
	 *            the sollicitant
	 * @param representant
	 *            the representant
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateSollicitantActualitzarSolicitudExpedient(PersonesRDTO sollicitant, PersonesRDTO representant)
	        throws GPAApiParamValidationException {
		if (representant != null && sollicitant == null) {
			throw new GPAApiParamValidationException(Resultat.ERROR_ACTUALITZAR_EXPEDIENT,
			        ErrorPrincipal.ERROR_EXPEDIENTS_SOLLICITANT_REQUIRED);
		}
	}

	/**
	 * Validate dades operacio actualitzar solicitud expedient.
	 *
	 * @param dadesOperacio
	 *            the dades operacio
	 * @param dadesGrupsRDTOList
	 *            the dades grups RDTO list
	 * @param idExpedient
	 *            the id expedient
	 * @param isPortal
	 *            the is portal
	 * @return the array list
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static ArrayList<DadesEspecifiquesRDTO> validateDadesOperacioActualitzarSolicitudExpedient(
	        List<AtributsActualitzarRDTO> dadesOperacio, List<DadesGrupsRDTO> dadesGrupsRDTOList, BigDecimal idExpedient, boolean isPortal)
	        throws GPAApiParamValidationException {
		ArrayList<DadesEspecifiquesRDTO> dadesEspecifiquesRDTOList = null;
		HashMap<String, List<String>> atributsMap = new HashMap<String, List<String>>();
		if (CollectionUtils.isNotEmpty(dadesOperacio)) {
			for (AtributsActualitzarRDTO atributsActualitzarRDTO : dadesOperacio) {
				atributsMap.put(atributsActualitzarRDTO.getCodi(), atributsActualitzarRDTO.getValor());
			}
			dadesEspecifiquesRDTOList = validateDadesOperacio(atributsMap, dadesGrupsRDTOList, idExpedient, isPortal);
		}
		return dadesEspecifiquesRDTOList;
	}

	/**
	 * Validate dades operacio preparar requeriment expedient.
	 *
	 * @param dadesOperacioRequerits
	 *            the dades operacio requerits
	 * @param dadesOperacionsRDTOList
	 *            the dades operacions RDTO list
	 * @return the array list
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static ArrayList<BigDecimal> validateDadesOperacioPrepararRequerimentExpedient(
	        List<DadaOperacioRequeritRDTO> dadesOperacioRequerits, List<DadesOperacionsRDTO> dadesOperacionsRDTOList)
	        throws GPAApiParamValidationException {
		ArrayList<BigDecimal> idDadesOperacionsList = null;
		if (CollectionUtils.isNotEmpty(dadesOperacioRequerits)) {
			idDadesOperacionsList = new ArrayList<BigDecimal>();
			HashMap<String, DadesOperacionsRDTO> dadesOperacionsMap = new HashMap<String, DadesOperacionsRDTO>();
			if (CollectionUtils.isNotEmpty(dadesOperacionsRDTOList)) {
				for (DadesOperacionsRDTO dadesOperacionsRDTO : dadesOperacionsRDTOList) {
					dadesOperacionsMap.put(dadesOperacionsRDTO.getCodi(), dadesOperacionsRDTO);
				}
			}
			for (DadaOperacioRequeritRDTO dadaOperacioRequeritRDTO : dadesOperacioRequerits) {
				if (!dadesOperacionsMap.containsKey(dadaOperacioRequeritRDTO.getCodi())) {
					throw new GPAApiParamValidationException(Resultat.ERROR_PREPARAR_REQUERIMENT_EXPEDIENT,
					        ErrorPrincipal.ERROR_EXPEDIENTS_DADA_OPERACIO_REQUERIMENT_NOT_AVAILABLE, dadaOperacioRequeritRDTO.getCodi());
				}
				idDadesOperacionsList.add(dadesOperacionsMap.get(dadaOperacioRequeritRDTO.getCodi()).getId());
			}
		}
		return idDadesOperacionsList;
	}

	/**
	 * Validate dades operacio esmenar expedient.
	 *
	 * @param dadesOperacio
	 *            the dades operacio
	 * @param dadesGrupsRDTOList
	 *            the dades grups RDTO list
	 * @param idExpedient
	 *            the id expedient
	 * @return the array list
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static ArrayList<DadesEspecifiquesRDTO> validateDadesOperacioEsmenarExpedient(List<AtributRequeritRDTO> dadesOperacio,
	        List<DadesGrupsRDTO> dadesGrupsRDTOList, BigDecimal idExpedient) throws GPAApiParamValidationException {
		ArrayList<DadesEspecifiquesRDTO> dadesEspecifiquesRDTOList = null;
		HashMap<String, List<String>> atributsMap = new HashMap<String, List<String>>();
		if (CollectionUtils.isNotEmpty(dadesOperacio)) {
			for (AtributRequeritRDTO atributRequeritRDTO : dadesOperacio) {
				atributsMap.put(atributRequeritRDTO.getCodi(), atributRequeritRDTO.getValor());
			}
			dadesEspecifiquesRDTOList = validateDadesOperacio(atributsMap, dadesGrupsRDTOList, idExpedient, true);
		}
		return dadesEspecifiquesRDTOList;
	}

	/**
	 * Validate dades operacio.
	 *
	 * @param atributsMap
	 *            the atributs map
	 * @param dadesGrupsRDTOList
	 *            the dades grups RDTO list
	 * @param idExpedient
	 *            the id expedient
	 * @param isPortal
	 *            the is portal
	 * @return the array list
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	private static ArrayList<DadesEspecifiquesRDTO> validateDadesOperacio(Map<String, List<String>> atributsMap,
	        List<DadesGrupsRDTO> dadesGrupsRDTOList, BigDecimal idExpedient, boolean isPortal) throws GPAApiParamValidationException {
		ArrayList<DadesEspecifiquesRDTO> dadesEspecifiquesRDTOList = null;

		HashMap<String, DadesOperacions> dadesOperacionsMap = new HashMap<String, DadesOperacions>();
		if (CollectionUtils.isNotEmpty(dadesGrupsRDTOList)) {
			for (DadesGrupsRDTO dadesGrupsRDTO : dadesGrupsRDTOList) {
				if (CollectionUtils.isNotEmpty(dadesGrupsRDTO.getDadesOperacionsList())) {
					for (DadesOperacions dadesOperacions : dadesGrupsRDTO.getDadesOperacionsList()) {
						dadesOperacionsMap.put(dadesOperacions.getCodi(), dadesOperacions);
					}
				}
			}
		}
		dadesEspecifiquesRDTOList = new ArrayList<DadesEspecifiquesRDTO>();
		DadesEspecifiquesRDTO dadesEspecifiquesRDTO = null;
		DadesOperacions dadesOperacions = null;
		ArrayList<DadesEspecifiquesValors> dadesEspecifiquesValorsList = null;
		DadesEspecifiquesValors dadesEspecifiquesValors = null;
		DateTimeFormatter dataFormatter = DateTimeFormat.forPattern(Constants.DATE_PATTERN);
		DateTimeFormatter dataHoraFormatter = DateTimeFormat.forPattern(Constants.DATE_TIME_PATTERN);
		DateTimeFormatter horaFormatter = DateTimeFormat.forPattern(Constants.TIME_PATTERN);
		NumberFormat numberFormat = NumberFormat.getInstance(LocaleContextHolder.getLocale());
		TipusCampApiParamValueTranslator tipusCampApiParamValueTranslator = new TipusCampApiParamValueTranslator();
		TipusCampApiParamValue tipusCampApiParamValue = null;
		for (Entry<String, List<String>> atributEntry : atributsMap.entrySet()) {
			if (!dadesOperacionsMap.containsKey(atributEntry.getKey())) {
				throw new GPAApiParamValidationException(Resultat.ERROR_ACTUALITZAR_EXPEDIENT,
				        ErrorPrincipal.ERROR_EXPEDIENTS_ATRIBUT_NOT_FOUND, atributEntry.getKey());
			}
			dadesOperacions = dadesOperacionsMap.get(atributEntry.getKey());
			dadesEspecifiquesRDTO = new DadesEspecifiquesRDTO();
			dadesEspecifiquesRDTO.setCampIdext(dadesOperacions.getId());
			dadesEspecifiquesRDTO.setExpedient(idExpedient);
			if (isPortal == true)
				dadesEspecifiquesRDTO.setNou(INTEGER_ONE);
			else
				dadesEspecifiquesRDTO.setNou(INTEGER_ZERO);
			dadesEspecifiquesValorsList = new ArrayList<DadesEspecifiquesValors>();
			dadesEspecifiquesValors = new DadesEspecifiquesValors();
			tipusCampApiParamValue = tipusCampApiParamValueTranslator.getEnumByInternalValue(dadesOperacions.getTipus());
			try {
				switch (tipusCampApiParamValue) {
				case NUMERIC:
					if (atributEntry.getValue().get(0) != null) {
						Long valorInteger = Long.valueOf(atributEntry.getValue().get(INTEGER_ZERO));
						validateDadesOperacioNumericGeneral(dadesOperacions, BigDecimal.valueOf(valorInteger));
						dadesEspecifiquesValors.setValorInteger(valorInteger);
					}
					break;
				case DECIMAL:
					if (atributEntry.getValue().get(0) != null) {
						Double valorDouble = Double.valueOf(atributEntry.getValue().get(INTEGER_ZERO));
						validateDadesOperacioNumericGeneral(dadesOperacions, BigDecimal.valueOf(valorDouble));
						dadesEspecifiquesValors.setValorDouble(valorDouble);
					}
					break;
				case MONEDA:
					if (atributEntry.getValue().get(0) != null) {
						Double valorMoneda = Double.valueOf(atributEntry.getValue().get(INTEGER_ZERO));
						validateDadesOperacioNumericGeneral(dadesOperacions, BigDecimal.valueOf(valorMoneda));
						dadesEspecifiquesValors.setValorMoneda(valorMoneda);
					}
					break;
				case DATA:
					if (atributEntry.getValue().get(0) != null) {
						DateTime valorData = DateTime.parse(atributEntry.getValue().get(INTEGER_ZERO), dataFormatter);
						validateDadesOperacioDataGeneral(dadesOperacions, valorData, tipusCampApiParamValue);
						dadesEspecifiquesValors.setValorCalendar(valorData);
					}
					break;
				case DATA_HORA:
					if (atributEntry.getValue().get(0) != null) {
						DateTime valorDataHora = DateTime.parse(atributEntry.getValue().get(INTEGER_ZERO), dataHoraFormatter);
						validateDadesOperacioDataGeneral(dadesOperacions, valorDataHora, tipusCampApiParamValue);
						dadesEspecifiquesValors.setValorCalendar(valorDataHora);
					}
					break;
				case HORA:
					if (atributEntry.getValue().get(0) != null) {
						DateTime valorHora = DateTime.parse(atributEntry.getValue().get(INTEGER_ZERO), horaFormatter);
						validateDadesOperacioDataGeneral(dadesOperacions, valorHora, tipusCampApiParamValue);
						dadesEspecifiquesValors.setValorCalendar(valorHora);
					}
					break;
				case TEXT:
					if (atributEntry.getValue().get(0) != null) {
						String valorText = atributEntry.getValue().get(INTEGER_ZERO);
						validateDadesOperacioCadenaGeneral(dadesOperacions, valorText);
						dadesEspecifiquesValors.setValorString(valorText);
					}
					break;
				case TEXT_GRAN:
					if (atributEntry.getValue().get(0) != null) {
						String valorTextGran = atributEntry.getValue().get(INTEGER_ZERO);
						validateDadesOperacioCadenaGeneral(dadesOperacions, valorTextGran);
						dadesEspecifiquesValors.setValorClob(valorTextGran);
					}
					break;
				case LITERAL:
					break;
				case LLISTA_SIMPLE:
					if (atributEntry.getValue().get(0) != null) {
						Integer valorLlistaSimple = Integer.valueOf(atributEntry.getValue().get(INTEGER_ZERO));
						validateDadesOperacioNumericGeneral(dadesOperacions, BigDecimal.valueOf(valorLlistaSimple));
						dadesEspecifiquesValors.setValorListaSimple(valorLlistaSimple);
					}
					break;
				case LLISTA_MULTIPLE:
					if (atributEntry.getValue().get(0) != null) {
						ArrayList<Integer> integerList = new ArrayList<Integer>();
						if (CollectionUtils.isNotEmpty(atributEntry.getValue())) {
							for (String valor : atributEntry.getValue()) {
								integerList.add(Integer.valueOf(valor));
							}
						}
						dadesEspecifiquesValors.setValorListaMultipleList(integerList);
					}
					break;
				case MARCADOR:
					dadesEspecifiquesValors.setValorBoolean(Integer.valueOf(atributEntry.getValue().get(INTEGER_ZERO)));
					break;
				case PAIS:
					if (atributEntry.getValue().get(0) != null) {
						String valorPaisNom = atributEntry.getValue().get(INTEGER_ZERO).substring(4);
						String valorPaisCodiIne = atributEntry.getValue().get(INTEGER_ZERO).substring(0, 3);
						validateDadesOperacioCadenaGeneral(dadesOperacions, valorPaisNom);
						dadesEspecifiquesValors.setValorPais(valorPaisCodiIne);
					}
					break;
				case PROVINCIA:
					if (atributEntry.getValue().get(0) != null) {
						String valorProvinciaNom = atributEntry.getValue().get(INTEGER_ZERO).substring(4);
						String valorProvinciaCodiIne = atributEntry.getValue().get(INTEGER_ZERO).substring(0, 3);
						validateDadesOperacioCadenaGeneral(dadesOperacions, valorProvinciaNom);
						dadesEspecifiquesValors.setValorProvincia(valorProvinciaCodiIne);
					}
					break;
				case MUNICIPI:
					if (atributEntry.getValue().get(0) != null) {
						String valorMunicipiNom = atributEntry.getValue().get(INTEGER_ZERO).substring(7);
						String valorMunicipiCodiIne = atributEntry.getValue().get(INTEGER_ZERO).substring(0, 6);
						validateDadesOperacioCadenaGeneral(dadesOperacions, valorMunicipiNom);
						dadesEspecifiquesValors.setValorMunicipi(valorMunicipiCodiIne);
					}
					break;
				default:
					break;
				}
			} catch (GPAApiParamValidationException e) {
				throw e;
			} catch (Exception e) {
				throw new GPAApiParamValidationException(Resultat.ERROR_ACTUALITZAR_EXPEDIENT,
				        ErrorPrincipal.ERROR_EXPEDIENTS_ATRIBUT_NOT_CORRECT_VALUE, StringUtils.join(atributEntry.getValue(), ", "), e);
			}

			if (CollectionUtils.isNotEmpty(dadesEspecifiquesValors.getValorListaMultipleList())) {
				DadesEspecifiquesValors dadesEspecifiquesValorsListaMultiple = null;
				for (Integer valor : dadesEspecifiquesValors.getValorListaMultipleList()) {
					dadesEspecifiquesValorsListaMultiple = new DadesEspecifiquesValors();
					dadesEspecifiquesValorsListaMultiple.setValorListaMultiple(valor);
					dadesEspecifiquesValorsList.add(dadesEspecifiquesValorsListaMultiple);
				}
			} else {
				dadesEspecifiquesValorsList.add(dadesEspecifiquesValors);
			}
			dadesEspecifiquesRDTO.setDadesEspecifiquesValorsList(dadesEspecifiquesValorsList);
			dadesEspecifiquesRDTOList.add(dadesEspecifiquesRDTO);
		}

		return dadesEspecifiquesRDTOList;
	}

	/**
	 * Validate dades operacio numeric general.
	 *
	 * @param dadesOperacions
	 *            the dades operacions
	 * @param valor
	 *            the valor
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 * @throws ParseException
	 *             the parse exception
	 */
	private static void validateDadesOperacioNumericGeneral(DadesOperacions dadesOperacions, BigDecimal valor)
	        throws GPAApiParamValidationException, ParseException {
		NumberFormat numberFormat = NumberFormat.getInstance(LocaleContextHolder.getLocale());
		TipusValidacioApiParamValueTranslator tipusValidacioApiParamValueTranslator = new TipusValidacioApiParamValueTranslator();
		TipusValidacioApiParamValue tipusValidacioApiParamValue = null;
		boolean valid = true;
		for (DadesOperacionsValidacio dadesOperacionsValidacio : dadesOperacions.getDadesOperacionsValidacio()) {
			tipusValidacioApiParamValue = tipusValidacioApiParamValueTranslator
			        .getEnumByInternalValue(dadesOperacionsValidacio.getTipusValidacio());
			DadesOperValidVal dadesOperValidVal0 = dadesOperacionsValidacio.getDadesOperacionsValidValors().get(INTEGER_ZERO);
			BigDecimal validVal0 = new BigDecimal(numberFormat.parse(dadesOperValidVal0.getValor()).toString());
			DadesOperValidVal dadesOperValidVal1 = null;
			BigDecimal validVal1 = null;
			BigDecimal[] validValArray = null;
			if (dadesOperacionsValidacio.getDadesOperacionsValidValors().size() > INTEGER_ONE) {
				// Es necesario comprobar la validación atendiendo al ordre
				dadesOperValidVal1 = dadesOperacionsValidacio.getDadesOperacionsValidValors().get(INTEGER_ONE);
				validVal1 = new BigDecimal(numberFormat.parse(dadesOperValidVal1.getValor()).toString());
				if (dadesOperValidVal0.getOrdre().longValue() < dadesOperValidVal1.getOrdre().longValue()) {
					validValArray = new BigDecimal[] { validVal0, validVal1 };
				} else {
					validValArray = new BigDecimal[] { validVal1, validVal0 };
				}
			}
			switch (tipusValidacioApiParamValue) {
			case OBLIGATORI:
				valid = valor != null;
				break;
			case MENOR:
				valid = valor.compareTo(validVal0) < INTEGER_ZERO;
				break;
			case MAJOR:
				valid = valor.compareTo(validVal0) > INTEGER_ZERO;
				break;
			case IGUAL:
				valid = valor.compareTo(validVal0) == INTEGER_ZERO;
				break;
			case MENOR_IGUAL:
				valid = valor.compareTo(validVal0) <= INTEGER_ZERO;
				break;
			case MAJOR_IGUAL:
				valid = valor.compareTo(validVal0) >= INTEGER_ZERO;
				break;
			case INTERVAL_TANCAT:
				valid = valor.compareTo(validValArray[0]) >= INTEGER_ZERO && valor.compareTo(validValArray[1]) <= INTEGER_ZERO;
				break;
			case INTERVAL_OBERT:
				valid = valor.compareTo(validValArray[0]) > INTEGER_ZERO && valor.compareTo(validValArray[1]) < INTEGER_ZERO;
				break;
			case URL:
				// TODO Aún no tenemos mecanismo para la validación contra URL
				break;
			default:
				break;
			}

			if (!valid) {
				throw new GPAApiParamValidationException(Resultat.ERROR_ACTUALITZAR_EXPEDIENT,
				        ErrorPrincipal.ERROR_EXPEDIENTS_ATRIBUT_NOT_VALID_VALUE, String.valueOf(valor));
			}
		}
	}

	/**
	 * Validate dades operacio data general.
	 *
	 * @param dadesOperacions
	 *            the dades operacions
	 * @param valor
	 *            the valor
	 * @param tipusCampApiParamValue
	 *            the tipus camp api param value
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	private static void validateDadesOperacioDataGeneral(DadesOperacions dadesOperacions, DateTime valor,
	        TipusCampApiParamValue tipusCampApiParamValue) throws GPAApiParamValidationException {
		TipusValidacioApiParamValueTranslator tipusValidacioApiParamValueTranslator = new TipusValidacioApiParamValueTranslator();
		TipusValidacioApiParamValue tipusValidacioApiParamValue = null;
		DateTimeFormatter formatter = null;
		DateTimeFormatter dataHoraFormatter = DateTimeFormat.forPattern(Constants.DATE_TIME_PATTERN);
		switch (tipusCampApiParamValue) {
		case DATA:
			formatter = DateTimeFormat.forPattern(Constants.DATE_PATTERN);
			break;
		case DATA_HORA:
			formatter = DateTimeFormat.forPattern(Constants.DATE_TIME_PATTERN);
			break;
		case HORA:
			formatter = DateTimeFormat.forPattern(Constants.TIME_PATTERN);
			break;
		default:
			formatter = DateTimeFormat.forPattern(Constants.DATE_TIME_PATTERN);
			break;
		}
		boolean valid = true;
		for (DadesOperacionsValidacio dadesOperacionsValidacio : dadesOperacions.getDadesOperacionsValidacio()) {
			tipusValidacioApiParamValue = tipusValidacioApiParamValueTranslator
			        .getEnumByInternalValue(dadesOperacionsValidacio.getTipusValidacio());
			DadesOperValidVal dadesOperValidVal0 = dadesOperacionsValidacio.getDadesOperacionsValidValors().get(INTEGER_ZERO);
			DateTime validVal0 = dataHoraFormatter.parseDateTime(dadesOperValidVal0.getValor().split(",")[0]);
			validVal0 = formatter.parseDateTime(formatter.print(validVal0));
			DadesOperValidVal dadesOperValidVal1 = null;
			DateTime validVal1 = null;
			DateTime[] validValArray = null;
			if (dadesOperacionsValidacio.getDadesOperacionsValidValors().size() > INTEGER_ONE) {
				// Es necesario comprobar la validación atendiendo al ordre
				dadesOperValidVal1 = dadesOperacionsValidacio.getDadesOperacionsValidValors().get(INTEGER_ONE);
				validVal1 = dataHoraFormatter.parseDateTime(dadesOperValidVal1.getValor().split(",")[0]);
				validVal1 = formatter.parseDateTime(formatter.print(validVal1));
				if (dadesOperValidVal0.getOrdre().longValue() < dadesOperValidVal1.getOrdre().longValue()) {
					validValArray = new DateTime[] { validVal0, validVal1 };
				} else {
					validValArray = new DateTime[] { validVal1, validVal0 };
				}
			}
			switch (tipusValidacioApiParamValue) {
			case OBLIGATORI:
				valid = valor != null;
				break;
			case MENOR:
				valid = valor.isBefore(validVal0);
				break;
			case MAJOR:
				valid = valor.isAfter(validVal0);
				break;
			case IGUAL:
				valid = valor.isEqual(validVal0);
				break;
			case MENOR_IGUAL:
				valid = (valor.isBefore(validVal0) || valor.isEqual(validVal0));
				break;
			case MAJOR_IGUAL:
				valid = (valor.isAfter(validVal0) || valor.isEqual(validVal0));
				break;
			case INTERVAL_TANCAT:
				valid = (valor.isAfter(validValArray[0]) || valor.isEqual(validValArray[0]))
				        && (valor.isBefore(validValArray[1]) || valor.isEqual(validValArray[1]));
				break;
			case INTERVAL_OBERT:
				valid = (valor.isAfter(validValArray[0]) && valor.isBefore(validValArray[1]));
				break;
			case URL:
				// TODO Aún no tenemos mecanismo para la validación contra URL
				break;
			default:
				break;
			}

			if (!valid) {
				throw new GPAApiParamValidationException(Resultat.ERROR_ACTUALITZAR_EXPEDIENT,
				        ErrorPrincipal.ERROR_EXPEDIENTS_ATRIBUT_NOT_VALID_VALUE, formatter.print(valor));
			}
		}
	}

	/**
	 * Validate dades operacio cadena general.
	 *
	 * @param dadesOperacions
	 *            the dades operacions
	 * @param valor
	 *            the valor
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	private static void validateDadesOperacioCadenaGeneral(DadesOperacions dadesOperacions, String valor)
	        throws GPAApiParamValidationException {
		TipusValidacioApiParamValueTranslator tipusValidacioApiParamValueTranslator = new TipusValidacioApiParamValueTranslator();
		TipusValidacioApiParamValue tipusValidacioApiParamValue = null;
		boolean valid = true;
		for (DadesOperacionsValidacio dadesOperacionsValidacio : dadesOperacions.getDadesOperacionsValidacio()) {
			tipusValidacioApiParamValue = tipusValidacioApiParamValueTranslator
			        .getEnumByInternalValue(dadesOperacionsValidacio.getTipusValidacio());
			DadesOperValidVal dadesOperValidVal = dadesOperacionsValidacio.getDadesOperacionsValidValors().get(INTEGER_ZERO);
			String validVal = dadesOperValidVal.getValor();
			switch (tipusValidacioApiParamValue) {
			case OBLIGATORI:
				valid = StringUtils.isNotEmpty(valor);
				break;
			case IGUAL:
				valid = StringUtils.equalsIgnoreCase(valor, validVal);
				break;
			case LONGITUD_MAXIMA:
				valid = valor.length() <= Long.valueOf(validVal).longValue();
				break;
			case MASCARA:
				// TODO Pendiente de formato para las máscaras
				break;
			case URL:
				// TODO Aún no tenemos mecanismo para la validación contra URL
				break;
			default:
				break;
			}

			if (!valid) {
				throw new GPAApiParamValidationException(Resultat.ERROR_ACTUALITZAR_EXPEDIENT,
				        ErrorPrincipal.ERROR_EXPEDIENTS_ATRIBUT_NOT_VALID_VALUE, String.valueOf(valor));
			}
		}
	}

	/**
	 * Validate document.
	 *
	 * @param docsRDTO
	 *            the docs RDTO
	 * @param dadesExpedientBDTO
	 *            the dades expedient BDTO
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateDocument(DocsRDTO docsRDTO, DadesExpedientBDTO dadesExpedientBDTO, Resultat resultatError)
	        throws GPAApiParamValidationException {
		if (docsRDTO == null) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_DOCUMENTS_NOT_FOUND);
		}

		if (!docsRDTO.getDocumentacio().equals(dadesExpedientBDTO.getExpedientsRDTO().getDocumentacioIdext())) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_DOCUMENTS_NOT_IN_EXPEDIENT);
		}
	}

	/**
	 * Validate document aportat.
	 *
	 * @param docsEntradaRDTO
	 *            the docs entrada RDTO
	 * @param dadesExpedientBDTO
	 *            the dades expedient BDTO
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateDocumentAportat(DocsEntradaRDTO docsEntradaRDTO, DadesExpedientBDTO dadesExpedientBDTO,
	        Resultat resultatError) throws GPAApiParamValidationException {
		if (docsEntradaRDTO == null) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_DOCUMENTS_NOT_FOUND);
		}

		if (!docsEntradaRDTO.getDocumentacio().equals(dadesExpedientBDTO.getExpedientsRDTO().getDocumentacioIdext())) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_DOCUMENTS_NOT_IN_EXPEDIENT);
		}
	}
	

	/**
	 * Validate document aportat.
	 *
	 * @param docsEntradaRDTO the docs entrada RDTO
	 * @param dadesSollicitudBDTO the dades sollicitud BDTO
	 * @param resultatError the resultat error
	 * @throws GPAApiParamValidationException the GPA api param validation exception
	 */
	public static void validateDocumentAportat(DocsEntradaRDTO docsEntradaRDTO, DadesSollicitudBDTO dadesSollicitudBDTO,
			Resultat resultatError) throws GPAApiParamValidationException {
		if (docsEntradaRDTO == null) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_DOCUMENTS_NOT_FOUND);
		}

		if (!docsEntradaRDTO.getSollicitudIdext().equals(dadesSollicitudBDTO.getSollicitudsRDTO().getId())) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_DOCUMENTS_NOT_IN_SOLLICITUD);
		}
	}

	/**
	 * Validate document aportat esborrar.
	 *
	 * @param docsEntradaRDTO
	 *            the docs entrada RDTO
	 * @param dadesExpedientBDTO
	 *            the dades expedient BDTO
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateDocumentAportatEsborrar(DocsEntradaRDTO docsEntradaRDTO, DadesExpedientBDTO dadesExpedientBDTO,
	        Resultat resultatError) throws GPAApiParamValidationException {
		if (NumberUtils.INTEGER_ONE.compareTo(docsEntradaRDTO.getOrigen()) != 0) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_DOCUMENTS_ORIGEN_EXTERN);
		}
	}

	/**
	 * Validate document generat esborrar.
	 *
	 * @param docsTramitacioRDTO
	 *            the docs tramitacio RDTO
	 * @param dadesExpedientBDTO
	 *            the dades expedient BDTO
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateDocumentGeneratEsborrar(DocsTramitacioRDTO docsTramitacioRDTO, DadesExpedientBDTO dadesExpedientBDTO,
	        Resultat resultatError) throws GPAApiParamValidationException {
		if (NumberUtils.INTEGER_ONE.compareTo(docsTramitacioRDTO.getOrigen()) != 0) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_DOCUMENTS_ORIGEN_EXTERN);
		}
	}

	/**
	 * Validate document upload.
	 *
	 * @param docsEntradaRDTO
	 *            the docs entrada RDTO
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateDocumentUpload(DocsEntradaRDTO docsEntradaRDTO, Resultat resultatError)
	        throws GPAApiParamValidationException {
		if (docsEntradaRDTO.getDeclaracioResponsable() != null && docsEntradaRDTO.getDeclaracioResponsable()
		        .compareTo(BooleanApiParamValue.TRUE.getInternalValue()) == NumberUtils.INTEGER_ZERO) {
			throw new GPAApiParamValidationException(resultatError,
			        ErrorPrincipal.ERROR_DOCUMENTS_UPLOAD_DECLARACIO_RESPONSABLE_NOT_AVAILABLE);
		}
	}

	/**
	 * Validate document generat.
	 *
	 * @param docsTramitacioRDTO
	 *            the docs tramitacio RDTO
	 * @param dadesExpedientBDTO
	 *            the dades expedient BDTO
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateDocumentGenerat(DocsTramitacioRDTO docsTramitacioRDTO, DadesExpedientBDTO dadesExpedientBDTO,
	        Resultat resultatError) throws GPAApiParamValidationException {
		if (docsTramitacioRDTO == null) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_DOCUMENTS_NOT_FOUND);
		}

		if (!docsTramitacioRDTO.getDocumentacio().equals(dadesExpedientBDTO.getExpedientsRDTO().getDocumentacioIdext())) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_DOCUMENTS_NOT_IN_EXPEDIENT);
		}
	}

	/**
	 * Validate configuracio documentacio aportada.
	 *
	 * @param configuracioDocsEntradaRDTOList
	 *            the configuracio docs entrada RDTO list
	 * @param documentAportatCrearRDTOList
	 *            the document aportat crear RDTO list
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsEntradaRDTO> validateConfiguracioDocumentacioAportada(
	        List<ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOList, List<DocumentAportatCrearRDTO> documentAportatCrearRDTOList,
	        Resultat resultatError) throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOMap = new HashMap<>();
		if (CollectionUtils.isNotEmpty(documentAportatCrearRDTOList)) {
			ArrayList<String> uniqueIdConfiguracioDocumentacioList = new ArrayList<String>();
			for (DocumentAportatCrearRDTO documentAportatCrearRDTO : documentAportatCrearRDTOList) {
				uniqueIdConfiguracioDocumentacioList.add(documentAportatCrearRDTO.getConfiguracioDocumentacio());
			}
			configuracioDocsEntradaRDTOMap = validateConfiguracioDocumentacioEntrada(configuracioDocsEntradaRDTOList,
			        uniqueIdConfiguracioDocumentacioList, resultatError);
		}
		return configuracioDocsEntradaRDTOMap;
	}

	/**
	 * Validate configuracio documentacio digitalitzada.
	 *
	 * @param configuracioDocsEntradaRDTOList
	 *            the configuracio docs entrada RDTO list
	 * @param documentDigitalitzarCrearRDTOList
	 *            the document digitalitzar crear RDTO list
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsEntradaRDTO> validateConfiguracioDocumentacioDigitalitzada(
	        List<ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOList,
	        List<DocumentDigitalitzarCrearRDTO> documentDigitalitzarCrearRDTOList, Resultat resultatError)
	        throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOMap = new HashMap<>();
		if (CollectionUtils.isNotEmpty(documentDigitalitzarCrearRDTOList)) {
			ArrayList<String> uniqueIdConfiguracioDocumentacioList = new ArrayList<String>();
			for (DocumentDigitalitzarCrearRDTO documentDigitalitzarCrearRDTO : documentDigitalitzarCrearRDTOList) {
				uniqueIdConfiguracioDocumentacioList.add(documentDigitalitzarCrearRDTO.getConfiguracioDocumentacio());
			}
			configuracioDocsEntradaRDTOMap = validateConfiguracioDocumentacioEntrada(configuracioDocsEntradaRDTOList,
			        uniqueIdConfiguracioDocumentacioList, resultatError);
		}
		return configuracioDocsEntradaRDTOMap;
	}

	/**
	 * Validate configuracio documentacio substituir.
	 *
	 * @param configuracioDocsEntradaRDTOList
	 *            the configuracio docs entrada RDTO list
	 * @param documentAportatSubstituirRDTO
	 *            the document aportat substituir RDTO
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsEntradaRDTO> validateConfiguracioDocumentacioSubstituir(
	        List<ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOList, DocumentAportatSubstituirRDTO documentAportatSubstituirRDTO,
	        Resultat resultatError) throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOMap = new HashMap<>();
		if (documentAportatSubstituirRDTO != null) {
			configuracioDocsEntradaRDTOMap = validateConfiguracioDocumentacioEntrada(configuracioDocsEntradaRDTOList,
			        Arrays.asList(documentAportatSubstituirRDTO.getConfiguracioDocumentacio()), resultatError);
		}
		return configuracioDocsEntradaRDTOMap;
	}

	/**
	 * Validate configuracio documentacio esmenar.
	 *
	 * @param configuracioDocsEntradaRDTOList
	 *            the configuracio docs entrada RDTO list
	 * @param documentRequeritCrearRDTOList
	 *            the document requerit crear RDTO list
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsEntradaRDTO> validateConfiguracioDocumentacioEsmenar(
	        List<ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOList,
	        List<DocumentRequeritCrearRDTO> documentRequeritCrearRDTOList, Resultat resultatError) throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOMap = new HashMap<>();
		if (CollectionUtils.isNotEmpty(documentRequeritCrearRDTOList)) {
			ArrayList<String> idConfiguracioDocumentacioList = new ArrayList<String>();
			for (DocumentRequeritCrearRDTO documentRequeritCrearRDTO : documentRequeritCrearRDTOList) {
				idConfiguracioDocumentacioList.add(documentRequeritCrearRDTO.getConfiguracioDocumentacio());
			}
			configuracioDocsEntradaRDTOMap = validateConfiguracioDocumentacioEntrada(configuracioDocsEntradaRDTOList,
			        idConfiguracioDocumentacioList, resultatError);
		}
		return configuracioDocsEntradaRDTOMap;
	}

	/**
	 * Validate configuracio documentacio entrada incorporat nou.
	 *
	 * @param configuracioDocsEntradaRDTOList
	 *            the configuracio docs entrada RDTO list
	 * @param documentIncorporatNouRDTO
	 *            the document incorporat nou RDTO
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsEntradaRDTO> validateConfiguracioDocumentacioEntradaIncorporatNou(
	        List<ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOList, DocumentIncorporatNouRDTO documentIncorporatNouRDTO,
	        Resultat resultatError) throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOMap = new HashMap<>();
		if (documentIncorporatNouRDTO != null) {
			configuracioDocsEntradaRDTOMap = validateConfiguracioDocumentacioEntrada(configuracioDocsEntradaRDTOList,
			        Arrays.asList(documentIncorporatNouRDTO.getConfiguracioDocumentacio()), resultatError);
		}
		return configuracioDocsEntradaRDTOMap;
	}

	/**
	 * Validate configuracio documentacio tramitacio incorporat nou.
	 *
	 * @param configuracioDocsTramitacioRDTOList
	 *            the configuracio docs tramitacio RDTO list
	 * @param documentIncorporatNouRDTO
	 *            the document incorporat nou RDTO
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsTramitacioRDTO> validateConfiguracioDocumentacioTramitacioIncorporatNou(
	        List<ConfiguracioDocsTramitacioRDTO> configuracioDocsTramitacioRDTOList, DocumentIncorporatNouRDTO documentIncorporatNouRDTO,
	        Resultat resultatError) throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsTramitacioRDTO> configuracioDocsTramitacioRDTOMap = new HashMap<>();
		if (documentIncorporatNouRDTO != null) {
			configuracioDocsTramitacioRDTOMap = validateConfiguracioDocumentacioTramitacio(configuracioDocsTramitacioRDTOList,
			        Arrays.asList(documentIncorporatNouRDTO.getConfiguracioDocumentacio()), resultatError);
		}
		return configuracioDocsTramitacioRDTOMap;
	}

	/**
	 * Validate configuracio documentacio entrada completat.
	 *
	 * @param configuracioDocsEntradaRDTOList
	 *            the configuracio docs entrada RDTO list
	 * @param documentCompletatRDTO
	 *            the document completat RDTO
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsEntradaRDTO> validateConfiguracioDocumentacioEntradaCompletat(
	        List<ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOList, DocumentCompletatRDTO documentCompletatRDTO,
	        Resultat resultatError) throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOMap = new HashMap<>();
		if (documentCompletatRDTO != null) {
			configuracioDocsEntradaRDTOMap = validateConfiguracioDocumentacioEntrada(configuracioDocsEntradaRDTOList,
			        Arrays.asList(documentCompletatRDTO.getConfiguracioDocumentacio()), resultatError);
		}
		return configuracioDocsEntradaRDTOMap;
	}

	/**
	 * Validate configuracio documentacio tramitacio completat.
	 *
	 * @param configuracioDocsTramitacioRDTOList
	 *            the configuracio docs tramitacio RDTO list
	 * @param documentCompletatRDTO
	 *            the document completat RDTO
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsTramitacioRDTO> validateConfiguracioDocumentacioTramitacioCompletat(
	        List<ConfiguracioDocsTramitacioRDTO> configuracioDocsTramitacioRDTOList, DocumentCompletatRDTO documentCompletatRDTO,
	        Resultat resultatError) throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsTramitacioRDTO> configuracioDocsTramitacioRDTOMap = new HashMap<>();
		if (documentCompletatRDTO != null) {
			configuracioDocsTramitacioRDTOMap = validateConfiguracioDocumentacioTramitacio(configuracioDocsTramitacioRDTOList,
			        Arrays.asList(documentCompletatRDTO.getConfiguracioDocumentacio()), resultatError);
		}
		return configuracioDocsTramitacioRDTOMap;
	}

	/**
	 * Validate configuracio documentacio entrada declaracio responsable
	 * presentada.
	 *
	 * @param configuracioDocsEntradaRDTOList
	 *            the configuracio docs entrada RDTO list
	 * @param declaracioResponsablePresentadaRDTO
	 *            the declaracio responsable presentada RDTO
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsEntradaRDTO> validateConfiguracioDocumentacioEntradaDeclaracioResponsablePresentada(
	        List<ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOList,
	        DeclaracioResponsablePresentadaRDTO declaracioResponsablePresentadaRDTO, Resultat resultatError)
	        throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOMap = new HashMap<>();
		if (declaracioResponsablePresentadaRDTO != null) {
			configuracioDocsEntradaRDTOMap = validateConfiguracioDocumentacioEntrada(configuracioDocsEntradaRDTOList,
			        Arrays.asList(declaracioResponsablePresentadaRDTO.getConfiguracioDocumentacio()), resultatError);
		}
		return configuracioDocsEntradaRDTOMap;
	}

	/**
	 * Validate configuracio documentacio preparar requeriment expedient.
	 *
	 * @param documentacioRequerida
	 *            the documentacio requerida
	 * @param configuracioDocsEntradaRDTOList
	 *            the configuracio docs entrada RDTO list
	 * @return the array list
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static ArrayList<BigDecimal> validateConfiguracioDocumentacioPrepararRequerimentExpedient(
	        List<ConfiguracioDocumentacioRequeridaRDTO> documentacioRequerida,
	        List<ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOList) throws GPAApiParamValidationException {
		ArrayList<BigDecimal> idConfiguracioDocsEntradaList = null;
		if (CollectionUtils.isNotEmpty(documentacioRequerida)) {
			idConfiguracioDocsEntradaList = new ArrayList<BigDecimal>();
			HashMap<String, ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOMap = new HashMap<String, ConfiguracioDocsEntradaRDTO>();
			if (CollectionUtils.isNotEmpty(configuracioDocsEntradaRDTOList)) {
				for (ConfiguracioDocsEntradaRDTO configuracioDocsEntradaRDTO : configuracioDocsEntradaRDTOList) {
					configuracioDocsEntradaRDTOMap.put(configuracioDocsEntradaRDTO.getUniqueId().toString(), configuracioDocsEntradaRDTO);
				}
			}
			for (ConfiguracioDocumentacioRequeridaRDTO configuracioDocumentacioRequeridaRDTO : documentacioRequerida) {
				if (!configuracioDocsEntradaRDTOMap.containsKey(configuracioDocumentacioRequeridaRDTO.getConfiguracioDocumentacio())) {
					throw new GPAApiParamValidationException(Resultat.ERROR_PREPARAR_REQUERIMENT_EXPEDIENT,
					        ErrorPrincipal.ERROR_CONFIGURACIO_DOCUMENTACIO_REQUERIMENT_NOT_AVAILABLE,
					        configuracioDocumentacioRequeridaRDTO.getConfiguracioDocumentacio());
				}
				idConfiguracioDocsEntradaList.add(
				        configuracioDocsEntradaRDTOMap.get(configuracioDocumentacioRequeridaRDTO.getConfiguracioDocumentacio()).getId());
			}
		}
		return idConfiguracioDocsEntradaList;
	}

	/**
	 * Validate configuracio documentacio tramitacio requeriment preparat.
	 *
	 * @param configuracioDocsTramitacioRDTOList
	 *            the configuracio docs tramitacio RDTO list
	 * @param requerimentPreparatRDTO
	 *            the requeriment preparat RDTO
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsTramitacioRDTO> validateConfiguracioDocumentacioTramitacioRequerimentPreparat(
	        List<ConfiguracioDocsTramitacioRDTO> configuracioDocsTramitacioRDTOList, RequerimentPreparatRDTO requerimentPreparatRDTO,
	        Resultat resultatError) throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsTramitacioRDTO> configuracioDocsTramitacioRDTOMap = new HashMap<>();
		if (requerimentPreparatRDTO != null) {
			configuracioDocsTramitacioRDTOMap = validateConfiguracioDocumentacioTramitacio(configuracioDocsTramitacioRDTOList,
			        Arrays.asList(requerimentPreparatRDTO.getConfiguracioDocumentacio()), resultatError);
		}
		return configuracioDocsTramitacioRDTOMap;
	}

	/**
	 * Validate configuracio documentacio entrada.
	 *
	 * @param configuracioDocsEntradaRDTOList
	 *            the configuracio docs entrada RDTO list
	 * @param uniqueIdConfiguracioDocumentacioList
	 *            the unique id configuracio documentacio list
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	private static HashMap<String, ConfiguracioDocsEntradaRDTO> validateConfiguracioDocumentacioEntrada(
	        List<ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOList, List<String> uniqueIdConfiguracioDocumentacioList,
	        Resultat resultatError) throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOMap = new HashMap<String, ConfiguracioDocsEntradaRDTO>();
		for (ConfiguracioDocsEntradaRDTO configuracioDocsEntradaRDTO : configuracioDocsEntradaRDTOList) {
			configuracioDocsEntradaRDTOMap.put(String.valueOf(configuracioDocsEntradaRDTO.getUniqueId()), configuracioDocsEntradaRDTO);
		}

		for (String idConfiguracioDocumentacio : uniqueIdConfiguracioDocumentacioList) {
			if (!configuracioDocsEntradaRDTOMap.containsKey(idConfiguracioDocumentacio)) {
				throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_CONFIGURACIO_DOCUMENTACIO_NOT_IN_EXPEDIENT,
				        idConfiguracioDocumentacio);
			}
		}

		return configuracioDocsEntradaRDTOMap;
	}

	/**
	 * Validate configuracio documentacio tramitacio.
	 *
	 * @param configuracioDocsTramitacioRDTOList
	 *            the configuracio docs tramitacio RDTO list
	 * @param uniqueIdConfiguracioDocumentacioList
	 *            the unique id configuracio documentacio list
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	private static HashMap<String, ConfiguracioDocsTramitacioRDTO> validateConfiguracioDocumentacioTramitacio(
	        List<ConfiguracioDocsTramitacioRDTO> configuracioDocsTramitacioRDTOList, List<String> uniqueIdConfiguracioDocumentacioList,
	        Resultat resultatError) throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsTramitacioRDTO> configuracioDocsTramitacioRDTOMap = new HashMap<String, ConfiguracioDocsTramitacioRDTO>();
		for (ConfiguracioDocsTramitacioRDTO configuracioDocsTramitacioRDTO : configuracioDocsTramitacioRDTOList) {
			configuracioDocsTramitacioRDTOMap.put(String.valueOf(configuracioDocsTramitacioRDTO.getUniqueId()),
			        configuracioDocsTramitacioRDTO);
		}

		for (String idConfiguracioDocumentacio : uniqueIdConfiguracioDocumentacioList) {
			if (!configuracioDocsTramitacioRDTOMap.containsKey(idConfiguracioDocumentacio)) {
				throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_CONFIGURACIO_DOCUMENTACIO_NOT_IN_EXPEDIENT,
				        idConfiguracioDocumentacio);
			}
		}

		return configuracioDocsTramitacioRDTOMap;
	}

	/**
	 * Validate registre assentament.
	 *
	 * @param registreAssentamentRDTO
	 *            the registre assentament RDTO
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateRegistreAssentament(RegistreAssentamentRDTO registreAssentamentRDTO, Resultat resultatError)
	        throws GPAApiParamValidationException {
		if (registreAssentamentRDTO == null) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_EXPEDIENTS_REGISTRE_ASSENTAMENT_NOT_FOUND);
		}
	}

	/**
	 * Validate persona implicada expedient.
	 *
	 * @param dadesExpedientBDTO
	 *            the dades expedient BDTO
	 * @param documentIdentitat
	 *            the document identitat
	 * @param resultatError
	 *            the resultat error
	 * @return the persones sollicitud RDTO
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static PersonesSollicitudRDTO validatePersonaImplicadaExpedient(DadesExpedientBDTO dadesExpedientBDTO,
	        DocumentsIdentitatRDTO documentIdentitat, Resultat resultatError) throws GPAApiParamValidationException {
		for (PersonesSollicitudRDTO personesSollicitudRDTO : dadesExpedientBDTO.getPersonesImplicades()) {
			if (personesSollicitudRDTO.getPersones().getDocumentsIdentitat() != null
			        && StringUtils.equals(personesSollicitudRDTO.getPersones().getDocumentsIdentitat().getNumeroDocument(),
			                documentIdentitat.getNumeroDocument())) {
				return personesSollicitudRDTO;
			}
		}
		throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_EXPEDIENTS_PERSONA_IMPLICADA_NOT_FOUND);
	}

	/**
	 * Validate data limit.
	 *
	 * @param dataLimit
	 *            the data limit
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateDataLimit(String dataLimit, Resultat resultatError) throws GPAApiParamValidationException {
		if (StringUtils.isNotEmpty(dataLimit)) {
			DateTimeFormatter dataHoraFormatter = DateTimeFormat.forPattern(Constants.DATE_TIME_PATTERN);
			DateTime valorDataHora = DateTime.parse(dataLimit, dataHoraFormatter);
			if (valorDataHora.isBeforeNow()) {
				throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_EXPEDIENTS_DATA_LIMIT_NOT_VALID);
			}
		}
	}

	/**
	 * Validate configuracio documentacio entrada digitalitzar.
	 *
	 * @param configuracioDocsEntradaRDTOList
	 *            the configuracio docs entrada RDTO list
	 * @param document
	 *            the document
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsEntradaRDTO> validateConfiguracioDocumentacioEntradaDigitalitzar(
	        List<ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOList, DocumentDigitalitzatRDTO document, Resultat resultatError)
	        throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOMap = new HashMap<>();
		if (document != null) {
			ArrayList<String> uniqueIdConfiguracioDocumentacioList = new ArrayList<String>();
			uniqueIdConfiguracioDocumentacioList.add(document.getConfiguracioDocumentacio());
			configuracioDocsEntradaRDTOMap = validateConfiguracioDocumentacioEntrada(configuracioDocsEntradaRDTOList,
			        uniqueIdConfiguracioDocumentacioList, resultatError);
		}
		return configuracioDocsEntradaRDTOMap;
	}

	/**
	 * Validate configuracio documentacio tramitacio digitalitzar.
	 *
	 * @param configuracioDocsTramitacioRDTOList
	 *            the configuracio docs tramitacio RDTO list
	 * @param document
	 *            the document
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsTramitacioRDTO> validateConfiguracioDocumentacioTramitacioDigitalitzar(
	        List<ConfiguracioDocsTramitacioRDTO> configuracioDocsTramitacioRDTOList, DocumentDigitalitzatRDTO document,
	        Resultat resultatError) throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsTramitacioRDTO> configuracioDocsTramitacioRDTOMap = new HashMap<>();
		if (document != null) {
			ArrayList<String> uniqueIdConfiguracioDocumentacioList = new ArrayList<String>();
			uniqueIdConfiguracioDocumentacioList.add(document.getConfiguracioDocumentacio());
			configuracioDocsTramitacioRDTOMap = validateConfiguracioDocumentacioTramitacio(configuracioDocsTramitacioRDTOList,
			        uniqueIdConfiguracioDocumentacioList, resultatError);
		}
		return configuracioDocsTramitacioRDTOMap;
	}

	/**
	 * Validate configuracio documentacio entrada intraoperabilitat.
	 *
	 * @param configuracioDocsEntradaRDTOList
	 *            the configuracio docs entrada RDTO list
	 * @param documentIntraoperabilitatRDTO
	 *            the document intraoperabilitat RDTO
	 * @param resultatError
	 *            the resultat error
	 * @return the hash map
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static HashMap<String, ConfiguracioDocsEntradaRDTO> validateConfiguracioDocumentacioEntradaIntraoperabilitat(
	        List<ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOList, DocumentIntraoperabilitatRDTO documentIntraoperabilitatRDTO,
	        Resultat resultatError) throws GPAApiParamValidationException {
		HashMap<String, ConfiguracioDocsEntradaRDTO> configuracioDocsEntradaRDTOMap = new HashMap<>();
		if (documentIntraoperabilitatRDTO != null) {
			configuracioDocsEntradaRDTOMap = validateConfiguracioDocumentacioEntrada(configuracioDocsEntradaRDTOList,
			        Arrays.asList(documentIntraoperabilitatRDTO.getConfiguracioDocumentacio()), resultatError);
		}
		return configuracioDocsEntradaRDTOMap;
	}

	/**
	 * Validate transicio accio disponible expedient.
	 *
	 * @param accionsEstatsRDTOList
	 *            the accions estats RDTO list
	 * @param accioTramitadorApiParamValue
	 *            the accio tramitador api param value
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateTransicioAccioDisponibleExpedient(List<AccionsEstatsRDTO> accionsEstatsRDTOList,
	        AccioTramitadorApiParamValue accioTramitadorApiParamValue, Resultat resultatError) throws GPAApiParamValidationException {

		if (accionsEstatsRDTOList == null || accionsEstatsRDTOList.size() == 0) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_EXPEDIENTS_TRANSICION_ESTAT_NOT_VALID,
			        accioTramitadorApiParamValue.getApiParamValue());
		}

	}

	/**
	 * Validate canviar estat expedient.
	 *
	 * @param accionsEstatsRDTOList
	 *            the accions estats RDTO list
	 * @param accioTramitadorApiParamValue
	 *            the accio tramitador api param value
	 * @param resultatError
	 *            the resultat error
	 * @return true, if successful
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static boolean validateCanviarEstatExpedient(List<AccionsEstatsRDTO> accionsEstatsRDTOList,
	        AccioTramitadorApiParamValue accioTramitadorApiParamValue, Resultat resultatError) throws GPAApiParamValidationException {
		if (accionsEstatsRDTOList == null || accionsEstatsRDTOList.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Validate documents signats expedient.
	 *
	 * @param documentsSignats
	 *            the documents signats
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateDocumentsSignatsExpedient(Boolean documentsSignats) throws GPAApiParamValidationException {
		if (!documentsSignats) {
			throw new GPAApiParamValidationException(Resultat.ERROR_DOCUMENT_SIGNAT_EXPEDIENT,
			        ErrorPrincipal.ERROR_DOCUMENTS_EXPEDIENTS_NO_SIGNATS);
		}
	}

	/**
	 * Valida que uno de los dos parametros no sea nulo.
	 *
	 * @param file
	 *            the file
	 * @param idGestorDocumental
	 *            the id gestor documental
	 * @param resultatError
	 *            the resultat error
	 * @throws GPAApiParamValidationException
	 *             the GPA api param validation exception
	 */
	public static void validateEntradaUpload(MultipartFile file, String idGestorDocumental, Resultat resultatError)
	        throws GPAApiParamValidationException {

		if (null == file && StringUtils.isEmpty(idGestorDocumental)) {
			throw new GPAApiParamValidationException(resultatError, ErrorPrincipal.ERROR_ENTRADA_DOCUMENTS_UPLOAD);
		}

	}
}