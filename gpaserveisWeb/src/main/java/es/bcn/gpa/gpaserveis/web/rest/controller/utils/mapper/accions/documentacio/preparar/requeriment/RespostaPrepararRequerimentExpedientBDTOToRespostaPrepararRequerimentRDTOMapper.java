package es.bcn.gpa.gpaserveis.web.rest.controller.utils.mapper.accions.documentacio.preparar.requeriment;

import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.bcn.gpa.gpaserveis.business.dto.documents.RespostaPrepararRequerimentExpedientBDTO;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.common.InternalToResultatRespostaConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.document.InternalToDocumentTramitacioRequerimentPreparatAccioConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.expedient.InternalToExpedientAccioConverter;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.preparar.requeriment.RespostaPrepararRequerimentRDTO;

/**
 * The Class
 * RespostaPrepararRequerimentExpedientBDTOToRespostaPrepararRequerimentRDTOMapper.
 */
@Component("respostaPrepararRequerimentExpedientBDTOToRespostaPrepararRequerimentRDTOMapper")
public class RespostaPrepararRequerimentExpedientBDTOToRespostaPrepararRequerimentRDTOMapper
		extends PropertyMap<RespostaPrepararRequerimentExpedientBDTO, RespostaPrepararRequerimentRDTO> {

	private InternalToExpedientAccioConverter internalToExpedientAccioConverter;

	private InternalToResultatRespostaConverter internalToResultatRespostaConverter;

	private InternalToDocumentTramitacioRequerimentPreparatAccioConverter internalToDocumentTramitacioRequerimentPreparatAccioConverter;

	@Autowired
	public RespostaPrepararRequerimentExpedientBDTOToRespostaPrepararRequerimentRDTOMapper(
			@Qualifier("expedientInternalToExpedientAccioConverter") InternalToExpedientAccioConverter internalToExpedientAccioConverter,
			@Qualifier("internalToDocumentTramitacioRequerimentPreparatAccioConverter") InternalToDocumentTramitacioRequerimentPreparatAccioConverter internalToDocumentTramitacioRequerimentPreparatAccioConverter,
			@Qualifier("internalToResultatRespostaConverter") InternalToResultatRespostaConverter internalToResultatRespostaConverter) {
		this.internalToExpedientAccioConverter = internalToExpedientAccioConverter;
		this.internalToDocumentTramitacioRequerimentPreparatAccioConverter = internalToDocumentTramitacioRequerimentPreparatAccioConverter;
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
		using(internalToExpedientAccioConverter).map(source.getExpedientsRDTO()).setExpedient(null);
		using(internalToDocumentTramitacioRequerimentPreparatAccioConverter).map(source.getDocsTramitacioRDTO()).setDocument(null);
	}

}
