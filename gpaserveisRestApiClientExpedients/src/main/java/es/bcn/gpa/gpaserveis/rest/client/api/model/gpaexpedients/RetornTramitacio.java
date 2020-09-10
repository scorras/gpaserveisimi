/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.24.4
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.EstatsUgConvidada;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * RetornTramitacio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-19T09:53:47.185+02:00")
public class RetornTramitacio {
  @JsonProperty("esUsuariPrincipalExpedient")
  private Boolean esUsuariPrincipalExpedient = null;

  @JsonProperty("missatgeError")
  private String missatgeError = null;

  @JsonProperty("nomDescUGConvidadas")
  private String nomDescUGConvidadas = null;

  @JsonProperty("unitatsGestoresConvidadas")
  private List<EstatsUgConvidada> unitatsGestoresConvidadas = null;

  public RetornTramitacio esUsuariPrincipalExpedient(Boolean esUsuariPrincipalExpedient) {
    this.esUsuariPrincipalExpedient = esUsuariPrincipalExpedient;
    return this;
  }

   /**
   * Indica si l&#39;usuari que realitza a l&#39;acció és l&#39;usuari principal de l&#39;expedient
   * @return esUsuariPrincipalExpedient
  **/
  @ApiModelProperty(value = "Indica si l'usuari que realitza a l'acció és l'usuari principal de l'expedient")
  public Boolean isEsUsuariPrincipalExpedient() {
    return esUsuariPrincipalExpedient;
  }

  public void setEsUsuariPrincipalExpedient(Boolean esUsuariPrincipalExpedient) {
    this.esUsuariPrincipalExpedient = esUsuariPrincipalExpedient;
  }

  public RetornTramitacio missatgeError(String missatgeError) {
    this.missatgeError = missatgeError;
    return this;
  }

   /**
   * Missatge d&#39;error
   * @return missatgeError
  **/
  @ApiModelProperty(value = "Missatge d'error")
  public String getMissatgeError() {
    return missatgeError;
  }

  public void setMissatgeError(String missatgeError) {
    this.missatgeError = missatgeError;
  }

  public RetornTramitacio nomDescUGConvidadas(String nomDescUGConvidadas) {
    this.nomDescUGConvidadas = nomDescUGConvidadas;
    return this;
  }

   /**
   * Nom i descripció de les unitats gestores convidadas de l&#39;expedient
   * @return nomDescUGConvidadas
  **/
  @ApiModelProperty(value = "Nom i descripció de les unitats gestores convidadas de l'expedient")
  public String getNomDescUGConvidadas() {
    return nomDescUGConvidadas;
  }

  public void setNomDescUGConvidadas(String nomDescUGConvidadas) {
    this.nomDescUGConvidadas = nomDescUGConvidadas;
  }

  public RetornTramitacio unitatsGestoresConvidadas(List<EstatsUgConvidada> unitatsGestoresConvidadas) {
    this.unitatsGestoresConvidadas = unitatsGestoresConvidadas;
    return this;
  }

  public RetornTramitacio addUnitatsGestoresConvidadasItem(EstatsUgConvidada unitatsGestoresConvidadasItem) {
    if (this.unitatsGestoresConvidadas == null) {
      this.unitatsGestoresConvidadas = new ArrayList<EstatsUgConvidada>();
    }
    this.unitatsGestoresConvidadas.add(unitatsGestoresConvidadasItem);
    return this;
  }

   /**
   * Llista de les unitats gestores convidadas de l&#39;expedient
   * @return unitatsGestoresConvidadas
  **/
  @ApiModelProperty(value = "Llista de les unitats gestores convidadas de l'expedient")
  public List<EstatsUgConvidada> getUnitatsGestoresConvidadas() {
    return unitatsGestoresConvidadas;
  }

  public void setUnitatsGestoresConvidadas(List<EstatsUgConvidada> unitatsGestoresConvidadas) {
    this.unitatsGestoresConvidadas = unitatsGestoresConvidadas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetornTramitacio retornTramitacio = (RetornTramitacio) o;
    return Objects.equals(this.esUsuariPrincipalExpedient, retornTramitacio.esUsuariPrincipalExpedient) &&
        Objects.equals(this.missatgeError, retornTramitacio.missatgeError) &&
        Objects.equals(this.nomDescUGConvidadas, retornTramitacio.nomDescUGConvidadas) &&
        Objects.equals(this.unitatsGestoresConvidadas, retornTramitacio.unitatsGestoresConvidadas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(esUsuariPrincipalExpedient, missatgeError, nomDescUGConvidadas, unitatsGestoresConvidadas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornTramitacio {\n");
    
    sb.append("    esUsuariPrincipalExpedient: ").append(toIndentedString(esUsuariPrincipalExpedient)).append("\n");
    sb.append("    missatgeError: ").append(toIndentedString(missatgeError)).append("\n");
    sb.append("    nomDescUGConvidadas: ").append(toIndentedString(nomDescUGConvidadas)).append("\n");
    sb.append("    unitatsGestoresConvidadas: ").append(toIndentedString(unitatsGestoresConvidadas)).append("\n");
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

