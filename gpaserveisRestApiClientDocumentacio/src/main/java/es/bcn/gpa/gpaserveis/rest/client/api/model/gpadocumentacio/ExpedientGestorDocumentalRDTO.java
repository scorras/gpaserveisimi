/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.22.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * ExpedientGestorDocumentalRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-28T16:18:30.394+02:00")
public class ExpedientGestorDocumentalRDTO {
  @JsonProperty("codiExpedient")
  private String codiExpedient = null;

  @JsonProperty("codiUnitatOrganigrama")
  private String codiUnitatOrganigrama = null;

  @JsonProperty("documentacioIdext")
  private BigDecimal documentacioIdext = null;

  @JsonProperty("idEstat")
  private BigDecimal idEstat = null;

  @JsonProperty("migracioIdOrigen")
  private String migracioIdOrigen = null;

  @JsonProperty("nomProc")
  private String nomProc = null;

  @JsonProperty("numRegistre")
  private String numRegistre = null;

  @JsonProperty("pathSerieDoc")
  private String pathSerieDoc = null;

  @JsonProperty("serieDoc")
  private String serieDoc = null;

  public ExpedientGestorDocumentalRDTO codiExpedient(String codiExpedient) {
    this.codiExpedient = codiExpedient;
    return this;
  }

   /**
   * Get codiExpedient
   * @return codiExpedient
  **/
  @ApiModelProperty(value = "")
  public String getCodiExpedient() {
    return codiExpedient;
  }

  public void setCodiExpedient(String codiExpedient) {
    this.codiExpedient = codiExpedient;
  }

  public ExpedientGestorDocumentalRDTO codiUnitatOrganigrama(String codiUnitatOrganigrama) {
    this.codiUnitatOrganigrama = codiUnitatOrganigrama;
    return this;
  }

   /**
   * Get codiUnitatOrganigrama
   * @return codiUnitatOrganigrama
  **/
  @ApiModelProperty(value = "")
  public String getCodiUnitatOrganigrama() {
    return codiUnitatOrganigrama;
  }

  public void setCodiUnitatOrganigrama(String codiUnitatOrganigrama) {
    this.codiUnitatOrganigrama = codiUnitatOrganigrama;
  }

  public ExpedientGestorDocumentalRDTO documentacioIdext(BigDecimal documentacioIdext) {
    this.documentacioIdext = documentacioIdext;
    return this;
  }

   /**
   * Get documentacioIdext
   * @return documentacioIdext
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDocumentacioIdext() {
    return documentacioIdext;
  }

  public void setDocumentacioIdext(BigDecimal documentacioIdext) {
    this.documentacioIdext = documentacioIdext;
  }

  public ExpedientGestorDocumentalRDTO idEstat(BigDecimal idEstat) {
    this.idEstat = idEstat;
    return this;
  }

   /**
   * Get idEstat
   * @return idEstat
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIdEstat() {
    return idEstat;
  }

  public void setIdEstat(BigDecimal idEstat) {
    this.idEstat = idEstat;
  }

  public ExpedientGestorDocumentalRDTO migracioIdOrigen(String migracioIdOrigen) {
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

  public ExpedientGestorDocumentalRDTO nomProc(String nomProc) {
    this.nomProc = nomProc;
    return this;
  }

   /**
   * Get nomProc
   * @return nomProc
  **/
  @ApiModelProperty(value = "")
  public String getNomProc() {
    return nomProc;
  }

  public void setNomProc(String nomProc) {
    this.nomProc = nomProc;
  }

  public ExpedientGestorDocumentalRDTO numRegistre(String numRegistre) {
    this.numRegistre = numRegistre;
    return this;
  }

   /**
   * Get numRegistre
   * @return numRegistre
  **/
  @ApiModelProperty(value = "")
  public String getNumRegistre() {
    return numRegistre;
  }

  public void setNumRegistre(String numRegistre) {
    this.numRegistre = numRegistre;
  }

  public ExpedientGestorDocumentalRDTO pathSerieDoc(String pathSerieDoc) {
    this.pathSerieDoc = pathSerieDoc;
    return this;
  }

   /**
   * Get pathSerieDoc
   * @return pathSerieDoc
  **/
  @ApiModelProperty(value = "")
  public String getPathSerieDoc() {
    return pathSerieDoc;
  }

  public void setPathSerieDoc(String pathSerieDoc) {
    this.pathSerieDoc = pathSerieDoc;
  }

  public ExpedientGestorDocumentalRDTO serieDoc(String serieDoc) {
    this.serieDoc = serieDoc;
    return this;
  }

   /**
   * Get serieDoc
   * @return serieDoc
  **/
  @ApiModelProperty(value = "")
  public String getSerieDoc() {
    return serieDoc;
  }

  public void setSerieDoc(String serieDoc) {
    this.serieDoc = serieDoc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpedientGestorDocumentalRDTO expedientGestorDocumentalRDTO = (ExpedientGestorDocumentalRDTO) o;
    return Objects.equals(this.codiExpedient, expedientGestorDocumentalRDTO.codiExpedient) &&
        Objects.equals(this.codiUnitatOrganigrama, expedientGestorDocumentalRDTO.codiUnitatOrganigrama) &&
        Objects.equals(this.documentacioIdext, expedientGestorDocumentalRDTO.documentacioIdext) &&
        Objects.equals(this.idEstat, expedientGestorDocumentalRDTO.idEstat) &&
        Objects.equals(this.migracioIdOrigen, expedientGestorDocumentalRDTO.migracioIdOrigen) &&
        Objects.equals(this.nomProc, expedientGestorDocumentalRDTO.nomProc) &&
        Objects.equals(this.numRegistre, expedientGestorDocumentalRDTO.numRegistre) &&
        Objects.equals(this.pathSerieDoc, expedientGestorDocumentalRDTO.pathSerieDoc) &&
        Objects.equals(this.serieDoc, expedientGestorDocumentalRDTO.serieDoc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiExpedient, codiUnitatOrganigrama, documentacioIdext, idEstat, migracioIdOrigen, nomProc, numRegistre, pathSerieDoc, serieDoc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpedientGestorDocumentalRDTO {\n");
    
    sb.append("    codiExpedient: ").append(toIndentedString(codiExpedient)).append("\n");
    sb.append("    codiUnitatOrganigrama: ").append(toIndentedString(codiUnitatOrganigrama)).append("\n");
    sb.append("    documentacioIdext: ").append(toIndentedString(documentacioIdext)).append("\n");
    sb.append("    idEstat: ").append(toIndentedString(idEstat)).append("\n");
    sb.append("    migracioIdOrigen: ").append(toIndentedString(migracioIdOrigen)).append("\n");
    sb.append("    nomProc: ").append(toIndentedString(nomProc)).append("\n");
    sb.append("    numRegistre: ").append(toIndentedString(numRegistre)).append("\n");
    sb.append("    pathSerieDoc: ").append(toIndentedString(pathSerieDoc)).append("\n");
    sb.append("    serieDoc: ").append(toIndentedString(serieDoc)).append("\n");
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

