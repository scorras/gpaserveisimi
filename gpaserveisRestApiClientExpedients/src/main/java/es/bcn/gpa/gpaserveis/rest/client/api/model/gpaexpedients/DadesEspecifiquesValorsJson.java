/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 2.11.0
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
 * DadesEspecifiquesValorsJson
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-12T12:40:33.333+01:00")
public class DadesEspecifiquesValorsJson {
  @JsonProperty("dadesEspecifiquesRepetibles")
  private BigDecimal dadesEspecifiquesRepetibles = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("sollicitud")
  private BigDecimal sollicitud = null;

  @JsonProperty("valorJson")
  private String valorJson = null;

  public DadesEspecifiquesValorsJson dadesEspecifiquesRepetibles(BigDecimal dadesEspecifiquesRepetibles) {
    this.dadesEspecifiquesRepetibles = dadesEspecifiquesRepetibles;
    return this;
  }

   /**
   * Get dadesEspecifiquesRepetibles
   * @return dadesEspecifiquesRepetibles
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDadesEspecifiquesRepetibles() {
    return dadesEspecifiquesRepetibles;
  }

  public void setDadesEspecifiquesRepetibles(BigDecimal dadesEspecifiquesRepetibles) {
    this.dadesEspecifiquesRepetibles = dadesEspecifiquesRepetibles;
  }

  public DadesEspecifiquesValorsJson id(BigDecimal id) {
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

  public DadesEspecifiquesValorsJson sollicitud(BigDecimal sollicitud) {
    this.sollicitud = sollicitud;
    return this;
  }

   /**
   * Get sollicitud
   * @return sollicitud
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSollicitud() {
    return sollicitud;
  }

  public void setSollicitud(BigDecimal sollicitud) {
    this.sollicitud = sollicitud;
  }

  public DadesEspecifiquesValorsJson valorJson(String valorJson) {
    this.valorJson = valorJson;
    return this;
  }

   /**
   * Get valorJson
   * @return valorJson
  **/
  @ApiModelProperty(value = "")
  public String getValorJson() {
    return valorJson;
  }

  public void setValorJson(String valorJson) {
    this.valorJson = valorJson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadesEspecifiquesValorsJson dadesEspecifiquesValorsJson = (DadesEspecifiquesValorsJson) o;
    return Objects.equals(this.dadesEspecifiquesRepetibles, dadesEspecifiquesValorsJson.dadesEspecifiquesRepetibles) &&
        Objects.equals(this.id, dadesEspecifiquesValorsJson.id) &&
        Objects.equals(this.sollicitud, dadesEspecifiquesValorsJson.sollicitud) &&
        Objects.equals(this.valorJson, dadesEspecifiquesValorsJson.valorJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dadesEspecifiquesRepetibles, id, sollicitud, valorJson);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadesEspecifiquesValorsJson {\n");
    
    sb.append("    dadesEspecifiquesRepetibles: ").append(toIndentedString(dadesEspecifiquesRepetibles)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sollicitud: ").append(toIndentedString(sollicitud)).append("\n");
    sb.append("    valorJson: ").append(toIndentedString(valorJson)).append("\n");
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

