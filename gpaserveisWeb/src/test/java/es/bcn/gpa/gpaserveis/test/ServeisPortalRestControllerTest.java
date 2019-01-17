package es.bcn.gpa.gpaserveis.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import es.bcn.gpa.gpaserveis.test.parent.RestServerParentTest;

/**
 * The Class ExpedientsRestControllerTest.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ServeisPortalRestControllerTest extends RestServerParentTest {

	/** The Constant APPLICATION_JSON_UTF8. */
	private static final String APPLICATION_JSON_UTF8 = "application/json;charset=UTF-8";

	private final static String BASE_URL = "/rest/serveis/portal";

	@Test
	@Ignore
	public void testStage01_GetCercaProcediments() throws Exception {
		String url = BASE_URL + "/procediments";
		getMockMvc().perform(get(url)).andDo(print()).andExpect(status().isOk());
	}

	@Test
	@Ignore
	public void testStage02_GetConsultarDadesProcediment() throws Exception {
		String url = BASE_URL + "/procediments/1";
		getMockMvc().perform(get(url)).andDo(print()).andExpect(status().isOk());
	}

	@Test
	@Ignore
	public void testStage03_GetConsultarDadesOperacioProcediment() throws Exception {
		String url = BASE_URL + "/procediments/1/tramits/1/atributs";
		getMockMvc().perform(get(url)).andDo(print()).andExpect(status().isOk());
	}

	@Test
	@Ignore
	public void testStage04_GetConsultarDocumentacioProcediment() throws Exception {
		String url = BASE_URL + "/procediments/1/tramits/1/documentacio";
		getMockMvc().perform(get(url)).andDo(print()).andExpect(status().isOk());
	}

	@Test
	@Ignore
	public void testStage05_GetCercaExpedients() throws Exception {
		String url = BASE_URL + "/expedients";
		getMockMvc().perform(get(url)).andDo(print()).andExpect(status().isOk());
	}

	@Test
	@Ignore
	public void testStage06_GetConsultarDadesExpedient() throws Exception {
		String url = BASE_URL + "/expedients/1";
		getMockMvc().perform(get(url)).andDo(print()).andExpect(status().isOk());
	}

	@Test
	@Ignore
	public void testStage07_PostCrearSolicitud() throws Exception {
		String url = BASE_URL + "/expedients";
		getMockMvc()
		        .perform(post(url).contentType(APPLICATION_JSON_UTF8).content(
		                "{ \"codiProcediment\": \"string\", \"codiUnitatGestora\": \"string\", \"inici\": \"OFICI\", \"representant\": { \"cognom1\": \"string\", \"cognom2\": \"string\", \"dadesContacte\": { \"bloc\": \"string\", \"codiPostal\": \"string\", \"comarca\": \"string\", \"email\": \"string\", \"escala\": \"string\", \"fax\": \"string\", \"mobil\": \"string\", \"municipi\": \"string\", \"municipiEstranger\": \"string\", \"nomVia\": \"string\", \"numero\": \"string\", \"pais\": \"string\", \"pis\": \"string\", \"porta\": \"string\", \"provincia\": \"string\", \"provinciaEstranger\": \"string\", \"telefon\": \"string\", \"tipusVia\": \"string\" }, \"documentIndentitat\": { \"numeroDocument\": \"string\", \"pais\": \"string\", \"tipusDocument\": \"NIF\" }, \"id\": 0, \"nomRaoSocial\": \"string\", \"tipusPersona\": \"FISICA\" }, \"solicitant\": { \"cognom1\": \"string\", \"cognom2\": \"string\", \"dadesContacte\": { \"bloc\": \"string\", \"codiPostal\": \"string\", \"comarca\": \"string\", \"email\": \"string\", \"escala\": \"string\", \"fax\": \"string\", \"mobil\": \"string\", \"municipi\": \"string\", \"municipiEstranger\": \"string\", \"nomVia\": \"string\", \"numero\": \"string\", \"pais\": \"string\", \"pis\": \"string\", \"porta\": \"string\", \"provincia\": \"string\", \"provinciaEstranger\": \"string\", \"telefon\": \"string\", \"tipusVia\": \"string\" }, \"documentIndentitat\": { \"numeroDocument\": \"string\", \"pais\": \"string\", \"tipusDocument\": \"NIF\" }, \"id\": 0, \"nomRaoSocial\": \"string\", \"tipusPersona\": \"FISICA\" }, \"versioProcediment\": \"string\"}"))
		        .andExpect(status().isOk()).andDo(print());

	}

	@Test
	@Ignore
	public void testStage08_PutActualitzarSolicitud() throws Exception {
		String url = BASE_URL + "/expedients/1";
		getMockMvc()
		        .perform(put(url).contentType(APPLICATION_JSON_UTF8).content(
		                "{ \"atributs\": [ null ], \"codi\": \"string\", \"codiProcediment\": \"string\", \"codiUnitatGestora\": \"string\", \"documents\": [ { \"codi\": \"string\", \"id\": \"string\", \"nom\": \"string\" } ], \"id\": 0, \"inici\": \"OFICI\", \"representant\": { \"cognom1\": \"string\", \"cognom2\": \"string\", \"dadesContacte\": { \"bloc\": \"string\", \"codiPostal\": \"string\", \"comarca\": \"string\", \"email\": \"string\", \"escala\": \"string\", \"fax\": \"string\", \"mobil\": \"string\", \"municipi\": \"string\", \"municipiEstranger\": \"string\", \"nomVia\": \"string\", \"numero\": \"string\", \"pais\": \"string\", \"pis\": \"string\", \"porta\": \"string\", \"provincia\": \"string\", \"provinciaEstranger\": \"string\", \"telefon\": \"string\", \"tipusVia\": \"string\" }, \"documentIndentitat\": { \"numeroDocument\": \"string\", \"pais\": \"string\", \"tipusDocument\": \"NIF\" }, \"id\": 0, \"nomRaoSocial\": \"string\", \"tipusPersona\": \"FISICA\" }, \"solicitant\": { \"cognom1\": \"string\", \"cognom2\": \"string\", \"dadesContacte\": { \"bloc\": \"string\", \"codiPostal\": \"string\", \"comarca\": \"string\", \"email\": \"string\", \"escala\": \"string\", \"fax\": \"string\", \"mobil\": \"string\", \"municipi\": \"string\", \"municipiEstranger\": \"string\", \"nomVia\": \"string\", \"numero\": \"string\", \"pais\": \"string\", \"pis\": \"string\", \"porta\": \"string\", \"provincia\": \"string\", \"provinciaEstranger\": \"string\", \"telefon\": \"string\", \"tipusVia\": \"string\" }, \"documentIndentitat\": { \"numeroDocument\": \"string\", \"pais\": \"string\", \"tipusDocument\": \"NIF\" }, \"id\": 0, \"nomRaoSocial\": \"string\", \"tipusPersona\": \"FISICA\" }, \"valor\": \"string\", \"versioProcediment\": \"string\"}"))
		        .andExpect(status().isOk()).andDo(print());

	}

	@Test
	@Ignore
	public void testStage09_PostRegistrarSolicitud() throws Exception {
		String url = BASE_URL + "/expedients/1/registre";
		getMockMvc().perform(post(url).contentType(APPLICATION_JSON_UTF8)).andExpect(status().isOk()).andDo(print());

	}

	@Test
	@Ignore
	public void testStage10_PostObrirSolicitud() throws Exception {
		String url = BASE_URL + "/expedients/1/obrir";
		getMockMvc().perform(post(url).contentType(APPLICATION_JSON_UTF8)).andExpect(status().isOk()).andDo(print());

	}

}