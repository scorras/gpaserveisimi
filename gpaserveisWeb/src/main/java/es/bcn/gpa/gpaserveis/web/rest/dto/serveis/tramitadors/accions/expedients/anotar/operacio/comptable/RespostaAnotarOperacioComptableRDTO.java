package es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.expedients.anotar.operacio.comptable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.ResultatRespostaDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.ExpedientAccioRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "RespostaAnotarOperacioComptable")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "resultat", "expedient" })
@Getter
@Setter
public class RespostaAnotarOperacioComptableRDTO {

	@ApiModelProperty("Resultat de l'operació")
	private ResultatRespostaDTO resultat;

	@ApiModelProperty("Expedient")
	private ExpedientAccioRDTO expedient;

}
