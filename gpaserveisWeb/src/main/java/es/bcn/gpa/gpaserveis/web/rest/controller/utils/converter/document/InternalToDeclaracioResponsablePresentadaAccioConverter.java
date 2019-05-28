package es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.document;

import org.modelmapper.AbstractConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsEntradaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.ConverterHelper;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.BaseApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.documentacio.DeclaracioResponsablePresentadaAccioRDTO;

/**
 * The Class InternalToDeclaracioResponsablePresentadaAccioConverter.
 */
@Component("internalToDeclaracioResponsablePresentadaAccioConverter")
public class InternalToDeclaracioResponsablePresentadaAccioConverter
        extends AbstractConverter<DocsEntradaRDTO, DeclaracioResponsablePresentadaAccioRDTO> {

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
	protected DeclaracioResponsablePresentadaAccioRDTO convert(DocsEntradaRDTO docsEntradaRDTO) {
		return ConverterHelper.buildDeclaracioResponsablePresentadaAccioRDTOExpedient(docsEntradaRDTO, origenApiParamValueTranslator);
	}
}