package es.bcn.gpa.gpaserveis.business.dto.documents;

import java.math.BigDecimal;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.GuardarRequerimentExpedient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CrearRequerimentBDTO {

	/** The id expedient. */
	private BigDecimal idExpedient;

	/** The guardar requeriment expedient. */
	private GuardarRequerimentExpedient guardarRequerimentExpedient;

}
