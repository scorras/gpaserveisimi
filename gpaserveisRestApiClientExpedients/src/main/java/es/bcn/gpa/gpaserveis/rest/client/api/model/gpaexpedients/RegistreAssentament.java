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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.Persones;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.DateTime;

/**
 * RegistreAssentament
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-15T17:44:24.356+02:00")
public class RegistreAssentament {
  @JsonProperty("codi")
  private String codi = null;

  @JsonProperty("dataRegistre")
  private DateTime dataRegistre = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("persona")
  private BigDecimal persona = null;

  @JsonProperty("persones")
  private Persones persones = null;

  @JsonProperty("tipus")
  private BigDecimal tipus = null;

  public RegistreAssentament codi(String codi) {
    this.codi = codi;
    return this;
  }

   /**
   * Get codi
   * @return codi
  **/
  @ApiModelProperty(value = "")
  public String getCodi() {
    return codi;
  }

  public void setCodi(String codi) {
    this.codi = codi;
  }

  public RegistreAssentament dataRegistre(DateTime dataRegistre) {
    this.dataRegistre = dataRegistre;
    return this;
  }

   /**
   * Get dataRegistre
   * @return dataRegistre
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataRegistre() {
    return dataRegistre;
  }

  public void setDataRegistre(DateTime dataRegistre) {
    this.dataRegistre = dataRegistre;
  }

  public RegistreAssentament id(BigDecimal id) {
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

  public RegistreAssentament persona(BigDecimal persona) {
    this.persona = persona;
    return this;
  }

   /**
   * Get persona
   * @return persona
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPersona() {
    return persona;
  }

  public void setPersona(BigDecimal persona) {
    this.persona = persona;
  }

  public RegistreAssentament persones(Persones persones) {
    this.persones = persones;
    return this;
  }

   /**
   * Get persones
   * @return persones
  **/
  @ApiModelProperty(value = "")
  public Persones getPersones() {
    return persones;
  }

  public void setPersones(Persones persones) {
    this.persones = persones;
  }

  public RegistreAssentament tipus(BigDecimal tipus) {
    this.tipus = tipus;
    return this;
  }

   /**
   * Get tipus
   * @return tipus
  **/
  @ApiModelProperty(value = "")
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
    RegistreAssentament registreAssentament = (RegistreAssentament) o;
    return Objects.equals(this.codi, registreAssentament.codi) &&
        Objects.equals(this.dataRegistre, registreAssentament.dataRegistre) &&
        Objects.equals(this.id, registreAssentament.id) &&
        Objects.equals(this.persona, registreAssentament.persona) &&
        Objects.equals(this.persones, registreAssentament.persones) &&
        Objects.equals(this.tipus, registreAssentament.tipus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codi, dataRegistre, id, persona, persones, tipus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistreAssentament {\n");
    
    sb.append("    codi: ").append(toIndentedString(codi)).append("\n");
    sb.append("    dataRegistre: ").append(toIndentedString(dataRegistre)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    persones: ").append(toIndentedString(persones)).append("\n");
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

