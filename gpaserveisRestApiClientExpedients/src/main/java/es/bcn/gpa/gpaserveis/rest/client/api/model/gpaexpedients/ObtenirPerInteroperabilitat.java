/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.17.0
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

/**
 * ObtenirPerInteroperabilitat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-14T12:29:56.498+01:00")
public class ObtenirPerInteroperabilitat {
  @JsonProperty("codiServei")
  private String codiServei = null;

  public ObtenirPerInteroperabilitat codiServei(String codiServei) {
    this.codiServei = codiServei;
    return this;
  }

   /**
   * Codi del servei a executar
   * @return codiServei
  **/
  @ApiModelProperty(value = "Codi del servei a executar")
  public String getCodiServei() {
    return codiServei;
  }

  public void setCodiServei(String codiServei) {
    this.codiServei = codiServei;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObtenirPerInteroperabilitat obtenirPerInteroperabilitat = (ObtenirPerInteroperabilitat) o;
    return Objects.equals(this.codiServei, obtenirPerInteroperabilitat.codiServei);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiServei);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObtenirPerInteroperabilitat {\n");
    
    sb.append("    codiServei: ").append(toIndentedString(codiServei)).append("\n");
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

