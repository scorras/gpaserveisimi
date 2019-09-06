/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.15.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsEntradaRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * DocsAssociatsIntra
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-06T08:41:37.186+02:00")
public class DocsAssociatsIntra {
  @JsonProperty("docsEntrada")
  private DocsEntradaRDTO docsEntrada = null;

  @JsonProperty("idDocumentOriginal")
  private BigDecimal idDocumentOriginal = null;

  @JsonProperty("idExpedientDestino")
  private BigDecimal idExpedientDestino = null;

  @JsonProperty("idExpedientOrigen")
  private BigDecimal idExpedientOrigen = null;

  public DocsAssociatsIntra docsEntrada(DocsEntradaRDTO docsEntrada) {
    this.docsEntrada = docsEntrada;
    return this;
  }

   /**
   * Get docsEntrada
   * @return docsEntrada
  **/
  @ApiModelProperty(value = "")
  public DocsEntradaRDTO getDocsEntrada() {
    return docsEntrada;
  }

  public void setDocsEntrada(DocsEntradaRDTO docsEntrada) {
    this.docsEntrada = docsEntrada;
  }

  public DocsAssociatsIntra idDocumentOriginal(BigDecimal idDocumentOriginal) {
    this.idDocumentOriginal = idDocumentOriginal;
    return this;
  }

   /**
   * Get idDocumentOriginal
   * @return idDocumentOriginal
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdDocumentOriginal() {
    return idDocumentOriginal;
  }

  public void setIdDocumentOriginal(BigDecimal idDocumentOriginal) {
    this.idDocumentOriginal = idDocumentOriginal;
  }

  public DocsAssociatsIntra idExpedientDestino(BigDecimal idExpedientDestino) {
    this.idExpedientDestino = idExpedientDestino;
    return this;
  }

   /**
   * Get idExpedientDestino
   * @return idExpedientDestino
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdExpedientDestino() {
    return idExpedientDestino;
  }

  public void setIdExpedientDestino(BigDecimal idExpedientDestino) {
    this.idExpedientDestino = idExpedientDestino;
  }

  public DocsAssociatsIntra idExpedientOrigen(BigDecimal idExpedientOrigen) {
    this.idExpedientOrigen = idExpedientOrigen;
    return this;
  }

   /**
   * Get idExpedientOrigen
   * @return idExpedientOrigen
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdExpedientOrigen() {
    return idExpedientOrigen;
  }

  public void setIdExpedientOrigen(BigDecimal idExpedientOrigen) {
    this.idExpedientOrigen = idExpedientOrigen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsAssociatsIntra docsAssociatsIntra = (DocsAssociatsIntra) o;
    return Objects.equals(this.docsEntrada, docsAssociatsIntra.docsEntrada) &&
        Objects.equals(this.idDocumentOriginal, docsAssociatsIntra.idDocumentOriginal) &&
        Objects.equals(this.idExpedientDestino, docsAssociatsIntra.idExpedientDestino) &&
        Objects.equals(this.idExpedientOrigen, docsAssociatsIntra.idExpedientOrigen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docsEntrada, idDocumentOriginal, idExpedientDestino, idExpedientOrigen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsAssociatsIntra {\n");
    
    sb.append("    docsEntrada: ").append(toIndentedString(docsEntrada)).append("\n");
    sb.append("    idDocumentOriginal: ").append(toIndentedString(idDocumentOriginal)).append("\n");
    sb.append("    idExpedientDestino: ").append(toIndentedString(idExpedientDestino)).append("\n");
    sb.append("    idExpedientOrigen: ").append(toIndentedString(idExpedientOrigen)).append("\n");
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
