package es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.sollicituds.helper;

import java.util.ArrayList;
import java.util.List;

import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.common.PersonesRDTO;
import es.bcn.gpa.gpaserveis.web.rest.dto.serveis.portal.accions.sollicituds.actualitzar.SollicitudActualitzarRDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SollicitudActualitzarHelper {

	private SollicitudActualitzarRDTO sollicitudActualitzarRDTO;

	private List<PersonesRDTO> personesSollicitud;

	private List<PersonesRDTO> personesInteressades;

	private List<PersonesRDTO> personesImplicades;

	public SollicitudActualitzarHelper(SollicitudActualitzarRDTO sollicitudActualitzarRDTO) {
		super();
		this.sollicitudActualitzarRDTO = sollicitudActualitzarRDTO;
		this.personesSollicitud = new ArrayList<>();
		this.personesInteressades = new ArrayList<>();
		this.personesImplicades = new ArrayList<>();

		if (sollicitudActualitzarRDTO.getSollicitant() != null) {
			this.personesSollicitud.add(sollicitudActualitzarRDTO.getSollicitant());
		}
		if (sollicitudActualitzarRDTO.getRepresentant() != null) {
			this.personesSollicitud.add(sollicitudActualitzarRDTO.getRepresentant());
		}
		if (sollicitudActualitzarRDTO.getPersonesImplicades() != null) {
			this.personesImplicades.addAll(sollicitudActualitzarRDTO.getPersonesImplicades());
		}
		if (sollicitudActualitzarRDTO.getPersonesInteressades() != null) {
			this.personesInteressades.addAll(sollicitudActualitzarRDTO.getPersonesInteressades());
		}
	}

}
