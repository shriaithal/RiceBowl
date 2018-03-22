package app.ricebowl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import app.ricebowl.exception.RiceBowlInvalidInputException;
import app.ricebowl.request.RiceBowlRequest;
import app.ricebowl.response.RiceBowlResponse;
import app.ricebowl.service.RiceBowlService;

/**
 * Rest Controller for Rice Bowl Application
 * 
 * @author Anushri Srinath Aithal
 *
 */
@Controller
public class RiceBowlAPIController {

	@Autowired
	RiceBowlService service;

	/**
	 * API to create a rice bowl Accepts parameters that constitutes the rice bowl
	 * Returns the rice bowl object that is created
	 * 
	 * Request is taken in JSON format
	 * 
	 * @param request
	 * @return
	 */
	@PostMapping("/rice/bowl")
	@ResponseBody
	public RiceBowlResponse createRiceBowl(@RequestBody RiceBowlRequest request) {
		RiceBowlResponse response = null;
		try {
			response = service.createRiceBowl(request);

			response.setMessage("Success");
			response.setStatus(HttpStatus.OK);

		} catch (Exception exception) {
			response = new RiceBowlResponse();

			if (exception instanceof RiceBowlInvalidInputException) {
				response.setMessage(((RiceBowlInvalidInputException) exception).getMessage());
				response.setStatus(((RiceBowlInvalidInputException) exception).getStatus());
			} else {
				response.setMessage(exception.getMessage());
			}
		}
		return response;
	}

	/**
	 * API to create a list of rice bowls
	 * 
	 * @param request
	 * @return
	 */
	@PostMapping("/rice/bowls")
	@ResponseBody
	public List<RiceBowlResponse> createRiceBowls(@RequestBody List<RiceBowlRequest> request) {
		List<RiceBowlResponse> response = service.createRiceBowls(request);
		return response;
	}
}
