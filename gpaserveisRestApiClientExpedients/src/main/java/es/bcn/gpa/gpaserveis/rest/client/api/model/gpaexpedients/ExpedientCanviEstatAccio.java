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

import java.math.BigDecimal;
import java.util.Objects;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ExpedientCanviEstatAccio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-14T11:11:38.011+02:00")
public class ExpedientCanviEstatAccio {
	@JsonProperty("dataLimitAllegacio")
	private DateTime dataLimitAllegacio = null;

	@JsonProperty("dataLimitRequeriment")
	private DateTime dataLimitRequeriment = null;

	@JsonProperty("descEstat")
	private String descEstat = null;

	@JsonProperty("diesTerminiAllegacio")
	private BigDecimal diesTerminiAllegacio = null;

	@JsonProperty("diesTerminiRequeriment")
	private BigDecimal diesTerminiRequeriment = null;

	@JsonProperty("idEstat")
	private BigDecimal idEstat = null;

	@JsonProperty("idProcediment")
	private BigDecimal idProcediment = null;

	@JsonProperty("operacio")
	private String operacio = null;

	public ExpedientCanviEstatAccio dataLimitAllegacio(DateTime dataLimitAllegacio) {
		this.dataLimitAllegacio = dataLimitAllegacio;
		return this;
	}

	/**
	 * Data impositiva de fi de termini per esmenar l&#39;expedient, responent a
	 * les al·legacions
	 * 
	 * @return dataLimitAllegacio
	 **/
	@ApiModelProperty(value = "Data impositiva de fi de termini per esmenar l'expedient, responent a les al·legacions")
	public DateTime getDataLimitAllegacio() {
		return dataLimitAllegacio;
	}

	public void setDataLimitAllegacio(DateTime dataLimitAllegacio) {
		this.dataLimitAllegacio = dataLimitAllegacio;
	}

	public ExpedientCanviEstatAccio dataLimitRequeriment(DateTime dataLimitRequeriment) {
		this.dataLimitRequeriment = dataLimitRequeriment;
		return this;
	}

	/**
	 * Data impositiva de fi de termini per esmenar l&#39;expedient, responent
	 * al requeriment
	 * 
	 * @return dataLimitRequeriment
	 **/
	@ApiModelProperty(value = "Data impositiva de fi de termini per esmenar l'expedient, responent al requeriment")
	public DateTime getDataLimitRequeriment() {
		return dataLimitRequeriment;
	}

	public void setDataLimitRequeriment(DateTime dataLimitRequeriment) {
		this.dataLimitRequeriment = dataLimitRequeriment;
	}

	public ExpedientCanviEstatAccio descEstat(String descEstat) {
		this.descEstat = descEstat;
		return this;
	}

	/**
	 * Descripció de l&#39;estat actual
	 * 
	 * @return descEstat
	 **/
	@ApiModelProperty(value = "Descripció de l'estat actual")
	public String getDescEstat() {
		return descEstat;
	}

	public void setDescEstat(String descEstat) {
		this.descEstat = descEstat;
	}

	public ExpedientCanviEstatAccio diesTerminiAllegacio(BigDecimal diesTerminiAllegacio) {
		this.diesTerminiAllegacio = diesTerminiAllegacio;
		return this;
	}

	/**
	 * Dies de termini per respondre a les al·legacions
	 * 
	 * @return diesTerminiAllegacio
	 **/
	@ApiModelProperty(value = "Dies de termini per respondre a les al·legacions")
	public BigDecimal getDiesTerminiAllegacio() {
		return diesTerminiAllegacio;
	}

	public void setDiesTerminiAllegacio(BigDecimal diesTerminiAllegacio) {
		this.diesTerminiAllegacio = diesTerminiAllegacio;
	}

	public ExpedientCanviEstatAccio diesTerminiRequeriment(BigDecimal diesTerminiRequeriment) {
		this.diesTerminiRequeriment = diesTerminiRequeriment;
		return this;
	}

	/**
	 * Dies de termini per respondre al requeriment
	 * 
	 * @return diesTerminiRequeriment
	 **/
	@ApiModelProperty(value = "Dies de termini per respondre al requeriment")
	public BigDecimal getDiesTerminiRequeriment() {
		return diesTerminiRequeriment;
	}

	public void setDiesTerminiRequeriment(BigDecimal diesTerminiRequeriment) {
		this.diesTerminiRequeriment = diesTerminiRequeriment;
	}

	public ExpedientCanviEstatAccio idEstat(BigDecimal idEstat) {
		this.idEstat = idEstat;
		return this;
	}

	/**
	 * Identificador de l&#39;estat actual
	 * 
	 * @return idEstat
	 **/
	@ApiModelProperty(value = "Identificador de l'estat actual")
	public BigDecimal getIdEstat() {
		return idEstat;
	}

	public void setIdEstat(BigDecimal idEstat) {
		this.idEstat = idEstat;
	}

	public ExpedientCanviEstatAccio idProcediment(BigDecimal idProcediment) {
		this.idProcediment = idProcediment;
		return this;
	}

	/**
	 * Identificador del procediment
	 * 
	 * @return idProcediment
	 **/
	@ApiModelProperty(value = "Identificador del procediment")
	public BigDecimal getIdProcediment() {
		return idProcediment;
	}

	public void setIdProcediment(BigDecimal idProcediment) {
		this.idProcediment = idProcediment;
	}

	public ExpedientCanviEstatAccio operacio(String operacio) {
		this.operacio = operacio;
		return this;
	}

	/**
	 * Operació concreta en l&#39;execució de l&#39;acció
	 * 
	 * @return operacio
	 **/
	@ApiModelProperty(value = "Operació concreta en l'execució de l'acció")
	public String getOperacio() {
		return operacio;
	}

	public void setOperacio(String operacio) {
		this.operacio = operacio;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExpedientCanviEstatAccio expedientCanviEstatAccio = (ExpedientCanviEstatAccio) o;
		return Objects.equals(this.dataLimitAllegacio, expedientCanviEstatAccio.dataLimitAllegacio)
				&& Objects.equals(this.dataLimitRequeriment, expedientCanviEstatAccio.dataLimitRequeriment)
				&& Objects.equals(this.descEstat, expedientCanviEstatAccio.descEstat)
				&& Objects.equals(this.diesTerminiAllegacio, expedientCanviEstatAccio.diesTerminiAllegacio)
				&& Objects.equals(this.diesTerminiRequeriment, expedientCanviEstatAccio.diesTerminiRequeriment)
				&& Objects.equals(this.idEstat, expedientCanviEstatAccio.idEstat)
				&& Objects.equals(this.idProcediment, expedientCanviEstatAccio.idProcediment)
				&& Objects.equals(this.operacio, expedientCanviEstatAccio.operacio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataLimitAllegacio, dataLimitRequeriment, descEstat, diesTerminiAllegacio, diesTerminiRequeriment, idEstat,
				idProcediment, operacio);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExpedientCanviEstatAccio {\n");

		sb.append("    dataLimitAllegacio: ").append(toIndentedString(dataLimitAllegacio)).append("\n");
		sb.append("    dataLimitRequeriment: ").append(toIndentedString(dataLimitRequeriment)).append("\n");
		sb.append("    descEstat: ").append(toIndentedString(descEstat)).append("\n");
		sb.append("    diesTerminiAllegacio: ").append(toIndentedString(diesTerminiAllegacio)).append("\n");
		sb.append("    diesTerminiRequeriment: ").append(toIndentedString(diesTerminiRequeriment)).append("\n");
		sb.append("    idEstat: ").append(toIndentedString(idEstat)).append("\n");
		sb.append("    idProcediment: ").append(toIndentedString(idProcediment)).append("\n");
		sb.append("    operacio: ").append(toIndentedString(operacio)).append("\n");
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
