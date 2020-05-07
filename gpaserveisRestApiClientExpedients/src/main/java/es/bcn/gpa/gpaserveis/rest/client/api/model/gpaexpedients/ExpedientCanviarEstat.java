/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.21.0
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

/**
 * ExpedientCanviarEstat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T16:23:41.401+02:00")
public class ExpedientCanviarEstat {
  @JsonProperty("codi")
  private String codi = null;

  @JsonProperty("estat")
  private String estat = null;

  @JsonProperty("estatCastella")
  private String estatCastella = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  public ExpedientCanviarEstat codi(String codi) {
    this.codi = codi;
    return this;
  }

   /**
   * Codi identificador de l&#39;expedient
   * @return codi
  **/
  @ApiModelProperty(value = "Codi identificador de l'expedient")
  public String getCodi() {
    return codi;
  }

  public void setCodi(String codi) {
    this.codi = codi;
  }

  public ExpedientCanviarEstat estat(String estat) {
    this.estat = estat;
    return this;
  }

   /**
   * Estat actual del expedient
   * @return estat
  **/
  @ApiModelProperty(value = "Estat actual del expedient")
  public String getEstat() {
    return estat;
  }

  public void setEstat(String estat) {
    this.estat = estat;
  }

  public ExpedientCanviarEstat estatCastella(String estatCastella) {
    this.estatCastella = estatCastella;
    return this;
  }

   /**
   * Estat actual del expedient en castellà
   * @return estatCastella
  **/
  @ApiModelProperty(value = "Estat actual del expedient en castellà")
  public String getEstatCastella() {
    return estatCastella;
  }

  public void setEstatCastella(String estatCastella) {
    this.estatCastella = estatCastella;
  }

  public ExpedientCanviarEstat id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador de l&#39;expedient
   * @return id
  **/
  @ApiModelProperty(value = "Identificador de l'expedient")
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
    ExpedientCanviarEstat expedientCanviarEstat = (ExpedientCanviarEstat) o;
    return Objects.equals(this.codi, expedientCanviarEstat.codi) &&
        Objects.equals(this.estat, expedientCanviarEstat.estat) &&
        Objects.equals(this.estatCastella, expedientCanviarEstat.estatCastella) &&
        Objects.equals(this.id, expedientCanviarEstat.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codi, estat, estatCastella, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpedientCanviarEstat {\n");
    
    sb.append("    codi: ").append(toIndentedString(codi)).append("\n");
    sb.append("    estat: ").append(toIndentedString(estat)).append("\n");
    sb.append("    estatCastella: ").append(toIndentedString(estatCastella)).append("\n");
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

