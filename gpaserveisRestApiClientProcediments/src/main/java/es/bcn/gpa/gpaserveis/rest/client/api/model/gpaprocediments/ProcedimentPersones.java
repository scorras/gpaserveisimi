/*
 * API gpaprocediments
 * API gpaprocediments
 *
 * OpenAPI spec version: 2.4.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ProcedimentPersonesTramOvt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ProcedimentPersones
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-26T17:52:18.478+02:00")
public class ProcedimentPersones {
  @JsonProperty("editable")
  private Boolean editable = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("nivellVisibilitat")
  private BigDecimal nivellVisibilitat = null;

  @JsonProperty("procediment")
  private BigDecimal procediment = null;

  @JsonProperty("relacio")
  private String relacio = null;

  @JsonProperty("seleccionable")
  private Boolean seleccionable = null;

  @JsonProperty("tramitsOvtList")
  private List<ProcedimentPersonesTramOvt> tramitsOvtList = null;

  public ProcedimentPersones editable(Boolean editable) {
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

  public ProcedimentPersones id(BigDecimal id) {
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

  public ProcedimentPersones nivellVisibilitat(BigDecimal nivellVisibilitat) {
    this.nivellVisibilitat = nivellVisibilitat;
    return this;
  }

   /**
   * Get nivellVisibilitat
   * @return nivellVisibilitat
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getNivellVisibilitat() {
    return nivellVisibilitat;
  }

  public void setNivellVisibilitat(BigDecimal nivellVisibilitat) {
    this.nivellVisibilitat = nivellVisibilitat;
  }

  public ProcedimentPersones procediment(BigDecimal procediment) {
    this.procediment = procediment;
    return this;
  }

   /**
   * Get procediment
   * @return procediment
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getProcediment() {
    return procediment;
  }

  public void setProcediment(BigDecimal procediment) {
    this.procediment = procediment;
  }

  public ProcedimentPersones relacio(String relacio) {
    this.relacio = relacio;
    return this;
  }

   /**
   * Get relacio
   * @return relacio
  **/
  @ApiModelProperty(value = "")
  public String getRelacio() {
    return relacio;
  }

  public void setRelacio(String relacio) {
    this.relacio = relacio;
  }

  public ProcedimentPersones seleccionable(Boolean seleccionable) {
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

  public ProcedimentPersones tramitsOvtList(List<ProcedimentPersonesTramOvt> tramitsOvtList) {
    this.tramitsOvtList = tramitsOvtList;
    return this;
  }

  public ProcedimentPersones addTramitsOvtListItem(ProcedimentPersonesTramOvt tramitsOvtListItem) {
    if (this.tramitsOvtList == null) {
      this.tramitsOvtList = new ArrayList<ProcedimentPersonesTramOvt>();
    }
    this.tramitsOvtList.add(tramitsOvtListItem);
    return this;
  }

   /**
   * Get tramitsOvtList
   * @return tramitsOvtList
  **/
  @ApiModelProperty(value = "")
  public List<ProcedimentPersonesTramOvt> getTramitsOvtList() {
    return tramitsOvtList;
  }

  public void setTramitsOvtList(List<ProcedimentPersonesTramOvt> tramitsOvtList) {
    this.tramitsOvtList = tramitsOvtList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcedimentPersones procedimentPersones = (ProcedimentPersones) o;
    return Objects.equals(this.editable, procedimentPersones.editable) &&
        Objects.equals(this.id, procedimentPersones.id) &&
        Objects.equals(this.nivellVisibilitat, procedimentPersones.nivellVisibilitat) &&
        Objects.equals(this.procediment, procedimentPersones.procediment) &&
        Objects.equals(this.relacio, procedimentPersones.relacio) &&
        Objects.equals(this.seleccionable, procedimentPersones.seleccionable) &&
        Objects.equals(this.tramitsOvtList, procedimentPersones.tramitsOvtList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editable, id, nivellVisibilitat, procediment, relacio, seleccionable, tramitsOvtList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcedimentPersones {\n");
    
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nivellVisibilitat: ").append(toIndentedString(nivellVisibilitat)).append("\n");
    sb.append("    procediment: ").append(toIndentedString(procediment)).append("\n");
    sb.append("    relacio: ").append(toIndentedString(relacio)).append("\n");
    sb.append("    seleccionable: ").append(toIndentedString(seleccionable)).append("\n");
    sb.append("    tramitsOvtList: ").append(toIndentedString(tramitsOvtList)).append("\n");
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

