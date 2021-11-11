/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 2.10.0
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
 * DocsEntActualizarRegistre
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-04T14:21:11.408+01:00")
public class DocsEntActualizarRegistre {
  @JsonProperty("idRegistre")
  private BigDecimal idRegistre = null;

  @JsonProperty("listIdsDocsEnt")
  private List<BigDecimal> listIdsDocsEnt = null;

  public DocsEntActualizarRegistre idRegistre(BigDecimal idRegistre) {
    this.idRegistre = idRegistre;
    return this;
  }

   /**
   * Identificador del registre
   * @return idRegistre
  **/
  @ApiModelProperty(value = "Identificador del registre")
  public BigDecimal getIdRegistre() {
    return idRegistre;
  }

  public void setIdRegistre(BigDecimal idRegistre) {
    this.idRegistre = idRegistre;
  }

  public DocsEntActualizarRegistre listIdsDocsEnt(List<BigDecimal> listIdsDocsEnt) {
    this.listIdsDocsEnt = listIdsDocsEnt;
    return this;
  }

  public DocsEntActualizarRegistre addListIdsDocsEntItem(BigDecimal listIdsDocsEntItem) {
    if (this.listIdsDocsEnt == null) {
      this.listIdsDocsEnt = new ArrayList<BigDecimal>();
    }
    this.listIdsDocsEnt.add(listIdsDocsEntItem);
    return this;
  }

   /**
   * Llista de documents d&#39;entrada
   * @return listIdsDocsEnt
  **/
  @ApiModelProperty(value = "Llista de documents d'entrada")
  public List<BigDecimal> getListIdsDocsEnt() {
    return listIdsDocsEnt;
  }

  public void setListIdsDocsEnt(List<BigDecimal> listIdsDocsEnt) {
    this.listIdsDocsEnt = listIdsDocsEnt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsEntActualizarRegistre docsEntActualizarRegistre = (DocsEntActualizarRegistre) o;
    return Objects.equals(this.idRegistre, docsEntActualizarRegistre.idRegistre) &&
        Objects.equals(this.listIdsDocsEnt, docsEntActualizarRegistre.listIdsDocsEnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idRegistre, listIdsDocsEnt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsEntActualizarRegistre {\n");
    
    sb.append("    idRegistre: ").append(toIndentedString(idRegistre)).append("\n");
    sb.append("    listIdsDocsEnt: ").append(toIndentedString(listIdsDocsEnt)).append("\n");
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

