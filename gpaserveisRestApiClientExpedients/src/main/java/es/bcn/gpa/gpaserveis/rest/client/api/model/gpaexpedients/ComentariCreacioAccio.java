/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.20.3
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
 * ComentariCreacioAccio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T17:22:59.297+02:00")
public class ComentariCreacioAccio {
  @JsonProperty("comentari")
  private String comentari = null;

  @JsonProperty("operacio")
  private String operacio = null;

  public ComentariCreacioAccio comentari(String comentari) {
    this.comentari = comentari;
    return this;
  }

   /**
   * Comentari associat a l&#39;execució de l&#39;acció.
   * @return comentari
  **/
  @ApiModelProperty(value = "Comentari associat a l'execució de l'acció.")
  public String getComentari() {
    return comentari;
  }

  public void setComentari(String comentari) {
    this.comentari = comentari;
  }

  public ComentariCreacioAccio operacio(String operacio) {
    this.operacio = operacio;
    return this;
  }

   /**
   * Operació concreta en l&#39;execució de l&#39;acció
   * @return operacio
  **/
  @ApiModelProperty(value = "Operació concreta en l'execució de l'acció")
  public String getOperacio() {
    return operacio;
  }

  public void setOperacio(String operacio) {
    this.operacio = operacio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComentariCreacioAccio comentariCreacioAccio = (ComentariCreacioAccio) o;
    return Objects.equals(this.comentari, comentariCreacioAccio.comentari) &&
        Objects.equals(this.operacio, comentariCreacioAccio.operacio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comentari, operacio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComentariCreacioAccio {\n");
    
    sb.append("    comentari: ").append(toIndentedString(comentari)).append("\n");
    sb.append("    operacio: ").append(toIndentedString(operacio)).append("\n");
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

