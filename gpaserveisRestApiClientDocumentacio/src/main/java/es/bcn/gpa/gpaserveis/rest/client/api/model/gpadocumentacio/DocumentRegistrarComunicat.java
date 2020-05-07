/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.21.0
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
import org.joda.time.DateTime;

/**
 * DocumentRegistrarComunicat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T16:15:12.475+02:00")
public class DocumentRegistrarComunicat {
  @JsonProperty("canalComunicat")
  private BigDecimal canalComunicat = null;

  @JsonProperty("dataComunicat")
  private DateTime dataComunicat = null;

  @JsonProperty("docsTramitacioId")
  private BigDecimal docsTramitacioId = null;

  @JsonProperty("missatgeComunicat")
  private String missatgeComunicat = null;

  public DocumentRegistrarComunicat canalComunicat(BigDecimal canalComunicat) {
    this.canalComunicat = canalComunicat;
    return this;
  }

   /**
   * identificador del canal de comunicació
   * @return canalComunicat
  **/
  @ApiModelProperty(value = "identificador del canal de comunicació")
  public BigDecimal getCanalComunicat() {
    return canalComunicat;
  }

  public void setCanalComunicat(BigDecimal canalComunicat) {
    this.canalComunicat = canalComunicat;
  }

  public DocumentRegistrarComunicat dataComunicat(DateTime dataComunicat) {
    this.dataComunicat = dataComunicat;
    return this;
  }

   /**
   * Data del comunicat
   * @return dataComunicat
  **/
  @ApiModelProperty(value = "Data del comunicat")
  public DateTime getDataComunicat() {
    return dataComunicat;
  }

  public void setDataComunicat(DateTime dataComunicat) {
    this.dataComunicat = dataComunicat;
  }

  public DocumentRegistrarComunicat docsTramitacioId(BigDecimal docsTramitacioId) {
    this.docsTramitacioId = docsTramitacioId;
    return this;
  }

   /**
   * identificador del document de tramitació
   * @return docsTramitacioId
  **/
  @ApiModelProperty(value = "identificador del document de tramitació")
  public BigDecimal getDocsTramitacioId() {
    return docsTramitacioId;
  }

  public void setDocsTramitacioId(BigDecimal docsTramitacioId) {
    this.docsTramitacioId = docsTramitacioId;
  }

  public DocumentRegistrarComunicat missatgeComunicat(String missatgeComunicat) {
    this.missatgeComunicat = missatgeComunicat;
    return this;
  }

   /**
   * Missatge del comunicat
   * @return missatgeComunicat
  **/
  @ApiModelProperty(value = "Missatge del comunicat")
  public String getMissatgeComunicat() {
    return missatgeComunicat;
  }

  public void setMissatgeComunicat(String missatgeComunicat) {
    this.missatgeComunicat = missatgeComunicat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentRegistrarComunicat documentRegistrarComunicat = (DocumentRegistrarComunicat) o;
    return Objects.equals(this.canalComunicat, documentRegistrarComunicat.canalComunicat) &&
        Objects.equals(this.dataComunicat, documentRegistrarComunicat.dataComunicat) &&
        Objects.equals(this.docsTramitacioId, documentRegistrarComunicat.docsTramitacioId) &&
        Objects.equals(this.missatgeComunicat, documentRegistrarComunicat.missatgeComunicat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canalComunicat, dataComunicat, docsTramitacioId, missatgeComunicat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentRegistrarComunicat {\n");
    
    sb.append("    canalComunicat: ").append(toIndentedString(canalComunicat)).append("\n");
    sb.append("    dataComunicat: ").append(toIndentedString(dataComunicat)).append("\n");
    sb.append("    docsTramitacioId: ").append(toIndentedString(docsTramitacioId)).append("\n");
    sb.append("    missatgeComunicat: ").append(toIndentedString(missatgeComunicat)).append("\n");
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

