/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.7.0
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
 * DocsTramitacioIdsAndEstatFinalId
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-26T12:10:29.973+01:00")
public class DocsTramitacioIdsAndEstatFinalId {
  @JsonProperty("docsTramitacioIds")
  private List<BigDecimal> docsTramitacioIds = null;

  @JsonProperty("estatActualDesc")
  private String estatActualDesc = null;

  @JsonProperty("estatActualId")
  private BigDecimal estatActualId = null;

  @JsonProperty("estatFinalDesc")
  private String estatFinalDesc = null;

  @JsonProperty("estatFinalId")
  private BigDecimal estatFinalId = null;

  @JsonProperty("expedientId")
  private BigDecimal expedientId = null;

  public DocsTramitacioIdsAndEstatFinalId docsTramitacioIds(List<BigDecimal> docsTramitacioIds) {
    this.docsTramitacioIds = docsTramitacioIds;
    return this;
  }

  public DocsTramitacioIdsAndEstatFinalId addDocsTramitacioIdsItem(BigDecimal docsTramitacioIdsItem) {
    if (this.docsTramitacioIds == null) {
      this.docsTramitacioIds = new ArrayList<BigDecimal>();
    }
    this.docsTramitacioIds.add(docsTramitacioIdsItem);
    return this;
  }

   /**
   * Get docsTramitacioIds
   * @return docsTramitacioIds
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getDocsTramitacioIds() {
    return docsTramitacioIds;
  }

  public void setDocsTramitacioIds(List<BigDecimal> docsTramitacioIds) {
    this.docsTramitacioIds = docsTramitacioIds;
  }

  public DocsTramitacioIdsAndEstatFinalId estatActualDesc(String estatActualDesc) {
    this.estatActualDesc = estatActualDesc;
    return this;
  }

   /**
   * Get estatActualDesc
   * @return estatActualDesc
  **/
  @ApiModelProperty(value = "")
  public String getEstatActualDesc() {
    return estatActualDesc;
  }

  public void setEstatActualDesc(String estatActualDesc) {
    this.estatActualDesc = estatActualDesc;
  }

  public DocsTramitacioIdsAndEstatFinalId estatActualId(BigDecimal estatActualId) {
    this.estatActualId = estatActualId;
    return this;
  }

   /**
   * Get estatActualId
   * @return estatActualId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatActualId() {
    return estatActualId;
  }

  public void setEstatActualId(BigDecimal estatActualId) {
    this.estatActualId = estatActualId;
  }

  public DocsTramitacioIdsAndEstatFinalId estatFinalDesc(String estatFinalDesc) {
    this.estatFinalDesc = estatFinalDesc;
    return this;
  }

   /**
   * Get estatFinalDesc
   * @return estatFinalDesc
  **/
  @ApiModelProperty(value = "")
  public String getEstatFinalDesc() {
    return estatFinalDesc;
  }

  public void setEstatFinalDesc(String estatFinalDesc) {
    this.estatFinalDesc = estatFinalDesc;
  }

  public DocsTramitacioIdsAndEstatFinalId estatFinalId(BigDecimal estatFinalId) {
    this.estatFinalId = estatFinalId;
    return this;
  }

   /**
   * Get estatFinalId
   * @return estatFinalId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatFinalId() {
    return estatFinalId;
  }

  public void setEstatFinalId(BigDecimal estatFinalId) {
    this.estatFinalId = estatFinalId;
  }

  public DocsTramitacioIdsAndEstatFinalId expedientId(BigDecimal expedientId) {
    this.expedientId = expedientId;
    return this;
  }

   /**
   * Get expedientId
   * @return expedientId
  **/
  @ApiModelProperty(value = "")
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
    DocsTramitacioIdsAndEstatFinalId docsTramitacioIdsAndEstatFinalId = (DocsTramitacioIdsAndEstatFinalId) o;
    return Objects.equals(this.docsTramitacioIds, docsTramitacioIdsAndEstatFinalId.docsTramitacioIds) &&
        Objects.equals(this.estatActualDesc, docsTramitacioIdsAndEstatFinalId.estatActualDesc) &&
        Objects.equals(this.estatActualId, docsTramitacioIdsAndEstatFinalId.estatActualId) &&
        Objects.equals(this.estatFinalDesc, docsTramitacioIdsAndEstatFinalId.estatFinalDesc) &&
        Objects.equals(this.estatFinalId, docsTramitacioIdsAndEstatFinalId.estatFinalId) &&
        Objects.equals(this.expedientId, docsTramitacioIdsAndEstatFinalId.expedientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docsTramitacioIds, estatActualDesc, estatActualId, estatFinalDesc, estatFinalId, expedientId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsTramitacioIdsAndEstatFinalId {\n");
    
    sb.append("    docsTramitacioIds: ").append(toIndentedString(docsTramitacioIds)).append("\n");
    sb.append("    estatActualDesc: ").append(toIndentedString(estatActualDesc)).append("\n");
    sb.append("    estatActualId: ").append(toIndentedString(estatActualId)).append("\n");
    sb.append("    estatFinalDesc: ").append(toIndentedString(estatFinalDesc)).append("\n");
    sb.append("    estatFinalId: ").append(toIndentedString(estatFinalId)).append("\n");
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

