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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.DadesOperInteroperabilitat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GrupsInteroperabilitat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-08T16:49:56.830+01:00")
public class GrupsInteroperabilitat {
  @JsonProperty("dadesOperInteroperabilitatList")
  private List<DadesOperInteroperabilitat> dadesOperInteroperabilitatList = null;

  @JsonProperty("editable")
  private Boolean editable = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("nomColumnes")
  private Integer nomColumnes = null;

  @JsonProperty("ordre")
  private Integer ordre = null;

  @JsonProperty("seleccionable")
  private Boolean seleccionable = null;

  @JsonProperty("servei")
  private BigDecimal servei = null;

  @JsonProperty("titol")
  private String titol = null;

  public GrupsInteroperabilitat dadesOperInteroperabilitatList(List<DadesOperInteroperabilitat> dadesOperInteroperabilitatList) {
    this.dadesOperInteroperabilitatList = dadesOperInteroperabilitatList;
    return this;
  }

  public GrupsInteroperabilitat addDadesOperInteroperabilitatListItem(DadesOperInteroperabilitat dadesOperInteroperabilitatListItem) {
    if (this.dadesOperInteroperabilitatList == null) {
      this.dadesOperInteroperabilitatList = new ArrayList<DadesOperInteroperabilitat>();
    }
    this.dadesOperInteroperabilitatList.add(dadesOperInteroperabilitatListItem);
    return this;
  }

   /**
   * Get dadesOperInteroperabilitatList
   * @return dadesOperInteroperabilitatList
  **/
  @ApiModelProperty(value = "")
  public List<DadesOperInteroperabilitat> getDadesOperInteroperabilitatList() {
    return dadesOperInteroperabilitatList;
  }

  public void setDadesOperInteroperabilitatList(List<DadesOperInteroperabilitat> dadesOperInteroperabilitatList) {
    this.dadesOperInteroperabilitatList = dadesOperInteroperabilitatList;
  }

  public GrupsInteroperabilitat editable(Boolean editable) {
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

  public GrupsInteroperabilitat id(BigDecimal id) {
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

  public GrupsInteroperabilitat nomColumnes(Integer nomColumnes) {
    this.nomColumnes = nomColumnes;
    return this;
  }

   /**
   * Get nomColumnes
   * @return nomColumnes
  **/
  @ApiModelProperty(value = "")
  public Integer getNomColumnes() {
    return nomColumnes;
  }

  public void setNomColumnes(Integer nomColumnes) {
    this.nomColumnes = nomColumnes;
  }

  public GrupsInteroperabilitat ordre(Integer ordre) {
    this.ordre = ordre;
    return this;
  }

   /**
   * Get ordre
   * @return ordre
  **/
  @ApiModelProperty(value = "")
  public Integer getOrdre() {
    return ordre;
  }

  public void setOrdre(Integer ordre) {
    this.ordre = ordre;
  }

  public GrupsInteroperabilitat seleccionable(Boolean seleccionable) {
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

  public GrupsInteroperabilitat servei(BigDecimal servei) {
    this.servei = servei;
    return this;
  }

   /**
   * Get servei
   * @return servei
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getServei() {
    return servei;
  }

  public void setServei(BigDecimal servei) {
    this.servei = servei;
  }

  public GrupsInteroperabilitat titol(String titol) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrupsInteroperabilitat grupsInteroperabilitat = (GrupsInteroperabilitat) o;
    return Objects.equals(this.dadesOperInteroperabilitatList, grupsInteroperabilitat.dadesOperInteroperabilitatList) &&
        Objects.equals(this.editable, grupsInteroperabilitat.editable) &&
        Objects.equals(this.id, grupsInteroperabilitat.id) &&
        Objects.equals(this.nomColumnes, grupsInteroperabilitat.nomColumnes) &&
        Objects.equals(this.ordre, grupsInteroperabilitat.ordre) &&
        Objects.equals(this.seleccionable, grupsInteroperabilitat.seleccionable) &&
        Objects.equals(this.servei, grupsInteroperabilitat.servei) &&
        Objects.equals(this.titol, grupsInteroperabilitat.titol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dadesOperInteroperabilitatList, editable, id, nomColumnes, ordre, seleccionable, servei, titol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupsInteroperabilitat {\n");
    
    sb.append("    dadesOperInteroperabilitatList: ").append(toIndentedString(dadesOperInteroperabilitatList)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nomColumnes: ").append(toIndentedString(nomColumnes)).append("\n");
    sb.append("    ordre: ").append(toIndentedString(ordre)).append("\n");
    sb.append("    seleccionable: ").append(toIndentedString(seleccionable)).append("\n");
    sb.append("    servei: ").append(toIndentedString(servei)).append("\n");
    sb.append("    titol: ").append(toIndentedString(titol)).append("\n");
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

