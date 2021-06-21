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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * IdentificacionsRecursos
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-20T00:02:27.551+02:00")
public class IdentificacionsRecursos {
  @JsonProperty("identificacio")
  private BigDecimal identificacio = null;

  @JsonProperty("recurs")
  private BigDecimal recurs = null;

  public IdentificacionsRecursos identificacio(BigDecimal identificacio) {
    this.identificacio = identificacio;
    return this;
  }

   /**
   * Get identificacio
   * @return identificacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdentificacio() {
    return identificacio;
  }

  public void setIdentificacio(BigDecimal identificacio) {
    this.identificacio = identificacio;
  }

  public IdentificacionsRecursos recurs(BigDecimal recurs) {
    this.recurs = recurs;
    return this;
  }

   /**
   * Get recurs
   * @return recurs
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRecurs() {
    return recurs;
  }

  public void setRecurs(BigDecimal recurs) {
    this.recurs = recurs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificacionsRecursos identificacionsRecursos = (IdentificacionsRecursos) o;
    return Objects.equals(this.identificacio, identificacionsRecursos.identificacio) &&
        Objects.equals(this.recurs, identificacionsRecursos.recurs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificacio, recurs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificacionsRecursos {\n");
    
    sb.append("    identificacio: ").append(toIndentedString(identificacio)).append("\n");
    sb.append("    recurs: ").append(toIndentedString(recurs)).append("\n");
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

