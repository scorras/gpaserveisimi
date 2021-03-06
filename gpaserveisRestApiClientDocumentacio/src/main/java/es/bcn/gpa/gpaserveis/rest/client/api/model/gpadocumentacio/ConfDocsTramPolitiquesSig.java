/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 2.11.0
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
 * ConfDocsTramPolitiquesSig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-24T17:42:42.347+01:00")
public class ConfDocsTramPolitiquesSig {
  @JsonProperty("configuracioDocsTramitacio")
  private BigDecimal configuracioDocsTramitacio = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("modalitatIdext")
  private BigDecimal modalitatIdext = null;

  @JsonProperty("ordre")
  private BigDecimal ordre = null;

  @JsonProperty("politicaSignatura")
  private String politicaSignatura = null;

  public ConfDocsTramPolitiquesSig configuracioDocsTramitacio(BigDecimal configuracioDocsTramitacio) {
    this.configuracioDocsTramitacio = configuracioDocsTramitacio;
    return this;
  }

   /**
   * Identificador de la configuració del document de tramitació
   * @return configuracioDocsTramitacio
  **/
  @ApiModelProperty(value = "Identificador de la configuració del document de tramitació")
  public BigDecimal getConfiguracioDocsTramitacio() {
    return configuracioDocsTramitacio;
  }

  public void setConfiguracioDocsTramitacio(BigDecimal configuracioDocsTramitacio) {
    this.configuracioDocsTramitacio = configuracioDocsTramitacio;
  }

  public ConfDocsTramPolitiquesSig id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador de la relació configuració - política - modalitat
   * @return id
  **/
  @ApiModelProperty(value = "Identificador de la relació configuració - política - modalitat")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public ConfDocsTramPolitiquesSig modalitatIdext(BigDecimal modalitatIdext) {
    this.modalitatIdext = modalitatIdext;
    return this;
  }

   /**
   * Nom de la modalitat de signatura
   * @return modalitatIdext
  **/
  @ApiModelProperty(value = "Nom de la modalitat de signatura")
  public BigDecimal getModalitatIdext() {
    return modalitatIdext;
  }

  public void setModalitatIdext(BigDecimal modalitatIdext) {
    this.modalitatIdext = modalitatIdext;
  }

  public ConfDocsTramPolitiquesSig ordre(BigDecimal ordre) {
    this.ordre = ordre;
    return this;
  }

   /**
   * Posició de la política en la seqüència de signatures
   * @return ordre
  **/
  @ApiModelProperty(value = "Posició de la política en la seqüència de signatures")
  public BigDecimal getOrdre() {
    return ordre;
  }

  public void setOrdre(BigDecimal ordre) {
    this.ordre = ordre;
  }

  public ConfDocsTramPolitiquesSig politicaSignatura(String politicaSignatura) {
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
    ConfDocsTramPolitiquesSig confDocsTramPolitiquesSig = (ConfDocsTramPolitiquesSig) o;
    return Objects.equals(this.configuracioDocsTramitacio, confDocsTramPolitiquesSig.configuracioDocsTramitacio) &&
        Objects.equals(this.id, confDocsTramPolitiquesSig.id) &&
        Objects.equals(this.modalitatIdext, confDocsTramPolitiquesSig.modalitatIdext) &&
        Objects.equals(this.ordre, confDocsTramPolitiquesSig.ordre) &&
        Objects.equals(this.politicaSignatura, confDocsTramPolitiquesSig.politicaSignatura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuracioDocsTramitacio, id, modalitatIdext, ordre, politicaSignatura);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfDocsTramPolitiquesSig {\n");
    
    sb.append("    configuracioDocsTramitacio: ").append(toIndentedString(configuracioDocsTramitacio)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modalitatIdext: ").append(toIndentedString(modalitatIdext)).append("\n");
    sb.append("    ordre: ").append(toIndentedString(ordre)).append("\n");
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

