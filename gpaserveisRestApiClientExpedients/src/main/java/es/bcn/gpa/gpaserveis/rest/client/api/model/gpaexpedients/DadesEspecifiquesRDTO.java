/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.16.1
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.DadesEspecifiquesValors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * DadesEspecifiquesRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-04T08:40:05.141+01:00")
public class DadesEspecifiquesRDTO {
  @JsonProperty("campIdext")
  private BigDecimal campIdext = null;

  @JsonProperty("dadesEspecifiquesValorsList")
  private List<DadesEspecifiquesValors> dadesEspecifiquesValorsList = null;

  @JsonProperty("expedient")
  private BigDecimal expedient = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("nou")
  private Integer nou = null;

  @JsonProperty("tipus")
  private BigDecimal tipus = null;

  public DadesEspecifiquesRDTO campIdext(BigDecimal campIdext) {
    this.campIdext = campIdext;
    return this;
  }

   /**
   * Get campIdext
   * @return campIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCampIdext() {
    return campIdext;
  }

  public void setCampIdext(BigDecimal campIdext) {
    this.campIdext = campIdext;
  }

  public DadesEspecifiquesRDTO dadesEspecifiquesValorsList(List<DadesEspecifiquesValors> dadesEspecifiquesValorsList) {
    this.dadesEspecifiquesValorsList = dadesEspecifiquesValorsList;
    return this;
  }

  public DadesEspecifiquesRDTO addDadesEspecifiquesValorsListItem(DadesEspecifiquesValors dadesEspecifiquesValorsListItem) {
    if (this.dadesEspecifiquesValorsList == null) {
      this.dadesEspecifiquesValorsList = new ArrayList<DadesEspecifiquesValors>();
    }
    this.dadesEspecifiquesValorsList.add(dadesEspecifiquesValorsListItem);
    return this;
  }

   /**
   * Get dadesEspecifiquesValorsList
   * @return dadesEspecifiquesValorsList
  **/
  @ApiModelProperty(value = "")
  public List<DadesEspecifiquesValors> getDadesEspecifiquesValorsList() {
    return dadesEspecifiquesValorsList;
  }

  public void setDadesEspecifiquesValorsList(List<DadesEspecifiquesValors> dadesEspecifiquesValorsList) {
    this.dadesEspecifiquesValorsList = dadesEspecifiquesValorsList;
  }

  public DadesEspecifiquesRDTO expedient(BigDecimal expedient) {
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

  public DadesEspecifiquesRDTO id(BigDecimal id) {
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

  public DadesEspecifiquesRDTO nou(Integer nou) {
    this.nou = nou;
    return this;
  }

   /**
   * Get nou
   * @return nou
  **/
  @ApiModelProperty(value = "")
  public Integer getNou() {
    return nou;
  }

  public void setNou(Integer nou) {
    this.nou = nou;
  }

  public DadesEspecifiquesRDTO tipus(BigDecimal tipus) {
    this.tipus = tipus;
    return this;
  }

   /**
   * Get tipus
   * @return tipus
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTipus() {
    return tipus;
  }

  public void setTipus(BigDecimal tipus) {
    this.tipus = tipus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadesEspecifiquesRDTO dadesEspecifiquesRDTO = (DadesEspecifiquesRDTO) o;
    return Objects.equals(this.campIdext, dadesEspecifiquesRDTO.campIdext) &&
        Objects.equals(this.dadesEspecifiquesValorsList, dadesEspecifiquesRDTO.dadesEspecifiquesValorsList) &&
        Objects.equals(this.expedient, dadesEspecifiquesRDTO.expedient) &&
        Objects.equals(this.id, dadesEspecifiquesRDTO.id) &&
        Objects.equals(this.nou, dadesEspecifiquesRDTO.nou) &&
        Objects.equals(this.tipus, dadesEspecifiquesRDTO.tipus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campIdext, dadesEspecifiquesValorsList, expedient, id, nou, tipus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadesEspecifiquesRDTO {\n");
    
    sb.append("    campIdext: ").append(toIndentedString(campIdext)).append("\n");
    sb.append("    dadesEspecifiquesValorsList: ").append(toIndentedString(dadesEspecifiquesValorsList)).append("\n");
    sb.append("    expedient: ").append(toIndentedString(expedient)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nou: ").append(toIndentedString(nou)).append("\n");
    sb.append("    tipus: ").append(toIndentedString(tipus)).append("\n");
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

