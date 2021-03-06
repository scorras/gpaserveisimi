package es.bcn.gpa.gpaserveis.web.rest.controller.utils;

import java.math.BigDecimal;

import org.apache.commons.lang.math.NumberUtils;

/**
 * The Class Constants.
 */
public class Constants {

	/** The Constant DATE_PATTERN. */
	public static final String DATE_PATTERN = "dd/MM/yyyy";

	/** The Constant DATE_TIME_PATTERN. */
	public static final String DATE_TIME_PATTERN = "dd/MM/yyyy HH:mm:ss";

	/** The Constant DATE_TIME_PATTERN_PORTASIGNATURES. */
	public static final String DATE_TIME_PATTERN_PORTASIGNATURES = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

	/** The Constant DATE_TIME_PATTERN_NOTIFICACIONS. */
	public static final String DATE_TIME_PATTERN_NOTIFICACIONS = "dd-MM-yyyy HH:mm:ss";

	/** The Constant DATE_TIME_PATTERN. */
	public static final String TIME_PATTERN = "HH:mm:ss";

	/** The Constant PERSONES_SOLLICITUD_RELACIO_NO_PRINCIPAL. */
	public static final Integer PERSONES_SOLLICITUD_RELACIO_NO_PRINCIPAL = NumberUtils.INTEGER_ZERO;

	/** The Constant PERSONES_SOLLICITUD_RELACIO_PRINCIPAL. */
	public static final Integer PERSONES_SOLLICITUD_RELACIO_PRINCIPAL = NumberUtils.INTEGER_ONE;

	/** The Constant PERSONES_SOLLICITUD_RELACIO_SOLLICITANT. */
	public static final BigDecimal PERSONES_SOLLICITUD_RELACIO_SOLLICITANT = BigDecimal.ONE;

	/** The Constant PERSONES_SOLLICITUD_RELACIO_REPRESENTANT. */
	public static final BigDecimal PERSONES_SOLLICITUD_RELACIO_REPRESENTANT = new BigDecimal(2);

	/** The Constant CODI_ISO_PAIS_PER_DEFECTE. */
	public static final String CODI_ISO_PAIS_PER_DEFECTE = "ES";

	/** The Constant MISSATGE_ERROR_ARIADNA. */
	public static final String MISSATGE_ERROR_ARIADNA = "ariadna";

	/** The Constant MISSATGE_ERROR_CATALEG. */
	public static final String MISSATGE_ERROR_CATALEG = "Cataleg:";

	/** The Constant MISSATGE_ERROR_CTRLUSER. */
	public static final String MISSATGE_ERROR_CTRLUSER = "CtrlUser:";

	/** The Constant MISSATGE_ERROR_DIGITALITZACIO. */
	public static final String MISSATGE_ERROR_DIGITALITZACIO = "Digitalitzaci√≥:";

	/** The Constant MISSATGE_ERROR_GEOREST. */
	public static final String MISSATGE_ERROR_GEOREST = "Georest:";

	/** The Constant MISSATGE_ERROR_NOTIFICADOR. */
	public static final String MISSATGE_ERROR_NOTIFICADOR = "Notificador:";

	/** The Constant MISSATGE_ERROR_OPENTEXT. */
	public static final String MISSATGE_ERROR_OPENTEXT = "OpenText:";

	/** The Constant MISSATGE_ERROR_DOCUMENTUM. */
	public static final String MISSATGE_ERROR_DOCUMENTUM = "Documentum:";

	/** The Constant MISSATGE_ERROR_PDFGESTOR. */
	public static final String MISSATGE_ERROR_PDFGESTOR = "PdfGestor:";

	/** The Constant MISSATGE_ERROR_PORTASIG. */
	public static final String MISSATGE_ERROR_PORTASIG = "PortaSig:";

	/** The Constant MISSATGE_ERROR_SIGNATURES. */
	public static final String MISSATGE_ERROR_SIGNATURES = "Signatures:";

	/** The Constant MISSATGE_ERROR_SERVEI_INTEROPERABILITAT. */
	public static final String MISSATGE_ERROR_SERVEI_INTEROPERABILITAT = "Error Servei Interoperabilitat:";

	/** The Constant ESTAT_EXPEDIENT_EN_PREPARACIO. */
	public static final BigDecimal ESTAT_EXPEDIENT_EN_PREPARACIO = BigDecimal.ONE;

	/** The Constant ESTAT_EXPEDIENT_SOLLICITUD_EN_REVISIO. */
	public static final BigDecimal ESTAT_EXPEDIENT_SOLLICITUD_EN_REVISIO = new BigDecimal(2);

	/** The Constant DESCRIPCIO_ESTAT_ESBORRANY. */
	public static final String DESCRIPCIO_ESTAT_ESBORRANY = "ESBORRANY";

	/** The Constant DESCRIPCIO_ESTAT_REGISTRAT. */
	public static final String DESCRIPCIO_ESTAT_REGISTRAT = "REGISTRAT";

	/** The Constant DESCRIPCIO_ACCIO_ARXIVAR. */
	public static final String DESCRIPCIO_ACCIO_ARXIVAR = "Arxivar per incomplerta o inadequada";

	/** The Constant ERROR_STR. */
	public static final String ERROR_STR = "ERROR";

	/** The Constant NIVELL_VISIBILITAT_BAIXA. */
	public static final BigDecimal NIVELL_VISIBILITAT_BAIXA = new BigDecimal(2);

	/** The Constant NIVELL_VISIBILITAT_NULLA. */
	public static final BigDecimal NIVELL_VISIBILITAT_NULLA = new BigDecimal(3);

	/** The Constant NIVELL_CRITICITAT_BAIX. */
	public static final Integer NIVELL_CRITICITAT_BAIX = NumberUtils.INTEGER_ZERO;

	/** The Constant NIVELL_CRITICITAT_ALT. */
	public static final Integer NIVELL_CRITICITAT_ALT = NumberUtils.INTEGER_ONE;

	/** The Constant INICIACIO_SOLLICITUD_INTERESSAT. */
	public static final BigDecimal INICIACIO_SOLLICITUD_INTERESSAT = new BigDecimal(2);

	/** The Constant CODI_DADA_OPERACIO_DADES_EXTERNES. */
	public static final String CODI_DADA_OPERACIO_DADES_EXTERNES = "DADES_EXTERNES";

	/** The Constant TANCAMENT_AUTOMATIC. */
	public static final BigDecimal TANCAMENT_AUTOMATIC = new BigDecimal(1);
	
	/** The Constant REVISIO_DOCUMENT_CORRECT. */
	public static final int REVISIO_DOCUMENT_CORRECT = 1;
	
	/** The Constant REVISIO_DOCUMENT_INCORRECT. */
	public static final int REVISIO_DOCUMENT_INCORRECT = 2;
	
	/** The Constant REVISIO_DOCUMENT_EN_REVISIO. */
	public static final int REVISIO_DOCUMENT_EN_REVISIO = 3;

	/** The Constant DADES_GRUPS_OPERACIONS_REPETICIONS_N. */
	public static final String DADES_GRUPS_OPERACIONS_REPETICIONS_N = "N";

	/** The Constant DADES_OPERACIONS_REPETIBLE. */
	public static final BigDecimal DADES_OPERACIONS_REPETIBLE = new BigDecimal("2");

	/** The Constant CODI_GRUP_. */
	public static final String CODI_GRUP_ = "GRUP_";

	/** The Constant REPRESENTANT_PERSONE. */
	public static final String REPRESENTANT_PERSONE = "REPRESENTANT";

	/** The Constant SOLLICITANT_PERSONE. */
	public static final String SOLLICITANT_PERSONE = "SOLLICITANT";
	
	/** The Constant VISIBILITAT NO APLICADA. */
	public static final BigDecimal VISIBILITAT_NO_APLICADA = new BigDecimal(-1);

}
