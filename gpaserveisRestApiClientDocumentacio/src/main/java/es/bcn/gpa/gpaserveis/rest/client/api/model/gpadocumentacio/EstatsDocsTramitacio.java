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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.Estats;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.EstatsDocsTramitacio;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * EstatsDocsTramitacio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T13:52:12.142+02:00")
public class EstatsDocsTramitacio {
  @JsonProperty("docTramitacio")
  private BigDecimal docTramitacio = null;

  @JsonProperty("estat")
  private BigDecimal estat = null;

  @JsonProperty("estatDocsTramitacioAnt")
  private BigDecimal estatDocsTramitacioAnt = null;

  @JsonProperty("estats")
  private Estats estats = null;

  @JsonProperty("estatsDocsTramitacio")
  private EstatsDocsTramitacio estatsDocsTramitacio = null;

  @JsonProperty("historicIdext")
  private BigDecimal historicIdext = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  public EstatsDocsTramitacio docTramitacio(BigDecimal docTramitacio) {
    this.docTramitacio = docTramitacio;
    return this;
  }

   /**
   * Get docTramitacio
   * @return docTramitacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDocTramitacio() {
    return docTramitacio;
  }

  public void setDocTramitacio(BigDecimal docTramitacio) {
    this.docTramitacio = docTramitacio;
  }

  public EstatsDocsTramitacio estat(BigDecimal estat) {
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

  public EstatsDocsTramitacio estatDocsTramitacioAnt(BigDecimal estatDocsTramitacioAnt) {
    this.estatDocsTramitacioAnt = estatDocsTramitacioAnt;
    return this;
  }

   /**
   * Get estatDocsTramitacioAnt
   * @return estatDocsTramitacioAnt
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatDocsTramitacioAnt() {
    return estatDocsTramitacioAnt;
  }

  public void setEstatDocsTramitacioAnt(BigDecimal estatDocsTramitacioAnt) {
    this.estatDocsTramitacioAnt = estatDocsTramitacioAnt;
  }

  public EstatsDocsTramitacio estats(Estats estats) {
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

  public EstatsDocsTramitacio estatsDocsTramitacio(EstatsDocsTramitacio estatsDocsTramitacio) {
    this.estatsDocsTramitacio = estatsDocsTramitacio;
    return this;
  }

   /**
   * Get estatsDocsTramitacio
   * @return estatsDocsTramitacio
  **/
  @ApiModelProperty(value = "")
  public EstatsDocsTramitacio getEstatsDocsTramitacio() {
    return estatsDocsTramitacio;
  }

  public void setEstatsDocsTramitacio(EstatsDocsTramitacio estatsDocsTramitacio) {
    this.estatsDocsTramitacio = estatsDocsTramitacio;
  }

  public EstatsDocsTramitacio historicIdext(BigDecimal historicIdext) {
    this.historicIdext = historicIdext;
    return this;
  }

   /**
   * Get historicIdext
   * @return historicIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getHistoricIdext() {
    return historicIdext;
  }

  public void setHistoricIdext(BigDecimal historicIdext) {
    this.historicIdext = historicIdext;
  }

  public EstatsDocsTramitacio id(BigDecimal id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstatsDocsTramitacio estatsDocsTramitacio = (EstatsDocsTramitacio) o;
    return Objects.equals(this.docTramitacio, estatsDocsTramitacio.docTramitacio) &&
        Objects.equals(this.estat, estatsDocsTramitacio.estat) &&
        Objects.equals(this.estatDocsTramitacioAnt, estatsDocsTramitacio.estatDocsTramitacioAnt) &&
        Objects.equals(this.estats, estatsDocsTramitacio.estats) &&
        Objects.equals(this.estatsDocsTramitacio, estatsDocsTramitacio.estatsDocsTramitacio) &&
        Objects.equals(this.historicIdext, estatsDocsTramitacio.historicIdext) &&
        Objects.equals(this.id, estatsDocsTramitacio.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docTramitacio, estat, estatDocsTramitacioAnt, estats, estatsDocsTramitacio, historicIdext, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstatsDocsTramitacio {\n");
    
    sb.append("    docTramitacio: ").append(toIndentedString(docTramitacio)).append("\n");
    sb.append("    estat: ").append(toIndentedString(estat)).append("\n");
    sb.append("    estatDocsTramitacioAnt: ").append(toIndentedString(estatDocsTramitacioAnt)).append("\n");
    sb.append("    estats: ").append(toIndentedString(estats)).append("\n");
    sb.append("    estatsDocsTramitacio: ").append(toIndentedString(estatsDocsTramitacio)).append("\n");
    sb.append("    historicIdext: ").append(toIndentedString(historicIdext)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

