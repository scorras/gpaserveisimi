/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.5.0
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
 * ComentarisRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-26T12:16:57.923+01:00")
public class ComentarisRDTO {
  @JsonProperty("automatic")
  private Integer automatic = null;

  @JsonProperty("dataCreacio")
  private DateTime dataCreacio = null;

  @JsonProperty("descripcio")
  private String descripcio = null;

  @JsonProperty("editable")
  private Boolean editable = null;

  @JsonProperty("eliminat")
  private BigDecimal eliminat = null;

  @JsonProperty("expedient")
  private BigDecimal expedient = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("seleccionable")
  private Boolean seleccionable = null;

  @JsonProperty("titol")
  private String titol = null;

  @JsonProperty("usuari")
  private BigDecimal usuari = null;

  public ComentarisRDTO automatic(Integer automatic) {
    this.automatic = automatic;
    return this;
  }

   /**
   * Get automatic
   * @return automatic
  **/
  @ApiModelProperty(value = "")
  public Integer getAutomatic() {
    return automatic;
  }

  public void setAutomatic(Integer automatic) {
    this.automatic = automatic;
  }

  public ComentarisRDTO dataCreacio(DateTime dataCreacio) {
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

  public ComentarisRDTO descripcio(String descripcio) {
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

  public ComentarisRDTO editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

   /**
   * Get editable
   * @return editable
  **/
  @ApiModelProperty(value = "")
  public Boolean isEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public ComentarisRDTO eliminat(BigDecimal eliminat) {
    this.eliminat = eliminat;
    return this;
  }

   /**
   * Get eliminat
   * @return eliminat
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEliminat() {
    return eliminat;
  }

  public void setEliminat(BigDecimal eliminat) {
    this.eliminat = eliminat;
  }

  public ComentarisRDTO expedient(BigDecimal expedient) {
    this.expedient = expedient;
    return this;
  }

   /**
   * Get expedient
   * @return expedient
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExpedient() {
    return expedient;
  }

  public void setExpedient(BigDecimal expedient) {
    this.expedient = expedient;
  }

  public ComentarisRDTO id(BigDecimal id) {
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

  public ComentarisRDTO seleccionable(Boolean seleccionable) {
    this.seleccionable = seleccionable;
    return this;
  }

   /**
   * Get seleccionable
   * @return seleccionable
  **/
  @ApiModelProperty(value = "")
  public Boolean isSeleccionable() {
    return seleccionable;
  }

  public void setSeleccionable(Boolean seleccionable) {
    this.seleccionable = seleccionable;
  }

  public ComentarisRDTO titol(String titol) {
    this.titol = titol;
    return this;
  }

   /**
   * Get titol
   * @return titol
  **/
  @ApiModelProperty(value = "")
  public String getTitol() {
    return titol;
  }

  public void setTitol(String titol) {
    this.titol = titol;
  }

  public ComentarisRDTO usuari(BigDecimal usuari) {
    this.usuari = usuari;
    return this;
  }

   /**
   * Get usuari
   * @return usuari
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUsuari() {
    return usuari;
  }

  public void setUsuari(BigDecimal usuari) {
    this.usuari = usuari;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComentarisRDTO comentarisRDTO = (ComentarisRDTO) o;
    return Objects.equals(this.automatic, comentarisRDTO.automatic) &&
        Objects.equals(this.dataCreacio, comentarisRDTO.dataCreacio) &&
        Objects.equals(this.descripcio, comentarisRDTO.descripcio) &&
        Objects.equals(this.editable, comentarisRDTO.editable) &&
        Objects.equals(this.eliminat, comentarisRDTO.eliminat) &&
        Objects.equals(this.expedient, comentarisRDTO.expedient) &&
        Objects.equals(this.id, comentarisRDTO.id) &&
        Objects.equals(this.seleccionable, comentarisRDTO.seleccionable) &&
        Objects.equals(this.titol, comentarisRDTO.titol) &&
        Objects.equals(this.usuari, comentarisRDTO.usuari);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automatic, dataCreacio, descripcio, editable, eliminat, expedient, id, seleccionable, titol, usuari);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComentarisRDTO {\n");
    
    sb.append("    automatic: ").append(toIndentedString(automatic)).append("\n");
    sb.append("    dataCreacio: ").append(toIndentedString(dataCreacio)).append("\n");
    sb.append("    descripcio: ").append(toIndentedString(descripcio)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    eliminat: ").append(toIndentedString(eliminat)).append("\n");
    sb.append("    expedient: ").append(toIndentedString(expedient)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    seleccionable: ").append(toIndentedString(seleccionable)).append("\n");
    sb.append("    titol: ").append(toIndentedString(titol)).append("\n");
    sb.append("    usuari: ").append(toIndentedString(usuari)).append("\n");
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

