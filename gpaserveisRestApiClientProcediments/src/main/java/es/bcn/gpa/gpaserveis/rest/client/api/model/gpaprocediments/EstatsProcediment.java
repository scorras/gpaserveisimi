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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.Estats;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.EstatsProcediment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * EstatsProcediment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-26T17:52:18.478+02:00")
public class EstatsProcediment {
  @JsonProperty("estat")
  private BigDecimal estat = null;

  @JsonProperty("estatProcedimentAnt")
  private BigDecimal estatProcedimentAnt = null;

  @JsonProperty("estats")
  private Estats estats = null;

  @JsonProperty("estatsProcedimentAnt")
  private EstatsProcediment estatsProcedimentAnt = null;

  @JsonProperty("historic")
  private BigDecimal historic = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("procediment")
  private BigDecimal procediment = null;

  public EstatsProcediment estat(BigDecimal estat) {
    this.estat = estat;
    return this;
  }

   /**
   * Get estat
   * @return estat
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstat() {
    return estat;
  }

  public void setEstat(BigDecimal estat) {
    this.estat = estat;
  }

  public EstatsProcediment estatProcedimentAnt(BigDecimal estatProcedimentAnt) {
    this.estatProcedimentAnt = estatProcedimentAnt;
    return this;
  }

   /**
   * Get estatProcedimentAnt
   * @return estatProcedimentAnt
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatProcedimentAnt() {
    return estatProcedimentAnt;
  }

  public void setEstatProcedimentAnt(BigDecimal estatProcedimentAnt) {
    this.estatProcedimentAnt = estatProcedimentAnt;
  }

  public EstatsProcediment estats(Estats estats) {
    this.estats = estats;
    return this;
  }

   /**
   * Get estats
   * @return estats
  **/
  @ApiModelProperty(value = "")
  public Estats getEstats() {
    return estats;
  }

  public void setEstats(Estats estats) {
    this.estats = estats;
  }

  public EstatsProcediment estatsProcedimentAnt(EstatsProcediment estatsProcedimentAnt) {
    this.estatsProcedimentAnt = estatsProcedimentAnt;
    return this;
  }

   /**
   * Get estatsProcedimentAnt
   * @return estatsProcedimentAnt
  **/
  @ApiModelProperty(value = "")
  public EstatsProcediment getEstatsProcedimentAnt() {
    return estatsProcedimentAnt;
  }

  public void setEstatsProcedimentAnt(EstatsProcediment estatsProcedimentAnt) {
    this.estatsProcedimentAnt = estatsProcedimentAnt;
  }

  public EstatsProcediment historic(BigDecimal historic) {
    this.historic = historic;
    return this;
  }

   /**
   * Get historic
   * @return historic
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getHistoric() {
    return historic;
  }

  public void setHistoric(BigDecimal historic) {
    this.historic = historic;
  }

  public EstatsProcediment id(BigDecimal id) {
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

  public EstatsProcediment procediment(BigDecimal procediment) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstatsProcediment estatsProcediment = (EstatsProcediment) o;
    return Objects.equals(this.estat, estatsProcediment.estat) &&
        Objects.equals(this.estatProcedimentAnt, estatsProcediment.estatProcedimentAnt) &&
        Objects.equals(this.estats, estatsProcediment.estats) &&
        Objects.equals(this.estatsProcedimentAnt, estatsProcediment.estatsProcedimentAnt) &&
        Objects.equals(this.historic, estatsProcediment.historic) &&
        Objects.equals(this.id, estatsProcediment.id) &&
        Objects.equals(this.procediment, estatsProcediment.procediment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estat, estatProcedimentAnt, estats, estatsProcedimentAnt, historic, id, procediment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstatsProcediment {\n");
    
    sb.append("    estat: ").append(toIndentedString(estat)).append("\n");
    sb.append("    estatProcedimentAnt: ").append(toIndentedString(estatProcedimentAnt)).append("\n");
    sb.append("    estats: ").append(toIndentedString(estats)).append("\n");
    sb.append("    estatsProcedimentAnt: ").append(toIndentedString(estatsProcedimentAnt)).append("\n");
    sb.append("    historic: ").append(toIndentedString(historic)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    procediment: ").append(toIndentedString(procediment)).append("\n");
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

