/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.20.1
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
import org.joda.time.DateTime;

/**
 * PeticionsDigitalitzacioRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-30T19:13:23.947+02:00")
public class PeticionsDigitalitzacioRDTO {
  @JsonProperty("codiError")
  private String codiError = null;

  @JsonProperty("codiScan")
  private String codiScan = null;

  @JsonProperty("dataDigitalitzacio")
  private DateTime dataDigitalitzacio = null;

  @JsonProperty("documentsCodi")
  private String documentsCodi = null;

  @JsonProperty("estatPeticio")
  private BigDecimal estatPeticio = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("idioma")
  private BigDecimal idioma = null;

  @JsonProperty("missatgeError")
  private String missatgeError = null;

  public PeticionsDigitalitzacioRDTO codiError(String codiError) {
    this.codiError = codiError;
    return this;
  }

   /**
   * Get codiError
   * @return codiError
  **/
  @ApiModelProperty(value = "")
  public String getCodiError() {
    return codiError;
  }

  public void setCodiError(String codiError) {
    this.codiError = codiError;
  }

  public PeticionsDigitalitzacioRDTO codiScan(String codiScan) {
    this.codiScan = codiScan;
    return this;
  }

   /**
   * Get codiScan
   * @return codiScan
  **/
  @ApiModelProperty(value = "")
  public String getCodiScan() {
    return codiScan;
  }

  public void setCodiScan(String codiScan) {
    this.codiScan = codiScan;
  }

  public PeticionsDigitalitzacioRDTO dataDigitalitzacio(DateTime dataDigitalitzacio) {
    this.dataDigitalitzacio = dataDigitalitzacio;
    return this;
  }

   /**
   * Get dataDigitalitzacio
   * @return dataDigitalitzacio
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataDigitalitzacio() {
    return dataDigitalitzacio;
  }

  public void setDataDigitalitzacio(DateTime dataDigitalitzacio) {
    this.dataDigitalitzacio = dataDigitalitzacio;
  }

  public PeticionsDigitalitzacioRDTO documentsCodi(String documentsCodi) {
    this.documentsCodi = documentsCodi;
    return this;
  }

   /**
   * Get documentsCodi
   * @return documentsCodi
  **/
  @ApiModelProperty(value = "")
  public String getDocumentsCodi() {
    return documentsCodi;
  }

  public void setDocumentsCodi(String documentsCodi) {
    this.documentsCodi = documentsCodi;
  }

  public PeticionsDigitalitzacioRDTO estatPeticio(BigDecimal estatPeticio) {
    this.estatPeticio = estatPeticio;
    return this;
  }

   /**
   * Get estatPeticio
   * @return estatPeticio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatPeticio() {
    return estatPeticio;
  }

  public void setEstatPeticio(BigDecimal estatPeticio) {
    this.estatPeticio = estatPeticio;
  }

  public PeticionsDigitalitzacioRDTO id(BigDecimal id) {
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

  public PeticionsDigitalitzacioRDTO idioma(BigDecimal idioma) {
    this.idioma = idioma;
    return this;
  }

   /**
   * Get idioma
   * @return idioma
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdioma() {
    return idioma;
  }

  public void setIdioma(BigDecimal idioma) {
    this.idioma = idioma;
  }

  public PeticionsDigitalitzacioRDTO missatgeError(String missatgeError) {
    this.missatgeError = missatgeError;
    return this;
  }

   /**
   * Get missatgeError
   * @return missatgeError
  **/
  @ApiModelProperty(value = "")
  public String getMissatgeError() {
    return missatgeError;
  }

  public void setMissatgeError(String missatgeError) {
    this.missatgeError = missatgeError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeticionsDigitalitzacioRDTO peticionsDigitalitzacioRDTO = (PeticionsDigitalitzacioRDTO) o;
    return Objects.equals(this.codiError, peticionsDigitalitzacioRDTO.codiError) &&
        Objects.equals(this.codiScan, peticionsDigitalitzacioRDTO.codiScan) &&
        Objects.equals(this.dataDigitalitzacio, peticionsDigitalitzacioRDTO.dataDigitalitzacio) &&
        Objects.equals(this.documentsCodi, peticionsDigitalitzacioRDTO.documentsCodi) &&
        Objects.equals(this.estatPeticio, peticionsDigitalitzacioRDTO.estatPeticio) &&
        Objects.equals(this.id, peticionsDigitalitzacioRDTO.id) &&
        Objects.equals(this.idioma, peticionsDigitalitzacioRDTO.idioma) &&
        Objects.equals(this.missatgeError, peticionsDigitalitzacioRDTO.missatgeError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiError, codiScan, dataDigitalitzacio, documentsCodi, estatPeticio, id, idioma, missatgeError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeticionsDigitalitzacioRDTO {\n");
    
    sb.append("    codiError: ").append(toIndentedString(codiError)).append("\n");
    sb.append("    codiScan: ").append(toIndentedString(codiScan)).append("\n");
    sb.append("    dataDigitalitzacio: ").append(toIndentedString(dataDigitalitzacio)).append("\n");
    sb.append("    documentsCodi: ").append(toIndentedString(documentsCodi)).append("\n");
    sb.append("    estatPeticio: ").append(toIndentedString(estatPeticio)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idioma: ").append(toIndentedString(idioma)).append("\n");
    sb.append("    missatgeError: ").append(toIndentedString(missatgeError)).append("\n");
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

