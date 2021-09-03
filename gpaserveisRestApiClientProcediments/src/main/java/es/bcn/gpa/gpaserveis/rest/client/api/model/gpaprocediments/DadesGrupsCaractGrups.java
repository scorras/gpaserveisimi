/*
 * API gpaprocediments
 * API gpaprocediments
 *
 * OpenAPI spec version: 2.8.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * DadesGrupsCaractGrups
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-10T10:43:10.984+02:00")
public class DadesGrupsCaractGrups {
  @JsonProperty("caracteristicaGrup")
  private BigDecimal caracteristicaGrup = null;

  @JsonProperty("dadaGrup")
  private BigDecimal dadaGrup = null;

  public DadesGrupsCaractGrups caracteristicaGrup(BigDecimal caracteristicaGrup) {
    this.caracteristicaGrup = caracteristicaGrup;
    return this;
  }

   /**
   * Get caracteristicaGrup
   * @return caracteristicaGrup
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCaracteristicaGrup() {
    return caracteristicaGrup;
  }

  public void setCaracteristicaGrup(BigDecimal caracteristicaGrup) {
    this.caracteristicaGrup = caracteristicaGrup;
  }

  public DadesGrupsCaractGrups dadaGrup(BigDecimal dadaGrup) {
    this.dadaGrup = dadaGrup;
    return this;
  }

   /**
   * Get dadaGrup
   * @return dadaGrup
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDadaGrup() {
    return dadaGrup;
  }

  public void setDadaGrup(BigDecimal dadaGrup) {
    this.dadaGrup = dadaGrup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadesGrupsCaractGrups dadesGrupsCaractGrups = (DadesGrupsCaractGrups) o;
    return Objects.equals(this.caracteristicaGrup, dadesGrupsCaractGrups.caracteristicaGrup) &&
        Objects.equals(this.dadaGrup, dadesGrupsCaractGrups.dadaGrup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caracteristicaGrup, dadaGrup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadesGrupsCaractGrups {\n");
    
    sb.append("    caracteristicaGrup: ").append(toIndentedString(caracteristicaGrup)).append("\n");
    sb.append("    dadaGrup: ").append(toIndentedString(dadaGrup)).append("\n");
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

