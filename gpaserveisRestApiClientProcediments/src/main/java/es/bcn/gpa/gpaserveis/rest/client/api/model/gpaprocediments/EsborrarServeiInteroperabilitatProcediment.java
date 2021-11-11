/*
 * API gpaprocediments
 * API gpaprocediments
 *
 * OpenAPI spec version: 2.10.1
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
import java.util.ArrayList;
import java.util.List;

/**
 * EsborrarServeiInteroperabilitatProcediment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-08T16:49:56.830+01:00")
public class EsborrarServeiInteroperabilitatProcediment {
  @JsonProperty("idProcediment")
  private BigDecimal idProcediment = null;

  @JsonProperty("idServeisInteroperabilitatList")
  private List<BigDecimal> idServeisInteroperabilitatList = null;

  public EsborrarServeiInteroperabilitatProcediment idProcediment(BigDecimal idProcediment) {
    this.idProcediment = idProcediment;
    return this;
  }

   /**
   * Identificador del procediment
   * @return idProcediment
  **/
  @ApiModelProperty(value = "Identificador del procediment")
  public BigDecimal getIdProcediment() {
    return idProcediment;
  }

  public void setIdProcediment(BigDecimal idProcediment) {
    this.idProcediment = idProcediment;
  }

  public EsborrarServeiInteroperabilitatProcediment idServeisInteroperabilitatList(List<BigDecimal> idServeisInteroperabilitatList) {
    this.idServeisInteroperabilitatList = idServeisInteroperabilitatList;
    return this;
  }

  public EsborrarServeiInteroperabilitatProcediment addIdServeisInteroperabilitatListItem(BigDecimal idServeisInteroperabilitatListItem) {
    if (this.idServeisInteroperabilitatList == null) {
      this.idServeisInteroperabilitatList = new ArrayList<BigDecimal>();
    }
    this.idServeisInteroperabilitatList.add(idServeisInteroperabilitatListItem);
    return this;
  }

   /**
   * Llista dels serveis a esborrar
   * @return idServeisInteroperabilitatList
  **/
  @ApiModelProperty(value = "Llista dels serveis a esborrar")
  public List<BigDecimal> getIdServeisInteroperabilitatList() {
    return idServeisInteroperabilitatList;
  }

  public void setIdServeisInteroperabilitatList(List<BigDecimal> idServeisInteroperabilitatList) {
    this.idServeisInteroperabilitatList = idServeisInteroperabilitatList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsborrarServeiInteroperabilitatProcediment esborrarServeiInteroperabilitatProcediment = (EsborrarServeiInteroperabilitatProcediment) o;
    return Objects.equals(this.idProcediment, esborrarServeiInteroperabilitatProcediment.idProcediment) &&
        Objects.equals(this.idServeisInteroperabilitatList, esborrarServeiInteroperabilitatProcediment.idServeisInteroperabilitatList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProcediment, idServeisInteroperabilitatList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsborrarServeiInteroperabilitatProcediment {\n");
    
    sb.append("    idProcediment: ").append(toIndentedString(idProcediment)).append("\n");
    sb.append("    idServeisInteroperabilitatList: ").append(toIndentedString(idServeisInteroperabilitatList)).append("\n");
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

