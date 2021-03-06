package es.bcn.gpa.gpaserveis.business;

import java.math.BigDecimal;
import java.util.List;

import es.bcn.gpa.gpaserveis.business.dto.expedients.AnotarOperacioComptableBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ComentarisCrearAccioBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsActualitzarBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsAcumularBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsCanviarEstatBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsCanviarUnitatGestoraBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsConvidarTramitarBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsCrearBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsRedireccionarAssentamentBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsRegistrarBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsRegistrarSollicitudBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsReprendreBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsRetornarTramitacioBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ExpedientsTornarEnrereBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.GestionarAvisosPerAccioBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.InscriureEnRegistreBDTO;
import es.bcn.gpa.gpaserveis.business.dto.expedients.ObtenirPerInteroperabilitatBDTO;
import es.bcn.gpa.gpaserveis.business.dto.sollicituds.SollicitudsCercaBDTO;
import es.bcn.gpa.gpaserveis.business.dto.sollicituds.SollicitudsCrearBDTO;
import es.bcn.gpa.gpaserveis.business.exception.GPAServeisServiceException;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.DadesEspecifiquesRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.DadesEspecifiquesRepetiblesRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.EstatsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ExpedientsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.MunicipisRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PageDataOfExpedientsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PageDataOfPersonesSollicitudRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PageDataOfSollicitudsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PaisosRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PersonesSollicitudRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ProvinciesRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RegistreAssentamentRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RegistreDocumentacioExpedient;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RespostaCanviarEstatAccioExpedient;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RespostaCrearRegistreExpedient;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RespostaInteroperabilitat;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RetornTramitacio;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.SollicitudActualitzarRegistre;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.SollicitudsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.TipusViesRDTO;

/**
 * The Interface ExpedientsService.
 */
public interface ExpedientsService {

	/**
	 * Cerca expedients.
	 *
	 * @param expedientsCercaBDTO
	 *            the expedients cerca BDTO
	 * @return the page data of expedients RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	PageDataOfExpedientsRDTO cercaExpedients(ExpedientsCercaBDTO expedientsCercaBDTO) throws GPAServeisServiceException;

	/**
	 * Consultar dades sollicitud.
	 *
	 * @param id
	 *            the id
	 * @return the sollicituds RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	SollicitudsRDTO consultarDadesSollicitud(BigDecimal id) throws GPAServeisServiceException;

	/**
	 * Consultar dades expedient.
	 *
	 * @param id
	 *            the id
	 * @return the expedients RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	ExpedientsRDTO consultarDadesExpedient(BigDecimal id) throws GPAServeisServiceException;

	/**
	 * Consultar dades expedient per codi.
	 *
	 * @param codi
	 *            the codi
	 * @return the expedients RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	ExpedientsRDTO consultarDadesExpedientPerCodi(String codi) throws GPAServeisServiceException;

	/**
	 * Cerca historics estats expedient.
	 *
	 * @param idExpedient
	 *            the id expedient
	 * @return the list
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	List<EstatsRDTO> cercaHistoricsEstatsExpedient(BigDecimal idExpedient) throws GPAServeisServiceException;

	/**
	 * Cerca persones interesades expedient.
	 *
	 * @param idSolicitud
	 *            the id solicitud
	 * @return the page data of persones sollicitud RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	PageDataOfPersonesSollicitudRDTO cercaPersonesInteresadesExpedient(BigDecimal idSolicitud) throws GPAServeisServiceException;

	/**
	 * Cerca altres persones implicades expedient.
	 *
	 * @param idSolicitud
	 *            the id solicitud
	 * @return the page data of persones sollicitud RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	PageDataOfPersonesSollicitudRDTO cercaAltresPersonesImplicadesExpedient(BigDecimal idSolicitud) throws GPAServeisServiceException;

	/**
	 * Cerca altres persones implicades no esborrany en expedient.
	 *
	 * @param idSolicitud
	 *            the id solicitud
	 * @return the page data of persones sollicitud RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	PageDataOfPersonesSollicitudRDTO cercaAltresPersonesImplicadesExpedientNoEsborrany(BigDecimal idSolicitud)
			throws GPAServeisServiceException;

	/**
	 * Actualitzar dades altra persona implicada.
	 *
	 * @param personesSollicitudRDTO
	 *            the persones sollicitud RDTO
	 * @return the page data of persones sollicitud RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	PageDataOfPersonesSollicitudRDTO donarAccesAltraPersonaImplicada(PersonesSollicitudRDTO personesSollicitudRDTO)
			throws GPAServeisServiceException;

	/**
	 * Cerca dades especifiques sollicitud.
	 *
	 * @param idSollicitud
	 *            the id sollicitud
	 * @param visibilitat
	 *            the visibilitat
	 * @return the list
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	List<DadesEspecifiquesRDTO> cercaDadesEspecifiquesSollicitud(BigDecimal idSollicitud, BigDecimal visibilitat)
			throws GPAServeisServiceException;

	/**
	 * Cerca dades especifiques expedient.
	 *
	 * @param idExpedient
	 *            the id expedient
	 * @param visibilitat
	 *            the visibilitat
	 * @return the list
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	List<DadesEspecifiquesRDTO> cercaDadesEspecifiquesExpedient(BigDecimal idExpedient, BigDecimal visibilitat)
			throws GPAServeisServiceException;

	/**
	 * Crear sollicitud expedient.
	 *
	 * @param expedientsCrearBDTO
	 *            the expedients crear BDTO
	 * @return the expedients RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	ExpedientsRDTO crearSollicitudExpedient(ExpedientsCrearBDTO expedientsCrearBDTO) throws GPAServeisServiceException;

	/**
	 * Actualitzar solicitud expedient.
	 *
	 * @param expedientsActualitzarBDTO
	 *            the expedients actualitzar BDTO
	 * @return the expedients RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	ExpedientsRDTO actualitzarSolicitudExpedient(ExpedientsActualitzarBDTO expedientsActualitzarBDTO) throws GPAServeisServiceException;

	/**
	 * Crear registre solicitud expedient.
	 *
	 * @param expedientsRegistrarBDTO
	 *            the expedients registrar BDTO
	 * @param tipusDocVinculada
	 *            the tipus doc vinculada
	 * @return the resposta crear registre solicitud expedient
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	RespostaCrearRegistreExpedient crearRegistre(ExpedientsRegistrarBDTO expedientsRegistrarBDTO, BigDecimal tipusDocVinculada)
			throws GPAServeisServiceException;

	/**
	 * Crear registre solicitud sollicitud.
	 *
	 * @param expedientsRegistrarSollicitudBDTO
	 *            the expedients registrar sollicitud BDTO
	 * @param tipusDocVinculada
	 *            the tipus doc vinculada
	 * @return the resposta crear registre solicitud
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	RespostaCrearRegistreExpedient crearRegistreSollicitud(ExpedientsRegistrarSollicitudBDTO expedientsRegistrarSollicitudBDTO,
			BigDecimal tipusDocVinculada) throws GPAServeisServiceException;

	/**
	 * Redireccionar registre.
	 *
	 * @param expedientsRedireccionarAssentamentBDTO
	 *            the expedients redireccionar assentament BDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void redireccionarRegistre(ExpedientsRedireccionarAssentamentBDTO expedientsRedireccionarAssentamentBDTO)
			throws GPAServeisServiceException;

	/**
	 * Canviar estat expedient.
	 *
	 * @param expedientsCanviarEstatBDTO
	 *            the expedients canviar estat BDTO
	 * @return the resposta canviar estat expedient
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	RespostaCanviarEstatAccioExpedient canviarEstatExpedient(ExpedientsCanviarEstatBDTO expedientsCanviarEstatBDTO)
			throws GPAServeisServiceException;

	/**
	 * Crear comentari accio.
	 *
	 * @param comentarisCrearAccioBDTO
	 *            the comentaris crear accio BDTO
	 * @return the integer
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	Integer crearComentariAccio(ComentarisCrearAccioBDTO comentarisCrearAccioBDTO) throws GPAServeisServiceException;

	/**
	 * Convidar tramitar expedient.
	 *
	 * @param expedientsConvidarTramitarBDTO
	 *            the expedients convidar tramitar BDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void convidarTramitarExpedient(ExpedientsConvidarTramitarBDTO expedientsConvidarTramitarBDTO) throws GPAServeisServiceException;

	/**
	 * Retornar tramitacio expedient.
	 *
	 * @param expedientsRetornarTramitacioBDTO
	 *            the expedients retornar tramitacio BDTO
	 * @return the retorn tramitacio
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	RetornTramitacio retornarTramitacioExpedient(ExpedientsRetornarTramitacioBDTO expedientsRetornarTramitacioBDTO)
			throws GPAServeisServiceException;

	/**
	 * Registre documentacio ariadna.
	 *
	 * @param registreDocumentacioExpedient
	 *            the registre documentacio expedient
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void registreDocumentacioAriadna(RegistreDocumentacioExpedient registreDocumentacioExpedient) throws GPAServeisServiceException;

	/**
	 * Canviar unitat gestora expedient.
	 *
	 * @param expedientsCanviarUnitatGestoraBDTO
	 *            the expedients canviar unitat gestora BDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void canviarUnitatGestoraExpedient(ExpedientsCanviarUnitatGestoraBDTO expedientsCanviarUnitatGestoraBDTO)
			throws GPAServeisServiceException;

	/**
	 * Consultar dades registre assentament.
	 *
	 * @param codi
	 *            the codi
	 * @return the registre assentament RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	RegistreAssentamentRDTO consultarDadesRegistreAssentament(String codi) throws GPAServeisServiceException;

	/**
	 * Acumular expedient.
	 *
	 * @param expedientsAcumularBDTO
	 *            the expedients acumular BDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void acumularExpedient(ExpedientsAcumularBDTO expedientsAcumularBDTO) throws GPAServeisServiceException;

	/**
	 * Gets the id expedient by documentacio id ext.
	 *
	 * @param documentacio
	 *            the documentacio
	 * @return the id expedient by documentacio id ext
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	BigDecimal getIdExpedientByDocumentacioIdExt(BigDecimal documentacio) throws GPAServeisServiceException;

	/**
	 * Obtenir expedients relacionats.
	 *
	 * @param idExpedient
	 *            the id expedient
	 * @return the page data of expedients RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	PageDataOfExpedientsRDTO obtenirExpedientsRelacionats(BigDecimal idExpedient) throws GPAServeisServiceException;

	/**
	 * Anotar operacio comptable.
	 *
	 * @param anotarOperacioComptableBDTO
	 *            the anotar operacio comptable BDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void anotarOperacioComptable(AnotarOperacioComptableBDTO anotarOperacioComptableBDTO) throws GPAServeisServiceException;

	/**
	 * Inscriure en registre.
	 *
	 * @param inscriureEnRegistreBDTO
	 *            the inscriure en registre BDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void inscriureEnRegistre(InscriureEnRegistreBDTO inscriureEnRegistreBDTO) throws GPAServeisServiceException;

	/**
	 * Esborrar registre solicitud expedient.
	 *
	 * @param expedientsRegistrarBDTO
	 *            the expedients registrar BDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void esborrarRegistre(ExpedientsRegistrarBDTO expedientsRegistrarBDTO) throws GPAServeisServiceException;

	/**
	 * Esborrar registre solicitud.
	 *
	 * @param expedientsRegistrarSollicitudBDTO
	 *            the expedients registrar sollicitud BDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void esborrarRegistreSollicitud(ExpedientsRegistrarSollicitudBDTO expedientsRegistrarSollicitudBDTO) throws GPAServeisServiceException;

	/**
	 * Esborra comentari.
	 *
	 * @param idComentari
	 *            the id Comentari
	 * @param idExpedient
	 *            the id expedient
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void esborrarComentari(BigDecimal idComentari, BigDecimal idExpedient) throws GPAServeisServiceException;

	/**
	 * Tornar enrere expedient.
	 *
	 * @param expedientsTornarEnrereBDTO
	 *            the expedients tornar enrere BDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void tornarEnrereExpedient(ExpedientsTornarEnrereBDTO expedientsTornarEnrereBDTO) throws GPAServeisServiceException;

	/**
	 * Obtenir per interoperabilitat.
	 *
	 * @param obtenirPerInteroperabilitatBDTO
	 *            the obtenir per interoperabilitat BDTO
	 * @return the resposta interoperabilitat
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	RespostaInteroperabilitat obtenirPerInteroperabilitat(ObtenirPerInteroperabilitatBDTO obtenirPerInteroperabilitatBDTO)
			throws GPAServeisServiceException;

	/**
	 * Crear sollicitud.
	 *
	 * @param sollicitudsCrearBDTO
	 *            the sollicituds crear BDTO
	 * @return the sollicituds RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	SollicitudsRDTO crearSollicitud(SollicitudsCrearBDTO sollicitudsCrearBDTO) throws GPAServeisServiceException;

	/**
	 * Associar registre sollicitud.
	 *
	 * @param sollicitudActualitzarRegistre
	 *            the sollicitud actualitzar registre
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void associarRegistreSollicitud(SollicitudActualitzarRegistre sollicitudActualitzarRegistre) throws GPAServeisServiceException;

	/**
	 * Guardar dades especifiques sollicitud.
	 *
	 * @param idSollicitud
	 *            the id sollicitud
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void guardarDadesEspecifiquesSollicitud(BigDecimal idSollicitud) throws GPAServeisServiceException;

	/**
	 * Cerca sollicituds.
	 *
	 * @param sollicitudsCercaBDTO
	 *            the sollicituds cerca BDTO
	 * @return the page data of sollicituds RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	PageDataOfSollicitudsRDTO cercaSollicituds(SollicitudsCercaBDTO sollicitudsCercaBDTO) throws GPAServeisServiceException;

	/**
	 * Update sollicitud.
	 *
	 * @param sollicitudRDTO
	 *            the sollicitud RDTO
	 * @return the sollicituds RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	SollicitudsRDTO updateSollicitud(SollicitudsRDTO sollicitudRDTO) throws GPAServeisServiceException;

	/**
	 * Consultar tipus vies by codi.
	 *
	 * @param codi
	 *            the codi
	 * @return the tipus vies RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	TipusViesRDTO consultarTipusViesByCodi(String codi) throws GPAServeisServiceException;

	/**
	 * Consultar paisos by codi.
	 *
	 * @param codi
	 *            the codi
	 * @return the paisos RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	PaisosRDTO consultarPaisosByCodi(String codi) throws GPAServeisServiceException;

	/**
	 * Consultar provincies by codi.
	 *
	 * @param codi
	 *            the codi
	 * @return the provincies RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	ProvinciesRDTO consultarProvinciesByCodi(String codi) throws GPAServeisServiceException;

	/**
	 * Consultar municipis by codi.
	 *
	 * @param codiMunicipi
	 *            the codi municipi
	 * @param codiProvincia
	 *            the codi provincia
	 * @return the municipis RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	MunicipisRDTO consultarMunicipisByCodi(String codiMunicipi, String codiProvincia) throws GPAServeisServiceException;

	/**
	 * Actualitzar expedient.
	 *
	 * @param expedientsCrearBDTO
	 *            the expedients crear BDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void actualitzarExpedient(ExpedientsRDTO expedientsRDTO) throws GPAServeisServiceException;

	/**
	 * Consultar dades persona sollicitud.
	 *
	 * @param idPersona
	 *            the id persona
	 * @return the persones sollicitud RDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	PersonesSollicitudRDTO consultarDadesPersonaSollicitud(BigDecimal idPersona) throws GPAServeisServiceException;

	/**
	 * Esborrar persona sollicitud.
	 *
	 * @param idPersonesSollicitud
	 *            the id persones sollicitud
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void esborrarPersonaSollicitud(BigDecimal idPersonesSollicitud) throws GPAServeisServiceException;

	/**
	 * incorporar Tercera Persona
	 * 
	 * @param personesSollicitud
	 * @return
	 * @throws GPAServeisServiceException
	 */
	PersonesSollicitudRDTO incorporarTerceraPersona(PersonesSollicitudRDTO personesSollicitud) throws GPAServeisServiceException;
	
	/**
	 * Reprendre tramitacio.
	 *
	 * @param expedientsReprendreBDTO
	 *            the expedients reprendre BDTO
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	void reprendreTramitacio(ExpedientsReprendreBDTO expedientsReprendreBDTO) throws GPAServeisServiceException;


	List<DadesEspecifiquesRepetiblesRDTO> cercaDadesEspecifiquesRepetiblesSollicitud(BigDecimal idSollicitud,
			BigDecimal visibilitat) throws GPAServeisServiceException;

	List<DadesEspecifiquesRepetiblesRDTO> cercaDadesEspecifiquesRepetiblesExpedient(BigDecimal idExpedient,
			BigDecimal visibilitat) throws GPAServeisServiceException;

	/**
	 * Gestionar avisos per accio.
	 *
	 * @param gestionarAvisosPerAccioBDTO the gestionar avisos per accio BDTO
	 * @throws GPAServeisServiceException the GPA serveis service exception
	 */
	void gestionarAvisosPerAccio(GestionarAvisosPerAccioBDTO gestionarAvisosPerAccioBDTO) throws GPAServeisServiceException;

}
