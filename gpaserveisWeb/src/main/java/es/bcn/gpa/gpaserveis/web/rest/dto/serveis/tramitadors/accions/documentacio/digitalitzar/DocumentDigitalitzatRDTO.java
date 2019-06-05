package es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.digitalitzar;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.document.ConfiguracioApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.document.OrigenApiParamValueTranslator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "DocumentDigitalitzat")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "configuracio", "configuracioDocumentacio", "origen", "comentari", "numeroRegistre" })
@Getter
@Setter
public class DocumentDigitalitzatRDTO {

	@ApiModelProperty(value = "Configuració del document.", required = true, allowableValues = ConfiguracioApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES)
	private String configuracio;
	@ApiModelProperty(value = "Codi corresponent a la configuració del document definit a RPA.", required = true)
	private String configuracioDocumentacio;
	@ApiModelProperty(value = "Origen del tipus de documentació.", required = true, allowableValues = OrigenApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES)
	private String origen;
	@ApiModelProperty(value = "Comentari del document.")
	private String comentari;
	@ApiModelProperty(value = "Número de registre.")
	private String numeroRegistre;

}
