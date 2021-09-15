/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 2.5.3
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * EstatsUgConvidada
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-15T10:56:55.879+02:00")
public class EstatsUgConvidada {
  @JsonProperty("estats")
  private BigDecimal estats = null;

  @JsonProperty("ugConvidadaIdext")
  private BigDecimal ugConvidadaIdext = null;

  public EstatsUgConvidada estats(BigDecimal estats) {
    this.estats = estats;
    return this;
  }

   /**
   * Get estats
   * @return estats
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstats() {
    return estats;
  }

  public void setEstats(BigDecimal estats) {
    this.estats = estats;
  }

  public EstatsUgConvidada ugConvidadaIdext(BigDecimal ugConvidadaIdext) {
    this.ugConvidadaIdext = ugConvidadaIdext;
    return this;
  }

   /**
   * Get ugConvidadaIdext
   * @return ugConvidadaIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUgConvidadaIdext() {
    return ugConvidadaIdext;
  }

  public void setUgConvidadaIdext(BigDecimal ugConvidadaIdext) {
    this.ugConvidadaIdext = ugConvidadaIdext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstatsUgConvidada estatsUgConvidada = (EstatsUgConvidada) o;
    return Objects.equals(this.estats, estatsUgConvidada.estats) &&
        Objects.equals(this.ugConvidadaIdext, estatsUgConvidada.ugConvidadaIdext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estats, ugConvidadaIdext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstatsUgConvidada {\n");
    
    sb.append("    estats: ").append(toIndentedString(estats)).append("\n");
    sb.append("    ugConvidadaIdext: ").append(toIndentedString(ugConvidadaIdext)).append("\n");
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

