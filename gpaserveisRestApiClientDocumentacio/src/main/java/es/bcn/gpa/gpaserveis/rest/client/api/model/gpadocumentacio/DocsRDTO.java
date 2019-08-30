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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsFisics;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.RegistreAssentament;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * DocsRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-30T08:55:34.487+02:00")
public class DocsRDTO {
  @JsonProperty("codi")
  private String codi = null;

  @JsonProperty("comentari")
  private String comentari = null;

  @JsonProperty("dataCreacio")
  private DateTime dataCreacio = null;

  @JsonProperty("dataDigitalitzacio")
  private DateTime dataDigitalitzacio = null;

  @JsonProperty("dataUltimaModificacio")
  private DateTime dataUltimaModificacio = null;

  @JsonProperty("digitalitzat")
  private Integer digitalitzat = null;

  @JsonProperty("docsFisics")
  private DocsFisics docsFisics = null;

  @JsonProperty("docsFisicsNom")
  private String docsFisicsNom = null;

  @JsonProperty("documentFisic")
  private BigDecimal documentFisic = null;

  @JsonProperty("documentacio")
  private BigDecimal documentacio = null;

  @JsonProperty("editable")
  private Boolean editable = null;

  @JsonProperty("eliminat")
  private Integer eliminat = null;

  @JsonProperty("estatDigitalitzacio")
  private BigDecimal estatDigitalitzacio = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("idioma")
  private BigDecimal idioma = null;

  @JsonProperty("idiomaDigitalitzacio")
  private BigDecimal idiomaDigitalitzacio = null;

  @JsonProperty("metadata")
  private Map<String, List<String>> metadata = null;

  @JsonProperty("migracioIdOrigen")
  private String migracioIdOrigen = null;

  @JsonProperty("numDocsConfiguracio")
  private BigDecimal numDocsConfiguracio = null;

  @JsonProperty("obligatoriEnEstat")
  private Boolean obligatoriEnEstat = null;

  @JsonProperty("origen")
  private Integer origen = null;

  @JsonProperty("plantillaPdf")
  private Boolean plantillaPdf = null;

  @JsonProperty("registreAssentament")
  private RegistreAssentament registreAssentament = null;

  @JsonProperty("registreIdext")
  private BigDecimal registreIdext = null;

  @JsonProperty("seleccionable")
  private Boolean seleccionable = null;

  @JsonProperty("tipusMimeDescripcio")
  private String tipusMimeDescripcio = null;

  @JsonProperty("ultimaModificacioIdext")
  private BigDecimal ultimaModificacioIdext = null;

  @JsonProperty("urlDigitalitzacio")
  private String urlDigitalitzacio = null;

  @JsonProperty("usuariIdext")
  private BigDecimal usuariIdext = null;

  public DocsRDTO codi(String codi) {
    this.codi = codi;
    return this;
  }

   /**
   * Get codi
   * @return codi
  **/
  @ApiModelProperty(value = "")
  public String getCodi() {
    return codi;
  }

  public void setCodi(String codi) {
    this.codi = codi;
  }

  public DocsRDTO comentari(String comentari) {
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

  public DocsRDTO dataCreacio(DateTime dataCreacio) {
    this.dataCreacio = dataCreacio;
    return this;
  }

   /**
   * Get dataCreacio
   * @return dataCreacio
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataCreacio() {
    return dataCreacio;
  }

  public void setDataCreacio(DateTime dataCreacio) {
    this.dataCreacio = dataCreacio;
  }

  public DocsRDTO dataDigitalitzacio(DateTime dataDigitalitzacio) {
    this.dataDigitalitzacio = dataDigitalitzacio;
    return this;
  }

   /**
   * Get dataDigitalitzacio
   * @return dataDigitalitzacio
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataDigitalitzacio() {
    return dataDigitalitzacio;
  }

  public void setDataDigitalitzacio(DateTime dataDigitalitzacio) {
    this.dataDigitalitzacio = dataDigitalitzacio;
  }

  public DocsRDTO dataUltimaModificacio(DateTime dataUltimaModificacio) {
    this.dataUltimaModificacio = dataUltimaModificacio;
    return this;
  }

   /**
   * Get dataUltimaModificacio
   * @return dataUltimaModificacio
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataUltimaModificacio() {
    return dataUltimaModificacio;
  }

  public void setDataUltimaModificacio(DateTime dataUltimaModificacio) {
    this.dataUltimaModificacio = dataUltimaModificacio;
  }

  public DocsRDTO digitalitzat(Integer digitalitzat) {
    this.digitalitzat = digitalitzat;
    return this;
  }

   /**
   * Get digitalitzat
   * @return digitalitzat
  **/
  @ApiModelProperty(value = "")
  public Integer getDigitalitzat() {
    return digitalitzat;
  }

  public void setDigitalitzat(Integer digitalitzat) {
    this.digitalitzat = digitalitzat;
  }

  public DocsRDTO docsFisics(DocsFisics docsFisics) {
    this.docsFisics = docsFisics;
    return this;
  }

   /**
   * Get docsFisics
   * @return docsFisics
  **/
  @ApiModelProperty(value = "")
  public DocsFisics getDocsFisics() {
    return docsFisics;
  }

  public void setDocsFisics(DocsFisics docsFisics) {
    this.docsFisics = docsFisics;
  }

  public DocsRDTO docsFisicsNom(String docsFisicsNom) {
    this.docsFisicsNom = docsFisicsNom;
    return this;
  }

   /**
   * Get docsFisicsNom
   * @return docsFisicsNom
  **/
  @ApiModelProperty(value = "")
  public String getDocsFisicsNom() {
    return docsFisicsNom;
  }

  public void setDocsFisicsNom(String docsFisicsNom) {
    this.docsFisicsNom = docsFisicsNom;
  }

  public DocsRDTO documentFisic(BigDecimal documentFisic) {
    this.documentFisic = documentFisic;
    return this;
  }

   /**
   * Get documentFisic
   * @return documentFisic
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDocumentFisic() {
    return documentFisic;
  }

  public void setDocumentFisic(BigDecimal documentFisic) {
    this.documentFisic = documentFisic;
  }

  public DocsRDTO documentacio(BigDecimal documentacio) {
    this.documentacio = documentacio;
    return this;
  }

   /**
   * Get documentacio
   * @return documentacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDocumentacio() {
    return documentacio;
  }

  public void setDocumentacio(BigDecimal documentacio) {
    this.documentacio = documentacio;
  }

  public DocsRDTO editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

   /**
   * Get editable
   * @return editable
  **/
  @ApiModelProperty(value = "")
  public Boolean isEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public DocsRDTO eliminat(Integer eliminat) {
    this.eliminat = eliminat;
    return this;
  }

   /**
   * Get eliminat
   * @return eliminat
  **/
  @ApiModelProperty(value = "")
  public Integer getEliminat() {
    return eliminat;
  }

  public void setEliminat(Integer eliminat) {
    this.eliminat = eliminat;
  }

  public DocsRDTO estatDigitalitzacio(BigDecimal estatDigitalitzacio) {
    this.estatDigitalitzacio = estatDigitalitzacio;
    return this;
  }

   /**
   * Get estatDigitalitzacio
   * @return estatDigitalitzacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatDigitalitzacio() {
    return estatDigitalitzacio;
  }

  public void setEstatDigitalitzacio(BigDecimal estatDigitalitzacio) {
    this.estatDigitalitzacio = estatDigitalitzacio;
  }

  public DocsRDTO id(BigDecimal id) {
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

  public DocsRDTO idioma(BigDecimal idioma) {
    this.idioma = idioma;
    return this;
  }

   /**
   * Get idioma
   * @return idioma
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdioma() {
    return idioma;
  }

  public void setIdioma(BigDecimal idioma) {
    this.idioma = idioma;
  }

  public DocsRDTO idiomaDigitalitzacio(BigDecimal idiomaDigitalitzacio) {
    this.idiomaDigitalitzacio = idiomaDigitalitzacio;
    return this;
  }

   /**
   * Get idiomaDigitalitzacio
   * @return idiomaDigitalitzacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdiomaDigitalitzacio() {
    return idiomaDigitalitzacio;
  }

  public void setIdiomaDigitalitzacio(BigDecimal idiomaDigitalitzacio) {
    this.idiomaDigitalitzacio = idiomaDigitalitzacio;
  }

  public DocsRDTO metadata(Map<String, List<String>> metadata) {
    this.metadata = metadata;
    return this;
  }

  public DocsRDTO putMetadataItem(String key, List<String> metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, List<String>>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<String>> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, List<String>> metadata) {
    this.metadata = metadata;
  }

  public DocsRDTO migracioIdOrigen(String migracioIdOrigen) {
    this.migracioIdOrigen = migracioIdOrigen;
    return this;
  }

   /**
   * Get migracioIdOrigen
   * @return migracioIdOrigen
  **/
  @ApiModelProperty(value = "")
  public String getMigracioIdOrigen() {
    return migracioIdOrigen;
  }

  public void setMigracioIdOrigen(String migracioIdOrigen) {
    this.migracioIdOrigen = migracioIdOrigen;
  }

  public DocsRDTO numDocsConfiguracio(BigDecimal numDocsConfiguracio) {
    this.numDocsConfiguracio = numDocsConfiguracio;
    return this;
  }

   /**
   * Get numDocsConfiguracio
   * @return numDocsConfiguracio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getNumDocsConfiguracio() {
    return numDocsConfiguracio;
  }

  public void setNumDocsConfiguracio(BigDecimal numDocsConfiguracio) {
    this.numDocsConfiguracio = numDocsConfiguracio;
  }

  public DocsRDTO obligatoriEnEstat(Boolean obligatoriEnEstat) {
    this.obligatoriEnEstat = obligatoriEnEstat;
    return this;
  }

   /**
   * Get obligatoriEnEstat
   * @return obligatoriEnEstat
  **/
  @ApiModelProperty(value = "")
  public Boolean isObligatoriEnEstat() {
    return obligatoriEnEstat;
  }

  public void setObligatoriEnEstat(Boolean obligatoriEnEstat) {
    this.obligatoriEnEstat = obligatoriEnEstat;
  }

  public DocsRDTO origen(Integer origen) {
    this.origen = origen;
    return this;
  }

   /**
   * Get origen
   * @return origen
  **/
  @ApiModelProperty(value = "")
  public Integer getOrigen() {
    return origen;
  }

  public void setOrigen(Integer origen) {
    this.origen = origen;
  }

  public DocsRDTO plantillaPdf(Boolean plantillaPdf) {
    this.plantillaPdf = plantillaPdf;
    return this;
  }

   /**
   * Get plantillaPdf
   * @return plantillaPdf
  **/
  @ApiModelProperty(value = "")
  public Boolean isPlantillaPdf() {
    return plantillaPdf;
  }

  public void setPlantillaPdf(Boolean plantillaPdf) {
    this.plantillaPdf = plantillaPdf;
  }

  public DocsRDTO registreAssentament(RegistreAssentament registreAssentament) {
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

  public DocsRDTO registreIdext(BigDecimal registreIdext) {
    this.registreIdext = registreIdext;
    return this;
  }

   /**
   * Get registreIdext
   * @return registreIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRegistreIdext() {
    return registreIdext;
  }

  public void setRegistreIdext(BigDecimal registreIdext) {
    this.registreIdext = registreIdext;
  }

  public DocsRDTO seleccionable(Boolean seleccionable) {
    this.seleccionable = seleccionable;
    return this;
  }

   /**
   * Get seleccionable
   * @return seleccionable
  **/
  @ApiModelProperty(value = "")
  public Boolean isSeleccionable() {
    return seleccionable;
  }

  public void setSeleccionable(Boolean seleccionable) {
    this.seleccionable = seleccionable;
  }

  public DocsRDTO tipusMimeDescripcio(String tipusMimeDescripcio) {
    this.tipusMimeDescripcio = tipusMimeDescripcio;
    return this;
  }

   /**
   * Get tipusMimeDescripcio
   * @return tipusMimeDescripcio
  **/
  @ApiModelProperty(value = "")
  public String getTipusMimeDescripcio() {
    return tipusMimeDescripcio;
  }

  public void setTipusMimeDescripcio(String tipusMimeDescripcio) {
    this.tipusMimeDescripcio = tipusMimeDescripcio;
  }

  public DocsRDTO ultimaModificacioIdext(BigDecimal ultimaModificacioIdext) {
    this.ultimaModificacioIdext = ultimaModificacioIdext;
    return this;
  }

   /**
   * Get ultimaModificacioIdext
   * @return ultimaModificacioIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUltimaModificacioIdext() {
    return ultimaModificacioIdext;
  }

  public void setUltimaModificacioIdext(BigDecimal ultimaModificacioIdext) {
    this.ultimaModificacioIdext = ultimaModificacioIdext;
  }

  public DocsRDTO urlDigitalitzacio(String urlDigitalitzacio) {
    this.urlDigitalitzacio = urlDigitalitzacio;
    return this;
  }

   /**
   * Get urlDigitalitzacio
   * @return urlDigitalitzacio
  **/
  @ApiModelProperty(value = "")
  public String getUrlDigitalitzacio() {
    return urlDigitalitzacio;
  }

  public void setUrlDigitalitzacio(String urlDigitalitzacio) {
    this.urlDigitalitzacio = urlDigitalitzacio;
  }

  public DocsRDTO usuariIdext(BigDecimal usuariIdext) {
    this.usuariIdext = usuariIdext;
    return this;
  }

   /**
   * Get usuariIdext
   * @return usuariIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUsuariIdext() {
    return usuariIdext;
  }

  public void setUsuariIdext(BigDecimal usuariIdext) {
    this.usuariIdext = usuariIdext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsRDTO docsRDTO = (DocsRDTO) o;
    return Objects.equals(this.codi, docsRDTO.codi) &&
        Objects.equals(this.comentari, docsRDTO.comentari) &&
        Objects.equals(this.dataCreacio, docsRDTO.dataCreacio) &&
        Objects.equals(this.dataDigitalitzacio, docsRDTO.dataDigitalitzacio) &&
        Objects.equals(this.dataUltimaModificacio, docsRDTO.dataUltimaModificacio) &&
        Objects.equals(this.digitalitzat, docsRDTO.digitalitzat) &&
        Objects.equals(this.docsFisics, docsRDTO.docsFisics) &&
        Objects.equals(this.docsFisicsNom, docsRDTO.docsFisicsNom) &&
        Objects.equals(this.documentFisic, docsRDTO.documentFisic) &&
        Objects.equals(this.documentacio, docsRDTO.documentacio) &&
        Objects.equals(this.editable, docsRDTO.editable) &&
        Objects.equals(this.eliminat, docsRDTO.eliminat) &&
        Objects.equals(this.estatDigitalitzacio, docsRDTO.estatDigitalitzacio) &&
        Objects.equals(this.id, docsRDTO.id) &&
        Objects.equals(this.idioma, docsRDTO.idioma) &&
        Objects.equals(this.idiomaDigitalitzacio, docsRDTO.idiomaDigitalitzacio) &&
        Objects.equals(this.metadata, docsRDTO.metadata) &&
        Objects.equals(this.migracioIdOrigen, docsRDTO.migracioIdOrigen) &&
        Objects.equals(this.numDocsConfiguracio, docsRDTO.numDocsConfiguracio) &&
        Objects.equals(this.obligatoriEnEstat, docsRDTO.obligatoriEnEstat) &&
        Objects.equals(this.origen, docsRDTO.origen) &&
        Objects.equals(this.plantillaPdf, docsRDTO.plantillaPdf) &&
        Objects.equals(this.registreAssentament, docsRDTO.registreAssentament) &&
        Objects.equals(this.registreIdext, docsRDTO.registreIdext) &&
        Objects.equals(this.seleccionable, docsRDTO.seleccionable) &&
        Objects.equals(this.tipusMimeDescripcio, docsRDTO.tipusMimeDescripcio) &&
        Objects.equals(this.ultimaModificacioIdext, docsRDTO.ultimaModificacioIdext) &&
        Objects.equals(this.urlDigitalitzacio, docsRDTO.urlDigitalitzacio) &&
        Objects.equals(this.usuariIdext, docsRDTO.usuariIdext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codi, comentari, dataCreacio, dataDigitalitzacio, dataUltimaModificacio, digitalitzat, docsFisics, docsFisicsNom, documentFisic, documentacio, editable, eliminat, estatDigitalitzacio, id, idioma, idiomaDigitalitzacio, metadata, migracioIdOrigen, numDocsConfiguracio, obligatoriEnEstat, origen, plantillaPdf, registreAssentament, registreIdext, seleccionable, tipusMimeDescripcio, ultimaModificacioIdext, urlDigitalitzacio, usuariIdext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsRDTO {\n");
    
    sb.append("    codi: ").append(toIndentedString(codi)).append("\n");
    sb.append("    comentari: ").append(toIndentedString(comentari)).append("\n");
    sb.append("    dataCreacio: ").append(toIndentedString(dataCreacio)).append("\n");
    sb.append("    dataDigitalitzacio: ").append(toIndentedString(dataDigitalitzacio)).append("\n");
    sb.append("    dataUltimaModificacio: ").append(toIndentedString(dataUltimaModificacio)).append("\n");
    sb.append("    digitalitzat: ").append(toIndentedString(digitalitzat)).append("\n");
    sb.append("    docsFisics: ").append(toIndentedString(docsFisics)).append("\n");
    sb.append("    docsFisicsNom: ").append(toIndentedString(docsFisicsNom)).append("\n");
    sb.append("    documentFisic: ").append(toIndentedString(documentFisic)).append("\n");
    sb.append("    documentacio: ").append(toIndentedString(documentacio)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    eliminat: ").append(toIndentedString(eliminat)).append("\n");
    sb.append("    estatDigitalitzacio: ").append(toIndentedString(estatDigitalitzacio)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idioma: ").append(toIndentedString(idioma)).append("\n");
    sb.append("    idiomaDigitalitzacio: ").append(toIndentedString(idiomaDigitalitzacio)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    migracioIdOrigen: ").append(toIndentedString(migracioIdOrigen)).append("\n");
    sb.append("    numDocsConfiguracio: ").append(toIndentedString(numDocsConfiguracio)).append("\n");
    sb.append("    obligatoriEnEstat: ").append(toIndentedString(obligatoriEnEstat)).append("\n");
    sb.append("    origen: ").append(toIndentedString(origen)).append("\n");
    sb.append("    plantillaPdf: ").append(toIndentedString(plantillaPdf)).append("\n");
    sb.append("    registreAssentament: ").append(toIndentedString(registreAssentament)).append("\n");
    sb.append("    registreIdext: ").append(toIndentedString(registreIdext)).append("\n");
    sb.append("    seleccionable: ").append(toIndentedString(seleccionable)).append("\n");
    sb.append("    tipusMimeDescripcio: ").append(toIndentedString(tipusMimeDescripcio)).append("\n");
    sb.append("    ultimaModificacioIdext: ").append(toIndentedString(ultimaModificacioIdext)).append("\n");
    sb.append("    urlDigitalitzacio: ").append(toIndentedString(urlDigitalitzacio)).append("\n");
    sb.append("    usuariIdext: ").append(toIndentedString(usuariIdext)).append("\n");
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

