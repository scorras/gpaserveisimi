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
 * SignarSegellDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-08T12:05:16.181+02:00")
public class SignarSegellDocument {
  @JsonProperty("codiError")
  private Integer codiError = null;

  @JsonProperty("descError")
  private String descError = null;

  @JsonProperty("idDocument")
  private BigDecimal idDocument = null;

  @JsonProperty("politicaSignatura")
  private String politicaSignatura = null;

  public SignarSegellDocument codiError(Integer codiError) {
    this.codiError = codiError;
    return this;
  }

   /**
   * Codi de l&#39;error
   * @return codiError
  **/
  @ApiModelProperty(value = "Codi de l'error")
  public Integer getCodiError() {
    return codiError;
  }

  public void setCodiError(Integer codiError) {
    this.codiError = codiError;
  }

  public SignarSegellDocument descError(String descError) {
    this.descError = descError;
    return this;
  }

   /**
   * Descripció de l&#39;error
   * @return descError
  **/
  @ApiModelProperty(value = "Descripció de l'error")
  public String getDescError() {
    return descError;
  }

  public void setDescError(String descError) {
    this.descError = descError;
  }

  public SignarSegellDocument idDocument(BigDecimal idDocument) {
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

  public SignarSegellDocument politicaSignatura(String politicaSignatura) {
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
    SignarSegellDocument signarSegellDocument = (SignarSegellDocument) o;
    return Objects.equals(this.codiError, signarSegellDocument.codiError) &&
        Objects.equals(this.descError, signarSegellDocument.descError) &&
        Objects.equals(this.idDocument, signarSegellDocument.idDocument) &&
        Objects.equals(this.politicaSignatura, signarSegellDocument.politicaSignatura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiError, descError, idDocument, politicaSignatura);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignarSegellDocument {\n");
    
    sb.append("    codiError: ").append(toIndentedString(codiError)).append("\n");
    sb.append("    descError: ").append(toIndentedString(descError)).append("\n");
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

