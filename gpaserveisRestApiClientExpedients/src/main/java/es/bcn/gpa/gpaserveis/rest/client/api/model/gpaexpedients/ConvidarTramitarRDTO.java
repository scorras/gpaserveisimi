/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.11.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.Comentaris;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.DropdownItemBDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ConvidarTramitarRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T09:02:05.732+02:00")
public class ConvidarTramitarRDTO {
  @JsonProperty("comentari")
  private Comentaris comentari = null;

  @JsonProperty("idExpedientList")
  private List<BigDecimal> idExpedientList = null;

  @JsonProperty("unitatGestoraConvidada")
  private DropdownItemBDTO unitatGestoraConvidada = null;

  public ConvidarTramitarRDTO comentari(Comentaris comentari) {
    this.comentari = comentari;
    return this;
  }

   /**
   * Get comentari
   * @return comentari
  **/
  @ApiModelProperty(value = "")
  public Comentaris getComentari() {
    return comentari;
  }

  public void setComentari(Comentaris comentari) {
    this.comentari = comentari;
  }

  public ConvidarTramitarRDTO idExpedientList(List<BigDecimal> idExpedientList) {
    this.idExpedientList = idExpedientList;
    return this;
  }

  public ConvidarTramitarRDTO addIdExpedientListItem(BigDecimal idExpedientListItem) {
    if (this.idExpedientList == null) {
      this.idExpedientList = new ArrayList<BigDecimal>();
    }
    this.idExpedientList.add(idExpedientListItem);
    return this;
  }

   /**
   * Get idExpedientList
   * @return idExpedientList
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getIdExpedientList() {
    return idExpedientList;
  }

  public void setIdExpedientList(List<BigDecimal> idExpedientList) {
    this.idExpedientList = idExpedientList;
  }

  public ConvidarTramitarRDTO unitatGestoraConvidada(DropdownItemBDTO unitatGestoraConvidada) {
    this.unitatGestoraConvidada = unitatGestoraConvidada;
    return this;
  }

   /**
   * Get unitatGestoraConvidada
   * @return unitatGestoraConvidada
  **/
  @ApiModelProperty(value = "")
  public DropdownItemBDTO getUnitatGestoraConvidada() {
    return unitatGestoraConvidada;
  }

  public void setUnitatGestoraConvidada(DropdownItemBDTO unitatGestoraConvidada) {
    this.unitatGestoraConvidada = unitatGestoraConvidada;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvidarTramitarRDTO convidarTramitarRDTO = (ConvidarTramitarRDTO) o;
    return Objects.equals(this.comentari, convidarTramitarRDTO.comentari) &&
        Objects.equals(this.idExpedientList, convidarTramitarRDTO.idExpedientList) &&
        Objects.equals(this.unitatGestoraConvidada, convidarTramitarRDTO.unitatGestoraConvidada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comentari, idExpedientList, unitatGestoraConvidada);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvidarTramitarRDTO {\n");
    
    sb.append("    comentari: ").append(toIndentedString(comentari)).append("\n");
    sb.append("    idExpedientList: ").append(toIndentedString(idExpedientList)).append("\n");
    sb.append("    unitatGestoraConvidada: ").append(toIndentedString(unitatGestoraConvidada)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

