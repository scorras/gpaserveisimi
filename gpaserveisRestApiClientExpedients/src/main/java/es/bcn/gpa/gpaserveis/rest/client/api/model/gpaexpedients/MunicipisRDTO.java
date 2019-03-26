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

/**
 * MunicipisRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T15:00:50.319+01:00")
public class MunicipisRDTO {
  @JsonProperty("codiIne")
  private String codiIne = null;

  @JsonProperty("codiMunicipi")
  private String codiMunicipi = null;

  @JsonProperty("comarca")
  private String comarca = null;

  @JsonProperty("nom")
  private String nom = null;

  @JsonProperty("provincia")
  private String provincia = null;

  public MunicipisRDTO codiIne(String codiIne) {
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

  public MunicipisRDTO codiMunicipi(String codiMunicipi) {
    this.codiMunicipi = codiMunicipi;
    return this;
  }

   /**
   * Get codiMunicipi
   * @return codiMunicipi
  **/
  @ApiModelProperty(value = "")
  public String getCodiMunicipi() {
    return codiMunicipi;
  }

  public void setCodiMunicipi(String codiMunicipi) {
    this.codiMunicipi = codiMunicipi;
  }

  public MunicipisRDTO comarca(String comarca) {
    this.comarca = comarca;
    return this;
  }

   /**
   * Get comarca
   * @return comarca
  **/
  @ApiModelProperty(value = "")
  public String getComarca() {
    return comarca;
  }

  public void setComarca(String comarca) {
    this.comarca = comarca;
  }

  public MunicipisRDTO nom(String nom) {
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

  public MunicipisRDTO provincia(String provincia) {
    this.provincia = provincia;
    return this;
  }

   /**
   * Get provincia
   * @return provincia
  **/
  @ApiModelProperty(value = "")
  public String getProvincia() {
    return provincia;
  }

  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MunicipisRDTO municipisRDTO = (MunicipisRDTO) o;
    return Objects.equals(this.codiIne, municipisRDTO.codiIne) &&
        Objects.equals(this.codiMunicipi, municipisRDTO.codiMunicipi) &&
        Objects.equals(this.comarca, municipisRDTO.comarca) &&
        Objects.equals(this.nom, municipisRDTO.nom) &&
        Objects.equals(this.provincia, municipisRDTO.provincia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiIne, codiMunicipi, comarca, nom, provincia);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MunicipisRDTO {\n");
    
    sb.append("    codiIne: ").append(toIndentedString(codiIne)).append("\n");
    sb.append("    codiMunicipi: ").append(toIndentedString(codiMunicipi)).append("\n");
    sb.append("    comarca: ").append(toIndentedString(comarca)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
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

