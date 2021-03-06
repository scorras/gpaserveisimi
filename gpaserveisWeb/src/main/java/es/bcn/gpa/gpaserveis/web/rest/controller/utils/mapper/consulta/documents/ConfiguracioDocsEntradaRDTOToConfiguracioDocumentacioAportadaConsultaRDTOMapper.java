package es.bcn.gpa.gpaserveis.web.rest.controller.utils.mapper.consulta.documents;

import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfiguracioDocsEntradaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.common.InternalToBooleanConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.common.InternalToStringConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.document.InternalToObligatoriConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.document.InternalToSuportConfeccioConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.procediment.InternalToNivellCriticitatConverter;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.documents.ConfiguracioDocumentacioAportadaConsultaRDTO;

@Component
public class ConfiguracioDocsEntradaRDTOToConfiguracioDocumentacioAportadaConsultaRDTOMapper
		extends PropertyMap<ConfiguracioDocsEntradaRDTO, ConfiguracioDocumentacioAportadaConsultaRDTO> {

	/** The internal to boolean converter. */
	private InternalToBooleanConverter internalToBooleanConverter;

	/** The internal to string converter. */
	private InternalToStringConverter internalToStringConverter;

	/** The internal to suport confeccio converter. */
	private InternalToSuportConfeccioConverter internalToSuportConfeccioConverter;

	/** The internal to obligatori converter. */
	private InternalToObligatoriConverter internalToObligatoriConverter;

	/** The internal to nivell criticitat converter. */
	private InternalToNivellCriticitatConverter internalToNivellCriticitatConverter;

	@Autowired
	public ConfiguracioDocsEntradaRDTOToConfiguracioDocumentacioAportadaConsultaRDTOMapper(
			@Qualifier("internalToBooleanConverter") InternalToBooleanConverter internalToBooleanConverter,
			@Qualifier("internalToSuportConfeccioConverter") InternalToSuportConfeccioConverter internalToSuportConfeccioConverter,
			@Qualifier("internalToObligatoriConverter") InternalToObligatoriConverter internalToObligatoriConverter,
			@Qualifier("internalToStringConverter") InternalToStringConverter internalToStringConverter,
			@Qualifier("internalToNivellCriticitatConverter") InternalToNivellCriticitatConverter internalToNivellCriticitatConverter) {
		this.internalToBooleanConverter = internalToBooleanConverter;
		this.internalToSuportConfeccioConverter = internalToSuportConfeccioConverter;
		this.internalToObligatoriConverter = internalToObligatoriConverter;
		this.internalToStringConverter = internalToStringConverter;
		this.internalToNivellCriticitatConverter = internalToNivellCriticitatConverter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.modelmapper.PropertyMap#configure()
	 */
	@Override
	protected void configure() {
		using(internalToStringConverter).map(source.getUniqueId()).setCodi(null);
		map().setDescripcio(source.getNom());
		map().setDescripcioCastella(source.getNomCastella());
		map().setDescripcioAmpliada(source.getDescripcioAmpliada());
		map().setDescripcioAmpliadaCastella(source.getDescripcioAmpliadaCastella());
		using(internalToObligatoriConverter).map(source).setObligatori(null);
		using(internalToBooleanConverter).map(source.getAtributsDocs().getRepetible()).setRepetible(null);
		using(internalToSuportConfeccioConverter).map(source.getSuportConfeccio()).setSuportConfeccio(null);
		map().setSuportEnllac(source.getSuportEnllac());
		using(internalToBooleanConverter).map(source.getVisibilitatPortal()).setVisibilitat(null);
		using(internalToNivellCriticitatConverter).map(source.getCriticitatIdext()).setCriticitat(null);
	}

}
