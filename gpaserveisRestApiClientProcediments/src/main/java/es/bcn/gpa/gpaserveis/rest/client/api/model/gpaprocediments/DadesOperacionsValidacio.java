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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.DadesOperValidVal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * DadesOperacionsValidacio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-20T00:02:27.551+02:00")
public class DadesOperacionsValidacio {
  @JsonProperty("dadesOperacions")
  private BigDecimal dadesOperacions = null;

  @JsonProperty("dadesOperacionsValidValors")
  private List<DadesOperValidVal> dadesOperacionsValidValors = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("tipusValidacio")
  private BigDecimal tipusValidacio = null;

  public DadesOperacionsValidacio dadesOperacions(BigDecimal dadesOperacions) {
    this.dadesOperacions = dadesOperacions;
    return this;
  }

   /**
   * Get dadesOperacions
   * @return dadesOperacions
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDadesOperacions() {
    return dadesOperacions;
  }

  public void setDadesOperacions(BigDecimal dadesOperacions) {
    this.dadesOperacions = dadesOperacions;
  }

  public DadesOperacionsValidacio dadesOperacionsValidValors(List<DadesOperValidVal> dadesOperacionsValidValors) {
    this.dadesOperacionsValidValors = dadesOperacionsValidValors;
    return this;
  }

  public DadesOperacionsValidacio addDadesOperacionsValidValorsItem(DadesOperValidVal dadesOperacionsValidValorsItem) {
    if (this.dadesOperacionsValidValors == null) {
      this.dadesOperacionsValidValors = new ArrayList<DadesOperValidVal>();
    }
    this.dadesOperacionsValidValors.add(dadesOperacionsValidValorsItem);
    return this;
  }

   /**
   * Get dadesOperacionsValidValors
   * @return dadesOperacionsValidValors
  **/
  @ApiModelProperty(value = "")
  public List<DadesOperValidVal> getDadesOperacionsValidValors() {
    return dadesOperacionsValidValors;
  }

  public void setDadesOperacionsValidValors(List<DadesOperValidVal> dadesOperacionsValidValors) {
    this.dadesOperacionsValidValors = dadesOperacionsValidValors;
  }

  public DadesOperacionsValidacio id(BigDecimal id) {
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

  public DadesOperacionsValidacio tipusValidacio(BigDecimal tipusValidacio) {
    this.tipusValidacio = tipusValidacio;
    return this;
  }

   /**
   * Get tipusValidacio
   * @return tipusValidacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTipusValidacio() {
    return tipusValidacio;
  }

  public void setTipusValidacio(BigDecimal tipusValidacio) {
    this.tipusValidacio = tipusValidacio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadesOperacionsValidacio dadesOperacionsValidacio = (DadesOperacionsValidacio) o;
    return Objects.equals(this.dadesOperacions, dadesOperacionsValidacio.dadesOperacions) &&
        Objects.equals(this.dadesOperacionsValidValors, dadesOperacionsValidacio.dadesOperacionsValidValors) &&
        Objects.equals(this.id, dadesOperacionsValidacio.id) &&
        Objects.equals(this.tipusValidacio, dadesOperacionsValidacio.tipusValidacio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dadesOperacions, dadesOperacionsValidValors, id, tipusValidacio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadesOperacionsValidacio {\n");
    
    sb.append("    dadesOperacions: ").append(toIndentedString(dadesOperacions)).append("\n");
    sb.append("    dadesOperacionsValidValors: ").append(toIndentedString(dadesOperacionsValidValors)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tipusValidacio: ").append(toIndentedString(tipusValidacio)).append("\n");
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

