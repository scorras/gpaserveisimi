/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.20.3
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.Comentaris;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * RetornarTramitacioRDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-02T10:26:48.941+02:00")
public class RetornarTramitacioRDTO {
  @JsonProperty("comentari")
  private Comentaris comentari = null;

  @JsonProperty("llistaUGConvidadas")
  private List<BigDecimal> llistaUGConvidadas = null;

  public RetornarTramitacioRDTO comentari(Comentaris comentari) {
    this.comentari = comentari;
    return this;
  }

   /**
   * Get comentari
   * @return comentari
  **/
  @ApiModelProperty(value = "")
  public Comentaris getComentari() {
    return comentari;
  }

  public void setComentari(Comentaris comentari) {
    this.comentari = comentari;
  }

  public RetornarTramitacioRDTO llistaUGConvidadas(List<BigDecimal> llistaUGConvidadas) {
    this.llistaUGConvidadas = llistaUGConvidadas;
    return this;
  }

  public RetornarTramitacioRDTO addLlistaUGConvidadasItem(BigDecimal llistaUGConvidadasItem) {
    if (this.llistaUGConvidadas == null) {
      this.llistaUGConvidadas = new ArrayList<BigDecimal>();
    }
    this.llistaUGConvidadas.add(llistaUGConvidadasItem);
    return this;
  }

   /**
   * Get llistaUGConvidadas
   * @return llistaUGConvidadas
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getLlistaUGConvidadas() {
    return llistaUGConvidadas;
  }

  public void setLlistaUGConvidadas(List<BigDecimal> llistaUGConvidadas) {
    this.llistaUGConvidadas = llistaUGConvidadas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetornarTramitacioRDTO retornarTramitacioRDTO = (RetornarTramitacioRDTO) o;
    return Objects.equals(this.comentari, retornarTramitacioRDTO.comentari) &&
        Objects.equals(this.llistaUGConvidadas, retornarTramitacioRDTO.llistaUGConvidadas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comentari, llistaUGConvidadas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornarTramitacioRDTO {\n");
    
    sb.append("    comentari: ").append(toIndentedString(comentari)).append("\n");
    sb.append("    llistaUGConvidadas: ").append(toIndentedString(llistaUGConvidadas)).append("\n");
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

