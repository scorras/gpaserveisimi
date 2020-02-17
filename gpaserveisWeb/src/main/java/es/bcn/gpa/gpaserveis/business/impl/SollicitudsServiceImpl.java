package es.bcn.gpa.gpaserveis.business.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import es.bcn.gpa.gpaserveis.business.SollicitudsService;
import es.bcn.gpa.gpaserveis.business.exception.GPAServeisServiceException;
import es.bcn.gpa.gpaserveis.business.handler.ServeisServiceExceptionHandler;
import es.bcn.gpa.gpaserveis.rest.client.api.gpaexpedients.SollicitudsApi;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.SollicitudsRDTO;
import lombok.extern.apachecommons.CommonsLog;

/**
 * The Class SollicitudsServiceImpl.
 */
@Service

/** The Constant log. */
@CommonsLog
public class SollicitudsServiceImpl implements SollicitudsService {

	/** The sollicituds api. */
	@Autowired
	private SollicitudsApi sollicitudsApi;

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.bcn.gpa.gpaserveis.business.SollicitudsService#
	 * consultarSollicitudsExpedient(java.math.BigDecimal)
	 */
	@Override
	@HystrixCommand(fallbackMethod = "fallbackConsultarSollicitudsExpedient")
	public List<SollicitudsRDTO> consultarSollicitudsExpedient(BigDecimal idExpedient) throws GPAServeisServiceException {
		if (log.isDebugEnabled()) {
			log.debug("consultarSollicitudsExpedient(BigDecimal) - inici"); //$NON-NLS-1$
		}
		try {
			List<SollicitudsRDTO> sollicitudsRDTOList = sollicitudsApi.consultarSollicitudsExpedient(idExpedient);

			if (log.isDebugEnabled()) {
				log.debug("consultarSollicitudsExpedient(BigDecimal) - fi"); //$NON-NLS-1$
			}
			return sollicitudsRDTOList;
		} catch (RestClientException e) {
			log.error("consultarSollicitudsExpedient(BigDecimal)", e); //$NON-NLS-1$

			throw new GPAServeisServiceException("S'ha produït una incidència", e);
		}
	}

	/**
	 * Fallback consultar sollicituds expedient.
	 *
	 * @param idExpedient
	 *            the id expedient
	 * @param e
	 *            the e
	 * @return the list
	 * @throws GPAServeisServiceException
	 *             the GPA serveis service exception
	 */
	public List<SollicitudsRDTO> fallbackConsultarSollicitudsExpedient(BigDecimal idExpedient, Throwable e)
			throws GPAServeisServiceException {
		if (log.isDebugEnabled()) {
			log.debug("fallbackConsultarSollicitudsExpedient(BigDecimal, Throwable) - inici"); //$NON-NLS-1$
		}
		ServeisServiceExceptionHandler.handleException(e);
		return null;
	}

}
