package es.bcn.gpa.gpaserveis.business.dto.documents;

import java.math.BigDecimal;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsTramitacioRDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ActualitzarDocumentTramitacioBDTO {

	/** The id expedient. */
	private BigDecimal idExpedient;

	/** The docs tramitacio RDTO. */
	private DocsTramitacioRDTO docsTramitacioRDTO;

}
