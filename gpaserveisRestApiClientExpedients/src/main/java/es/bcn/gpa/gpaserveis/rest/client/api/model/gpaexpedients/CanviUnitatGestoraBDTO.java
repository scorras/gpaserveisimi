/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.15.0
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

/**
 * CanviUnitatGestoraBDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-15T10:03:16.673+02:00")
public class CanviUnitatGestoraBDTO {
  @JsonProperty("comentari")
  private Comentaris comentari = null;

  @JsonProperty("idExpedient")
  private BigDecimal idExpedient = null;

  @JsonProperty("unitatGestoraActual")
  private DropdownItemBDTO unitatGestoraActual = null;

  @JsonProperty("unitatGestoraFutura")
  private DropdownItemBDTO unitatGestoraFutura = null;

  public CanviUnitatGestoraBDTO comentari(Comentaris comentari) {
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

  public CanviUnitatGestoraBDTO idExpedient(BigDecimal idExpedient) {
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

  public CanviUnitatGestoraBDTO unitatGestoraActual(DropdownItemBDTO unitatGestoraActual) {
    this.unitatGestoraActual = unitatGestoraActual;
    return this;
  }

   /**
   * Get unitatGestoraActual
   * @return unitatGestoraActual
  **/
  @ApiModelProperty(value = "")
  public DropdownItemBDTO getUnitatGestoraActual() {
    return unitatGestoraActual;
  }

  public void setUnitatGestoraActual(DropdownItemBDTO unitatGestoraActual) {
    this.unitatGestoraActual = unitatGestoraActual;
  }

  public CanviUnitatGestoraBDTO unitatGestoraFutura(DropdownItemBDTO unitatGestoraFutura) {
    this.unitatGestoraFutura = unitatGestoraFutura;
    return this;
  }

   /**
   * Get unitatGestoraFutura
   * @return unitatGestoraFutura
  **/
  @ApiModelProperty(value = "")
  public DropdownItemBDTO getUnitatGestoraFutura() {
    return unitatGestoraFutura;
  }

  public void setUnitatGestoraFutura(DropdownItemBDTO unitatGestoraFutura) {
    this.unitatGestoraFutura = unitatGestoraFutura;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CanviUnitatGestoraBDTO canviUnitatGestoraBDTO = (CanviUnitatGestoraBDTO) o;
    return Objects.equals(this.comentari, canviUnitatGestoraBDTO.comentari) &&
        Objects.equals(this.idExpedient, canviUnitatGestoraBDTO.idExpedient) &&
        Objects.equals(this.unitatGestoraActual, canviUnitatGestoraBDTO.unitatGestoraActual) &&
        Objects.equals(this.unitatGestoraFutura, canviUnitatGestoraBDTO.unitatGestoraFutura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comentari, idExpedient, unitatGestoraActual, unitatGestoraFutura);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CanviUnitatGestoraBDTO {\n");
    
    sb.append("    comentari: ").append(toIndentedString(comentari)).append("\n");
    sb.append("    idExpedient: ").append(toIndentedString(idExpedient)).append("\n");
    sb.append("    unitatGestoraActual: ").append(toIndentedString(unitatGestoraActual)).append("\n");
    sb.append("    unitatGestoraFutura: ").append(toIndentedString(unitatGestoraFutura)).append("\n");
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

