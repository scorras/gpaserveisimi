/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.15.1
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.DadesEspecifiquesRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ExpedientsRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ActualitzarDadesSollicitud
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-22T09:45:57.875+02:00")
public class ActualitzarDadesSollicitud {
  @JsonProperty("comentari")
  private String comentari = null;

  @JsonProperty("dadesEspecifiques")
  private List<DadesEspecifiquesRDTO> dadesEspecifiques = null;

  @JsonProperty("esmena")
  private Boolean esmena = null;

  @JsonProperty("expedient")
  private ExpedientsRDTO expedient = null;

  @JsonProperty("tipusIniciacio")
  private String tipusIniciacio = null;

  public ActualitzarDadesSollicitud comentari(String comentari) {
    this.comentari = comentari;
    return this;
  }

   /**
   * Comentari associat a l&#39;operació
   * @return comentari
  **/
  @ApiModelProperty(value = "Comentari associat a l'operació")
  public String getComentari() {
    return comentari;
  }

  public void setComentari(String comentari) {
    this.comentari = comentari;
  }

  public ActualitzarDadesSollicitud dadesEspecifiques(List<DadesEspecifiquesRDTO> dadesEspecifiques) {
    this.dadesEspecifiques = dadesEspecifiques;
    return this;
  }

  public ActualitzarDadesSollicitud addDadesEspecifiquesItem(DadesEspecifiquesRDTO dadesEspecifiquesItem) {
    if (this.dadesEspecifiques == null) {
      this.dadesEspecifiques = new ArrayList<DadesEspecifiquesRDTO>();
    }
    this.dadesEspecifiques.add(dadesEspecifiquesItem);
    return this;
  }

   /**
   * Valors d&#39;atributs de l&#39;expedient
   * @return dadesEspecifiques
  **/
  @ApiModelProperty(value = "Valors d'atributs de l'expedient")
  public List<DadesEspecifiquesRDTO> getDadesEspecifiques() {
    return dadesEspecifiques;
  }

  public void setDadesEspecifiques(List<DadesEspecifiquesRDTO> dadesEspecifiques) {
    this.dadesEspecifiques = dadesEspecifiques;
  }

  public ActualitzarDadesSollicitud esmena(Boolean esmena) {
    this.esmena = esmena;
    return this;
  }

   /**
   * Indica si es tracta de la resposta a un requeriment
   * @return esmena
  **/
  @ApiModelProperty(value = "Indica si es tracta de la resposta a un requeriment")
  public Boolean isEsmena() {
    return esmena;
  }

  public void setEsmena(Boolean esmena) {
    this.esmena = esmena;
  }

  public ActualitzarDadesSollicitud expedient(ExpedientsRDTO expedient) {
    this.expedient = expedient;
    return this;
  }

   /**
   * Dades de l&#39;expedient
   * @return expedient
  **/
  @ApiModelProperty(value = "Dades de l'expedient")
  public ExpedientsRDTO getExpedient() {
    return expedient;
  }

  public void setExpedient(ExpedientsRDTO expedient) {
    this.expedient = expedient;
  }

  public ActualitzarDadesSollicitud tipusIniciacio(String tipusIniciacio) {
    this.tipusIniciacio = tipusIniciacio;
    return this;
  }

   /**
   * Tipus de iniciació sollicitud
   * @return tipusIniciacio
  **/
  @ApiModelProperty(value = "Tipus de iniciació sollicitud")
  public String getTipusIniciacio() {
    return tipusIniciacio;
  }

  public void setTipusIniciacio(String tipusIniciacio) {
    this.tipusIniciacio = tipusIniciacio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActualitzarDadesSollicitud actualitzarDadesSollicitud = (ActualitzarDadesSollicitud) o;
    return Objects.equals(this.comentari, actualitzarDadesSollicitud.comentari) &&
        Objects.equals(this.dadesEspecifiques, actualitzarDadesSollicitud.dadesEspecifiques) &&
        Objects.equals(this.esmena, actualitzarDadesSollicitud.esmena) &&
        Objects.equals(this.expedient, actualitzarDadesSollicitud.expedient) &&
        Objects.equals(this.tipusIniciacio, actualitzarDadesSollicitud.tipusIniciacio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comentari, dadesEspecifiques, esmena, expedient, tipusIniciacio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActualitzarDadesSollicitud {\n");
    
    sb.append("    comentari: ").append(toIndentedString(comentari)).append("\n");
    sb.append("    dadesEspecifiques: ").append(toIndentedString(dadesEspecifiques)).append("\n");
    sb.append("    esmena: ").append(toIndentedString(esmena)).append("\n");
    sb.append("    expedient: ").append(toIndentedString(expedient)).append("\n");
    sb.append("    tipusIniciacio: ").append(toIndentedString(tipusIniciacio)).append("\n");
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

