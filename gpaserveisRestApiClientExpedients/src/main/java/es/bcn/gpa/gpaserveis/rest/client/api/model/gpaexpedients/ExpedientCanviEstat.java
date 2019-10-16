/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.15.0
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
 * ExpedientCanviEstat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-15T17:44:24.356+02:00")
public class ExpedientCanviEstat {
  @JsonProperty("comentari")
  private String comentari = null;

  @JsonProperty("diesTerminiAllegacio")
  private BigDecimal diesTerminiAllegacio = null;

  @JsonProperty("diesTerminiRequeriment")
  private BigDecimal diesTerminiRequeriment = null;

  @JsonProperty("idAccioEstat")
  private BigDecimal idAccioEstat = null;

  public ExpedientCanviEstat comentari(String comentari) {
    this.comentari = comentari;
    return this;
  }

   /**
   * Comentari associat al canvi d&#39;estat
   * @return comentari
  **/
  @ApiModelProperty(value = "Comentari associat al canvi d'estat")
  public String getComentari() {
    return comentari;
  }

  public void setComentari(String comentari) {
    this.comentari = comentari;
  }

  public ExpedientCanviEstat diesTerminiAllegacio(BigDecimal diesTerminiAllegacio) {
    this.diesTerminiAllegacio = diesTerminiAllegacio;
    return this;
  }

   /**
   * Dies de termini per respondre a les al·legacions
   * @return diesTerminiAllegacio
  **/
  @ApiModelProperty(value = "Dies de termini per respondre a les al·legacions")
  public BigDecimal getDiesTerminiAllegacio() {
    return diesTerminiAllegacio;
  }

  public void setDiesTerminiAllegacio(BigDecimal diesTerminiAllegacio) {
    this.diesTerminiAllegacio = diesTerminiAllegacio;
  }

  public ExpedientCanviEstat diesTerminiRequeriment(BigDecimal diesTerminiRequeriment) {
    this.diesTerminiRequeriment = diesTerminiRequeriment;
    return this;
  }

   /**
   * Dies de termini per respondre al requeriment
   * @return diesTerminiRequeriment
  **/
  @ApiModelProperty(value = "Dies de termini per respondre al requeriment")
  public BigDecimal getDiesTerminiRequeriment() {
    return diesTerminiRequeriment;
  }

  public void setDiesTerminiRequeriment(BigDecimal diesTerminiRequeriment) {
    this.diesTerminiRequeriment = diesTerminiRequeriment;
  }

  public ExpedientCanviEstat idAccioEstat(BigDecimal idAccioEstat) {
    this.idAccioEstat = idAccioEstat;
    return this;
  }

   /**
   * Identificador de la transició acció - estat
   * @return idAccioEstat
  **/
  @ApiModelProperty(value = "Identificador de la transició acció - estat")
  public BigDecimal getIdAccioEstat() {
    return idAccioEstat;
  }

  public void setIdAccioEstat(BigDecimal idAccioEstat) {
    this.idAccioEstat = idAccioEstat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpedientCanviEstat expedientCanviEstat = (ExpedientCanviEstat) o;
    return Objects.equals(this.comentari, expedientCanviEstat.comentari) &&
        Objects.equals(this.diesTerminiAllegacio, expedientCanviEstat.diesTerminiAllegacio) &&
        Objects.equals(this.diesTerminiRequeriment, expedientCanviEstat.diesTerminiRequeriment) &&
        Objects.equals(this.idAccioEstat, expedientCanviEstat.idAccioEstat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comentari, diesTerminiAllegacio, diesTerminiRequeriment, idAccioEstat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpedientCanviEstat {\n");
    
    sb.append("    comentari: ").append(toIndentedString(comentari)).append("\n");
    sb.append("    diesTerminiAllegacio: ").append(toIndentedString(diesTerminiAllegacio)).append("\n");
    sb.append("    diesTerminiRequeriment: ").append(toIndentedString(diesTerminiRequeriment)).append("\n");
    sb.append("    idAccioEstat: ").append(toIndentedString(idAccioEstat)).append("\n");
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

