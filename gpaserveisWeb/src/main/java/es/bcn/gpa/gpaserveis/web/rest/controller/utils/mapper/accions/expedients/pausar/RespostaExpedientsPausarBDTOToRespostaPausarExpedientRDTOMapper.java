package es.bcn.gpa.gpaserveis.web.rest.controller.utils.mapper.accions.expedients.pausar;

import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.bcn.gpa.gpaserveis.business.dto.expedients.RespostaExpedientsPausarBDTO;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.common.InternalToResultatRespostaConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.expedient.InternalToExpedientAccioPausarConverter;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.expedients.pausar.RespostaPausarExpedientRDTO;

/**
 * The Class RespostaExpedientsPausarBDTOToRespostaPausarExpedientRDTOMapper.
 */
@Component("respostaExpedientsPausarBDTOToRespostaPausarExpedientRDTOMapper")
public class RespostaExpedientsPausarBDTOToRespostaPausarExpedientRDTOMapper
        extends PropertyMap<RespostaExpedientsPausarBDTO, RespostaPausarExpedientRDTO> {

	/** The internal to expedient accio pausar converter. */
	private InternalToExpedientAccioPausarConverter internalToExpedientAccioPausarConverter;

	/** The internal to resultat resposta converter. */
	private InternalToResultatRespostaConverter internalToResultatRespostaConverter;

	/**
	 * Instantiates a new resposta expedients pausar BDTO to resposta pausar
	 * expedient RDTO mapper.
	 *
	 * @param internalToExpedientAccioConverter
	 *            the internal to expedient accio converter
	 * @param internalToResultatRespostaConverter
	 *            the internal to resultat resposta converter
	 */
	@Autowired
	public RespostaExpedientsPausarBDTOToRespostaPausarExpedientRDTOMapper(
	        @Qualifier("expedientInternalToExpedientAccioPausarConverter") InternalToExpedientAccioPausarConverter internalToExpedientAccioPausarConverter,
	        @Qualifier("internalToResultatRespostaConverter") InternalToResultatRespostaConverter internalToResultatRespostaConverter) {
		this.internalToExpedientAccioPausarConverter = internalToExpedientAccioPausarConverter;
		this.internalToResultatRespostaConverter = internalToResultatRespostaConverter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.modelmapper.PropertyMap#configure()
	 */
	@Override
	protected void configure() {
		using(internalToResultatRespostaConverter).map(source.getRespostaResultatBDTO()).setResultat(null);
		using(internalToExpedientAccioPausarConverter).map(source.getExpedientsRDTO()).setExpedient(null);
	}

}
