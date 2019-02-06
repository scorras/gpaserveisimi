/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.4.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.RegistreAssentament;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.Requeriments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.DateTime;

/**
 * DocsTramitacioRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-04T01:51:34.681+01:00")
public class DocsTramitacioRDTO {
  @JsonProperty("comentari")
  private String comentari = null;

  @JsonProperty("configDocTramitacio")
  private BigDecimal configDocTramitacio = null;

  @JsonProperty("configuracioDocsTramitacio")
  private ConfiguracioDocsTramitacio configuracioDocsTramitacio = null;

  @JsonProperty("configuracioDocsTramitacioNom")
  private String configuracioDocsTramitacioNom = null;

  @JsonProperty("dataCreacio")
  private DateTime dataCreacio = null;

  @JsonProperty("dataDigitalitzacio")
  private DateTime dataDigitalitzacio = null;

  @JsonProperty("dataNotificacio")
  private DateTime dataNotificacio = null;

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

  @JsonProperty("estatDocsTramitacio")
  private BigDecimal estatDocsTramitacio = null;

  @JsonProperty("estatsDocsTramitacio")
  private EstatsDocsTramitacio estatsDocsTramitacio = null;

  @JsonProperty("fileToUploadContent")
  private String fileToUploadContent = null;

  @JsonProperty("fileToUploadName")
  private String fileToUploadName = null;

  @JsonProperty("fileToUploadSize")
  private Long fileToUploadSize = null;

  @JsonProperty("fileToUploadType")
  private String fileToUploadType = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("idioma")
  private BigDecimal idioma = null;

  @JsonProperty("numDocsConfiguracio")
  private BigDecimal numDocsConfiguracio = null;

  @JsonProperty("obligatoriEnEstat")
  private Boolean obligatoriEnEstat = null;

  @JsonProperty("origen")
  private Integer origen = null;

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

  @JsonProperty("usuariIdext")
  private BigDecimal usuariIdext = null;

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

  public DocsTramitacioRDTO dataNotificacio(DateTime dataNotificacio) {
    this.dataNotificacio = dataNotificacio;
    return this;
  }

   /**
   * Get dataNotificacio
   * @return dataNotificacio
  **/
  @ApiModelProperty(value = "")
  public DateTime getDataNotificacio() {
    return dataNotificacio;
  }

  public void setDataNotificacio(DateTime dataNotificacio) {
    this.dataNotificacio = dataNotificacio;
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

  public DocsTramitacioRDTO fileToUploadContent(String fileToUploadContent) {
    this.fileToUploadContent = fileToUploadContent;
    return this;
  }

   /**
   * Get fileToUploadContent
   * @return fileToUploadContent
  **/
  @ApiModelProperty(value = "")
  public String getFileToUploadContent() {
    return fileToUploadContent;
  }

  public void setFileToUploadContent(String fileToUploadContent) {
    this.fileToUploadContent = fileToUploadContent;
  }

  public DocsTramitacioRDTO fileToUploadName(String fileToUploadName) {
    this.fileToUploadName = fileToUploadName;
    return this;
  }

   /**
   * Get fileToUploadName
   * @return fileToUploadName
  **/
  @ApiModelProperty(value = "")
  public String getFileToUploadName() {
    return fileToUploadName;
  }

  public void setFileToUploadName(String fileToUploadName) {
    this.fileToUploadName = fileToUploadName;
  }

  public DocsTramitacioRDTO fileToUploadSize(Long fileToUploadSize) {
    this.fileToUploadSize = fileToUploadSize;
    return this;
  }

   /**
   * Get fileToUploadSize
   * @return fileToUploadSize
  **/
  @ApiModelProperty(value = "")
  public Long getFileToUploadSize() {
    return fileToUploadSize;
  }

  public void setFileToUploadSize(Long fileToUploadSize) {
    this.fileToUploadSize = fileToUploadSize;
  }

  public DocsTramitacioRDTO fileToUploadType(String fileToUploadType) {
    this.fileToUploadType = fileToUploadType;
    return this;
  }

   /**
   * Get fileToUploadType
   * @return fileToUploadType
  **/
  @ApiModelProperty(value = "")
  public String getFileToUploadType() {
    return fileToUploadType;
  }

  public void setFileToUploadType(String fileToUploadType) {
    this.fileToUploadType = fileToUploadType;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsTramitacioRDTO docsTramitacioRDTO = (DocsTramitacioRDTO) o;
    return Objects.equals(this.comentari, docsTramitacioRDTO.comentari) &&
        Objects.equals(this.configDocTramitacio, docsTramitacioRDTO.configDocTramitacio) &&
        Objects.equals(this.configuracioDocsTramitacio, docsTramitacioRDTO.configuracioDocsTramitacio) &&
        Objects.equals(this.configuracioDocsTramitacioNom, docsTramitacioRDTO.configuracioDocsTramitacioNom) &&
        Objects.equals(this.dataCreacio, docsTramitacioRDTO.dataCreacio) &&
        Objects.equals(this.dataDigitalitzacio, docsTramitacioRDTO.dataDigitalitzacio) &&
        Objects.equals(this.dataNotificacio, docsTramitacioRDTO.dataNotificacio) &&
        Objects.equals(this.dataUltimaModificacio, docsTramitacioRDTO.dataUltimaModificacio) &&
        Objects.equals(this.descripcioEstat, docsTramitacioRDTO.descripcioEstat) &&
        Objects.equals(this.digitalitzat, docsTramitacioRDTO.digitalitzat) &&
        Objects.equals(this.docsFisics, docsTramitacioRDTO.docsFisics) &&
        Objects.equals(this.docsFisicsNom, docsTramitacioRDTO.docsFisicsNom) &&
        Objects.equals(this.docsSignatures, docsTramitacioRDTO.docsSignatures) &&
        Objects.equals(this.documentFisic, docsTramitacioRDTO.documentFisic) &&
        Objects.equals(this.documentacio, docsTramitacioRDTO.documentacio) &&
        Objects.equals(this.editable, docsTramitacioRDTO.editable) &&
        Objects.equals(this.eliminat, docsTramitacioRDTO.eliminat) &&
        Objects.equals(this.estat, docsTramitacioRDTO.estat) &&
        Objects.equals(this.estatAnterior, docsTramitacioRDTO.estatAnterior) &&
        Objects.equals(this.estatDocsTramitacio, docsTramitacioRDTO.estatDocsTramitacio) &&
        Objects.equals(this.estatsDocsTramitacio, docsTramitacioRDTO.estatsDocsTramitacio) &&
        Objects.equals(this.fileToUploadContent, docsTramitacioRDTO.fileToUploadContent) &&
        Objects.equals(this.fileToUploadName, docsTramitacioRDTO.fileToUploadName) &&
        Objects.equals(this.fileToUploadSize, docsTramitacioRDTO.fileToUploadSize) &&
        Objects.equals(this.fileToUploadType, docsTramitacioRDTO.fileToUploadType) &&
        Objects.equals(this.id, docsTramitacioRDTO.id) &&
        Objects.equals(this.idioma, docsTramitacioRDTO.idioma) &&
        Objects.equals(this.numDocsConfiguracio, docsTramitacioRDTO.numDocsConfiguracio) &&
        Objects.equals(this.obligatoriEnEstat, docsTramitacioRDTO.obligatoriEnEstat) &&
        Objects.equals(this.origen, docsTramitacioRDTO.origen) &&
        Objects.equals(this.registreAssentament, docsTramitacioRDTO.registreAssentament) &&
        Objects.equals(this.registreIdext, docsTramitacioRDTO.registreIdext) &&
        Objects.equals(this.requereixSignatura, docsTramitacioRDTO.requereixSignatura) &&
        Objects.equals(this.requeriments, docsTramitacioRDTO.requeriments) &&
        Objects.equals(this.seleccionable, docsTramitacioRDTO.seleccionable) &&
        Objects.equals(this.tipusMimeDescripcio, docsTramitacioRDTO.tipusMimeDescripcio) &&
        Objects.equals(this.ultimaModificacioIdext, docsTramitacioRDTO.ultimaModificacioIdext) &&
        Objects.equals(this.ultimaSignatura, docsTramitacioRDTO.ultimaSignatura) &&
        Objects.equals(this.usuariIdext, docsTramitacioRDTO.usuariIdext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comentari, configDocTramitacio, configuracioDocsTramitacio, configuracioDocsTramitacioNom, dataCreacio, dataDigitalitzacio, dataNotificacio, dataUltimaModificacio, descripcioEstat, digitalitzat, docsFisics, docsFisicsNom, docsSignatures, documentFisic, documentacio, editable, eliminat, estat, estatAnterior, estatDocsTramitacio, estatsDocsTramitacio, fileToUploadContent, fileToUploadName, fileToUploadSize, fileToUploadType, id, idioma, numDocsConfiguracio, obligatoriEnEstat, origen, registreAssentament, registreIdext, requereixSignatura, requeriments, seleccionable, tipusMimeDescripcio, ultimaModificacioIdext, ultimaSignatura, usuariIdext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsTramitacioRDTO {\n");
    
    sb.append("    comentari: ").append(toIndentedString(comentari)).append("\n");
    sb.append("    configDocTramitacio: ").append(toIndentedString(configDocTramitacio)).append("\n");
    sb.append("    configuracioDocsTramitacio: ").append(toIndentedString(configuracioDocsTramitacio)).append("\n");
    sb.append("    configuracioDocsTramitacioNom: ").append(toIndentedString(configuracioDocsTramitacioNom)).append("\n");
    sb.append("    dataCreacio: ").append(toIndentedString(dataCreacio)).append("\n");
    sb.append("    dataDigitalitzacio: ").append(toIndentedString(dataDigitalitzacio)).append("\n");
    sb.append("    dataNotificacio: ").append(toIndentedString(dataNotificacio)).append("\n");
    sb.append("    dataUltimaModificacio: ").append(toIndentedString(dataUltimaModificacio)).append("\n");
    sb.append("    descripcioEstat: ").append(toIndentedString(descripcioEstat)).append("\n");
    sb.append("    digitalitzat: ").append(toIndentedString(digitalitzat)).append("\n");
    sb.append("    docsFisics: ").append(toIndentedString(docsFisics)).append("\n");
    sb.append("    docsFisicsNom: ").append(toIndentedString(docsFisicsNom)).append("\n");
    sb.append("    docsSignatures: ").append(toIndentedString(docsSignatures)).append("\n");
    sb.append("    documentFisic: ").append(toIndentedString(documentFisic)).append("\n");
    sb.append("    documentacio: ").append(toIndentedString(documentacio)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    eliminat: ").append(toIndentedString(eliminat)).append("\n");
    sb.append("    estat: ").append(toIndentedString(estat)).append("\n");
    sb.append("    estatAnterior: ").append(toIndentedString(estatAnterior)).append("\n");
    sb.append("    estatDocsTramitacio: ").append(toIndentedString(estatDocsTramitacio)).append("\n");
    sb.append("    estatsDocsTramitacio: ").append(toIndentedString(estatsDocsTramitacio)).append("\n");
    sb.append("    fileToUploadContent: ").append(toIndentedString(fileToUploadContent)).append("\n");
    sb.append("    fileToUploadName: ").append(toIndentedString(fileToUploadName)).append("\n");
    sb.append("    fileToUploadSize: ").append(toIndentedString(fileToUploadSize)).append("\n");
    sb.append("    fileToUploadType: ").append(toIndentedString(fileToUploadType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idioma: ").append(toIndentedString(idioma)).append("\n");
    sb.append("    numDocsConfiguracio: ").append(toIndentedString(numDocsConfiguracio)).append("\n");
    sb.append("    obligatoriEnEstat: ").append(toIndentedString(obligatoriEnEstat)).append("\n");
    sb.append("    origen: ").append(toIndentedString(origen)).append("\n");
    sb.append("    registreAssentament: ").append(toIndentedString(registreAssentament)).append("\n");
    sb.append("    registreIdext: ").append(toIndentedString(registreIdext)).append("\n");
    sb.append("    requereixSignatura: ").append(toIndentedString(requereixSignatura)).append("\n");
    sb.append("    requeriments: ").append(toIndentedString(requeriments)).append("\n");
    sb.append("    seleccionable: ").append(toIndentedString(seleccionable)).append("\n");
    sb.append("    tipusMimeDescripcio: ").append(toIndentedString(tipusMimeDescripcio)).append("\n");
    sb.append("    ultimaModificacioIdext: ").append(toIndentedString(ultimaModificacioIdext)).append("\n");
    sb.append("    ultimaSignatura: ").append(toIndentedString(ultimaSignatura)).append("\n");
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

