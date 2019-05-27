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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SerieDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-27T18:14:43.653+02:00")
public class SerieDTO {
  @JsonProperty("access")
  private String access = null;

  @JsonProperty("adminProcess")
  private String adminProcess = null;

  @JsonProperty("cipher")
  private String cipher = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("processUnit")
  private String processUnit = null;

  @JsonProperty("reuseConditions")
  private String reuseConditions = null;

  @JsonProperty("ruleCode")
  private String ruleCode = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("superior")
  private String superior = null;

  @JsonProperty("version")
  private String version = null;

  public SerieDTO access(String access) {
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @ApiModelProperty(value = "")
  public String getAccess() {
    return access;
  }

  public void setAccess(String access) {
    this.access = access;
  }

  public SerieDTO adminProcess(String adminProcess) {
    this.adminProcess = adminProcess;
    return this;
  }

   /**
   * Get adminProcess
   * @return adminProcess
  **/
  @ApiModelProperty(value = "")
  public String getAdminProcess() {
    return adminProcess;
  }

  public void setAdminProcess(String adminProcess) {
    this.adminProcess = adminProcess;
  }

  public SerieDTO cipher(String cipher) {
    this.cipher = cipher;
    return this;
  }

   /**
   * Get cipher
   * @return cipher
  **/
  @ApiModelProperty(value = "")
  public String getCipher() {
    return cipher;
  }

  public void setCipher(String cipher) {
    this.cipher = cipher;
  }

  public SerieDTO code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SerieDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SerieDTO endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public SerieDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SerieDTO processUnit(String processUnit) {
    this.processUnit = processUnit;
    return this;
  }

   /**
   * Get processUnit
   * @return processUnit
  **/
  @ApiModelProperty(value = "")
  public String getProcessUnit() {
    return processUnit;
  }

  public void setProcessUnit(String processUnit) {
    this.processUnit = processUnit;
  }

  public SerieDTO reuseConditions(String reuseConditions) {
    this.reuseConditions = reuseConditions;
    return this;
  }

   /**
   * Get reuseConditions
   * @return reuseConditions
  **/
  @ApiModelProperty(value = "")
  public String getReuseConditions() {
    return reuseConditions;
  }

  public void setReuseConditions(String reuseConditions) {
    this.reuseConditions = reuseConditions;
  }

  public SerieDTO ruleCode(String ruleCode) {
    this.ruleCode = ruleCode;
    return this;
  }

   /**
   * Get ruleCode
   * @return ruleCode
  **/
  @ApiModelProperty(value = "")
  public String getRuleCode() {
    return ruleCode;
  }

  public void setRuleCode(String ruleCode) {
    this.ruleCode = ruleCode;
  }

  public SerieDTO startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SerieDTO superior(String superior) {
    this.superior = superior;
    return this;
  }

   /**
   * Get superior
   * @return superior
  **/
  @ApiModelProperty(value = "")
  public String getSuperior() {
    return superior;
  }

  public void setSuperior(String superior) {
    this.superior = superior;
  }

  public SerieDTO version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SerieDTO serieDTO = (SerieDTO) o;
    return Objects.equals(this.access, serieDTO.access) &&
        Objects.equals(this.adminProcess, serieDTO.adminProcess) &&
        Objects.equals(this.cipher, serieDTO.cipher) &&
        Objects.equals(this.code, serieDTO.code) &&
        Objects.equals(this.description, serieDTO.description) &&
        Objects.equals(this.endDate, serieDTO.endDate) &&
        Objects.equals(this.name, serieDTO.name) &&
        Objects.equals(this.processUnit, serieDTO.processUnit) &&
        Objects.equals(this.reuseConditions, serieDTO.reuseConditions) &&
        Objects.equals(this.ruleCode, serieDTO.ruleCode) &&
        Objects.equals(this.startDate, serieDTO.startDate) &&
        Objects.equals(this.superior, serieDTO.superior) &&
        Objects.equals(this.version, serieDTO.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, adminProcess, cipher, code, description, endDate, name, processUnit, reuseConditions, ruleCode, startDate, superior, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SerieDTO {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    adminProcess: ").append(toIndentedString(adminProcess)).append("\n");
    sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processUnit: ").append(toIndentedString(processUnit)).append("\n");
    sb.append("    reuseConditions: ").append(toIndentedString(reuseConditions)).append("\n");
    sb.append("    ruleCode: ").append(toIndentedString(ruleCode)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    superior: ").append(toIndentedString(superior)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

