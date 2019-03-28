/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.8.0
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AcumularDocumentacioRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:34:53.129+01:00")
public class AcumularDocumentacioRDTO {
  @JsonProperty("docExpAcumulador")
  private BigDecimal docExpAcumulador = null;

  @JsonProperty("expAcumulatsMap")
  private Map<String, BigDecimal> expAcumulatsMap = null;

  @JsonProperty("idExpAcumulador")
  private BigDecimal idExpAcumulador = null;

  public AcumularDocumentacioRDTO docExpAcumulador(BigDecimal docExpAcumulador) {
    this.docExpAcumulador = docExpAcumulador;
    return this;
  }

   /**
   * Get docExpAcumulador
   * @return docExpAcumulador
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDocExpAcumulador() {
    return docExpAcumulador;
  }

  public void setDocExpAcumulador(BigDecimal docExpAcumulador) {
    this.docExpAcumulador = docExpAcumulador;
  }

  public AcumularDocumentacioRDTO expAcumulatsMap(Map<String, BigDecimal> expAcumulatsMap) {
    this.expAcumulatsMap = expAcumulatsMap;
    return this;
  }

  public AcumularDocumentacioRDTO putExpAcumulatsMapItem(String key, BigDecimal expAcumulatsMapItem) {
    if (this.expAcumulatsMap == null) {
      this.expAcumulatsMap = new HashMap<String, BigDecimal>();
    }
    this.expAcumulatsMap.put(key, expAcumulatsMapItem);
    return this;
  }

   /**
   * Get expAcumulatsMap
   * @return expAcumulatsMap
  **/
  @ApiModelProperty(value = "")
  public Map<String, BigDecimal> getExpAcumulatsMap() {
    return expAcumulatsMap;
  }

  public void setExpAcumulatsMap(Map<String, BigDecimal> expAcumulatsMap) {
    this.expAcumulatsMap = expAcumulatsMap;
  }

  public AcumularDocumentacioRDTO idExpAcumulador(BigDecimal idExpAcumulador) {
    this.idExpAcumulador = idExpAcumulador;
    return this;
  }

   /**
   * Get idExpAcumulador
   * @return idExpAcumulador
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdExpAcumulador() {
    return idExpAcumulador;
  }

  public void setIdExpAcumulador(BigDecimal idExpAcumulador) {
    this.idExpAcumulador = idExpAcumulador;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcumularDocumentacioRDTO acumularDocumentacioRDTO = (AcumularDocumentacioRDTO) o;
    return Objects.equals(this.docExpAcumulador, acumularDocumentacioRDTO.docExpAcumulador) &&
        Objects.equals(this.expAcumulatsMap, acumularDocumentacioRDTO.expAcumulatsMap) &&
        Objects.equals(this.idExpAcumulador, acumularDocumentacioRDTO.idExpAcumulador);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docExpAcumulador, expAcumulatsMap, idExpAcumulador);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcumularDocumentacioRDTO {\n");
    
    sb.append("    docExpAcumulador: ").append(toIndentedString(docExpAcumulador)).append("\n");
    sb.append("    expAcumulatsMap: ").append(toIndentedString(expAcumulatsMap)).append("\n");
    sb.append("    idExpAcumulador: ").append(toIndentedString(idExpAcumulador)).append("\n");
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

