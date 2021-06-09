/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 2.5.1
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.PrepararSignaturaCriptograficaDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PrepararSignaturaCriptograficaDocumentMassiu
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-09T15:33:27.819+02:00")
public class PrepararSignaturaCriptograficaDocumentMassiu {
  @JsonProperty("prepararSignaturaCriptograficaDocumentList")
  private List<PrepararSignaturaCriptograficaDocument> prepararSignaturaCriptograficaDocumentList = null;

  @JsonProperty("urlRetorn")
  private String urlRetorn = null;

  public PrepararSignaturaCriptograficaDocumentMassiu prepararSignaturaCriptograficaDocumentList(List<PrepararSignaturaCriptograficaDocument> prepararSignaturaCriptograficaDocumentList) {
    this.prepararSignaturaCriptograficaDocumentList = prepararSignaturaCriptograficaDocumentList;
    return this;
  }

  public PrepararSignaturaCriptograficaDocumentMassiu addPrepararSignaturaCriptograficaDocumentListItem(PrepararSignaturaCriptograficaDocument prepararSignaturaCriptograficaDocumentListItem) {
    if (this.prepararSignaturaCriptograficaDocumentList == null) {
      this.prepararSignaturaCriptograficaDocumentList = new ArrayList<PrepararSignaturaCriptograficaDocument>();
    }
    this.prepararSignaturaCriptograficaDocumentList.add(prepararSignaturaCriptograficaDocumentListItem);
    return this;
  }

   /**
   * Llista d&#39;identificadors de document juntament amb la política de signatura que aplica
   * @return prepararSignaturaCriptograficaDocumentList
  **/
  @ApiModelProperty(value = "Llista d'identificadors de document juntament amb la política de signatura que aplica")
  public List<PrepararSignaturaCriptograficaDocument> getPrepararSignaturaCriptograficaDocumentList() {
    return prepararSignaturaCriptograficaDocumentList;
  }

  public void setPrepararSignaturaCriptograficaDocumentList(List<PrepararSignaturaCriptograficaDocument> prepararSignaturaCriptograficaDocumentList) {
    this.prepararSignaturaCriptograficaDocumentList = prepararSignaturaCriptograficaDocumentList;
  }

  public PrepararSignaturaCriptograficaDocumentMassiu urlRetorn(String urlRetorn) {
    this.urlRetorn = urlRetorn;
    return this;
  }

   /**
   * URL de redirecció per a l&#39;execució de la signatura criptogràfica online a client
   * @return urlRetorn
  **/
  @ApiModelProperty(value = "URL de redirecció per a l'execució de la signatura criptogràfica online a client")
  public String getUrlRetorn() {
    return urlRetorn;
  }

  public void setUrlRetorn(String urlRetorn) {
    this.urlRetorn = urlRetorn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepararSignaturaCriptograficaDocumentMassiu prepararSignaturaCriptograficaDocumentMassiu = (PrepararSignaturaCriptograficaDocumentMassiu) o;
    return Objects.equals(this.prepararSignaturaCriptograficaDocumentList, prepararSignaturaCriptograficaDocumentMassiu.prepararSignaturaCriptograficaDocumentList) &&
        Objects.equals(this.urlRetorn, prepararSignaturaCriptograficaDocumentMassiu.urlRetorn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prepararSignaturaCriptograficaDocumentList, urlRetorn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepararSignaturaCriptograficaDocumentMassiu {\n");
    
    sb.append("    prepararSignaturaCriptograficaDocumentList: ").append(toIndentedString(prepararSignaturaCriptograficaDocumentList)).append("\n");
    sb.append("    urlRetorn: ").append(toIndentedString(urlRetorn)).append("\n");
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

