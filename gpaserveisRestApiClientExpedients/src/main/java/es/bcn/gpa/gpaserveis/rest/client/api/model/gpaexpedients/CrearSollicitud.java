/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.26.9
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.SollicitudsRDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * CrearSollicitud
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-22T10:13:49.572+01:00")
public class CrearSollicitud {
  @JsonProperty("documents")
  private List<BigDecimal> documents = null;

  @JsonProperty("matriculaInformador")
  private String matriculaInformador = null;

  @JsonProperty("sollicitud")
  private SollicitudsRDTO sollicitud = null;

  public CrearSollicitud documents(List<BigDecimal> documents) {
    this.documents = documents;
    return this;
  }

  public CrearSollicitud addDocumentsItem(BigDecimal documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<BigDecimal>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Identificador dels documents
   * @return documents
  **/
  @ApiModelProperty(value = "Identificador dels documents")
  public List<BigDecimal> getDocuments() {
    return documents;
  }

  public void setDocuments(List<BigDecimal> documents) {
    this.documents = documents;
  }

  public CrearSollicitud matriculaInformador(String matriculaInformador) {
    this.matriculaInformador = matriculaInformador;
    return this;
  }

   /**
   * Matricula de l&#39;informador
   * @return matriculaInformador
  **/
  @ApiModelProperty(value = "Matricula de l'informador")
  public String getMatriculaInformador() {
    return matriculaInformador;
  }

  public void setMatriculaInformador(String matriculaInformador) {
    this.matriculaInformador = matriculaInformador;
  }

  public CrearSollicitud sollicitud(SollicitudsRDTO sollicitud) {
    this.sollicitud = sollicitud;
    return this;
  }

   /**
   * Dades de sollicitud
   * @return sollicitud
  **/
  @ApiModelProperty(value = "Dades de sollicitud")
  public SollicitudsRDTO getSollicitud() {
    return sollicitud;
  }

  public void setSollicitud(SollicitudsRDTO sollicitud) {
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
    CrearSollicitud crearSollicitud = (CrearSollicitud) o;
    return Objects.equals(this.documents, crearSollicitud.documents) &&
        Objects.equals(this.matriculaInformador, crearSollicitud.matriculaInformador) &&
        Objects.equals(this.sollicitud, crearSollicitud.sollicitud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents, matriculaInformador, sollicitud);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrearSollicitud {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    matriculaInformador: ").append(toIndentedString(matriculaInformador)).append("\n");
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

