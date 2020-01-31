/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.16.2
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * ConfdocstramEstatsExp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-28T16:04:49.801+01:00")
public class ConfdocstramEstatsExp {
  @JsonProperty("confDocsTramitacio")
  private BigDecimal confDocsTramitacio = null;

  @JsonProperty("estatExpIdext")
  private BigDecimal estatExpIdext = null;

  public ConfdocstramEstatsExp confDocsTramitacio(BigDecimal confDocsTramitacio) {
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

  public ConfdocstramEstatsExp estatExpIdext(BigDecimal estatExpIdext) {
    this.estatExpIdext = estatExpIdext;
    return this;
  }

   /**
   * Get estatExpIdext
   * @return estatExpIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatExpIdext() {
    return estatExpIdext;
  }

  public void setEstatExpIdext(BigDecimal estatExpIdext) {
    this.estatExpIdext = estatExpIdext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfdocstramEstatsExp confdocstramEstatsExp = (ConfdocstramEstatsExp) o;
    return Objects.equals(this.confDocsTramitacio, confdocstramEstatsExp.confDocsTramitacio) &&
        Objects.equals(this.estatExpIdext, confdocstramEstatsExp.estatExpIdext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confDocsTramitacio, estatExpIdext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfdocstramEstatsExp {\n");
    
    sb.append("    confDocsTramitacio: ").append(toIndentedString(confDocsTramitacio)).append("\n");
    sb.append("    estatExpIdext: ").append(toIndentedString(estatExpIdext)).append("\n");
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

