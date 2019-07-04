/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.13.1
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
 * ProcedimentSerieDocRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-03T21:35:26.370+02:00")
public class ProcedimentSerieDocRDTO {
  @JsonProperty("estatProcediment")
  private String estatProcediment = null;

  @JsonProperty("idConfDoc")
  private BigDecimal idConfDoc = null;

  @JsonProperty("idProcediment")
  private BigDecimal idProcediment = null;

  @JsonProperty("serieDocumental")
  private String serieDocumental = null;

  @JsonProperty("versioDocumental")
  private Integer versioDocumental = null;

  public ProcedimentSerieDocRDTO estatProcediment(String estatProcediment) {
    this.estatProcediment = estatProcediment;
    return this;
  }

   /**
   * Get estatProcediment
   * @return estatProcediment
  **/
  @ApiModelProperty(value = "")
  public String getEstatProcediment() {
    return estatProcediment;
  }

  public void setEstatProcediment(String estatProcediment) {
    this.estatProcediment = estatProcediment;
  }

  public ProcedimentSerieDocRDTO idConfDoc(BigDecimal idConfDoc) {
    this.idConfDoc = idConfDoc;
    return this;
  }

   /**
   * Get idConfDoc
   * @return idConfDoc
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdConfDoc() {
    return idConfDoc;
  }

  public void setIdConfDoc(BigDecimal idConfDoc) {
    this.idConfDoc = idConfDoc;
  }

  public ProcedimentSerieDocRDTO idProcediment(BigDecimal idProcediment) {
    this.idProcediment = idProcediment;
    return this;
  }

   /**
   * Get idProcediment
   * @return idProcediment
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdProcediment() {
    return idProcediment;
  }

  public void setIdProcediment(BigDecimal idProcediment) {
    this.idProcediment = idProcediment;
  }

  public ProcedimentSerieDocRDTO serieDocumental(String serieDocumental) {
    this.serieDocumental = serieDocumental;
    return this;
  }

   /**
   * Get serieDocumental
   * @return serieDocumental
  **/
  @ApiModelProperty(value = "")
  public String getSerieDocumental() {
    return serieDocumental;
  }

  public void setSerieDocumental(String serieDocumental) {
    this.serieDocumental = serieDocumental;
  }

  public ProcedimentSerieDocRDTO versioDocumental(Integer versioDocumental) {
    this.versioDocumental = versioDocumental;
    return this;
  }

   /**
   * Get versioDocumental
   * @return versioDocumental
  **/
  @ApiModelProperty(value = "")
  public Integer getVersioDocumental() {
    return versioDocumental;
  }

  public void setVersioDocumental(Integer versioDocumental) {
    this.versioDocumental = versioDocumental;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcedimentSerieDocRDTO procedimentSerieDocRDTO = (ProcedimentSerieDocRDTO) o;
    return Objects.equals(this.estatProcediment, procedimentSerieDocRDTO.estatProcediment) &&
        Objects.equals(this.idConfDoc, procedimentSerieDocRDTO.idConfDoc) &&
        Objects.equals(this.idProcediment, procedimentSerieDocRDTO.idProcediment) &&
        Objects.equals(this.serieDocumental, procedimentSerieDocRDTO.serieDocumental) &&
        Objects.equals(this.versioDocumental, procedimentSerieDocRDTO.versioDocumental);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estatProcediment, idConfDoc, idProcediment, serieDocumental, versioDocumental);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcedimentSerieDocRDTO {\n");
    
    sb.append("    estatProcediment: ").append(toIndentedString(estatProcediment)).append("\n");
    sb.append("    idConfDoc: ").append(toIndentedString(idConfDoc)).append("\n");
    sb.append("    idProcediment: ").append(toIndentedString(idProcediment)).append("\n");
    sb.append("    serieDocumental: ").append(toIndentedString(serieDocumental)).append("\n");
    sb.append("    versioDocumental: ").append(toIndentedString(versioDocumental)).append("\n");
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

