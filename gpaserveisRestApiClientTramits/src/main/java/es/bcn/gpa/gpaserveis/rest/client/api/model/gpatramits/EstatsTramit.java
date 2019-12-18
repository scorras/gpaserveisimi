/*
 * API gpatramits
 * API gpatramits
 *
 * OpenAPI spec version: 1.16.2
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.EstatsTramit;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.EstatsTramits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * EstatsTramit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-18T13:04:17.163+01:00")
public class EstatsTramit {
  @JsonProperty("estat")
  private BigDecimal estat = null;

  @JsonProperty("estatTramitAnt")
  private BigDecimal estatTramitAnt = null;

  @JsonProperty("estatsTramitAnt")
  private EstatsTramit estatsTramitAnt = null;

  @JsonProperty("estatsTramits")
  private EstatsTramits estatsTramits = null;

  @JsonProperty("historic")
  private BigDecimal historic = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("tramit")
  private BigDecimal tramit = null;

  public EstatsTramit estat(BigDecimal estat) {
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

  public EstatsTramit estatTramitAnt(BigDecimal estatTramitAnt) {
    this.estatTramitAnt = estatTramitAnt;
    return this;
  }

   /**
   * Get estatTramitAnt
   * @return estatTramitAnt
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatTramitAnt() {
    return estatTramitAnt;
  }

  public void setEstatTramitAnt(BigDecimal estatTramitAnt) {
    this.estatTramitAnt = estatTramitAnt;
  }

  public EstatsTramit estatsTramitAnt(EstatsTramit estatsTramitAnt) {
    this.estatsTramitAnt = estatsTramitAnt;
    return this;
  }

   /**
   * Get estatsTramitAnt
   * @return estatsTramitAnt
  **/
  @ApiModelProperty(value = "")
  public EstatsTramit getEstatsTramitAnt() {
    return estatsTramitAnt;
  }

  public void setEstatsTramitAnt(EstatsTramit estatsTramitAnt) {
    this.estatsTramitAnt = estatsTramitAnt;
  }

  public EstatsTramit estatsTramits(EstatsTramits estatsTramits) {
    this.estatsTramits = estatsTramits;
    return this;
  }

   /**
   * Get estatsTramits
   * @return estatsTramits
  **/
  @ApiModelProperty(value = "")
  public EstatsTramits getEstatsTramits() {
    return estatsTramits;
  }

  public void setEstatsTramits(EstatsTramits estatsTramits) {
    this.estatsTramits = estatsTramits;
  }

  public EstatsTramit historic(BigDecimal historic) {
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

  public EstatsTramit id(BigDecimal id) {
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

  public EstatsTramit tramit(BigDecimal tramit) {
    this.tramit = tramit;
    return this;
  }

   /**
   * Get tramit
   * @return tramit
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTramit() {
    return tramit;
  }

  public void setTramit(BigDecimal tramit) {
    this.tramit = tramit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstatsTramit estatsTramit = (EstatsTramit) o;
    return Objects.equals(this.estat, estatsTramit.estat) &&
        Objects.equals(this.estatTramitAnt, estatsTramit.estatTramitAnt) &&
        Objects.equals(this.estatsTramitAnt, estatsTramit.estatsTramitAnt) &&
        Objects.equals(this.estatsTramits, estatsTramit.estatsTramits) &&
        Objects.equals(this.historic, estatsTramit.historic) &&
        Objects.equals(this.id, estatsTramit.id) &&
        Objects.equals(this.tramit, estatsTramit.tramit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estat, estatTramitAnt, estatsTramitAnt, estatsTramits, historic, id, tramit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstatsTramit {\n");
    
    sb.append("    estat: ").append(toIndentedString(estat)).append("\n");
    sb.append("    estatTramitAnt: ").append(toIndentedString(estatTramitAnt)).append("\n");
    sb.append("    estatsTramitAnt: ").append(toIndentedString(estatsTramitAnt)).append("\n");
    sb.append("    estatsTramits: ").append(toIndentedString(estatsTramits)).append("\n");
    sb.append("    historic: ").append(toIndentedString(historic)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tramit: ").append(toIndentedString(tramit)).append("\n");
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

