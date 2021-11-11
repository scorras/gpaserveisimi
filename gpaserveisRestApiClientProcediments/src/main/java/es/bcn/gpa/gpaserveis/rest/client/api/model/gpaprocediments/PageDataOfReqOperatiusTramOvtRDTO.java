/*
 * API gpaprocediments
 * API gpaprocediments
 *
 * OpenAPI spec version: 2.10.1
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.PaginationAttributes;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ReqOperatiusTramOvtRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.SortInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PageDataOfReqOperatiusTramOvtRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-08T16:49:56.830+01:00")
public class PageDataOfReqOperatiusTramOvtRDTO {
  @JsonProperty("data")
  private List<ReqOperatiusTramOvtRDTO> data = null;

  @JsonProperty("page")
  private PaginationAttributes page = null;

  @JsonProperty("sortInfo")
  private SortInfo sortInfo = null;

  public PageDataOfReqOperatiusTramOvtRDTO data(List<ReqOperatiusTramOvtRDTO> data) {
    this.data = data;
    return this;
  }

  public PageDataOfReqOperatiusTramOvtRDTO addDataItem(ReqOperatiusTramOvtRDTO dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<ReqOperatiusTramOvtRDTO>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<ReqOperatiusTramOvtRDTO> getData() {
    return data;
  }

  public void setData(List<ReqOperatiusTramOvtRDTO> data) {
    this.data = data;
  }

  public PageDataOfReqOperatiusTramOvtRDTO page(PaginationAttributes page) {
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

  public PageDataOfReqOperatiusTramOvtRDTO sortInfo(SortInfo sortInfo) {
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
    PageDataOfReqOperatiusTramOvtRDTO pageDataOfReqOperatiusTramOvtRDTO = (PageDataOfReqOperatiusTramOvtRDTO) o;
    return Objects.equals(this.data, pageDataOfReqOperatiusTramOvtRDTO.data) &&
        Objects.equals(this.page, pageDataOfReqOperatiusTramOvtRDTO.page) &&
        Objects.equals(this.sortInfo, pageDataOfReqOperatiusTramOvtRDTO.sortInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, page, sortInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageDataOfReqOperatiusTramOvtRDTO {\n");
    
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

