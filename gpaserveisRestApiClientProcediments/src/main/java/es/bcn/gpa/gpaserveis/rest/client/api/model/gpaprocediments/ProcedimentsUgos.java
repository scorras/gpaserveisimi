/*
 * API gpaprocediments
 * API gpaprocediments
 *
 * OpenAPI spec version: 2.2.2
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
 * ProcedimentsUgos
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-11T12:44:17.313+02:00")
public class ProcedimentsUgos {
  @JsonProperty("procediment")
  private BigDecimal procediment = null;

  @JsonProperty("ugoIdext")
  private BigDecimal ugoIdext = null;

  public ProcedimentsUgos procediment(BigDecimal procediment) {
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

  public ProcedimentsUgos ugoIdext(BigDecimal ugoIdext) {
    this.ugoIdext = ugoIdext;
    return this;
  }

   /**
   * Get ugoIdext
   * @return ugoIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUgoIdext() {
    return ugoIdext;
  }

  public void setUgoIdext(BigDecimal ugoIdext) {
    this.ugoIdext = ugoIdext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcedimentsUgos procedimentsUgos = (ProcedimentsUgos) o;
    return Objects.equals(this.procediment, procedimentsUgos.procediment) &&
        Objects.equals(this.ugoIdext, procedimentsUgos.ugoIdext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(procediment, ugoIdext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcedimentsUgos {\n");
    
    sb.append("    procediment: ").append(toIndentedString(procediment)).append("\n");
    sb.append("    ugoIdext: ").append(toIndentedString(ugoIdext)).append("\n");
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

