package es.bcn.gpa.gpaserveis.web.rest.controller.helper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import es.bcn.gpa.gpaserveis.web.rest.controller.utils.enums.impl.expedient.AccioCiutadaApiParamValue;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.translator.impl.expedient.AccioCiutadaApiParamValueTranslator;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.consulta.expedients.ExpedientConsultaRDTO;

public class ServeisRestControllerAccionsDisponiblesHelper {

	public static void filtrarTramitsOvtDisponibles(ExpedientConsultaRDTO expedientConsultaRDTO,
	        List<BigDecimal> idsReqOperatiusTramOvtList) {
		List<String> accionsDisponiblesFinal = new ArrayList<>();
		AccioCiutadaApiParamValueTranslator accioCiutadaApiParamValueTranslator = new AccioCiutadaApiParamValueTranslator();
		for (String accio : expedientConsultaRDTO.getAccionsDisponibles()) {
			AccioCiutadaApiParamValue value = accioCiutadaApiParamValueTranslator.getEnumByApiParamValue(accio);
			if(AccioCiutadaApiParamValue.PRESENTAR_RECURSO.equals(value)) { //El recurso no tiene un tramite OVT asociado
				accionsDisponiblesFinal.add(value.getApiParamValue());
			} else
			if (!idsReqOperatiusTramOvtList.isEmpty() && idsReqOperatiusTramOvtList.contains(value.getInternalValueIdTramitOvt())) {
				accionsDisponiblesFinal.add(value.getApiParamValue());
			}
		}

		expedientConsultaRDTO.setAccionsDisponibles(accionsDisponiblesFinal);
	}
}
