/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.7.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ExpedientsRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RespostaAbandonarExpedient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-26T01:50:19.832+01:00")
public class RespostaAbandonarExpedient {
  @JsonProperty("expedient")
  private ExpedientsRDTO expedient = null;

  public RespostaAbandonarExpedient expedient(ExpedientsRDTO expedient) {
    this.expedient = expedient;
    return this;
  }

   /**
   * Dades bàsiques de l&#39;expedient
   * @return expedient
  **/
  @ApiModelProperty(value = "Dades bàsiques de l'expedient")
  public ExpedientsRDTO getExpedient() {
    return expedient;
  }

  public void setExpedient(ExpedientsRDTO expedient) {
    this.expedient = expedient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespostaAbandonarExpedient respostaAbandonarExpedient = (RespostaAbandonarExpedient) o;
    return Objects.equals(this.expedient, respostaAbandonarExpedient.expedient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expedient);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaAbandonarExpedient {\n");
    
    sb.append("    expedient: ").append(toIndentedString(expedient)).append("\n");
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

