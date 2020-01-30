package es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.estatDigitalitzacio;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.ResultatRespostaDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients.ExpedientAccioRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "RespostaEstatDigitalitzacio")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "resultat", "expedient" })
@Getter
@Setter
public class RespostaEstatDigitalitzacioRDTO {

	@ApiModelProperty("Resultat de l'operació")
	private ResultatRespostaDTO resultat;
	@ApiModelProperty("Expedient")
	private ExpedientAccioRDTO expedient;
	@ApiModelProperty("Estat de digitalitzacio")
	private String estatDigitalitzacio;
	@ApiModelProperty("Message")
	private String message;
}