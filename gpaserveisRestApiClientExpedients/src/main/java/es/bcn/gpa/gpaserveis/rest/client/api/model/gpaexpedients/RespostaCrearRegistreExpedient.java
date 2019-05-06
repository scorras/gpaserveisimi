/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.11.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RegistreAssentamentRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RespostaCrearRegistreExpedient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T09:02:05.732+02:00")
public class RespostaCrearRegistreExpedient {
  @JsonProperty("registreAssentament")
  private RegistreAssentamentRDTO registreAssentament = null;

  public RespostaCrearRegistreExpedient registreAssentament(RegistreAssentamentRDTO registreAssentament) {
    this.registreAssentament = registreAssentament;
    return this;
  }

   /**
   * Dades del registre de l&#39;expedient
   * @return registreAssentament
  **/
  @ApiModelProperty(value = "Dades del registre de l'expedient")
  public RegistreAssentamentRDTO getRegistreAssentament() {
    return registreAssentament;
  }

  public void setRegistreAssentament(RegistreAssentamentRDTO registreAssentament) {
    this.registreAssentament = registreAssentament;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespostaCrearRegistreExpedient respostaCrearRegistreExpedient = (RespostaCrearRegistreExpedient) o;
    return Objects.equals(this.registreAssentament, respostaCrearRegistreExpedient.registreAssentament);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registreAssentament);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaCrearRegistreExpedient {\n");
    
    sb.append("    registreAssentament: ").append(toIndentedString(registreAssentament)).append("\n");
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
