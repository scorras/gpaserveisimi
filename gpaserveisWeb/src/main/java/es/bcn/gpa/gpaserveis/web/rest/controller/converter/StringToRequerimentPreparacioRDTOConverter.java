package es.bcn.gpa.gpaserveis.web.rest.controller.converter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import es.bcn.gpa.gpaserveis.business.exception.GPAServeisRuntimeException;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.preparar.requeriment.RequerimentPreparacioRDTO;

@Component
public class StringToRequerimentPreparacioRDTOConverter implements Converter<String, RequerimentPreparacioRDTO> {

	@Override
	public RequerimentPreparacioRDTO convert(String from) {
		RequerimentPreparacioRDTO requerimentPreparacioRDTO = null;
		try {
			requerimentPreparacioRDTO = new ObjectMapper().readValue(from.getBytes(StandardCharsets.UTF_8),
					RequerimentPreparacioRDTO.class);
		} catch (IOException e) {
			throw new GPAServeisRuntimeException(e);
		}
		return requerimentPreparacioRDTO;
	}
}
