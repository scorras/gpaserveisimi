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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.AtributsDocs;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfdocstramTramitsOvt;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ConfiguracioDocsSignatura;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DeclaracioResponsableDocs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ConfiguracioDocsTramitacio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-04T01:51:34.681+01:00")
public class ConfiguracioDocsTramitacio {
  @JsonProperty("atributDoc")
  private BigDecimal atributDoc = null;

  @JsonProperty("atributsDocs")
  private AtributsDocs atributsDocs = null;

  @JsonProperty("categoriaNti")
  private Integer categoriaNti = null;

  @JsonProperty("confdocstramTramitsOvtList")
  private List<ConfdocstramTramitsOvt> confdocstramTramitsOvtList = null;

  @JsonProperty("configuracioDocsSignatura")
  private ConfiguracioDocsSignatura configuracioDocsSignatura = null;

  @JsonProperty("configuracioDocumentacio")
  private BigDecimal configuracioDocumentacio = null;

  @JsonProperty("configuracioSignatura")
  private BigDecimal configuracioSignatura = null;

  @JsonProperty("declaracioResponsableDoc")
  private BigDecimal declaracioResponsableDoc = null;

  @JsonProperty("declaracioResponsableDocs")
  private DeclaracioResponsableDocs declaracioResponsableDocs = null;

  @JsonProperty("descripcio")
  private String descripcio = null;

  @JsonProperty("detallOrigen")
  private String detallOrigen = null;

  @JsonProperty("fase")
  private Integer fase = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("iniciProcediment")
  private Integer iniciProcediment = null;

  @JsonProperty("nom")
  private String nom = null;

  @JsonProperty("origen")
  private Integer origen = null;

  @JsonProperty("requereixSignatura")
  private Integer requereixSignatura = null;

  @JsonProperty("suportConfeccio")
  private Integer suportConfeccio = null;

  @JsonProperty("suportEnllac")
  private String suportEnllac = null;

  @JsonProperty("tipusDocumental")
  private String tipusDocumental = null;

  @JsonProperty("tractament")
  private String tractament = null;

  @JsonProperty("vinculadaEsmena")
  private Integer vinculadaEsmena = null;

  public ConfiguracioDocsTramitacio atributDoc(BigDecimal atributDoc) {
    this.atributDoc = atributDoc;
    return this;
  }

   /**
   * Get atributDoc
   * @return atributDoc
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAtributDoc() {
    return atributDoc;
  }

  public void setAtributDoc(BigDecimal atributDoc) {
    this.atributDoc = atributDoc;
  }

  public ConfiguracioDocsTramitacio atributsDocs(AtributsDocs atributsDocs) {
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

  public ConfiguracioDocsTramitacio categoriaNti(Integer categoriaNti) {
    this.categoriaNti = categoriaNti;
    return this;
  }

   /**
   * Get categoriaNti
   * @return categoriaNti
  **/
  @ApiModelProperty(value = "")
  public Integer getCategoriaNti() {
    return categoriaNti;
  }

  public void setCategoriaNti(Integer categoriaNti) {
    this.categoriaNti = categoriaNti;
  }

  public ConfiguracioDocsTramitacio confdocstramTramitsOvtList(List<ConfdocstramTramitsOvt> confdocstramTramitsOvtList) {
    this.confdocstramTramitsOvtList = confdocstramTramitsOvtList;
    return this;
  }

  public ConfiguracioDocsTramitacio addConfdocstramTramitsOvtListItem(ConfdocstramTramitsOvt confdocstramTramitsOvtListItem) {
    if (this.confdocstramTramitsOvtList == null) {
      this.confdocstramTramitsOvtList = new ArrayList<ConfdocstramTramitsOvt>();
    }
    this.confdocstramTramitsOvtList.add(confdocstramTramitsOvtListItem);
    return this;
  }

   /**
   * Get confdocstramTramitsOvtList
   * @return confdocstramTramitsOvtList
  **/
  @ApiModelProperty(value = "")
  public List<ConfdocstramTramitsOvt> getConfdocstramTramitsOvtList() {
    return confdocstramTramitsOvtList;
  }

  public void setConfdocstramTramitsOvtList(List<ConfdocstramTramitsOvt> confdocstramTramitsOvtList) {
    this.confdocstramTramitsOvtList = confdocstramTramitsOvtList;
  }

  public ConfiguracioDocsTramitacio configuracioDocsSignatura(ConfiguracioDocsSignatura configuracioDocsSignatura) {
    this.configuracioDocsSignatura = configuracioDocsSignatura;
    return this;
  }

   /**
   * Get configuracioDocsSignatura
   * @return configuracioDocsSignatura
  **/
  @ApiModelProperty(value = "")
  public ConfiguracioDocsSignatura getConfiguracioDocsSignatura() {
    return configuracioDocsSignatura;
  }

  public void setConfiguracioDocsSignatura(ConfiguracioDocsSignatura configuracioDocsSignatura) {
    this.configuracioDocsSignatura = configuracioDocsSignatura;
  }

  public ConfiguracioDocsTramitacio configuracioDocumentacio(BigDecimal configuracioDocumentacio) {
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

  public ConfiguracioDocsTramitacio configuracioSignatura(BigDecimal configuracioSignatura) {
    this.configuracioSignatura = configuracioSignatura;
    return this;
  }

   /**
   * Get configuracioSignatura
   * @return configuracioSignatura
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getConfiguracioSignatura() {
    return configuracioSignatura;
  }

  public void setConfiguracioSignatura(BigDecimal configuracioSignatura) {
    this.configuracioSignatura = configuracioSignatura;
  }

  public ConfiguracioDocsTramitacio declaracioResponsableDoc(BigDecimal declaracioResponsableDoc) {
    this.declaracioResponsableDoc = declaracioResponsableDoc;
    return this;
  }

   /**
   * Get declaracioResponsableDoc
   * @return declaracioResponsableDoc
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDeclaracioResponsableDoc() {
    return declaracioResponsableDoc;
  }

  public void setDeclaracioResponsableDoc(BigDecimal declaracioResponsableDoc) {
    this.declaracioResponsableDoc = declaracioResponsableDoc;
  }

  public ConfiguracioDocsTramitacio declaracioResponsableDocs(DeclaracioResponsableDocs declaracioResponsableDocs) {
    this.declaracioResponsableDocs = declaracioResponsableDocs;
    return this;
  }

   /**
   * Get declaracioResponsableDocs
   * @return declaracioResponsableDocs
  **/
  @ApiModelProperty(value = "")
  public DeclaracioResponsableDocs getDeclaracioResponsableDocs() {
    return declaracioResponsableDocs;
  }

  public void setDeclaracioResponsableDocs(DeclaracioResponsableDocs declaracioResponsableDocs) {
    this.declaracioResponsableDocs = declaracioResponsableDocs;
  }

  public ConfiguracioDocsTramitacio descripcio(String descripcio) {
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

  public ConfiguracioDocsTramitacio detallOrigen(String detallOrigen) {
    this.detallOrigen = detallOrigen;
    return this;
  }

   /**
   * Get detallOrigen
   * @return detallOrigen
  **/
  @ApiModelProperty(value = "")
  public String getDetallOrigen() {
    return detallOrigen;
  }

  public void setDetallOrigen(String detallOrigen) {
    this.detallOrigen = detallOrigen;
  }

  public ConfiguracioDocsTramitacio fase(Integer fase) {
    this.fase = fase;
    return this;
  }

   /**
   * Get fase
   * @return fase
  **/
  @ApiModelProperty(value = "")
  public Integer getFase() {
    return fase;
  }

  public void setFase(Integer fase) {
    this.fase = fase;
  }

  public ConfiguracioDocsTramitacio id(BigDecimal id) {
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

  public ConfiguracioDocsTramitacio iniciProcediment(Integer iniciProcediment) {
    this.iniciProcediment = iniciProcediment;
    return this;
  }

   /**
   * Get iniciProcediment
   * @return iniciProcediment
  **/
  @ApiModelProperty(value = "")
  public Integer getIniciProcediment() {
    return iniciProcediment;
  }

  public void setIniciProcediment(Integer iniciProcediment) {
    this.iniciProcediment = iniciProcediment;
  }

  public ConfiguracioDocsTramitacio nom(String nom) {
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

  public ConfiguracioDocsTramitacio origen(Integer origen) {
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

  public ConfiguracioDocsTramitacio requereixSignatura(Integer requereixSignatura) {
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

  public ConfiguracioDocsTramitacio suportConfeccio(Integer suportConfeccio) {
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

  public ConfiguracioDocsTramitacio suportEnllac(String suportEnllac) {
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

  public ConfiguracioDocsTramitacio tipusDocumental(String tipusDocumental) {
    this.tipusDocumental = tipusDocumental;
    return this;
  }

   /**
   * Get tipusDocumental
   * @return tipusDocumental
  **/
  @ApiModelProperty(value = "")
  public String getTipusDocumental() {
    return tipusDocumental;
  }

  public void setTipusDocumental(String tipusDocumental) {
    this.tipusDocumental = tipusDocumental;
  }

  public ConfiguracioDocsTramitacio tractament(String tractament) {
    this.tractament = tractament;
    return this;
  }

   /**
   * Get tractament
   * @return tractament
  **/
  @ApiModelProperty(value = "")
  public String getTractament() {
    return tractament;
  }

  public void setTractament(String tractament) {
    this.tractament = tractament;
  }

  public ConfiguracioDocsTramitacio vinculadaEsmena(Integer vinculadaEsmena) {
    this.vinculadaEsmena = vinculadaEsmena;
    return this;
  }

   /**
   * Get vinculadaEsmena
   * @return vinculadaEsmena
  **/
  @ApiModelProperty(value = "")
  public Integer getVinculadaEsmena() {
    return vinculadaEsmena;
  }

  public void setVinculadaEsmena(Integer vinculadaEsmena) {
    this.vinculadaEsmena = vinculadaEsmena;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguracioDocsTramitacio configuracioDocsTramitacio = (ConfiguracioDocsTramitacio) o;
    return Objects.equals(this.atributDoc, configuracioDocsTramitacio.atributDoc) &&
        Objects.equals(this.atributsDocs, configuracioDocsTramitacio.atributsDocs) &&
        Objects.equals(this.categoriaNti, configuracioDocsTramitacio.categoriaNti) &&
        Objects.equals(this.confdocstramTramitsOvtList, configuracioDocsTramitacio.confdocstramTramitsOvtList) &&
        Objects.equals(this.configuracioDocsSignatura, configuracioDocsTramitacio.configuracioDocsSignatura) &&
        Objects.equals(this.configuracioDocumentacio, configuracioDocsTramitacio.configuracioDocumentacio) &&
        Objects.equals(this.configuracioSignatura, configuracioDocsTramitacio.configuracioSignatura) &&
        Objects.equals(this.declaracioResponsableDoc, configuracioDocsTramitacio.declaracioResponsableDoc) &&
        Objects.equals(this.declaracioResponsableDocs, configuracioDocsTramitacio.declaracioResponsableDocs) &&
        Objects.equals(this.descripcio, configuracioDocsTramitacio.descripcio) &&
        Objects.equals(this.detallOrigen, configuracioDocsTramitacio.detallOrigen) &&
        Objects.equals(this.fase, configuracioDocsTramitacio.fase) &&
        Objects.equals(this.id, configuracioDocsTramitacio.id) &&
        Objects.equals(this.iniciProcediment, configuracioDocsTramitacio.iniciProcediment) &&
        Objects.equals(this.nom, configuracioDocsTramitacio.nom) &&
        Objects.equals(this.origen, configuracioDocsTramitacio.origen) &&
        Objects.equals(this.requereixSignatura, configuracioDocsTramitacio.requereixSignatura) &&
        Objects.equals(this.suportConfeccio, configuracioDocsTramitacio.suportConfeccio) &&
        Objects.equals(this.suportEnllac, configuracioDocsTramitacio.suportEnllac) &&
        Objects.equals(this.tipusDocumental, configuracioDocsTramitacio.tipusDocumental) &&
        Objects.equals(this.tractament, configuracioDocsTramitacio.tractament) &&
        Objects.equals(this.vinculadaEsmena, configuracioDocsTramitacio.vinculadaEsmena);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atributDoc, atributsDocs, categoriaNti, confdocstramTramitsOvtList, configuracioDocsSignatura, configuracioDocumentacio, configuracioSignatura, declaracioResponsableDoc, declaracioResponsableDocs, descripcio, detallOrigen, fase, id, iniciProcediment, nom, origen, requereixSignatura, suportConfeccio, suportEnllac, tipusDocumental, tractament, vinculadaEsmena);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracioDocsTramitacio {\n");
    
    sb.append("    atributDoc: ").append(toIndentedString(atributDoc)).append("\n");
    sb.append("    atributsDocs: ").append(toIndentedString(atributsDocs)).append("\n");
    sb.append("    categoriaNti: ").append(toIndentedString(categoriaNti)).append("\n");
    sb.append("    confdocstramTramitsOvtList: ").append(toIndentedString(confdocstramTramitsOvtList)).append("\n");
    sb.append("    configuracioDocsSignatura: ").append(toIndentedString(configuracioDocsSignatura)).append("\n");
    sb.append("    configuracioDocumentacio: ").append(toIndentedString(configuracioDocumentacio)).append("\n");
    sb.append("    configuracioSignatura: ").append(toIndentedString(configuracioSignatura)).append("\n");
    sb.append("    declaracioResponsableDoc: ").append(toIndentedString(declaracioResponsableDoc)).append("\n");
    sb.append("    declaracioResponsableDocs: ").append(toIndentedString(declaracioResponsableDocs)).append("\n");
    sb.append("    descripcio: ").append(toIndentedString(descripcio)).append("\n");
    sb.append("    detallOrigen: ").append(toIndentedString(detallOrigen)).append("\n");
    sb.append("    fase: ").append(toIndentedString(fase)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iniciProcediment: ").append(toIndentedString(iniciProcediment)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    origen: ").append(toIndentedString(origen)).append("\n");
    sb.append("    requereixSignatura: ").append(toIndentedString(requereixSignatura)).append("\n");
    sb.append("    suportConfeccio: ").append(toIndentedString(suportConfeccio)).append("\n");
    sb.append("    suportEnllac: ").append(toIndentedString(suportEnllac)).append("\n");
    sb.append("    tipusDocumental: ").append(toIndentedString(tipusDocumental)).append("\n");
    sb.append("    tractament: ").append(toIndentedString(tractament)).append("\n");
    sb.append("    vinculadaEsmena: ").append(toIndentedString(vinculadaEsmena)).append("\n");
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
