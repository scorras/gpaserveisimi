package es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.document;

import org.springframework.stereotype.Component;

import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.document.RevisioApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.ApiParamValueTranslator;

/**
 * The Class RevisioApiParamValueTranslator.
 */
@SuppressWarnings("unchecked")
@Component("documentRevisioApiParamValueTranslator")
public class RevisioApiParamValueTranslator extends ApiParamValueTranslator<RevisioApiParamValue, Integer> {

	/** The Constant REQUEST_PARAM_ALLOWABLE_VALUES. */
	public static final String REQUEST_PARAM_ALLOWABLE_VALUES = "CORRECTE, INCORRECTE, PENDENT";

}
