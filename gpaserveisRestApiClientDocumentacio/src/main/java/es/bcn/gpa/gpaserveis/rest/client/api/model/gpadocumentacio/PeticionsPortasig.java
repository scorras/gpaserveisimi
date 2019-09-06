/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.15.0
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
 * PeticionsPortasig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-06T08:41:37.186+02:00")
public class PeticionsPortasig {
  @JsonProperty("codiError")
  private String codiError = null;

  @JsonProperty("codiPeticio")
  private String codiPeticio = null;

  @JsonProperty("codiUsuari")
  private String codiUsuari = null;

  @JsonProperty("dataCaducitat")
  private DateTime dataCaducitat = null;

  @JsonProperty("dataSignatura")
  private DateTime dataSignatura = null;

  @JsonProperty("dataVistiplau")
  private DateTime dataVistiplau = null;

  @JsonProperty("estatPeticio")
  private String estatPeticio = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("missatgeError")
  private String missatgeError = null;

  @JsonProperty("tipusPeticio")
  private BigDecimal tipusPeticio = null;

  public PeticionsPortasig codiError(String codiError) {
    this.codiError = codiError;
    return this;
  }

   /**
   * Get codiError
   * @return codiError
  **/
  @ApiModelProperty(value = "")
  public String getCodiError() {
    return codiError;
  }

  public void setCodiError(String codiError) {
    this.codiError = codiError;
  }

  public PeticionsPortasig codiPeticio(String codiPeticio) {
    this.codiPeticio = codiPeticio;
    return this;
  }

   /**
   * Get codiPeticio
   * @return codiPeticio
  **/
  @ApiModelProperty(value = "")
  public String getCodiPeticio() {
    return codiPeticio;
  }

  public void setCodiPeticio(String codiPeticio) {
    this.codiPeticio = codiPeticio;
  }

  public PeticionsPortasig codiUsuari(String codiUsuari) {
    this.codiUsuari = codiUsuari;
    return this;
  }

   /**
   * Get codiUsuari
   * @return codiUsuari
  **/
  @ApiModelProperty(value = "")
  public String getCodiUsuari() {
    return codiUsuari;
  }

  public void setCodiUsuari(String codiUsuari) {
    this.codiUsuari = codiUsuari;
  }

  public PeticionsPortasig dataCaducitat(DateTime dataCaducitat) {
    this.dataCaducitat = dataCaducitat;
    return this;
  }

   /**
   * Get dataCaducitat
   * @return dataCaducitat
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataCaducitat() {
    return dataCaducitat;
  }

  public void setDataCaducitat(DateTime dataCaducitat) {
    this.dataCaducitat = dataCaducitat;
  }

  public PeticionsPortasig dataSignatura(DateTime dataSignatura) {
    this.dataSignatura = dataSignatura;
    return this;
  }

   /**
   * Get dataSignatura
   * @return dataSignatura
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataSignatura() {
    return dataSignatura;
  }

  public void setDataSignatura(DateTime dataSignatura) {
    this.dataSignatura = dataSignatura;
  }

  public PeticionsPortasig dataVistiplau(DateTime dataVistiplau) {
    this.dataVistiplau = dataVistiplau;
    return this;
  }

   /**
   * Get dataVistiplau
   * @return dataVistiplau
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataVistiplau() {
    return dataVistiplau;
  }

  public void setDataVistiplau(DateTime dataVistiplau) {
    this.dataVistiplau = dataVistiplau;
  }

  public PeticionsPortasig estatPeticio(String estatPeticio) {
    this.estatPeticio = estatPeticio;
    return this;
  }

   /**
   * Get estatPeticio
   * @return estatPeticio
  **/
  @ApiModelProperty(value = "")
  public String getEstatPeticio() {
    return estatPeticio;
  }

  public void setEstatPeticio(String estatPeticio) {
    this.estatPeticio = estatPeticio;
  }

  public PeticionsPortasig id(BigDecimal id) {
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

  public PeticionsPortasig missatgeError(String missatgeError) {
    this.missatgeError = missatgeError;
    return this;
  }

   /**
   * Get missatgeError
   * @return missatgeError
  **/
  @ApiModelProperty(value = "")
  public String getMissatgeError() {
    return missatgeError;
  }

  public void setMissatgeError(String missatgeError) {
    this.missatgeError = missatgeError;
  }

  public PeticionsPortasig tipusPeticio(BigDecimal tipusPeticio) {
    this.tipusPeticio = tipusPeticio;
    return this;
  }

   /**
   * Get tipusPeticio
   * @return tipusPeticio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTipusPeticio() {
    return tipusPeticio;
  }

  public void setTipusPeticio(BigDecimal tipusPeticio) {
    this.tipusPeticio = tipusPeticio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeticionsPortasig peticionsPortasig = (PeticionsPortasig) o;
    return Objects.equals(this.codiError, peticionsPortasig.codiError) &&
        Objects.equals(this.codiPeticio, peticionsPortasig.codiPeticio) &&
        Objects.equals(this.codiUsuari, peticionsPortasig.codiUsuari) &&
        Objects.equals(this.dataCaducitat, peticionsPortasig.dataCaducitat) &&
        Objects.equals(this.dataSignatura, peticionsPortasig.dataSignatura) &&
        Objects.equals(this.dataVistiplau, peticionsPortasig.dataVistiplau) &&
        Objects.equals(this.estatPeticio, peticionsPortasig.estatPeticio) &&
        Objects.equals(this.id, peticionsPortasig.id) &&
        Objects.equals(this.missatgeError, peticionsPortasig.missatgeError) &&
        Objects.equals(this.tipusPeticio, peticionsPortasig.tipusPeticio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiError, codiPeticio, codiUsuari, dataCaducitat, dataSignatura, dataVistiplau, estatPeticio, id, missatgeError, tipusPeticio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeticionsPortasig {\n");
    
    sb.append("    codiError: ").append(toIndentedString(codiError)).append("\n");
    sb.append("    codiPeticio: ").append(toIndentedString(codiPeticio)).append("\n");
    sb.append("    codiUsuari: ").append(toIndentedString(codiUsuari)).append("\n");
    sb.append("    dataCaducitat: ").append(toIndentedString(dataCaducitat)).append("\n");
    sb.append("    dataSignatura: ").append(toIndentedString(dataSignatura)).append("\n");
    sb.append("    dataVistiplau: ").append(toIndentedString(dataVistiplau)).append("\n");
    sb.append("    estatPeticio: ").append(toIndentedString(estatPeticio)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    missatgeError: ").append(toIndentedString(missatgeError)).append("\n");
    sb.append("    tipusPeticio: ").append(toIndentedString(tipusPeticio)).append("\n");
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

