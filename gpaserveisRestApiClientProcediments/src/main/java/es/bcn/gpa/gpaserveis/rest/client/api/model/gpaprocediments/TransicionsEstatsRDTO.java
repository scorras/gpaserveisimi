/*
 * API gpaprocediments
 * API gpaprocediments
 *
 * OpenAPI spec version: 2.10.1
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * TransicionsEstatsRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-08T16:49:56.830+01:00")
public class TransicionsEstatsRDTO {
  @JsonProperty("descripcio")
  private String descripcio = null;

  @JsonProperty("estatDestino")
  private BigDecimal estatDestino = null;

  @JsonProperty("estatOrigen")
  private BigDecimal estatOrigen = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  public TransicionsEstatsRDTO descripcio(String descripcio) {
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

  public TransicionsEstatsRDTO estatDestino(BigDecimal estatDestino) {
    this.estatDestino = estatDestino;
    return this;
  }

   /**
   * Get estatDestino
   * @return estatDestino
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatDestino() {
    return estatDestino;
  }

  public void setEstatDestino(BigDecimal estatDestino) {
    this.estatDestino = estatDestino;
  }

  public TransicionsEstatsRDTO estatOrigen(BigDecimal estatOrigen) {
    this.estatOrigen = estatOrigen;
    return this;
  }

   /**
   * Get estatOrigen
   * @return estatOrigen
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatOrigen() {
    return estatOrigen;
  }

  public void setEstatOrigen(BigDecimal estatOrigen) {
    this.estatOrigen = estatOrigen;
  }

  public TransicionsEstatsRDTO id(BigDecimal id) {
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
    TransicionsEstatsRDTO transicionsEstatsRDTO = (TransicionsEstatsRDTO) o;
    return Objects.equals(this.descripcio, transicionsEstatsRDTO.descripcio) &&
        Objects.equals(this.estatDestino, transicionsEstatsRDTO.estatDestino) &&
        Objects.equals(this.estatOrigen, transicionsEstatsRDTO.estatOrigen) &&
        Objects.equals(this.id, transicionsEstatsRDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descripcio, estatDestino, estatOrigen, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransicionsEstatsRDTO {\n");
    
    sb.append("    descripcio: ").append(toIndentedString(descripcio)).append("\n");
    sb.append("    estatDestino: ").append(toIndentedString(estatDestino)).append("\n");
    sb.append("    estatOrigen: ").append(toIndentedString(estatOrigen)).append("\n");
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

