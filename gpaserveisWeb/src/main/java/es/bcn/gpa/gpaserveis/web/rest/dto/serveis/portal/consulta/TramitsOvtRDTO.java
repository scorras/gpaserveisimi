package es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.procediment.TramitOvtApiParamValueTranslator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "TramitsOvt")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "codi", "nom" })
@XmlRootElement(name = "TRAMIT")
@XmlType(name = "TramitsOvt", propOrder = { "codi", "nom" })
@XmlAccessorType(XmlAccessType.NONE)
@Getter
@Setter
public class TramitsOvtRDTO {
	@ApiModelProperty(value = "Codi del tràmit", allowableValues = TramitOvtApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES)
	@XmlElement(name = "CODI", required = true, type = String.class)
	private String codi;
	@ApiModelProperty(value = "Nom del tràmit")
	@XmlElement(name = "NOM", required = false, type = String.class)
	private String nom;

}