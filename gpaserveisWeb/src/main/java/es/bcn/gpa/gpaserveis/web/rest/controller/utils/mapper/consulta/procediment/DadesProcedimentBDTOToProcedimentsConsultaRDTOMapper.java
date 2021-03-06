package es.bcn.gpa.gpaserveis.web.rest.controller.utils.mapper.consulta.procediment;

import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.bcn.gpa.gpaserveis.business.dto.procediments.DadesProcedimentBDTO;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.procediment.InternalToEstatConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.procediment.InternalToIdentificacioConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.procediment.InternalToIniciacioConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.procediment.InternalToProcedimentPersonesListConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.tramit.InternalToTramitProcedimentListConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.unitatgestora.InternalToUnitatGestoraConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.unitatgestora.InternalToUnitatGestoraListConverter;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.procediments.ProcedimentsConsultaRDTO;

/**
 * The Class DadesProcedimentBDTOToProcedimentsConsultaRDTOMapper.
 */
@Component
public class DadesProcedimentBDTOToProcedimentsConsultaRDTOMapper extends PropertyMap<DadesProcedimentBDTO, ProcedimentsConsultaRDTO> {

	/** The internal to estat converter. */
	private InternalToEstatConverter internalToEstatConverter;

	/** The internal to unitat gestora converter. */
	private InternalToUnitatGestoraConverter internalToUnitatGestoraConverter;

	/** The internal to unitat gestora list converter. */
	private InternalToUnitatGestoraListConverter internalToUnitatGestoraListConverter;

	/** The internal to iniciacio converter. */
	private InternalToIniciacioConverter internalToIniciacioConverter;

	/** The internal to tramit procediment list converter. */
	private InternalToTramitProcedimentListConverter internalToTramitProcedimentListConverter;

	/** The internal to identificacio converter. */
	private InternalToIdentificacioConverter internalToIdentificacioConverter;

	/** The list nivellVisibilitat to list internal converter. */
	// private InternalToProcedimentPersonesListConverter
	// internalToProcedimentPersonesListConverter;

	/**
	 * Instantiates a new resposta dades procediment BDTO to procediments
	 * consulta RDTO mapper.
	 *
	 * @param internalToEstatConverter
	 *            the internal to estat converter
	 * @param internalToUnitatGestoraConverter
	 *            the internal to unitat gestora converter
	 * @param internalToUnitatGestoraListConverter
	 *            the internal to unitat gestora list converter
	 * @param internalToIniciacioConverter
	 *            the internal to iniciacio converter
	 * @param internalToTramitProcedimentListConverter
	 *            the internal to tramit procediment list converter
	 * @param internalToIdentificacioConverter
	 *            the internal to identificacio converter
	 */
	@Autowired
	public DadesProcedimentBDTOToProcedimentsConsultaRDTOMapper(
			@Qualifier("procedimentInternalToEstatConverter") InternalToEstatConverter internalToEstatConverter,
			@Qualifier("internalToUnitatGestoraConverter") InternalToUnitatGestoraConverter internalToUnitatGestoraConverter,
			@Qualifier("internalToUnitatGestoraListConverter") InternalToUnitatGestoraListConverter internalToUnitatGestoraListConverter,
			@Qualifier("procedimentInternalToIniciacioConverter") InternalToIniciacioConverter internalToIniciacioConverter,
			@Qualifier("internalToTramitProcedimentListConverter") InternalToTramitProcedimentListConverter internalToTramitProcedimentListConverter,
			@Qualifier("procedimentInternalToIdentificacioConverter") InternalToIdentificacioConverter internalToIdentificacioConverter,
			@Qualifier("internalToProcedimentPersonesListConverter") InternalToProcedimentPersonesListConverter internalToProcedimentPersonesListConverter) {
		this.internalToEstatConverter = internalToEstatConverter;
		this.internalToUnitatGestoraConverter = internalToUnitatGestoraConverter;
		this.internalToUnitatGestoraListConverter = internalToUnitatGestoraListConverter;
		this.internalToIniciacioConverter = internalToIniciacioConverter;
		this.internalToTramitProcedimentListConverter = internalToTramitProcedimentListConverter;
		this.internalToIdentificacioConverter = internalToIdentificacioConverter;
		// this.internalToProcedimentPersonesListConverter =
		// internalToProcedimentPersonesListConverter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.modelmapper.PropertyMap#configure()
	 */
	@Override
	protected void configure() {
		map().setId(source.getProcedimentsRDTO().getId());
		map().setCodi(source.getProcedimentsRDTO().getCodi());
		map().setVersio(source.getProcedimentsRDTO().getVersio());
		map().setNom(source.getProcedimentsRDTO().getNom());
		map().setNomCastella(source.getProcedimentsRDTO().getNomCastella());
		map().setDescripcio(source.getProcedimentsRDTO().getDescripcio());
		map().setDescripcioCastella(source.getProcedimentsRDTO().getDescripcioCastella());
		using(internalToUnitatGestoraConverter).map(source.getUgrRDTO()).setUgr(null);
		using(internalToUnitatGestoraListConverter).map(source.getUgoRDTOList()).setUgo(null);
		map().setOrganResolutori(source.getProcedimentsRDTO().getIdentificacions().getOrganResolutori());
		using(internalToIniciacioConverter).map(source.getProcedimentsRDTO().getIniciacionsList()).setInici(null);
		// using(internalToEstatConverter).map(source.getProcedimentsRDTO().getEstatsProcediment().getEstats().getId()).setEstat(null);
		map().setEstat(source.getProcedimentsRDTO().getDescripcioEstatCatala());
		map().setEstatCastella(source.getProcedimentsRDTO().getDescripcioEstatCastella());
		// using(internalToTramitProcedimentListConverter).map(source.getTramitsRDTOList()).setTramits(null);
		using(internalToIdentificacioConverter).map(source.getProcedimentsRDTO().getIdentificacions()).setDadesIdentificacio(null);
		// using(internalToProcedimentPersonesListConverter).map(source.getProcedimentsRDTO().getProcedimentPersonesList())
		// .setTerceresPersonesImplicades(null);
	}

}
