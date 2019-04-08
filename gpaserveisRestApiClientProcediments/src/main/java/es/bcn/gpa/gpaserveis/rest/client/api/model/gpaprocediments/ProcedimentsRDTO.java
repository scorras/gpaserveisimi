/*
 * API gpaprocediments
 * API gpaprocediments
 *
 * OpenAPI spec version: 1.8.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.Bloquejos;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.Comentaris;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.DadesGrups;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.EstatsProcediment;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.Historics;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.Identificacions;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.Procediments;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ProcedimentsIniciacions;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ProcedimentsRelacionats;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ProcedimentsUgos;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.RequerimentsOperatius;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * ProcedimentsRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T17:18:13.226+02:00")
public class ProcedimentsRDTO {
  @JsonProperty("bloqueig")
  private BigDecimal bloqueig = null;

  @JsonProperty("bloquejos")
  private Bloquejos bloquejos = null;

  @JsonProperty("codi")
  private String codi = null;

  @JsonProperty("codiNom")
  private String codiNom = null;

  @JsonProperty("comentarisList")
  private List<Comentaris> comentarisList = null;

  @JsonProperty("configuracioAvisos")
  private BigDecimal configuracioAvisos = null;

  @JsonProperty("configuracioDocumentacio")
  private BigDecimal configuracioDocumentacio = null;

  @JsonProperty("dadesGrupsList")
  private List<DadesGrups> dadesGrupsList = null;

  @JsonProperty("darreraModificacio")
  private DateTime darreraModificacio = null;

  @JsonProperty("darreraSincronitzacio")
  private DateTime darreraSincronitzacio = null;

  @JsonProperty("descripcio")
  private String descripcio = null;

  @JsonProperty("descripcioCastella")
  private String descripcioCastella = null;

  @JsonProperty("descripcioEstat")
  private String descripcioEstat = null;

  @JsonProperty("descripcioEstatCastella")
  private String descripcioEstatCastella = null;

  @JsonProperty("descripcioEstatCatala")
  private String descripcioEstatCatala = null;

  @JsonProperty("descripcioRelacio")
  private String descripcioRelacio = null;

  @JsonProperty("estatProcediment")
  private BigDecimal estatProcediment = null;

  @JsonProperty("estatsProcediment")
  private EstatsProcediment estatsProcediment = null;

  @JsonProperty("historicsList")
  private List<Historics> historicsList = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("identificacio")
  private BigDecimal identificacio = null;

  @JsonProperty("identificacions")
  private Identificacions identificacions = null;

  @JsonProperty("iniciacionsList")
  private List<ProcedimentsIniciacions> iniciacionsList = null;

  @JsonProperty("nom")
  private String nom = null;

  @JsonProperty("nomCastella")
  private String nomCastella = null;

  @JsonProperty("numerador")
  private BigDecimal numerador = null;

  @JsonProperty("procedimentsAssociatsList")
  private List<Procediments> procedimentsAssociatsList = null;

  @JsonProperty("procedimentsRelacionatsList")
  private List<ProcedimentsRelacionats> procedimentsRelacionatsList = null;

  @JsonProperty("reqOperatius")
  private RequerimentsOperatius reqOperatius = null;

  @JsonProperty("requerimentsOperatius")
  private BigDecimal requerimentsOperatius = null;

  @JsonProperty("serieDocumental")
  private String serieDocumental = null;

  @JsonProperty("tramitador")
  private String tramitador = null;

  @JsonProperty("ugosList")
  private List<ProcedimentsUgos> ugosList = null;

  @JsonProperty("ugosNoms")
  private String ugosNoms = null;

  @JsonProperty("ugrIdext")
  private BigDecimal ugrIdext = null;

  @JsonProperty("ugrNom")
  private String ugrNom = null;

  @JsonProperty("ultimaModificacio")
  private BigDecimal ultimaModificacio = null;

  @JsonProperty("unitat")
  private String unitat = null;

  @JsonProperty("versio")
  private String versio = null;

  @JsonProperty("versioDocumental")
  private BigDecimal versioDocumental = null;

  public ProcedimentsRDTO bloqueig(BigDecimal bloqueig) {
    this.bloqueig = bloqueig;
    return this;
  }

   /**
   * Get bloqueig
   * @return bloqueig
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getBloqueig() {
    return bloqueig;
  }

  public void setBloqueig(BigDecimal bloqueig) {
    this.bloqueig = bloqueig;
  }

  public ProcedimentsRDTO bloquejos(Bloquejos bloquejos) {
    this.bloquejos = bloquejos;
    return this;
  }

   /**
   * Get bloquejos
   * @return bloquejos
  **/
  @ApiModelProperty(value = "")
  public Bloquejos getBloquejos() {
    return bloquejos;
  }

  public void setBloquejos(Bloquejos bloquejos) {
    this.bloquejos = bloquejos;
  }

  public ProcedimentsRDTO codi(String codi) {
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

  public ProcedimentsRDTO codiNom(String codiNom) {
    this.codiNom = codiNom;
    return this;
  }

   /**
   * Get codiNom
   * @return codiNom
  **/
  @ApiModelProperty(value = "")
  public String getCodiNom() {
    return codiNom;
  }

  public void setCodiNom(String codiNom) {
    this.codiNom = codiNom;
  }

  public ProcedimentsRDTO comentarisList(List<Comentaris> comentarisList) {
    this.comentarisList = comentarisList;
    return this;
  }

  public ProcedimentsRDTO addComentarisListItem(Comentaris comentarisListItem) {
    if (this.comentarisList == null) {
      this.comentarisList = new ArrayList<Comentaris>();
    }
    this.comentarisList.add(comentarisListItem);
    return this;
  }

   /**
   * Get comentarisList
   * @return comentarisList
  **/
  @ApiModelProperty(value = "")
  public List<Comentaris> getComentarisList() {
    return comentarisList;
  }

  public void setComentarisList(List<Comentaris> comentarisList) {
    this.comentarisList = comentarisList;
  }

  public ProcedimentsRDTO configuracioAvisos(BigDecimal configuracioAvisos) {
    this.configuracioAvisos = configuracioAvisos;
    return this;
  }

   /**
   * Get configuracioAvisos
   * @return configuracioAvisos
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getConfiguracioAvisos() {
    return configuracioAvisos;
  }

  public void setConfiguracioAvisos(BigDecimal configuracioAvisos) {
    this.configuracioAvisos = configuracioAvisos;
  }

  public ProcedimentsRDTO configuracioDocumentacio(BigDecimal configuracioDocumentacio) {
    this.configuracioDocumentacio = configuracioDocumentacio;
    return this;
  }

   /**
   * Get configuracioDocumentacio
   * @return configuracioDocumentacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getConfiguracioDocumentacio() {
    return configuracioDocumentacio;
  }

  public void setConfiguracioDocumentacio(BigDecimal configuracioDocumentacio) {
    this.configuracioDocumentacio = configuracioDocumentacio;
  }

  public ProcedimentsRDTO dadesGrupsList(List<DadesGrups> dadesGrupsList) {
    this.dadesGrupsList = dadesGrupsList;
    return this;
  }

  public ProcedimentsRDTO addDadesGrupsListItem(DadesGrups dadesGrupsListItem) {
    if (this.dadesGrupsList == null) {
      this.dadesGrupsList = new ArrayList<DadesGrups>();
    }
    this.dadesGrupsList.add(dadesGrupsListItem);
    return this;
  }

   /**
   * Get dadesGrupsList
   * @return dadesGrupsList
  **/
  @ApiModelProperty(value = "")
  public List<DadesGrups> getDadesGrupsList() {
    return dadesGrupsList;
  }

  public void setDadesGrupsList(List<DadesGrups> dadesGrupsList) {
    this.dadesGrupsList = dadesGrupsList;
  }

  public ProcedimentsRDTO darreraModificacio(DateTime darreraModificacio) {
    this.darreraModificacio = darreraModificacio;
    return this;
  }

   /**
   * Get darreraModificacio
   * @return darreraModificacio
  **/
  @ApiModelProperty(value = "")
  public DateTime getDarreraModificacio() {
    return darreraModificacio;
  }

  public void setDarreraModificacio(DateTime darreraModificacio) {
    this.darreraModificacio = darreraModificacio;
  }

  public ProcedimentsRDTO darreraSincronitzacio(DateTime darreraSincronitzacio) {
    this.darreraSincronitzacio = darreraSincronitzacio;
    return this;
  }

   /**
   * Get darreraSincronitzacio
   * @return darreraSincronitzacio
  **/
  @ApiModelProperty(value = "")
  public DateTime getDarreraSincronitzacio() {
    return darreraSincronitzacio;
  }

  public void setDarreraSincronitzacio(DateTime darreraSincronitzacio) {
    this.darreraSincronitzacio = darreraSincronitzacio;
  }

  public ProcedimentsRDTO descripcio(String descripcio) {
    this.descripcio = descripcio;
    return this;
  }

   /**
   * Get descripcio
   * @return descripcio
  **/
  @ApiModelProperty(value = "")
  public String getDescripcio() {
    return descripcio;
  }

  public void setDescripcio(String descripcio) {
    this.descripcio = descripcio;
  }

  public ProcedimentsRDTO descripcioCastella(String descripcioCastella) {
    this.descripcioCastella = descripcioCastella;
    return this;
  }

   /**
   * Get descripcioCastella
   * @return descripcioCastella
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioCastella() {
    return descripcioCastella;
  }

  public void setDescripcioCastella(String descripcioCastella) {
    this.descripcioCastella = descripcioCastella;
  }

  public ProcedimentsRDTO descripcioEstat(String descripcioEstat) {
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

  public ProcedimentsRDTO descripcioEstatCastella(String descripcioEstatCastella) {
    this.descripcioEstatCastella = descripcioEstatCastella;
    return this;
  }

   /**
   * Get descripcioEstatCastella
   * @return descripcioEstatCastella
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioEstatCastella() {
    return descripcioEstatCastella;
  }

  public void setDescripcioEstatCastella(String descripcioEstatCastella) {
    this.descripcioEstatCastella = descripcioEstatCastella;
  }

  public ProcedimentsRDTO descripcioEstatCatala(String descripcioEstatCatala) {
    this.descripcioEstatCatala = descripcioEstatCatala;
    return this;
  }

   /**
   * Get descripcioEstatCatala
   * @return descripcioEstatCatala
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioEstatCatala() {
    return descripcioEstatCatala;
  }

  public void setDescripcioEstatCatala(String descripcioEstatCatala) {
    this.descripcioEstatCatala = descripcioEstatCatala;
  }

  public ProcedimentsRDTO descripcioRelacio(String descripcioRelacio) {
    this.descripcioRelacio = descripcioRelacio;
    return this;
  }

   /**
   * Get descripcioRelacio
   * @return descripcioRelacio
  **/
  @ApiModelProperty(value = "")
  public String getDescripcioRelacio() {
    return descripcioRelacio;
  }

  public void setDescripcioRelacio(String descripcioRelacio) {
    this.descripcioRelacio = descripcioRelacio;
  }

  public ProcedimentsRDTO estatProcediment(BigDecimal estatProcediment) {
    this.estatProcediment = estatProcediment;
    return this;
  }

   /**
   * Get estatProcediment
   * @return estatProcediment
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEstatProcediment() {
    return estatProcediment;
  }

  public void setEstatProcediment(BigDecimal estatProcediment) {
    this.estatProcediment = estatProcediment;
  }

  public ProcedimentsRDTO estatsProcediment(EstatsProcediment estatsProcediment) {
    this.estatsProcediment = estatsProcediment;
    return this;
  }

   /**
   * Get estatsProcediment
   * @return estatsProcediment
  **/
  @ApiModelProperty(value = "")
  public EstatsProcediment getEstatsProcediment() {
    return estatsProcediment;
  }

  public void setEstatsProcediment(EstatsProcediment estatsProcediment) {
    this.estatsProcediment = estatsProcediment;
  }

  public ProcedimentsRDTO historicsList(List<Historics> historicsList) {
    this.historicsList = historicsList;
    return this;
  }

  public ProcedimentsRDTO addHistoricsListItem(Historics historicsListItem) {
    if (this.historicsList == null) {
      this.historicsList = new ArrayList<Historics>();
    }
    this.historicsList.add(historicsListItem);
    return this;
  }

   /**
   * Get historicsList
   * @return historicsList
  **/
  @ApiModelProperty(value = "")
  public List<Historics> getHistoricsList() {
    return historicsList;
  }

  public void setHistoricsList(List<Historics> historicsList) {
    this.historicsList = historicsList;
  }

  public ProcedimentsRDTO id(BigDecimal id) {
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

  public ProcedimentsRDTO identificacio(BigDecimal identificacio) {
    this.identificacio = identificacio;
    return this;
  }

   /**
   * Get identificacio
   * @return identificacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdentificacio() {
    return identificacio;
  }

  public void setIdentificacio(BigDecimal identificacio) {
    this.identificacio = identificacio;
  }

  public ProcedimentsRDTO identificacions(Identificacions identificacions) {
    this.identificacions = identificacions;
    return this;
  }

   /**
   * Get identificacions
   * @return identificacions
  **/
  @ApiModelProperty(value = "")
  public Identificacions getIdentificacions() {
    return identificacions;
  }

  public void setIdentificacions(Identificacions identificacions) {
    this.identificacions = identificacions;
  }

  public ProcedimentsRDTO iniciacionsList(List<ProcedimentsIniciacions> iniciacionsList) {
    this.iniciacionsList = iniciacionsList;
    return this;
  }

  public ProcedimentsRDTO addIniciacionsListItem(ProcedimentsIniciacions iniciacionsListItem) {
    if (this.iniciacionsList == null) {
      this.iniciacionsList = new ArrayList<ProcedimentsIniciacions>();
    }
    this.iniciacionsList.add(iniciacionsListItem);
    return this;
  }

   /**
   * Get iniciacionsList
   * @return iniciacionsList
  **/
  @ApiModelProperty(value = "")
  public List<ProcedimentsIniciacions> getIniciacionsList() {
    return iniciacionsList;
  }

  public void setIniciacionsList(List<ProcedimentsIniciacions> iniciacionsList) {
    this.iniciacionsList = iniciacionsList;
  }

  public ProcedimentsRDTO nom(String nom) {
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

  public ProcedimentsRDTO nomCastella(String nomCastella) {
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

  public ProcedimentsRDTO numerador(BigDecimal numerador) {
    this.numerador = numerador;
    return this;
  }

   /**
   * Get numerador
   * @return numerador
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getNumerador() {
    return numerador;
  }

  public void setNumerador(BigDecimal numerador) {
    this.numerador = numerador;
  }

  public ProcedimentsRDTO procedimentsAssociatsList(List<Procediments> procedimentsAssociatsList) {
    this.procedimentsAssociatsList = procedimentsAssociatsList;
    return this;
  }

  public ProcedimentsRDTO addProcedimentsAssociatsListItem(Procediments procedimentsAssociatsListItem) {
    if (this.procedimentsAssociatsList == null) {
      this.procedimentsAssociatsList = new ArrayList<Procediments>();
    }
    this.procedimentsAssociatsList.add(procedimentsAssociatsListItem);
    return this;
  }

   /**
   * Get procedimentsAssociatsList
   * @return procedimentsAssociatsList
  **/
  @ApiModelProperty(value = "")
  public List<Procediments> getProcedimentsAssociatsList() {
    return procedimentsAssociatsList;
  }

  public void setProcedimentsAssociatsList(List<Procediments> procedimentsAssociatsList) {
    this.procedimentsAssociatsList = procedimentsAssociatsList;
  }

  public ProcedimentsRDTO procedimentsRelacionatsList(List<ProcedimentsRelacionats> procedimentsRelacionatsList) {
    this.procedimentsRelacionatsList = procedimentsRelacionatsList;
    return this;
  }

  public ProcedimentsRDTO addProcedimentsRelacionatsListItem(ProcedimentsRelacionats procedimentsRelacionatsListItem) {
    if (this.procedimentsRelacionatsList == null) {
      this.procedimentsRelacionatsList = new ArrayList<ProcedimentsRelacionats>();
    }
    this.procedimentsRelacionatsList.add(procedimentsRelacionatsListItem);
    return this;
  }

   /**
   * Get procedimentsRelacionatsList
   * @return procedimentsRelacionatsList
  **/
  @ApiModelProperty(value = "")
  public List<ProcedimentsRelacionats> getProcedimentsRelacionatsList() {
    return procedimentsRelacionatsList;
  }

  public void setProcedimentsRelacionatsList(List<ProcedimentsRelacionats> procedimentsRelacionatsList) {
    this.procedimentsRelacionatsList = procedimentsRelacionatsList;
  }

  public ProcedimentsRDTO reqOperatius(RequerimentsOperatius reqOperatius) {
    this.reqOperatius = reqOperatius;
    return this;
  }

   /**
   * Get reqOperatius
   * @return reqOperatius
  **/
  @ApiModelProperty(value = "")
  public RequerimentsOperatius getReqOperatius() {
    return reqOperatius;
  }

  public void setReqOperatius(RequerimentsOperatius reqOperatius) {
    this.reqOperatius = reqOperatius;
  }

  public ProcedimentsRDTO requerimentsOperatius(BigDecimal requerimentsOperatius) {
    this.requerimentsOperatius = requerimentsOperatius;
    return this;
  }

   /**
   * Get requerimentsOperatius
   * @return requerimentsOperatius
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRequerimentsOperatius() {
    return requerimentsOperatius;
  }

  public void setRequerimentsOperatius(BigDecimal requerimentsOperatius) {
    this.requerimentsOperatius = requerimentsOperatius;
  }

  public ProcedimentsRDTO serieDocumental(String serieDocumental) {
    this.serieDocumental = serieDocumental;
    return this;
  }

   /**
   * Get serieDocumental
   * @return serieDocumental
  **/
  @ApiModelProperty(value = "")
  public String getSerieDocumental() {
    return serieDocumental;
  }

  public void setSerieDocumental(String serieDocumental) {
    this.serieDocumental = serieDocumental;
  }

  public ProcedimentsRDTO tramitador(String tramitador) {
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

  public ProcedimentsRDTO ugosList(List<ProcedimentsUgos> ugosList) {
    this.ugosList = ugosList;
    return this;
  }

  public ProcedimentsRDTO addUgosListItem(ProcedimentsUgos ugosListItem) {
    if (this.ugosList == null) {
      this.ugosList = new ArrayList<ProcedimentsUgos>();
    }
    this.ugosList.add(ugosListItem);
    return this;
  }

   /**
   * Get ugosList
   * @return ugosList
  **/
  @ApiModelProperty(value = "")
  public List<ProcedimentsUgos> getUgosList() {
    return ugosList;
  }

  public void setUgosList(List<ProcedimentsUgos> ugosList) {
    this.ugosList = ugosList;
  }

  public ProcedimentsRDTO ugosNoms(String ugosNoms) {
    this.ugosNoms = ugosNoms;
    return this;
  }

   /**
   * Get ugosNoms
   * @return ugosNoms
  **/
  @ApiModelProperty(value = "")
  public String getUgosNoms() {
    return ugosNoms;
  }

  public void setUgosNoms(String ugosNoms) {
    this.ugosNoms = ugosNoms;
  }

  public ProcedimentsRDTO ugrIdext(BigDecimal ugrIdext) {
    this.ugrIdext = ugrIdext;
    return this;
  }

   /**
   * Get ugrIdext
   * @return ugrIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUgrIdext() {
    return ugrIdext;
  }

  public void setUgrIdext(BigDecimal ugrIdext) {
    this.ugrIdext = ugrIdext;
  }

  public ProcedimentsRDTO ugrNom(String ugrNom) {
    this.ugrNom = ugrNom;
    return this;
  }

   /**
   * Get ugrNom
   * @return ugrNom
  **/
  @ApiModelProperty(value = "")
  public String getUgrNom() {
    return ugrNom;
  }

  public void setUgrNom(String ugrNom) {
    this.ugrNom = ugrNom;
  }

  public ProcedimentsRDTO ultimaModificacio(BigDecimal ultimaModificacio) {
    this.ultimaModificacio = ultimaModificacio;
    return this;
  }

   /**
   * Get ultimaModificacio
   * @return ultimaModificacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUltimaModificacio() {
    return ultimaModificacio;
  }

  public void setUltimaModificacio(BigDecimal ultimaModificacio) {
    this.ultimaModificacio = ultimaModificacio;
  }

  public ProcedimentsRDTO unitat(String unitat) {
    this.unitat = unitat;
    return this;
  }

   /**
   * Get unitat
   * @return unitat
  **/
  @ApiModelProperty(value = "")
  public String getUnitat() {
    return unitat;
  }

  public void setUnitat(String unitat) {
    this.unitat = unitat;
  }

  public ProcedimentsRDTO versio(String versio) {
    this.versio = versio;
    return this;
  }

   /**
   * Get versio
   * @return versio
  **/
  @ApiModelProperty(value = "")
  public String getVersio() {
    return versio;
  }

  public void setVersio(String versio) {
    this.versio = versio;
  }

  public ProcedimentsRDTO versioDocumental(BigDecimal versioDocumental) {
    this.versioDocumental = versioDocumental;
    return this;
  }

   /**
   * Get versioDocumental
   * @return versioDocumental
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getVersioDocumental() {
    return versioDocumental;
  }

  public void setVersioDocumental(BigDecimal versioDocumental) {
    this.versioDocumental = versioDocumental;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcedimentsRDTO procedimentsRDTO = (ProcedimentsRDTO) o;
    return Objects.equals(this.bloqueig, procedimentsRDTO.bloqueig) &&
        Objects.equals(this.bloquejos, procedimentsRDTO.bloquejos) &&
        Objects.equals(this.codi, procedimentsRDTO.codi) &&
        Objects.equals(this.codiNom, procedimentsRDTO.codiNom) &&
        Objects.equals(this.comentarisList, procedimentsRDTO.comentarisList) &&
        Objects.equals(this.configuracioAvisos, procedimentsRDTO.configuracioAvisos) &&
        Objects.equals(this.configuracioDocumentacio, procedimentsRDTO.configuracioDocumentacio) &&
        Objects.equals(this.dadesGrupsList, procedimentsRDTO.dadesGrupsList) &&
        Objects.equals(this.darreraModificacio, procedimentsRDTO.darreraModificacio) &&
        Objects.equals(this.darreraSincronitzacio, procedimentsRDTO.darreraSincronitzacio) &&
        Objects.equals(this.descripcio, procedimentsRDTO.descripcio) &&
        Objects.equals(this.descripcioCastella, procedimentsRDTO.descripcioCastella) &&
        Objects.equals(this.descripcioEstat, procedimentsRDTO.descripcioEstat) &&
        Objects.equals(this.descripcioEstatCastella, procedimentsRDTO.descripcioEstatCastella) &&
        Objects.equals(this.descripcioEstatCatala, procedimentsRDTO.descripcioEstatCatala) &&
        Objects.equals(this.descripcioRelacio, procedimentsRDTO.descripcioRelacio) &&
        Objects.equals(this.estatProcediment, procedimentsRDTO.estatProcediment) &&
        Objects.equals(this.estatsProcediment, procedimentsRDTO.estatsProcediment) &&
        Objects.equals(this.historicsList, procedimentsRDTO.historicsList) &&
        Objects.equals(this.id, procedimentsRDTO.id) &&
        Objects.equals(this.identificacio, procedimentsRDTO.identificacio) &&
        Objects.equals(this.identificacions, procedimentsRDTO.identificacions) &&
        Objects.equals(this.iniciacionsList, procedimentsRDTO.iniciacionsList) &&
        Objects.equals(this.nom, procedimentsRDTO.nom) &&
        Objects.equals(this.nomCastella, procedimentsRDTO.nomCastella) &&
        Objects.equals(this.numerador, procedimentsRDTO.numerador) &&
        Objects.equals(this.procedimentsAssociatsList, procedimentsRDTO.procedimentsAssociatsList) &&
        Objects.equals(this.procedimentsRelacionatsList, procedimentsRDTO.procedimentsRelacionatsList) &&
        Objects.equals(this.reqOperatius, procedimentsRDTO.reqOperatius) &&
        Objects.equals(this.requerimentsOperatius, procedimentsRDTO.requerimentsOperatius) &&
        Objects.equals(this.serieDocumental, procedimentsRDTO.serieDocumental) &&
        Objects.equals(this.tramitador, procedimentsRDTO.tramitador) &&
        Objects.equals(this.ugosList, procedimentsRDTO.ugosList) &&
        Objects.equals(this.ugosNoms, procedimentsRDTO.ugosNoms) &&
        Objects.equals(this.ugrIdext, procedimentsRDTO.ugrIdext) &&
        Objects.equals(this.ugrNom, procedimentsRDTO.ugrNom) &&
        Objects.equals(this.ultimaModificacio, procedimentsRDTO.ultimaModificacio) &&
        Objects.equals(this.unitat, procedimentsRDTO.unitat) &&
        Objects.equals(this.versio, procedimentsRDTO.versio) &&
        Objects.equals(this.versioDocumental, procedimentsRDTO.versioDocumental);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bloqueig, bloquejos, codi, codiNom, comentarisList, configuracioAvisos, configuracioDocumentacio, dadesGrupsList, darreraModificacio, darreraSincronitzacio, descripcio, descripcioCastella, descripcioEstat, descripcioEstatCastella, descripcioEstatCatala, descripcioRelacio, estatProcediment, estatsProcediment, historicsList, id, identificacio, identificacions, iniciacionsList, nom, nomCastella, numerador, procedimentsAssociatsList, procedimentsRelacionatsList, reqOperatius, requerimentsOperatius, serieDocumental, tramitador, ugosList, ugosNoms, ugrIdext, ugrNom, ultimaModificacio, unitat, versio, versioDocumental);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcedimentsRDTO {\n");
    
    sb.append("    bloqueig: ").append(toIndentedString(bloqueig)).append("\n");
    sb.append("    bloquejos: ").append(toIndentedString(bloquejos)).append("\n");
    sb.append("    codi: ").append(toIndentedString(codi)).append("\n");
    sb.append("    codiNom: ").append(toIndentedString(codiNom)).append("\n");
    sb.append("    comentarisList: ").append(toIndentedString(comentarisList)).append("\n");
    sb.append("    configuracioAvisos: ").append(toIndentedString(configuracioAvisos)).append("\n");
    sb.append("    configuracioDocumentacio: ").append(toIndentedString(configuracioDocumentacio)).append("\n");
    sb.append("    dadesGrupsList: ").append(toIndentedString(dadesGrupsList)).append("\n");
    sb.append("    darreraModificacio: ").append(toIndentedString(darreraModificacio)).append("\n");
    sb.append("    darreraSincronitzacio: ").append(toIndentedString(darreraSincronitzacio)).append("\n");
    sb.append("    descripcio: ").append(toIndentedString(descripcio)).append("\n");
    sb.append("    descripcioCastella: ").append(toIndentedString(descripcioCastella)).append("\n");
    sb.append("    descripcioEstat: ").append(toIndentedString(descripcioEstat)).append("\n");
    sb.append("    descripcioEstatCastella: ").append(toIndentedString(descripcioEstatCastella)).append("\n");
    sb.append("    descripcioEstatCatala: ").append(toIndentedString(descripcioEstatCatala)).append("\n");
    sb.append("    descripcioRelacio: ").append(toIndentedString(descripcioRelacio)).append("\n");
    sb.append("    estatProcediment: ").append(toIndentedString(estatProcediment)).append("\n");
    sb.append("    estatsProcediment: ").append(toIndentedString(estatsProcediment)).append("\n");
    sb.append("    historicsList: ").append(toIndentedString(historicsList)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identificacio: ").append(toIndentedString(identificacio)).append("\n");
    sb.append("    identificacions: ").append(toIndentedString(identificacions)).append("\n");
    sb.append("    iniciacionsList: ").append(toIndentedString(iniciacionsList)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    nomCastella: ").append(toIndentedString(nomCastella)).append("\n");
    sb.append("    numerador: ").append(toIndentedString(numerador)).append("\n");
    sb.append("    procedimentsAssociatsList: ").append(toIndentedString(procedimentsAssociatsList)).append("\n");
    sb.append("    procedimentsRelacionatsList: ").append(toIndentedString(procedimentsRelacionatsList)).append("\n");
    sb.append("    reqOperatius: ").append(toIndentedString(reqOperatius)).append("\n");
    sb.append("    requerimentsOperatius: ").append(toIndentedString(requerimentsOperatius)).append("\n");
    sb.append("    serieDocumental: ").append(toIndentedString(serieDocumental)).append("\n");
    sb.append("    tramitador: ").append(toIndentedString(tramitador)).append("\n");
    sb.append("    ugosList: ").append(toIndentedString(ugosList)).append("\n");
    sb.append("    ugosNoms: ").append(toIndentedString(ugosNoms)).append("\n");
    sb.append("    ugrIdext: ").append(toIndentedString(ugrIdext)).append("\n");
    sb.append("    ugrNom: ").append(toIndentedString(ugrNom)).append("\n");
    sb.append("    ultimaModificacio: ").append(toIndentedString(ultimaModificacio)).append("\n");
    sb.append("    unitat: ").append(toIndentedString(unitat)).append("\n");
    sb.append("    versio: ").append(toIndentedString(versio)).append("\n");
    sb.append("    versioDocumental: ").append(toIndentedString(versioDocumental)).append("\n");
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

