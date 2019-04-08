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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.DateTime;

/**
 * EstatsRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T18:53:33.268+02:00")
public class EstatsRDTO {
  @JsonProperty("dataCreacio")
  private DateTime dataCreacio = null;

  @JsonProperty("descripcioEstatActualCiutada")
  private String descripcioEstatActualCiutada = null;

  @JsonProperty("descripcioEstatActualCiutadaCastella")
  private String descripcioEstatActualCiutadaCastella = null;

  @JsonProperty("descripcioEstatActualCiutadaCatala")
  private String descripcioEstatActualCiutadaCatala = null;

  @JsonProperty("descripcioEstatActualTramitador")
  private String descripcioEstatActualTramitador = null;

  @JsonProperty("descripcioEstatActualTramitadorCastella")
  private String descripcioEstatActualTramitadorCastella = null;

  @JsonProperty("descripcioEstatActualTramitadorCatala")
  private String descripcioEstatActualTramitadorCatala = null;

  @JsonProperty("descripcioEstatAnteriorCiutada")
  private String descripcioEstatAnteriorCiutada = null;

  @JsonProperty("descripcioEstatAnteriorTramitador")
  private String descripcioEstatAnteriorTramitador = null;

  @JsonProperty("idEstatActual")
  private BigDecimal idEstatActual = null;

  @JsonProperty("idEstatAnterior")
  private BigDecimal idEstatAnterior = null;

  public EstatsRDTO dataCreacio(DateTime dataCreacio) {
    this.dataCreacio = dataCreacio;
    return this;
  }

   /**
   * Get dataCreacio
   * @return dataCreacio
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataCreacio() {
    return dataCreacio;
  }

  public void setDataCreacio(DateTime dataCreacio) {
    this.dataCreacio = dataCreacio;
  }

  public EstatsRDTO descripcioEstatActualCiutada(String descripcioEstatActualCiutada) {
    this.descripcioEstatActualCiutada = descripcioEstatActualCiutada;
    return this;
  }

   /**
   * Get descripcioEstatActualCiutada
   * @return descripcioEstatActualCiutada
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioEstatActualCiutada() {
    return descripcioEstatActualCiutada;
  }

  public void setDescripcioEstatActualCiutada(String descripcioEstatActualCiutada) {
    this.descripcioEstatActualCiutada = descripcioEstatActualCiutada;
  }

  public EstatsRDTO descripcioEstatActualCiutadaCastella(String descripcioEstatActualCiutadaCastella) {
    this.descripcioEstatActualCiutadaCastella = descripcioEstatActualCiutadaCastella;
    return this;
  }

   /**
   * Get descripcioEstatActualCiutadaCastella
   * @return descripcioEstatActualCiutadaCastella
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioEstatActualCiutadaCastella() {
    return descripcioEstatActualCiutadaCastella;
  }

  public void setDescripcioEstatActualCiutadaCastella(String descripcioEstatActualCiutadaCastella) {
    this.descripcioEstatActualCiutadaCastella = descripcioEstatActualCiutadaCastella;
  }

  public EstatsRDTO descripcioEstatActualCiutadaCatala(String descripcioEstatActualCiutadaCatala) {
    this.descripcioEstatActualCiutadaCatala = descripcioEstatActualCiutadaCatala;
    return this;
  }

   /**
   * Get descripcioEstatActualCiutadaCatala
   * @return descripcioEstatActualCiutadaCatala
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioEstatActualCiutadaCatala() {
    return descripcioEstatActualCiutadaCatala;
  }

  public void setDescripcioEstatActualCiutadaCatala(String descripcioEstatActualCiutadaCatala) {
    this.descripcioEstatActualCiutadaCatala = descripcioEstatActualCiutadaCatala;
  }

  public EstatsRDTO descripcioEstatActualTramitador(String descripcioEstatActualTramitador) {
    this.descripcioEstatActualTramitador = descripcioEstatActualTramitador;
    return this;
  }

   /**
   * Get descripcioEstatActualTramitador
   * @return descripcioEstatActualTramitador
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioEstatActualTramitador() {
    return descripcioEstatActualTramitador;
  }

  public void setDescripcioEstatActualTramitador(String descripcioEstatActualTramitador) {
    this.descripcioEstatActualTramitador = descripcioEstatActualTramitador;
  }

  public EstatsRDTO descripcioEstatActualTramitadorCastella(String descripcioEstatActualTramitadorCastella) {
    this.descripcioEstatActualTramitadorCastella = descripcioEstatActualTramitadorCastella;
    return this;
  }

   /**
   * Get descripcioEstatActualTramitadorCastella
   * @return descripcioEstatActualTramitadorCastella
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioEstatActualTramitadorCastella() {
    return descripcioEstatActualTramitadorCastella;
  }

  public void setDescripcioEstatActualTramitadorCastella(String descripcioEstatActualTramitadorCastella) {
    this.descripcioEstatActualTramitadorCastella = descripcioEstatActualTramitadorCastella;
  }

  public EstatsRDTO descripcioEstatActualTramitadorCatala(String descripcioEstatActualTramitadorCatala) {
    this.descripcioEstatActualTramitadorCatala = descripcioEstatActualTramitadorCatala;
    return this;
  }

   /**
   * Get descripcioEstatActualTramitadorCatala
   * @return descripcioEstatActualTramitadorCatala
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioEstatActualTramitadorCatala() {
    return descripcioEstatActualTramitadorCatala;
  }

  public void setDescripcioEstatActualTramitadorCatala(String descripcioEstatActualTramitadorCatala) {
    this.descripcioEstatActualTramitadorCatala = descripcioEstatActualTramitadorCatala;
  }

  public EstatsRDTO descripcioEstatAnteriorCiutada(String descripcioEstatAnteriorCiutada) {
    this.descripcioEstatAnteriorCiutada = descripcioEstatAnteriorCiutada;
    return this;
  }

   /**
   * Get descripcioEstatAnteriorCiutada
   * @return descripcioEstatAnteriorCiutada
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioEstatAnteriorCiutada() {
    return descripcioEstatAnteriorCiutada;
  }

  public void setDescripcioEstatAnteriorCiutada(String descripcioEstatAnteriorCiutada) {
    this.descripcioEstatAnteriorCiutada = descripcioEstatAnteriorCiutada;
  }

  public EstatsRDTO descripcioEstatAnteriorTramitador(String descripcioEstatAnteriorTramitador) {
    this.descripcioEstatAnteriorTramitador = descripcioEstatAnteriorTramitador;
    return this;
  }

   /**
   * Get descripcioEstatAnteriorTramitador
   * @return descripcioEstatAnteriorTramitador
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioEstatAnteriorTramitador() {
    return descripcioEstatAnteriorTramitador;
  }

  public void setDescripcioEstatAnteriorTramitador(String descripcioEstatAnteriorTramitador) {
    this.descripcioEstatAnteriorTramitador = descripcioEstatAnteriorTramitador;
  }

  public EstatsRDTO idEstatActual(BigDecimal idEstatActual) {
    this.idEstatActual = idEstatActual;
    return this;
  }

   /**
   * Get idEstatActual
   * @return idEstatActual
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdEstatActual() {
    return idEstatActual;
  }

  public void setIdEstatActual(BigDecimal idEstatActual) {
    this.idEstatActual = idEstatActual;
  }

  public EstatsRDTO idEstatAnterior(BigDecimal idEstatAnterior) {
    this.idEstatAnterior = idEstatAnterior;
    return this;
  }

   /**
   * Get idEstatAnterior
   * @return idEstatAnterior
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdEstatAnterior() {
    return idEstatAnterior;
  }

  public void setIdEstatAnterior(BigDecimal idEstatAnterior) {
    this.idEstatAnterior = idEstatAnterior;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstatsRDTO estatsRDTO = (EstatsRDTO) o;
    return Objects.equals(this.dataCreacio, estatsRDTO.dataCreacio) &&
        Objects.equals(this.descripcioEstatActualCiutada, estatsRDTO.descripcioEstatActualCiutada) &&
        Objects.equals(this.descripcioEstatActualCiutadaCastella, estatsRDTO.descripcioEstatActualCiutadaCastella) &&
        Objects.equals(this.descripcioEstatActualCiutadaCatala, estatsRDTO.descripcioEstatActualCiutadaCatala) &&
        Objects.equals(this.descripcioEstatActualTramitador, estatsRDTO.descripcioEstatActualTramitador) &&
        Objects.equals(this.descripcioEstatActualTramitadorCastella, estatsRDTO.descripcioEstatActualTramitadorCastella) &&
        Objects.equals(this.descripcioEstatActualTramitadorCatala, estatsRDTO.descripcioEstatActualTramitadorCatala) &&
        Objects.equals(this.descripcioEstatAnteriorCiutada, estatsRDTO.descripcioEstatAnteriorCiutada) &&
        Objects.equals(this.descripcioEstatAnteriorTramitador, estatsRDTO.descripcioEstatAnteriorTramitador) &&
        Objects.equals(this.idEstatActual, estatsRDTO.idEstatActual) &&
        Objects.equals(this.idEstatAnterior, estatsRDTO.idEstatAnterior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataCreacio, descripcioEstatActualCiutada, descripcioEstatActualCiutadaCastella, descripcioEstatActualCiutadaCatala, descripcioEstatActualTramitador, descripcioEstatActualTramitadorCastella, descripcioEstatActualTramitadorCatala, descripcioEstatAnteriorCiutada, descripcioEstatAnteriorTramitador, idEstatActual, idEstatAnterior);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstatsRDTO {\n");
    
    sb.append("    dataCreacio: ").append(toIndentedString(dataCreacio)).append("\n");
    sb.append("    descripcioEstatActualCiutada: ").append(toIndentedString(descripcioEstatActualCiutada)).append("\n");
    sb.append("    descripcioEstatActualCiutadaCastella: ").append(toIndentedString(descripcioEstatActualCiutadaCastella)).append("\n");
    sb.append("    descripcioEstatActualCiutadaCatala: ").append(toIndentedString(descripcioEstatActualCiutadaCatala)).append("\n");
    sb.append("    descripcioEstatActualTramitador: ").append(toIndentedString(descripcioEstatActualTramitador)).append("\n");
    sb.append("    descripcioEstatActualTramitadorCastella: ").append(toIndentedString(descripcioEstatActualTramitadorCastella)).append("\n");
    sb.append("    descripcioEstatActualTramitadorCatala: ").append(toIndentedString(descripcioEstatActualTramitadorCatala)).append("\n");
    sb.append("    descripcioEstatAnteriorCiutada: ").append(toIndentedString(descripcioEstatAnteriorCiutada)).append("\n");
    sb.append("    descripcioEstatAnteriorTramitador: ").append(toIndentedString(descripcioEstatAnteriorTramitador)).append("\n");
    sb.append("    idEstatActual: ").append(toIndentedString(idEstatActual)).append("\n");
    sb.append("    idEstatAnterior: ").append(toIndentedString(idEstatAnterior)).append("\n");
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

