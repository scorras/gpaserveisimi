package es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.expedients.revisar;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.PersonesRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "ExpedientRevisar")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "procediment", "unitatGestora", "numeroRegistre", "sollicitant", "representant" })
@Getter
@Setter
public class ExpedientRevisarRDTO {

	@ApiModelProperty(value = "Procediment associat a la sol·licitud", required = true)
	private ProcedimentExpedientRevisarRDTO procediment;
	@ApiModelProperty(value = "Unitat Gestora que tramitarà inicialment la sol·licitud", required = false)
	private UnitatGestoraExpedientRevisarRDTO unitatGestora;
	@ApiModelProperty(value = "Número de registre.")
	private String numeroRegistre;
	@ApiModelProperty(value = "Persona sol·licitant", required = true)
	private PersonesRDTO sollicitant;
	@ApiModelProperty(value = "Persona representant", required = false)
	private PersonesRDTO representant;

}