package es.bcn.gpa.gpaserveis.web.rest.controller.utils.mapper.accions.expedients.recurs;

import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ExpedientsRDTO;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.expedient.PersonaRepresentantToInternalConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.expedient.PersonaSollicitantToInternalConverter;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.recurs.RecursExpedientRDTO;

/**
 * The Class ExpedientRecursRDTOToExpedientsRDTOMapper.
 */
@Component("expedientRecursRDTOToExpedientsRDTOMapper")
public class RecursExpedientRDTOToExpedientsRDTOMapper extends PropertyMap<RecursExpedientRDTO, ExpedientsRDTO> {

	/** The persona sollicitant to internal converter. */
	private PersonaSollicitantToInternalConverter personaSollicitantToInternalConverter;

	/** The persona representant to internal converter. */
	private PersonaRepresentantToInternalConverter personaRepresentantToInternalConverter;

	/**
	 * Instantiates a new solicituds crear RDTO to expedients RDTO mapper.
	 *
	 * @param personaSollicitantToInternalConverter
	 *            the persona sollicitant to internal converter
	 * @param personaRepresentantToInternalConverter
	 *            the persona representant to internal converter
	 */
	@Autowired
	public RecursExpedientRDTOToExpedientsRDTOMapper(
			@Qualifier("expedientPersonaSollicitantToInternalConverter") PersonaSollicitantToInternalConverter personaSollicitantToInternalConverter,
			@Qualifier("expedientPersonaRepresentantToInternalConverter") PersonaRepresentantToInternalConverter personaRepresentantToInternalConverter) {
		this.personaSollicitantToInternalConverter = personaSollicitantToInternalConverter;
		this.personaRepresentantToInternalConverter = personaRepresentantToInternalConverter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.modelmapper.PropertyMap#configure()
	 */
	@Override
	protected void configure() {
		map().setProcedimentIdext(source.getProcediment().getId());
		map().setIsOge(Boolean.TRUE);
		using(personaSollicitantToInternalConverter).map(source.getSollicitant()).setSollicitantPrincipal(null);
		using(personaRepresentantToInternalConverter).map(source.getRepresentant()).setRepresentantPrincipal(null);
	}

}
