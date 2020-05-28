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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * SignarPortasignaturesDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-28T16:18:30.394+02:00")
public class SignarPortasignaturesDocument {
  @JsonProperty("accio")
  private BigDecimal accio = null;

  @JsonProperty("codiUnitatOrganigrama")
  private String codiUnitatOrganigrama = null;

  @JsonProperty("idDocument")
  private BigDecimal idDocument = null;

  @JsonProperty("matriculaUsuari")
  private String matriculaUsuari = null;

  @JsonProperty("nomProcediment")
  private String nomProcediment = null;

  @JsonProperty("politicaSignatura")
  private String politicaSignatura = null;

  public SignarPortasignaturesDocument accio(BigDecimal accio) {
    this.accio = accio;
    return this;
  }

   /**
   * Acció a realitzar en porta signatures: vistiplau o signatura
   * @return accio
  **/
  @ApiModelProperty(value = "Acció a realitzar en porta signatures: vistiplau o signatura")
  public BigDecimal getAccio() {
    return accio;
  }

  public void setAccio(BigDecimal accio) {
    this.accio = accio;
  }

  public SignarPortasignaturesDocument codiUnitatOrganigrama(String codiUnitatOrganigrama) {
    this.codiUnitatOrganigrama = codiUnitatOrganigrama;
    return this;
  }

   /**
   * Codi de l&#39;organigrama de la unitat gestora
   * @return codiUnitatOrganigrama
  **/
  @ApiModelProperty(value = "Codi de l'organigrama de la unitat gestora")
  public String getCodiUnitatOrganigrama() {
    return codiUnitatOrganigrama;
  }

  public void setCodiUnitatOrganigrama(String codiUnitatOrganigrama) {
    this.codiUnitatOrganigrama = codiUnitatOrganigrama;
  }

  public SignarPortasignaturesDocument idDocument(BigDecimal idDocument) {
    this.idDocument = idDocument;
    return this;
  }

   /**
   * Identificador del document
   * @return idDocument
  **/
  @ApiModelProperty(value = "Identificador del document")
  public BigDecimal getIdDocument() {
    return idDocument;
  }

  public void setIdDocument(BigDecimal idDocument) {
    this.idDocument = idDocument;
  }

  public SignarPortasignaturesDocument matriculaUsuari(String matriculaUsuari) {
    this.matriculaUsuari = matriculaUsuari;
    return this;
  }

   /**
   * Matrícula de la persona que va a signar el document
   * @return matriculaUsuari
  **/
  @ApiModelProperty(required = true, value = "Matrícula de la persona que va a signar el document")
  public String getMatriculaUsuari() {
    return matriculaUsuari;
  }

  public void setMatriculaUsuari(String matriculaUsuari) {
    this.matriculaUsuari = matriculaUsuari;
  }

  public SignarPortasignaturesDocument nomProcediment(String nomProcediment) {
    this.nomProcediment = nomProcediment;
    return this;
  }

   /**
   * Nom de l&#39;procediment de l&#39;expedient
   * @return nomProcediment
  **/
  @ApiModelProperty(value = "Nom de l'procediment de l'expedient")
  public String getNomProcediment() {
    return nomProcediment;
  }

  public void setNomProcediment(String nomProcediment) {
    this.nomProcediment = nomProcediment;
  }

  public SignarPortasignaturesDocument politicaSignatura(String politicaSignatura) {
    this.politicaSignatura = politicaSignatura;
    return this;
  }

   /**
   * Nom de la política de signatura
   * @return politicaSignatura
  **/
  @ApiModelProperty(value = "Nom de la política de signatura")
  public String getPoliticaSignatura() {
    return politicaSignatura;
  }

  public void setPoliticaSignatura(String politicaSignatura) {
    this.politicaSignatura = politicaSignatura;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignarPortasignaturesDocument signarPortasignaturesDocument = (SignarPortasignaturesDocument) o;
    return Objects.equals(this.accio, signarPortasignaturesDocument.accio) &&
        Objects.equals(this.codiUnitatOrganigrama, signarPortasignaturesDocument.codiUnitatOrganigrama) &&
        Objects.equals(this.idDocument, signarPortasignaturesDocument.idDocument) &&
        Objects.equals(this.matriculaUsuari, signarPortasignaturesDocument.matriculaUsuari) &&
        Objects.equals(this.nomProcediment, signarPortasignaturesDocument.nomProcediment) &&
        Objects.equals(this.politicaSignatura, signarPortasignaturesDocument.politicaSignatura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accio, codiUnitatOrganigrama, idDocument, matriculaUsuari, nomProcediment, politicaSignatura);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignarPortasignaturesDocument {\n");
    
    sb.append("    accio: ").append(toIndentedString(accio)).append("\n");
    sb.append("    codiUnitatOrganigrama: ").append(toIndentedString(codiUnitatOrganigrama)).append("\n");
    sb.append("    idDocument: ").append(toIndentedString(idDocument)).append("\n");
    sb.append("    matriculaUsuari: ").append(toIndentedString(matriculaUsuari)).append("\n");
    sb.append("    nomProcediment: ").append(toIndentedString(nomProcediment)).append("\n");
    sb.append("    politicaSignatura: ").append(toIndentedString(politicaSignatura)).append("\n");
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

