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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.Usuaris;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.DateTime;

/**
 * Bloquejos
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-20T00:02:27.551+02:00")
public class Bloquejos {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("momentBloqueig")
  private DateTime momentBloqueig = null;

  @JsonProperty("procedimentBloquejatPerAltreUsuari")
  private Boolean procedimentBloquejatPerAltreUsuari = null;

  @JsonProperty("procedimentEditable")
  private Boolean procedimentEditable = null;

  @JsonProperty("tipus")
  private String tipus = null;

  @JsonProperty("usuari")
  private BigDecimal usuari = null;

  @JsonProperty("usuariBloquejo")
  private Usuaris usuariBloquejo = null;

  public Bloquejos id(BigDecimal id) {
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

  public Bloquejos momentBloqueig(DateTime momentBloqueig) {
    this.momentBloqueig = momentBloqueig;
    return this;
  }

   /**
   * Get momentBloqueig
   * @return momentBloqueig
  **/
  @ApiModelProperty(value = "")
  public DateTime getMomentBloqueig() {
    return momentBloqueig;
  }

  public void setMomentBloqueig(DateTime momentBloqueig) {
    this.momentBloqueig = momentBloqueig;
  }

  public Bloquejos procedimentBloquejatPerAltreUsuari(Boolean procedimentBloquejatPerAltreUsuari) {
    this.procedimentBloquejatPerAltreUsuari = procedimentBloquejatPerAltreUsuari;
    return this;
  }

   /**
   * Get procedimentBloquejatPerAltreUsuari
   * @return procedimentBloquejatPerAltreUsuari
  **/
  @ApiModelProperty(value = "")
  public Boolean isProcedimentBloquejatPerAltreUsuari() {
    return procedimentBloquejatPerAltreUsuari;
  }

  public void setProcedimentBloquejatPerAltreUsuari(Boolean procedimentBloquejatPerAltreUsuari) {
    this.procedimentBloquejatPerAltreUsuari = procedimentBloquejatPerAltreUsuari;
  }

  public Bloquejos procedimentEditable(Boolean procedimentEditable) {
    this.procedimentEditable = procedimentEditable;
    return this;
  }

   /**
   * Get procedimentEditable
   * @return procedimentEditable
  **/
  @ApiModelProperty(value = "")
  public Boolean isProcedimentEditable() {
    return procedimentEditable;
  }

  public void setProcedimentEditable(Boolean procedimentEditable) {
    this.procedimentEditable = procedimentEditable;
  }

  public Bloquejos tipus(String tipus) {
    this.tipus = tipus;
    return this;
  }

   /**
   * Get tipus
   * @return tipus
  **/
  @ApiModelProperty(value = "")
  public String getTipus() {
    return tipus;
  }

  public void setTipus(String tipus) {
    this.tipus = tipus;
  }

  public Bloquejos usuari(BigDecimal usuari) {
    this.usuari = usuari;
    return this;
  }

   /**
   * Get usuari
   * @return usuari
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUsuari() {
    return usuari;
  }

  public void setUsuari(BigDecimal usuari) {
    this.usuari = usuari;
  }

  public Bloquejos usuariBloquejo(Usuaris usuariBloquejo) {
    this.usuariBloquejo = usuariBloquejo;
    return this;
  }

   /**
   * Get usuariBloquejo
   * @return usuariBloquejo
  **/
  @ApiModelProperty(value = "")
  public Usuaris getUsuariBloquejo() {
    return usuariBloquejo;
  }

  public void setUsuariBloquejo(Usuaris usuariBloquejo) {
    this.usuariBloquejo = usuariBloquejo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bloquejos bloquejos = (Bloquejos) o;
    return Objects.equals(this.id, bloquejos.id) &&
        Objects.equals(this.momentBloqueig, bloquejos.momentBloqueig) &&
        Objects.equals(this.procedimentBloquejatPerAltreUsuari, bloquejos.procedimentBloquejatPerAltreUsuari) &&
        Objects.equals(this.procedimentEditable, bloquejos.procedimentEditable) &&
        Objects.equals(this.tipus, bloquejos.tipus) &&
        Objects.equals(this.usuari, bloquejos.usuari) &&
        Objects.equals(this.usuariBloquejo, bloquejos.usuariBloquejo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, momentBloqueig, procedimentBloquejatPerAltreUsuari, procedimentEditable, tipus, usuari, usuariBloquejo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bloquejos {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    momentBloqueig: ").append(toIndentedString(momentBloqueig)).append("\n");
    sb.append("    procedimentBloquejatPerAltreUsuari: ").append(toIndentedString(procedimentBloquejatPerAltreUsuari)).append("\n");
    sb.append("    procedimentEditable: ").append(toIndentedString(procedimentEditable)).append("\n");
    sb.append("    tipus: ").append(toIndentedString(tipus)).append("\n");
    sb.append("    usuari: ").append(toIndentedString(usuari)).append("\n");
    sb.append("    usuariBloquejo: ").append(toIndentedString(usuariBloquejo)).append("\n");
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

