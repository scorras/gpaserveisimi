package es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import es.bcn.gpa.gpaserveis.business.xml.bind.adapter.DataHoraAdapter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.Constants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "Registre")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "numRegistre", "dataRegistre", "persona" })
@XmlRootElement(name = "REGISTRE")
@XmlType(name = "Registre", propOrder = { "numRegistre", "dataRegistre", "persona" })
@XmlAccessorType(XmlAccessType.NONE)
@Getter
@Setter
public class RegistreRDTO {

	@ApiModelProperty(value = "Número del registre")
	@XmlElement(name = "NUM_REGISTRE", required = true, type = String.class)
	private String numRegistre;
	@ApiModelProperty(value = "Data del registre")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.DATE_TIME_PATTERN)
	@XmlElement(name = "DATA_REGISTRE", required = true)
	@XmlJavaTypeAdapter(DataHoraAdapter.class)
	private String dataRegistre;
	@ApiModelProperty(value = "Persona que ha efectuat el registre")
	@XmlElement(name = "PERSONA", required = true, type = PersonesRDTO.class)
	private PersonesRDTO persona;

}
