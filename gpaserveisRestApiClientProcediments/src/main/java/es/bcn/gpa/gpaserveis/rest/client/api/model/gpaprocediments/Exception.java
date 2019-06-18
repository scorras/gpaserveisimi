/*
 * API gpaprocediments
 * API gpaprocediments
 *
 * OpenAPI spec version: 1.12.0
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
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.StackTraceElement;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.Throwable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Exception
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-17T14:27:24.410+02:00")
public class Exception {
  @JsonProperty("cause")
  private Throwable cause = null;

  @JsonProperty("localizedMessage")
  private String localizedMessage = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("stackTrace")
  private List<StackTraceElement> stackTrace = null;

  @JsonProperty("suppressed")
  private List<Throwable> suppressed = null;

  public Exception cause(Throwable cause) {
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @ApiModelProperty(value = "")
  public Throwable getCause() {
    return cause;
  }

  public void setCause(Throwable cause) {
    this.cause = cause;
  }

  public Exception localizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
    return this;
  }

   /**
   * Get localizedMessage
   * @return localizedMessage
  **/
  @ApiModelProperty(value = "")
  public String getLocalizedMessage() {
    return localizedMessage;
  }

  public void setLocalizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }

  public Exception message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Exception stackTrace(List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  public Exception addStackTraceItem(StackTraceElement stackTraceItem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<StackTraceElement>();
    }
    this.stackTrace.add(stackTraceItem);
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @ApiModelProperty(value = "")
  public List<StackTraceElement> getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
  }

  public Exception suppressed(List<Throwable> suppressed) {
    this.suppressed = suppressed;
    return this;
  }

  public Exception addSuppressedItem(Throwable suppressedItem) {
    if (this.suppressed == null) {
      this.suppressed = new ArrayList<Throwable>();
    }
    this.suppressed.add(suppressedItem);
    return this;
  }

   /**
   * Get suppressed
   * @return suppressed
  **/
  @ApiModelProperty(value = "")
  public List<Throwable> getSuppressed() {
    return suppressed;
  }

  public void setSuppressed(List<Throwable> suppressed) {
    this.suppressed = suppressed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exception exception = (Exception) o;
    return Objects.equals(this.cause, exception.cause) &&
        Objects.equals(this.localizedMessage, exception.localizedMessage) &&
        Objects.equals(this.message, exception.message) &&
        Objects.equals(this.stackTrace, exception.stackTrace) &&
        Objects.equals(this.suppressed, exception.suppressed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, localizedMessage, message, stackTrace, suppressed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exception {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
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

