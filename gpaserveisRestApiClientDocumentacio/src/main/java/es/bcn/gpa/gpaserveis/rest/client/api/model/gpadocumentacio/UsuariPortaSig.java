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

/**
 * UsuariPortaSig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T13:52:12.142+02:00")
public class UsuariPortaSig {
  @JsonProperty("documentIdentitat")
  private String documentIdentitat = null;

  @JsonProperty("idTabletUsuari")
  private String idTabletUsuari = null;

  @JsonProperty("matricula")
  private String matricula = null;

  @JsonProperty("nom")
  private String nom = null;

  public UsuariPortaSig documentIdentitat(String documentIdentitat) {
    this.documentIdentitat = documentIdentitat;
    return this;
  }

   /**
   * Document d&#39;identitat de la persona que va a signar el document
   * @return documentIdentitat
  **/
  @ApiModelProperty(value = "Document d'identitat de la persona que va a signar el document")
  public String getDocumentIdentitat() {
    return documentIdentitat;
  }

  public void setDocumentIdentitat(String documentIdentitat) {
    this.documentIdentitat = documentIdentitat;
  }

  public UsuariPortaSig idTabletUsuari(String idTabletUsuari) {
    this.idTabletUsuari = idTabletUsuari;
    return this;
  }

   /**
   * Identificador de la tauleta on signarà l&#39;usuari
   * @return idTabletUsuari
  **/
  @ApiModelProperty(value = "Identificador de la tauleta on signarà l'usuari")
  public String getIdTabletUsuari() {
    return idTabletUsuari;
  }

  public void setIdTabletUsuari(String idTabletUsuari) {
    this.idTabletUsuari = idTabletUsuari;
  }

  public UsuariPortaSig matricula(String matricula) {
    this.matricula = matricula;
    return this;
  }

   /**
   * Matrícula de la persona que va a signar el document
   * @return matricula
  **/
  @ApiModelProperty(value = "Matrícula de la persona que va a signar el document")
  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public UsuariPortaSig nom(String nom) {
    this.nom = nom;
    return this;
  }

   /**
   * Nom de la persona que va a signar el document
   * @return nom
  **/
  @ApiModelProperty(value = "Nom de la persona que va a signar el document")
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuariPortaSig usuariPortaSig = (UsuariPortaSig) o;
    return Objects.equals(this.documentIdentitat, usuariPortaSig.documentIdentitat) &&
        Objects.equals(this.idTabletUsuari, usuariPortaSig.idTabletUsuari) &&
        Objects.equals(this.matricula, usuariPortaSig.matricula) &&
        Objects.equals(this.nom, usuariPortaSig.nom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentIdentitat, idTabletUsuari, matricula, nom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuariPortaSig {\n");
    
    sb.append("    documentIdentitat: ").append(toIndentedString(documentIdentitat)).append("\n");
    sb.append("    idTabletUsuari: ").append(toIndentedString(idTabletUsuari)).append("\n");
    sb.append("    matricula: ").append(toIndentedString(matricula)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
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

