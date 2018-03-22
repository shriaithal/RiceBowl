package app.ricebowl.service;

import java.util.List;

import app.ricebowl.exception.RiceBowlInvalidInputException;
import app.ricebowl.request.RiceBowlRequest;
import app.ricebowl.response.RiceBowlResponse;

/**
 * Interface for Rice Bowl Application
 * 
 * @author Anushri Srinath Aithal
 *
 */
public interface RiceBowlService {

	/**
	 * create a single rice bowl
	 * 
	 * @param request
	 * @return
	 * @throws RiceBowlInvalidInputException
	 */
	RiceBowlResponse createRiceBowl(RiceBowlRequest request) throws RiceBowlInvalidInputException;

	/**
	 * create a list of rice bowls
	 * 
	 * @param request
	 * @return
	 */
	List<RiceBowlResponse> createRiceBowls(List<RiceBowlRequest> request);

}
