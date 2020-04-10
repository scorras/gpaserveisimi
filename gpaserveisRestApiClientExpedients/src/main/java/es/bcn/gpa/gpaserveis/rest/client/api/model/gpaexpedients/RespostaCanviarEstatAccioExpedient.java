/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.20.4
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ExpedientCanviarEstat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RespostaCanviarEstatAccioExpedient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-10T10:19:04.448+02:00")
public class RespostaCanviarEstatAccioExpedient {
  @JsonProperty("expedient")
  private ExpedientCanviarEstat expedient = null;

  public RespostaCanviarEstatAccioExpedient expedient(ExpedientCanviarEstat expedient) {
    this.expedient = expedient;
    return this;
  }

   /**
   * Dades bàsiques de l&#39;expedient
   * @return expedient
  **/
  @ApiModelProperty(value = "Dades bàsiques de l'expedient")
  public ExpedientCanviarEstat getExpedient() {
    return expedient;
  }

  public void setExpedient(ExpedientCanviarEstat expedient) {
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
    RespostaCanviarEstatAccioExpedient respostaCanviarEstatAccioExpedient = (RespostaCanviarEstatAccioExpedient) o;
    return Objects.equals(this.expedient, respostaCanviarEstatAccioExpedient.expedient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expedient);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaCanviarEstatAccioExpedient {\n");
    
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

