/*
 * API gpaprocediments
 * API gpaprocediments
 *
 * OpenAPI spec version: 2.4.0
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
 * ConfdocsentTramitsOvt
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-26T17:52:18.478+02:00")
public class ConfdocsentTramitsOvt {
  @JsonProperty("comprovant")
  private Integer comprovant = null;

  @JsonProperty("confDocsEntrada")
  private BigDecimal confDocsEntrada = null;

  @JsonProperty("tramitOvtIdext")
  private BigDecimal tramitOvtIdext = null;

  public ConfdocsentTramitsOvt comprovant(Integer comprovant) {
    this.comprovant = comprovant;
    return this;
  }

   /**
   * Get comprovant
   * @return comprovant
  **/
  @ApiModelProperty(value = "")
  public Integer getComprovant() {
    return comprovant;
  }

  public void setComprovant(Integer comprovant) {
    this.comprovant = comprovant;
  }

  public ConfdocsentTramitsOvt confDocsEntrada(BigDecimal confDocsEntrada) {
    this.confDocsEntrada = confDocsEntrada;
    return this;
  }

   /**
   * Get confDocsEntrada
   * @return confDocsEntrada
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getConfDocsEntrada() {
    return confDocsEntrada;
  }

  public void setConfDocsEntrada(BigDecimal confDocsEntrada) {
    this.confDocsEntrada = confDocsEntrada;
  }

  public ConfdocsentTramitsOvt tramitOvtIdext(BigDecimal tramitOvtIdext) {
    this.tramitOvtIdext = tramitOvtIdext;
    return this;
  }

   /**
   * Get tramitOvtIdext
   * @return tramitOvtIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTramitOvtIdext() {
    return tramitOvtIdext;
  }

  public void setTramitOvtIdext(BigDecimal tramitOvtIdext) {
    this.tramitOvtIdext = tramitOvtIdext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfdocsentTramitsOvt confdocsentTramitsOvt = (ConfdocsentTramitsOvt) o;
    return Objects.equals(this.comprovant, confdocsentTramitsOvt.comprovant) &&
        Objects.equals(this.confDocsEntrada, confdocsentTramitsOvt.confDocsEntrada) &&
        Objects.equals(this.tramitOvtIdext, confdocsentTramitsOvt.tramitOvtIdext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comprovant, confDocsEntrada, tramitOvtIdext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfdocsentTramitsOvt {\n");
    
    sb.append("    comprovant: ").append(toIndentedString(comprovant)).append("\n");
    sb.append("    confDocsEntrada: ").append(toIndentedString(confDocsEntrada)).append("\n");
    sb.append("    tramitOvtIdext: ").append(toIndentedString(tramitOvtIdext)).append("\n");
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

