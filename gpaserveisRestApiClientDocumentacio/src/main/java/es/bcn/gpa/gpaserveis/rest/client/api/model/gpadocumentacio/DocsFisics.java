/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.22.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.TipusMime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * DocsFisics
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-28T16:18:30.394+02:00")
public class DocsFisics {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("nom")
  private String nom = null;

  @JsonProperty("plantilla")
  private Integer plantilla = null;

  @JsonProperty("tamany")
  private Long tamany = null;

  @JsonProperty("tipus")
  private Integer tipus = null;

  @JsonProperty("tipusMime")
  private TipusMime tipusMime = null;

  public DocsFisics id(BigDecimal id) {
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

  public DocsFisics nom(String nom) {
    this.nom = nom;
    return this;
  }

   /**
   * Get nom
   * @return nom
  **/
  @ApiModelProperty(value = "")
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public DocsFisics plantilla(Integer plantilla) {
    this.plantilla = plantilla;
    return this;
  }

   /**
   * Get plantilla
   * @return plantilla
  **/
  @ApiModelProperty(value = "")
  public Integer getPlantilla() {
    return plantilla;
  }

  public void setPlantilla(Integer plantilla) {
    this.plantilla = plantilla;
  }

  public DocsFisics tamany(Long tamany) {
    this.tamany = tamany;
    return this;
  }

   /**
   * Get tamany
   * @return tamany
  **/
  @ApiModelProperty(value = "")
  public Long getTamany() {
    return tamany;
  }

  public void setTamany(Long tamany) {
    this.tamany = tamany;
  }

  public DocsFisics tipus(Integer tipus) {
    this.tipus = tipus;
    return this;
  }

   /**
   * Get tipus
   * @return tipus
  **/
  @ApiModelProperty(value = "")
  public Integer getTipus() {
    return tipus;
  }

  public void setTipus(Integer tipus) {
    this.tipus = tipus;
  }

  public DocsFisics tipusMime(TipusMime tipusMime) {
    this.tipusMime = tipusMime;
    return this;
  }

   /**
   * Get tipusMime
   * @return tipusMime
  **/
  @ApiModelProperty(value = "")
  public TipusMime getTipusMime() {
    return tipusMime;
  }

  public void setTipusMime(TipusMime tipusMime) {
    this.tipusMime = tipusMime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsFisics docsFisics = (DocsFisics) o;
    return Objects.equals(this.id, docsFisics.id) &&
        Objects.equals(this.nom, docsFisics.nom) &&
        Objects.equals(this.plantilla, docsFisics.plantilla) &&
        Objects.equals(this.tamany, docsFisics.tamany) &&
        Objects.equals(this.tipus, docsFisics.tipus) &&
        Objects.equals(this.tipusMime, docsFisics.tipusMime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nom, plantilla, tamany, tipus, tipusMime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsFisics {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    plantilla: ").append(toIndentedString(plantilla)).append("\n");
    sb.append("    tamany: ").append(toIndentedString(tamany)).append("\n");
    sb.append("    tipus: ").append(toIndentedString(tipus)).append("\n");
    sb.append("    tipusMime: ").append(toIndentedString(tipusMime)).append("\n");
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

