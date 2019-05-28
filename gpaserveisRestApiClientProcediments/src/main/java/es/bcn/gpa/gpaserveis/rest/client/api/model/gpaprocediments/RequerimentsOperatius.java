/*
 * API gpaprocediments
 * API gpaprocediments
 *
 * OpenAPI spec version: 1.11.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * RequerimentsOperatius
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-10T10:06:44.423+02:00")
public class RequerimentsOperatius {
  @JsonProperty("allegacio")
  private Integer allegacio = null;

  @JsonProperty("ambDocumentSuport")
  private Integer ambDocumentSuport = null;

  @JsonProperty("aplicaProcediment")
  private Integer aplicaProcediment = null;

  @JsonProperty("aplicacioNegoci")
  private String aplicacioNegoci = null;

  @JsonProperty("aportacio")
  private Integer aportacio = null;

  @JsonProperty("detallActivador")
  private String detallActivador = null;

  @JsonProperty("detallAllegacio")
  private String detallAllegacio = null;

  @JsonProperty("detallAportacio")
  private String detallAportacio = null;

  @JsonProperty("detallDestinatari")
  private String detallDestinatari = null;

  @JsonProperty("detallEsmena")
  private String detallEsmena = null;

  @JsonProperty("detallSollicitud")
  private String detallSollicitud = null;

  @JsonProperty("diagramaProcediment")
  private Integer diagramaProcediment = null;

  @JsonProperty("esmena")
  private Integer esmena = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("informacioTramitacio")
  private String informacioTramitacio = null;

  @JsonProperty("instruccionsArxiu")
  private String instruccionsArxiu = null;

  @JsonProperty("linkDocumentSuport")
  private String linkDocumentSuport = null;

  @JsonProperty("nivellIntegracio")
  private BigDecimal nivellIntegracio = null;

  @JsonProperty("nomDocument")
  private String nomDocument = null;

  @JsonProperty("plantillaDadesNegoci")
  private Integer plantillaDadesNegoci = null;

  @JsonProperty("procedimentExecutable")
  private Integer procedimentExecutable = null;

  @JsonProperty("sollicitud")
  private Integer sollicitud = null;

  public RequerimentsOperatius allegacio(Integer allegacio) {
    this.allegacio = allegacio;
    return this;
  }

   /**
   * Get allegacio
   * @return allegacio
  **/
  @ApiModelProperty(value = "")
  public Integer getAllegacio() {
    return allegacio;
  }

  public void setAllegacio(Integer allegacio) {
    this.allegacio = allegacio;
  }

  public RequerimentsOperatius ambDocumentSuport(Integer ambDocumentSuport) {
    this.ambDocumentSuport = ambDocumentSuport;
    return this;
  }

   /**
   * Get ambDocumentSuport
   * @return ambDocumentSuport
  **/
  @ApiModelProperty(value = "")
  public Integer getAmbDocumentSuport() {
    return ambDocumentSuport;
  }

  public void setAmbDocumentSuport(Integer ambDocumentSuport) {
    this.ambDocumentSuport = ambDocumentSuport;
  }

  public RequerimentsOperatius aplicaProcediment(Integer aplicaProcediment) {
    this.aplicaProcediment = aplicaProcediment;
    return this;
  }

   /**
   * Get aplicaProcediment
   * @return aplicaProcediment
  **/
  @ApiModelProperty(value = "")
  public Integer getAplicaProcediment() {
    return aplicaProcediment;
  }

  public void setAplicaProcediment(Integer aplicaProcediment) {
    this.aplicaProcediment = aplicaProcediment;
  }

  public RequerimentsOperatius aplicacioNegoci(String aplicacioNegoci) {
    this.aplicacioNegoci = aplicacioNegoci;
    return this;
  }

   /**
   * Get aplicacioNegoci
   * @return aplicacioNegoci
  **/
  @ApiModelProperty(value = "")
  public String getAplicacioNegoci() {
    return aplicacioNegoci;
  }

  public void setAplicacioNegoci(String aplicacioNegoci) {
    this.aplicacioNegoci = aplicacioNegoci;
  }

  public RequerimentsOperatius aportacio(Integer aportacio) {
    this.aportacio = aportacio;
    return this;
  }

   /**
   * Get aportacio
   * @return aportacio
  **/
  @ApiModelProperty(value = "")
  public Integer getAportacio() {
    return aportacio;
  }

  public void setAportacio(Integer aportacio) {
    this.aportacio = aportacio;
  }

  public RequerimentsOperatius detallActivador(String detallActivador) {
    this.detallActivador = detallActivador;
    return this;
  }

   /**
   * Get detallActivador
   * @return detallActivador
  **/
  @ApiModelProperty(value = "")
  public String getDetallActivador() {
    return detallActivador;
  }

  public void setDetallActivador(String detallActivador) {
    this.detallActivador = detallActivador;
  }

  public RequerimentsOperatius detallAllegacio(String detallAllegacio) {
    this.detallAllegacio = detallAllegacio;
    return this;
  }

   /**
   * Get detallAllegacio
   * @return detallAllegacio
  **/
  @ApiModelProperty(value = "")
  public String getDetallAllegacio() {
    return detallAllegacio;
  }

  public void setDetallAllegacio(String detallAllegacio) {
    this.detallAllegacio = detallAllegacio;
  }

  public RequerimentsOperatius detallAportacio(String detallAportacio) {
    this.detallAportacio = detallAportacio;
    return this;
  }

   /**
   * Get detallAportacio
   * @return detallAportacio
  **/
  @ApiModelProperty(value = "")
  public String getDetallAportacio() {
    return detallAportacio;
  }

  public void setDetallAportacio(String detallAportacio) {
    this.detallAportacio = detallAportacio;
  }

  public RequerimentsOperatius detallDestinatari(String detallDestinatari) {
    this.detallDestinatari = detallDestinatari;
    return this;
  }

   /**
   * Get detallDestinatari
   * @return detallDestinatari
  **/
  @ApiModelProperty(value = "")
  public String getDetallDestinatari() {
    return detallDestinatari;
  }

  public void setDetallDestinatari(String detallDestinatari) {
    this.detallDestinatari = detallDestinatari;
  }

  public RequerimentsOperatius detallEsmena(String detallEsmena) {
    this.detallEsmena = detallEsmena;
    return this;
  }

   /**
   * Get detallEsmena
   * @return detallEsmena
  **/
  @ApiModelProperty(value = "")
  public String getDetallEsmena() {
    return detallEsmena;
  }

  public void setDetallEsmena(String detallEsmena) {
    this.detallEsmena = detallEsmena;
  }

  public RequerimentsOperatius detallSollicitud(String detallSollicitud) {
    this.detallSollicitud = detallSollicitud;
    return this;
  }

   /**
   * Get detallSollicitud
   * @return detallSollicitud
  **/
  @ApiModelProperty(value = "")
  public String getDetallSollicitud() {
    return detallSollicitud;
  }

  public void setDetallSollicitud(String detallSollicitud) {
    this.detallSollicitud = detallSollicitud;
  }

  public RequerimentsOperatius diagramaProcediment(Integer diagramaProcediment) {
    this.diagramaProcediment = diagramaProcediment;
    return this;
  }

   /**
   * Get diagramaProcediment
   * @return diagramaProcediment
  **/
  @ApiModelProperty(value = "")
  public Integer getDiagramaProcediment() {
    return diagramaProcediment;
  }

  public void setDiagramaProcediment(Integer diagramaProcediment) {
    this.diagramaProcediment = diagramaProcediment;
  }

  public RequerimentsOperatius esmena(Integer esmena) {
    this.esmena = esmena;
    return this;
  }

   /**
   * Get esmena
   * @return esmena
  **/
  @ApiModelProperty(value = "")
  public Integer getEsmena() {
    return esmena;
  }

  public void setEsmena(Integer esmena) {
    this.esmena = esmena;
  }

  public RequerimentsOperatius id(BigDecimal id) {
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

  public RequerimentsOperatius informacioTramitacio(String informacioTramitacio) {
    this.informacioTramitacio = informacioTramitacio;
    return this;
  }

   /**
   * Get informacioTramitacio
   * @return informacioTramitacio
  **/
  @ApiModelProperty(value = "")
  public String getInformacioTramitacio() {
    return informacioTramitacio;
  }

  public void setInformacioTramitacio(String informacioTramitacio) {
    this.informacioTramitacio = informacioTramitacio;
  }

  public RequerimentsOperatius instruccionsArxiu(String instruccionsArxiu) {
    this.instruccionsArxiu = instruccionsArxiu;
    return this;
  }

   /**
   * Get instruccionsArxiu
   * @return instruccionsArxiu
  **/
  @ApiModelProperty(value = "")
  public String getInstruccionsArxiu() {
    return instruccionsArxiu;
  }

  public void setInstruccionsArxiu(String instruccionsArxiu) {
    this.instruccionsArxiu = instruccionsArxiu;
  }

  public RequerimentsOperatius linkDocumentSuport(String linkDocumentSuport) {
    this.linkDocumentSuport = linkDocumentSuport;
    return this;
  }

   /**
   * Get linkDocumentSuport
   * @return linkDocumentSuport
  **/
  @ApiModelProperty(value = "")
  public String getLinkDocumentSuport() {
    return linkDocumentSuport;
  }

  public void setLinkDocumentSuport(String linkDocumentSuport) {
    this.linkDocumentSuport = linkDocumentSuport;
  }

  public RequerimentsOperatius nivellIntegracio(BigDecimal nivellIntegracio) {
    this.nivellIntegracio = nivellIntegracio;
    return this;
  }

   /**
   * Get nivellIntegracio
   * @return nivellIntegracio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getNivellIntegracio() {
    return nivellIntegracio;
  }

  public void setNivellIntegracio(BigDecimal nivellIntegracio) {
    this.nivellIntegracio = nivellIntegracio;
  }

  public RequerimentsOperatius nomDocument(String nomDocument) {
    this.nomDocument = nomDocument;
    return this;
  }

   /**
   * Get nomDocument
   * @return nomDocument
  **/
  @ApiModelProperty(value = "")
  public String getNomDocument() {
    return nomDocument;
  }

  public void setNomDocument(String nomDocument) {
    this.nomDocument = nomDocument;
  }

  public RequerimentsOperatius plantillaDadesNegoci(Integer plantillaDadesNegoci) {
    this.plantillaDadesNegoci = plantillaDadesNegoci;
    return this;
  }

   /**
   * Get plantillaDadesNegoci
   * @return plantillaDadesNegoci
  **/
  @ApiModelProperty(value = "")
  public Integer getPlantillaDadesNegoci() {
    return plantillaDadesNegoci;
  }

  public void setPlantillaDadesNegoci(Integer plantillaDadesNegoci) {
    this.plantillaDadesNegoci = plantillaDadesNegoci;
  }

  public RequerimentsOperatius procedimentExecutable(Integer procedimentExecutable) {
    this.procedimentExecutable = procedimentExecutable;
    return this;
  }

   /**
   * Get procedimentExecutable
   * @return procedimentExecutable
  **/
  @ApiModelProperty(value = "")
  public Integer getProcedimentExecutable() {
    return procedimentExecutable;
  }

  public void setProcedimentExecutable(Integer procedimentExecutable) {
    this.procedimentExecutable = procedimentExecutable;
  }

  public RequerimentsOperatius sollicitud(Integer sollicitud) {
    this.sollicitud = sollicitud;
    return this;
  }

   /**
   * Get sollicitud
   * @return sollicitud
  **/
  @ApiModelProperty(value = "")
  public Integer getSollicitud() {
    return sollicitud;
  }

  public void setSollicitud(Integer sollicitud) {
    this.sollicitud = sollicitud;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequerimentsOperatius requerimentsOperatius = (RequerimentsOperatius) o;
    return Objects.equals(this.allegacio, requerimentsOperatius.allegacio) &&
        Objects.equals(this.ambDocumentSuport, requerimentsOperatius.ambDocumentSuport) &&
        Objects.equals(this.aplicaProcediment, requerimentsOperatius.aplicaProcediment) &&
        Objects.equals(this.aplicacioNegoci, requerimentsOperatius.aplicacioNegoci) &&
        Objects.equals(this.aportacio, requerimentsOperatius.aportacio) &&
        Objects.equals(this.detallActivador, requerimentsOperatius.detallActivador) &&
        Objects.equals(this.detallAllegacio, requerimentsOperatius.detallAllegacio) &&
        Objects.equals(this.detallAportacio, requerimentsOperatius.detallAportacio) &&
        Objects.equals(this.detallDestinatari, requerimentsOperatius.detallDestinatari) &&
        Objects.equals(this.detallEsmena, requerimentsOperatius.detallEsmena) &&
        Objects.equals(this.detallSollicitud, requerimentsOperatius.detallSollicitud) &&
        Objects.equals(this.diagramaProcediment, requerimentsOperatius.diagramaProcediment) &&
        Objects.equals(this.esmena, requerimentsOperatius.esmena) &&
        Objects.equals(this.id, requerimentsOperatius.id) &&
        Objects.equals(this.informacioTramitacio, requerimentsOperatius.informacioTramitacio) &&
        Objects.equals(this.instruccionsArxiu, requerimentsOperatius.instruccionsArxiu) &&
        Objects.equals(this.linkDocumentSuport, requerimentsOperatius.linkDocumentSuport) &&
        Objects.equals(this.nivellIntegracio, requerimentsOperatius.nivellIntegracio) &&
        Objects.equals(this.nomDocument, requerimentsOperatius.nomDocument) &&
        Objects.equals(this.plantillaDadesNegoci, requerimentsOperatius.plantillaDadesNegoci) &&
        Objects.equals(this.procedimentExecutable, requerimentsOperatius.procedimentExecutable) &&
        Objects.equals(this.sollicitud, requerimentsOperatius.sollicitud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allegacio, ambDocumentSuport, aplicaProcediment, aplicacioNegoci, aportacio, detallActivador, detallAllegacio, detallAportacio, detallDestinatari, detallEsmena, detallSollicitud, diagramaProcediment, esmena, id, informacioTramitacio, instruccionsArxiu, linkDocumentSuport, nivellIntegracio, nomDocument, plantillaDadesNegoci, procedimentExecutable, sollicitud);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequerimentsOperatius {\n");
    
    sb.append("    allegacio: ").append(toIndentedString(allegacio)).append("\n");
    sb.append("    ambDocumentSuport: ").append(toIndentedString(ambDocumentSuport)).append("\n");
    sb.append("    aplicaProcediment: ").append(toIndentedString(aplicaProcediment)).append("\n");
    sb.append("    aplicacioNegoci: ").append(toIndentedString(aplicacioNegoci)).append("\n");
    sb.append("    aportacio: ").append(toIndentedString(aportacio)).append("\n");
    sb.append("    detallActivador: ").append(toIndentedString(detallActivador)).append("\n");
    sb.append("    detallAllegacio: ").append(toIndentedString(detallAllegacio)).append("\n");
    sb.append("    detallAportacio: ").append(toIndentedString(detallAportacio)).append("\n");
    sb.append("    detallDestinatari: ").append(toIndentedString(detallDestinatari)).append("\n");
    sb.append("    detallEsmena: ").append(toIndentedString(detallEsmena)).append("\n");
    sb.append("    detallSollicitud: ").append(toIndentedString(detallSollicitud)).append("\n");
    sb.append("    diagramaProcediment: ").append(toIndentedString(diagramaProcediment)).append("\n");
    sb.append("    esmena: ").append(toIndentedString(esmena)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    informacioTramitacio: ").append(toIndentedString(informacioTramitacio)).append("\n");
    sb.append("    instruccionsArxiu: ").append(toIndentedString(instruccionsArxiu)).append("\n");
    sb.append("    linkDocumentSuport: ").append(toIndentedString(linkDocumentSuport)).append("\n");
    sb.append("    nivellIntegracio: ").append(toIndentedString(nivellIntegracio)).append("\n");
    sb.append("    nomDocument: ").append(toIndentedString(nomDocument)).append("\n");
    sb.append("    plantillaDadesNegoci: ").append(toIndentedString(plantillaDadesNegoci)).append("\n");
    sb.append("    procedimentExecutable: ").append(toIndentedString(procedimentExecutable)).append("\n");
    sb.append("    sollicitud: ").append(toIndentedString(sollicitud)).append("\n");
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

