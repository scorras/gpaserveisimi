/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.22.0
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
 * RespostaPlantillaDocVinculada
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-27T16:00:10.249+02:00")
public class RespostaPlantillaDocVinculada {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("plantilla")
  private String plantilla = null;

  public RespostaPlantillaDocVinculada id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador de la configuració documentació tramitació
   * @return id
  **/
  @ApiModelProperty(value = "Identificador de la configuració documentació tramitació")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public RespostaPlantillaDocVinculada plantilla(String plantilla) {
    this.plantilla = plantilla;
    return this;
  }

   /**
   * Plantilla de la documentació vinculada
   * @return plantilla
  **/
  @ApiModelProperty(value = "Plantilla de la documentació vinculada")
  public String getPlantilla() {
    return plantilla;
  }

  public void setPlantilla(String plantilla) {
    this.plantilla = plantilla;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespostaPlantillaDocVinculada respostaPlantillaDocVinculada = (RespostaPlantillaDocVinculada) o;
    return Objects.equals(this.id, respostaPlantillaDocVinculada.id) &&
        Objects.equals(this.plantilla, respostaPlantillaDocVinculada.plantilla);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plantilla);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaPlantillaDocVinculada {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    plantilla: ").append(toIndentedString(plantilla)).append("\n");
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

