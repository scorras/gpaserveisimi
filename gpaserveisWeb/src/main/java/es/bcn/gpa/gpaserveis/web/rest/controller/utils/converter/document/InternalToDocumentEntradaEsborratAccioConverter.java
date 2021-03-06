package es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.document;

import org.modelmapper.AbstractConverter;
import org.springframework.stereotype.Component;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsEntradaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.documentacio.DocumentEsborratAccioRDTO;

/**
 * The Class InternalToDocumentEntradaEsborratAccioConverter.
 */
@Component("internalToDocumentEntradaEsborratAccioConverter")
public class InternalToDocumentEntradaEsborratAccioConverter extends AbstractConverter<DocsEntradaRDTO, DocumentEsborratAccioRDTO> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.modelmapper.AbstractConverter#convert(java.lang.Object)
	 */
	@Override
	protected DocumentEsborratAccioRDTO convert(DocsEntradaRDTO docsEntradaRDTO) {
		DocumentEsborratAccioRDTO documentEsborratAccioRDTO = null;

		if (docsEntradaRDTO != null) {
			documentEsborratAccioRDTO = new DocumentEsborratAccioRDTO();

			documentEsborratAccioRDTO.setId(docsEntradaRDTO.getId());
			if (docsEntradaRDTO.getDocsFisics() != null) {
				documentEsborratAccioRDTO.setNom(docsEntradaRDTO.getDocsFisics().getNom());
			}
		}

		return documentEsborratAccioRDTO;
	}
}