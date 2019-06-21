/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.12.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsTramitacioRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GuardarRequerimentExpedient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-19T16:12:57.396+02:00")
public class GuardarRequerimentExpedient {
  @JsonProperty("docsTramitacio")
  private DocsTramitacioRDTO docsTramitacio = null;

  @JsonProperty("idsConfDocEntradaList")
  private List<BigDecimal> idsConfDocEntradaList = null;

  @JsonProperty("idsDadesOperList")
  private List<BigDecimal> idsDadesOperList = null;

  public GuardarRequerimentExpedient docsTramitacio(DocsTramitacioRDTO docsTramitacio) {
    this.docsTramitacio = docsTramitacio;
    return this;
  }

   /**
   * Document del requeriment
   * @return docsTramitacio
  **/
  @ApiModelProperty(value = "Document del requeriment")
  public DocsTramitacioRDTO getDocsTramitacio() {
    return docsTramitacio;
  }

  public void setDocsTramitacio(DocsTramitacioRDTO docsTramitacio) {
    this.docsTramitacio = docsTramitacio;
  }

  public GuardarRequerimentExpedient idsConfDocEntradaList(List<BigDecimal> idsConfDocEntradaList) {
    this.idsConfDocEntradaList = idsConfDocEntradaList;
    return this;
  }

  public GuardarRequerimentExpedient addIdsConfDocEntradaListItem(BigDecimal idsConfDocEntradaListItem) {
    if (this.idsConfDocEntradaList == null) {
      this.idsConfDocEntradaList = new ArrayList<BigDecimal>();
    }
    this.idsConfDocEntradaList.add(idsConfDocEntradaListItem);
    return this;
  }

   /**
   * Llista d&#39;identificadors de configuració de documentació que s&#39;afegeixen al requeriment
   * @return idsConfDocEntradaList
  **/
  @ApiModelProperty(value = "Llista d'identificadors de configuració de documentació que s'afegeixen al requeriment")
  public List<BigDecimal> getIdsConfDocEntradaList() {
    return idsConfDocEntradaList;
  }

  public void setIdsConfDocEntradaList(List<BigDecimal> idsConfDocEntradaList) {
    this.idsConfDocEntradaList = idsConfDocEntradaList;
  }

  public GuardarRequerimentExpedient idsDadesOperList(List<BigDecimal> idsDadesOperList) {
    this.idsDadesOperList = idsDadesOperList;
    return this;
  }

  public GuardarRequerimentExpedient addIdsDadesOperListItem(BigDecimal idsDadesOperListItem) {
    if (this.idsDadesOperList == null) {
      this.idsDadesOperList = new ArrayList<BigDecimal>();
    }
    this.idsDadesOperList.add(idsDadesOperListItem);
    return this;
  }

   /**
   * Llista d&#39;identificadors de dades d&#39;operació que s&#39;afegeixen al requeriment
   * @return idsDadesOperList
  **/
  @ApiModelProperty(value = "Llista d'identificadors de dades d'operació que s'afegeixen al requeriment")
  public List<BigDecimal> getIdsDadesOperList() {
    return idsDadesOperList;
  }

  public void setIdsDadesOperList(List<BigDecimal> idsDadesOperList) {
    this.idsDadesOperList = idsDadesOperList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuardarRequerimentExpedient guardarRequerimentExpedient = (GuardarRequerimentExpedient) o;
    return Objects.equals(this.docsTramitacio, guardarRequerimentExpedient.docsTramitacio) &&
        Objects.equals(this.idsConfDocEntradaList, guardarRequerimentExpedient.idsConfDocEntradaList) &&
        Objects.equals(this.idsDadesOperList, guardarRequerimentExpedient.idsDadesOperList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docsTramitacio, idsConfDocEntradaList, idsDadesOperList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuardarRequerimentExpedient {\n");
    
    sb.append("    docsTramitacio: ").append(toIndentedString(docsTramitacio)).append("\n");
    sb.append("    idsConfDocEntradaList: ").append(toIndentedString(idsConfDocEntradaList)).append("\n");
    sb.append("    idsDadesOperList: ").append(toIndentedString(idsDadesOperList)).append("\n");
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

