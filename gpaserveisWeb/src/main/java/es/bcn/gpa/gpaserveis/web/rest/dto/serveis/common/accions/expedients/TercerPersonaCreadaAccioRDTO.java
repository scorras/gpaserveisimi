package es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.accions.expedients;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "TercerPersonaCreadaAccio")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id" })
@Getter
@Setter
public class TercerPersonaCreadaAccioRDTO {

	@ApiModelProperty(value = "Id de la persona")
	private BigDecimal id;

}
