/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.13.2
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ConvidarTramitarBDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-14T14:00:28.664+02:00")
public class ConvidarTramitarBDTO {
  @JsonProperty("comentari")
  private Comentaris comentari = null;

  @JsonProperty("idExpedient")
  private BigDecimal idExpedient = null;

  @JsonProperty("unitatGestoraConvidada")
  private DropdownItemBDTO unitatGestoraConvidada = null;

  public ConvidarTramitarBDTO comentari(Comentaris comentari) {
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

  public ConvidarTramitarBDTO idExpedient(BigDecimal idExpedient) {
    this.idExpedient = idExpedient;
    return this;
  }

   /**
   * Get idExpedient
   * @return idExpedient
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdExpedient() {
    return idExpedient;
  }

  public void setIdExpedient(BigDecimal idExpedient) {
    this.idExpedient = idExpedient;
  }

  public ConvidarTramitarBDTO unitatGestoraConvidada(DropdownItemBDTO unitatGestoraConvidada) {
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
    ConvidarTramitarBDTO convidarTramitarBDTO = (ConvidarTramitarBDTO) o;
    return Objects.equals(this.comentari, convidarTramitarBDTO.comentari) &&
        Objects.equals(this.idExpedient, convidarTramitarBDTO.idExpedient) &&
        Objects.equals(this.unitatGestoraConvidada, convidarTramitarBDTO.unitatGestoraConvidada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comentari, idExpedient, unitatGestoraConvidada);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvidarTramitarBDTO {\n");
    
    sb.append("    comentari: ").append(toIndentedString(comentari)).append("\n");
    sb.append("    idExpedient: ").append(toIndentedString(idExpedient)).append("\n");
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

