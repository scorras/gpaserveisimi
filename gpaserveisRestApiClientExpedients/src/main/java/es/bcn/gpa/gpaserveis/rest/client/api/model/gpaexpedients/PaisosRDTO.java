/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.26.9
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

/**
 * PaisosRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-22T10:13:49.572+01:00")
public class PaisosRDTO {
  @JsonProperty("codiIne")
  private String codiIne = null;

  @JsonProperty("codiIso")
  private String codiIso = null;

  @JsonProperty("nom")
  private String nom = null;

  @JsonProperty("nomCastella")
  private String nomCastella = null;

  @JsonProperty("nomCatala")
  private String nomCatala = null;

  public PaisosRDTO codiIne(String codiIne) {
    this.codiIne = codiIne;
    return this;
  }

   /**
   * Get codiIne
   * @return codiIne
  **/
  @ApiModelProperty(value = "")
  public String getCodiIne() {
    return codiIne;
  }

  public void setCodiIne(String codiIne) {
    this.codiIne = codiIne;
  }

  public PaisosRDTO codiIso(String codiIso) {
    this.codiIso = codiIso;
    return this;
  }

   /**
   * Get codiIso
   * @return codiIso
  **/
  @ApiModelProperty(value = "")
  public String getCodiIso() {
    return codiIso;
  }

  public void setCodiIso(String codiIso) {
    this.codiIso = codiIso;
  }

  public PaisosRDTO nom(String nom) {
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

  public PaisosRDTO nomCastella(String nomCastella) {
    this.nomCastella = nomCastella;
    return this;
  }

   /**
   * Get nomCastella
   * @return nomCastella
  **/
  @ApiModelProperty(value = "")
  public String getNomCastella() {
    return nomCastella;
  }

  public void setNomCastella(String nomCastella) {
    this.nomCastella = nomCastella;
  }

  public PaisosRDTO nomCatala(String nomCatala) {
    this.nomCatala = nomCatala;
    return this;
  }

   /**
   * Get nomCatala
   * @return nomCatala
  **/
  @ApiModelProperty(value = "")
  public String getNomCatala() {
    return nomCatala;
  }

  public void setNomCatala(String nomCatala) {
    this.nomCatala = nomCatala;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaisosRDTO paisosRDTO = (PaisosRDTO) o;
    return Objects.equals(this.codiIne, paisosRDTO.codiIne) &&
        Objects.equals(this.codiIso, paisosRDTO.codiIso) &&
        Objects.equals(this.nom, paisosRDTO.nom) &&
        Objects.equals(this.nomCastella, paisosRDTO.nomCastella) &&
        Objects.equals(this.nomCatala, paisosRDTO.nomCatala);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiIne, codiIso, nom, nomCastella, nomCatala);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaisosRDTO {\n");
    
    sb.append("    codiIne: ").append(toIndentedString(codiIne)).append("\n");
    sb.append("    codiIso: ").append(toIndentedString(codiIso)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    nomCastella: ").append(toIndentedString(nomCastella)).append("\n");
    sb.append("    nomCatala: ").append(toIndentedString(nomCatala)).append("\n");
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

