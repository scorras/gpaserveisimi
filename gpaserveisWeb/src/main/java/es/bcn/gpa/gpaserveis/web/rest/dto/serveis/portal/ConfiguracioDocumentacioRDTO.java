package es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "ConfiguracioDocumentacio")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "codi", "descripcio", "descripcioCastella" })
@Getter
@Setter
public class ConfiguracioDocumentacioRDTO {

	@ApiModelProperty(value = "Codi del document")
	private String codi;
	@ApiModelProperty(value = "Descripció del document")
	private String descripcio;
	@ApiModelProperty(value = "Descripció del document en castellà")
	private String descripcioCastella;

}
