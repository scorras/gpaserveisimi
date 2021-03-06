package es.bcn.gpa.gpaserveis.web.rest.controller;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
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
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;

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
import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaAportarDocumentExpedientBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaDocumentsEntradaCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaDocumentsTramitacioCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaEsborrarDocumentEntradaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaSubstituirDocumentExpedientBDTO;
import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaUploadDocumentExpedientBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ComentarisCrearAccioBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.DadaEspecificaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.DadesExpedientBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.DadesSollicitudBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsActualitzarBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsCanviarEstatBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsCrearBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsRegistrarBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsRegistrarSollicitudBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.GestionarAvisosPerAccioBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaActualitzarTerceraPersonaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaCrearTerceraPersonaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaEsborrarTerceraPersonaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaExpedientsAbandonarBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaExpedientsActualitzarBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaExpedientsCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaExpedientsCrearBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaExpedientsEsmenarBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaExpedientsRegistrarBDTO;
import es.bcn.gpa.gpaserveis.business.dto.procediments.DadesOperacioCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.procediments.DadesPersonesProcedimentBDTO;
import es.bcn.gpa.gpaserveis.business.dto.procediments.DadesProcedimentBDTO;
import es.bcn.gpa.gpaserveis.business.dto.procediments.ProcedimentsCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.procediments.RespostaDadesOperacioCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.procediments.RespostaProcedimentsCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.tramits.TramitsOvtCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.unitatsgestores.UnitatsGestoresCercaBDTO;
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocumentActualizarRegistre;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.RespostaPlantillaDocVinculada;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.SignarSegellDocument;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.TipusMime;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ActualitzarDadesSollicitud;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ComentariCreacioAccio;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.CrearRegistre;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.CrearSollicitud;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.DadesEspecifiquesRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ExpedientCanviEstat;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ExpedientsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.GestionarAvisosPerAccio;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PersonesSollicitudRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RegistreDocumentacioExpedient;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RespostaCrearRegistreExpedient;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.SollicitudActualitzarRegistre;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.SollicitudsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.DadesGrupsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.DadesOperacions;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ProcedimentsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ReqOperatiusTramOvt;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.AccionsEstatsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.TramitsOvtRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaunitats.UnitatsGestoresRDTO;
import es.bcn.gpa.gpaserveis.web.exception.GPAApiParamValidationException;
import es.bcn.gpa.gpaserveis.web.initialization.interceptor.ClientEntity;
import es.bcn.gpa.gpaserveis.web.rest.controller.handler.ServeisRestControllerExceptionHandler;
import es.bcn.gpa.gpaserveis.web.rest.controller.helper.ServeisRestControllerAccionsDisponiblesHelper;
import es.bcn.gpa.gpaserveis.web.rest.controller.helper.ServeisRestControllerSagaHelper;
import es.bcn.gpa.gpaserveis.web.rest.controller.helper.ServeisRestControllerValidationHelper;
import es.bcn.gpa.gpaserveis.web.rest.controller.helper.ServeisRestControllerVisibilitatHelper;
import es.bcn.gpa.gpaserveis.web.rest.controller.helper.bean.ValidateDadesOperacioResultat;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.Constants;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.ErrorPrincipal;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.Resultat;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.common.BooleanApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.ConfiguracioApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.IdiomaApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.IdiomaPlantillaDocApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.OrigenApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.RevisioApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.TipusDocumentacioVinculadaApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.TipusMimeApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.TipusSignaturaApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.expedient.AccioCiutadaApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.expedient.AccioTramitadorApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.expedient.EstatTramitadorApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.procediment.SuportConfeccioApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.procediment.TramitOvtApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.mapper.cerca.expedient.ExpedientsApiParamToInternalMapper;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.mapper.cerca.procediment.ProcedimentsApiParamToInternalMapper;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.mapper.consulta.atributs.DadesOperacioApiParamToInternalMapper;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.mapper.consulta.documents.DocumentsApiParamToInternalMapper;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.document.ConfiguracioApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.document.IdiomaPlantillaDocApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.AccioAbandonarApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.EstatCiutadaApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.VersioProcedimentApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.ActivableEnFormatElectronicApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.CompetenciaAssociadaApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.EstatApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.ExclusivamentInternApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.FamiliaApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.TramitOvtApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.TramitadorApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.ActualitzarTerceraPersonaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.CrearTerceraPersonaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.RespostaActualitzarTerceraPersonaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.RespostaCrearTerceraPersonaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.RespostaEsborrarTerceraPersonaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.TerceraPersonaSollicitudRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.actualitzar.AtributsActualitzarRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.actualitzar.RespostaActualitzarExpedientRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.aportar.DocumentAportatCrearRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.aportar.DocumentacioAportarRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.aportar.RespostaAportarDocumentRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.esborrar.RespostaEsborrarDocumentRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.substituir.DocumentAportatSubstituirRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.substituir.RespostaSubstituirDocumentRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.upload.RespostaUploadDocumentRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.abandonar.ExpedientAbandonamentRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.abandonar.RespostaAbandonarExpedientRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.actualitzar.ExpedientActualitzarRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.crear.ExpedientCrearRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.crear.RespostaCrearExpedientRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.esmena.DocumentRequeritCrearRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.esmena.ExpedientEsmenaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.esmena.RespostaEsmenarExpedientRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.registrar.ExpedientRegistrarRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.registrar.RespostaRegistrarExpedientRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.cerca.PaginacioRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.cerca.expedients.ExpedientsCercaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.cerca.expedients.RespostaCercaExpedientsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.cerca.procediments.ProcedimentsCercaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.cerca.procediments.RespostaCercaProcedimentsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.atributs.DadesOperacioConsultaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.atributs.RespostaConsultaDadesOperacioRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.documents.ConfiguracioDocumentacioAportadaConsultaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.documents.DocumentAportatConsultaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.documents.RespostaConsultaConfiguracioDocumentacioAportadaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.documents.RespostaConsultaDocumentacioRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.expedients.ExpedientConsultaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.expedients.RespostaConsultaExpedientsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.procediments.PersonesProcedimentConsultaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.procediments.ProcedimentsConsultaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.procediments.RespostaConsultaPersonesProcedimentRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.procediments.RespostaConsultaProcedimentsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.procediments.RespostaConsultaTramitProcedimentRDTO;
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
@CommonsLog
@EntornPropertySource(value = { "classpath:/app/config/gpaserveis.properties" })
public class ServeisPortalRestController extends BaseRestController {

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
	 * Cerca procediments.
	 *
	 * @param resultatsPerPagina
	 *            the resultats per pagina
	 * @param numeroPagina
	 *            the numero pagina
	 * @param ordenarPer
	 *            the ordenar per
	 * @param sentitOrdenacio
	 *            the sentit ordenacio
	 * @param codi
	 *            the codi
	 * @param estat
	 *            the estat
	 * @param nom
	 *            the nom
	 * @param tramitador
	 *            the tramitador
	 * @param aplicacioNegoci
	 *            the aplicacio negoci
	 * @param ugr
	 *            the ugr
	 * @param exclusivamentIntern
	 *            the exclusivament intern
	 * @param activableFormatElectronic
	 *            the activable format electronic
	 * @param organResolutori
	 *            the organ resolutori
	 * @param competenciaAssociada
	 *            the competencia associada
	 * @param familia
	 *            the familia
	 * @param actuacio
	 *            the actuacio
	 * @return the resposta cerca procediments RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping("/procediments")
	@ApiOperation(nickname = "cercaProcedimentsPortal", value = "Cerca de procediments", tags = { "Serveis Portal API" }, extensions = {
	        @Extension(name = "x-imi-roles", properties = { @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaCercaProcedimentsRDTO cercaProcediments(
	        @ApiParam(value = "Indicar?? el n??mero de resultats per p??gina") @RequestParam(value = "resultatsPerPagina", required = false, defaultValue = "20") int resultatsPerPagina,
	        @ApiParam(value = "Indicar?? en quina p??gina hauria de comen??ar els resultats demanats en una cerca") @RequestParam(value = "numeroPagina", required = false, defaultValue = "1") int numeroPagina,
	        @ApiParam(value = "Indicar?? el camp mitjan??ant el qual s'ordenar?? el resultat de la cerca", allowableValues = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.OrdenarPerApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.OrdenarPerApiParamValueTranslator.REQUEST_PARAM_NAME, required = false, defaultValue = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.OrdenarPerApiParamValueTranslator.REQUEST_PARAM_DEFAULT_VALUE) String ordenarPer,
	        @ApiParam(value = "Indicar?? el sentit d'ordenaci?? per al resultat de la cerca", allowableValues = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.SentitOrdenacioApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.SentitOrdenacioApiParamValueTranslator.REQUEST_PARAM_NAME, required = false, defaultValue = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.SentitOrdenacioApiParamValueTranslator.REQUEST_PARAM_DEFAULT_VALUE) String sentitOrdenacio,
	        @ApiParam(value = "Filtra procediments per codi") @RequestParam(value = "codi", required = false) String codi,
	        @ApiParam(value = "Filtrar procediments per conjunt d'estats. Possibles valors: EN_ELABORACIO, FINALITZAT, PUBLICAT", allowableValues = EstatApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = EstatApiParamValueTranslator.REQUEST_PARAM_NAME, required = false) String[] estat,
	        @ApiParam(value = "Filtra procediments per nom") @RequestParam(value = "nom", required = false) String nom,
	        @ApiParam(value = "Filtra procediments per aplicaci?? de tramitaci??", allowableValues = TramitadorApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = TramitadorApiParamValueTranslator.REQUEST_PARAM_NAME, required = false) String tramitador,
	        @ApiParam(value = "En cas que el tramitador sigui una aplicaci?? de negoci, filtra procediments pel nom de dita aplicaci??") @RequestParam(value = "aplicacioNegoci", required = false) String aplicacioNegoci,
	        @ApiParam(value = "Filtra procediments per conjunt d'Unitats Gestores Responsables") @RequestParam(value = "ugr", required = false) String ugr,
	        @ApiParam(value = "Filtra procediments per exclusivament intern", allowableValues = ExclusivamentInternApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = ExclusivamentInternApiParamValueTranslator.REQUEST_PARAM_NAME, required = false) String exclusivamentIntern,
	        @ApiParam(value = "Filtra procediments per canals d'activaci?? en format electr??nic. Possibles valors: PORTAL_TRAMITS, ALTRA_WEB, MOBIL, QUIOSC, PER_CANAL_GENERALISTA, PER_CANAL_ESPECIFIC", allowableValues = ActivableEnFormatElectronicApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = ActivableEnFormatElectronicApiParamValueTranslator.REQUEST_PARAM_NAME, required = false) String[] activableFormatElectronic,
	        @ApiParam(value = "Filtra procediments per ??rgan resolutori") @RequestParam(value = "organResolutori", required = false) String organResolutori,
	        @ApiParam(value = "Filtrar procediments per conjunt de compet??ncies associades. Possibles valors: ACCIO_SOCIAL, AFERS_JURIDICS, BENS_I_PATRIMONI, COMERC_I_CONSUM, CULTURA, EDUCACIO, ESPORTS_I_LLEURE, HABITATGE, MEDI_AMBIENT, MOVILITAT_TRANSPORT_I_CIRCULACIO, OBRES_I_INFRAESTRUCTURES, ORGANITZACIO_I_COORDINACIO_ADMINISTRATIVA, ORGANS_DE_GOVERN, POBLACIO_I_DEMARCACIO, POTESTATS_DE_PLANIFICACIO_I_NORMATIVA, PRESSUPOSTOS_I_FINANCES, PROMOCIO_ECONOMICA, RECURSOS_HUMANS", allowableValues = CompetenciaAssociadaApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = CompetenciaAssociadaApiParamValueTranslator.REQUEST_PARAM_NAME, required = false) String[] competenciaAssociada,
	        @ApiParam(value = "Filtrar procediments per conjunt de fam??lies. Possibles valors: ATENCIO_SOCIAL_I_RESIDENCIAL, AUTORITZACIONS_I_COMUNICATS, CERTAMENS_I_PREMIS, COL_LABORACIO, CONSULTES_I_SUGGERIMENTS, CONTRACTACIO_PUBLICA, DISCIPLINA_INSPECCIO_I_PROTECCIO_DE_LA_LEGALITAT, DRETS_D_ACCES_A_LA_INFORMACIO, DRETS_I_ACTIVITAT_CIVIL, ENS_DEPENDENTS_I_PARTICIPATS, EXECUCIO_URBANISTICA, GESTIO_DEL_PERSONAL, GESTIO_PRESSUPOSTARIA_I_FINANCERA, GESTIO_TRIBUTARIA, INFORMES_I_CERTIFICATS, INSCRIPCIONS_REGISTRALS, MEDIACIO_I_ARBITRATGE, NORMATIVA, OCUPACIO_I_SERVEIS_A_LA_VIA_PUBLICA, PARTICIPACIO, PLANEJAMENT_URBANISTIC, PREVENCIO, QUEIXES_I_RECLAMACIONS, REGIM_DE_BENS_I_PATRIMONI, REGIM_SANCIONADOR, RESPONSABILITAT_PATRIMONIAL, REVISIO_DE_L_ACTUACIO_ADMINISTRATIVA, SUBVENCIONS_I_AJUTS, TARGETES_CARNETS_I_IDENTIFICACIONS, ALTRES", allowableValues = FamiliaApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = FamiliaApiParamValueTranslator.REQUEST_PARAM_NAME, required = false) String[] familia,
	        @ApiParam(value = "Filtra procediments per actuaci??") @RequestParam(value = "actuacio", required = false) String actuacio)
	        throws GPAServeisServiceException {
		if (log.isDebugEnabled()) {
			log.debug(
			        "cercaProcediments(int, int, String, String, String, String[], String, String, String, String, String, String[], String, String[], String[], String) - inici"); //$NON-NLS-1$
		}

		// TODO Acceso a la cabecera con la identificaci??n del usuario del
		// portal del ciudadano
		String usuariInteressat = clientEntity.getUsuariInteressat();
		if (log.isInfoEnabled()) {
			log.info("usuari-interessat header: " + usuariInteressat); //$NON-NLS-1$
		}

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaCercaProcedimentsRDTO resposta = new RespostaCercaProcedimentsRDTO();
		List<ProcedimentsCercaRDTO> procedimentsCercaRDTOList = new ArrayList<ProcedimentsCercaRDTO>();
		ProcedimentsCercaBDTO procedimentsCercaBDTO = null;
		try {
			// Data
			// Unitats Gestores que hacen match con el par??metro ugr
			UnitatsGestoresCercaBDTO unitatsGestoresCercaBDTO = new UnitatsGestoresCercaBDTO(ugr);
			List<UnitatsGestoresRDTO> unitatsGestoresRDTOList = serveisService.cercaUnitatsGestores(unitatsGestoresCercaBDTO);

			// Procediments que cumplen los criterios de b??squeda
			procedimentsCercaBDTO = new ProcedimentsCercaBDTO(codi, nom,
			        ProcedimentsApiParamToInternalMapper.getActivableFormatElectronicInternalValueList(activableFormatElectronic), actuacio,
			        ProcedimentsApiParamToInternalMapper.getTramitadorInternalValue(tramitador), aplicacioNegoci,
			        ProcedimentsApiParamToInternalMapper.getCompetenciaAssociadaInternalValueList(competenciaAssociada),
			        ProcedimentsApiParamToInternalMapper.getEstatInternalValueList(estat),
			        ProcedimentsApiParamToInternalMapper.getFamiliaInternalValueList(familia),
			        ProcedimentsApiParamToInternalMapper.getExclusivamentInternInternalValue(exclusivamentIntern), null,
			        //ProcedimentsApiParamToInternalMapper.getIdUnitatGestoraInternalValueList(unitatsGestoresRDTOList),
			        null,
			        Arrays.asList(Constants.INICIACIO_SOLLICITUD_INTERESSAT), numeroPagina, resultatsPerPagina,
			        ProcedimentsApiParamToInternalMapper.getOrdenarPerInternalValue(ordenarPer),
			        ProcedimentsApiParamToInternalMapper.getSentitOrdenacioInternalValue(sentitOrdenacio));

			RespostaProcedimentsCercaBDTO respostaProcedimentsCercaBDTO = serveisService.cercaProcediments(procedimentsCercaBDTO);

			for (DadesProcedimentBDTO dadesProcedimentBDTO : respostaProcedimentsCercaBDTO.getDadesProcedimentBDTOList()) {
				procedimentsCercaRDTOList.add(modelMapper.map(dadesProcedimentBDTO, ProcedimentsCercaRDTO.class));
			}
			resposta.setData(procedimentsCercaRDTOList);

			// Paginaci??
			resposta.setPaginacio(modelMapper.map(respostaProcedimentsCercaBDTO.getPaginationAttributes(), PaginacioRDTO.class));

		} catch (Exception e) {
			log.error(e.getMessage(), e);
			resultatAudit = "KO";
			ex = e;
			;
			throw e;
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/procediments");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Cerca de procediments");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, procedimentsCercaBDTO, resposta, ex);
		}

		if (log.isDebugEnabled()) {
			log.debug(
			        "cercaProcediments(int, int, String, String, String, String[], String, String, String, String, String, String[], String, String[], String[], String) - fi"); //$NON-NLS-1$
		}
		return resposta;
	}

	/**
	 * Consultar dades procediment.
	 *
	 * @param idProcediment
	 *            the id procediment
	 * @return the resposta consulta procediments RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping("/procediments/{idProcediment}")
	@ApiOperation(nickname = "consultarDadesProcedimentPortal", value = "Consultar les dades del procediment", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaConsultaProcedimentsRDTO consultarDadesProcediment(
	        @ApiParam(value = "Identificador del procediment", required = true) @PathVariable BigDecimal idProcediment)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaConsultaProcedimentsRDTO respostaConsultaProcedimentsRDTO = new RespostaConsultaProcedimentsRDTO();
		try {
			DadesProcedimentBDTO dadesProcedimentBDTO = serveisService.consultarDadesProcediment(idProcediment);
			// El id del Procedimiento debe ser v??lido
			if (dadesProcedimentBDTO.getProcedimentsRDTO() == null) {
				throw new GPAServeisServiceException(ErrorPrincipal.ERROR_PROCEDIMENTS_NOT_FOUND.getDescripcio());
				// TODO return 404
			}
			ProcedimentsConsultaRDTO procedimentsConsultaRDTO = modelMapper.map(dadesProcedimentBDTO, ProcedimentsConsultaRDTO.class);
			respostaConsultaProcedimentsRDTO.setProcediment(procedimentsConsultaRDTO);

		} catch (Exception e) {
			log.error(e.getMessage(), e);
			resultatAudit = "KO";
			ex = e;
			throw e;
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/procediments/" + idProcediment);
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Consultar les dades del procediment");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, null, respostaConsultaProcedimentsRDTO, ex);
		}
		return respostaConsultaProcedimentsRDTO;
	}
	
	/**
	 * Consultar dades procediment.
	 *
	 * @param idProcediment
	 *            the id procediment
	 * @return the resposta consulta procediments RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping("/procediments/{codiProcediment}/darreraVersio")
	@ApiOperation(nickname = "consultarDadesProcedimentPortalDarreraVersion", value = "Consultar les dades del procediment", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaConsultaProcedimentsRDTO consultarDadesProcedimentDarreraVersion(
	        @ApiParam(value = "Codi del procediment", required = true) @PathVariable String codiProcediment)
	        throws GPAServeisServiceException {
		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaConsultaProcedimentsRDTO respostaConsultaProcedimentsRDTO = new RespostaConsultaProcedimentsRDTO();
		try {
			DadesProcedimentBDTO dadesProcedimentBDTO = serveisService.consultarDadesProcediment(codiProcediment);
		
			// El id del Procedimiento debe ser v??lido
			if (dadesProcedimentBDTO.getProcedimentsRDTO() == null) {
				throw new GPAServeisServiceException(ErrorPrincipal.ERROR_PROCEDIMENTS_NOT_FOUND.getDescripcio());
				// TODO return 404
			}
			ProcedimentsConsultaRDTO procedimentsConsultaRDTO = modelMapper.map(dadesProcedimentBDTO, ProcedimentsConsultaRDTO.class);
			respostaConsultaProcedimentsRDTO.setProcediment(procedimentsConsultaRDTO);

			} catch (Exception e) {
				log.error(e.getMessage(), e);
				resultatAudit = "KO";
				ex = e;
				throw e;
			} finally {
				AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();
	
				auditServeisBDTO.setMappingAccio("/procediments/" + codiProcediment);
				auditServeisBDTO.setResultat(resultatAudit);
				auditServeisBDTO.setTipusPeticio("GET");
				auditServeisBDTO.setValueAccio("Consultar les dades del procediment");
	
				auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, null, respostaConsultaProcedimentsRDTO, ex);
			}
		return respostaConsultaProcedimentsRDTO;
	}

	/**
	 * Consultar dades operacio procediment.
	 *
	 * @param idProcediment
	 *            the id procediment
	 * @param codiTramit
	 *            the codi tramit
	 * @return the resposta consulta dades operacio RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping("/procediments/{idProcediment}/tramits/{codiTramit}/atributs")
	@ApiOperation(nickname = "consultarDadesOperacioTramitPortal", value = "Consultar les dades d'operaci?? del tr??mit", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaConsultaDadesOperacioRDTO consultarDadesOperacioTramit(
	        @ApiParam(value = "Identificador del procediment", required = true) @PathVariable BigDecimal idProcediment,
	        @ApiParam(value = "Codi del tr??mit", allowableValues = TramitOvtApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES, required = true) @PathVariable String codiTramit)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaConsultaDadesOperacioRDTO respostaConsultaDadesOperacioRDTO = new RespostaConsultaDadesOperacioRDTO();
		DadesOperacioConsultaRDTO dadesOperacioConsultaRDTO = new DadesOperacioConsultaRDTO();

		try {
			// El id del Procedimiento debe ser v??lido
			DadesProcedimentBDTO dadesProcedimentBDTO = serveisService.consultarDadesProcediment(idProcediment);
			if (dadesProcedimentBDTO.getProcedimentsRDTO() == null) {
				throw new GPAServeisServiceException(ErrorPrincipal.ERROR_PROCEDIMENTS_NOT_FOUND.getDescripcio());
			}

			// Informaci??n del Tr??mite
			TramitsOvtCercaBDTO tramitsOvtCercaBDTO = new TramitsOvtCercaBDTO(
			        DadesOperacioApiParamToInternalMapper.getTramitOvtInternalValue(codiTramit));
			es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.TramitsOvtRDTO internalTramitsOvtRDTO = serveisService
			        .consultarDadesTramitOvt(tramitsOvtCercaBDTO);
			es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO tramitsOvtRDTO = modelMapper
			        .map(internalTramitsOvtRDTO, es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO.class);
			respostaConsultaDadesOperacioRDTO.setTramit(tramitsOvtRDTO);
			
			//Recuperamos la configuraci??n de documentaci??n de entrada del procedimiento
			DocumentsEntradaCercaBDTO documentsEntradaCercaBDTO = new DocumentsEntradaCercaBDTO(
					dadesProcedimentBDTO.getProcedimentsRDTO().getConfiguracioDocumentacio(), null);
			RespostaDocumentsEntradaCercaBDTO respostaDocumentsEntradaCercaBDTO = serveisService
			        .cercaConfiguracioDocumentacioEntrada(documentsEntradaCercaBDTO);			

			// Dades Operacio que cumplen los criterios de b??squeda
			DadesOperacioCercaBDTO dadesOperacioCercaBDTO = new DadesOperacioCercaBDTO(idProcediment,
			        DadesOperacioApiParamToInternalMapper.getTramitOvtInternalValue(codiTramit));
			RespostaDadesOperacioCercaBDTO respostaDadesOperacioCercaBDTO = serveisService.cercaDadesOperacio(dadesOperacioCercaBDTO);
			respostaDadesOperacioCercaBDTO.setConfiguracioDocsEntradaRDTOList(respostaDocumentsEntradaCercaBDTO.getConfiguracioDocsEntradaRDTOList());
			dadesOperacioConsultaRDTO = modelMapper.map(respostaDadesOperacioCercaBDTO, DadesOperacioConsultaRDTO.class);			
			
			respostaConsultaDadesOperacioRDTO.setDadesOperacio(dadesOperacioConsultaRDTO);

		} catch (Exception e) {
			log.error(e.getMessage(), e);
			resultatAudit = "KO";
			ex = e;
			throw e;
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/procediments/" + idProcediment + "/tramits/" + codiTramit + "/atributs");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Consultar les dades d'operaci?? del tr??mit");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, null, respostaConsultaDadesOperacioRDTO, ex);
		}
		return respostaConsultaDadesOperacioRDTO;
	}

	/**
	 * Consultar documentacio entrada procediment.
	 *
	 * @param idProcediment
	 *            the id procediment
	 * @param codiTramit
	 *            the codi tramit
	 * @return the resposta consulta configuracio documentacio aportada RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping("/procediments/{idProcediment}/tramits/{codiTramit}/documentacio")
	@ApiOperation(nickname = "consultarDocumentacioEntradaProcedimentPortal", value = "Consultar les dades de documentaci?? d'entrada del procediment", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaConsultaConfiguracioDocumentacioAportadaRDTO consultarDocumentacioEntradaProcediment(
	        @ApiParam(value = "Identificador del procediment", required = true) @PathVariable BigDecimal idProcediment,
	        @ApiParam(value = "Codi del tr??mit", allowableValues = TramitOvtApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES, required = true) @PathVariable String codiTramit)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaConsultaConfiguracioDocumentacioAportadaRDTO respostaConsultaConfiguracioDocumentacioAportadaRDTO = new RespostaConsultaConfiguracioDocumentacioAportadaRDTO();
		try {
			// El id del Procedimiento debe ser v??lido
			// Informaci??n del Procedimiento, para obtener el Id de Configuraci??
			// Documentaci??
			DadesProcedimentBDTO dadesProcedimentBDTO = serveisService.consultarDadesProcediment(idProcediment);
			if (dadesProcedimentBDTO.getProcedimentsRDTO() == null) {
				throw new GPAServeisServiceException(ErrorPrincipal.ERROR_PROCEDIMENTS_NOT_FOUND.getDescripcio());
			}

			// Informaci??n del Tr??mite
			TramitsOvtCercaBDTO tramitsOvtCercaBDTO = new TramitsOvtCercaBDTO(
			        DocumentsApiParamToInternalMapper.getTramitOvtInternalValue(codiTramit));
			es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.TramitsOvtRDTO internalTramitsOvtRDTO = serveisService
			        .consultarDadesTramitOvt(tramitsOvtCercaBDTO);
			es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO tramitsOvtRDTO = modelMapper
			        .map(internalTramitsOvtRDTO, es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO.class);
			respostaConsultaConfiguracioDocumentacioAportadaRDTO.setTramit(tramitsOvtRDTO);

			// Documents que cumplen los criterios de b??squeda
			DocumentsEntradaCercaBDTO documentsEntradaCercaBDTO = new DocumentsEntradaCercaBDTO(
			        dadesProcedimentBDTO.getProcedimentsRDTO().getConfiguracioDocumentacio(),
			        DocumentsApiParamToInternalMapper.getTramitOvtInternalValue(codiTramit));
			RespostaDocumentsEntradaCercaBDTO respostaDocumentsEntradaCercaBDTO = serveisService
			        .cercaConfiguracioDocumentacioEntradaPerTramitOvt(documentsEntradaCercaBDTO);
			// TODO Necesario pasar a la conversi??n el conjunto de
			// confdocsentEstatsExpList de la Configuraci??n Documentaci??n
			// Entrada
			ArrayList<ConfiguracioDocumentacioAportadaConsultaRDTO> configuracioDocumentacioAportadaConsultaRDTOList = new ArrayList<ConfiguracioDocumentacioAportadaConsultaRDTO>();
			for (ConfiguracioDocsEntradaRDTO configuracioDocsEntradaRDTO : respostaDocumentsEntradaCercaBDTO
			        .getConfiguracioDocsEntradaRDTOList()) {
				configuracioDocumentacioAportadaConsultaRDTOList
				        .add(modelMapper.map(configuracioDocsEntradaRDTO, ConfiguracioDocumentacioAportadaConsultaRDTO.class));
			}
			respostaConsultaConfiguracioDocumentacioAportadaRDTO
			        .setConfiguracioDocumentacioAportada(configuracioDocumentacioAportadaConsultaRDTOList);

		} catch (Exception e) {
			log.error(e.getMessage(), e);
			resultatAudit = "KO";
			ex = e;
			throw e;
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/procediments/" + idProcediment + "/tramits/" + codiTramit + "/documentacio");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Consultar les dades de documentaci?? d'entrada del procediment");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, null, respostaConsultaConfiguracioDocumentacioAportadaRDTO,
			        ex);
		}
		return respostaConsultaConfiguracioDocumentacioAportadaRDTO;
	}

	/**
	 * Cerca expedients.
	 *
	 * @param resultatsPerPagina
	 *            the resultats per pagina
	 * @param numeroPagina
	 *            the numero pagina
	 * @param ordenarPer
	 *            the ordenar per
	 * @param sentitOrdenacio
	 *            the sentit ordenacio
	 * @param codiExpedient
	 *            the codi expedient
	 * @param nifSollicitant
	 *            the nif sollicitant
	 * @param dataPresentacioInici
	 *            the data presentacio inici
	 * @param dataPresentacioFi
	 *            the data presentacio fi
	 * @param codiProcediment
	 *            the codi procediment
	 * @param versioProcediment
	 *            the versio procediment
	 * @param estat
	 *            the estat
	 * @param unitatGestora
	 *            the unitat gestora
	 * @param tramitador
	 *            the tramitador
	 * @param aplicacioNegoci
	 *            the aplicacio negoci
	 * @return the resposta cerca expedients RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping("/expedients")
	@ApiOperation(nickname = "cercaExpedientsPortal", value = "Cerca d'expedients", tags = { "Serveis Portal API" }, extensions = {
	        @Extension(name = "x-imi-roles", properties = { @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaCercaExpedientsRDTO cercaExpedients(
	        @ApiParam(value = "Indicar?? el n??mero de resultats per p??gina") @RequestParam(value = "resultatsPerPagina", required = false, defaultValue = "20") int resultatsPerPagina,
	        @ApiParam(value = "Indicar?? en quina p??gina hauria de comen??ar els resultats demanats en una cerca") @RequestParam(value = "numeroPagina", required = false, defaultValue = "1") int numeroPagina,
	        @ApiParam(value = "Indicar?? el camp mitjan??ant el qual s'ordenar?? el resultat de la cerca", allowableValues = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.OrdenarPerApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.OrdenarPerApiParamValueTranslator.REQUEST_PARAM_NAME, required = false, defaultValue = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.OrdenarPerApiParamValueTranslator.REQUEST_PARAM_DEFAULT_VALUE) String ordenarPer,
	        @ApiParam(value = "Indicar?? el sentit d'ordenaci?? per al resultat de la cerca", allowableValues = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.SentitOrdenacioApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.SentitOrdenacioApiParamValueTranslator.REQUEST_PARAM_NAME, required = false, defaultValue = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.SentitOrdenacioApiParamValueTranslator.REQUEST_PARAM_DEFAULT_VALUE) String sentitOrdenacio,
	        @ApiParam(value = "Filtra expedients per codi") @RequestParam(value = "codiExpedient", required = false) String codiExpedient,
	        @ApiParam(value = "Filtra expedients per sollicitant") @RequestParam(value = "nifSollicitant", required = false) String nifSollicitant,
	        @ApiParam(value = "Filtra expedients per data de presentaci?? (format dd/MM/aaaa)") @RequestParam(value = "dataPresentacioInici", required = false) @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.DATE_PATTERN) String dataPresentacioInici,
	        @ApiParam(value = "Filtra expedients per data de presentaci?? (format dd/MM/aaaa)") @RequestParam(value = "dataPresentacioFi", required = false) @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.DATE_PATTERN) String dataPresentacioFi,
	        @ApiParam(value = "Filtra expedients per un conjunt de codis de procediment") @RequestParam(value = "codiProcediment", required = false) String[] codiProcediment,
	        @ApiParam(value = "En cas que s'indiqui codi de procediment, filtra expedients per versi?? de procediment", allowableValues = VersioProcedimentApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = VersioProcedimentApiParamValueTranslator.REQUEST_PARAM_NAME, required = false, defaultValue = VersioProcedimentApiParamValueTranslator.REQUEST_PARAM_DEFAULT_VALUE) String versioProcediment,
	        @ApiParam(value = "Filtra expedients per conjunt d'estats. Possibles valors: ESBORRANY, EN_CURS, PENDENT_ESMENES, PENDENT_ALEGACIONS, RESOLT, TANCAT", allowableValues = EstatCiutadaApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = EstatCiutadaApiParamValueTranslator.REQUEST_PARAM_NAME, required = false) String[] estat,
	        @ApiParam(value = "Filtra expedients per Unitat Gestora") @RequestParam(value = "unitatGestora", required = false) String unitatGestora,
	        @ApiParam(value = "Filtra procediments per aplicaci?? de tramitaci??", allowableValues = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.TramitadorApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.TramitadorApiParamValueTranslator.REQUEST_PARAM_NAME, required = false) String tramitador,
	        @ApiParam(value = "En cas que el tramitador sigui una aplicaci?? de negoci, filtra procediments pel nom de dita aplicaci??") @RequestParam(value = "aplicacioNegoci", required = false) String aplicacioNegoci,
	        @ApiParam(value = "Filtra els expedients amb un nivell d'autenticaci?? menor o igual", allowableValues = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.NivellAutenticacioApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @RequestParam(value = es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.NivellAutenticacioApiParamValueTranslator.REQUEST_PARAM_NAME, required = false) String nivellAutenticacio,
	        @ApiParam(value = "Filtra els expedients amb n??mero registre") @RequestParam(value = "numeroRegistre", required = false) String numeroRegistre)
	        throws GPAServeisServiceException {
		if (log.isDebugEnabled()) {
			log.debug(
			        "cercaExpedients(int, int, String, String, String, String, String, String, String[], String, String[], String, String, String) - inici"); //$NON-NLS-1$
		}

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaCercaExpedientsRDTO resposta = new RespostaCercaExpedientsRDTO();
		List<ExpedientsCercaRDTO> expedientsCercaRDTOList = new ArrayList<ExpedientsCercaRDTO>();
		ExpedientsCercaBDTO expedientsCercaBDTO = null;
		try {

			// Acceso a la cabecera con la identificaci??n del usuario del
			// portal del ciudadano
			String usuariInteressat = clientEntity.getUsuariInteressat();

			// Data
			// Unitats Gestores que hacen match con el par??metro unitatGestora
			UnitatsGestoresCercaBDTO unitatsGestoresCercaBDTO = new UnitatsGestoresCercaBDTO(unitatGestora);
			List<UnitatsGestoresRDTO> unitatsGestoresRDTOList = serveisService.cercaUnitatsGestores(unitatsGestoresCercaBDTO);

			// Expedients que cumplen los criterios de b??squeda
			expedientsCercaBDTO = new ExpedientsCercaBDTO(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan), nifSollicitant, null,
			        dataPresentacioInici, dataPresentacioFi,
			        ExpedientsApiParamToInternalMapper.getCodiProcedimentInternalValueList(codiProcediment),
			        ExpedientsApiParamToInternalMapper.getVersioProcedimentInternalValue(versioProcediment),
			        ExpedientsApiParamToInternalMapper.getEstatCiutadaInternalValueList(estat),
			        ExpedientsApiParamToInternalMapper.getIdUnitatGestoraInternalValueList(unitatsGestoresRDTOList),
			        ExpedientsApiParamToInternalMapper.getTramitadorInternalValue(tramitador), aplicacioNegoci, numeroPagina,
			        resultatsPerPagina, ExpedientsApiParamToInternalMapper.getOrdenarPerInternalValue(ordenarPer),
			        ExpedientsApiParamToInternalMapper.getSentitOrdenacioInternalValue(sentitOrdenacio),
			        ExpedientsApiParamToInternalMapper.getNivellAutenticacioInternalValue(nivellAutenticacio), usuariInteressat,
			        ExpedientsApiParamToInternalMapper.getNumeroRegistre(numeroRegistre));

			RespostaExpedientsCercaBDTO respostaExpedientsCercaBDTO = serveisService.cercaExpedients(expedientsCercaBDTO);

			for (DadesExpedientBDTO dadesExpedientBDTO : respostaExpedientsCercaBDTO.getDadesExpedientBDTOList()) {
				expedientsCercaRDTOList.add(modelMapper.map(dadesExpedientBDTO, ExpedientsCercaRDTO.class));
			}
			resposta.setData(expedientsCercaRDTOList);

			// Paginaci??
			resposta.setPaginacio(modelMapper.map(respostaExpedientsCercaBDTO.getPaginationAttributes(), PaginacioRDTO.class));

		} catch (Exception e) {
			log.error(e.getMessage(), e);
			resultatAudit = "KO";
			ex = e;
			;
			throw e;
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Cerca d'expedients");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, expedientsCercaBDTO, resposta, ex);
		}

		if (log.isDebugEnabled()) {
			log.debug(
			        "cercaExpedients(int, int, String, String, String, String, String, String, String[], String, String[], String, String, String) - fi"); //$NON-NLS-1$
		}
		return resposta;
	}

	/**
	 * Consultar dades expedient.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @return the resposta consulta expedients RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping("/expedients/{codiExpedient}")
	@ApiOperation(nickname = "consultarDadesExpedientPortal", value = "Consultar les dades de l'expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaConsultaExpedientsRDTO consultarDadesExpedient(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaConsultaExpedientsRDTO respostaConsultaExpedientsRDTO = new RespostaConsultaExpedientsRDTO();

		BigDecimal visibilitat = BigDecimal.ONE;

		try {
			visibilitat = ServeisRestControllerVisibilitatHelper.obtenirVisibilitatExpedient(clientEntity, serveisService, codiExpedient,
			        expedientsIdOrgan, Resultat.ERROR_CONSULTAR_EXPEDIENT);
		} catch (GPAApiParamValidationException e) {
			log.error("consultarDadesExpedient(String)", e); //$NON-NLS-1$
			throw new GPAServeisServiceException(
			        e.getErrorPrincipal() != null ? e.getErrorPrincipal().getDescripcio() : e.getResultat().getDescripcio());
		} catch (Exception e) {
			log.error("consultarDadesExpedient(String)", e); //$NON-NLS-1$
			throw new GPAServeisServiceException(e.getMessage());
		}

		try {
			// Datos principales del expedient
			DadesExpedientBDTO dadesExpedientBDTO = serveisService.consultarDadesExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan), visibilitat);
				
			// El c??digo del expediente debe ser v??lido
			if (dadesExpedientBDTO.getExpedientsRDTO() == null) {
				throw new GPAServeisServiceException(ErrorPrincipal.ERROR_EXPEDIENTS_NOT_FOUND.getDescripcio());
			}

			ExpedientConsultaRDTO expedientConsultaRDTO = modelMapper.map(dadesExpedientBDTO, ExpedientConsultaRDTO.class);

			// Datos de cada tr??mit OVT asociado a los documents aportats
			HashMap<String, es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO> tramitsOvtRDTOMap = null;
			es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO tramitsOvtRDTO = null;
			if (MapUtils.isNotEmpty(dadesExpedientBDTO.getTramitsOvtMap())) {
				tramitsOvtRDTOMap = new HashMap<String, es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO>();
				for (Entry<BigDecimal, TramitsOvtRDTO> tramitsOvtRDTOEntry : dadesExpedientBDTO.getTramitsOvtMap().entrySet()) {
					tramitsOvtRDTO = modelMapper.map(tramitsOvtRDTOEntry.getValue(),
					        es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO.class);
					tramitsOvtRDTOMap.put(tramitsOvtRDTO.getCodi(), tramitsOvtRDTO);
				}
				if (CollectionUtils.isNotEmpty(expedientConsultaRDTO.getDocumentsAportats()) && MapUtils.isNotEmpty(tramitsOvtRDTOMap)) {
					for (DocumentAportatConsultaRDTO documentAportatConsultaRDTO : expedientConsultaRDTO.getDocumentsAportats()) {
						if (documentAportatConsultaRDTO.getTramit() != null) {
							documentAportatConsultaRDTO.setTramit(tramitsOvtRDTOMap.get(documentAportatConsultaRDTO.getTramit().getCodi()));
						}
					}
				}
			}

			// no se mostraran las acciones disponibles para el estado en
			// preparacion desde portal
			if (dadesExpedientBDTO.getExpedientsRDTO() != null && dadesExpedientBDTO.getExpedientsRDTO().getIdEstat()
			        .compareTo(EstatTramitadorApiParamValue.EN_PREPARACIO.getInternalValue()) == NumberUtils.INTEGER_ZERO) {
				expedientConsultaRDTO.setAccionsDisponibles(null);
			}

			// Filtraremos para segun los tramites ovt disponibles del
			// procedimiento, mostrar las acciones disponibles
			if (CollectionUtils.isNotEmpty(expedientConsultaRDTO.getAccionsDisponibles())) {
				filtrarTramitsOvtDisponibles(dadesExpedientBDTO, expedientConsultaRDTO);
			}

			// Devolvemos el id en gestor documental del expediente en la consulta
			if (StringUtils.isNotEmpty(dadesExpedientBDTO.getExpedientsRDTO().getCodiLlarg())) {
				expedientConsultaRDTO.setIdGestorDocumental(dadesExpedientBDTO.getExpedientsRDTO().getCodiLlarg());
			}
			
			if (dadesExpedientBDTO.getExpedientsRDTO().getIdiomes() != null
			        && StringUtils.isNotEmpty(dadesExpedientBDTO.getExpedientsRDTO().getIdiomes().getDescripcio())) {
				expedientConsultaRDTO.setIdioma(dadesExpedientBDTO.getExpedientsRDTO().getIdiomes().getDescripcio());
			}

			if (dadesExpedientBDTO.getExpedientsRDTO().getEstat().getTancamentAutomatic() != null
			        && NumberUtils.INTEGER_ONE.equals(dadesExpedientBDTO.getExpedientsRDTO().getEstat().getTancamentAutomatic())) {
				expedientConsultaRDTO.setTancamentAutomatic(true);
			}
			if(expedientConsultaRDTO.getAccionsDisponibles() != null){
				if(expedientConsultaRDTO.getAccionsDisponibles().contains(AccioCiutadaApiParamValue.PRESENTAR_RECURSO.getApiParamValue())){
					List<ProcedimentsRDTO> procRelacionats = serveisService.consultarProcedimentsRelacionats(expedientConsultaRDTO.getProcediment().getId());
					if(CollectionUtils.isEmpty(procRelacionats)){
						expedientConsultaRDTO.getAccionsDisponibles().remove(AccioCiutadaApiParamValue.PRESENTAR_RECURSO.getApiParamValue());
					}
				}
			}
			
			expedientConsultaRDTO.setRol(consultarElRolDUsuariInteressat(dadesExpedientBDTO));
			respostaConsultaExpedientsRDTO.setExpedient(expedientConsultaRDTO);

		} catch (Exception e) {
			log.error(e.getMessage(), e);
			resultatAudit = "KO";
			ex = e;
			throw e;
		} finally {

			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient);
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Consultar les dades de l'expedient");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, null, respostaConsultaExpedientsRDTO, ex);
		}

		return respostaConsultaExpedientsRDTO;
	}
	
	private String consultarElRolDUsuariInteressat(DadesExpedientBDTO dadesExpedientBDTO){
		String usuarioInteressatPortal = null;
		HttpServletRequest serveltrequest = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		if (serveltrequest.getHeader("usuari-interessat") != null) {
			usuarioInteressatPortal = (String) serveltrequest.getHeader("usuari-interessat");
		}
		if(dadesExpedientBDTO.getRepresentant()!=null && dadesExpedientBDTO.getRepresentant().getDocumentsIdentitat()!=null){
			if(StringUtils.equals(dadesExpedientBDTO.getRepresentant().getDocumentsIdentitat().getNumeroDocument(),usuarioInteressatPortal)){
				return Constants.REPRESENTANT_PERSONE;
			}
		}
		if(dadesExpedientBDTO.getSollicitant()!=null && dadesExpedientBDTO.getSollicitant().getDocumentsIdentitat()!=null){
			if(StringUtils.equals(dadesExpedientBDTO.getSollicitant().getDocumentsIdentitat().getNumeroDocument(),usuarioInteressatPortal)){
				return Constants.SOLLICITANT_PERSONE;
			}
		}
		if(!dadesExpedientBDTO.getPersonesImplicades().isEmpty()){
			for(PersonesSollicitudRDTO persone : dadesExpedientBDTO.getPersonesImplicades()){
				if(StringUtils.equals(persone.getNumeroDocument(),usuarioInteressatPortal)){
					return persone.getRelacioImplicada();
				}
			}
		}
		if(!dadesExpedientBDTO.getPersonesInteressades().isEmpty()){
			for(PersonesSollicitudRDTO persone : dadesExpedientBDTO.getPersonesInteressades()){
				if(StringUtils.equals(persone.getNumeroDocument(),usuarioInteressatPortal)){
					return persone.getRelacioImplicada();
				}
			}
		}
		return null;
	}

	/**
	 * Exportar dades expedient xml.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @return the response entity
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping(value = "/expedients/{codiExpedient}/report/exportacio-xml", produces = MediaType.TEXT_PLAIN_VALUE)
	@ApiOperation(nickname = "exportarDadesExpedientXmlPortal", value = "Exporta les dades de l'expedient en format XML", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public ResponseEntity<String> exportarDadesExpedientXml(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		Throwable ex = null;

		BigDecimal visibilitat = BigDecimal.ONE;
		String dadesXmlBase64 = null;

		try {
			visibilitat = ServeisRestControllerVisibilitatHelper.obtenirVisibilitatExpedient(clientEntity, serveisService, codiExpedient,
			        expedientsIdOrgan, Resultat.ERROR_CONSULTAR_EXPEDIENT);
		} catch (GPAApiParamValidationException e) {
			log.error("consultarDadesExpedient(String)", e); //$NON-NLS-1$
			throw new GPAServeisServiceException(
			        e.getErrorPrincipal() != null ? e.getErrorPrincipal().getDescripcio() : e.getResultat().getDescripcio());
		} catch (Exception e) {
			log.error("consultarDadesExpedient(String)", e); //$NON-NLS-1$
			throw new GPAServeisServiceException(e.getMessage());
		}
		try {
			// Datos principales del expedient
			DadesExpedientBDTO dadesExpedientBDTO = serveisService.consultarDadesExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan), visibilitat);
			// El c??digo del expediente debe ser v??lido
			if (dadesExpedientBDTO.getExpedientsRDTO() == null) {
				throw new GPAServeisServiceException(ErrorPrincipal.ERROR_EXPEDIENTS_NOT_FOUND.getDescripcio());
			}

			// Llamada a la operaci??n de exportaci??n a XML de los datos del
			// expediente
			// De acuerdo a la incorporaci??n de las Accions Posteriors se
			// engancha esta llamada con la obtenci??n del XML de la Solicitud
			// (en
			// este caso ser?? la del tr??mite SOL)

			// Datos principales de la solicitud SOL
			DadesSollicitudBDTO dadesSollicitudBDTO = serveisService
			        .consultarDadesSollicitud(dadesExpedientBDTO.getExpedientsRDTO().getSollicitud(), visibilitat);

			SollicitudConsultaRDTO sollicitudConsultaRDTO = modelMapper.map(dadesSollicitudBDTO, SollicitudConsultaRDTO.class);

			dadesXmlBase64 = serveisService.crearXmlDadesSollicitud(sollicitudConsultaRDTO);

		} catch (Exception e) {
			log.error(e.getMessage(), e);
			resultatAudit = "KO";
			ex = e;
			throw e;
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient + "/report/exportacio-xml");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Exporta les dades de l'expedient en format XML");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, null,
			        new ResponseEntity<String>(dadesXmlBase64, HttpStatus.OK), ex);
		}
		return new ResponseEntity<String>(dadesXmlBase64, HttpStatus.OK);
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
	@GetMapping(value = "/expedients/{codiExpedient}/documents/{idDocument}", produces = "*/*")
	@ApiOperation(nickname = "descarregarDocumentExpedientPortal", value = "Descarregar document de l'expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public ResponseEntity<byte[]> descarregarDocumentExpedient(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Identificador del document", required = true) @PathVariable BigDecimal idDocument)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		Throwable ex = null;

		ResponseEntity<byte[]> resposta = null;

		try {
			// IMPORTANTE: Para permitir la descarga del Comprovant de registro
			// se da soporte tambi??n para documentos de tramitaci??n en este caso
			DocsEntradaRDTO docsEntradaRDTO = null;
			DocsTramitacioRDTO docsTramitacioRDTO = null;

			// El codi del expediente debe existir
			DadesExpedientBDTO dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO, Resultat.ERROR_DESCARREGAR_DOCUMENT);

			docsEntradaRDTO = serveisService.consultarDadesDocumentAportat(idDocument);
			docsTramitacioRDTO = serveisService.consultarDadesDocumentGenerat(idDocument);

			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			// recogemos los dades operacio que se quieren actualizar para
			// validad su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersones(clientEntity, serveisService, null, null,
			        docsEntradaRDTO, docsTramitacioRDTO, dadesExpedientBDTO, null, Resultat.ERROR_DESCARREGAR_DOCUMENT);

			// El id del documento debe existir y pertenecer al expediente
			// indicado
			DocsRDTO docsRDTO = serveisService.consultarDadesDocument(idDocument);
			ServeisRestControllerValidationHelper.validateDocument(docsRDTO, dadesExpedientBDTO.getExpedientsRDTO(),
			        Resultat.ERROR_DESCARREGAR_DOCUMENT);

			// Se construye el modelo para la llamada a la operaci??n de
			// descarregar document
			DescarregarDocumentExpedientBDTO descarregarDocumentExpedientBDTO = new DescarregarDocumentExpedientBDTO(
			        dadesExpedientBDTO.getExpedientsRDTO().getId(), idDocument);
			byte[] result = serveisService.descarregarDocumentExpedient(descarregarDocumentExpedientBDTO);

			HttpHeaders headers = new HttpHeaders();
			headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
			headers.add("Pragma", "no-cache");
			headers.add("Expires", "0");
			headers.add("Content-Length", String.valueOf(result.length));
			headers.add("Content-Type", MediaType.APPLICATION_OCTET_STREAM_VALUE);
			String filename = docsRDTO.getDocsFisics().getNom();
			headers.add("Content-Disposition", "attachment; filename=\"" + filename + "\"");

			resposta = new ResponseEntity<byte[]>(result, headers, HttpStatus.OK);

		} catch (GPAApiParamValidationException e) {
			log.error("descarregarDocumentExpedient(String, BigDecimal)", e); //$NON-NLS-1$ type
			resposta = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
			resultatAudit = "KO";
			ex = e;
		} catch (Exception e) {
			log.error("descarregarDocumentExpedient(String, BigDecimal)", e); //$NON-NLS-1$
			resposta = new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
			resultatAudit = "KO";
			ex = e;
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient + "/documents/" + idDocument);
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Descarregar document de l'expedient");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, null, resposta, ex);
		}
		return resposta;
	}

	/**
	 * Crear solicitud expedient.
	 *
	 * @param solicitudExpedient
	 *            the solicitud expedient
	 * @return the resposta crear expedient RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@PostMapping("/expedients")
	@ApiOperation(nickname = "crearSolicitudExpedientPortal", value = "Crear una sol??licitud d'un expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaCrearExpedientRDTO crearSolicitudExpedient(
	        @ApiParam(value = "Dades de la creaci?? de l'expedient") @RequestBody ExpedientCrearRDTO solicitudExpedient)
	        throws GPAServeisServiceException {
		if (log.isDebugEnabled()) {
			log.debug("crearSolicitudExpedient(ExpedientCrearRDTO) - inici"); //$NON-NLS-1$
		}

		String resultatAudit = "OK";
		Throwable ex = null;
		
		// TODO Acceso a la cabecera con la identificaci??n del usuario del
		// portal del ciudadano
		String usuariInteressat = clientEntity.getUsuariInteressat();
		if (log.isInfoEnabled()) {
			log.info("usuari-interessat header: " + usuariInteressat); //$NON-NLS-1$
		}

		RespostaCrearExpedientRDTO respostaCrearSolicitudsRDTO = null;
		ExpedientsRDTO returnExpedientsRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_CREAR_EXPEDIENT);
		DadesExpedientBDTO dadesExpedientBDTO = null;
		RespostaExpedientsCrearBDTO respostaExpedientsCrearBDTO = null;
		try {
			// El id del procedimiento debe existir y el procedimiento debe
			// encontrarse en estado Publicat
			DadesProcedimentBDTO dadesProcedimentBDTO = serveisService
			        .consultarDadesBasiquesProcediment(solicitudExpedient.getProcediment().getId());
			ServeisRestControllerValidationHelper.validateProcedimentCrearSolicitudExpedient(dadesProcedimentBDTO);
			
			if(StringUtils.isNotEmpty(solicitudExpedient.getCodiExpedientOrigen())){
				// El codi del expediente debe existir
				dadesExpedientBDTO = serveisService.consultarDadesBasiquesExpedient(solicitudExpedient.getCodiExpedientOrigen());
				ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO, Resultat.ERROR_RECURS_EXPEDIENT);
				
				// La acci??n debe estar disponible: estats posibles [Finalizat y
				// comunicat, tancat]
				ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
				        AccioTramitadorApiParamValue.PRESENTAR_RECURS, Resultat.ERROR_RECURS_EXPEDIENT);
			}
			

			// Si se indica alguna persona al menos debe indicarse el
			// Solicitante
			ServeisRestControllerValidationHelper.validateSollicitantCrearSolicitudExpedient(solicitudExpedient.getSollicitant(),
			        Resultat.ERROR_CREAR_EXPEDIENT);

			// se valida que si la relacion es de persona interesada, solo
			// permita valores sollicitant y representant
			ServeisRestControllerValidationHelper.validatePersonesInteressadesExpedient(solicitudExpedient.getPersonesInteressades(),
			        Resultat.ERROR_CREAR_EXPEDIENT);

			// 1 - validar que la persona logueada esta dentro de los
			// interesados
			// 2 - validar que si hay lista de implicados, tengan
			// relacioTerceraPersona y coincida alguna definida en el
			// procedimiento
			ServeisRestControllerValidationHelper.validateUsuariLogueadoInteressadesExpedient(clientEntity, dadesProcedimentBDTO,
			        solicitudExpedient.getPersonesInteressades(), solicitudExpedient.getPersonesImplicades(),
			        solicitudExpedient.getSollicitant(), solicitudExpedient.getRepresentant(),
			        TramitOvtApiParamValue.SOL.getInternalValue(), Resultat.ERROR_CREAR_EXPEDIENT);

			// El codi de la unitat gestora, opcional, debe existir y estar
			// vigente
			BigDecimal idUnitatGestora = null;
			if (solicitudExpedient.getUnitatGestora() != null) {
				UnitatsGestoresCercaBDTO unitatsGestoresCercaBDTO = new UnitatsGestoresCercaBDTO(
				        solicitudExpedient.getUnitatGestora().getCodi());
				UnitatsGestoresRDTO unitatsGestoresRDTO = serveisService.consultarDadesUnitatGestora(unitatsGestoresCercaBDTO);
				ServeisRestControllerValidationHelper.validateUnitatGestora(unitatsGestoresRDTO, dadesProcedimentBDTO,
				        Resultat.ERROR_CREAR_EXPEDIENT);
				idUnitatGestora = unitatsGestoresRDTO.getId();
			} else {
				// Si no se indica, se establece la UGR del procedimiento
				idUnitatGestora = dadesProcedimentBDTO.getProcedimentsRDTO().getUgrIdext();
			}

			ExpedientsRDTO expedientsRDTO = modelMapper.map(solicitudExpedient, ExpedientsRDTO.class);
			// Se debe indicar el id de la Unitat Gestora recuperada
			expedientsRDTO.setUnitatGestoraIdext(idUnitatGestora);
			
			
			ExpedientsCrearBDTO expedientsCrearBDTO = new ExpedientsCrearBDTO(expedientsRDTO);

			returnExpedientsRDTO = serveisService.crearSollicitudExpedient(expedientsCrearBDTO);

			// Avisos. ACCIONS_ESTATS: 1
			GestionarAvisosPerAccio gestionarAvisosPerAccio = new GestionarAvisosPerAccio();
			gestionarAvisosPerAccio.setIdAccioEstat(BigDecimal.ONE);
			GestionarAvisosPerAccioBDTO gestionarAvisosPerAccioBDTO = new GestionarAvisosPerAccioBDTO(gestionarAvisosPerAccio,
			        returnExpedientsRDTO.getId());
			serveisService.gestionarAvisosPerAccio(gestionarAvisosPerAccioBDTO);
		} catch (GPAApiParamValidationException e) {
			log.error("crearSolicitudExpedient(ExpedientCrearRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = e;
		} catch (Exception e) {
			log.error("crearSolicitudExpedient(ExpedientCrearRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_CREAR_EXPEDIENT, e);
			resultatAudit = "KO";
			ex = e;
		} finally {
			respostaExpedientsCrearBDTO = new RespostaExpedientsCrearBDTO(returnExpedientsRDTO, respostaResultatBDTO);
			respostaCrearSolicitudsRDTO = modelMapper.map(respostaExpedientsCrearBDTO, RespostaCrearExpedientRDTO.class);

			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Crear una sol??licitud d'un expedient");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, solicitudExpedient, respostaCrearSolicitudsRDTO, ex);
		}

		if (log.isDebugEnabled()) {
			log.debug("crearSolicitudExpedient(SolicitudsCrearRDTO) - fi"); //$NON-NLS-1$
		}
		return respostaCrearSolicitudsRDTO;
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
	@PostMapping("/expedients/{codiExpedient}")
	@ApiOperation(nickname = "actualitzarSolicitudExpedientPortal", value = "Actualitzar dades de la sol??licitud de l'expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaActualitzarExpedientRDTO actualitzarSolicitudExpedient(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Dades de la actualitzaci?? de l'expedient") @RequestBody ExpedientActualitzarRDTO solicitudExpedient)
	        throws GPAServeisServiceException {
		if (log.isDebugEnabled()) {
			log.debug("actualitzarSolicitudExpedient(BigDecimal, ExpedientActualitzarRDTO) - inici"); //$NON-NLS-1$
		}

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaActualitzarExpedientRDTO respostaActualitzarSolicitudsRDTO = null;
		ExpedientsRDTO returnExpedientsRDTO = null;
		RespostaDadesOperacioCercaBDTO respostaDadesOperacioCercaBDTO = null;
		List<DadesOperacions> dadesActualizar = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_ACTUALITZAR_EXPEDIENT);
		RespostaExpedientsActualitzarBDTO respostaExpedientsActualitzarBDTO = null;
		try {
			// El codi del expediente debe existir
			DadesExpedientBDTO dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO, Resultat.ERROR_ACTUALITZAR_EXPEDIENT);

			// Si se indica alguna persona al menos debe indicarse el
			// Solicitante
			ServeisRestControllerValidationHelper.validateSollicitantActualitzarSolicitudExpedient(solicitudExpedient.getSollicitant(),
			        solicitudExpedient.getRepresentant());

			// se valida que si la relacion es de persona interesada, solo
			// permita valores sollicitant y representant
			ServeisRestControllerValidationHelper.validatePersonesInteressadesExpedient(solicitudExpedient.getPersonesInteressades(),
			        Resultat.ERROR_ACTUALITZAR_EXPEDIENT);

			// Actualizar Solicitante / Representante / Dades d'Operaci?? si se
			// incluyen en los datos de la petici??n y si la acci??n es permitida
			if ((solicitudExpedient.getSollicitant() != null) || CollectionUtils.isNotEmpty(solicitudExpedient.getDadesOperacio())) {
				ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
				        AccioTramitadorApiParamValue.INFORMAR_DADES_EXPEDIENT, Resultat.ERROR_ACTUALITZAR_EXPEDIENT);
			}

			// Se obtienen los Dades d'Operaci?? del procedimiento y se valida
			// que los c??digos indicados existen. Se aprovecha para recuperar
			// los identificadores de los campos
			ValidateDadesOperacioResultat validateDadesOperacioResultat = null;
			if (CollectionUtils.isNotEmpty(solicitudExpedient.getDadesOperacio())) {

				DadesOperacioCercaBDTO dadesOperacioCercaBDTO = new DadesOperacioCercaBDTO(
				        dadesExpedientBDTO.getExpedientsRDTO().getProcedimentIdext(), null);
				respostaDadesOperacioCercaBDTO = serveisService.cercaDadesOperacio(dadesOperacioCercaBDTO);

				validateDadesOperacioResultat = ServeisRestControllerValidationHelper.validateDadesOperacioActualitzarSolicitudExpedient(
				        solicitudExpedient.getDadesOperacio(), respostaDadesOperacioCercaBDTO.getDadesGrupsRDTOList(),
				        dadesExpedientBDTO.getExpedientsRDTO().getId(), dadesExpedientBDTO.getExpedientsRDTO().getSollicitud(), true);

				// recogemos los dades operacio que se quieren actualizar para
				// validad su visibilidad
				dadesActualizar = new ArrayList<>();
				for (AtributsActualitzarRDTO atributsActualitzarRDTO : solicitudExpedient.getDadesOperacio()) {
					for (DadesGrupsRDTO dadesGrupsRDTO : respostaDadesOperacioCercaBDTO.getDadesGrupsRDTOList()) {
						for (DadesOperacions dadesOperacions : dadesGrupsRDTO.getDadesOperacionsList()) {
							if (dadesOperacions.getCodi() != null
							        && dadesOperacions.getCodi().equalsIgnoreCase(atributsActualitzarRDTO.getCodi())) {
								dadesActualizar.add(dadesOperacions);
							}
						}
					}
				}
			}

			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersones(clientEntity, serveisService, dadesActualizar, null,
			        null, null, dadesExpedientBDTO, TramitOvtApiParamValue.SOL.getInternalValue(), Resultat.ERROR_ACTUALITZAR_EXPEDIENT);

			// Se construye el modelo para la llamada a la operaci??n de
			// actualizaci??n
			ExpedientsRDTO expedientsRDTO = modelMapper.map(solicitudExpedient, ExpedientsRDTO.class);
			// Se indica el id del Expediente recibido como path variable
			expedientsRDTO.setId(dadesExpedientBDTO.getExpedientsRDTO().getId());
			ActualitzarDadesSollicitud actualitzarDadesSollicitud = new ActualitzarDadesSollicitud();
			actualitzarDadesSollicitud.setExpedient(expedientsRDTO);
			if (validateDadesOperacioResultat != null) {
				actualitzarDadesSollicitud.setDadesEspecifiques(validateDadesOperacioResultat.getDadesEspecifiquesRDTOList());
				actualitzarDadesSollicitud
				        .setDadesEspecifiquesRepetibles(validateDadesOperacioResultat.getDadesEspecifiquesRepetiblesRDTOList());
			}
			actualitzarDadesSollicitud.setEsTramitadors(Boolean.FALSE);
			ExpedientsActualitzarBDTO expedientsActualitzarBDTO = new ExpedientsActualitzarBDTO(actualitzarDadesSollicitud);
			returnExpedientsRDTO = serveisService.actualitzarSolicitudExpedient(expedientsActualitzarBDTO);

		} catch (GPAApiParamValidationException e) {
			log.error("actualitzarSolicitudExpedient(BigDecimal, ExpedientActualitzarRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = e;
		} catch (Exception e) {
			log.error("actualitzarSolicitudExpedient(BigDecimal, ExpedientActualitzarRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_ACTUALITZAR_EXPEDIENT, e);
			resultatAudit = "KO";
			ex = e;
		} finally {
			respostaExpedientsActualitzarBDTO = new RespostaExpedientsActualitzarBDTO(returnExpedientsRDTO, respostaResultatBDTO);
			respostaActualitzarSolicitudsRDTO = modelMapper.map(respostaExpedientsActualitzarBDTO, RespostaActualitzarExpedientRDTO.class);

			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient);
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Actualitzar dades de la sol??licitud de l'expedient");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, solicitudExpedient, respostaActualitzarSolicitudsRDTO, ex);
		}

		if (log.isDebugEnabled()) {
			log.debug("actualitzarSolicitudExpedient(BigDecimal, SolicitudsActualitzarRDTO) - fi"); //$NON-NLS-1$
		}
		return respostaActualitzarSolicitudsRDTO;
	}

	/**
	 * Registrar solicitud expedient.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @param expedientRegistrarRDTO
	 *            the expedient registrar RDTO
	 * @return the resposta registrar expedient RDTO
	 * @throws GPAServeisServiceException
	 */
	@PostMapping("/expedients/{codiExpedient}/registre")
	@ApiOperation(nickname = "registrarSolicitudExpedientPortal", value = "Registrar la sol??licitud de l'expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaRegistrarExpedientRDTO registrarSolicitudExpedient(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Dades de l'registre de l'expedient", required = false) @RequestBody(required = false) ExpedientRegistrarRDTO expedientRegistrarRDTO)
	        throws GPAServeisServiceException {
		if (log.isInfoEnabled()) {
			log.info("registrarSolicitudExpedient(BigDecimal) - inici"); //$NON-NLS-1$
			log.info("Idioma registro: " + expedientRegistrarRDTO.getIdioma()); // $NON-NLS-1$
		}

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaRegistrarExpedientRDTO respostaRegistrarExpedientRDTO = null;
		DadesExpedientBDTO dadesExpedientBDTO = null;
		RespostaCrearRegistreExpedient respostaCrearRegistreExpedient = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_REGISTRAR_EXPEDIENT);
		DocsTramitacioRDTO respostaCrearJustificant = null;
		// ExpedientsRegistrarBDTO expedientsRegistrarBDTO = null;
		DocumentActualizarRegistre documentActualizarRegistreRDTO = null;
		DadesSollicitudBDTO dadesSollicitudBDTO = null;
		ExpedientsRegistrarSollicitudBDTO expedientsRegistrarSollicitudBDTO = null;
		boolean registreDocumentacioAssociat = false;
		boolean registreSollicitudAssociat = false;
		ArrayList<BigDecimal> idDocsEntradaList = new ArrayList<BigDecimal>();
		RespostaExpedientsRegistrarBDTO respostaExpedientsRegistrarBDTO = null;
		boolean esCiutada;
		boolean teRegistre = true;
		String politicaJustificant = new String();
		try {
			BigDecimal visibilitat = BigDecimal.ONE;
			esCiutada = ServeisRestControllerVisibilitatHelper.esUsuariCiutada(clientEntity);

			// El codi del expediente debe existir
			dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO, Resultat.ERROR_REGISTRAR_EXPEDIENT);

			// Registrar expediente si la acci??n es permitida
			BigDecimal accionsEstatsId = ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
			        AccioTramitadorApiParamValue.REGISTRAR_SOLLICITUD, Resultat.ERROR_REGISTRAR_EXPEDIENT);

			// obtenemos los datos del procediment para ver la configuracion de
			// registro
			DadesProcedimentBDTO dadesProcedimentBDTO = serveisService
			        .consultarDadesProcediment(dadesExpedientBDTO.getExpedientsRDTO().getProcedimentIdext());

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
				for (ReqOperatiusTramOvt reqOperatiusTramOvt : dadesProcedimentBDTO.getProcedimentsRDTO().getReqOperatius()
				        .getReqOperatiusTramOvtList()) {
					if (reqOperatiusTramOvt.getTramitOvtIdext().compareTo(BigDecimal.ONE) == NumberUtils.INTEGER_ZERO.intValue()) {
						teRegistre = reqOperatiusTramOvt.getTramitRegistre().intValue() == NumberUtils.INTEGER_ZERO.intValue() ? false
						        : true;
						for (ConfiguracioDocsTramitacioRDTO configuracioDocsTramitacioRDTO : respostaDocumentsTramitacioCercaBDTO
						        .getConfiguracioDocsTramitacioRDTOList()) {
							if (CollectionUtils.isNotEmpty(configuracioDocsTramitacioRDTO.getConfdocstramTramitsOvtList())
							        && CollectionUtils.isNotEmpty(configuracioDocsTramitacioRDTO.getConfDocsTramPolitiquesSigList())) {
								for (ConfdocstramTramitsOvt confdocstramTramitsOvt : configuracioDocsTramitacioRDTO
								        .getConfdocstramTramitsOvtList()) {
									if (confdocstramTramitsOvt.getTramitOvtIdext().compareTo(BigDecimal.ONE) == NumberUtils.INTEGER_ZERO
									        .intValue()
									        && configuracioDocsTramitacioRDTO.getDocumentacioVinculada()
									                .compareTo(new BigDecimal(5)) == NumberUtils.INTEGER_ZERO.intValue()) {
										politicaJustificant = configuracioDocsTramitacioRDTO.getConfDocsTramPolitiquesSigList().get(0)
										        .getPoliticaSignatura();
									}
								}
							}
						}
					}
				}
			}
			// 1 - validar que la persona logueada esta dentro de los
			// interesados
			ServeisRestControllerValidationHelper.validateUsuariLogueadoInteressades(clientEntity,
			        dadesExpedientBDTO.getPersonesInteressades(), dadesExpedientBDTO.getSollicitant(), dadesExpedientBDTO.getRepresentant(),
			        Resultat.ERROR_REGISTRAR_EXPEDIENT);

			// Se construye el modelo para la llamada a la operaci??n de registro
			// CrearRegistre registreCreacioSolicitudExpedient = new
			// CrearRegistre();
			// registreCreacioSolicitudExpedient.setExpedient(dadesExpedientBDTO.getExpedientsRDTO());
			// expedientsRegistrarBDTO = new
			// ExpedientsRegistrarBDTO(registreCreacioSolicitudExpedient);

			// ahora se realiza el registro de la solicitud como tal
			dadesSollicitudBDTO = serveisService.consultarDadesSollicitud(dadesExpedientBDTO.getExpedientsRDTO().getSollicitud(),
			        visibilitat);
			
			// TODO Evaluar regla de asignaci??n y asociar el UGO al que se debe
			// cambiar, pues ese ser?? el que debe indicarse en el registro que
			// viene a continuaci??n (esto ahora mismo no se produce hasta el
			// cambio de estado que hay al final del servicio de registro)

			if (teRegistre) {
				// Se construye el modelo para la llamada a la operaci??n de
				// registro
				if (CollectionUtils.isNotEmpty(dadesSollicitudBDTO.getDocumentsAportats())) {
					for (DocsEntradaRDTO docsEntradaRDTO : dadesSollicitudBDTO.getDocumentsAportats()) {
						idDocsEntradaList.add(docsEntradaRDTO.getId());
					}
				}

				CrearSollicitud registreCreacioSolicitud = new CrearSollicitud();
				registreCreacioSolicitud.setSollicitud(dadesSollicitudBDTO.getSollicitudsRDTO());
				registreCreacioSolicitud.setDocuments(idDocsEntradaList);
				if (!esCiutada) {
					registreCreacioSolicitud.setMatriculaInformador(clientEntity.getUsuariAutenticat());
				}
				expedientsRegistrarSollicitudBDTO = new ExpedientsRegistrarSollicitudBDTO(registreCreacioSolicitud);

				respostaCrearRegistreExpedient = serveisService.crearRegistreSollicitud(expedientsRegistrarSollicitudBDTO,
				        TipusDocumentacioVinculadaApiParamValue.JUSTIFICANT_SOLLICITUD.getInternalValue());

				if (respostaCrearRegistreExpedient == null) {
					throw new GPAApiParamValidationException(Resultat.ERROR_REGISTRAR_EXPEDIENT, ErrorPrincipal.ERROR_GENERIC);
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
			if (expedientRegistrarRDTO != null) {
				sollicitudActualitzarRegistre.setSignaturaSollicitud(expedientRegistrarRDTO.getSignaturaSolicitud());
				if (!esCiutada) {
					sollicitudActualitzarRegistre.setMatriculaInformador(clientEntity.getUsuariAutenticat());
				}
			}
			serveisService.associarRegistreSollicitud(sollicitudActualitzarRegistre);
			registreSollicitudAssociat = true;

			// Recoger plantilla de la conf
			RespostaPlantillaDocVinculada respostaPlantillaDocVinculada = serveisService.getPlantillaDocVinculada(
			        dadesExpedientBDTO.getExpedientsRDTO().getConfiguracioDocumentacioProc(),
			        TipusDocumentacioVinculadaApiParamValue.JUSTIFICANT_SOLLICITUD.getInternalValue());

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

			if (expedientRegistrarRDTO != null && !StringUtils.isEmpty(expedientRegistrarRDTO.getIdioma())
			        && (expedientRegistrarRDTO.getIdioma().equals(IdiomaPlantillaDocApiParamValue.CASTELLA.getApiParamValue())
			                || expedientRegistrarRDTO.getIdioma().equals(IdiomaPlantillaDocApiParamValue.CATALA.getApiParamValue()))) {
				IdiomaPlantillaDocApiParamValueTranslator idiomaPlantillaDocApiParamValueTranslator = new IdiomaPlantillaDocApiParamValueTranslator();
				docsTramitacioRDTO.setIdioma(
				        idiomaPlantillaDocApiParamValueTranslator.getInternalValueByApiParamValue(expedientRegistrarRDTO.getIdioma()));
				dadesExpedientBDTO.getExpedientsRDTO().setIdioma(
				        idiomaPlantillaDocApiParamValueTranslator.getInternalValueByApiParamValue(expedientRegistrarRDTO.getIdioma()));
			} else {
				docsTramitacioRDTO.setIdioma(IdiomaPlantillaDocApiParamValue.CASTELLA.getInternalValue());
				dadesExpedientBDTO.getExpedientsRDTO().setIdioma(IdiomaPlantillaDocApiParamValue.CASTELLA.getInternalValue());
			}
			// Actualizamos el expediente con el idioma
			serveisService.actualitzarExpedient(dadesExpedientBDTO.getExpedientsRDTO());

			docsTramitacioRDTO.setConfiguracioDocsTramitacio(configuracioDocsTramitacio);
			docsTramitacioRDTO.setConfigDocTramitacio(respostaPlantillaDocVinculada.getId());
			docsTramitacioRDTO.setOrigen(2);
			docsTramitacioRDTO.setDocsTercers(1);
			docsTramitacioRDTO.setSollicitudIdext(dadesExpedientBDTO.getExpedientsRDTO().getSollicitud());
			TipusMime tipusMime = new TipusMime();
			tipusMime.setId(TipusMimeApiParamValue.PDF.getInternalValue());
			DocsFisics docsFisics = new DocsFisics();
			docsFisics.setTipusMime(tipusMime);
			docsFisics.setTipus(TipusMimeApiParamValue.PDF.getInternalValue());
			docsTramitacioRDTO.setDocsFisics(docsFisics);
			CrearDocumentTramitacioBDTO crearDocumentTramitacioBDTO = new CrearDocumentTramitacioBDTO(
			        dadesExpedientBDTO.getExpedientsRDTO().getId(), dadesExpedientBDTO.getExpedientsRDTO().getSollicitud(),
			        docsTramitacioRDTO);
			respostaCrearJustificant = serveisService.guardarDocumentTramitacioJustificantPlantilla(crearDocumentTramitacioBDTO);

			// Obtener el XML y almacenarlo en el Gestor Documental .
			// Asociar el c??digo generado a nivel de Sollicitud, puesto que ser??
			// el Objeto Documental a utilizar
			String idGestorDocumental = respostaCrearJustificant.getCodi();
			// Buscamos de nuevo la solicitud para que incluya los datos de
			// registro
			dadesSollicitudBDTO = serveisService.consultarDadesSollicitud(dadesExpedientBDTO.getExpedientsRDTO().getSollicitud(),
			        visibilitat);
			guardarXMLSollicitud(dadesSollicitudBDTO, idGestorDocumental);

			// se llama a segell para firmar el justificante de registro del
			// expediente
			SignarSegellDocument signarSegellDocumentRDTO = new SignarSegellDocument();
			signarSegellDocumentRDTO.setIdDocument(respostaCrearJustificant.getId());
			SignarSegellDocument signarSegellDocumentResponse = serveisService.signarSegellDocument(signarSegellDocumentRDTO);

			if (signarSegellDocumentResponse != null && StringUtils.isNotEmpty(signarSegellDocumentResponse.getDescError())) {

				StringBuilder strMessageError = new StringBuilder(Constants.MISSATGE_ERROR_SIGNATURES);
				throw new GPAServeisServiceException(strMessageError.append(": ").append(signarSegellDocumentResponse.getCodiError())
				        .append(": ").append(signarSegellDocumentResponse.getDescError()).toString());
			}

			// TODO Calcular Hash de documento firmado, regenerar el PDF con el
			// hash incrustado y guardarlo bajo el mismo objeto documental
			// serveisService.guardarDocumentTramitacioJustificantPlantillaSignat

			// Vincular Justificante en Ariadna
			if (teRegistre) {
				// Debe vincularse a Ariadna el Justificante firmado y no el
				// original
				ConsultarSignaturaResponse consultarSignaturaResponse = serveisService
				        .consultarSignatura(signarSegellDocumentResponse.getIdPeticio(), respostaCrearJustificant.getMigracioIdOrigen());
				if (consultarSignaturaResponse != null && consultarSignaturaResponse.getIdDocumentSignatGestorDocumental() != null) {
					vincularJustificanteAriadna(dadesExpedientBDTO, respostaCrearRegistreExpedient,
					        consultarSignaturaResponse.getIdDocumentSignatGestorDocumental());
				}
			}

			// Asociar registre del expediente a la documentacio
			documentActualizarRegistreRDTO = new DocumentActualizarRegistre();
			documentActualizarRegistreRDTO.setIdDoc(dadesExpedientBDTO.getExpedientsRDTO().getDocumentacioIdext());
			if (teRegistre) {
				documentActualizarRegistreRDTO.setIdRegistre(respostaCrearRegistreExpedient.getRegistreAssentament().getId());
			}
			serveisService.associarRegistreDocumentacioExpedient(documentActualizarRegistreRDTO);
			registreDocumentacioAssociat = true;

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

			// En caso de que la operaci??n de registro se lance desde el
			// portal
			// del Informador,
			// el formulario de solicitud (documento de instancia) estar??
			// firmado por Segell d'Organ y habr?? que copiar el contenido de
			// dicho documento firmado en el documento original
			if (!esCiutada) {
				// Par??metros disponibles:
				// - idDocumentacio -> Obtener documento basado en plantilla
				// - signaturaSolicitud -> id de Petici??n de firma que nos
				// da
				// acceso al robjectid documento firmado
				serveisService.guardarDocumentSollicitudSignat(dadesExpedientBDTO.getExpedientsRDTO().getDocumentacioIdext(),
				        expedientRegistrarRDTO.getSignaturaSolicitud());
			}

			// Cambiar el estado del expediente
			ExpedientCanviEstat expedientCanviEstat = modelMapper.map(dadesExpedientBDTO.getExpedientsRDTO(), ExpedientCanviEstat.class);

			// obtenemos el idAccioEstat futuro
			List<AccionsEstatsRDTO> accionsEstatsRDTOList = serveisService.cercaTransicioCanviEstat(
			        AccioTramitadorApiParamValue.REGISTRAR_SOLLICITUD.getInternalValue(),
			        dadesExpedientBDTO.getExpedientsRDTO().getIdEstat());

			// debe existir una transicion posible para el estado actual
			ServeisRestControllerValidationHelper.validateTransicioAccioDisponibleExpedient(accionsEstatsRDTOList,
			        AccioTramitadorApiParamValue.REGISTRAR_SOLLICITUD, Resultat.ERROR_REGISTRAR_EXPEDIENT);

			expedientCanviEstat.setIdAccioEstat(accionsEstatsRDTOList.get(0).getId());

			ExpedientsCanviarEstatBDTO expedientsCanviarEstatBDTO = new ExpedientsCanviarEstatBDTO(expedientCanviEstat,
			        dadesExpedientBDTO.getExpedientsRDTO().getId());
			serveisService.canviarEstatExpedient(expedientsCanviarEstatBDTO);
			dadesExpedientBDTO.getExpedientsRDTO().setIdEstat(EstatTramitadorApiParamValue.SOL_LICITUD_EN_REVISIO.getInternalValue());

			// Avisos. ACCIONS_ESTATS: 11
			GestionarAvisosPerAccio gestionarAvisosPerAccio = new GestionarAvisosPerAccio();
			gestionarAvisosPerAccio.setIdAccioEstat(accionsEstatsId);
			GestionarAvisosPerAccioBDTO gestionarAvisosPerAccioBDTO = new GestionarAvisosPerAccioBDTO(gestionarAvisosPerAccio,
			        dadesExpedientBDTO.getExpedientsRDTO().getId());
			serveisService.gestionarAvisosPerAccio(gestionarAvisosPerAccioBDTO);

		} catch (GPAApiParamValidationException e) {
			log.error("registrarSolicitudExpedient(BigDecimal)", e);// $NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = e;
		} catch (Exception e) {
			log.error("registrarSolicitudExpedient(BigDecimal)", e);

			ServeisRestControllerSagaHelper.sagaRegistrarSolicitudExpedient(serveisService, dadesExpedientBDTO,
			        respostaCrearRegistreExpedient, registreSollicitudAssociat, respostaCrearJustificant, documentActualizarRegistreRDTO,
			        registreDocumentacioAssociat);

			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_REGISTRAR_EXPEDIENT, e);
			resultatAudit = "KO";
			ex = e;
		} finally {
			respostaExpedientsRegistrarBDTO = new RespostaExpedientsRegistrarBDTO(respostaCrearRegistreExpedient, respostaCrearJustificant,
			        dadesExpedientBDTO != null ? dadesExpedientBDTO.getExpedientsRDTO() : null, respostaResultatBDTO);
			respostaRegistrarExpedientRDTO = modelMapper.map(respostaExpedientsRegistrarBDTO, RespostaRegistrarExpedientRDTO.class);

			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient + "/registre");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Registrar la sol??licitud de l'expedient");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, expedientRegistrarRDTO, respostaRegistrarExpedientRDTO, ex);
		}

		if (log.isDebugEnabled()) {
			log.debug("registrarSolicitudExpedient(BigDecimal) - fi"); //$NON-NLS-1$
		}

		return respostaRegistrarExpedientRDTO;
	}

	/**
	 * Aportar documentacio expedient.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @param documentacioAportar
	 *            the documentacio aportar
	 * @return the resposta aportar document RDTO
	 * @throws GPAServeisServiceException
	 */
	@PostMapping("/expedients/{codiExpedient}/documentacio")
	@ApiOperation(nickname = "aportarDocumentacioExpedientPortal", value = "Aportar documentaci?? a l'expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaAportarDocumentRDTO aportarDocumentacioExpedient(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Dades de la creaci?? del document") @RequestBody DocumentacioAportarRDTO documentacioAportar)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaAportarDocumentRDTO respostaAportarDocumentRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_APORTAR_DOCUMENTACIO);
		DadesExpedientBDTO dadesExpedientBDTO = null;
		List<DocsEntradaRDTO> docsEntradaRDTORespostaList = null;
		DocsTramitacioRDTO respostaCrearJustificant = null;
		RespostaCrearRegistreExpedient respostaCrearRegistreExpedient = null;
		List<ConfiguracioDocsEntradaRDTO> configuacioActualizar = null;
		RespostaAportarDocumentExpedientBDTO respostaAportarDocumentExpedientBDTO = null;
		try {
			// El codi del expediente debe existir
			dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO, Resultat.ERROR_APORTAR_DOCUMENTACIO);

			// Las configuraciones de documentaci??n indicadas deben estar
			// asociadas al procedimiento del expediente
			DocumentsEntradaCercaBDTO documentsEntradaCercaBDTO = new DocumentsEntradaCercaBDTO(
			        dadesExpedientBDTO.getExpedientsRDTO().getConfiguracioDocumentacioProc(), null);
			RespostaDocumentsEntradaCercaBDTO respostaDocumentsEntradaCercaBDTO = serveisService
			        .cercaConfiguracioDocumentacioEntrada(documentsEntradaCercaBDTO);
			HashMap<String, ConfiguracioDocsEntradaRDTO> map = ServeisRestControllerValidationHelper
			        .validateConfiguracioDocumentacioAportada(respostaDocumentsEntradaCercaBDTO.getConfiguracioDocsEntradaRDTOList(),
			                documentacioAportar.getDocumentacio(), Resultat.ERROR_APORTAR_DOCUMENTACIO);

			// Aportar documentaci??n si la acci??n es permitida
			BigDecimal accionsEstatsId = ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
			        AccioTramitadorApiParamValue.APORTAR_DOCUMENTACIO, Resultat.ERROR_APORTAR_DOCUMENTACIO);

			configuacioActualizar = new ArrayList<>();
			for (DocumentAportatCrearRDTO documentAportatCrearRDTO : documentacioAportar.getDocumentacio()) {
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
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersones(clientEntity, serveisService, null,
			        configuacioActualizar, null, null, dadesExpedientBDTO, null, Resultat.ERROR_APORTAR_DOCUMENTACIO);

			// Se construye el modelo para la llamada a la operaci??n de aportar
			// documentaci??
			if (CollectionUtils.isNotEmpty(documentacioAportar.getDocumentacio())) {
				docsEntradaRDTORespostaList = new ArrayList<DocsEntradaRDTO>();
				DocsEntradaRDTO docsEntradaRDTOResposta = null;
				for (DocumentAportatCrearRDTO documentAportatCrearRDTO : documentacioAportar.getDocumentacio()) {
					DocsEntradaRDTO docsEntradaRDTO = modelMapper.map(documentAportatCrearRDTO, DocsEntradaRDTO.class);
					docsEntradaRDTO.setRevisio(RevisioApiParamValue.PENDENT.getInternalValue());
					docsEntradaRDTO.setOrigen(docsEntradaRDTO.getOrigen() == null ? OrigenApiParamValue.EXTERN.getInternalValue()
					        : docsEntradaRDTO.getOrigen());
					docsEntradaRDTO.setNou(NumberUtils.INTEGER_ONE);
					docsEntradaRDTO.setConfigDocEntrada(map.get(String.valueOf(docsEntradaRDTO.getConfigDocEntrada())).getId());
					docsEntradaRDTO.setDocsTercers(NumberUtils.INTEGER_ONE);
					docsEntradaRDTO.setSollicitudIdext(dadesExpedientBDTO.getExpedientsRDTO().getSollicitud());
					docsEntradaRDTO.setEsborrany(1);

					BigDecimal idPersone = ServeisRestControllerValidationHelper.getIdUsuariInteressat(clientEntity,
					        dadesExpedientBDTO.getPersonesInteressades(), dadesExpedientBDTO.getSollicitant(),
					        dadesExpedientBDTO.getRepresentant());
					if (idPersone != null) {
						docsEntradaRDTO.setPersonaIdext(idPersone);
					}

					if (BooleanUtils.isTrue(documentAportatCrearRDTO.getDeclaracioResponsable())) {
						CrearDeclaracioResponsableBDTO crearDeclaracioResponsableBDTO = new CrearDeclaracioResponsableBDTO(
						        dadesExpedientBDTO.getExpedientsRDTO().getId(), docsEntradaRDTO);
						docsEntradaRDTOResposta = serveisService.crearDeclaracioResponsable(crearDeclaracioResponsableBDTO);
					} else {
						CrearDocumentEntradaBDTO crearDocumentEntradaBDTO = new CrearDocumentEntradaBDTO(
						        dadesExpedientBDTO.getExpedientsRDTO().getId(), docsEntradaRDTO);
						docsEntradaRDTOResposta = serveisService.crearDocumentEntrada(crearDocumentEntradaBDTO);

						// Avisos. ACCIONS_ESTATS: 2, 3, 4, 5, 6, 7, 202
						GestionarAvisosPerAccio gestionarAvisosPerAccio = new GestionarAvisosPerAccio();
						gestionarAvisosPerAccio.setIdAccioEstat(accionsEstatsId);
						GestionarAvisosPerAccioBDTO gestionarAvisosPerAccioBDTO = new GestionarAvisosPerAccioBDTO(gestionarAvisosPerAccio,
						        dadesExpedientBDTO.getExpedientsRDTO().getId());
						serveisService.gestionarAvisosPerAccio(gestionarAvisosPerAccioBDTO);
					}
					docsEntradaRDTORespostaList.add(docsEntradaRDTOResposta);
				}
			}

			if (documentacioAportar.isRegistrar() && CollectionUtils.isNotEmpty(docsEntradaRDTORespostaList)) {
				List<BigDecimal> idsDocsEnt = new ArrayList<>();
				for (DocsEntradaRDTO docsEntrada : docsEntradaRDTORespostaList) {
					idsDocsEnt.add(docsEntrada.getId());
				}

				// Registrar en Ariadna y coger el ID
				CrearRegistre registreCreacioSolicitudExpedient = new CrearRegistre();
				registreCreacioSolicitudExpedient.setExpedient(dadesExpedientBDTO.getExpedientsRDTO());
				registreCreacioSolicitudExpedient.setDocuments(idsDocsEnt);
				ExpedientsRegistrarBDTO expedientsRegistrarBDTO = new ExpedientsRegistrarBDTO(registreCreacioSolicitudExpedient);
				respostaCrearRegistreExpedient = serveisService.crearRegistre(expedientsRegistrarBDTO,
				        TipusDocumentacioVinculadaApiParamValue.JUSTIFICANT_APORTACIO.getInternalValue());

				// Actualizar la lista de documentos
				DocsEntActualizarRegistre docsEntActualizarRegistre = new DocsEntActualizarRegistre();
				docsEntActualizarRegistre.setIdRegistre(respostaCrearRegistreExpedient.getRegistreAssentament().getId());
				docsEntActualizarRegistre.setListIdsDocsEnt(idsDocsEnt);
				serveisService.associarRegistreDocsEnt(docsEntActualizarRegistre);

				// Recoger Plantilla
				RespostaPlantillaDocVinculada respostaPlantillaDocVinculada = serveisService.getPlantillaDocVinculada(
				        dadesExpedientBDTO.getExpedientsRDTO().getConfiguracioDocumentacioProc(),
				        TipusDocumentacioVinculadaApiParamValue.JUSTIFICANT_APORTACIO.getInternalValue());

				// Generar Justificant
				DocsTramitacioRDTO docsTramitacioRDTO = new DocsTramitacioRDTO();
				ConfiguracioDocsTramitacio configuracioDocsTramitacio = new ConfiguracioDocsTramitacio();
				configuracioDocsTramitacio.setSuportEnllac(respostaPlantillaDocVinculada.getPlantilla());
				configuracioDocsTramitacio.setId(respostaPlantillaDocVinculada.getId());
				docsTramitacioRDTO.setIdioma(IdiomaPlantillaDocApiParamValue.CASTELLA.getInternalValue());
				docsTramitacioRDTO.setConfiguracioDocsTramitacio(configuracioDocsTramitacio);
				docsTramitacioRDTO.setConfigDocTramitacio(respostaPlantillaDocVinculada.getId());
				docsTramitacioRDTO.setOrigen(2);
				docsTramitacioRDTO.setDocsTercers(1);
				docsTramitacioRDTO.setSollicitudIdext(dadesExpedientBDTO.getExpedientsRDTO().getSollicitud());
				TipusMime tipusMime = new TipusMime();
				tipusMime.setId(TipusMimeApiParamValue.PDF.getInternalValue());
				DocsFisics docsFisics = new DocsFisics();
				docsFisics.setTipusMime(tipusMime);
				docsFisics.setTipus(TipusMimeApiParamValue.PDF.getInternalValue());
				docsTramitacioRDTO.setDocsFisics(docsFisics);
				CrearDocumentTramitacioBDTO crearDocumentTramitacioBDTO = new CrearDocumentTramitacioBDTO(
				        dadesExpedientBDTO.getExpedientsRDTO().getId(), dadesExpedientBDTO.getExpedientsRDTO().getSollicitud(),
				        docsTramitacioRDTO);
				respostaCrearJustificant = serveisService.guardarDocumentTramitacioJustificantPlantilla(crearDocumentTramitacioBDTO);

				vincularJustificanteAriadna(dadesExpedientBDTO, respostaCrearRegistreExpedient, respostaCrearJustificant.getCodi());

			}
		} catch (GPAApiParamValidationException e) {
			log.error("aportarDocumentacioExpedient(BigDecimal, List<DocumentAportatCrearRDTO>)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = e;
		} catch (Exception e) {
			log.error("aportarDocumentacioExpedient(BigDecimal, List<DocumentAportatCrearRDTO>)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_APORTAR_DOCUMENTACIO, e);
			resultatAudit = "KO";
			ex = e;
		} finally {
			respostaAportarDocumentExpedientBDTO = new RespostaAportarDocumentExpedientBDTO(docsEntradaRDTORespostaList,
			        (dadesExpedientBDTO != null && dadesExpedientBDTO.getExpedientsRDTO() != null) ? dadesExpedientBDTO.getExpedientsRDTO()
			                : null,
			        (respostaCrearRegistreExpedient != null && respostaCrearRegistreExpedient.getRegistreAssentament() != null)
			                ? respostaCrearRegistreExpedient.getRegistreAssentament() : null,
			        respostaCrearJustificant != null ? respostaCrearJustificant.getId() : null, respostaResultatBDTO);
			respostaAportarDocumentRDTO = modelMapper.map(respostaAportarDocumentExpedientBDTO, RespostaAportarDocumentRDTO.class);

			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient + "/documentacio");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Aportar documentaci?? a l'expedient");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, documentacioAportar, respostaAportarDocumentRDTO, ex);
		}

		return respostaAportarDocumentRDTO;
	}

	/**
	 * Substituir document expedient.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @param idDocument
	 *            the id document
	 * @param documentSubstituir
	 *            the document substituir
	 * @return the resposta substituir document RDTO
	 * @throws GPAServeisServiceException
	 */
	@PostMapping("/expedients/{codiExpedient}/documentacio/{idDocument}/substituir")
	@ApiOperation(nickname = "substituirDocumentExpedientPortal", value = "Substituir les dades d'un document de l'expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaSubstituirDocumentRDTO substituirDocumentExpedient(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Identificador del document", required = true) @PathVariable BigDecimal idDocument,
	        @ApiParam(value = "Dades de la versi?? del document") @RequestBody DocumentAportatSubstituirRDTO documentSubstituir)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaSubstituirDocumentRDTO respostaSubstituirDocumentRDTO = null;
		DadesExpedientBDTO dadesExpedientBDTO = null;
		DocsEntradaRDTO docsEntradaRDTO = null;
		DocsEntradaRDTO docsEntradaRDTOResposta = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_SUBSTITUIR_DOCUMENT);
		RespostaSubstituirDocumentExpedientBDTO respostaSubstituirDocumentExpedientBDTO = null;
		try {
			// El codi del expediente debe existir
			dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO, Resultat.ERROR_SUBSTITUIR_DOCUMENT);

			// El id del documento debe existir y pertenecer al expediente
			// indicado
			docsEntradaRDTO = serveisService.consultarDadesDocumentAportat(idDocument);
			ServeisRestControllerValidationHelper.validateDocumentAportat(docsEntradaRDTO, dadesExpedientBDTO.getExpedientsRDTO(),
			        Resultat.ERROR_SUBSTITUIR_DOCUMENT);

			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersones(clientEntity, serveisService, null, null,
			        docsEntradaRDTO, null, dadesExpedientBDTO, null, Resultat.ERROR_SUBSTITUIR_DOCUMENT);

			// La configuraci??n de documentaci??n indicada debe estar asociada al
			// procedimiento del expediente
			DocumentsEntradaCercaBDTO documentsEntradaCercaBDTO = new DocumentsEntradaCercaBDTO(
			        dadesExpedientBDTO.getExpedientsRDTO().getConfiguracioDocumentacioProc(), null);
			RespostaDocumentsEntradaCercaBDTO respostaDocumentsEntradaCercaBDTO = serveisService
			        .cercaConfiguracioDocumentacioEntrada(documentsEntradaCercaBDTO);
			HashMap<String, ConfiguracioDocsEntradaRDTO> map = ServeisRestControllerValidationHelper
			        .validateConfiguracioDocumentacioSubstituir(respostaDocumentsEntradaCercaBDTO.getConfiguracioDocsEntradaRDTOList(),
			                documentSubstituir, Resultat.ERROR_SUBSTITUIR_DOCUMENT);

			// Substituir el document si la acci??n es permitida
			BigDecimal accionsEstatsId = ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
			        AccioTramitadorApiParamValue.SUBSTITUIR_DOCUMENT, Resultat.ERROR_SUBSTITUIR_DOCUMENT);

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
				        dadesExpedientBDTO.getExpedientsRDTO().getId(), docsEntradaRDTOSubstituir);
				docsEntradaRDTOResposta = serveisService.actualitzarDeclaracioResponsable(actualitzarDeclaracioResponsableBDTO);
			} else {
				ActualitzarDocumentEntradaBDTO actualitzarDocumentEntradaBDTO = new ActualitzarDocumentEntradaBDTO(
				        dadesExpedientBDTO.getExpedientsRDTO().getId(), docsEntradaRDTOSubstituir);
				docsEntradaRDTOResposta = serveisService.actualitzarDocumentEntrada(actualitzarDocumentEntradaBDTO);

				// Avisos. ACCIONS_ESTATS: 50, 51, 52, 53, 54, 55, 148, 149
				GestionarAvisosPerAccio gestionarAvisosPerAccio = new GestionarAvisosPerAccio();
				gestionarAvisosPerAccio.setIdAccioEstat(accionsEstatsId);
				GestionarAvisosPerAccioBDTO gestionarAvisosPerAccioBDTO = new GestionarAvisosPerAccioBDTO(gestionarAvisosPerAccio,
				        dadesExpedientBDTO.getExpedientsRDTO().getId());
				serveisService.gestionarAvisosPerAccio(gestionarAvisosPerAccioBDTO);
			}

		} catch (GPAApiParamValidationException e) {
			log.error("substituirDocumentExpedient(BigDecimal, BigDecimal, List<DocumentAportatCrearRDTO>)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = e;
		} catch (Exception e) {
			log.error("substituirDocumentExpedient(BigDecimal, BigDecimal, List<DocumentAportatCrearRDTO>)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_SUBSTITUIR_DOCUMENT, e);
			resultatAudit = "KO";
			ex = e;
		} finally {
			respostaSubstituirDocumentExpedientBDTO = new RespostaSubstituirDocumentExpedientBDTO(docsEntradaRDTOResposta,
			        (dadesExpedientBDTO != null && dadesExpedientBDTO.getExpedientsRDTO() != null) ? dadesExpedientBDTO.getExpedientsRDTO()
			                : null,
			        null, respostaResultatBDTO);
			respostaSubstituirDocumentRDTO = modelMapper.map(respostaSubstituirDocumentExpedientBDTO, RespostaSubstituirDocumentRDTO.class);

			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient + "/documentacio/" + idDocument + "/substituir");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Substituir les dades d'un document de l'expedient");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, documentSubstituir, respostaSubstituirDocumentExpedientBDTO,
			        ex);
		}

		return respostaSubstituirDocumentRDTO;
	}

	/**
	 * Upload document expedient.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @param idDocument
	 *            the id document
	 * @param file
	 *            the file
	 * @return the resposta upload document RDTO
	 * @throws GPAServeisServiceException
	 */
	@PostMapping(value = "/expedients/{codiExpedient}/documentacio/{idDocument}/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	@ApiOperation(nickname = "uploadDocumentExpedientPortal", value = "Pujar el contingut d'un document de l'expedient al gestor documental", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	@ApiImplicitParams({
	        @ApiImplicitParam(name = "idGestorDocumental", value = "Identificador Gestor Documental", dataType = "string", paramType = "form", required = false) })
	public RespostaUploadDocumentRDTO uploadDocumentExpedient(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Identificador del document", required = true) @PathVariable BigDecimal idDocument,
	        @ApiParam(value = "Fitxer") @RequestParam(name = "file", required = false) MultipartFile file,
	        @ApiParam(value = "Identificador Gestor Documental") @RequestParam(name = "idGestorDocumental", required = false) String idGestorDocumental)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaUploadDocumentRDTO respostaUploadDocumentRDTO = null;
		DadesExpedientBDTO dadesExpedientBDTO = null;
		DocsEntradaRDTO docsEntradaRDTOResposta = null;
		DocsEntradaRDTO docsEntradaRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_UPLOAD_DOCUMENT);
		RespostaUploadDocumentExpedientBDTO respostaUploadDocumentExpedientBDTO = null;
		try {
			// El codi del expediente debe existir
			dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO, Resultat.ERROR_UPLOAD_DOCUMENT);

			// El id del documento debe existir y pertenecer al expediente
			// indicado
			docsEntradaRDTO = serveisService.consultarDadesDocumentAportat(idDocument);
			ServeisRestControllerValidationHelper.validateDocumentAportat(docsEntradaRDTO, dadesExpedientBDTO.getExpedientsRDTO(),
			        Resultat.ERROR_UPLOAD_DOCUMENT);

			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersones(clientEntity, serveisService, null, null,
			        docsEntradaRDTO, null, dadesExpedientBDTO, null, Resultat.ERROR_UPLOAD_DOCUMENT);

			// Se valida que venga file o idgestor documental para decidir que
			// operacion realizar
			ServeisRestControllerValidationHelper.validateEntradaUpload(file, idGestorDocumental, Resultat.ERROR_UPLOAD_DOCUMENT);

			// No hay una acci??n asociada al upload

			if (file != null) {
				// No se debe permitir subir un fichero a una Declaraci??n
				// Responsable
				ServeisRestControllerValidationHelper.validateDocumentUpload(docsEntradaRDTO, Resultat.ERROR_UPLOAD_DOCUMENT);

				// Se construye el modelo para la llamada a la operaci??n de
				// upload
				// document
				GuardarDocumentEntradaFitxerBDTO guardarDocumentEntradaFitxerBDTO = new GuardarDocumentEntradaFitxerBDTO(
				        dadesExpedientBDTO.getExpedientsRDTO().getId(), docsEntradaRDTO, file, null);
				docsEntradaRDTOResposta = serveisService.guardarDocumentEntradaFitxer(guardarDocumentEntradaFitxerBDTO);
			}
			if (StringUtils.isNotEmpty(idGestorDocumental)) {
				GuardarDocumentEntradaFitxerBDTO guardarDocumentEntradaFitxerBDTO = new GuardarDocumentEntradaFitxerBDTO(
				        dadesExpedientBDTO.getExpedientsRDTO().getId(), docsEntradaRDTO, null, idGestorDocumental);

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
				// Datos principales de la solicitud SOL
				BigDecimal visibilitat = BigDecimal.ONE;
				DadesSollicitudBDTO dadesSollicitudBDTO = serveisService
				        .consultarDadesSollicitud(dadesExpedientBDTO.getExpedientsRDTO().getSollicitud(), visibilitat);
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
			ex = e;
		} catch (Exception e) {
			log.error("uploadDocumentExpedient(BigDecimal, BigDecimal, MultipartFile)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_UPLOAD_DOCUMENT, e);
			resultatAudit = "KO";
			ex = e;
		} finally {
			respostaUploadDocumentExpedientBDTO = new RespostaUploadDocumentExpedientBDTO(docsEntradaRDTOResposta,
			        (dadesExpedientBDTO != null && dadesExpedientBDTO.getExpedientsRDTO() != null) ? dadesExpedientBDTO.getExpedientsRDTO()
			                : null,
			        null, respostaResultatBDTO);
			respostaUploadDocumentRDTO = modelMapper.map(respostaUploadDocumentExpedientBDTO, RespostaUploadDocumentRDTO.class);

			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient + "/documentacio/" + idDocument + "/upload");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Pujar el contingut d'un document de l'expedient al gestor documental");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, idGestorDocumental, respostaUploadDocumentRDTO, ex);
		}

		return respostaUploadDocumentRDTO;
	}

	/**
	 * Esborrar document expedient.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @param idDocument
	 *            the id document
	 * @return the resposta esborrar document RDTO
	 * @throws GPAServeisServiceException
	 */
	@DeleteMapping("/expedients/{codiExpedient}/documentacio/{idDocument}")
	@ApiOperation(nickname = "esborrarDocumentPortal", value = "Esborrar un document de l'expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaEsborrarDocumentRDTO esborrarDocument(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Identificador del document", required = true) @PathVariable BigDecimal idDocument)
	        throws GPAServeisServiceException {
		if (log.isDebugEnabled()) {
			log.debug("esborrarDocument(String, BigDecimal) - inici"); //$NON-NLS-1$
		}

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaEsborrarDocumentRDTO respostaEsborrarDocumentRDTO = null;
		DadesExpedientBDTO dadesExpedientBDTO = null;
		DocsEntradaRDTO docsEntradaRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_ESBORRAR_DOCUMENT);
		ExpedientsRDTO expedientsRDTO = null;
		RespostaEsborrarDocumentEntradaBDTO respostaEsborrarDocumentEntradaBDTO = null;
		try {
			// El codi del expediente debe existir
			dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO, Resultat.ERROR_ESBORRAR_DOCUMENT);

			// El id del documento debe existir y pertenecer al expediente
			// indicado
			docsEntradaRDTO = serveisService.consultarDadesDocumentAportat(idDocument);
			ServeisRestControllerValidationHelper.validateDocumentAportat(docsEntradaRDTO, dadesExpedientBDTO.getExpedientsRDTO(),
			        Resultat.ERROR_ESBORRAR_DOCUMENT);

			// Esborrar document si la acci??n es permitida
			BigDecimal accionsEstatsId = ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
			        AccioTramitadorApiParamValue.ESBORRAR_DOCUMENT, Resultat.ERROR_ESBORRAR_DOCUMENT);

			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersones(clientEntity, serveisService, null, null,
			        docsEntradaRDTO, null, dadesExpedientBDTO, null, Resultat.ERROR_ESBORRAR_DOCUMENT);

			// Se construye el modelo para la llamada a la operaci??n de esborrar
			// document
			EsborrarDocumentBDTO esborrarDocumentBDTO = new EsborrarDocumentBDTO(dadesExpedientBDTO.getExpedientsRDTO().getId(),
			        idDocument);

			serveisService.esBorrarDocumentacioEntrada(esborrarDocumentBDTO);

			// Avisos. ACCIONS_ESTATS: 122, 123, 124, 125, 126, 127, 180, 181
			GestionarAvisosPerAccio gestionarAvisosPerAccio = new GestionarAvisosPerAccio();
			gestionarAvisosPerAccio.setIdAccioEstat(accionsEstatsId);
			GestionarAvisosPerAccioBDTO gestionarAvisosPerAccioBDTO = new GestionarAvisosPerAccioBDTO(gestionarAvisosPerAccio,
			        dadesExpedientBDTO.getExpedientsRDTO().getId());
			serveisService.gestionarAvisosPerAccio(gestionarAvisosPerAccioBDTO);

		} catch (GPAApiParamValidationException e) {
			log.error("esborrarDocument(BigDecimal, BigDecimal)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = e;
		} catch (Exception e) {
			log.error("esborrarDocument(BigDecimal, BigDecimal)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_ESBORRAR_DOCUMENT, e);
			resultatAudit = "KO";
			ex = e;
		} finally {
			expedientsRDTO = (dadesExpedientBDTO != null) ? dadesExpedientBDTO.getExpedientsRDTO() : null;
			respostaEsborrarDocumentEntradaBDTO = new RespostaEsborrarDocumentEntradaBDTO(expedientsRDTO, docsEntradaRDTO,
			        respostaResultatBDTO);
			respostaEsborrarDocumentRDTO = modelMapper.map(respostaEsborrarDocumentEntradaBDTO, RespostaEsborrarDocumentRDTO.class);

			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient + "/documents/" + idDocument);
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("DELETE");
			auditServeisBDTO.setValueAccio("Esborrar un document de l'expedient");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, null, respostaEsborrarDocumentRDTO, ex);
		}

		if (log.isDebugEnabled()) {
			log.debug("esborrarDocument(String, BigDecimal) - fi"); //$NON-NLS-1$
		}
		return respostaEsborrarDocumentRDTO;
	}

	/**
	 * Esmenar expedient.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @param expedientEsmena
	 *            the expedient esmena
	 * @return the resposta esmenar expedient RDTO
	 * @throws GPAServeisServiceException
	 */
	@PostMapping("/expedients/{codiExpedient}/esmena")
	@ApiOperation(nickname = "esmenarExpedientPortal", value = "Respondre a requeriment o tr??mit d'al??legacions o IP", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaEsmenarExpedientRDTO esmenarExpedient(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Dades de la esmena de l'expedient") @RequestBody ExpedientEsmenaRDTO expedientEsmena)
	        throws GPAServeisServiceException {

		if (log.isDebugEnabled()) {
			log.debug("esmenarExpedient(BigDecimal, ExpedientEsmenaRDTO) - inici"); //$NON-NLS-1$
		}

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaEsmenarExpedientRDTO respostaEsmenarExpedientRDTO = null;
		DadesExpedientBDTO dadesExpedientBDTO = null;
		List<DocsEntradaRDTO> docsEntradaRDTORespostaList = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_ESMENAR_EXPEDIENT);
		RespostaCrearRegistreExpedient respostaCrearRegistreExpedient = null;
		DocsTramitacioRDTO respostaCrearJustificant = null;
		List<BigDecimal> idsDocsEnt = null;
		ActualitzarDadesSollicitud actualitzarDadesSollicitud = null;
		List<DadesEspecifiquesRDTO> dadesEspecifiquesRDTOListBBDD = null;
		List<ConfiguracioDocsEntradaRDTO> configuacioActualizar = null;
		RespostaExpedientsEsmenarBDTO respostaExpedientsEsmenarBDTO = null;
		try {
			// El codi del expediente debe existir
			dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO, Resultat.ERROR_ESMENAR_EXPEDIENT);

			// Las configuraciones de documentaci??n indicadas deben estar
			// asociadas al procedimiento del expediente
			DocumentsEntradaCercaBDTO documentsEntradaCercaBDTO = new DocumentsEntradaCercaBDTO(
			        dadesExpedientBDTO.getExpedientsRDTO().getConfiguracioDocumentacioProc(), null);
			RespostaDocumentsEntradaCercaBDTO respostaDocumentsEntradaCercaBDTO = serveisService
			        .cercaConfiguracioDocumentacioEntrada(documentsEntradaCercaBDTO);
			HashMap<String, ConfiguracioDocsEntradaRDTO> map = ServeisRestControllerValidationHelper
			        .validateConfiguracioDocumentacioEsmenar(respostaDocumentsEntradaCercaBDTO.getConfiguracioDocsEntradaRDTOList(),
			                expedientEsmena.getDocumentacio(), Resultat.ERROR_ESMENAR_EXPEDIENT);

			// Esmenar expedient si la acci??n es permitida
			BigDecimal accionsEstatsId = ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
			        AccioTramitadorApiParamValue.RESPONDRE_REQUERIMENT_O_TRAMIT_ALLEGACIONS_O_IP, Resultat.ERROR_ESMENAR_EXPEDIENT);

			configuacioActualizar = new ArrayList<>();
			for (DocumentRequeritCrearRDTO documentRequeritCrearRDTO : expedientEsmena.getDocumentacio()) {
				for (ConfiguracioDocsEntradaRDTO configuracioDocsEntradaRDTO : respostaDocumentsEntradaCercaBDTO
				        .getConfiguracioDocsEntradaRDTOList()) {
					if (documentRequeritCrearRDTO.getConfiguracioDocumentacio()
					        .equalsIgnoreCase(configuracioDocsEntradaRDTO.getUniqueId().toString())) {
						configuacioActualizar.add(configuracioDocsEntradaRDTO);
					}
				}
			}
			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersones(clientEntity, serveisService, null,
			        configuacioActualizar, null, null, dadesExpedientBDTO, null, Resultat.ERROR_ESMENAR_EXPEDIENT);

			// Se construye el modelo para la llamada a la operaci??n de esmenar
			// expedient document
			// Se aplica patr??n saga con acciones compensatorias:
			// TODO Acciones compensatorias
			// 1. Registro
			// 2. Aportar documentaci??n
			if (CollectionUtils.isNotEmpty(expedientEsmena.getDocumentacio())) {
				docsEntradaRDTORespostaList = new ArrayList<DocsEntradaRDTO>();
				DocsEntradaRDTO docsEntradaRDTOResposta = null;
				for (DocumentRequeritCrearRDTO documentRequeritCrearRDTO : expedientEsmena.getDocumentacio()) {
					DocsEntradaRDTO docsEntradaRDTO = modelMapper.map(documentRequeritCrearRDTO, DocsEntradaRDTO.class);
					docsEntradaRDTO.setRevisio(RevisioApiParamValue.PENDENT.getInternalValue());
					docsEntradaRDTO.setOrigen(docsEntradaRDTO.getOrigen() == null ? OrigenApiParamValue.EXTERN.getInternalValue()
					        : docsEntradaRDTO.getOrigen());
					docsEntradaRDTO.setNou(NumberUtils.INTEGER_ONE);
					docsEntradaRDTO.setConfigDocEntrada(map.get(String.valueOf(docsEntradaRDTO.getConfigDocEntrada())).getId());
					docsEntradaRDTO.setDocsTercers(NumberUtils.INTEGER_ONE);

					// TODO En la esmena no se pueden aportar DR?
					CrearDocumentEntradaBDTO crearDocumentEntradaBDTO = new CrearDocumentEntradaBDTO(
					        dadesExpedientBDTO.getExpedientsRDTO().getId(), docsEntradaRDTO);
					docsEntradaRDTOResposta = serveisService.crearDocumentEntrada(crearDocumentEntradaBDTO);
					docsEntradaRDTORespostaList.add(docsEntradaRDTOResposta);
				}
			}

			idsDocsEnt = new ArrayList<>();
			if (CollectionUtils.isNotEmpty(docsEntradaRDTORespostaList)) {
				for (DocsEntradaRDTO docsEntrada : docsEntradaRDTORespostaList) {
					idsDocsEnt.add(docsEntrada.getId());
				}

				BigDecimal idAccio = null;

				// Registrar en Ariadna y coger el ID
				CrearRegistre registreEsmenaAlegacioExpedient = new CrearRegistre();
				registreEsmenaAlegacioExpedient.setExpedient(dadesExpedientBDTO.getExpedientsRDTO());
				registreEsmenaAlegacioExpedient.setDocuments(idsDocsEnt);
				ExpedientsRegistrarBDTO expedientsRegistrarBDTO = new ExpedientsRegistrarBDTO(registreEsmenaAlegacioExpedient);
				if (dadesExpedientBDTO.getExpedientsRDTO().getIdEstat()
				        .compareTo(TipusDocumentacioVinculadaApiParamValue.JUSTIFICANT_ESMENA.getInternalValue()) == 0) {
					idAccio = TipusDocumentacioVinculadaApiParamValue.JUSTIFICANT_ESMENA.getInternalValue();
				} else {
					idAccio = TipusDocumentacioVinculadaApiParamValue.JUSTIFICANT_ALLEGACIO.getInternalValue();
				}

				respostaCrearRegistreExpedient = serveisService.crearRegistre(expedientsRegistrarBDTO, idAccio);

				// Actualizar la lista de documentos
				DocsEntActualizarRegistre docsEntActualizarRegistreRDTO = new DocsEntActualizarRegistre();
				docsEntActualizarRegistreRDTO.setIdRegistre(respostaCrearRegistreExpedient.getRegistreAssentament().getId());
				docsEntActualizarRegistreRDTO.setListIdsDocsEnt(idsDocsEnt);
				serveisService.associarRegistreDocsEnt(docsEntActualizarRegistreRDTO);

				// Recoger Plantilla
				RespostaPlantillaDocVinculada respostaPlantillaDocVinculada = serveisService
				        .getPlantillaDocVinculada(dadesExpedientBDTO.getExpedientsRDTO().getConfiguracioDocumentacioProc(), idAccio);

				// Generar Justificant
				DocsTramitacioRDTO docsTramitacioRDTO = new DocsTramitacioRDTO();
				ConfiguracioDocsTramitacio configuracioDocsTramitacio = new ConfiguracioDocsTramitacio();
				configuracioDocsTramitacio.setSuportEnllac(respostaPlantillaDocVinculada.getPlantilla());
				configuracioDocsTramitacio.setId(respostaPlantillaDocVinculada.getId());
				docsTramitacioRDTO.setIdioma(IdiomaApiParamValue.CATALA.getInternalValue());
				docsTramitacioRDTO.setConfiguracioDocsTramitacio(configuracioDocsTramitacio);
				docsTramitacioRDTO.setConfigDocTramitacio(respostaPlantillaDocVinculada.getId());
				docsTramitacioRDTO.setOrigen(2);
				docsTramitacioRDTO.setDocsTercers(1);
				docsTramitacioRDTO.setSollicitudIdext(dadesExpedientBDTO.getExpedientsRDTO().getSollicitud());
				TipusMime tipusMime = new TipusMime();
				tipusMime.setId(TipusMimeApiParamValue.PDF.getInternalValue());
				DocsFisics docsFisics = new DocsFisics();
				docsFisics.setTipusMime(tipusMime);
				docsFisics.setTipus(TipusMimeApiParamValue.PDF.getInternalValue());
				docsTramitacioRDTO.setDocsFisics(docsFisics);
				CrearDocumentTramitacioBDTO crearDocumentTramitacioBDTO = new CrearDocumentTramitacioBDTO(
				        dadesExpedientBDTO.getExpedientsRDTO().getId(), dadesExpedientBDTO.getExpedientsRDTO().getSollicitud(),
				        docsTramitacioRDTO);
				respostaCrearJustificant = serveisService.guardarDocumentTramitacioJustificantPlantilla(crearDocumentTramitacioBDTO);

				vincularJustificanteAriadna(dadesExpedientBDTO, respostaCrearRegistreExpedient, respostaCrearJustificant.getCodi());
			}

			// Nos quedamos con una copia de los dades de operacio actuales del
			// expedient para restaurar en caso de error posterior
			if (CollectionUtils.isNotEmpty(dadesExpedientBDTO.getDadesOperacio())) {
				dadesEspecifiquesRDTOListBBDD = new ArrayList<>();
				for (DadaEspecificaBDTO dadaEspecificaBDTO : dadesExpedientBDTO.getDadesOperacio()) {
					dadesEspecifiquesRDTOListBBDD.add(dadaEspecificaBDTO.getDadaEspecifica());
				}
			}

			// TODO CAMBIAR OBJETOS PARA QUE NO LLEVEN SOLLICITUD, MAS
			// GENERICO
			// 3. Aportar valores de dades d'operaci??
			// Se obtienen los Dades d'Operaci?? del procedimiento y se valida
			// que los c??digos indicados existen. Se aprovecha para recuperar
			// los identificadores de los campos
			ValidateDadesOperacioResultat validateDadesOperacioResultat = null;
			if (CollectionUtils.isNotEmpty(expedientEsmena.getDadesOperacio())) {
				DadesOperacioCercaBDTO dadesOperacioCercaBDTO = new DadesOperacioCercaBDTO(
				        dadesExpedientBDTO.getExpedientsRDTO().getProcedimentIdext(), null);
				RespostaDadesOperacioCercaBDTO respostaDadesOperacioCercaBDTO = serveisService.cercaDadesOperacio(dadesOperacioCercaBDTO);
				validateDadesOperacioResultat = ServeisRestControllerValidationHelper.validateDadesOperacioEsmenarExpedient(
				        expedientEsmena.getDadesOperacio(), respostaDadesOperacioCercaBDTO.getDadesGrupsRDTOList(),
				        dadesExpedientBDTO.getExpedientsRDTO().getId());
			}
			actualitzarDadesSollicitud = new ActualitzarDadesSollicitud();
			actualitzarDadesSollicitud.setExpedient(dadesExpedientBDTO.getExpedientsRDTO());
			actualitzarDadesSollicitud.setEsmena(Boolean.TRUE);
			actualitzarDadesSollicitud.setComentari(expedientEsmena.getComentari());
			if (validateDadesOperacioResultat != null) {
				actualitzarDadesSollicitud.setDadesEspecifiques(validateDadesOperacioResultat.getDadesEspecifiquesRDTOList());
			}
			ExpedientsActualitzarBDTO expedientsActualitzarBDTO = new ExpedientsActualitzarBDTO(actualitzarDadesSollicitud);
			serveisService.actualitzarSolicitudExpedient(expedientsActualitzarBDTO);

			// 4. Insertar comentario de origen externo
			ComentariCreacioAccio comentariCreacioAccio = new ComentariCreacioAccio();
			comentariCreacioAccio.setComentari(expedientEsmena.getComentari());
			ComentarisCrearAccioBDTO comentarisCrearAccioBDTO = new ComentarisCrearAccioBDTO(comentariCreacioAccio,
			        dadesExpedientBDTO.getExpedientsRDTO().getId(),
			        AccioTramitadorApiParamValue.RESPONDRE_REQUERIMENT_O_TRAMIT_ALLEGACIONS_O_IP.getInternalValue());
			serveisService.crearComentariAccio(comentarisCrearAccioBDTO);

			// 5. Cambiar el estado del expediente
			ExpedientCanviEstat expedientCanviEstat = modelMapper.map(dadesExpedientBDTO.getExpedientsRDTO(), ExpedientCanviEstat.class);

			// obtenemos el idAccioEstat futuro
			List<AccionsEstatsRDTO> accionsEstatsRDTOList = serveisService.cercaTransicioCanviEstat(
			        AccioTramitadorApiParamValue.RESPONDRE_REQUERIMENT_O_TRAMIT_ALLEGACIONS_O_IP.getInternalValue(),
			        dadesExpedientBDTO.getExpedientsRDTO().getIdEstat());

			// debe existir una transicion posible para el estado actual
			ServeisRestControllerValidationHelper.validateTransicioAccioDisponibleExpedient(accionsEstatsRDTOList,
			        AccioTramitadorApiParamValue.RESPONDRE_REQUERIMENT_O_TRAMIT_ALLEGACIONS_O_IP, Resultat.ERROR_ESMENAR_EXPEDIENT);

			expedientCanviEstat.setIdAccioEstat(accionsEstatsRDTOList.get(0).getId());

			ExpedientsCanviarEstatBDTO expedientsCanviarEstatBDTO = new ExpedientsCanviarEstatBDTO(expedientCanviEstat,
			        dadesExpedientBDTO.getExpedientsRDTO().getId());
			serveisService.canviarEstatExpedient(expedientsCanviarEstatBDTO);

			// Avisos
			GestionarAvisosPerAccio gestionarAvisosPerAccio = new GestionarAvisosPerAccio();
			gestionarAvisosPerAccio.setIdAccioEstat(accionsEstatsId);
			GestionarAvisosPerAccioBDTO gestionarAvisosPerAccioBDTO = new GestionarAvisosPerAccioBDTO(gestionarAvisosPerAccio,
			        dadesExpedientBDTO.getExpedientsRDTO().getId());
			serveisService.gestionarAvisosPerAccio(gestionarAvisosPerAccioBDTO);

		} catch (GPAApiParamValidationException e) {
			log.error("esmenarExpedient(BigDecimal, ExpedientEsmenaRDTO)", e);// $NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
			resultatAudit = "KO";
			ex = e;
		} catch (Exception e) {
			log.error("esmenarExpedient(BigDecimal, ExpedientEsmenaRDTO)", e); // $NON-NLS-1$
			// si hay fallo no debemos devolver la lista de documentacio
			// aportada
			docsEntradaRDTORespostaList = null;
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_ESMENAR_EXPEDIENT, e);
			resultatAudit = "KO";
			ex = e;
		} finally {
			respostaExpedientsEsmenarBDTO = new RespostaExpedientsEsmenarBDTO(
			        dadesExpedientBDTO != null ? dadesExpedientBDTO.getExpedientsRDTO() : null,
			        respostaCrearJustificant != null ? respostaCrearJustificant.getId() : null, respostaResultatBDTO,
			        docsEntradaRDTORespostaList != null ? docsEntradaRDTORespostaList : null);
			respostaEsmenarExpedientRDTO = modelMapper.map(respostaExpedientsEsmenarBDTO, RespostaEsmenarExpedientRDTO.class);

			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient + "/esmena");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Respondre a requeriment o tr??mit d'al??legacions o IP");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, expedientEsmena, respostaEsmenarExpedientRDTO, ex);
		}

		if (log.isDebugEnabled()) {
			log.debug("esmenarExpedient(BigDecimal, ExpedientEsmenaRDTO) - fi"); //$NON-NLS-1$
		}

		return respostaEsmenarExpedientRDTO;
	}

	/**
	 * Abandonar expedient.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @param accio
	 *            the accio
	 * @param expedientAbandonament
	 *            the expedient abandonament
	 * @return the resposta abandonar expedient RDTO
	 * @throws GPAServeisServiceException
	 */
	@PostMapping("/expedients/{codiExpedient}/{accio}")
	@ApiOperation(nickname = "abandonarExpedientPortal", value = "Desistir/Renunciar l'expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaAbandonarExpedientRDTO abandonarExpedient(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Acci?? a realitzar amb l'expedient", required = true, allowableValues = AccioAbandonarApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES) @PathVariable String accio,
	        @ApiParam(value = "Dades del abandonament de l'expedient") @RequestBody ExpedientAbandonamentRDTO expedientAbandonament)
	        throws GPAServeisServiceException {

		if (log.isDebugEnabled()) {
			log.debug("abandonarExpedient(BigDecimal, String, ExpedientAbandonamentRDTO) - inici"); //$NON-NLS-1$
		}

		String resultatAudit = "OK";
		Throwable ex = null;

		RespostaAbandonarExpedientRDTO respostaAbandonarExpedientRDTO = null;
		DadesExpedientBDTO dadesExpedientBDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_DESISTIR_RENUNCIAR_EXPEDIENT);
		try {
			// El codi del expediente debe existir
			dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO, Resultat.ERROR_DESISTIR_RENUNCIAR_EXPEDIENT);

			// Registrar expediente si la acci??n es permitida
			BigDecimal accionsEstatsId = ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
			        AccioTramitadorApiParamValue.DESISTIR_RENUNCIAR, Resultat.ERROR_DESISTIR_RENUNCIAR_EXPEDIENT);

			// 1 - validar que la persona logueada esta dentro de los
			// interesados
			ServeisRestControllerValidationHelper.validateUsuariLogueadoInteressades(clientEntity,
			        dadesExpedientBDTO.getPersonesInteressades(), dadesExpedientBDTO.getSollicitant(), dadesExpedientBDTO.getRepresentant(),
			        Resultat.ERROR_DESISTIR_RENUNCIAR_EXPEDIENT);

			// Cambio de estado del expediente
			ExpedientCanviEstat expedientCanviEstat = modelMapper.map(dadesExpedientBDTO.getExpedientsRDTO(), ExpedientCanviEstat.class);

			// obtenemos el idAccioEstat futuro
			List<AccionsEstatsRDTO> accionsEstatsRDTOList = serveisService.cercaTransicioCanviEstat(
			        AccioTramitadorApiParamValue.DESISTIR_RENUNCIAR.getInternalValue(),
			        dadesExpedientBDTO.getExpedientsRDTO().getIdEstat());

			// debe existir una transicion posible para el estado actual
			ServeisRestControllerValidationHelper.validateTransicioAccioDisponibleExpedient(accionsEstatsRDTOList,
			        AccioTramitadorApiParamValue.DESISTIR_RENUNCIAR, Resultat.ERROR_DESISTIR_RENUNCIAR_EXPEDIENT);

			expedientCanviEstat.setIdAccioEstat(accionsEstatsRDTOList.get(0).getId());

			ExpedientsCanviarEstatBDTO expedientsCanviarEstatBDTO = new ExpedientsCanviarEstatBDTO(expedientCanviEstat,
			        dadesExpedientBDTO.getExpedientsRDTO().getId());
			serveisService.canviarEstatExpedient(expedientsCanviarEstatBDTO);

			// Crear comentario
			ComentariCreacioAccio comentariCreacioAccio = new ComentariCreacioAccio();
			comentariCreacioAccio.setComentari(expedientAbandonament.getComentari());
			comentariCreacioAccio.setOperacio(accio);
			ComentarisCrearAccioBDTO comentarisCrearAccioBDTO = new ComentarisCrearAccioBDTO(comentariCreacioAccio,
			        dadesExpedientBDTO.getExpedientsRDTO().getId(), AccioTramitadorApiParamValue.DESISTIR_RENUNCIAR.getInternalValue());
			serveisService.crearComentariAccio(comentarisCrearAccioBDTO);

			// Crear aviso
			GestionarAvisosPerAccio gestionarAvisosPerAccio = new GestionarAvisosPerAccio();
			gestionarAvisosPerAccio.setIdAccioEstat(accionsEstatsId);
			GestionarAvisosPerAccioBDTO gestionarAvisosPerAccioBDTO = new GestionarAvisosPerAccioBDTO(gestionarAvisosPerAccio,
			dadesExpedientBDTO.getExpedientsRDTO().getId());
			serveisService.gestionarAvisosPerAccio(gestionarAvisosPerAccioBDTO);

		} catch (GPAApiParamValidationException e) {
			log.error("abandonarExpedient(BigDecimal, String, ExpedientAbandonamentRDTO)", e);// $NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
		} catch (Exception e) {
			log.error("abandonarExpedient(BigDecimal, String, ExpedientAbandonamentRDTO)", e); // $NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_DESISTIR_RENUNCIAR_EXPEDIENT, e);
			resultatAudit = "KO";
			ex = e;
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient + "/" + accio);
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("POST");
			auditServeisBDTO.setValueAccio("Desistir/Renunciar l'expedient");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, expedientAbandonament, respostaResultatBDTO, ex);
		}

		RespostaExpedientsAbandonarBDTO respostaExpedientsAbandonarBDTO = new RespostaExpedientsAbandonarBDTO(
		        dadesExpedientBDTO != null ? dadesExpedientBDTO.getExpedientsRDTO() : null, respostaResultatBDTO);
		respostaAbandonarExpedientRDTO = modelMapper.map(respostaExpedientsAbandonarBDTO, RespostaAbandonarExpedientRDTO.class);

		if (log.isDebugEnabled()) {
			log.debug("abandonarExpedient(BigDecimal, String, ExpedientAbandonamentRDTO) - fi"); //$NON-NLS-1$
		}

		return respostaAbandonarExpedientRDTO;
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
	@GetMapping(value = "/expedients/{codiExpedient}/documents/{idDocument}/signat", produces = "*/*")
	@ApiOperation(nickname = "descarregarDocumentSignatExpedientPortal", value = "Descarregar document signat de l'expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public ResponseEntity<byte[]> descarregarDocumentSignatExpedient(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Identificador del document", required = true) @PathVariable BigDecimal idDocument)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		Throwable ex = null;

		ResponseEntity<byte[]> resposta = null;
		try {

			// El codi del expediente debe existir
			DadesExpedientBDTO dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO,
			        Resultat.ERROR_DESCARREGAR_DOCUMENT_EXPEDIENT_SIGNAT);

			// El id del documento debe existir y pertenecer al expediente
			// indicado, adem??s debe tener un registro de ultima signatura
			// TODO Asegurar que el documento consultado es el firmado dentro
			// del objeto documental
			DocsTramitacioRDTO docsTramitacioRDTO = serveisService.consultarDadesDocumentGenerat(idDocument);
			ServeisRestControllerValidationHelper.validateDocumentGeneratSignat(docsTramitacioRDTO, dadesExpedientBDTO,
			        Resultat.ERROR_DESCARREGAR_DOCUMENT_EXPEDIENT_SIGNAT);

			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersones(clientEntity, serveisService, null, null, null,
			        docsTramitacioRDTO, dadesExpedientBDTO, null, Resultat.ERROR_DESCARREGAR_DOCUMENT_EXPEDIENT_SIGNAT);

			byte[] result = serveisService.descarregarDocumentExpedientSignat(docsTramitacioRDTO.getUltimaSignatura());

			HttpHeaders headers = new HttpHeaders();
			headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
			headers.add("Pragma", "no-cache");
			headers.add("Expires", "0");
			headers.add("Content-Length", String.valueOf(result.length));
			headers.add("Content-Type", MediaType.APPLICATION_OCTET_STREAM_VALUE);
			String filename = docsTramitacioRDTO.getDocsFisics().getNom();
			headers.add("Content-Disposition", "attachment; filename=\"" + filename + "\"");

			resposta = new ResponseEntity<byte[]>(result, headers, HttpStatus.OK);

		} catch (GPAApiParamValidationException e) {
			log.error("descarregarDocumentSignatExpedient(String, BigDecimal)", e); //$NON-NLS-1$ type
			resposta = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
			resultatAudit = "KO";
			ex = e;
		} catch (Exception e) {
			log.error("descarregarDocumentSignatExpedient(String, BigDecimal)", e); //$NON-NLS-1$
			resposta = new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
			resultatAudit = "KO";
			ex = e;
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient + "/documents/" + idDocument + "/signat");
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Descarregar document signat de l'expedient");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, null, resposta, ex);
		}
		return resposta;
	}

	/**
	 * Consultar dades document.
	 *
	 * @param codiExpedient
	 *            the codi expedient
	 * @param configuracio
	 *            the configuracio
	 * @param csvDocument
	 *            the csv document
	 * @return the resposta consulta documentacio RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping("/expedients/{codiExpedient}/documentacio/{configuracio}/{csvDocument}")
	@ApiOperation(nickname = "consultarDadesDocumentPortal", value = "Consultar les dades del document", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaConsultaDocumentacioRDTO consultarDadesDocument(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Indicador per a especificar si la documentaci?? ??s aportada o generada", required = true) @PathVariable String configuracio,
	        @ApiParam(value = "Codi CSV del document", required = true) @PathVariable String csvDocument)
	        throws GPAServeisServiceException {

		String resultatAudit = "OK";
		Throwable ex = null;

		Boolean esAportada = null;
		DocsEntradaRDTO docsEntradaRDTO = null;
		DocsTramitacioRDTO docsTramitacioRDTO = null;
		DadesExpedientBDTO dadesExpedientBDTO = null;

		RespostaConsultaDocumentacioRDTO respostaConsultaDocumentacioRDTO = new RespostaConsultaDocumentacioRDTO();

		try {
			// Datos principales del expedient
			dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			// El c??digo del expediente debe ser v??lido
			if (dadesExpedientBDTO.getExpedientsRDTO() == null) {
				throw new GPAServeisServiceException(ErrorPrincipal.ERROR_EXPEDIENTS_NOT_FOUND.getDescripcio());
			}

			ConfiguracioApiParamValueTranslator configuracioApiParamValueTranslator = new ConfiguracioApiParamValueTranslator();
			ConfiguracioApiParamValue configuracioApiParamValue = configuracioApiParamValueTranslator.getEnumByApiParamValue(configuracio);
			switch (configuracioApiParamValue) {
			case APORTADA:
				esAportada = Boolean.TRUE;

				break;
			case GENERADA:
				esAportada = Boolean.FALSE;

				break;
			default:
				break;

			}

			// consultamos el documento con visibilidad activada y
			// posteriormente
			// vemos si el usuario logado tiene acceso a ese doc
			BigDecimal visibilitat = BigDecimal.ONE;

			if (BooleanUtils.isTrue(esAportada)) {
				docsEntradaRDTO = serveisService.consultarDadesDocumentAportatPerCodiCSV(csvDocument, visibilitat);
				if (docsEntradaRDTO == null) {
					throw new GPAServeisServiceException(ErrorPrincipal.ERROR_DOCUMENTS_NOT_FOUND.getDescripcio());
				}
				if (!docsEntradaRDTO.getDocumentacio().equals(dadesExpedientBDTO.getExpedientsRDTO().getDocumentacioIdext())) {
					throw new GPAServeisServiceException(ErrorPrincipal.ERROR_DOCUMENTS_NOT_IN_EXPEDIENT.getDescripcio());
				}
				respostaConsultaDocumentacioRDTO = modelMapper.map(docsEntradaRDTO, RespostaConsultaDocumentacioRDTO.class);

			} else {
				docsTramitacioRDTO = serveisService.consultarDadesDocumentGeneratPerCodiCSV(csvDocument, visibilitat);
				if (docsTramitacioRDTO == null) {
					throw new GPAServeisServiceException(ErrorPrincipal.ERROR_DOCUMENTS_NOT_FOUND.getDescripcio());
				}
				if (!docsTramitacioRDTO.getDocumentacio().equals(dadesExpedientBDTO.getExpedientsRDTO().getDocumentacioIdext())) {
					throw new GPAServeisServiceException(ErrorPrincipal.ERROR_DOCUMENTS_NOT_IN_EXPEDIENT.getDescripcio());
				}
				respostaConsultaDocumentacioRDTO = modelMapper.map(docsTramitacioRDTO, RespostaConsultaDocumentacioRDTO.class);
			}

			// 1 - validamos que el usuario logado pertenezca al expediente
			// 2 - validamos si es tercera persona su visibilidad
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersones(clientEntity, serveisService, null, null,
			        docsEntradaRDTO, docsTramitacioRDTO, dadesExpedientBDTO, null, Resultat.ERROR_CONSULTAR_DOCUMENT);

		} catch (GPAApiParamValidationException e) {
			log.error("consultarDadesDocument(String)", e); //$NON-NLS-1$
			throw new GPAServeisServiceException(e.getResultat().getDescripcio());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			resultatAudit = "KO";
			ex = e;
			throw e;
		} finally {
			AuditServeisBDTO auditServeisBDTO = auditServeisService.rellenarAuditoria();

			auditServeisBDTO.setMappingAccio("/expedients/" + codiExpedient + "/documentacio/" + configuracio + "/" + csvDocument);
			auditServeisBDTO.setResultat(resultatAudit);
			auditServeisBDTO.setTipusPeticio("GET");
			auditServeisBDTO.setValueAccio("Cerca d'expedients");

			auditServeisService.registrarAuditServeisPortal(auditServeisBDTO, null, respostaConsultaDocumentacioRDTO, ex);
		}

		return respostaConsultaDocumentacioRDTO;
	}

	/**
	 * @param dadesExpedientBDTO
	 * @param respostaCrearRegistreExpedient
	 * @param respostaCrearJustificant
	 * @throws GPAServeisServiceException
	 */
	private void vincularJustificanteAriadna(DadesExpedientBDTO dadesExpedientBDTO,
	        RespostaCrearRegistreExpedient respostaCrearRegistreExpedient, String idJustificantSignatGestorDocumental)
	        throws GPAServeisServiceException {

		RegistreDocumentacioExpedient registreDocumentacioExpedient = new RegistreDocumentacioExpedient();

		try {

			registreDocumentacioExpedient.setIdJustificant(idJustificantSignatGestorDocumental);
			registreDocumentacioExpedient.setNumAss(respostaCrearRegistreExpedient.getRegistreAssentament().getCodi());

			serveisService.registreDocumentacioAriadna(registreDocumentacioExpedient);
		} catch (Exception e) {
			log.error("registrarSolicitudExpedient(BigDecimal): Error retornAssentament", e);// $NON-NLS-1$

			// almacenamos el indicador de que esta pendiente el retorno en el
			// expediente para que continue el registro o la accion
			// correctamente

			dadesExpedientBDTO.getExpedientsRDTO().setPendentRetorn(NumberUtils.INTEGER_ONE);
			serveisService.actualitzarExpedient(dadesExpedientBDTO.getExpedientsRDTO());
		}
	}

	/**
	 * Incorporar tercera persona
	 * 
	 * @param codiExpedient
	 * @param personaImplicada
	 * @return
	 */
	@PostMapping("/expedients/{codiExpedient}/persones")
	@ApiOperation(nickname = "incorporarTerceraPersonaPortal", value = "Incorporar tercera persona a la sol??licitud de l'expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaCrearTerceraPersonaRDTO incorporarTerceraPersona(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Dades de la actualitzaci?? de l'expedient", required = true) @RequestBody CrearTerceraPersonaRDTO personaImplicada) {
		if (log.isDebugEnabled()) {
			log.debug("incorporarTerceraPersona(BigDecimal, CrearTerceraPersonaRDTO) - inici"); //$NON-NLS-1$
		}

		RespostaCrearTerceraPersonaRDTO respostaCrearTerceraPersonaRDTO = null;
		PersonesSollicitudRDTO returnPersonesSollicitudRDTO = null;
		DadesExpedientBDTO dadesExpedientBDTO = null;
		TerceraPersonaSollicitudRDTO terceraPersonaSollicitudRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_INCORPORAR_TERCERA_PERSONA_EXPEDIENT);
		try {
			// El codi del expediente debe existir ( se consultan mas datos que
			// luego son necesarios para comprobar la persona existente en el
			// expediente)
			dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO,
			        Resultat.ERROR_INCORPORAR_TERCERA_PERSONA_EXPEDIENT);

			ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
			        AccioTramitadorApiParamValue.INFORMAR_DADES_EXPEDIENT, Resultat.ERROR_INCORPORAR_TERCERA_PERSONA_EXPEDIENT);

			DadesProcedimentBDTO dadesProcedimentBDTO = serveisService
			        .consultarDadesBasiquesProcediment(dadesExpedientBDTO.getExpedientsRDTO().getProcedimentIdext());

			// 1 - validamos que la relacion indicada no sea vacia y que exista
			// en el procedimiento
			// 2 - validamos que el usuario logado pertenezca al expediente
			// 3 - validamos si es tercera persona su visibilidad
			ServeisRestControllerValidationHelper.validateRelacioTerceresPersones(personaImplicada.getPersona(), dadesProcedimentBDTO,
			        Resultat.ERROR_INCORPORAR_TERCERA_PERSONA_EXPEDIENT);
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersones(clientEntity, serveisService, null, null, null, null,
			        dadesExpedientBDTO, null, Resultat.ERROR_INCORPORAR_TERCERA_PERSONA_EXPEDIENT);

			// Se construye el modelo para la llamada a la operaci??n de
			// actualizaci??n
			terceraPersonaSollicitudRDTO = modelMapper.map(personaImplicada, TerceraPersonaSollicitudRDTO.class);
			terceraPersonaSollicitudRDTO.getPersonesSollicitudRDTO().setEsborrany(1);

			terceraPersonaSollicitudRDTO.getPersonesSollicitudRDTO().setSollicitud(dadesExpedientBDTO.getExpedientsRDTO().getSollicitud());
			returnPersonesSollicitudRDTO = serveisService
			        .incorporarTerceraPersona(terceraPersonaSollicitudRDTO.getPersonesSollicitudRDTO());

		} catch (GPAApiParamValidationException e) {
			log.error("incorporarTerceraPersona(BigDecimal, CrearTerceraPersonaRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
		} catch (Exception e) {
			log.error("incorporarTerceraPersona(BigDecimal, CrearTerceraPersonaRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler
			        .handleException(Resultat.ERROR_INCORPORAR_TERCERA_PERSONA_EXPEDIENT, e);
		}

		RespostaCrearTerceraPersonaBDTO respostaCrearTerceraPersonaBDTO = new RespostaCrearTerceraPersonaBDTO(returnPersonesSollicitudRDTO,
		        dadesExpedientBDTO != null ? dadesExpedientBDTO.getExpedientsRDTO() : null, respostaResultatBDTO);
		respostaCrearTerceraPersonaRDTO = modelMapper.map(respostaCrearTerceraPersonaBDTO, RespostaCrearTerceraPersonaRDTO.class);

		if (log.isDebugEnabled()) {
			log.debug("incorporarTerceraPersona(BigDecimal, CrearTerceraPersonaRDTO) - fi"); //$NON-NLS-1$
		}
		return respostaCrearTerceraPersonaRDTO;
	}

	/**
	 * Actualitzar tercera persona
	 * 
	 * @param codiExpedient
	 * @param personaImplicada
	 * @return
	 */
	@PutMapping("/expedients/{codiExpedient}/persones")
	@ApiOperation(nickname = "actualitzarTerceraPersonaPortal", value = "Actualitza tercera persona en la sol??licitud de l'expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaActualitzarTerceraPersonaRDTO actualitzarTerceraPersona(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Dades de la actualitzaci?? de l'expedient", required = true) @RequestBody ActualitzarTerceraPersonaRDTO personaImplicada) {
		if (log.isDebugEnabled()) {
			log.debug("actualitzarTerceraPersona(BigDecimal, ActualitzarTerceraPersonaRDTO) - inici"); //$NON-NLS-1$
		}

		RespostaActualitzarTerceraPersonaRDTO respostaActualitzarTerceraPersonaRDTO = null;
		PersonesSollicitudRDTO returnPersonesSollicitudRDTO = null;
		DadesExpedientBDTO dadesExpedientBDTO = null;
		TerceraPersonaSollicitudRDTO terceraPersonaSollicitudRDTO = null;
		PersonesSollicitudRDTO personesSollicitudRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_ACTUALITZAR_TERCERA_PERSONA_EXPEDIENT);
		try {
			// El codi del expediente debe existir
			dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO,
			        Resultat.ERROR_ACTUALITZAR_TERCERA_PERSONA_EXPEDIENT);

			ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
			        AccioTramitadorApiParamValue.INFORMAR_DADES_EXPEDIENT, Resultat.ERROR_ACTUALITZAR_TERCERA_PERSONA_EXPEDIENT);

			// El id de la tercera persona debe existir y corresponderse con una
			// persona implicada en el expediente
			personesSollicitudRDTO = serveisService.consultarDadesPersonaSollicitud(personaImplicada.getPersona().getId());
			ServeisRestControllerValidationHelper.validatePersonaImplicada(dadesExpedientBDTO.getPersonesImplicades(),
			        personesSollicitudRDTO.getPersones().getDocumentsIdentitat().getNumeroDocument(),
			        Resultat.ERROR_ACTUALITZAR_TERCERA_PERSONA_EXPEDIENT);

			DadesProcedimentBDTO dadesProcedimentBDTO = serveisService
			        .consultarDadesBasiquesProcediment(dadesExpedientBDTO.getExpedientsRDTO().getProcedimentIdext());
			// 1 - validamos que la relacion indicada no sea vacia y que exista
			// en el procedimiento
			// 2 - validamos que el usuario logado pertenezca al expediente
			// 3 - validamos si es tercera persona su visibilidad
			ServeisRestControllerValidationHelper.validateRelacioTerceresPersones(personaImplicada.getPersona(), dadesProcedimentBDTO,
			        Resultat.ERROR_ACTUALITZAR_TERCERA_PERSONA_EXPEDIENT);
			ServeisRestControllerVisibilitatHelper.validateVisibilitatTerceresPersones(clientEntity, serveisService, null, null, null, null,
			        dadesExpedientBDTO, null, Resultat.ERROR_ACTUALITZAR_TERCERA_PERSONA_EXPEDIENT);

			// Se construye el modelo para la llamada a la operaci??n de
			// actualizaci??n
			terceraPersonaSollicitudRDTO = modelMapper.map(personaImplicada, TerceraPersonaSollicitudRDTO.class);
			terceraPersonaSollicitudRDTO.getPersonesSollicitudRDTO().setEsborrany(1);

			terceraPersonaSollicitudRDTO.getPersonesSollicitudRDTO().setSollicitud(dadesExpedientBDTO.getExpedientsRDTO().getSollicitud());
			returnPersonesSollicitudRDTO = serveisService
			        .incorporarTerceraPersona(terceraPersonaSollicitudRDTO.getPersonesSollicitudRDTO());

		} catch (GPAApiParamValidationException e) {
			log.error("actualitzarTerceraPersona(BigDecimal, ActualitzarTerceraPersonaRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
		} catch (Exception e) {
			log.error("actualitzarTerceraPersona(BigDecimal, ActualitzarTerceraPersonaRDTO)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler
			        .handleException(Resultat.ERROR_ACTUALITZAR_TERCERA_PERSONA_EXPEDIENT, e);
		}

		RespostaActualitzarTerceraPersonaBDTO respostaActualitzarTerceraPersonaBDTO = new RespostaActualitzarTerceraPersonaBDTO(
		        returnPersonesSollicitudRDTO, dadesExpedientBDTO != null ? dadesExpedientBDTO.getExpedientsRDTO() : null,
		        respostaResultatBDTO);
		respostaActualitzarTerceraPersonaRDTO = modelMapper.map(respostaActualitzarTerceraPersonaBDTO,
		        RespostaActualitzarTerceraPersonaRDTO.class);

		if (log.isDebugEnabled()) {
			log.debug("actualitzarTerceraPersona(BigDecimal, ActualitzarTerceraPersonaRDTO) - fi"); //$NON-NLS-1$
		}
		return respostaActualitzarTerceraPersonaRDTO;
	}

	@DeleteMapping("/expedients/{codiExpedient}/persones/{idPersona}")
	@ApiOperation(nickname = "esborrarTerceraPersonaPortal", value = "Esborrar una persona implicada en l'expedient", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "gestor", value = "Perfil usuari gestor") }) })
	public RespostaEsborrarTerceraPersonaRDTO esborrarTerceraPersona(
	        @ApiParam(value = "Codi de l'expedient", required = true) @PathVariable String codiExpedient,
	        @ApiParam(value = "Identificador de la persona", required = true) @PathVariable BigDecimal idPersona) {
		if (log.isDebugEnabled()) {
			log.debug("esborrarTerceraPersona(String, BigDecimal) - inici"); //$NON-NLS-1$
		}
		RespostaEsborrarTerceraPersonaRDTO respostaEsborrarTerceraPersonaRDTO = null;
		DadesExpedientBDTO dadesExpedientBDTO = null;
		PersonesSollicitudRDTO personesSollicitudRDTO = null;
		RespostaResultatBDTO respostaResultatBDTO = new RespostaResultatBDTO(Resultat.OK_ESBORRAR_TERCERA_PERSONA);

		try {
			// El codi del expediente debe existir
			dadesExpedientBDTO = serveisService.consultarDadesBasiquesPerVisibilitatExpedient(
			        ExpedientsApiParamToInternalMapper.getCodiInternalValue(codiExpedient, expedientsIdOrgan));
			ServeisRestControllerValidationHelper.validateExpedient(dadesExpedientBDTO, Resultat.ERROR_ESBORRAR_TERCERA_PERSONA);

			// 1 - validar que la persona logueada esta dentro de los
			// interesados
			ServeisRestControllerValidationHelper.validateUsuariLogueadoInteressades(clientEntity,
			        dadesExpedientBDTO.getPersonesInteressades(), dadesExpedientBDTO.getSollicitant(), dadesExpedientBDTO.getRepresentant(),
			        Resultat.ERROR_ESBORRAR_TERCERA_PERSONA);

			// El id de la tercera persona debe existir y corresponderse con una
			// persona implicada en el expediente
			personesSollicitudRDTO = serveisService.consultarDadesPersonaSollicitud(idPersona);

			ServeisRestControllerValidationHelper.validatePersonesSollicitudIsNotNull(personesSollicitudRDTO, idPersona.toString(),
			        Resultat.ERROR_ESBORRAR_TERCERA_PERSONA);

			// El id de la tercera persona debe existir y corresponderse con una
			// persona implicada en el expediente
			ServeisRestControllerValidationHelper.validatePersonaImplicada(dadesExpedientBDTO.getPersonesImplicades(),
			        personesSollicitudRDTO.getPersones().getDocumentsIdentitat().getNumeroDocument(),
			        Resultat.ERROR_ESBORRAR_TERCERA_PERSONA);

			// Validar si es sol??licitant principal, no se podra esborrar
			ServeisRestControllerValidationHelper.validatePersonaSollicitantprincipal(personesSollicitudRDTO,
			        Resultat.ERROR_ESBORRAR_TERCERA_PERSONA);

			// Esborrar tercera persona si la acci??n es permitida
			ServeisRestControllerValidationHelper.validateAccioDisponibleExpedient(dadesExpedientBDTO,
			        AccioTramitadorApiParamValue.INFORMAR_DADES_EXPEDIENT, Resultat.ERROR_ESBORRAR_TERCERA_PERSONA);

			serveisService.esborrarPersonaSollicitud(idPersona);

		} catch (GPAApiParamValidationException e) {
			log.error("esborrarTerceraPersona(String, BigDecimal)", e); //$NON-NLS-1$
			respostaResultatBDTO = new RespostaResultatBDTO(e);
		} catch (Exception e) {
			log.error("esborrarTerceraPersona(String, BigDecimal)", e); //$NON-NLS-1$
			respostaResultatBDTO = ServeisRestControllerExceptionHandler.handleException(Resultat.ERROR_ESBORRAR_TERCERA_PERSONA, e);
		}

		ExpedientsRDTO expedientsRDTO = (dadesExpedientBDTO != null) ? dadesExpedientBDTO.getExpedientsRDTO() : null;
		RespostaEsborrarTerceraPersonaBDTO respostaEsborrarTerceraPersonaBDTO = new RespostaEsborrarTerceraPersonaBDTO(expedientsRDTO,
		        personesSollicitudRDTO, respostaResultatBDTO);
		respostaEsborrarTerceraPersonaRDTO = modelMapper.map(respostaEsborrarTerceraPersonaBDTO, RespostaEsborrarTerceraPersonaRDTO.class);

		if (log.isDebugEnabled()) {
			log.debug("esborrarTerceraPersona(String, BigDecimal) - fi"); //$NON-NLS-1$
		}
		return respostaEsborrarTerceraPersonaRDTO;
	}

	/**
	 * Consultar les dades de persones del procediment.
	 *
	 * @param idProcediment
	 *            the id procediment
	 * @param usuari
	 * @return the resposta consulta procediments RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping("/procediments/{idProcediment}/tramits/{codiTramit}/persones")
	@ApiOperation(nickname = "consultarDadesPersonesProcediment", value = "Consultar les dades de persones del procediment", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaConsultaPersonesProcedimentRDTO consultarDadesPersonesProcediment(
	        @ApiParam(value = "Identificador del procediment", required = true) @PathVariable BigDecimal idProcediment,
	        @ApiParam(value = "Codi del tr??mit", allowableValues = TramitOvtApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES, required = true) @PathVariable String codiTramit)
	        throws GPAServeisServiceException {

		RespostaConsultaPersonesProcedimentRDTO respostaConsultaPersonesProcedimentRDTO = new RespostaConsultaPersonesProcedimentRDTO();

		DadesProcedimentBDTO dadesProcedimentBDTO = serveisService.consultarDadesProcediment(idProcediment);
		// El id del Procedimiento debe ser v??lido
		if (dadesProcedimentBDTO.getProcedimentsRDTO() == null) {
			throw new GPAServeisServiceException(ErrorPrincipal.ERROR_PROCEDIMENTS_NOT_FOUND.getDescripcio());
			// TODO return 404
		}

		// Informaci??n del Tr??mite
		BigDecimal iinternalIdTramitOvt = DadesOperacioApiParamToInternalMapper.getTramitOvtInternalValue(codiTramit);
		TramitsOvtCercaBDTO tramitsOvtCercaBDTO = new TramitsOvtCercaBDTO(iinternalIdTramitOvt);
		es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.TramitsOvtRDTO internalTramitsOvtRDTO = serveisService
		        .consultarDadesTramitOvt(tramitsOvtCercaBDTO);
		es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO tramitsOvtRDTO = modelMapper.map(internalTramitsOvtRDTO,
		        es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO.class);
		respostaConsultaPersonesProcedimentRDTO.setTramit(tramitsOvtRDTO);

		DadesPersonesProcedimentBDTO dadesPersonesProcedimentBDTO = new DadesPersonesProcedimentBDTO();
		dadesPersonesProcedimentBDTO.setProcedimentsRDTO(dadesProcedimentBDTO.getProcedimentsRDTO());
		dadesPersonesProcedimentBDTO.setIdTramitOvt(iinternalIdTramitOvt);

		PersonesProcedimentConsultaRDTO personesProcedimentConsultaRDTO = modelMapper.map(dadesPersonesProcedimentBDTO,
		        PersonesProcedimentConsultaRDTO.class);

		respostaConsultaPersonesProcedimentRDTO
		        .setTerceresPersonesImplicades(personesProcedimentConsultaRDTO.getTerceresPersonesImplicades());

		return respostaConsultaPersonesProcedimentRDTO;
	}

	/**
	 * Consultar les dades del tramit del procediment.
	 *
	 * @param idProcediment
	 *            the id procediment
	 * @param usuari
	 * @return the resposta consulta procediments RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	@GetMapping("/procediments/{idProcediment}/tramits/{codiTramit}")
	@ApiOperation(nickname = "consultarDadesTramit", value = "Consultar les dades del tramit", tags = {
	        "Serveis Portal API" }, extensions = { @Extension(name = "x-imi-roles", properties = {
	                @ExtensionProperty(name = "consulta", value = "Perfil usuari consulta") }) })
	public RespostaConsultaTramitProcedimentRDTO consultarDadesTramit(
	        @ApiParam(value = "Identificador del procediment", required = true) @PathVariable BigDecimal idProcediment,
	        @ApiParam(value = "Codi del tr??mit", allowableValues = TramitOvtApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES, required = true) @PathVariable String codiTramit)
	        throws GPAServeisServiceException {

		RespostaConsultaTramitProcedimentRDTO respostaConsultaTramitProcedimentRDTO = new RespostaConsultaTramitProcedimentRDTO();

		DadesProcedimentBDTO dadesProcedimentBDTO = serveisService.consultarDadesProcediment(idProcediment);
		// El id del Procedimiento debe ser v??lido
		if (dadesProcedimentBDTO.getProcedimentsRDTO() == null) {
			throw new GPAServeisServiceException(ErrorPrincipal.ERROR_PROCEDIMENTS_NOT_FOUND.getDescripcio());
		}

		// Informaci??n del Tr??mite
		BigDecimal iinternalIdTramitOvt = DadesOperacioApiParamToInternalMapper.getTramitOvtInternalValue(codiTramit);
		TramitsOvtCercaBDTO tramitsOvtCercaBDTO = new TramitsOvtCercaBDTO(iinternalIdTramitOvt);
		es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.TramitsOvtRDTO internalTramitsOvtRDTO = serveisService
		        .consultarDadesTramitOvt(tramitsOvtCercaBDTO);
		es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO tramitsOvtRDTO = modelMapper.map(internalTramitsOvtRDTO,
		        es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO.class);
		respostaConsultaTramitProcedimentRDTO.setTramit(tramitsOvtRDTO);

		ServeisRestControllerValidationHelper.validateTramitOvtRequerimentOperatiu(respostaConsultaTramitProcedimentRDTO,
		        dadesProcedimentBDTO, iinternalIdTramitOvt);

		return respostaConsultaTramitProcedimentRDTO;
	}

	/**
	 * Guardar XML sollicitud.
	 *
	 * @param dadesSollicitudBDTO
	 *            the dades sollicitud BDTO
	 * @param idDocumentum
	 *            the id documentum
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

	/**
	 * Filtrar Tramits Ovt Disponibles
	 *
	 * @param dadesExpedientBDTO
	 *            the dades expedients BDTO
	 * @param expedientConsultaRDTO
	 *            the expedient consulta RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	private void filtrarTramitsOvtDisponibles(DadesExpedientBDTO dadesExpedientBDTO, ExpedientConsultaRDTO expedientConsultaRDTO)
	        throws GPAServeisServiceException {
		DadesProcedimentBDTO dadesProcedimentBDTO = serveisService
		        .consultarDadesBasiquesProcediment(dadesExpedientBDTO.getExpedientsRDTO().getProcedimentIdext());

		List<BigDecimal> idsReqOperatiusTramOvtList = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(dadesProcedimentBDTO.getProcedimentsRDTO().getReqOperatius().getReqOperatiusTramOvtList())) {
			for (ReqOperatiusTramOvt reqOperatiusTramOvt : dadesProcedimentBDTO.getProcedimentsRDTO().getReqOperatius()
			        .getReqOperatiusTramOvtList()) {
				idsReqOperatiusTramOvtList.add(reqOperatiusTramOvt.getTramitOvtIdext());
			}
		}
		ServeisRestControllerAccionsDisponiblesHelper.filtrarTramitsOvtDisponibles(expedientConsultaRDTO, idsReqOperatiusTramOvtList);
	}

}