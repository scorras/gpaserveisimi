/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.16.2
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfiguracioDocsTramitacio;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsFisics;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsSignatures;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.EstatsDocsTramitacio;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.Notificacions;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.RegistreAssentament;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.Requeriments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * DocsTramitacioRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T12:24:18.517+01:00")
public class DocsTramitacioRDTO {
  @JsonProperty("canalComunicat")
  private BigDecimal canalComunicat = null;

  @JsonProperty("codi")
  private String codi = null;

  @JsonProperty("comentari")
  private String comentari = null;

  @JsonProperty("comunicat")
  private Integer comunicat = null;

  @JsonProperty("configDocTramitacio")
  private BigDecimal configDocTramitacio = null;

  @JsonProperty("configuracioDocsTramitacio")
  private ConfiguracioDocsTramitacio configuracioDocsTramitacio = null;

  @JsonProperty("configuracioDocsTramitacioNom")
  private String configuracioDocsTramitacioNom = null;

  @JsonProperty("dataComunicat")
  private DateTime dataComunicat = null;

  @JsonProperty("dataCreacio")
  private DateTime dataCreacio = null;

  @JsonProperty("dataDigitalitzacio")
  private DateTime dataDigitalitzacio = null;

  @JsonProperty("dataUltimaModificacio")
  private DateTime dataUltimaModificacio = null;

  @JsonProperty("descripcioEstat")
  private String descripcioEstat = null;

  @JsonProperty("digitalitzat")
  private Integer digitalitzat = null;

  @JsonProperty("docsFisics")
  private DocsFisics docsFisics = null;

  @JsonProperty("docsFisicsNom")
  private String docsFisicsNom = null;

  @JsonProperty("docsSignatures")
  private DocsSignatures docsSignatures = null;

  @JsonProperty("docsTercers")
  private Integer docsTercers = null;

  @JsonProperty("documentFisic")
  private BigDecimal documentFisic = null;

  @JsonProperty("documentacio")
  private BigDecimal documentacio = null;

  @JsonProperty("editable")
  private Boolean editable = null;

  @JsonProperty("eliminat")
  private Integer eliminat = null;

  @JsonProperty("estat")
  private BigDecimal estat = null;

  @JsonProperty("estatAnterior")
  private BigDecimal estatAnterior = null;

  @JsonProperty("estatDigitalitzacio")
  private BigDecimal estatDigitalitzacio = null;

  @JsonProperty("estatDocsTramitacio")
  private BigDecimal estatDocsTramitacio = null;

  @JsonProperty("estatsDocsTramitacio")
  private EstatsDocsTramitacio estatsDocsTramitacio = null;

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

  @JsonProperty("missatgeComunicat")
  private String missatgeComunicat = null;

  @JsonProperty("notificacio")
  private BigDecimal notificacio = null;

  @JsonProperty("notificacions")
  private Notificacions notificacions = null;

  @JsonProperty("numDocsConfiguracio")
  private BigDecimal numDocsConfiguracio = null;

  @JsonProperty("obligatoriEnEstat")
  private Boolean obligatoriEnEstat = null;

  @JsonProperty("origen")
  private Integer origen = null;

  @JsonProperty("plantillaPdf")
  private Boolean plantillaPdf = null;

  @JsonProperty("publicarInfoPublica")
  private Integer publicarInfoPublica = null;

  @JsonProperty("registreAssentament")
  private RegistreAssentament registreAssentament = null;

  @JsonProperty("registreIdext")
  private BigDecimal registreIdext = null;

  @JsonProperty("requereixSignatura")
  private Integer requereixSignatura = null;

  @JsonProperty("requeriments")
  private Requeriments requeriments = null;

  @JsonProperty("seleccionable")
  private Boolean seleccionable = null;

  @JsonProperty("tipusMimeDescripcio")
  private String tipusMimeDescripcio = null;

  @JsonProperty("ultimaModificacioIdext")
  private BigDecimal ultimaModificacioIdext = null;

  @JsonProperty("ultimaSignatura")
  private BigDecimal ultimaSignatura = null;

  @JsonProperty("urlDigitalitzacio")
  private String urlDigitalitzacio = null;

  @JsonProperty("usuariIdext")
  private BigDecimal usuariIdext = null;

  @JsonProperty("usuariSignaturaNom")
  private String usuariSignaturaNom = null;

  public DocsTramitacioRDTO canalComunicat(BigDecimal canalComunicat) {
    this.canalComunicat = canalComunicat;
    return this;
  }

   /**
   * Get canalComunicat
   * @return canalComunicat
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCanalComunicat() {
    return canalComunicat;
  }

  public void setCanalComunicat(BigDecimal canalComunicat) {
    this.canalComunicat = canalComunicat;
  }

  public DocsTramitacioRDTO codi(String codi) {
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

  public DocsTramitacioRDTO comentari(String comentari) {
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

  public DocsTramitacioRDTO comunicat(Integer comunicat) {
    this.comunicat = comunicat;
    return this;
  }

   /**
   * Get comunicat
   * @return comunicat
  **/
  @ApiModelProperty(value = "")
  public Integer getComunicat() {
    return comunicat;
  }

  public void setComunicat(Integer comunicat) {
    this.comunicat = comunicat;
  }

  public DocsTramitacioRDTO configDocTramitacio(BigDecimal configDocTramitacio) {
    this.configDocTramitacio = configDocTramitacio;
    return this;
  }

   /**
   * Get configDocTramitacio
   * @return configDocTramitacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getConfigDocTramitacio() {
    return configDocTramitacio;
  }

  public void setConfigDocTramitacio(BigDecimal configDocTramitacio) {
    this.configDocTramitacio = configDocTramitacio;
  }

  public DocsTramitacioRDTO configuracioDocsTramitacio(ConfiguracioDocsTramitacio configuracioDocsTramitacio) {
    this.configuracioDocsTramitacio = configuracioDocsTramitacio;
    return this;
  }

   /**
   * Get configuracioDocsTramitacio
   * @return configuracioDocsTramitacio
  **/
  @ApiModelProperty(value = "")
  public ConfiguracioDocsTramitacio getConfiguracioDocsTramitacio() {
    return configuracioDocsTramitacio;
  }

  public void setConfiguracioDocsTramitacio(ConfiguracioDocsTramitacio configuracioDocsTramitacio) {
    this.configuracioDocsTramitacio = configuracioDocsTramitacio;
  }

  public DocsTramitacioRDTO configuracioDocsTramitacioNom(String configuracioDocsTramitacioNom) {
    this.configuracioDocsTramitacioNom = configuracioDocsTramitacioNom;
    return this;
  }

   /**
   * Get configuracioDocsTramitacioNom
   * @return configuracioDocsTramitacioNom
  **/
  @ApiModelProperty(value = "")
  public String getConfiguracioDocsTramitacioNom() {
    return configuracioDocsTramitacioNom;
  }

  public void setConfiguracioDocsTramitacioNom(String configuracioDocsTramitacioNom) {
    this.configuracioDocsTramitacioNom = configuracioDocsTramitacioNom;
  }

  public DocsTramitacioRDTO dataComunicat(DateTime dataComunicat) {
    this.dataComunicat = dataComunicat;
    return this;
  }

   /**
   * Get dataComunicat
   * @return dataComunicat
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataComunicat() {
    return dataComunicat;
  }

  public void setDataComunicat(DateTime dataComunicat) {
    this.dataComunicat = dataComunicat;
  }

  public DocsTramitacioRDTO dataCreacio(DateTime dataCreacio) {
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

  public DocsTramitacioRDTO dataDigitalitzacio(DateTime dataDigitalitzacio) {
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

  public DocsTramitacioRDTO dataUltimaModificacio(DateTime dataUltimaModificacio) {
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

  public DocsTramitacioRDTO descripcioEstat(String descripcioEstat) {
    this.descripcioEstat = descripcioEstat;
    return this;
  }

   /**
   * Get descripcioEstat
   * @return descripcioEstat
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioEstat() {
    return descripcioEstat;
  }

  public void setDescripcioEstat(String descripcioEstat) {
    this.descripcioEstat = descripcioEstat;
  }

  public DocsTramitacioRDTO digitalitzat(Integer digitalitzat) {
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

  public DocsTramitacioRDTO docsFisics(DocsFisics docsFisics) {
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

  public DocsTramitacioRDTO docsFisicsNom(String docsFisicsNom) {
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

  public DocsTramitacioRDTO docsSignatures(DocsSignatures docsSignatures) {
    this.docsSignatures = docsSignatures;
    return this;
  }

   /**
   * Get docsSignatures
   * @return docsSignatures
  **/
  @ApiModelProperty(value = "")
  public DocsSignatures getDocsSignatures() {
    return docsSignatures;
  }

  public void setDocsSignatures(DocsSignatures docsSignatures) {
    this.docsSignatures = docsSignatures;
  }

  public DocsTramitacioRDTO docsTercers(Integer docsTercers) {
    this.docsTercers = docsTercers;
    return this;
  }

   /**
   * Get docsTercers
   * @return docsTercers
  **/
  @ApiModelProperty(value = "")
  public Integer getDocsTercers() {
    return docsTercers;
  }

  public void setDocsTercers(Integer docsTercers) {
    this.docsTercers = docsTercers;
  }

  public DocsTramitacioRDTO documentFisic(BigDecimal documentFisic) {
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

  public DocsTramitacioRDTO documentacio(BigDecimal documentacio) {
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

  public DocsTramitacioRDTO editable(Boolean editable) {
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

  public DocsTramitacioRDTO eliminat(Integer eliminat) {
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

  public DocsTramitacioRDTO estat(BigDecimal estat) {
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

  public DocsTramitacioRDTO estatAnterior(BigDecimal estatAnterior) {
    this.estatAnterior = estatAnterior;
    return this;
  }

   /**
   * Get estatAnterior
   * @return estatAnterior
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatAnterior() {
    return estatAnterior;
  }

  public void setEstatAnterior(BigDecimal estatAnterior) {
    this.estatAnterior = estatAnterior;
  }

  public DocsTramitacioRDTO estatDigitalitzacio(BigDecimal estatDigitalitzacio) {
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

  public DocsTramitacioRDTO estatDocsTramitacio(BigDecimal estatDocsTramitacio) {
    this.estatDocsTramitacio = estatDocsTramitacio;
    return this;
  }

   /**
   * Get estatDocsTramitacio
   * @return estatDocsTramitacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatDocsTramitacio() {
    return estatDocsTramitacio;
  }

  public void setEstatDocsTramitacio(BigDecimal estatDocsTramitacio) {
    this.estatDocsTramitacio = estatDocsTramitacio;
  }

  public DocsTramitacioRDTO estatsDocsTramitacio(EstatsDocsTramitacio estatsDocsTramitacio) {
    this.estatsDocsTramitacio = estatsDocsTramitacio;
    return this;
  }

   /**
   * Get estatsDocsTramitacio
   * @return estatsDocsTramitacio
  **/
  @ApiModelProperty(value = "")
  public EstatsDocsTramitacio getEstatsDocsTramitacio() {
    return estatsDocsTramitacio;
  }

  public void setEstatsDocsTramitacio(EstatsDocsTramitacio estatsDocsTramitacio) {
    this.estatsDocsTramitacio = estatsDocsTramitacio;
  }

  public DocsTramitacioRDTO id(BigDecimal id) {
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

  public DocsTramitacioRDTO idioma(BigDecimal idioma) {
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

  public DocsTramitacioRDTO idiomaDigitalitzacio(BigDecimal idiomaDigitalitzacio) {
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

  public DocsTramitacioRDTO metadata(Map<String, List<String>> metadata) {
    this.metadata = metadata;
    return this;
  }

  public DocsTramitacioRDTO putMetadataItem(String key, List<String> metadataItem) {
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

  public DocsTramitacioRDTO migracioIdOrigen(String migracioIdOrigen) {
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

  public DocsTramitacioRDTO missatgeComunicat(String missatgeComunicat) {
    this.missatgeComunicat = missatgeComunicat;
    return this;
  }

   /**
   * Get missatgeComunicat
   * @return missatgeComunicat
  **/
  @ApiModelProperty(value = "")
  public String getMissatgeComunicat() {
    return missatgeComunicat;
  }

  public void setMissatgeComunicat(String missatgeComunicat) {
    this.missatgeComunicat = missatgeComunicat;
  }

  public DocsTramitacioRDTO notificacio(BigDecimal notificacio) {
    this.notificacio = notificacio;
    return this;
  }

   /**
   * Get notificacio
   * @return notificacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getNotificacio() {
    return notificacio;
  }

  public void setNotificacio(BigDecimal notificacio) {
    this.notificacio = notificacio;
  }

  public DocsTramitacioRDTO notificacions(Notificacions notificacions) {
    this.notificacions = notificacions;
    return this;
  }

   /**
   * Get notificacions
   * @return notificacions
  **/
  @ApiModelProperty(value = "")
  public Notificacions getNotificacions() {
    return notificacions;
  }

  public void setNotificacions(Notificacions notificacions) {
    this.notificacions = notificacions;
  }

  public DocsTramitacioRDTO numDocsConfiguracio(BigDecimal numDocsConfiguracio) {
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

  public DocsTramitacioRDTO obligatoriEnEstat(Boolean obligatoriEnEstat) {
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

  public DocsTramitacioRDTO origen(Integer origen) {
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

  public DocsTramitacioRDTO plantillaPdf(Boolean plantillaPdf) {
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

  public DocsTramitacioRDTO publicarInfoPublica(Integer publicarInfoPublica) {
    this.publicarInfoPublica = publicarInfoPublica;
    return this;
  }

   /**
   * Get publicarInfoPublica
   * @return publicarInfoPublica
  **/
  @ApiModelProperty(value = "")
  public Integer getPublicarInfoPublica() {
    return publicarInfoPublica;
  }

  public void setPublicarInfoPublica(Integer publicarInfoPublica) {
    this.publicarInfoPublica = publicarInfoPublica;
  }

  public DocsTramitacioRDTO registreAssentament(RegistreAssentament registreAssentament) {
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

  public DocsTramitacioRDTO registreIdext(BigDecimal registreIdext) {
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

  public DocsTramitacioRDTO requereixSignatura(Integer requereixSignatura) {
    this.requereixSignatura = requereixSignatura;
    return this;
  }

   /**
   * Get requereixSignatura
   * @return requereixSignatura
  **/
  @ApiModelProperty(value = "")
  public Integer getRequereixSignatura() {
    return requereixSignatura;
  }

  public void setRequereixSignatura(Integer requereixSignatura) {
    this.requereixSignatura = requereixSignatura;
  }

  public DocsTramitacioRDTO requeriments(Requeriments requeriments) {
    this.requeriments = requeriments;
    return this;
  }

   /**
   * Get requeriments
   * @return requeriments
  **/
  @ApiModelProperty(value = "")
  public Requeriments getRequeriments() {
    return requeriments;
  }

  public void setRequeriments(Requeriments requeriments) {
    this.requeriments = requeriments;
  }

  public DocsTramitacioRDTO seleccionable(Boolean seleccionable) {
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

  public DocsTramitacioRDTO tipusMimeDescripcio(String tipusMimeDescripcio) {
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

  public DocsTramitacioRDTO ultimaModificacioIdext(BigDecimal ultimaModificacioIdext) {
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

  public DocsTramitacioRDTO ultimaSignatura(BigDecimal ultimaSignatura) {
    this.ultimaSignatura = ultimaSignatura;
    return this;
  }

   /**
   * Get ultimaSignatura
   * @return ultimaSignatura
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUltimaSignatura() {
    return ultimaSignatura;
  }

  public void setUltimaSignatura(BigDecimal ultimaSignatura) {
    this.ultimaSignatura = ultimaSignatura;
  }

  public DocsTramitacioRDTO urlDigitalitzacio(String urlDigitalitzacio) {
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

  public DocsTramitacioRDTO usuariIdext(BigDecimal usuariIdext) {
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

  public DocsTramitacioRDTO usuariSignaturaNom(String usuariSignaturaNom) {
    this.usuariSignaturaNom = usuariSignaturaNom;
    return this;
  }

   /**
   * Get usuariSignaturaNom
   * @return usuariSignaturaNom
  **/
  @ApiModelProperty(value = "")
  public String getUsuariSignaturaNom() {
    return usuariSignaturaNom;
  }

  public void setUsuariSignaturaNom(String usuariSignaturaNom) {
    this.usuariSignaturaNom = usuariSignaturaNom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsTramitacioRDTO docsTramitacioRDTO = (DocsTramitacioRDTO) o;
    return Objects.equals(this.canalComunicat, docsTramitacioRDTO.canalComunicat) &&
        Objects.equals(this.codi, docsTramitacioRDTO.codi) &&
        Objects.equals(this.comentari, docsTramitacioRDTO.comentari) &&
        Objects.equals(this.comunicat, docsTramitacioRDTO.comunicat) &&
        Objects.equals(this.configDocTramitacio, docsTramitacioRDTO.configDocTramitacio) &&
        Objects.equals(this.configuracioDocsTramitacio, docsTramitacioRDTO.configuracioDocsTramitacio) &&
        Objects.equals(this.configuracioDocsTramitacioNom, docsTramitacioRDTO.configuracioDocsTramitacioNom) &&
        Objects.equals(this.dataComunicat, docsTramitacioRDTO.dataComunicat) &&
        Objects.equals(this.dataCreacio, docsTramitacioRDTO.dataCreacio) &&
        Objects.equals(this.dataDigitalitzacio, docsTramitacioRDTO.dataDigitalitzacio) &&
        Objects.equals(this.dataUltimaModificacio, docsTramitacioRDTO.dataUltimaModificacio) &&
        Objects.equals(this.descripcioEstat, docsTramitacioRDTO.descripcioEstat) &&
        Objects.equals(this.digitalitzat, docsTramitacioRDTO.digitalitzat) &&
        Objects.equals(this.docsFisics, docsTramitacioRDTO.docsFisics) &&
        Objects.equals(this.docsFisicsNom, docsTramitacioRDTO.docsFisicsNom) &&
        Objects.equals(this.docsSignatures, docsTramitacioRDTO.docsSignatures) &&
        Objects.equals(this.docsTercers, docsTramitacioRDTO.docsTercers) &&
        Objects.equals(this.documentFisic, docsTramitacioRDTO.documentFisic) &&
        Objects.equals(this.documentacio, docsTramitacioRDTO.documentacio) &&
        Objects.equals(this.editable, docsTramitacioRDTO.editable) &&
        Objects.equals(this.eliminat, docsTramitacioRDTO.eliminat) &&
        Objects.equals(this.estat, docsTramitacioRDTO.estat) &&
        Objects.equals(this.estatAnterior, docsTramitacioRDTO.estatAnterior) &&
        Objects.equals(this.estatDigitalitzacio, docsTramitacioRDTO.estatDigitalitzacio) &&
        Objects.equals(this.estatDocsTramitacio, docsTramitacioRDTO.estatDocsTramitacio) &&
        Objects.equals(this.estatsDocsTramitacio, docsTramitacioRDTO.estatsDocsTramitacio) &&
        Objects.equals(this.id, docsTramitacioRDTO.id) &&
        Objects.equals(this.idioma, docsTramitacioRDTO.idioma) &&
        Objects.equals(this.idiomaDigitalitzacio, docsTramitacioRDTO.idiomaDigitalitzacio) &&
        Objects.equals(this.metadata, docsTramitacioRDTO.metadata) &&
        Objects.equals(this.migracioIdOrigen, docsTramitacioRDTO.migracioIdOrigen) &&
        Objects.equals(this.missatgeComunicat, docsTramitacioRDTO.missatgeComunicat) &&
        Objects.equals(this.notificacio, docsTramitacioRDTO.notificacio) &&
        Objects.equals(this.notificacions, docsTramitacioRDTO.notificacions) &&
        Objects.equals(this.numDocsConfiguracio, docsTramitacioRDTO.numDocsConfiguracio) &&
        Objects.equals(this.obligatoriEnEstat, docsTramitacioRDTO.obligatoriEnEstat) &&
        Objects.equals(this.origen, docsTramitacioRDTO.origen) &&
        Objects.equals(this.plantillaPdf, docsTramitacioRDTO.plantillaPdf) &&
        Objects.equals(this.publicarInfoPublica, docsTramitacioRDTO.publicarInfoPublica) &&
        Objects.equals(this.registreAssentament, docsTramitacioRDTO.registreAssentament) &&
        Objects.equals(this.registreIdext, docsTramitacioRDTO.registreIdext) &&
        Objects.equals(this.requereixSignatura, docsTramitacioRDTO.requereixSignatura) &&
        Objects.equals(this.requeriments, docsTramitacioRDTO.requeriments) &&
        Objects.equals(this.seleccionable, docsTramitacioRDTO.seleccionable) &&
        Objects.equals(this.tipusMimeDescripcio, docsTramitacioRDTO.tipusMimeDescripcio) &&
        Objects.equals(this.ultimaModificacioIdext, docsTramitacioRDTO.ultimaModificacioIdext) &&
        Objects.equals(this.ultimaSignatura, docsTramitacioRDTO.ultimaSignatura) &&
        Objects.equals(this.urlDigitalitzacio, docsTramitacioRDTO.urlDigitalitzacio) &&
        Objects.equals(this.usuariIdext, docsTramitacioRDTO.usuariIdext) &&
        Objects.equals(this.usuariSignaturaNom, docsTramitacioRDTO.usuariSignaturaNom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canalComunicat, codi, comentari, comunicat, configDocTramitacio, configuracioDocsTramitacio, configuracioDocsTramitacioNom, dataComunicat, dataCreacio, dataDigitalitzacio, dataUltimaModificacio, descripcioEstat, digitalitzat, docsFisics, docsFisicsNom, docsSignatures, docsTercers, documentFisic, documentacio, editable, eliminat, estat, estatAnterior, estatDigitalitzacio, estatDocsTramitacio, estatsDocsTramitacio, id, idioma, idiomaDigitalitzacio, metadata, migracioIdOrigen, missatgeComunicat, notificacio, notificacions, numDocsConfiguracio, obligatoriEnEstat, origen, plantillaPdf, publicarInfoPublica, registreAssentament, registreIdext, requereixSignatura, requeriments, seleccionable, tipusMimeDescripcio, ultimaModificacioIdext, ultimaSignatura, urlDigitalitzacio, usuariIdext, usuariSignaturaNom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsTramitacioRDTO {\n");
    
    sb.append("    canalComunicat: ").append(toIndentedString(canalComunicat)).append("\n");
    sb.append("    codi: ").append(toIndentedString(codi)).append("\n");
    sb.append("    comentari: ").append(toIndentedString(comentari)).append("\n");
    sb.append("    comunicat: ").append(toIndentedString(comunicat)).append("\n");
    sb.append("    configDocTramitacio: ").append(toIndentedString(configDocTramitacio)).append("\n");
    sb.append("    configuracioDocsTramitacio: ").append(toIndentedString(configuracioDocsTramitacio)).append("\n");
    sb.append("    configuracioDocsTramitacioNom: ").append(toIndentedString(configuracioDocsTramitacioNom)).append("\n");
    sb.append("    dataComunicat: ").append(toIndentedString(dataComunicat)).append("\n");
    sb.append("    dataCreacio: ").append(toIndentedString(dataCreacio)).append("\n");
    sb.append("    dataDigitalitzacio: ").append(toIndentedString(dataDigitalitzacio)).append("\n");
    sb.append("    dataUltimaModificacio: ").append(toIndentedString(dataUltimaModificacio)).append("\n");
    sb.append("    descripcioEstat: ").append(toIndentedString(descripcioEstat)).append("\n");
    sb.append("    digitalitzat: ").append(toIndentedString(digitalitzat)).append("\n");
    sb.append("    docsFisics: ").append(toIndentedString(docsFisics)).append("\n");
    sb.append("    docsFisicsNom: ").append(toIndentedString(docsFisicsNom)).append("\n");
    sb.append("    docsSignatures: ").append(toIndentedString(docsSignatures)).append("\n");
    sb.append("    docsTercers: ").append(toIndentedString(docsTercers)).append("\n");
    sb.append("    documentFisic: ").append(toIndentedString(documentFisic)).append("\n");
    sb.append("    documentacio: ").append(toIndentedString(documentacio)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    eliminat: ").append(toIndentedString(eliminat)).append("\n");
    sb.append("    estat: ").append(toIndentedString(estat)).append("\n");
    sb.append("    estatAnterior: ").append(toIndentedString(estatAnterior)).append("\n");
    sb.append("    estatDigitalitzacio: ").append(toIndentedString(estatDigitalitzacio)).append("\n");
    sb.append("    estatDocsTramitacio: ").append(toIndentedString(estatDocsTramitacio)).append("\n");
    sb.append("    estatsDocsTramitacio: ").append(toIndentedString(estatsDocsTramitacio)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idioma: ").append(toIndentedString(idioma)).append("\n");
    sb.append("    idiomaDigitalitzacio: ").append(toIndentedString(idiomaDigitalitzacio)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    migracioIdOrigen: ").append(toIndentedString(migracioIdOrigen)).append("\n");
    sb.append("    missatgeComunicat: ").append(toIndentedString(missatgeComunicat)).append("\n");
    sb.append("    notificacio: ").append(toIndentedString(notificacio)).append("\n");
    sb.append("    notificacions: ").append(toIndentedString(notificacions)).append("\n");
    sb.append("    numDocsConfiguracio: ").append(toIndentedString(numDocsConfiguracio)).append("\n");
    sb.append("    obligatoriEnEstat: ").append(toIndentedString(obligatoriEnEstat)).append("\n");
    sb.append("    origen: ").append(toIndentedString(origen)).append("\n");
    sb.append("    plantillaPdf: ").append(toIndentedString(plantillaPdf)).append("\n");
    sb.append("    publicarInfoPublica: ").append(toIndentedString(publicarInfoPublica)).append("\n");
    sb.append("    registreAssentament: ").append(toIndentedString(registreAssentament)).append("\n");
    sb.append("    registreIdext: ").append(toIndentedString(registreIdext)).append("\n");
    sb.append("    requereixSignatura: ").append(toIndentedString(requereixSignatura)).append("\n");
    sb.append("    requeriments: ").append(toIndentedString(requeriments)).append("\n");
    sb.append("    seleccionable: ").append(toIndentedString(seleccionable)).append("\n");
    sb.append("    tipusMimeDescripcio: ").append(toIndentedString(tipusMimeDescripcio)).append("\n");
    sb.append("    ultimaModificacioIdext: ").append(toIndentedString(ultimaModificacioIdext)).append("\n");
    sb.append("    ultimaSignatura: ").append(toIndentedString(ultimaSignatura)).append("\n");
    sb.append("    urlDigitalitzacio: ").append(toIndentedString(urlDigitalitzacio)).append("\n");
    sb.append("    usuariIdext: ").append(toIndentedString(usuariIdext)).append("\n");
    sb.append("    usuariSignaturaNom: ").append(toIndentedString(usuariSignaturaNom)).append("\n");
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

