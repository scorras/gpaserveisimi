/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.3.0
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
import java.math.BigDecimal;

/**
 * RelacioPersonaRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-06T01:24:07.150+01:00")
public class RelacioPersonaRDTO {
  @JsonProperty("descripcio")
  private String descripcio = null;

  @JsonProperty("esInteressada")
  private Integer esInteressada = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  public RelacioPersonaRDTO descripcio(String descripcio) {
    this.descripcio = descripcio;
    return this;
  }

   /**
   * Get descripcio
   * @return descripcio
  **/
  @ApiModelProperty(value = "")
  public String getDescripcio() {
    return descripcio;
  }

  public void setDescripcio(String descripcio) {
    this.descripcio = descripcio;
  }

  public RelacioPersonaRDTO esInteressada(Integer esInteressada) {
    this.esInteressada = esInteressada;
    return this;
  }

   /**
   * Get esInteressada
   * @return esInteressada
  **/
  @ApiModelProperty(value = "")
  public Integer getEsInteressada() {
    return esInteressada;
  }

  public void setEsInteressada(Integer esInteressada) {
    this.esInteressada = esInteressada;
  }

  public RelacioPersonaRDTO id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelacioPersonaRDTO relacioPersonaRDTO = (RelacioPersonaRDTO) o;
    return Objects.equals(this.descripcio, relacioPersonaRDTO.descripcio) &&
        Objects.equals(this.esInteressada, relacioPersonaRDTO.esInteressada) &&
        Objects.equals(this.id, relacioPersonaRDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descripcio, esInteressada, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelacioPersonaRDTO {\n");
    
    sb.append("    descripcio: ").append(toIndentedString(descripcio)).append("\n");
    sb.append("    esInteressada: ").append(toIndentedString(esInteressada)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

