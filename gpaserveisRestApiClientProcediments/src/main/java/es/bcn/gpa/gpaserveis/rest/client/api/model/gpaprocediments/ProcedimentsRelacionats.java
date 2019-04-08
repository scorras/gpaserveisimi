/*
 * API gpaprocediments
 * API gpaprocediments
 *
 * OpenAPI spec version: 1.8.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * ProcedimentsRelacionats
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T17:18:13.226+02:00")
public class ProcedimentsRelacionats {
  @JsonProperty("altresEspecificar")
  private String altresEspecificar = null;

  @JsonProperty("procediment")
  private BigDecimal procediment = null;

  @JsonProperty("relacio")
  private BigDecimal relacio = null;

  @JsonProperty("relacionat")
  private BigDecimal relacionat = null;

  public ProcedimentsRelacionats altresEspecificar(String altresEspecificar) {
    this.altresEspecificar = altresEspecificar;
    return this;
  }

   /**
   * Get altresEspecificar
   * @return altresEspecificar
  **/
  @ApiModelProperty(value = "")
  public String getAltresEspecificar() {
    return altresEspecificar;
  }

  public void setAltresEspecificar(String altresEspecificar) {
    this.altresEspecificar = altresEspecificar;
  }

  public ProcedimentsRelacionats procediment(BigDecimal procediment) {
    this.procediment = procediment;
    return this;
  }

   /**
   * Get procediment
   * @return procediment
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getProcediment() {
    return procediment;
  }

  public void setProcediment(BigDecimal procediment) {
    this.procediment = procediment;
  }

  public ProcedimentsRelacionats relacio(BigDecimal relacio) {
    this.relacio = relacio;
    return this;
  }

   /**
   * Get relacio
   * @return relacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRelacio() {
    return relacio;
  }

  public void setRelacio(BigDecimal relacio) {
    this.relacio = relacio;
  }

  public ProcedimentsRelacionats relacionat(BigDecimal relacionat) {
    this.relacionat = relacionat;
    return this;
  }

   /**
   * Get relacionat
   * @return relacionat
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRelacionat() {
    return relacionat;
  }

  public void setRelacionat(BigDecimal relacionat) {
    this.relacionat = relacionat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcedimentsRelacionats procedimentsRelacionats = (ProcedimentsRelacionats) o;
    return Objects.equals(this.altresEspecificar, procedimentsRelacionats.altresEspecificar) &&
        Objects.equals(this.procediment, procedimentsRelacionats.procediment) &&
        Objects.equals(this.relacio, procedimentsRelacionats.relacio) &&
        Objects.equals(this.relacionat, procedimentsRelacionats.relacionat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altresEspecificar, procediment, relacio, relacionat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcedimentsRelacionats {\n");
    
    sb.append("    altresEspecificar: ").append(toIndentedString(altresEspecificar)).append("\n");
    sb.append("    procediment: ").append(toIndentedString(procediment)).append("\n");
    sb.append("    relacio: ").append(toIndentedString(relacio)).append("\n");
    sb.append("    relacionat: ").append(toIndentedString(relacionat)).append("\n");
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

