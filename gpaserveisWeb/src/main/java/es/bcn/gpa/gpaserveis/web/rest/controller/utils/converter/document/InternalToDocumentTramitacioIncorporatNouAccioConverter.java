package es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.document;

import org.modelmapper.AbstractConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsTramitacioRDTO;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.ConverterHelper;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.BaseApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.documentacio.DocumentIncorporatNouAccioRDTO;

/**
 * The Class InternalToDocumentTramitacioIncorporatNouAccioConverter.
 */
@Component("internalToDocumentTramitacioIncorporatNouAccioConverter")
public class InternalToDocumentTramitacioIncorporatNouAccioConverter
        extends AbstractConverter<DocsTramitacioRDTO, DocumentIncorporatNouAccioRDTO> {

	/** The origen api param value translator. */
	@Autowired
	@Qualifier("documentOrigenApiParamValueTranslator")
	private BaseApiParamValueTranslator origenApiParamValueTranslator;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.modelmapper.AbstractConverter#convert(java.lang.Object)
	 */
	@Override
	protected DocumentIncorporatNouAccioRDTO convert(DocsTramitacioRDTO docsTramitacioRDTO) {
		return ConverterHelper.buildDocumentIncorporatNouAccioRDTOExpedient(docsTramitacioRDTO, origenApiParamValueTranslator);
	}
}