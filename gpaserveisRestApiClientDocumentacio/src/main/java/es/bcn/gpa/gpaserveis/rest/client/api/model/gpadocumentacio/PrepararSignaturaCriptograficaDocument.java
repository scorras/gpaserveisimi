/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 2.5.0
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
 * PrepararSignaturaCriptograficaDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-08T12:05:16.181+02:00")
public class PrepararSignaturaCriptograficaDocument {
  @JsonProperty("idDocument")
  private BigDecimal idDocument = null;

  @JsonProperty("politicaSignatura")
  private String politicaSignatura = null;

  public PrepararSignaturaCriptograficaDocument idDocument(BigDecimal idDocument) {
    this.idDocument = idDocument;
    return this;
  }

   /**
   * Identificador de el document
   * @return idDocument
  **/
  @ApiModelProperty(value = "Identificador de el document")
  public BigDecimal getIdDocument() {
    return idDocument;
  }

  public void setIdDocument(BigDecimal idDocument) {
    this.idDocument = idDocument;
  }

  public PrepararSignaturaCriptograficaDocument politicaSignatura(String politicaSignatura) {
    this.politicaSignatura = politicaSignatura;
    return this;
  }

   /**
   * Política de signatura
   * @return politicaSignatura
  **/
  @ApiModelProperty(value = "Política de signatura")
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
    PrepararSignaturaCriptograficaDocument prepararSignaturaCriptograficaDocument = (PrepararSignaturaCriptograficaDocument) o;
    return Objects.equals(this.idDocument, prepararSignaturaCriptograficaDocument.idDocument) &&
        Objects.equals(this.politicaSignatura, prepararSignaturaCriptograficaDocument.politicaSignatura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDocument, politicaSignatura);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepararSignaturaCriptograficaDocument {\n");
    
    sb.append("    idDocument: ").append(toIndentedString(idDocument)).append("\n");
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

