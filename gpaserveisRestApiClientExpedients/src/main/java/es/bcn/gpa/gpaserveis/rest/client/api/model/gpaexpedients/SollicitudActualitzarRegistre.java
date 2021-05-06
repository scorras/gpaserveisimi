/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 2.2.3
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
import org.joda.time.DateTime;

/**
 * SollicitudActualitzarRegistre
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-05T19:08:39.124+02:00")
public class SollicitudActualitzarRegistre {
  @JsonProperty("dataPresentacio")
  private DateTime dataPresentacio = null;

  @JsonProperty("idRegistre")
  private BigDecimal idRegistre = null;

  @JsonProperty("idSollicitud")
  private BigDecimal idSollicitud = null;

  @JsonProperty("matriculaInformador")
  private String matriculaInformador = null;

  @JsonProperty("signaturaSollicitud")
  private BigDecimal signaturaSollicitud = null;

  public SollicitudActualitzarRegistre dataPresentacio(DateTime dataPresentacio) {
    this.dataPresentacio = dataPresentacio;
    return this;
  }

   /**
   * Data presentacio
   * @return dataPresentacio
  **/
  @ApiModelProperty(value = "Data presentacio")
  public DateTime getDataPresentacio() {
    return dataPresentacio;
  }

  public void setDataPresentacio(DateTime dataPresentacio) {
    this.dataPresentacio = dataPresentacio;
  }

  public SollicitudActualitzarRegistre idRegistre(BigDecimal idRegistre) {
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

  public SollicitudActualitzarRegistre idSollicitud(BigDecimal idSollicitud) {
    this.idSollicitud = idSollicitud;
    return this;
  }

   /**
   * Identificador de la sol·licitud
   * @return idSollicitud
  **/
  @ApiModelProperty(value = "Identificador de la sol·licitud")
  public BigDecimal getIdSollicitud() {
    return idSollicitud;
  }

  public void setIdSollicitud(BigDecimal idSollicitud) {
    this.idSollicitud = idSollicitud;
  }

  public SollicitudActualitzarRegistre matriculaInformador(String matriculaInformador) {
    this.matriculaInformador = matriculaInformador;
    return this;
  }

   /**
   * Matrícula de l&#39;informador
   * @return matriculaInformador
  **/
  @ApiModelProperty(value = "Matrícula de l'informador")
  public String getMatriculaInformador() {
    return matriculaInformador;
  }

  public void setMatriculaInformador(String matriculaInformador) {
    this.matriculaInformador = matriculaInformador;
  }

  public SollicitudActualitzarRegistre signaturaSollicitud(BigDecimal signaturaSollicitud) {
    this.signaturaSollicitud = signaturaSollicitud;
    return this;
  }

   /**
   * Identificador de la signatura de la sollicitud
   * @return signaturaSollicitud
  **/
  @ApiModelProperty(value = "Identificador de la signatura de la sollicitud")
  public BigDecimal getSignaturaSollicitud() {
    return signaturaSollicitud;
  }

  public void setSignaturaSollicitud(BigDecimal signaturaSollicitud) {
    this.signaturaSollicitud = signaturaSollicitud;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SollicitudActualitzarRegistre sollicitudActualitzarRegistre = (SollicitudActualitzarRegistre) o;
    return Objects.equals(this.dataPresentacio, sollicitudActualitzarRegistre.dataPresentacio) &&
        Objects.equals(this.idRegistre, sollicitudActualitzarRegistre.idRegistre) &&
        Objects.equals(this.idSollicitud, sollicitudActualitzarRegistre.idSollicitud) &&
        Objects.equals(this.matriculaInformador, sollicitudActualitzarRegistre.matriculaInformador) &&
        Objects.equals(this.signaturaSollicitud, sollicitudActualitzarRegistre.signaturaSollicitud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataPresentacio, idRegistre, idSollicitud, matriculaInformador, signaturaSollicitud);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SollicitudActualitzarRegistre {\n");
    
    sb.append("    dataPresentacio: ").append(toIndentedString(dataPresentacio)).append("\n");
    sb.append("    idRegistre: ").append(toIndentedString(idRegistre)).append("\n");
    sb.append("    idSollicitud: ").append(toIndentedString(idSollicitud)).append("\n");
    sb.append("    matriculaInformador: ").append(toIndentedString(matriculaInformador)).append("\n");
    sb.append("    signaturaSollicitud: ").append(toIndentedString(signaturaSollicitud)).append("\n");
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

