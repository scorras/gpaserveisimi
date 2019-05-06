/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.11.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfiguracioDocsEntradaRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.PaginationAttributes;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.SortInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PageDataOfConfiguracioDocsEntradaRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T11:28:11.327+02:00")
public class PageDataOfConfiguracioDocsEntradaRDTO {
  @JsonProperty("data")
  private List<ConfiguracioDocsEntradaRDTO> data = null;

  @JsonProperty("page")
  private PaginationAttributes page = null;

  @JsonProperty("sortInfo")
  private SortInfo sortInfo = null;

  public PageDataOfConfiguracioDocsEntradaRDTO data(List<ConfiguracioDocsEntradaRDTO> data) {
    this.data = data;
    return this;
  }

  public PageDataOfConfiguracioDocsEntradaRDTO addDataItem(ConfiguracioDocsEntradaRDTO dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<ConfiguracioDocsEntradaRDTO>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<ConfiguracioDocsEntradaRDTO> getData() {
    return data;
  }

  public void setData(List<ConfiguracioDocsEntradaRDTO> data) {
    this.data = data;
  }

  public PageDataOfConfiguracioDocsEntradaRDTO page(PaginationAttributes page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public PaginationAttributes getPage() {
    return page;
  }

  public void setPage(PaginationAttributes page) {
    this.page = page;
  }

  public PageDataOfConfiguracioDocsEntradaRDTO sortInfo(SortInfo sortInfo) {
    this.sortInfo = sortInfo;
    return this;
  }

   /**
   * Get sortInfo
   * @return sortInfo
  **/
  @ApiModelProperty(value = "")
  public SortInfo getSortInfo() {
    return sortInfo;
  }

  public void setSortInfo(SortInfo sortInfo) {
    this.sortInfo = sortInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageDataOfConfiguracioDocsEntradaRDTO pageDataOfConfiguracioDocsEntradaRDTO = (PageDataOfConfiguracioDocsEntradaRDTO) o;
    return Objects.equals(this.data, pageDataOfConfiguracioDocsEntradaRDTO.data) &&
        Objects.equals(this.page, pageDataOfConfiguracioDocsEntradaRDTO.page) &&
        Objects.equals(this.sortInfo, pageDataOfConfiguracioDocsEntradaRDTO.sortInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, page, sortInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageDataOfConfiguracioDocsEntradaRDTO {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sortInfo: ").append(toIndentedString(sortInfo)).append("\n");
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

