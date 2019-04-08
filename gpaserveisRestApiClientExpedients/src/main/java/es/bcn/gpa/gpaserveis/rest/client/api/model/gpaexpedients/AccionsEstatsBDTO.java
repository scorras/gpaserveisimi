/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.9.1
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

/**
 * AccionsEstatsBDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T17:17:56.150+02:00")
public class AccionsEstatsBDTO {
  @JsonProperty("accio")
  private BigDecimal accio = null;

  @JsonProperty("descTransicio")
  private String descTransicio = null;

  @JsonProperty("esEstatFinal")
  private Integer esEstatFinal = null;

  @JsonProperty("esEstatInicial")
  private Integer esEstatInicial = null;

  @JsonProperty("estat")
  private BigDecimal estat = null;

  @JsonProperty("estatTramitador")
  private String estatTramitador = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("nomAccio")
  private String nomAccio = null;

  public AccionsEstatsBDTO accio(BigDecimal accio) {
    this.accio = accio;
    return this;
  }

   /**
   * Get accio
   * @return accio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAccio() {
    return accio;
  }

  public void setAccio(BigDecimal accio) {
    this.accio = accio;
  }

  public AccionsEstatsBDTO descTransicio(String descTransicio) {
    this.descTransicio = descTransicio;
    return this;
  }

   /**
   * Get descTransicio
   * @return descTransicio
  **/
  @ApiModelProperty(value = "")
  public String getDescTransicio() {
    return descTransicio;
  }

  public void setDescTransicio(String descTransicio) {
    this.descTransicio = descTransicio;
  }

  public AccionsEstatsBDTO esEstatFinal(Integer esEstatFinal) {
    this.esEstatFinal = esEstatFinal;
    return this;
  }

   /**
   * Get esEstatFinal
   * @return esEstatFinal
  **/
  @ApiModelProperty(value = "")
  public Integer getEsEstatFinal() {
    return esEstatFinal;
  }

  public void setEsEstatFinal(Integer esEstatFinal) {
    this.esEstatFinal = esEstatFinal;
  }

  public AccionsEstatsBDTO esEstatInicial(Integer esEstatInicial) {
    this.esEstatInicial = esEstatInicial;
    return this;
  }

   /**
   * Get esEstatInicial
   * @return esEstatInicial
  **/
  @ApiModelProperty(value = "")
  public Integer getEsEstatInicial() {
    return esEstatInicial;
  }

  public void setEsEstatInicial(Integer esEstatInicial) {
    this.esEstatInicial = esEstatInicial;
  }

  public AccionsEstatsBDTO estat(BigDecimal estat) {
    this.estat = estat;
    return this;
  }

   /**
   * Get estat
   * @return estat
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstat() {
    return estat;
  }

  public void setEstat(BigDecimal estat) {
    this.estat = estat;
  }

  public AccionsEstatsBDTO estatTramitador(String estatTramitador) {
    this.estatTramitador = estatTramitador;
    return this;
  }

   /**
   * Get estatTramitador
   * @return estatTramitador
  **/
  @ApiModelProperty(value = "")
  public String getEstatTramitador() {
    return estatTramitador;
  }

  public void setEstatTramitador(String estatTramitador) {
    this.estatTramitador = estatTramitador;
  }

  public AccionsEstatsBDTO id(BigDecimal id) {
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

  public AccionsEstatsBDTO nomAccio(String nomAccio) {
    this.nomAccio = nomAccio;
    return this;
  }

   /**
   * Get nomAccio
   * @return nomAccio
  **/
  @ApiModelProperty(value = "")
  public String getNomAccio() {
    return nomAccio;
  }

  public void setNomAccio(String nomAccio) {
    this.nomAccio = nomAccio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccionsEstatsBDTO accionsEstatsBDTO = (AccionsEstatsBDTO) o;
    return Objects.equals(this.accio, accionsEstatsBDTO.accio) &&
        Objects.equals(this.descTransicio, accionsEstatsBDTO.descTransicio) &&
        Objects.equals(this.esEstatFinal, accionsEstatsBDTO.esEstatFinal) &&
        Objects.equals(this.esEstatInicial, accionsEstatsBDTO.esEstatInicial) &&
        Objects.equals(this.estat, accionsEstatsBDTO.estat) &&
        Objects.equals(this.estatTramitador, accionsEstatsBDTO.estatTramitador) &&
        Objects.equals(this.id, accionsEstatsBDTO.id) &&
        Objects.equals(this.nomAccio, accionsEstatsBDTO.nomAccio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accio, descTransicio, esEstatFinal, esEstatInicial, estat, estatTramitador, id, nomAccio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccionsEstatsBDTO {\n");
    
    sb.append("    accio: ").append(toIndentedString(accio)).append("\n");
    sb.append("    descTransicio: ").append(toIndentedString(descTransicio)).append("\n");
    sb.append("    esEstatFinal: ").append(toIndentedString(esEstatFinal)).append("\n");
    sb.append("    esEstatInicial: ").append(toIndentedString(esEstatInicial)).append("\n");
    sb.append("    estat: ").append(toIndentedString(estat)).append("\n");
    sb.append("    estatTramitador: ").append(toIndentedString(estatTramitador)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nomAccio: ").append(toIndentedString(nomAccio)).append("\n");
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

