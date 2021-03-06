package es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.common;

import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Component;

import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.common.BooleanApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.ApiParamValueTranslator;

/**
 * The Class BooleanApiParamValueTranslator.
 */
@SuppressWarnings("unchecked")
@Component("booleanApiParamValueTranslator")
public class BooleanApiParamValueTranslator extends ApiParamValueTranslator<BooleanApiParamValue, Integer> {

	public Boolean getApiParamValueAsBooleanByInternalValue(Object internalValue) {
		return Boolean.valueOf(getApiParamValueByInternalValue(internalValue));
	}

	public Integer getInternalValueByApiParamValueAsBoolean(Boolean apiParamValue) {
		if (apiParamValue == null) {
			return NumberUtils.INTEGER_ZERO;
		}
		return getInternalValueByApiParamValue(apiParamValue.toString().toUpperCase());
	}
}
