/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.11.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsEntradaRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ExpedientRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.RegistreAssentamentRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RespostaUploadDocumentExpedient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T11:28:11.327+02:00")
public class RespostaUploadDocumentExpedient {
  @JsonProperty("docEntrada")
  private DocsEntradaRDTO docEntrada = null;

  @JsonProperty("expedient")
  private ExpedientRDTO expedient = null;

  @JsonProperty("registreAssentament")
  private RegistreAssentamentRDTO registreAssentament = null;

  public RespostaUploadDocumentExpedient docEntrada(DocsEntradaRDTO docEntrada) {
    this.docEntrada = docEntrada;
    return this;
  }

   /**
   * Document substituït en l&#39;expedient
   * @return docEntrada
  **/
  @ApiModelProperty(value = "Document substituït en l'expedient")
  public DocsEntradaRDTO getDocEntrada() {
    return docEntrada;
  }

  public void setDocEntrada(DocsEntradaRDTO docEntrada) {
    this.docEntrada = docEntrada;
  }

  public RespostaUploadDocumentExpedient expedient(ExpedientRDTO expedient) {
    this.expedient = expedient;
    return this;
  }

   /**
   * Dades bàsiques de l&#39;expedient
   * @return expedient
  **/
  @ApiModelProperty(value = "Dades bàsiques de l'expedient")
  public ExpedientRDTO getExpedient() {
    return expedient;
  }

  public void setExpedient(ExpedientRDTO expedient) {
    this.expedient = expedient;
  }

  public RespostaUploadDocumentExpedient registreAssentament(RegistreAssentamentRDTO registreAssentament) {
    this.registreAssentament = registreAssentament;
    return this;
  }

   /**
   * Dades del registre dels documents aportats
   * @return registreAssentament
  **/
  @ApiModelProperty(value = "Dades del registre dels documents aportats")
  public RegistreAssentamentRDTO getRegistreAssentament() {
    return registreAssentament;
  }

  public void setRegistreAssentament(RegistreAssentamentRDTO registreAssentament) {
    this.registreAssentament = registreAssentament;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespostaUploadDocumentExpedient respostaUploadDocumentExpedient = (RespostaUploadDocumentExpedient) o;
    return Objects.equals(this.docEntrada, respostaUploadDocumentExpedient.docEntrada) &&
        Objects.equals(this.expedient, respostaUploadDocumentExpedient.expedient) &&
        Objects.equals(this.registreAssentament, respostaUploadDocumentExpedient.registreAssentament);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docEntrada, expedient, registreAssentament);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaUploadDocumentExpedient {\n");
    
    sb.append("    docEntrada: ").append(toIndentedString(docEntrada)).append("\n");
    sb.append("    expedient: ").append(toIndentedString(expedient)).append("\n");
    sb.append("    registreAssentament: ").append(toIndentedString(registreAssentament)).append("\n");
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

