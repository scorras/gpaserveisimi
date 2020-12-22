/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.26.7
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RespostaServeiDgtRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RespostaInteroperabilitat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-22T09:39:21.499+01:00")
public class RespostaInteroperabilitat {
  @JsonProperty("respostaServeiDgt")
  private RespostaServeiDgtRDTO respostaServeiDgt = null;

  public RespostaInteroperabilitat respostaServeiDgt(RespostaServeiDgtRDTO respostaServeiDgt) {
    this.respostaServeiDgt = respostaServeiDgt;
    return this;
  }

   /**
   * Resposta del servei DGT
   * @return respostaServeiDgt
  **/
  @ApiModelProperty(value = "Resposta del servei DGT")
  public RespostaServeiDgtRDTO getRespostaServeiDgt() {
    return respostaServeiDgt;
  }

  public void setRespostaServeiDgt(RespostaServeiDgtRDTO respostaServeiDgt) {
    this.respostaServeiDgt = respostaServeiDgt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespostaInteroperabilitat respostaInteroperabilitat = (RespostaInteroperabilitat) o;
    return Objects.equals(this.respostaServeiDgt, respostaInteroperabilitat.respostaServeiDgt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(respostaServeiDgt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaInteroperabilitat {\n");
    
    sb.append("    respostaServeiDgt: ").append(toIndentedString(respostaServeiDgt)).append("\n");
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

