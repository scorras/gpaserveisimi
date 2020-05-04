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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * AtributsDocs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-30T19:13:23.947+02:00")
public class AtributsDocs {
  @JsonProperty("acces")
  private Integer acces = null;

  @JsonProperty("autenticacio")
  private Integer autenticacio = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("indexable")
  private Integer indexable = null;

  @JsonProperty("lopd")
  private Integer lopd = null;

  @JsonProperty("obligatori")
  private Integer obligatori = null;

  @JsonProperty("origen")
  private Integer origen = null;

  @JsonProperty("publicable")
  private Integer publicable = null;

  @JsonProperty("repetible")
  private Integer repetible = null;

  public AtributsDocs acces(Integer acces) {
    this.acces = acces;
    return this;
  }

   /**
   * Get acces
   * @return acces
  **/
  @ApiModelProperty(value = "")
  public Integer getAcces() {
    return acces;
  }

  public void setAcces(Integer acces) {
    this.acces = acces;
  }

  public AtributsDocs autenticacio(Integer autenticacio) {
    this.autenticacio = autenticacio;
    return this;
  }

   /**
   * Get autenticacio
   * @return autenticacio
  **/
  @ApiModelProperty(value = "")
  public Integer getAutenticacio() {
    return autenticacio;
  }

  public void setAutenticacio(Integer autenticacio) {
    this.autenticacio = autenticacio;
  }

  public AtributsDocs id(BigDecimal id) {
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

  public AtributsDocs indexable(Integer indexable) {
    this.indexable = indexable;
    return this;
  }

   /**
   * Get indexable
   * @return indexable
  **/
  @ApiModelProperty(value = "")
  public Integer getIndexable() {
    return indexable;
  }

  public void setIndexable(Integer indexable) {
    this.indexable = indexable;
  }

  public AtributsDocs lopd(Integer lopd) {
    this.lopd = lopd;
    return this;
  }

   /**
   * Get lopd
   * @return lopd
  **/
  @ApiModelProperty(value = "")
  public Integer getLopd() {
    return lopd;
  }

  public void setLopd(Integer lopd) {
    this.lopd = lopd;
  }

  public AtributsDocs obligatori(Integer obligatori) {
    this.obligatori = obligatori;
    return this;
  }

   /**
   * Get obligatori
   * @return obligatori
  **/
  @ApiModelProperty(value = "")
  public Integer getObligatori() {
    return obligatori;
  }

  public void setObligatori(Integer obligatori) {
    this.obligatori = obligatori;
  }

  public AtributsDocs origen(Integer origen) {
    this.origen = origen;
    return this;
  }

   /**
   * Get origen
   * @return origen
  **/
  @ApiModelProperty(value = "")
  public Integer getOrigen() {
    return origen;
  }

  public void setOrigen(Integer origen) {
    this.origen = origen;
  }

  public AtributsDocs publicable(Integer publicable) {
    this.publicable = publicable;
    return this;
  }

   /**
   * Get publicable
   * @return publicable
  **/
  @ApiModelProperty(value = "")
  public Integer getPublicable() {
    return publicable;
  }

  public void setPublicable(Integer publicable) {
    this.publicable = publicable;
  }

  public AtributsDocs repetible(Integer repetible) {
    this.repetible = repetible;
    return this;
  }

   /**
   * Get repetible
   * @return repetible
  **/
  @ApiModelProperty(value = "")
  public Integer getRepetible() {
    return repetible;
  }

  public void setRepetible(Integer repetible) {
    this.repetible = repetible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtributsDocs atributsDocs = (AtributsDocs) o;
    return Objects.equals(this.acces, atributsDocs.acces) &&
        Objects.equals(this.autenticacio, atributsDocs.autenticacio) &&
        Objects.equals(this.id, atributsDocs.id) &&
        Objects.equals(this.indexable, atributsDocs.indexable) &&
        Objects.equals(this.lopd, atributsDocs.lopd) &&
        Objects.equals(this.obligatori, atributsDocs.obligatori) &&
        Objects.equals(this.origen, atributsDocs.origen) &&
        Objects.equals(this.publicable, atributsDocs.publicable) &&
        Objects.equals(this.repetible, atributsDocs.repetible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acces, autenticacio, id, indexable, lopd, obligatori, origen, publicable, repetible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtributsDocs {\n");
    
    sb.append("    acces: ").append(toIndentedString(acces)).append("\n");
    sb.append("    autenticacio: ").append(toIndentedString(autenticacio)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indexable: ").append(toIndentedString(indexable)).append("\n");
    sb.append("    lopd: ").append(toIndentedString(lopd)).append("\n");
    sb.append("    obligatori: ").append(toIndentedString(obligatori)).append("\n");
    sb.append("    origen: ").append(toIndentedString(origen)).append("\n");
    sb.append("    publicable: ").append(toIndentedString(publicable)).append("\n");
    sb.append("    repetible: ").append(toIndentedString(repetible)).append("\n");
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

