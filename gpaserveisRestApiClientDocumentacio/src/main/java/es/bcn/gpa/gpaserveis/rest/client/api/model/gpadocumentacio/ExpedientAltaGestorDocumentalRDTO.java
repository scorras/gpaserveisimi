/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 2.5.0
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

/**
 * ExpedientAltaGestorDocumentalRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-08T12:05:16.181+02:00")
public class ExpedientAltaGestorDocumentalRDTO {
  @JsonProperty("objectId")
  private String objectId = null;

  @JsonProperty("pathGestorDocumental")
  private String pathGestorDocumental = null;

  public ExpedientAltaGestorDocumentalRDTO objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Object id de l&#39;expedient
   * @return objectId
  **/
  @ApiModelProperty(value = "Object id de l'expedient")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public ExpedientAltaGestorDocumentalRDTO pathGestorDocumental(String pathGestorDocumental) {
    this.pathGestorDocumental = pathGestorDocumental;
    return this;
  }

   /**
   * Path gestor documental
   * @return pathGestorDocumental
  **/
  @ApiModelProperty(value = "Path gestor documental")
  public String getPathGestorDocumental() {
    return pathGestorDocumental;
  }

  public void setPathGestorDocumental(String pathGestorDocumental) {
    this.pathGestorDocumental = pathGestorDocumental;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpedientAltaGestorDocumentalRDTO expedientAltaGestorDocumentalRDTO = (ExpedientAltaGestorDocumentalRDTO) o;
    return Objects.equals(this.objectId, expedientAltaGestorDocumentalRDTO.objectId) &&
        Objects.equals(this.pathGestorDocumental, expedientAltaGestorDocumentalRDTO.pathGestorDocumental);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, pathGestorDocumental);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpedientAltaGestorDocumentalRDTO {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    pathGestorDocumental: ").append(toIndentedString(pathGestorDocumental)).append("\n");
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

