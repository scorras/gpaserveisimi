/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.10.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * ExpedientRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-12T13:22:18.286+02:00")
public class ExpedientRDTO {
  @JsonProperty("codi")
  private String codi = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("idEstat")
  private BigDecimal idEstat = null;

  public ExpedientRDTO codi(String codi) {
    this.codi = codi;
    return this;
  }

   /**
   * Codi de l&#39;expedient
   * @return codi
  **/
  @ApiModelProperty(value = "Codi de l'expedient")
  public String getCodi() {
    return codi;
  }

  public void setCodi(String codi) {
    this.codi = codi;
  }

  public ExpedientRDTO id(BigDecimal id) {
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

  public ExpedientRDTO idEstat(BigDecimal idEstat) {
    this.idEstat = idEstat;
    return this;
  }

   /**
   * Estat de l&#39;expedient
   * @return idEstat
  **/
  @ApiModelProperty(value = "Estat de l'expedient")
  public BigDecimal getIdEstat() {
    return idEstat;
  }

  public void setIdEstat(BigDecimal idEstat) {
    this.idEstat = idEstat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpedientRDTO expedientRDTO = (ExpedientRDTO) o;
    return Objects.equals(this.codi, expedientRDTO.codi) &&
        Objects.equals(this.id, expedientRDTO.id) &&
        Objects.equals(this.idEstat, expedientRDTO.idEstat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codi, id, idEstat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpedientRDTO {\n");
    
    sb.append("    codi: ").append(toIndentedString(codi)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idEstat: ").append(toIndentedString(idEstat)).append("\n");
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

