package es.bcn.gpa.gpaserveis.business.dto.expedients;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.AbandonarExpedient;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.expedient.AccioAbandonarApiParamValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * The Class ExpedientsAbandonarBDTO.
 */
@Getter
@Setter
@AllArgsConstructor
public class ExpedientsAbandonarBDTO {

	/** The abandonar expedient. */
	private AbandonarExpedient abandonarExpedient;

	/** The abandonar api param value. */
	private AccioAbandonarApiParamValue abandonarApiParamValue;
}
