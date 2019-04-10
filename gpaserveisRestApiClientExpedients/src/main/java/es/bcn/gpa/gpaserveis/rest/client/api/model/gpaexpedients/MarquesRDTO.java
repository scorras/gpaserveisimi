/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.10.0
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
 * MarquesRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-10T18:52:55.179+02:00")
public class MarquesRDTO {
  @JsonProperty("codi")
  private String codi = null;

  @JsonProperty("descripcio")
  private String descripcio = null;

  @JsonProperty("example")
  private String example = null;

  @JsonProperty("expressio")
  private String expressio = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("referencia")
  private String referencia = null;

  public MarquesRDTO codi(String codi) {
    this.codi = codi;
    return this;
  }

   /**
   * Get codi
   * @return codi
  **/
  @ApiModelProperty(value = "")
  public String getCodi() {
    return codi;
  }

  public void setCodi(String codi) {
    this.codi = codi;
  }

  public MarquesRDTO descripcio(String descripcio) {
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

  public MarquesRDTO example(String example) {
    this.example = example;
    return this;
  }

   /**
   * Get example
   * @return example
  **/
  @ApiModelProperty(value = "")
  public String getExample() {
    return example;
  }

  public void setExample(String example) {
    this.example = example;
  }

  public MarquesRDTO expressio(String expressio) {
    this.expressio = expressio;
    return this;
  }

   /**
   * Get expressio
   * @return expressio
  **/
  @ApiModelProperty(value = "")
  public String getExpressio() {
    return expressio;
  }

  public void setExpressio(String expressio) {
    this.expressio = expressio;
  }

  public MarquesRDTO id(BigDecimal id) {
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

  public MarquesRDTO referencia(String referencia) {
    this.referencia = referencia;
    return this;
  }

   /**
   * Get referencia
   * @return referencia
  **/
  @ApiModelProperty(value = "")
  public String getReferencia() {
    return referencia;
  }

  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarquesRDTO marquesRDTO = (MarquesRDTO) o;
    return Objects.equals(this.codi, marquesRDTO.codi) &&
        Objects.equals(this.descripcio, marquesRDTO.descripcio) &&
        Objects.equals(this.example, marquesRDTO.example) &&
        Objects.equals(this.expressio, marquesRDTO.expressio) &&
        Objects.equals(this.id, marquesRDTO.id) &&
        Objects.equals(this.referencia, marquesRDTO.referencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codi, descripcio, example, expressio, id, referencia);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarquesRDTO {\n");
    
    sb.append("    codi: ").append(toIndentedString(codi)).append("\n");
    sb.append("    descripcio: ").append(toIndentedString(descripcio)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    expressio: ").append(toIndentedString(expressio)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referencia: ").append(toIndentedString(referencia)).append("\n");
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

