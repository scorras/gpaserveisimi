/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.17.0
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
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentRevisio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T13:30:08.356+01:00")
public class DocumentRevisio {
  @JsonProperty("codiExpedient")
  private String codiExpedient = null;

  @JsonProperty("docsEntradaIds")
  private List<BigDecimal> docsEntradaIds = null;

  @JsonProperty("estatRevisioId")
  private Integer estatRevisioId = null;

  @JsonProperty("expedientId")
  private BigDecimal expedientId = null;

  public DocumentRevisio codiExpedient(String codiExpedient) {
    this.codiExpedient = codiExpedient;
    return this;
  }

   /**
   * Codi de l&#39;expedient
   * @return codiExpedient
  **/
  @ApiModelProperty(value = "Codi de l'expedient")
  public String getCodiExpedient() {
    return codiExpedient;
  }

  public void setCodiExpedient(String codiExpedient) {
    this.codiExpedient = codiExpedient;
  }

  public DocumentRevisio docsEntradaIds(List<BigDecimal> docsEntradaIds) {
    this.docsEntradaIds = docsEntradaIds;
    return this;
  }

  public DocumentRevisio addDocsEntradaIdsItem(BigDecimal docsEntradaIdsItem) {
    if (this.docsEntradaIds == null) {
      this.docsEntradaIds = new ArrayList<BigDecimal>();
    }
    this.docsEntradaIds.add(docsEntradaIdsItem);
    return this;
  }

   /**
   * Llista d&#39;identificadors de document
   * @return docsEntradaIds
  **/
  @ApiModelProperty(value = "Llista d'identificadors de document")
  public List<BigDecimal> getDocsEntradaIds() {
    return docsEntradaIds;
  }

  public void setDocsEntradaIds(List<BigDecimal> docsEntradaIds) {
    this.docsEntradaIds = docsEntradaIds;
  }

  public DocumentRevisio estatRevisioId(Integer estatRevisioId) {
    this.estatRevisioId = estatRevisioId;
    return this;
  }

   /**
   * Identificador de l&#39;estat de revisió
   * @return estatRevisioId
  **/
  @ApiModelProperty(value = "Identificador de l'estat de revisió")
  public Integer getEstatRevisioId() {
    return estatRevisioId;
  }

  public void setEstatRevisioId(Integer estatRevisioId) {
    this.estatRevisioId = estatRevisioId;
  }

  public DocumentRevisio expedientId(BigDecimal expedientId) {
    this.expedientId = expedientId;
    return this;
  }

   /**
   * Identificador de l&#39;expedient
   * @return expedientId
  **/
  @ApiModelProperty(value = "Identificador de l'expedient")
  public BigDecimal getExpedientId() {
    return expedientId;
  }

  public void setExpedientId(BigDecimal expedientId) {
    this.expedientId = expedientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentRevisio documentRevisio = (DocumentRevisio) o;
    return Objects.equals(this.codiExpedient, documentRevisio.codiExpedient) &&
        Objects.equals(this.docsEntradaIds, documentRevisio.docsEntradaIds) &&
        Objects.equals(this.estatRevisioId, documentRevisio.estatRevisioId) &&
        Objects.equals(this.expedientId, documentRevisio.expedientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiExpedient, docsEntradaIds, estatRevisioId, expedientId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentRevisio {\n");
    
    sb.append("    codiExpedient: ").append(toIndentedString(codiExpedient)).append("\n");
    sb.append("    docsEntradaIds: ").append(toIndentedString(docsEntradaIds)).append("\n");
    sb.append("    estatRevisioId: ").append(toIndentedString(estatRevisioId)).append("\n");
    sb.append("    expedientId: ").append(toIndentedString(expedientId)).append("\n");
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

