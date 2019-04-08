/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.9.1
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RegistreAssentamentRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RespostaRegistrarSolicitudExpedient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T18:53:33.268+02:00")
public class RespostaRegistrarSolicitudExpedient {
  @JsonProperty("comprovant")
  private byte[] comprovant = null;

  @JsonProperty("expedient")
  private ExpedientsRDTO expedient = null;

  @JsonProperty("registreAssentament")
  private RegistreAssentamentRDTO registreAssentament = null;

  public RespostaRegistrarSolicitudExpedient comprovant(byte[] comprovant) {
    this.comprovant = comprovant;
    return this;
  }

   /**
   * Comprovant del registre
   * @return comprovant
  **/
  @ApiModelProperty(value = "Comprovant del registre")
  public byte[] getComprovant() {
    return comprovant;
  }

  public void setComprovant(byte[] comprovant) {
    this.comprovant = comprovant;
  }

  public RespostaRegistrarSolicitudExpedient expedient(ExpedientsRDTO expedient) {
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

  public RespostaRegistrarSolicitudExpedient registreAssentament(RegistreAssentamentRDTO registreAssentament) {
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
    RespostaRegistrarSolicitudExpedient respostaRegistrarSolicitudExpedient = (RespostaRegistrarSolicitudExpedient) o;
    return Objects.equals(this.comprovant, respostaRegistrarSolicitudExpedient.comprovant) &&
        Objects.equals(this.expedient, respostaRegistrarSolicitudExpedient.expedient) &&
        Objects.equals(this.registreAssentament, respostaRegistrarSolicitudExpedient.registreAssentament);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comprovant, expedient, registreAssentament);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaRegistrarSolicitudExpedient {\n");
    
    sb.append("    comprovant: ").append(toIndentedString(comprovant)).append("\n");
    sb.append("    expedient: ").append(toIndentedString(expedient)).append("\n");
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

