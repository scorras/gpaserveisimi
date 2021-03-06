package es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import es.bcn.gpa.gpaserveis.business.xml.bind.adapter.DataHoraAdapter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.Constants;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.document.RevisioApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.RegistreRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.DocumentRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.TramitsOvtRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "DocumentAportatConsulta")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "idGestorDocumental", "nom", "configuracioDocumentacio", "dataPresentacio", "registre", "revisio", "dataCreacio",
		"origen", "hash", "codiCSV", "tramit" })
@XmlRootElement(name = "DOCUMENT")
@XmlType(name = "DocumentAportatConsulta", propOrder = { "dataPresentacio", "registre", "revisio" })
@XmlAccessorType(XmlAccessType.NONE)
@Getter
@Setter
public class DocumentAportatConsultaRDTO extends DocumentRDTO {
	@ApiModelProperty(value = "Data de presentaci√≥ del document")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.DATE_TIME_PATTERN)
	@XmlElement(name = "DATA_PRESENTACIO", required = false)
	@XmlJavaTypeAdapter(DataHoraAdapter.class)
	private String dataPresentacio;
	@ApiModelProperty(value = "Registre del document")
	@XmlElement(name = "REGISTRE", required = false, type = RegistreRDTO.class)
	private RegistreRDTO registre;
	@ApiModelProperty(value = "Estat de revisi√≥ del document", allowableValues = RevisioApiParamValueTranslator.REQUEST_PARAM_ALLOWABLE_VALUES)
	@XmlElement(name = "REVISIO", required = true, type = String.class)
	private String revisio;
	@ApiModelProperty(value = "Tr√†mit")
	@XmlTransient
	private TramitsOvtRDTO tramit;

}
