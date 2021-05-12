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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PersonesSollicitud;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PersonesSollicitudRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.RegistreAssentament;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * SollicitudsRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-11T20:02:11.541+02:00")
public class SollicitudsRDTO {
  @JsonProperty("comentari")
  private BigDecimal comentari = null;

  @JsonProperty("dadesExternes")
  private String dadesExternes = null;

  @JsonProperty("dataPresentacio")
  private DateTime dataPresentacio = null;

  @JsonProperty("dataSollicitud")
  private DateTime dataSollicitud = null;

  @JsonProperty("expedient")
  private BigDecimal expedient = null;

  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("iniciacio")
  private BigDecimal iniciacio = null;

  @JsonProperty("iniciacioNom")
  private String iniciacioNom = null;

  @JsonProperty("personesImplicades")
  private List<PersonesSollicitudRDTO> personesImplicades = null;

  @JsonProperty("personesInteressades")
  private List<PersonesSollicitudRDTO> personesInteressades = null;

  @JsonProperty("personesSollicitudList")
  private List<PersonesSollicitud> personesSollicitudList = null;

  @JsonProperty("registre")
  private BigDecimal registre = null;

  @JsonProperty("registreAssentament")
  private RegistreAssentament registreAssentament = null;

  @JsonProperty("signaturaSollicitud")
  private BigDecimal signaturaSollicitud = null;

  @JsonProperty("tramitOvtIdext")
  private BigDecimal tramitOvtIdext = null;

  @JsonProperty("tramitador")
  private String tramitador = null;

  public SollicitudsRDTO comentari(BigDecimal comentari) {
    this.comentari = comentari;
    return this;
  }

   /**
   * Get comentari
   * @return comentari
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getComentari() {
    return comentari;
  }

  public void setComentari(BigDecimal comentari) {
    this.comentari = comentari;
  }

  public SollicitudsRDTO dadesExternes(String dadesExternes) {
    this.dadesExternes = dadesExternes;
    return this;
  }

   /**
   * Get dadesExternes
   * @return dadesExternes
  **/
  @ApiModelProperty(value = "")
  public String getDadesExternes() {
    return dadesExternes;
  }

  public void setDadesExternes(String dadesExternes) {
    this.dadesExternes = dadesExternes;
  }

  public SollicitudsRDTO dataPresentacio(DateTime dataPresentacio) {
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

  public SollicitudsRDTO dataSollicitud(DateTime dataSollicitud) {
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

  public SollicitudsRDTO expedient(BigDecimal expedient) {
    this.expedient = expedient;
    return this;
  }

   /**
   * Get expedient
   * @return expedient
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExpedient() {
    return expedient;
  }

  public void setExpedient(BigDecimal expedient) {
    this.expedient = expedient;
  }

  public SollicitudsRDTO hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(value = "")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public SollicitudsRDTO id(BigDecimal id) {
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

  public SollicitudsRDTO iniciacio(BigDecimal iniciacio) {
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

  public SollicitudsRDTO iniciacioNom(String iniciacioNom) {
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

  public SollicitudsRDTO personesImplicades(List<PersonesSollicitudRDTO> personesImplicades) {
    this.personesImplicades = personesImplicades;
    return this;
  }

  public SollicitudsRDTO addPersonesImplicadesItem(PersonesSollicitudRDTO personesImplicadesItem) {
    if (this.personesImplicades == null) {
      this.personesImplicades = new ArrayList<PersonesSollicitudRDTO>();
    }
    this.personesImplicades.add(personesImplicadesItem);
    return this;
  }

   /**
   * Get personesImplicades
   * @return personesImplicades
  **/
  @ApiModelProperty(value = "")
  public List<PersonesSollicitudRDTO> getPersonesImplicades() {
    return personesImplicades;
  }

  public void setPersonesImplicades(List<PersonesSollicitudRDTO> personesImplicades) {
    this.personesImplicades = personesImplicades;
  }

  public SollicitudsRDTO personesInteressades(List<PersonesSollicitudRDTO> personesInteressades) {
    this.personesInteressades = personesInteressades;
    return this;
  }

  public SollicitudsRDTO addPersonesInteressadesItem(PersonesSollicitudRDTO personesInteressadesItem) {
    if (this.personesInteressades == null) {
      this.personesInteressades = new ArrayList<PersonesSollicitudRDTO>();
    }
    this.personesInteressades.add(personesInteressadesItem);
    return this;
  }

   /**
   * Get personesInteressades
   * @return personesInteressades
  **/
  @ApiModelProperty(value = "")
  public List<PersonesSollicitudRDTO> getPersonesInteressades() {
    return personesInteressades;
  }

  public void setPersonesInteressades(List<PersonesSollicitudRDTO> personesInteressades) {
    this.personesInteressades = personesInteressades;
  }

  public SollicitudsRDTO personesSollicitudList(List<PersonesSollicitud> personesSollicitudList) {
    this.personesSollicitudList = personesSollicitudList;
    return this;
  }

  public SollicitudsRDTO addPersonesSollicitudListItem(PersonesSollicitud personesSollicitudListItem) {
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

  public SollicitudsRDTO registre(BigDecimal registre) {
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

  public SollicitudsRDTO registreAssentament(RegistreAssentament registreAssentament) {
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

  public SollicitudsRDTO signaturaSollicitud(BigDecimal signaturaSollicitud) {
    this.signaturaSollicitud = signaturaSollicitud;
    return this;
  }

   /**
   * Get signaturaSollicitud
   * @return signaturaSollicitud
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSignaturaSollicitud() {
    return signaturaSollicitud;
  }

  public void setSignaturaSollicitud(BigDecimal signaturaSollicitud) {
    this.signaturaSollicitud = signaturaSollicitud;
  }

  public SollicitudsRDTO tramitOvtIdext(BigDecimal tramitOvtIdext) {
    this.tramitOvtIdext = tramitOvtIdext;
    return this;
  }

   /**
   * Get tramitOvtIdext
   * @return tramitOvtIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTramitOvtIdext() {
    return tramitOvtIdext;
  }

  public void setTramitOvtIdext(BigDecimal tramitOvtIdext) {
    this.tramitOvtIdext = tramitOvtIdext;
  }

  public SollicitudsRDTO tramitador(String tramitador) {
    this.tramitador = tramitador;
    return this;
  }

   /**
   * Get tramitador
   * @return tramitador
  **/
  @ApiModelProperty(value = "")
  public String getTramitador() {
    return tramitador;
  }

  public void setTramitador(String tramitador) {
    this.tramitador = tramitador;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SollicitudsRDTO sollicitudsRDTO = (SollicitudsRDTO) o;
    return Objects.equals(this.comentari, sollicitudsRDTO.comentari) &&
        Objects.equals(this.dadesExternes, sollicitudsRDTO.dadesExternes) &&
        Objects.equals(this.dataPresentacio, sollicitudsRDTO.dataPresentacio) &&
        Objects.equals(this.dataSollicitud, sollicitudsRDTO.dataSollicitud) &&
        Objects.equals(this.expedient, sollicitudsRDTO.expedient) &&
        Objects.equals(this.hash, sollicitudsRDTO.hash) &&
        Objects.equals(this.id, sollicitudsRDTO.id) &&
        Objects.equals(this.iniciacio, sollicitudsRDTO.iniciacio) &&
        Objects.equals(this.iniciacioNom, sollicitudsRDTO.iniciacioNom) &&
        Objects.equals(this.personesImplicades, sollicitudsRDTO.personesImplicades) &&
        Objects.equals(this.personesInteressades, sollicitudsRDTO.personesInteressades) &&
        Objects.equals(this.personesSollicitudList, sollicitudsRDTO.personesSollicitudList) &&
        Objects.equals(this.registre, sollicitudsRDTO.registre) &&
        Objects.equals(this.registreAssentament, sollicitudsRDTO.registreAssentament) &&
        Objects.equals(this.signaturaSollicitud, sollicitudsRDTO.signaturaSollicitud) &&
        Objects.equals(this.tramitOvtIdext, sollicitudsRDTO.tramitOvtIdext) &&
        Objects.equals(this.tramitador, sollicitudsRDTO.tramitador);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comentari, dadesExternes, dataPresentacio, dataSollicitud, expedient, hash, id, iniciacio, iniciacioNom, personesImplicades, personesInteressades, personesSollicitudList, registre, registreAssentament, signaturaSollicitud, tramitOvtIdext, tramitador);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SollicitudsRDTO {\n");
    
    sb.append("    comentari: ").append(toIndentedString(comentari)).append("\n");
    sb.append("    dadesExternes: ").append(toIndentedString(dadesExternes)).append("\n");
    sb.append("    dataPresentacio: ").append(toIndentedString(dataPresentacio)).append("\n");
    sb.append("    dataSollicitud: ").append(toIndentedString(dataSollicitud)).append("\n");
    sb.append("    expedient: ").append(toIndentedString(expedient)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iniciacio: ").append(toIndentedString(iniciacio)).append("\n");
    sb.append("    iniciacioNom: ").append(toIndentedString(iniciacioNom)).append("\n");
    sb.append("    personesImplicades: ").append(toIndentedString(personesImplicades)).append("\n");
    sb.append("    personesInteressades: ").append(toIndentedString(personesInteressades)).append("\n");
    sb.append("    personesSollicitudList: ").append(toIndentedString(personesSollicitudList)).append("\n");
    sb.append("    registre: ").append(toIndentedString(registre)).append("\n");
    sb.append("    registreAssentament: ").append(toIndentedString(registreAssentament)).append("\n");
    sb.append("    signaturaSollicitud: ").append(toIndentedString(signaturaSollicitud)).append("\n");
    sb.append("    tramitOvtIdext: ").append(toIndentedString(tramitOvtIdext)).append("\n");
    sb.append("    tramitador: ").append(toIndentedString(tramitador)).append("\n");
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

