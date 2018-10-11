package es.bcn.gpa.gpaserveis.web.rest.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.bcn.gpa.gpaserveis.web.rest.controller.mock.RespostaActualitzarSolicitudMockService;
import es.bcn.gpa.gpaserveis.web.rest.controller.mock.RespostaCercaExpedientsMockService;
import es.bcn.gpa.gpaserveis.web.rest.controller.mock.RespostaCercaProcedimentsMockService;
import es.bcn.gpa.gpaserveis.web.rest.controller.mock.RespostaConsultaDadesOperacioMockService;
import es.bcn.gpa.gpaserveis.web.rest.controller.mock.RespostaConsultaDocumentsMockService;
import es.bcn.gpa.gpaserveis.web.rest.controller.mock.RespostaConsultaExpedientsMockService;
import es.bcn.gpa.gpaserveis.web.rest.controller.mock.RespostaConsultaProcedimentsMockService;
import es.bcn.gpa.gpaserveis.web.rest.controller.mock.RespostaCrearSolicitudMockService;
import es.bcn.gpa.gpaserveis.web.rest.controller.mock.RespostaObrirSolicitudMockService;
import es.bcn.gpa.gpaserveis.web.rest.controller.mock.RespostaRegistrarSolicitudMockService;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.actualitzar.solicituds.RespostaActualitzarSolicitudsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.actualitzar.solicituds.SolicitudsActualitzarRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.cerca.expedients.RespostaCercaExpedientsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.cerca.procediments.RespostaCercaProcedimentsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.atributs.RespostaConsultaDadesOperacioRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.documents.RespostaConsultaDocumentsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.expedients.RespostaConsultaExpedientsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.procediments.RespostaConsultaProcedimentsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.crear.solicituds.RespostaCrearSolicitudsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.crear.solicituds.SolicitudsCrearRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.obrir.expedients.RespostaObrirSolicitudsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.registrar.solicitud.RespostaRegistrarSolicitudsRDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.opentrends.openframe.services.rest.controller.AbstractRestController;

/**
 * The Class ServeisPortalRestController.
 */
@RestController
@RequestMapping(value = "/serveis/portal", produces = MediaType.APPLICATION_JSON_VALUE)
@Lazy(true)
@Api(value = "Serveis Portal API", tags = "Serveis Portal API") 
public class ServeisPortalRestController extends AbstractRestController {

	@Autowired
	private RespostaCercaProcedimentsMockService respostaCercaProcedimentsMockService;
	
	@Autowired
	private RespostaConsultaProcedimentsMockService respostaConsultaProcedimentsMockService;
	
	@Autowired
	private RespostaConsultaDadesOperacioMockService respostaConsultaDadesOperacioMockService;
	
	@Autowired
	private RespostaConsultaDocumentsMockService respostaConsultaDocumentsMockService;
	
	@Autowired
	private RespostaCercaExpedientsMockService respostaCercaExpedientsMockService;
	
	@Autowired
	private RespostaConsultaExpedientsMockService respostaConsultaExpedientsMockService;	

	@Autowired
	private RespostaCrearSolicitudMockService respostaCrearSolicitudMockService;
	
	@Autowired
	private RespostaActualitzarSolicitudMockService respostaActualitzarSolicitudMockService;
	
	@Autowired
	private RespostaRegistrarSolicitudMockService respostaRegistrarSolicitudMockService;
	
	@Autowired
	private RespostaObrirSolicitudMockService respostaObrirSolicitudMockService;
	
	
	
	@GetMapping("/procediments")
	@ApiOperation(value = "Cerca de procediments", tags = { "Serveis Portal API", "Funcions d'integraci� amb RPA" })
	public RespostaCercaProcedimentsRDTO cercaProcediments(
			@ApiParam(value = "Indicar� el n�mero de resultats per p�gina") @RequestParam(value = "resultatsPerPagina", required = false, defaultValue = "20") int resultatsPerPagina,
			@ApiParam(value = "Indicar� en quina p�gina hauria de comen�ar els resultats demanats en una cerca") @RequestParam(value = "numeroPagina", required = false, defaultValue = "1") int numeroPagina,
			@ApiParam(value = "Filtra procediments per codi") @RequestParam(value = "codi", required = false) String codi,
			@ApiParam(value = "Filtra procediments per descripci�") @RequestParam(value = "descripcio", required = false) String descripcio,
			@ApiParam(value = "Filtra procediments per Unitat Gestora Responsable") @RequestParam(value = "ugr", required = false) String ugr,
			@ApiParam(value = "Filtra procediments per Unitat Gestora Operativa") @RequestParam(value = "ugo", required = false) String ugo,
			@ApiParam(value = "Filtra procediments per tipus d'inici", 
				allowableValues="OFICI, SOLICITUD, ADMINISTRACIO, ALTRES") @RequestParam(value = "inici", required = false) String inici,
			@ApiParam(value = "Filtra procediments per estat",
				allowableValues="EN_ELABORACIO, PUBLICAT, FINALITZAT") @RequestParam(value = "estat", required = false) String estat,
			@ApiParam(value = "Filtra procediments interns") @RequestParam(value = "intern", required = false) String intern,
			@ApiParam(value = "Filtra procediments per versi�") @RequestParam(value = "versio", required = false) String versio,
			@ApiParam(value = "Filtra aquells procediments entre els que tinguin el per�ode de sol�licitud obert i els que no") @RequestParam(value = "versio", required = false) String actiu
	)  {
		
		return respostaCercaProcedimentsMockService.getRespostaCercaProcediments();
	}
	
	
	@GetMapping("/procediments/{idProcediment}")
	@ApiOperation(value = "Consultar les dades del procediment", tags = { "Serveis Portal API", "Funcions d'integraci� amb RPA" })
	public RespostaConsultaProcedimentsRDTO consultarDadesProcediment(
			@ApiParam(value = "Identificador del procediment") @PathVariable BigDecimal idProcediment)  {
		
		return respostaConsultaProcedimentsMockService.getRespostaConsultaProcediments(idProcediment);
	}
	
	@GetMapping("/procediments/{idProcediment}/tramits/{idTramit}/atributs")
	@ApiOperation(value = "Consultar les dades d'operaci� del tr�mit", tags = { "Serveis Portal API", "Funcions d'integraci� amb RPA" })
	public RespostaConsultaDadesOperacioRDTO consultarDadesOperacioProcediment(
			@ApiParam(value = "Identificador del procediment") @PathVariable BigDecimal idProcediment,
			@ApiParam(value = "Identificador del tr�mit") @PathVariable BigDecimal idTramit)  {
		
		return respostaConsultaDadesOperacioMockService.getRespostaConsultaDadesOperacio(idProcediment, idTramit);
	}
	
	
	@GetMapping("/procediments/{idProcediment}/tramits/{idTramit}/documentacio")
	@ApiOperation(value = "Consultar les dades de documentaci� del procediment", tags = { "Serveis Portal API", "Funcions d'integraci� amb RPA" })
	public RespostaConsultaDocumentsRDTO consultarDocumentacioProcediment(
			@ApiParam(value = "Identificador del procediment") @PathVariable BigDecimal idProcediment,
			@ApiParam(value = "Identificador del tr�mit") @PathVariable BigDecimal idTramit)  {
		
		return respostaConsultaDocumentsMockService.getRespostaConsultaDocuments(idProcediment, idTramit);
	}		
	
	
	@GetMapping("/expedients")
	@ApiOperation(value = "Cerca d'expedients", tags = { "Serveis Portal API", "Funcions de consulta al repositori de dades d'expedients" })
	public RespostaCercaExpedientsRDTO cercaExpedients(
			@ApiParam(value = "Indicar� el n�mero de resultats per p�gina") @RequestParam(value = "resultatsPerPagina", required = false, defaultValue = "20") int resultatsPerPagina,
			@ApiParam(value = "Indicar� en quina p�gina hauria de comen�ar els resultats demanats en una cerca") @RequestParam(value = "numeroPagina", required = false, defaultValue = "1") int numeroPagina,
			@ApiParam(value = "Filtra expedients per codi") @RequestParam(value = "codiExpedient", required = false) String codiExpedient,
			@ApiParam(value = "Filtra expedients per codi del procediment") @RequestParam(value = "codiProcediment", required = false) String codiProcediment,
			@ApiParam(value = "Filtra expedients per Unitat Gestora") @RequestParam(value = "unitatGestora", required = false) String unitatGestora,
			@ApiParam(value = "Filtra expedients per estat",
				allowableValues="EN_PREPARACIO, EN_REVISIO, PENDENT_SUBSANACIO, EN_TRAMITACIO, PENDENT_ALEGACIONS, PENDENT_INFORMES, PROPOSAT_RESOLUCIO, RESOLT, TANCAT") @RequestParam(value = "estat", required = false) String estat,
			@ApiParam(value = "Filtra expedients d'un sol�licitant") @RequestParam(value = "nifSolicitant", required = false) String nifSolicitant,
			@ApiParam(value = "Filtra expedients per data de presentaci�") @RequestParam(value = "dataPresentacioInici", required = false) String dataPresentacioInici,
			@ApiParam(value = "Filtra expedients per data de presentaci�") @RequestParam(value = "dataPresentacioFi", required = false) String dataPresentacioFi
	) {
		
		return respostaCercaExpedientsMockService.getRespostaCercaExpedients();
	}
	
	
	@GetMapping("/expedients/{idExpedient}")
	@ApiOperation(value = "Consultar les dades de l'expedient", tags = { "Serveis Portal API", "Funcions de consulta al repositori de dades d'expedients" })
	public RespostaConsultaExpedientsRDTO consultarDadesExpedient(
			@ApiParam(value = "Identificador de l'expedient") @PathVariable BigDecimal idExpedient)  {
		
		return respostaConsultaExpedientsMockService.getRespostaConsultaExpedients(idExpedient);
	}	
	
	
	@PostMapping("/expedients")
	@ApiOperation(value = "Crear una sol�licitud d'un expedient", tags = { "Serveis Portal API", "Funcions d'execuci� d'accions" })
	public RespostaCrearSolicitudsRDTO crearSolicitudExpedient(
			@ApiParam(value = "Identificador de l'expedient") @RequestBody SolicitudsCrearRDTO solicitudExpedient)  {
		
		return respostaCrearSolicitudMockService.getRespostaRespostaCrearSolicituds();
	}	
	
	
	@PutMapping("/expedients/{idExpedient}")
	@ApiOperation(value = "Actualitzar dades de la sol�licitud de l'expedient", tags = { "Serveis Portal API", "Funcions d'execuci� d'accions" })
	public RespostaActualitzarSolicitudsRDTO actualitzarSolicitudExpedient(
			@ApiParam(value = "Identificador de l'expedient") @PathVariable BigDecimal idExpedient,
			@ApiParam(value = "Identificador de l'expedient") @RequestBody SolicitudsActualitzarRDTO solicitudExpedient)  {
		
		return respostaActualitzarSolicitudMockService.getRespostaRespostaActualitzarSolicituds(idExpedient);
	}	
	
	
	@PostMapping("/expedients/{idExpedient}/registre")
	@ApiOperation(value = "Registrar la sol�licitud de l'expedient", tags = { "Serveis Portal API", "Funcions d'execuci� d'accions" })
	public RespostaRegistrarSolicitudsRDTO registrarSolicitudExpedient(
			@ApiParam(value = "Identificador de l'expedient") @PathVariable BigDecimal idExpedient)  {
		
		return respostaRegistrarSolicitudMockService.getRespostaRespostaRegistrarSolicituds(idExpedient);
	}	
	
	
	@PostMapping("/expedients/{idExpedient}/obrir")
	@ApiOperation(value = "Obrir la sol�licitud de l'expedient", tags = { "Serveis Portal API", "Funcions d'execuci� d'accions" })
	public RespostaObrirSolicitudsRDTO obrirSolicitudExpedient(
			@ApiParam(value = "Identificador de l'expedient") @PathVariable BigDecimal idExpedient)  {
		
		return respostaObrirSolicitudMockService.getRespostaObrirSolicituds(idExpedient);
	}		
	
}
