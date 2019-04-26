/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.10.0
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * DadesEspecifiquesValors
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T19:08:33.527+02:00")
public class DadesEspecifiquesValors {
  @JsonProperty("dadesEspecifiques")
  private BigDecimal dadesEspecifiques = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("notEmpty")
  private Boolean notEmpty = null;

  @JsonProperty("valorBoolean")
  private Integer valorBoolean = null;

  @JsonProperty("valorCalendar")
  private DateTime valorCalendar = null;

  @JsonProperty("valorClob")
  private String valorClob = null;

  @JsonProperty("valorDouble")
  private Double valorDouble = null;

  @JsonProperty("valorInteger")
  private Long valorInteger = null;

  @JsonProperty("valorListaMultiple")
  private Integer valorListaMultiple = null;

  @JsonProperty("valorListaMultipleList")
  private List<Integer> valorListaMultipleList = null;

  @JsonProperty("valorListaSimple")
  private Integer valorListaSimple = null;

  @JsonProperty("valorMoneda")
  private Double valorMoneda = null;

  @JsonProperty("valorMunicipi")
  private String valorMunicipi = null;

  @JsonProperty("valorPais")
  private String valorPais = null;

  @JsonProperty("valorProvincia")
  private String valorProvincia = null;

  @JsonProperty("valorString")
  private String valorString = null;

  public DadesEspecifiquesValors dadesEspecifiques(BigDecimal dadesEspecifiques) {
    this.dadesEspecifiques = dadesEspecifiques;
    return this;
  }

   /**
   * Get dadesEspecifiques
   * @return dadesEspecifiques
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDadesEspecifiques() {
    return dadesEspecifiques;
  }

  public void setDadesEspecifiques(BigDecimal dadesEspecifiques) {
    this.dadesEspecifiques = dadesEspecifiques;
  }

  public DadesEspecifiquesValors id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public DadesEspecifiquesValors notEmpty(Boolean notEmpty) {
    this.notEmpty = notEmpty;
    return this;
  }

   /**
   * Get notEmpty
   * @return notEmpty
  **/
  @ApiModelProperty(value = "")
  public Boolean isNotEmpty() {
    return notEmpty;
  }

  public void setNotEmpty(Boolean notEmpty) {
    this.notEmpty = notEmpty;
  }

  public DadesEspecifiquesValors valorBoolean(Integer valorBoolean) {
    this.valorBoolean = valorBoolean;
    return this;
  }

   /**
   * Get valorBoolean
   * @return valorBoolean
  **/
  @ApiModelProperty(value = "")
  public Integer getValorBoolean() {
    return valorBoolean;
  }

  public void setValorBoolean(Integer valorBoolean) {
    this.valorBoolean = valorBoolean;
  }

  public DadesEspecifiquesValors valorCalendar(DateTime valorCalendar) {
    this.valorCalendar = valorCalendar;
    return this;
  }

   /**
   * Get valorCalendar
   * @return valorCalendar
  **/
  @ApiModelProperty(value = "")
  public DateTime getValorCalendar() {
    return valorCalendar;
  }

  public void setValorCalendar(DateTime valorCalendar) {
    this.valorCalendar = valorCalendar;
  }

  public DadesEspecifiquesValors valorClob(String valorClob) {
    this.valorClob = valorClob;
    return this;
  }

   /**
   * Get valorClob
   * @return valorClob
  **/
  @ApiModelProperty(value = "")
  public String getValorClob() {
    return valorClob;
  }

  public void setValorClob(String valorClob) {
    this.valorClob = valorClob;
  }

  public DadesEspecifiquesValors valorDouble(Double valorDouble) {
    this.valorDouble = valorDouble;
    return this;
  }

   /**
   * Get valorDouble
   * @return valorDouble
  **/
  @ApiModelProperty(value = "")
  public Double getValorDouble() {
    return valorDouble;
  }

  public void setValorDouble(Double valorDouble) {
    this.valorDouble = valorDouble;
  }

  public DadesEspecifiquesValors valorInteger(Long valorInteger) {
    this.valorInteger = valorInteger;
    return this;
  }

   /**
   * Get valorInteger
   * @return valorInteger
  **/
  @ApiModelProperty(value = "")
  public Long getValorInteger() {
    return valorInteger;
  }

  public void setValorInteger(Long valorInteger) {
    this.valorInteger = valorInteger;
  }

  public DadesEspecifiquesValors valorListaMultiple(Integer valorListaMultiple) {
    this.valorListaMultiple = valorListaMultiple;
    return this;
  }

   /**
   * Get valorListaMultiple
   * @return valorListaMultiple
  **/
  @ApiModelProperty(value = "")
  public Integer getValorListaMultiple() {
    return valorListaMultiple;
  }

  public void setValorListaMultiple(Integer valorListaMultiple) {
    this.valorListaMultiple = valorListaMultiple;
  }

  public DadesEspecifiquesValors valorListaMultipleList(List<Integer> valorListaMultipleList) {
    this.valorListaMultipleList = valorListaMultipleList;
    return this;
  }

  public DadesEspecifiquesValors addValorListaMultipleListItem(Integer valorListaMultipleListItem) {
    if (this.valorListaMultipleList == null) {
      this.valorListaMultipleList = new ArrayList<Integer>();
    }
    this.valorListaMultipleList.add(valorListaMultipleListItem);
    return this;
  }

   /**
   * Get valorListaMultipleList
   * @return valorListaMultipleList
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getValorListaMultipleList() {
    return valorListaMultipleList;
  }

  public void setValorListaMultipleList(List<Integer> valorListaMultipleList) {
    this.valorListaMultipleList = valorListaMultipleList;
  }

  public DadesEspecifiquesValors valorListaSimple(Integer valorListaSimple) {
    this.valorListaSimple = valorListaSimple;
    return this;
  }

   /**
   * Get valorListaSimple
   * @return valorListaSimple
  **/
  @ApiModelProperty(value = "")
  public Integer getValorListaSimple() {
    return valorListaSimple;
  }

  public void setValorListaSimple(Integer valorListaSimple) {
    this.valorListaSimple = valorListaSimple;
  }

  public DadesEspecifiquesValors valorMoneda(Double valorMoneda) {
    this.valorMoneda = valorMoneda;
    return this;
  }

   /**
   * Get valorMoneda
   * @return valorMoneda
  **/
  @ApiModelProperty(value = "")
  public Double getValorMoneda() {
    return valorMoneda;
  }

  public void setValorMoneda(Double valorMoneda) {
    this.valorMoneda = valorMoneda;
  }

  public DadesEspecifiquesValors valorMunicipi(String valorMunicipi) {
    this.valorMunicipi = valorMunicipi;
    return this;
  }

   /**
   * Get valorMunicipi
   * @return valorMunicipi
  **/
  @ApiModelProperty(value = "")
  public String getValorMunicipi() {
    return valorMunicipi;
  }

  public void setValorMunicipi(String valorMunicipi) {
    this.valorMunicipi = valorMunicipi;
  }

  public DadesEspecifiquesValors valorPais(String valorPais) {
    this.valorPais = valorPais;
    return this;
  }

   /**
   * Get valorPais
   * @return valorPais
  **/
  @ApiModelProperty(value = "")
  public String getValorPais() {
    return valorPais;
  }

  public void setValorPais(String valorPais) {
    this.valorPais = valorPais;
  }

  public DadesEspecifiquesValors valorProvincia(String valorProvincia) {
    this.valorProvincia = valorProvincia;
    return this;
  }

   /**
   * Get valorProvincia
   * @return valorProvincia
  **/
  @ApiModelProperty(value = "")
  public String getValorProvincia() {
    return valorProvincia;
  }

  public void setValorProvincia(String valorProvincia) {
    this.valorProvincia = valorProvincia;
  }

  public DadesEspecifiquesValors valorString(String valorString) {
    this.valorString = valorString;
    return this;
  }

   /**
   * Get valorString
   * @return valorString
  **/
  @ApiModelProperty(value = "")
  public String getValorString() {
    return valorString;
  }

  public void setValorString(String valorString) {
    this.valorString = valorString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadesEspecifiquesValors dadesEspecifiquesValors = (DadesEspecifiquesValors) o;
    return Objects.equals(this.dadesEspecifiques, dadesEspecifiquesValors.dadesEspecifiques) &&
        Objects.equals(this.id, dadesEspecifiquesValors.id) &&
        Objects.equals(this.notEmpty, dadesEspecifiquesValors.notEmpty) &&
        Objects.equals(this.valorBoolean, dadesEspecifiquesValors.valorBoolean) &&
        Objects.equals(this.valorCalendar, dadesEspecifiquesValors.valorCalendar) &&
        Objects.equals(this.valorClob, dadesEspecifiquesValors.valorClob) &&
        Objects.equals(this.valorDouble, dadesEspecifiquesValors.valorDouble) &&
        Objects.equals(this.valorInteger, dadesEspecifiquesValors.valorInteger) &&
        Objects.equals(this.valorListaMultiple, dadesEspecifiquesValors.valorListaMultiple) &&
        Objects.equals(this.valorListaMultipleList, dadesEspecifiquesValors.valorListaMultipleList) &&
        Objects.equals(this.valorListaSimple, dadesEspecifiquesValors.valorListaSimple) &&
        Objects.equals(this.valorMoneda, dadesEspecifiquesValors.valorMoneda) &&
        Objects.equals(this.valorMunicipi, dadesEspecifiquesValors.valorMunicipi) &&
        Objects.equals(this.valorPais, dadesEspecifiquesValors.valorPais) &&
        Objects.equals(this.valorProvincia, dadesEspecifiquesValors.valorProvincia) &&
        Objects.equals(this.valorString, dadesEspecifiquesValors.valorString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dadesEspecifiques, id, notEmpty, valorBoolean, valorCalendar, valorClob, valorDouble, valorInteger, valorListaMultiple, valorListaMultipleList, valorListaSimple, valorMoneda, valorMunicipi, valorPais, valorProvincia, valorString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadesEspecifiquesValors {\n");
    
    sb.append("    dadesEspecifiques: ").append(toIndentedString(dadesEspecifiques)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notEmpty: ").append(toIndentedString(notEmpty)).append("\n");
    sb.append("    valorBoolean: ").append(toIndentedString(valorBoolean)).append("\n");
    sb.append("    valorCalendar: ").append(toIndentedString(valorCalendar)).append("\n");
    sb.append("    valorClob: ").append(toIndentedString(valorClob)).append("\n");
    sb.append("    valorDouble: ").append(toIndentedString(valorDouble)).append("\n");
    sb.append("    valorInteger: ").append(toIndentedString(valorInteger)).append("\n");
    sb.append("    valorListaMultiple: ").append(toIndentedString(valorListaMultiple)).append("\n");
    sb.append("    valorListaMultipleList: ").append(toIndentedString(valorListaMultipleList)).append("\n");
    sb.append("    valorListaSimple: ").append(toIndentedString(valorListaSimple)).append("\n");
    sb.append("    valorMoneda: ").append(toIndentedString(valorMoneda)).append("\n");
    sb.append("    valorMunicipi: ").append(toIndentedString(valorMunicipi)).append("\n");
    sb.append("    valorPais: ").append(toIndentedString(valorPais)).append("\n");
    sb.append("    valorProvincia: ").append(toIndentedString(valorProvincia)).append("\n");
    sb.append("    valorString: ").append(toIndentedString(valorString)).append("\n");
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

