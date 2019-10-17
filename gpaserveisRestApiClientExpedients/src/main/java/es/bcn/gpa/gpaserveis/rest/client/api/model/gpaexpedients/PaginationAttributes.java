/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.15.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaginationAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-17T09:06:51.509+02:00")
public class PaginationAttributes {
  @JsonProperty("absoluteRowNumberOfFirstRowInCurrentPage")
  private Integer absoluteRowNumberOfFirstRowInCurrentPage = null;

  @JsonProperty("absoluteRowNumberOfLastRowInCurrentPage")
  private Integer absoluteRowNumberOfLastRowInCurrentPage = null;

  @JsonProperty("currentPageHasNextPage")
  private Boolean currentPageHasNextPage = null;

  @JsonProperty("currentPageHasPreviousPage")
  private Boolean currentPageHasPreviousPage = null;

  @JsonProperty("currentPageIsFirstPage")
  private Boolean currentPageIsFirstPage = null;

  @JsonProperty("currentPageIsLastPage")
  private Boolean currentPageIsLastPage = null;

  @JsonProperty("currentPageNumber")
  private Integer currentPageNumber = null;

  @JsonProperty("nextPageNumber")
  private Integer nextPageNumber = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("previousPageNumber")
  private Integer previousPageNumber = null;

  @JsonProperty("totalElements")
  private Long totalElements = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  public PaginationAttributes absoluteRowNumberOfFirstRowInCurrentPage(Integer absoluteRowNumberOfFirstRowInCurrentPage) {
    this.absoluteRowNumberOfFirstRowInCurrentPage = absoluteRowNumberOfFirstRowInCurrentPage;
    return this;
  }

   /**
   * Get absoluteRowNumberOfFirstRowInCurrentPage
   * @return absoluteRowNumberOfFirstRowInCurrentPage
  **/
  @ApiModelProperty(value = "")
  public Integer getAbsoluteRowNumberOfFirstRowInCurrentPage() {
    return absoluteRowNumberOfFirstRowInCurrentPage;
  }

  public void setAbsoluteRowNumberOfFirstRowInCurrentPage(Integer absoluteRowNumberOfFirstRowInCurrentPage) {
    this.absoluteRowNumberOfFirstRowInCurrentPage = absoluteRowNumberOfFirstRowInCurrentPage;
  }

  public PaginationAttributes absoluteRowNumberOfLastRowInCurrentPage(Integer absoluteRowNumberOfLastRowInCurrentPage) {
    this.absoluteRowNumberOfLastRowInCurrentPage = absoluteRowNumberOfLastRowInCurrentPage;
    return this;
  }

   /**
   * Get absoluteRowNumberOfLastRowInCurrentPage
   * @return absoluteRowNumberOfLastRowInCurrentPage
  **/
  @ApiModelProperty(value = "")
  public Integer getAbsoluteRowNumberOfLastRowInCurrentPage() {
    return absoluteRowNumberOfLastRowInCurrentPage;
  }

  public void setAbsoluteRowNumberOfLastRowInCurrentPage(Integer absoluteRowNumberOfLastRowInCurrentPage) {
    this.absoluteRowNumberOfLastRowInCurrentPage = absoluteRowNumberOfLastRowInCurrentPage;
  }

  public PaginationAttributes currentPageHasNextPage(Boolean currentPageHasNextPage) {
    this.currentPageHasNextPage = currentPageHasNextPage;
    return this;
  }

   /**
   * Get currentPageHasNextPage
   * @return currentPageHasNextPage
  **/
  @ApiModelProperty(value = "")
  public Boolean isCurrentPageHasNextPage() {
    return currentPageHasNextPage;
  }

  public void setCurrentPageHasNextPage(Boolean currentPageHasNextPage) {
    this.currentPageHasNextPage = currentPageHasNextPage;
  }

  public PaginationAttributes currentPageHasPreviousPage(Boolean currentPageHasPreviousPage) {
    this.currentPageHasPreviousPage = currentPageHasPreviousPage;
    return this;
  }

   /**
   * Get currentPageHasPreviousPage
   * @return currentPageHasPreviousPage
  **/
  @ApiModelProperty(value = "")
  public Boolean isCurrentPageHasPreviousPage() {
    return currentPageHasPreviousPage;
  }

  public void setCurrentPageHasPreviousPage(Boolean currentPageHasPreviousPage) {
    this.currentPageHasPreviousPage = currentPageHasPreviousPage;
  }

  public PaginationAttributes currentPageIsFirstPage(Boolean currentPageIsFirstPage) {
    this.currentPageIsFirstPage = currentPageIsFirstPage;
    return this;
  }

   /**
   * Get currentPageIsFirstPage
   * @return currentPageIsFirstPage
  **/
  @ApiModelProperty(value = "")
  public Boolean isCurrentPageIsFirstPage() {
    return currentPageIsFirstPage;
  }

  public void setCurrentPageIsFirstPage(Boolean currentPageIsFirstPage) {
    this.currentPageIsFirstPage = currentPageIsFirstPage;
  }

  public PaginationAttributes currentPageIsLastPage(Boolean currentPageIsLastPage) {
    this.currentPageIsLastPage = currentPageIsLastPage;
    return this;
  }

   /**
   * Get currentPageIsLastPage
   * @return currentPageIsLastPage
  **/
  @ApiModelProperty(value = "")
  public Boolean isCurrentPageIsLastPage() {
    return currentPageIsLastPage;
  }

  public void setCurrentPageIsLastPage(Boolean currentPageIsLastPage) {
    this.currentPageIsLastPage = currentPageIsLastPage;
  }

  public PaginationAttributes currentPageNumber(Integer currentPageNumber) {
    this.currentPageNumber = currentPageNumber;
    return this;
  }

   /**
   * Get currentPageNumber
   * @return currentPageNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getCurrentPageNumber() {
    return currentPageNumber;
  }

  public void setCurrentPageNumber(Integer currentPageNumber) {
    this.currentPageNumber = currentPageNumber;
  }

  public PaginationAttributes nextPageNumber(Integer nextPageNumber) {
    this.nextPageNumber = nextPageNumber;
    return this;
  }

   /**
   * Get nextPageNumber
   * @return nextPageNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getNextPageNumber() {
    return nextPageNumber;
  }

  public void setNextPageNumber(Integer nextPageNumber) {
    this.nextPageNumber = nextPageNumber;
  }

  public PaginationAttributes pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PaginationAttributes previousPageNumber(Integer previousPageNumber) {
    this.previousPageNumber = previousPageNumber;
    return this;
  }

   /**
   * Get previousPageNumber
   * @return previousPageNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getPreviousPageNumber() {
    return previousPageNumber;
  }

  public void setPreviousPageNumber(Integer previousPageNumber) {
    this.previousPageNumber = previousPageNumber;
  }

  public PaginationAttributes totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(value = "")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PaginationAttributes totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationAttributes paginationAttributes = (PaginationAttributes) o;
    return Objects.equals(this.absoluteRowNumberOfFirstRowInCurrentPage, paginationAttributes.absoluteRowNumberOfFirstRowInCurrentPage) &&
        Objects.equals(this.absoluteRowNumberOfLastRowInCurrentPage, paginationAttributes.absoluteRowNumberOfLastRowInCurrentPage) &&
        Objects.equals(this.currentPageHasNextPage, paginationAttributes.currentPageHasNextPage) &&
        Objects.equals(this.currentPageHasPreviousPage, paginationAttributes.currentPageHasPreviousPage) &&
        Objects.equals(this.currentPageIsFirstPage, paginationAttributes.currentPageIsFirstPage) &&
        Objects.equals(this.currentPageIsLastPage, paginationAttributes.currentPageIsLastPage) &&
        Objects.equals(this.currentPageNumber, paginationAttributes.currentPageNumber) &&
        Objects.equals(this.nextPageNumber, paginationAttributes.nextPageNumber) &&
        Objects.equals(this.pageSize, paginationAttributes.pageSize) &&
        Objects.equals(this.previousPageNumber, paginationAttributes.previousPageNumber) &&
        Objects.equals(this.totalElements, paginationAttributes.totalElements) &&
        Objects.equals(this.totalPages, paginationAttributes.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteRowNumberOfFirstRowInCurrentPage, absoluteRowNumberOfLastRowInCurrentPage, currentPageHasNextPage, currentPageHasPreviousPage, currentPageIsFirstPage, currentPageIsLastPage, currentPageNumber, nextPageNumber, pageSize, previousPageNumber, totalElements, totalPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationAttributes {\n");
    
    sb.append("    absoluteRowNumberOfFirstRowInCurrentPage: ").append(toIndentedString(absoluteRowNumberOfFirstRowInCurrentPage)).append("\n");
    sb.append("    absoluteRowNumberOfLastRowInCurrentPage: ").append(toIndentedString(absoluteRowNumberOfLastRowInCurrentPage)).append("\n");
    sb.append("    currentPageHasNextPage: ").append(toIndentedString(currentPageHasNextPage)).append("\n");
    sb.append("    currentPageHasPreviousPage: ").append(toIndentedString(currentPageHasPreviousPage)).append("\n");
    sb.append("    currentPageIsFirstPage: ").append(toIndentedString(currentPageIsFirstPage)).append("\n");
    sb.append("    currentPageIsLastPage: ").append(toIndentedString(currentPageIsLastPage)).append("\n");
    sb.append("    currentPageNumber: ").append(toIndentedString(currentPageNumber)).append("\n");
    sb.append("    nextPageNumber: ").append(toIndentedString(nextPageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    previousPageNumber: ").append(toIndentedString(previousPageNumber)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

