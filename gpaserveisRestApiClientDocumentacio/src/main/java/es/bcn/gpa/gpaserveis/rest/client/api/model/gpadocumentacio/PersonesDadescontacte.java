/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.25.0
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
 * PersonesDadescontacte
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-12T12:30:07.914+02:00")
public class PersonesDadescontacte {
  @JsonProperty("bloc")
  private String bloc = null;

  @JsonProperty("codiPostal")
  private String codiPostal = null;

  @JsonProperty("direccioPostal")
  private String direccioPostal = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("escala")
  private String escala = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("mobil")
  private String mobil = null;

  @JsonProperty("municipi")
  private String municipi = null;

  @JsonProperty("municipiEstranger")
  private String municipiEstranger = null;

  @JsonProperty("municipiValor")
  private String municipiValor = null;

  @JsonProperty("notificacioPaper")
  private Integer notificacioPaper = null;

  @JsonProperty("numero")
  private String numero = null;

  @JsonProperty("pais")
  private String pais = null;

  @JsonProperty("paisValor")
  private String paisValor = null;

  @JsonProperty("pis")
  private String pis = null;

  @JsonProperty("porta")
  private String porta = null;

  @JsonProperty("provincia")
  private String provincia = null;

  @JsonProperty("provinciaEstranger")
  private String provinciaEstranger = null;

  @JsonProperty("provinciaValor")
  private String provinciaValor = null;

  @JsonProperty("telefon")
  private String telefon = null;

  @JsonProperty("tipusVia")
  private String tipusVia = null;

  @JsonProperty("tipusViesValor")
  private String tipusViesValor = null;

  public PersonesDadescontacte bloc(String bloc) {
    this.bloc = bloc;
    return this;
  }

   /**
   * Get bloc
   * @return bloc
  **/
  @ApiModelProperty(value = "")
  public String getBloc() {
    return bloc;
  }

  public void setBloc(String bloc) {
    this.bloc = bloc;
  }

  public PersonesDadescontacte codiPostal(String codiPostal) {
    this.codiPostal = codiPostal;
    return this;
  }

   /**
   * Get codiPostal
   * @return codiPostal
  **/
  @ApiModelProperty(value = "")
  public String getCodiPostal() {
    return codiPostal;
  }

  public void setCodiPostal(String codiPostal) {
    this.codiPostal = codiPostal;
  }

  public PersonesDadescontacte direccioPostal(String direccioPostal) {
    this.direccioPostal = direccioPostal;
    return this;
  }

   /**
   * Get direccioPostal
   * @return direccioPostal
  **/
  @ApiModelProperty(value = "")
  public String getDireccioPostal() {
    return direccioPostal;
  }

  public void setDireccioPostal(String direccioPostal) {
    this.direccioPostal = direccioPostal;
  }

  public PersonesDadescontacte email(String email) {
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

  public PersonesDadescontacte escala(String escala) {
    this.escala = escala;
    return this;
  }

   /**
   * Get escala
   * @return escala
  **/
  @ApiModelProperty(value = "")
  public String getEscala() {
    return escala;
  }

  public void setEscala(String escala) {
    this.escala = escala;
  }

  public PersonesDadescontacte fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(value = "")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public PersonesDadescontacte id(BigDecimal id) {
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

  public PersonesDadescontacte mobil(String mobil) {
    this.mobil = mobil;
    return this;
  }

   /**
   * Get mobil
   * @return mobil
  **/
  @ApiModelProperty(value = "")
  public String getMobil() {
    return mobil;
  }

  public void setMobil(String mobil) {
    this.mobil = mobil;
  }

  public PersonesDadescontacte municipi(String municipi) {
    this.municipi = municipi;
    return this;
  }

   /**
   * Get municipi
   * @return municipi
  **/
  @ApiModelProperty(value = "")
  public String getMunicipi() {
    return municipi;
  }

  public void setMunicipi(String municipi) {
    this.municipi = municipi;
  }

  public PersonesDadescontacte municipiEstranger(String municipiEstranger) {
    this.municipiEstranger = municipiEstranger;
    return this;
  }

   /**
   * Get municipiEstranger
   * @return municipiEstranger
  **/
  @ApiModelProperty(value = "")
  public String getMunicipiEstranger() {
    return municipiEstranger;
  }

  public void setMunicipiEstranger(String municipiEstranger) {
    this.municipiEstranger = municipiEstranger;
  }

  public PersonesDadescontacte municipiValor(String municipiValor) {
    this.municipiValor = municipiValor;
    return this;
  }

   /**
   * Get municipiValor
   * @return municipiValor
  **/
  @ApiModelProperty(value = "")
  public String getMunicipiValor() {
    return municipiValor;
  }

  public void setMunicipiValor(String municipiValor) {
    this.municipiValor = municipiValor;
  }

  public PersonesDadescontacte notificacioPaper(Integer notificacioPaper) {
    this.notificacioPaper = notificacioPaper;
    return this;
  }

   /**
   * Get notificacioPaper
   * @return notificacioPaper
  **/
  @ApiModelProperty(value = "")
  public Integer getNotificacioPaper() {
    return notificacioPaper;
  }

  public void setNotificacioPaper(Integer notificacioPaper) {
    this.notificacioPaper = notificacioPaper;
  }

  public PersonesDadescontacte numero(String numero) {
    this.numero = numero;
    return this;
  }

   /**
   * Get numero
   * @return numero
  **/
  @ApiModelProperty(value = "")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public PersonesDadescontacte pais(String pais) {
    this.pais = pais;
    return this;
  }

   /**
   * Get pais
   * @return pais
  **/
  @ApiModelProperty(value = "")
  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public PersonesDadescontacte paisValor(String paisValor) {
    this.paisValor = paisValor;
    return this;
  }

   /**
   * Get paisValor
   * @return paisValor
  **/
  @ApiModelProperty(value = "")
  public String getPaisValor() {
    return paisValor;
  }

  public void setPaisValor(String paisValor) {
    this.paisValor = paisValor;
  }

  public PersonesDadescontacte pis(String pis) {
    this.pis = pis;
    return this;
  }

   /**
   * Get pis
   * @return pis
  **/
  @ApiModelProperty(value = "")
  public String getPis() {
    return pis;
  }

  public void setPis(String pis) {
    this.pis = pis;
  }

  public PersonesDadescontacte porta(String porta) {
    this.porta = porta;
    return this;
  }

   /**
   * Get porta
   * @return porta
  **/
  @ApiModelProperty(value = "")
  public String getPorta() {
    return porta;
  }

  public void setPorta(String porta) {
    this.porta = porta;
  }

  public PersonesDadescontacte provincia(String provincia) {
    this.provincia = provincia;
    return this;
  }

   /**
   * Get provincia
   * @return provincia
  **/
  @ApiModelProperty(value = "")
  public String getProvincia() {
    return provincia;
  }

  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  public PersonesDadescontacte provinciaEstranger(String provinciaEstranger) {
    this.provinciaEstranger = provinciaEstranger;
    return this;
  }

   /**
   * Get provinciaEstranger
   * @return provinciaEstranger
  **/
  @ApiModelProperty(value = "")
  public String getProvinciaEstranger() {
    return provinciaEstranger;
  }

  public void setProvinciaEstranger(String provinciaEstranger) {
    this.provinciaEstranger = provinciaEstranger;
  }

  public PersonesDadescontacte provinciaValor(String provinciaValor) {
    this.provinciaValor = provinciaValor;
    return this;
  }

   /**
   * Get provinciaValor
   * @return provinciaValor
  **/
  @ApiModelProperty(value = "")
  public String getProvinciaValor() {
    return provinciaValor;
  }

  public void setProvinciaValor(String provinciaValor) {
    this.provinciaValor = provinciaValor;
  }

  public PersonesDadescontacte telefon(String telefon) {
    this.telefon = telefon;
    return this;
  }

   /**
   * Get telefon
   * @return telefon
  **/
  @ApiModelProperty(value = "")
  public String getTelefon() {
    return telefon;
  }

  public void setTelefon(String telefon) {
    this.telefon = telefon;
  }

  public PersonesDadescontacte tipusVia(String tipusVia) {
    this.tipusVia = tipusVia;
    return this;
  }

   /**
   * Get tipusVia
   * @return tipusVia
  **/
  @ApiModelProperty(value = "")
  public String getTipusVia() {
    return tipusVia;
  }

  public void setTipusVia(String tipusVia) {
    this.tipusVia = tipusVia;
  }

  public PersonesDadescontacte tipusViesValor(String tipusViesValor) {
    this.tipusViesValor = tipusViesValor;
    return this;
  }

   /**
   * Get tipusViesValor
   * @return tipusViesValor
  **/
  @ApiModelProperty(value = "")
  public String getTipusViesValor() {
    return tipusViesValor;
  }

  public void setTipusViesValor(String tipusViesValor) {
    this.tipusViesValor = tipusViesValor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonesDadescontacte personesDadescontacte = (PersonesDadescontacte) o;
    return Objects.equals(this.bloc, personesDadescontacte.bloc) &&
        Objects.equals(this.codiPostal, personesDadescontacte.codiPostal) &&
        Objects.equals(this.direccioPostal, personesDadescontacte.direccioPostal) &&
        Objects.equals(this.email, personesDadescontacte.email) &&
        Objects.equals(this.escala, personesDadescontacte.escala) &&
        Objects.equals(this.fax, personesDadescontacte.fax) &&
        Objects.equals(this.id, personesDadescontacte.id) &&
        Objects.equals(this.mobil, personesDadescontacte.mobil) &&
        Objects.equals(this.municipi, personesDadescontacte.municipi) &&
        Objects.equals(this.municipiEstranger, personesDadescontacte.municipiEstranger) &&
        Objects.equals(this.municipiValor, personesDadescontacte.municipiValor) &&
        Objects.equals(this.notificacioPaper, personesDadescontacte.notificacioPaper) &&
        Objects.equals(this.numero, personesDadescontacte.numero) &&
        Objects.equals(this.pais, personesDadescontacte.pais) &&
        Objects.equals(this.paisValor, personesDadescontacte.paisValor) &&
        Objects.equals(this.pis, personesDadescontacte.pis) &&
        Objects.equals(this.porta, personesDadescontacte.porta) &&
        Objects.equals(this.provincia, personesDadescontacte.provincia) &&
        Objects.equals(this.provinciaEstranger, personesDadescontacte.provinciaEstranger) &&
        Objects.equals(this.provinciaValor, personesDadescontacte.provinciaValor) &&
        Objects.equals(this.telefon, personesDadescontacte.telefon) &&
        Objects.equals(this.tipusVia, personesDadescontacte.tipusVia) &&
        Objects.equals(this.tipusViesValor, personesDadescontacte.tipusViesValor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bloc, codiPostal, direccioPostal, email, escala, fax, id, mobil, municipi, municipiEstranger, municipiValor, notificacioPaper, numero, pais, paisValor, pis, porta, provincia, provinciaEstranger, provinciaValor, telefon, tipusVia, tipusViesValor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonesDadescontacte {\n");
    
    sb.append("    bloc: ").append(toIndentedString(bloc)).append("\n");
    sb.append("    codiPostal: ").append(toIndentedString(codiPostal)).append("\n");
    sb.append("    direccioPostal: ").append(toIndentedString(direccioPostal)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    escala: ").append(toIndentedString(escala)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mobil: ").append(toIndentedString(mobil)).append("\n");
    sb.append("    municipi: ").append(toIndentedString(municipi)).append("\n");
    sb.append("    municipiEstranger: ").append(toIndentedString(municipiEstranger)).append("\n");
    sb.append("    municipiValor: ").append(toIndentedString(municipiValor)).append("\n");
    sb.append("    notificacioPaper: ").append(toIndentedString(notificacioPaper)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    paisValor: ").append(toIndentedString(paisValor)).append("\n");
    sb.append("    pis: ").append(toIndentedString(pis)).append("\n");
    sb.append("    porta: ").append(toIndentedString(porta)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    provinciaEstranger: ").append(toIndentedString(provinciaEstranger)).append("\n");
    sb.append("    provinciaValor: ").append(toIndentedString(provinciaValor)).append("\n");
    sb.append("    telefon: ").append(toIndentedString(telefon)).append("\n");
    sb.append("    tipusVia: ").append(toIndentedString(tipusVia)).append("\n");
    sb.append("    tipusViesValor: ").append(toIndentedString(tipusViesValor)).append("\n");
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

