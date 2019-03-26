package es.bcn.gpa.gpaserveis.business.dto.expedients;

import es.bcn.gpa.gpaserveis.business.dto.RespostaResultatBDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RespostaRegistrarSolicitudExpedient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RespostaExpedientsRegistrarBDTO {

	/** The resposta registrar solicitud expedient. */
	private RespostaRegistrarSolicitudExpedient respostaRegistrarSolicitudExpedient;

	/** The resposta resultat BDTO. */
	private RespostaResultatBDTO respostaResultatBDTO;

}
