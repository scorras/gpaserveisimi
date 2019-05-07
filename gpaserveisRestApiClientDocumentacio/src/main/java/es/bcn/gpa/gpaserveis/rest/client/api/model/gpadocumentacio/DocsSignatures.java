/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.11.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsFisics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.DateTime;

/**
 * DocsSignatures
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-07T17:29:21.076+02:00")
public class DocsSignatures {
  @JsonProperty("dataSignatura")
  private DateTime dataSignatura = null;

  @JsonProperty("docFisicSignat")
  private BigDecimal docFisicSignat = null;

  @JsonProperty("docsFisics")
  private DocsFisics docsFisics = null;

  @JsonProperty("documentTramitacio")
  private BigDecimal documentTramitacio = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("signat")
  private Integer signat = null;

  @JsonProperty("signatManualment")
  private Integer signatManualment = null;

  @JsonProperty("usuariSignaturaIdext")
  private BigDecimal usuariSignaturaIdext = null;

  public DocsSignatures dataSignatura(DateTime dataSignatura) {
    this.dataSignatura = dataSignatura;
    return this;
  }

   /**
   * Get dataSignatura
   * @return dataSignatura
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataSignatura() {
    return dataSignatura;
  }

  public void setDataSignatura(DateTime dataSignatura) {
    this.dataSignatura = dataSignatura;
  }

  public DocsSignatures docFisicSignat(BigDecimal docFisicSignat) {
    this.docFisicSignat = docFisicSignat;
    return this;
  }

   /**
   * Get docFisicSignat
   * @return docFisicSignat
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDocFisicSignat() {
    return docFisicSignat;
  }

  public void setDocFisicSignat(BigDecimal docFisicSignat) {
    this.docFisicSignat = docFisicSignat;
  }

  public DocsSignatures docsFisics(DocsFisics docsFisics) {
    this.docsFisics = docsFisics;
    return this;
  }

   /**
   * Get docsFisics
   * @return docsFisics
  **/
  @ApiModelProperty(value = "")
  public DocsFisics getDocsFisics() {
    return docsFisics;
  }

  public void setDocsFisics(DocsFisics docsFisics) {
    this.docsFisics = docsFisics;
  }

  public DocsSignatures documentTramitacio(BigDecimal documentTramitacio) {
    this.documentTramitacio = documentTramitacio;
    return this;
  }

   /**
   * Get documentTramitacio
   * @return documentTramitacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDocumentTramitacio() {
    return documentTramitacio;
  }

  public void setDocumentTramitacio(BigDecimal documentTramitacio) {
    this.documentTramitacio = documentTramitacio;
  }

  public DocsSignatures id(BigDecimal id) {
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

  public DocsSignatures signat(Integer signat) {
    this.signat = signat;
    return this;
  }

   /**
   * Get signat
   * @return signat
  **/
  @ApiModelProperty(value = "")
  public Integer getSignat() {
    return signat;
  }

  public void setSignat(Integer signat) {
    this.signat = signat;
  }

  public DocsSignatures signatManualment(Integer signatManualment) {
    this.signatManualment = signatManualment;
    return this;
  }

   /**
   * Get signatManualment
   * @return signatManualment
  **/
  @ApiModelProperty(value = "")
  public Integer getSignatManualment() {
    return signatManualment;
  }

  public void setSignatManualment(Integer signatManualment) {
    this.signatManualment = signatManualment;
  }

  public DocsSignatures usuariSignaturaIdext(BigDecimal usuariSignaturaIdext) {
    this.usuariSignaturaIdext = usuariSignaturaIdext;
    return this;
  }

   /**
   * Get usuariSignaturaIdext
   * @return usuariSignaturaIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUsuariSignaturaIdext() {
    return usuariSignaturaIdext;
  }

  public void setUsuariSignaturaIdext(BigDecimal usuariSignaturaIdext) {
    this.usuariSignaturaIdext = usuariSignaturaIdext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsSignatures docsSignatures = (DocsSignatures) o;
    return Objects.equals(this.dataSignatura, docsSignatures.dataSignatura) &&
        Objects.equals(this.docFisicSignat, docsSignatures.docFisicSignat) &&
        Objects.equals(this.docsFisics, docsSignatures.docsFisics) &&
        Objects.equals(this.documentTramitacio, docsSignatures.documentTramitacio) &&
        Objects.equals(this.id, docsSignatures.id) &&
        Objects.equals(this.signat, docsSignatures.signat) &&
        Objects.equals(this.signatManualment, docsSignatures.signatManualment) &&
        Objects.equals(this.usuariSignaturaIdext, docsSignatures.usuariSignaturaIdext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSignatura, docFisicSignat, docsFisics, documentTramitacio, id, signat, signatManualment, usuariSignaturaIdext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsSignatures {\n");
    
    sb.append("    dataSignatura: ").append(toIndentedString(dataSignatura)).append("\n");
    sb.append("    docFisicSignat: ").append(toIndentedString(docFisicSignat)).append("\n");
    sb.append("    docsFisics: ").append(toIndentedString(docsFisics)).append("\n");
    sb.append("    documentTramitacio: ").append(toIndentedString(documentTramitacio)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    signat: ").append(toIndentedString(signat)).append("\n");
    sb.append("    signatManualment: ").append(toIndentedString(signatManualment)).append("\n");
    sb.append("    usuariSignaturaIdext: ").append(toIndentedString(usuariSignaturaIdext)).append("\n");
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

