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
 * ConfdocstramTramitsOvt
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-26T17:52:18.478+02:00")
public class ConfdocstramTramitsOvt {
  @JsonProperty("confDocsTramitacio")
  private BigDecimal confDocsTramitacio = null;

  @JsonProperty("justificant")
  private Integer justificant = null;

  @JsonProperty("tramitOvtIdext")
  private BigDecimal tramitOvtIdext = null;

  public ConfdocstramTramitsOvt confDocsTramitacio(BigDecimal confDocsTramitacio) {
    this.confDocsTramitacio = confDocsTramitacio;
    return this;
  }

   /**
   * Get confDocsTramitacio
   * @return confDocsTramitacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getConfDocsTramitacio() {
    return confDocsTramitacio;
  }

  public void setConfDocsTramitacio(BigDecimal confDocsTramitacio) {
    this.confDocsTramitacio = confDocsTramitacio;
  }

  public ConfdocstramTramitsOvt justificant(Integer justificant) {
    this.justificant = justificant;
    return this;
  }

   /**
   * Get justificant
   * @return justificant
  **/
  @ApiModelProperty(value = "")
  public Integer getJustificant() {
    return justificant;
  }

  public void setJustificant(Integer justificant) {
    this.justificant = justificant;
  }

  public ConfdocstramTramitsOvt tramitOvtIdext(BigDecimal tramitOvtIdext) {
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
    ConfdocstramTramitsOvt confdocstramTramitsOvt = (ConfdocstramTramitsOvt) o;
    return Objects.equals(this.confDocsTramitacio, confdocstramTramitsOvt.confDocsTramitacio) &&
        Objects.equals(this.justificant, confdocstramTramitsOvt.justificant) &&
        Objects.equals(this.tramitOvtIdext, confdocstramTramitsOvt.tramitOvtIdext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confDocsTramitacio, justificant, tramitOvtIdext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfdocstramTramitsOvt {\n");
    
    sb.append("    confDocsTramitacio: ").append(toIndentedString(confDocsTramitacio)).append("\n");
    sb.append("    justificant: ").append(toIndentedString(justificant)).append("\n");
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

