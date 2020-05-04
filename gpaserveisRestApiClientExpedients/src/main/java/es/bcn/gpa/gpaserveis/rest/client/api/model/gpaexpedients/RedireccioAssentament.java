/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.20.4
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
 * RedireccioAssentament
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-29T15:55:28.523+02:00")
public class RedireccioAssentament {
  @JsonProperty("codiUnitatGestora")
  private String codiUnitatGestora = null;

  @JsonProperty("matriculaUsuari")
  private String matriculaUsuari = null;

  @JsonProperty("numeroAssentament")
  private String numeroAssentament = null;

  public RedireccioAssentament codiUnitatGestora(String codiUnitatGestora) {
    this.codiUnitatGestora = codiUnitatGestora;
    return this;
  }

   /**
   * Codi d&#39;Unitat Gestora
   * @return codiUnitatGestora
  **/
  @ApiModelProperty(value = "Codi d'Unitat Gestora")
  public String getCodiUnitatGestora() {
    return codiUnitatGestora;
  }

  public void setCodiUnitatGestora(String codiUnitatGestora) {
    this.codiUnitatGestora = codiUnitatGestora;
  }

  public RedireccioAssentament matriculaUsuari(String matriculaUsuari) {
    this.matriculaUsuari = matriculaUsuari;
    return this;
  }

   /**
   * Matrícula de l&#39;usuari
   * @return matriculaUsuari
  **/
  @ApiModelProperty(value = "Matrícula de l'usuari")
  public String getMatriculaUsuari() {
    return matriculaUsuari;
  }

  public void setMatriculaUsuari(String matriculaUsuari) {
    this.matriculaUsuari = matriculaUsuari;
  }

  public RedireccioAssentament numeroAssentament(String numeroAssentament) {
    this.numeroAssentament = numeroAssentament;
    return this;
  }

   /**
   * Número d&#39;assentament
   * @return numeroAssentament
  **/
  @ApiModelProperty(value = "Número d'assentament")
  public String getNumeroAssentament() {
    return numeroAssentament;
  }

  public void setNumeroAssentament(String numeroAssentament) {
    this.numeroAssentament = numeroAssentament;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedireccioAssentament redireccioAssentament = (RedireccioAssentament) o;
    return Objects.equals(this.codiUnitatGestora, redireccioAssentament.codiUnitatGestora) &&
        Objects.equals(this.matriculaUsuari, redireccioAssentament.matriculaUsuari) &&
        Objects.equals(this.numeroAssentament, redireccioAssentament.numeroAssentament);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiUnitatGestora, matriculaUsuari, numeroAssentament);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedireccioAssentament {\n");
    
    sb.append("    codiUnitatGestora: ").append(toIndentedString(codiUnitatGestora)).append("\n");
    sb.append("    matriculaUsuari: ").append(toIndentedString(matriculaUsuari)).append("\n");
    sb.append("    numeroAssentament: ").append(toIndentedString(numeroAssentament)).append("\n");
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

