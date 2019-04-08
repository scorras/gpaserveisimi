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
 * ProcedimentsRelacionatsRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T18:54:04.705+02:00")
public class ProcedimentsRelacionatsRDTO {
  @JsonProperty("altresEspecificar")
  private String altresEspecificar = null;

  @JsonProperty("procediment")
  private BigDecimal procediment = null;

  @JsonProperty("relacio")
  private BigDecimal relacio = null;

  @JsonProperty("relacionat")
  private BigDecimal relacionat = null;

  public ProcedimentsRelacionatsRDTO altresEspecificar(String altresEspecificar) {
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

  public ProcedimentsRelacionatsRDTO procediment(BigDecimal procediment) {
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

  public ProcedimentsRelacionatsRDTO relacio(BigDecimal relacio) {
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

  public ProcedimentsRelacionatsRDTO relacionat(BigDecimal relacionat) {
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
    ProcedimentsRelacionatsRDTO procedimentsRelacionatsRDTO = (ProcedimentsRelacionatsRDTO) o;
    return Objects.equals(this.altresEspecificar, procedimentsRelacionatsRDTO.altresEspecificar) &&
        Objects.equals(this.procediment, procedimentsRelacionatsRDTO.procediment) &&
        Objects.equals(this.relacio, procedimentsRelacionatsRDTO.relacio) &&
        Objects.equals(this.relacionat, procedimentsRelacionatsRDTO.relacionat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altresEspecificar, procediment, relacio, relacionat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcedimentsRelacionatsRDTO {\n");
    
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

