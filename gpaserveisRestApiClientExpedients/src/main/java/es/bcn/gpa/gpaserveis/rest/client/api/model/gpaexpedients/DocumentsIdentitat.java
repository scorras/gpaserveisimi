/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.17.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.TipusDocumentIdentitat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * DocumentsIdentitat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-11T14:01:14.556+01:00")
public class DocumentsIdentitat {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("numeroDocument")
  private String numeroDocument = null;

  @JsonProperty("pais")
  private String pais = null;

  @JsonProperty("tipus")
  private BigDecimal tipus = null;

  @JsonProperty("tipusDocumentIdentitat")
  private TipusDocumentIdentitat tipusDocumentIdentitat = null;

  public DocumentsIdentitat id(BigDecimal id) {
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

  public DocumentsIdentitat numeroDocument(String numeroDocument) {
    this.numeroDocument = numeroDocument;
    return this;
  }

   /**
   * Get numeroDocument
   * @return numeroDocument
  **/
  @ApiModelProperty(value = "")
  public String getNumeroDocument() {
    return numeroDocument;
  }

  public void setNumeroDocument(String numeroDocument) {
    this.numeroDocument = numeroDocument;
  }

  public DocumentsIdentitat pais(String pais) {
    this.pais = pais;
    return this;
  }

   /**
   * Get pais
   * @return pais
  **/
  @ApiModelProperty(value = "")
  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public DocumentsIdentitat tipus(BigDecimal tipus) {
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

  public DocumentsIdentitat tipusDocumentIdentitat(TipusDocumentIdentitat tipusDocumentIdentitat) {
    this.tipusDocumentIdentitat = tipusDocumentIdentitat;
    return this;
  }

   /**
   * Get tipusDocumentIdentitat
   * @return tipusDocumentIdentitat
  **/
  @ApiModelProperty(value = "")
  public TipusDocumentIdentitat getTipusDocumentIdentitat() {
    return tipusDocumentIdentitat;
  }

  public void setTipusDocumentIdentitat(TipusDocumentIdentitat tipusDocumentIdentitat) {
    this.tipusDocumentIdentitat = tipusDocumentIdentitat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentsIdentitat documentsIdentitat = (DocumentsIdentitat) o;
    return Objects.equals(this.id, documentsIdentitat.id) &&
        Objects.equals(this.numeroDocument, documentsIdentitat.numeroDocument) &&
        Objects.equals(this.pais, documentsIdentitat.pais) &&
        Objects.equals(this.tipus, documentsIdentitat.tipus) &&
        Objects.equals(this.tipusDocumentIdentitat, documentsIdentitat.tipusDocumentIdentitat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numeroDocument, pais, tipus, tipusDocumentIdentitat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentsIdentitat {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numeroDocument: ").append(toIndentedString(numeroDocument)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    tipus: ").append(toIndentedString(tipus)).append("\n");
    sb.append("    tipusDocumentIdentitat: ").append(toIndentedString(tipusDocumentIdentitat)).append("\n");
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

