/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.22.0
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
 * RegistreDocumentacioExpedient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T12:03:42.109+02:00")
public class RegistreDocumentacioExpedient {
  @JsonProperty("idJustificant")
  private String idJustificant = null;

  @JsonProperty("numAss")
  private String numAss = null;

  public RegistreDocumentacioExpedient idJustificant(String idJustificant) {
    this.idJustificant = idJustificant;
    return this;
  }

   /**
   * Identificador del justificant a vincular
   * @return idJustificant
  **/
  @ApiModelProperty(value = "Identificador del justificant a vincular")
  public String getIdJustificant() {
    return idJustificant;
  }

  public void setIdJustificant(String idJustificant) {
    this.idJustificant = idJustificant;
  }

  public RegistreDocumentacioExpedient numAss(String numAss) {
    this.numAss = numAss;
    return this;
  }

   /**
   * Número d&#39;assentament
   * @return numAss
  **/
  @ApiModelProperty(value = "Número d'assentament")
  public String getNumAss() {
    return numAss;
  }

  public void setNumAss(String numAss) {
    this.numAss = numAss;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistreDocumentacioExpedient registreDocumentacioExpedient = (RegistreDocumentacioExpedient) o;
    return Objects.equals(this.idJustificant, registreDocumentacioExpedient.idJustificant) &&
        Objects.equals(this.numAss, registreDocumentacioExpedient.numAss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idJustificant, numAss);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistreDocumentacioExpedient {\n");
    
    sb.append("    idJustificant: ").append(toIndentedString(idJustificant)).append("\n");
    sb.append("    numAss: ").append(toIndentedString(numAss)).append("\n");
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

