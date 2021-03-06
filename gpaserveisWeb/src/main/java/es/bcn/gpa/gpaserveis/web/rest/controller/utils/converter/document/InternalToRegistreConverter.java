package es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.document;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.modelmapper.AbstractConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.RegistreAssentament;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.Constants;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.ConverterHelper;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.BaseApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.RegistreRDTO;

/**
 * The Class InternalToRegistreConverter.
 */
@Component("documentInternalToRegistreConverter")
public class InternalToRegistreConverter extends AbstractConverter<RegistreAssentament, RegistreRDTO> {

	/** The tipus persona api param value translator. */
	@Autowired
	@Qualifier("expedientTipusPersonaApiParamValueTranslator")
	private BaseApiParamValueTranslator tipusPersonaApiParamValueTranslator;

	/** The tipus document identitat api param value translator. */
	@Autowired
	@Qualifier("expedientTipusDocumentIdentitatApiParamValueTranslator")
	private BaseApiParamValueTranslator tipusDocumentIdentitatApiParamValueTranslator;

	/** The tipus sexe api param value translator. */
	@Autowired
	@Qualifier("expedientTipusSexeApiParamValueTranslator")
	private BaseApiParamValueTranslator tipusSexeApiParamValueTranslator;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.modelmapper.AbstractConverter#convert(java.lang.Object)
	 */
	@Override
	protected RegistreRDTO convert(RegistreAssentament source) {

		RegistreRDTO registreRDTO = null;
		if (source != null) {
			registreRDTO = new RegistreRDTO();
			registreRDTO.setNumRegistre(source.getCodi());
			DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(Constants.DATE_TIME_PATTERN);
			registreRDTO.setDataRegistre((source.getDataRegistre() != null) ? dateTimeFormatter.print(source.getDataRegistre()) : null);
			registreRDTO.setPersona(ConverterHelper.buildPersonesRDTOExpedient(source.getPersones(), tipusPersonaApiParamValueTranslator,
			        tipusDocumentIdentitatApiParamValueTranslator, tipusSexeApiParamValueTranslator));
		}
		return registreRDTO;
	}
}