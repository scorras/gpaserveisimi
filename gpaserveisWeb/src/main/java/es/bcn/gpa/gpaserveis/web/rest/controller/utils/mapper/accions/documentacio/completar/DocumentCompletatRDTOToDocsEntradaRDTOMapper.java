package es.bcn.gpa.gpaserveis.web.rest.controller.utils.mapper.accions.documentacio.completar;

import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DocsEntradaRDTO;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.common.BooleanToInternalConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.common.DataHoraToInternalConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.common.InternalToBigDecimalConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.document.FitxerToInternalConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.document.IdiomaToInternalConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.document.OrigenToInternalConverter;
import es.bcn.gpa.gpaserveis.web.rest.controller.utils.converter.document.RevisioToInternalConverter;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.tramitadors.accions.documentacio.completar.DocumentCompletatRDTO;

/**
 * The Class DocumentCompletatRDTOToDocsEntradaRDTOMapper.
 */
@Component("documentCompletatRDTOToDocsEntradaRDTOMapper")
public class DocumentCompletatRDTOToDocsEntradaRDTOMapper extends PropertyMap<DocumentCompletatRDTO, DocsEntradaRDTO> {

	private InternalToBigDecimalConverter internalToBigDecimalConverter;

	private OrigenToInternalConverter origenToInternalConverter;

	private IdiomaToInternalConverter idiomaToInternalConverter;

	private BooleanToInternalConverter booleanToInternalConverter;

	private RevisioToInternalConverter revisioToInternalConverter;

	private DataHoraToInternalConverter dataHoraToInternalConverter;

	private FitxerToInternalConverter fitxerToInternalConverter;

	@Autowired
	public DocumentCompletatRDTOToDocsEntradaRDTOMapper(
			@Qualifier("internalToBigDecimalConverter") InternalToBigDecimalConverter internalToBigDecimalConverter,
			@Qualifier("origenToInternalConverter") OrigenToInternalConverter origenToInternalConverter,
			@Qualifier("idiomaToInternalConverter") IdiomaToInternalConverter idiomaToInternalConverter,
			@Qualifier("booleanToInternalConverter") BooleanToInternalConverter booleanToInternalConverter,
			@Qualifier("revisioToInternalConverter") RevisioToInternalConverter revisioToInternalConverter,
			@Qualifier("dataHoraToInternalConverter") DataHoraToInternalConverter dataHoraToInternalConverter,
			@Qualifier("documentFitxerToInternalConverter") FitxerToInternalConverter fitxerToInternalConverter) {
		this.internalToBigDecimalConverter = internalToBigDecimalConverter;
		this.origenToInternalConverter = origenToInternalConverter;
		this.idiomaToInternalConverter = idiomaToInternalConverter;
		this.booleanToInternalConverter = booleanToInternalConverter;
		this.revisioToInternalConverter = revisioToInternalConverter;
		this.dataHoraToInternalConverter = dataHoraToInternalConverter;
		this.fitxerToInternalConverter = fitxerToInternalConverter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.modelmapper.PropertyMap#configure()
	 */
	@Override
	protected void configure() {
		using(internalToBigDecimalConverter).map(source.getConfiguracioDocumentacio()).setConfigDocEntrada(null);
		using(origenToInternalConverter).map(source.getOrigen()).setOrigen(null);
		map().setComentari(source.getComentari());
		using(idiomaToInternalConverter).map(source.getIdioma()).setIdioma(null);
		using(revisioToInternalConverter).map(source.getRevisio()).setRevisio(null);
		using(booleanToInternalConverter).map(source.getDigitalitzat()).setDigitalitzat(null);
		using(idiomaToInternalConverter).map(source.getDigitalitzacio().getIdioma()).setIdiomaDigitalitzacio(null);
		using(dataHoraToInternalConverter).map(source.getDigitalitzacio().getDataDigitalitzacio()).setDataDigitalitzacio(null);
		using(fitxerToInternalConverter).map(source.getFitxer()).setDocsFisics(null);
	}

}
