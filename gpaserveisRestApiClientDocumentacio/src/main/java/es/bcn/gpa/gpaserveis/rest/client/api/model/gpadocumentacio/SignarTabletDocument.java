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
 * SignarTabletDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-27T16:00:10.249+02:00")
public class SignarTabletDocument {
  @JsonProperty("idDocument")
  private BigDecimal idDocument = null;

  @JsonProperty("idTabletUsuari")
  private String idTabletUsuari = null;

  @JsonProperty("politicaSignatura")
  private String politicaSignatura = null;

  public SignarTabletDocument idDocument(BigDecimal idDocument) {
    this.idDocument = idDocument;
    return this;
  }

   /**
   * identificador del document
   * @return idDocument
  **/
  @ApiModelProperty(value = "identificador del document")
  public BigDecimal getIdDocument() {
    return idDocument;
  }

  public void setIdDocument(BigDecimal idDocument) {
    this.idDocument = idDocument;
  }

  public SignarTabletDocument idTabletUsuari(String idTabletUsuari) {
    this.idTabletUsuari = idTabletUsuari;
    return this;
  }

   /**
   * Identificador de la tauleta on signarà l&#39;usuari
   * @return idTabletUsuari
  **/
  @ApiModelProperty(value = "Identificador de la tauleta on signarà l'usuari")
  public String getIdTabletUsuari() {
    return idTabletUsuari;
  }

  public void setIdTabletUsuari(String idTabletUsuari) {
    this.idTabletUsuari = idTabletUsuari;
  }

  public SignarTabletDocument politicaSignatura(String politicaSignatura) {
    this.politicaSignatura = politicaSignatura;
    return this;
  }

   /**
   * Nom de la política de signatura
   * @return politicaSignatura
  **/
  @ApiModelProperty(value = "Nom de la política de signatura")
  public String getPoliticaSignatura() {
    return politicaSignatura;
  }

  public void setPoliticaSignatura(String politicaSignatura) {
    this.politicaSignatura = politicaSignatura;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignarTabletDocument signarTabletDocument = (SignarTabletDocument) o;
    return Objects.equals(this.idDocument, signarTabletDocument.idDocument) &&
        Objects.equals(this.idTabletUsuari, signarTabletDocument.idTabletUsuari) &&
        Objects.equals(this.politicaSignatura, signarTabletDocument.politicaSignatura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDocument, idTabletUsuari, politicaSignatura);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignarTabletDocument {\n");
    
    sb.append("    idDocument: ").append(toIndentedString(idDocument)).append("\n");
    sb.append("    idTabletUsuari: ").append(toIndentedString(idTabletUsuari)).append("\n");
    sb.append("    politicaSignatura: ").append(toIndentedString(politicaSignatura)).append("\n");
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

