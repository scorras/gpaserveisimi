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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PersonesSollicitud;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RegistreAssentament;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Sollicituds
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-15T10:03:16.673+02:00")
public class Sollicituds {
  @JsonProperty("dataPresentacio")
  private DateTime dataPresentacio = null;

  @JsonProperty("dataSollicitud")
  private DateTime dataSollicitud = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("iniciacio")
  private BigDecimal iniciacio = null;

  @JsonProperty("iniciacioNom")
  private String iniciacioNom = null;

  @JsonProperty("personesSollicitudList")
  private List<PersonesSollicitud> personesSollicitudList = null;

  @JsonProperty("registre")
  private BigDecimal registre = null;

  @JsonProperty("registreAssentament")
  private RegistreAssentament registreAssentament = null;

  public Sollicituds dataPresentacio(DateTime dataPresentacio) {
    this.dataPresentacio = dataPresentacio;
    return this;
  }

   /**
   * Get dataPresentacio
   * @return dataPresentacio
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataPresentacio() {
    return dataPresentacio;
  }

  public void setDataPresentacio(DateTime dataPresentacio) {
    this.dataPresentacio = dataPresentacio;
  }

  public Sollicituds dataSollicitud(DateTime dataSollicitud) {
    this.dataSollicitud = dataSollicitud;
    return this;
  }

   /**
   * Get dataSollicitud
   * @return dataSollicitud
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataSollicitud() {
    return dataSollicitud;
  }

  public void setDataSollicitud(DateTime dataSollicitud) {
    this.dataSollicitud = dataSollicitud;
  }

  public Sollicituds id(BigDecimal id) {
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

  public Sollicituds iniciacio(BigDecimal iniciacio) {
    this.iniciacio = iniciacio;
    return this;
  }

   /**
   * Get iniciacio
   * @return iniciacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIniciacio() {
    return iniciacio;
  }

  public void setIniciacio(BigDecimal iniciacio) {
    this.iniciacio = iniciacio;
  }

  public Sollicituds iniciacioNom(String iniciacioNom) {
    this.iniciacioNom = iniciacioNom;
    return this;
  }

   /**
   * Get iniciacioNom
   * @return iniciacioNom
  **/
  @ApiModelProperty(value = "")
  public String getIniciacioNom() {
    return iniciacioNom;
  }

  public void setIniciacioNom(String iniciacioNom) {
    this.iniciacioNom = iniciacioNom;
  }

  public Sollicituds personesSollicitudList(List<PersonesSollicitud> personesSollicitudList) {
    this.personesSollicitudList = personesSollicitudList;
    return this;
  }

  public Sollicituds addPersonesSollicitudListItem(PersonesSollicitud personesSollicitudListItem) {
    if (this.personesSollicitudList == null) {
      this.personesSollicitudList = new ArrayList<PersonesSollicitud>();
    }
    this.personesSollicitudList.add(personesSollicitudListItem);
    return this;
  }

   /**
   * Get personesSollicitudList
   * @return personesSollicitudList
  **/
  @ApiModelProperty(value = "")
  public List<PersonesSollicitud> getPersonesSollicitudList() {
    return personesSollicitudList;
  }

  public void setPersonesSollicitudList(List<PersonesSollicitud> personesSollicitudList) {
    this.personesSollicitudList = personesSollicitudList;
  }

  public Sollicituds registre(BigDecimal registre) {
    this.registre = registre;
    return this;
  }

   /**
   * Get registre
   * @return registre
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRegistre() {
    return registre;
  }

  public void setRegistre(BigDecimal registre) {
    this.registre = registre;
  }

  public Sollicituds registreAssentament(RegistreAssentament registreAssentament) {
    this.registreAssentament = registreAssentament;
    return this;
  }

   /**
   * Get registreAssentament
   * @return registreAssentament
  **/
  @ApiModelProperty(value = "")
  public RegistreAssentament getRegistreAssentament() {
    return registreAssentament;
  }

  public void setRegistreAssentament(RegistreAssentament registreAssentament) {
    this.registreAssentament = registreAssentament;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sollicituds sollicituds = (Sollicituds) o;
    return Objects.equals(this.dataPresentacio, sollicituds.dataPresentacio) &&
        Objects.equals(this.dataSollicitud, sollicituds.dataSollicitud) &&
        Objects.equals(this.id, sollicituds.id) &&
        Objects.equals(this.iniciacio, sollicituds.iniciacio) &&
        Objects.equals(this.iniciacioNom, sollicituds.iniciacioNom) &&
        Objects.equals(this.personesSollicitudList, sollicituds.personesSollicitudList) &&
        Objects.equals(this.registre, sollicituds.registre) &&
        Objects.equals(this.registreAssentament, sollicituds.registreAssentament);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataPresentacio, dataSollicitud, id, iniciacio, iniciacioNom, personesSollicitudList, registre, registreAssentament);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sollicituds {\n");
    
    sb.append("    dataPresentacio: ").append(toIndentedString(dataPresentacio)).append("\n");
    sb.append("    dataSollicitud: ").append(toIndentedString(dataSollicitud)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iniciacio: ").append(toIndentedString(iniciacio)).append("\n");
    sb.append("    iniciacioNom: ").append(toIndentedString(iniciacioNom)).append("\n");
    sb.append("    personesSollicitudList: ").append(toIndentedString(personesSollicitudList)).append("\n");
    sb.append("    registre: ").append(toIndentedString(registre)).append("\n");
    sb.append("    registreAssentament: ").append(toIndentedString(registreAssentament)).append("\n");
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

