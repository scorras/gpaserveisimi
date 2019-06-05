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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * CrearNotificacio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-05T13:25:08.238+02:00")
public class CrearNotificacio {
  @JsonProperty("docsTramitacioId")
  private BigDecimal docsTramitacioId = null;

  @JsonProperty("expedientId")
  private BigDecimal expedientId = null;

  @JsonProperty("notificacioId")
  private BigDecimal notificacioId = null;

  public CrearNotificacio docsTramitacioId(BigDecimal docsTramitacioId) {
    this.docsTramitacioId = docsTramitacioId;
    return this;
  }

   /**
   * Identificador del document de tramitació
   * @return docsTramitacioId
  **/
  @ApiModelProperty(value = "Identificador del document de tramitació")
  public BigDecimal getDocsTramitacioId() {
    return docsTramitacioId;
  }

  public void setDocsTramitacioId(BigDecimal docsTramitacioId) {
    this.docsTramitacioId = docsTramitacioId;
  }

  public CrearNotificacio expedientId(BigDecimal expedientId) {
    this.expedientId = expedientId;
    return this;
  }

   /**
   * Identificador de l&#39;expedient
   * @return expedientId
  **/
  @ApiModelProperty(value = "Identificador de l'expedient")
  public BigDecimal getExpedientId() {
    return expedientId;
  }

  public void setExpedientId(BigDecimal expedientId) {
    this.expedientId = expedientId;
  }

  public CrearNotificacio notificacioId(BigDecimal notificacioId) {
    this.notificacioId = notificacioId;
    return this;
  }

   /**
   * Identificador de la notificació
   * @return notificacioId
  **/
  @ApiModelProperty(value = "Identificador de la notificació")
  public BigDecimal getNotificacioId() {
    return notificacioId;
  }

  public void setNotificacioId(BigDecimal notificacioId) {
    this.notificacioId = notificacioId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrearNotificacio crearNotificacio = (CrearNotificacio) o;
    return Objects.equals(this.docsTramitacioId, crearNotificacio.docsTramitacioId) &&
        Objects.equals(this.expedientId, crearNotificacio.expedientId) &&
        Objects.equals(this.notificacioId, crearNotificacio.notificacioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docsTramitacioId, expedientId, notificacioId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrearNotificacio {\n");
    
    sb.append("    docsTramitacioId: ").append(toIndentedString(docsTramitacioId)).append("\n");
    sb.append("    expedientId: ").append(toIndentedString(expedientId)).append("\n");
    sb.append("    notificacioId: ").append(toIndentedString(notificacioId)).append("\n");
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

