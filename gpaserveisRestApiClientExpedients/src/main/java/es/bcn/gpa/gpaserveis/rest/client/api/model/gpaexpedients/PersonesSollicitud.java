/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.15.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.Persones;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * PersonesSollicitud
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-04T08:30:58.174+02:00")
public class PersonesSollicitud {
  @JsonProperty("editable")
  private Boolean editable = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("esInteressada")
  private Integer esInteressada = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("nomPresentacio")
  private String nomPresentacio = null;

  @JsonProperty("numeroDocument")
  private String numeroDocument = null;

  @JsonProperty("persona")
  private BigDecimal persona = null;

  @JsonProperty("persones")
  private Persones persones = null;

  @JsonProperty("relacio")
  private BigDecimal relacio = null;

  @JsonProperty("relacioPrincipal")
  private Integer relacioPrincipal = null;

  @JsonProperty("seleccionable")
  private Boolean seleccionable = null;

  @JsonProperty("sollicitud")
  private BigDecimal sollicitud = null;

  @JsonProperty("visibilitatOvt")
  private Integer visibilitatOvt = null;

  public PersonesSollicitud editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

   /**
   * Get editable
   * @return editable
  **/
  @ApiModelProperty(value = "")
  public Boolean isEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public PersonesSollicitud email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PersonesSollicitud esInteressada(Integer esInteressada) {
    this.esInteressada = esInteressada;
    return this;
  }

   /**
   * Get esInteressada
   * @return esInteressada
  **/
  @ApiModelProperty(value = "")
  public Integer getEsInteressada() {
    return esInteressada;
  }

  public void setEsInteressada(Integer esInteressada) {
    this.esInteressada = esInteressada;
  }

  public PersonesSollicitud id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public PersonesSollicitud nomPresentacio(String nomPresentacio) {
    this.nomPresentacio = nomPresentacio;
    return this;
  }

   /**
   * Get nomPresentacio
   * @return nomPresentacio
  **/
  @ApiModelProperty(value = "")
  public String getNomPresentacio() {
    return nomPresentacio;
  }

  public void setNomPresentacio(String nomPresentacio) {
    this.nomPresentacio = nomPresentacio;
  }

  public PersonesSollicitud numeroDocument(String numeroDocument) {
    this.numeroDocument = numeroDocument;
    return this;
  }

   /**
   * Get numeroDocument
   * @return numeroDocument
  **/
  @ApiModelProperty(value = "")
  public String getNumeroDocument() {
    return numeroDocument;
  }

  public void setNumeroDocument(String numeroDocument) {
    this.numeroDocument = numeroDocument;
  }

  public PersonesSollicitud persona(BigDecimal persona) {
    this.persona = persona;
    return this;
  }

   /**
   * Get persona
   * @return persona
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPersona() {
    return persona;
  }

  public void setPersona(BigDecimal persona) {
    this.persona = persona;
  }

  public PersonesSollicitud persones(Persones persones) {
    this.persones = persones;
    return this;
  }

   /**
   * Get persones
   * @return persones
  **/
  @ApiModelProperty(value = "")
  public Persones getPersones() {
    return persones;
  }

  public void setPersones(Persones persones) {
    this.persones = persones;
  }

  public PersonesSollicitud relacio(BigDecimal relacio) {
    this.relacio = relacio;
    return this;
  }

   /**
   * Get relacio
   * @return relacio
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRelacio() {
    return relacio;
  }

  public void setRelacio(BigDecimal relacio) {
    this.relacio = relacio;
  }

  public PersonesSollicitud relacioPrincipal(Integer relacioPrincipal) {
    this.relacioPrincipal = relacioPrincipal;
    return this;
  }

   /**
   * Get relacioPrincipal
   * @return relacioPrincipal
  **/
  @ApiModelProperty(value = "")
  public Integer getRelacioPrincipal() {
    return relacioPrincipal;
  }

  public void setRelacioPrincipal(Integer relacioPrincipal) {
    this.relacioPrincipal = relacioPrincipal;
  }

  public PersonesSollicitud seleccionable(Boolean seleccionable) {
    this.seleccionable = seleccionable;
    return this;
  }

   /**
   * Get seleccionable
   * @return seleccionable
  **/
  @ApiModelProperty(value = "")
  public Boolean isSeleccionable() {
    return seleccionable;
  }

  public void setSeleccionable(Boolean seleccionable) {
    this.seleccionable = seleccionable;
  }

  public PersonesSollicitud sollicitud(BigDecimal sollicitud) {
    this.sollicitud = sollicitud;
    return this;
  }

   /**
   * Get sollicitud
   * @return sollicitud
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSollicitud() {
    return sollicitud;
  }

  public void setSollicitud(BigDecimal sollicitud) {
    this.sollicitud = sollicitud;
  }

  public PersonesSollicitud visibilitatOvt(Integer visibilitatOvt) {
    this.visibilitatOvt = visibilitatOvt;
    return this;
  }

   /**
   * Get visibilitatOvt
   * @return visibilitatOvt
  **/
  @ApiModelProperty(value = "")
  public Integer getVisibilitatOvt() {
    return visibilitatOvt;
  }

  public void setVisibilitatOvt(Integer visibilitatOvt) {
    this.visibilitatOvt = visibilitatOvt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonesSollicitud personesSollicitud = (PersonesSollicitud) o;
    return Objects.equals(this.editable, personesSollicitud.editable) &&
        Objects.equals(this.email, personesSollicitud.email) &&
        Objects.equals(this.esInteressada, personesSollicitud.esInteressada) &&
        Objects.equals(this.id, personesSollicitud.id) &&
        Objects.equals(this.nomPresentacio, personesSollicitud.nomPresentacio) &&
        Objects.equals(this.numeroDocument, personesSollicitud.numeroDocument) &&
        Objects.equals(this.persona, personesSollicitud.persona) &&
        Objects.equals(this.persones, personesSollicitud.persones) &&
        Objects.equals(this.relacio, personesSollicitud.relacio) &&
        Objects.equals(this.relacioPrincipal, personesSollicitud.relacioPrincipal) &&
        Objects.equals(this.seleccionable, personesSollicitud.seleccionable) &&
        Objects.equals(this.sollicitud, personesSollicitud.sollicitud) &&
        Objects.equals(this.visibilitatOvt, personesSollicitud.visibilitatOvt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editable, email, esInteressada, id, nomPresentacio, numeroDocument, persona, persones, relacio, relacioPrincipal, seleccionable, sollicitud, visibilitatOvt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonesSollicitud {\n");
    
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    esInteressada: ").append(toIndentedString(esInteressada)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nomPresentacio: ").append(toIndentedString(nomPresentacio)).append("\n");
    sb.append("    numeroDocument: ").append(toIndentedString(numeroDocument)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    persones: ").append(toIndentedString(persones)).append("\n");
    sb.append("    relacio: ").append(toIndentedString(relacio)).append("\n");
    sb.append("    relacioPrincipal: ").append(toIndentedString(relacioPrincipal)).append("\n");
    sb.append("    seleccionable: ").append(toIndentedString(seleccionable)).append("\n");
    sb.append("    sollicitud: ").append(toIndentedString(sollicitud)).append("\n");
    sb.append("    visibilitatOvt: ").append(toIndentedString(visibilitatOvt)).append("\n");
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

