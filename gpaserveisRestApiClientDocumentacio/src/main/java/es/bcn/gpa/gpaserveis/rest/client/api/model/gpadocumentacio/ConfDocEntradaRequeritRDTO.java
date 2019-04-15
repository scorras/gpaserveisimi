/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.10.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.AtributsDocs;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfdocsentTramitsOvt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ConfDocEntradaRequeritRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-12T13:22:18.286+02:00")
public class ConfDocEntradaRequeritRDTO {
  @JsonProperty("atributsDocs")
  private AtributsDocs atributsDocs = null;

  @JsonProperty("comentari")
  private String comentari = null;

  @JsonProperty("confdocsentTramitsOvtList")
  private List<ConfdocsentTramitsOvt> confdocsentTramitsOvtList = null;

  @JsonProperty("descripcioAmpliada")
  private String descripcioAmpliada = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("nom")
  private String nom = null;

  @JsonProperty("nomCastella")
  private String nomCastella = null;

  @JsonProperty("suportConfeccio")
  private Integer suportConfeccio = null;

  @JsonProperty("suportEnllac")
  private String suportEnllac = null;

  @JsonProperty("uniqueId")
  private String uniqueId = null;

  public ConfDocEntradaRequeritRDTO atributsDocs(AtributsDocs atributsDocs) {
    this.atributsDocs = atributsDocs;
    return this;
  }

   /**
   * Get atributsDocs
   * @return atributsDocs
  **/
  @ApiModelProperty(value = "")
  public AtributsDocs getAtributsDocs() {
    return atributsDocs;
  }

  public void setAtributsDocs(AtributsDocs atributsDocs) {
    this.atributsDocs = atributsDocs;
  }

  public ConfDocEntradaRequeritRDTO comentari(String comentari) {
    this.comentari = comentari;
    return this;
  }

   /**
   * Get comentari
   * @return comentari
  **/
  @ApiModelProperty(value = "")
  public String getComentari() {
    return comentari;
  }

  public void setComentari(String comentari) {
    this.comentari = comentari;
  }

  public ConfDocEntradaRequeritRDTO confdocsentTramitsOvtList(List<ConfdocsentTramitsOvt> confdocsentTramitsOvtList) {
    this.confdocsentTramitsOvtList = confdocsentTramitsOvtList;
    return this;
  }

  public ConfDocEntradaRequeritRDTO addConfdocsentTramitsOvtListItem(ConfdocsentTramitsOvt confdocsentTramitsOvtListItem) {
    if (this.confdocsentTramitsOvtList == null) {
      this.confdocsentTramitsOvtList = new ArrayList<ConfdocsentTramitsOvt>();
    }
    this.confdocsentTramitsOvtList.add(confdocsentTramitsOvtListItem);
    return this;
  }

   /**
   * Get confdocsentTramitsOvtList
   * @return confdocsentTramitsOvtList
  **/
  @ApiModelProperty(value = "")
  public List<ConfdocsentTramitsOvt> getConfdocsentTramitsOvtList() {
    return confdocsentTramitsOvtList;
  }

  public void setConfdocsentTramitsOvtList(List<ConfdocsentTramitsOvt> confdocsentTramitsOvtList) {
    this.confdocsentTramitsOvtList = confdocsentTramitsOvtList;
  }

  public ConfDocEntradaRequeritRDTO descripcioAmpliada(String descripcioAmpliada) {
    this.descripcioAmpliada = descripcioAmpliada;
    return this;
  }

   /**
   * Get descripcioAmpliada
   * @return descripcioAmpliada
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioAmpliada() {
    return descripcioAmpliada;
  }

  public void setDescripcioAmpliada(String descripcioAmpliada) {
    this.descripcioAmpliada = descripcioAmpliada;
  }

  public ConfDocEntradaRequeritRDTO id(BigDecimal id) {
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

  public ConfDocEntradaRequeritRDTO nom(String nom) {
    this.nom = nom;
    return this;
  }

   /**
   * Get nom
   * @return nom
  **/
  @ApiModelProperty(value = "")
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public ConfDocEntradaRequeritRDTO nomCastella(String nomCastella) {
    this.nomCastella = nomCastella;
    return this;
  }

   /**
   * Get nomCastella
   * @return nomCastella
  **/
  @ApiModelProperty(value = "")
  public String getNomCastella() {
    return nomCastella;
  }

  public void setNomCastella(String nomCastella) {
    this.nomCastella = nomCastella;
  }

  public ConfDocEntradaRequeritRDTO suportConfeccio(Integer suportConfeccio) {
    this.suportConfeccio = suportConfeccio;
    return this;
  }

   /**
   * Get suportConfeccio
   * @return suportConfeccio
  **/
  @ApiModelProperty(value = "")
  public Integer getSuportConfeccio() {
    return suportConfeccio;
  }

  public void setSuportConfeccio(Integer suportConfeccio) {
    this.suportConfeccio = suportConfeccio;
  }

  public ConfDocEntradaRequeritRDTO suportEnllac(String suportEnllac) {
    this.suportEnllac = suportEnllac;
    return this;
  }

   /**
   * Get suportEnllac
   * @return suportEnllac
  **/
  @ApiModelProperty(value = "")
  public String getSuportEnllac() {
    return suportEnllac;
  }

  public void setSuportEnllac(String suportEnllac) {
    this.suportEnllac = suportEnllac;
  }

  public ConfDocEntradaRequeritRDTO uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @ApiModelProperty(value = "")
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfDocEntradaRequeritRDTO confDocEntradaRequeritRDTO = (ConfDocEntradaRequeritRDTO) o;
    return Objects.equals(this.atributsDocs, confDocEntradaRequeritRDTO.atributsDocs) &&
        Objects.equals(this.comentari, confDocEntradaRequeritRDTO.comentari) &&
        Objects.equals(this.confdocsentTramitsOvtList, confDocEntradaRequeritRDTO.confdocsentTramitsOvtList) &&
        Objects.equals(this.descripcioAmpliada, confDocEntradaRequeritRDTO.descripcioAmpliada) &&
        Objects.equals(this.id, confDocEntradaRequeritRDTO.id) &&
        Objects.equals(this.nom, confDocEntradaRequeritRDTO.nom) &&
        Objects.equals(this.nomCastella, confDocEntradaRequeritRDTO.nomCastella) &&
        Objects.equals(this.suportConfeccio, confDocEntradaRequeritRDTO.suportConfeccio) &&
        Objects.equals(this.suportEnllac, confDocEntradaRequeritRDTO.suportEnllac) &&
        Objects.equals(this.uniqueId, confDocEntradaRequeritRDTO.uniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atributsDocs, comentari, confdocsentTramitsOvtList, descripcioAmpliada, id, nom, nomCastella, suportConfeccio, suportEnllac, uniqueId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfDocEntradaRequeritRDTO {\n");
    
    sb.append("    atributsDocs: ").append(toIndentedString(atributsDocs)).append("\n");
    sb.append("    comentari: ").append(toIndentedString(comentari)).append("\n");
    sb.append("    confdocsentTramitsOvtList: ").append(toIndentedString(confdocsentTramitsOvtList)).append("\n");
    sb.append("    descripcioAmpliada: ").append(toIndentedString(descripcioAmpliada)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    nomCastella: ").append(toIndentedString(nomCastella)).append("\n");
    sb.append("    suportConfeccio: ").append(toIndentedString(suportConfeccio)).append("\n");
    sb.append("    suportEnllac: ").append(toIndentedString(suportEnllac)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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

