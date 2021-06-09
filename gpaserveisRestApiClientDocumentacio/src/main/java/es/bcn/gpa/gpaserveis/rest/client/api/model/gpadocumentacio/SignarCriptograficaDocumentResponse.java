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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SignarCriptograficaDocumentResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-09T15:33:27.819+02:00")
public class SignarCriptograficaDocumentResponse {
  @JsonProperty("missatgeError")
  private String missatgeError = null;

  public SignarCriptograficaDocumentResponse missatgeError(String missatgeError) {
    this.missatgeError = missatgeError;
    return this;
  }

   /**
   * Descripció de l&#39;error
   * @return missatgeError
  **/
  @ApiModelProperty(value = "Descripció de l'error")
  public String getMissatgeError() {
    return missatgeError;
  }

  public void setMissatgeError(String missatgeError) {
    this.missatgeError = missatgeError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignarCriptograficaDocumentResponse signarCriptograficaDocumentResponse = (SignarCriptograficaDocumentResponse) o;
    return Objects.equals(this.missatgeError, signarCriptograficaDocumentResponse.missatgeError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(missatgeError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignarCriptograficaDocumentResponse {\n");
    
    sb.append("    missatgeError: ").append(toIndentedString(missatgeError)).append("\n");
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

