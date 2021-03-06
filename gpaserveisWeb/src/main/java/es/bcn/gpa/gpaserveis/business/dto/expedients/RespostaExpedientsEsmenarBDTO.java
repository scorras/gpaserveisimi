package es.bcn.gpa.gpaserveis.business.dto.expedients;

import java.math.BigDecimal;
import java.util.List;

import es.bcn.gpa.gpaserveis.business.dto.RespostaResultatBDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsEntradaRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ExpedientsRDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RespostaExpedientsEsmenarBDTO {

	/** The expedients RDTO. */
	private ExpedientsRDTO expedientsRDTO;

	/** The id resposta crear justificant. */
	private BigDecimal idRespostaCrearJustificant = null;

	/** The resposta resultat BDTO. */
	private RespostaResultatBDTO respostaResultatBDTO;

	/** The docs entrada RDTO list. */
	private List<DocsEntradaRDTO> docsEntradaRDTOList = null;

}
