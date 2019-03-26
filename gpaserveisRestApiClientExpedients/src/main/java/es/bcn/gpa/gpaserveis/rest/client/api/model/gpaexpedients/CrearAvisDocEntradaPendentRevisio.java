/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.7.0
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
 * CrearAvisDocEntradaPendentRevisio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-26T01:50:19.832+01:00")
public class CrearAvisDocEntradaPendentRevisio {
  @JsonProperty("criticitat")
  private BigDecimal criticitat = null;

  @JsonProperty("expedient")
  private BigDecimal expedient = null;

  @JsonProperty("tipus")
  private BigDecimal tipus = null;

  public CrearAvisDocEntradaPendentRevisio criticitat(BigDecimal criticitat) {
    this.criticitat = criticitat;
    return this;
  }

   /**
   * Criticitat de l&#39;avís
   * @return criticitat
  **/
  @ApiModelProperty(value = "Criticitat de l'avís")
  public BigDecimal getCriticitat() {
    return criticitat;
  }

  public void setCriticitat(BigDecimal criticitat) {
    this.criticitat = criticitat;
  }

  public CrearAvisDocEntradaPendentRevisio expedient(BigDecimal expedient) {
    this.expedient = expedient;
    return this;
  }

   /**
   * Identificador de l&#39;expedient per al qual s&#39;ha de crear l&#39;avís
   * @return expedient
  **/
  @ApiModelProperty(value = "Identificador de l'expedient per al qual s'ha de crear l'avís")
  public BigDecimal getExpedient() {
    return expedient;
  }

  public void setExpedient(BigDecimal expedient) {
    this.expedient = expedient;
  }

  public CrearAvisDocEntradaPendentRevisio tipus(BigDecimal tipus) {
    this.tipus = tipus;
    return this;
  }

   /**
   * Tipus de l&#39;avís
   * @return tipus
  **/
  @ApiModelProperty(value = "Tipus de l'avís")
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
    CrearAvisDocEntradaPendentRevisio crearAvisDocEntradaPendentRevisio = (CrearAvisDocEntradaPendentRevisio) o;
    return Objects.equals(this.criticitat, crearAvisDocEntradaPendentRevisio.criticitat) &&
        Objects.equals(this.expedient, crearAvisDocEntradaPendentRevisio.expedient) &&
        Objects.equals(this.tipus, crearAvisDocEntradaPendentRevisio.tipus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criticitat, expedient, tipus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrearAvisDocEntradaPendentRevisio {\n");
    
    sb.append("    criticitat: ").append(toIndentedString(criticitat)).append("\n");
    sb.append("    expedient: ").append(toIndentedString(expedient)).append("\n");
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

