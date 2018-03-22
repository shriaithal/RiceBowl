package app.ricebowl.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import app.ricebowl.exception.RiceBowlInvalidInputException;
import app.ricebowl.helper.RiceBowlHelper;
import app.ricebowl.model.MeatType;
import app.ricebowl.model.RiceBowl;
import app.ricebowl.model.RiceType;
import app.ricebowl.model.SauceType;
import app.ricebowl.request.RiceBowlRequest;
import app.ricebowl.response.RiceBowlResponse;
import app.ricebowl.service.RiceBowlService;

/**
 * Application Service Implementation
 * 
 * @author Anushri Srinath Aithal
 *
 */
@Service
public class RiceBowlServiceImpl implements RiceBowlService {

	@Override
	public RiceBowlResponse createRiceBowl(RiceBowlRequest request) throws RiceBowlInvalidInputException {

		RiceType riceType = RiceBowlHelper.getRiceType(request.getRiceType());

		MeatType meatType = RiceBowlHelper.getMeatType(request.getMeatType());

		SauceType sauceType = RiceBowlHelper.getSauceType(request.getSauceType());

		// Validate if rice=none & meat=none & veggies=none exception
		if (RiceType.NONE.equals(riceType) && MeatType.NONE.equals(meatType) && !request.isVegetablesRequired()) {
			throw new RiceBowlInvalidInputException(HttpStatus.BAD_REQUEST,
					"Rice, Meat and Veggies all 3 cannot be empty");
		}

		RiceBowl riceBowl = new RiceBowl();
		riceBowl.setRiceType(riceType);
		riceBowl.setMeatType(meatType);
		riceBowl.setSauceType(sauceType);
		riceBowl.setVegetablesRequired(request.isVegetablesRequired());
		riceBowl.setSourCreamRequired(request.isSourCreamRequired());
		riceBowl.setGuacamoleRequired(request.isGuacamoleRequired());

		RiceBowlResponse response = createRiceBowlResponse(riceBowl);
		return response;
	}

	@Override
	public List<RiceBowlResponse> createRiceBowls(List<RiceBowlRequest> request) {
		List<RiceBowlResponse> responseList = new ArrayList<RiceBowlResponse>();
		for (RiceBowlRequest riceBowlRequest : request) {
			RiceBowlResponse response;
			try {
				response = createRiceBowl(riceBowlRequest);
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

			responseList.add(response);
		}
		return responseList;
	}

	// Create a response to return rice bowl
	private RiceBowlResponse createRiceBowlResponse(RiceBowl riceBowl) {
		RiceBowlResponse riceBowlResponse = new RiceBowlResponse();
		riceBowlResponse.setRice(riceBowl.getRiceType().getValue());
		riceBowlResponse.setMeat(riceBowl.getMeatType().getValue());
		riceBowlResponse.setSauce(riceBowl.getSauceType().getValue());
		riceBowlResponse.setVegetables(riceBowl.isVegetablesRequired());
		riceBowlResponse.setSourCream(riceBowl.isSourCreamRequired());
		riceBowlResponse.setGuacamole(riceBowl.isGuacamoleRequired());

		return riceBowlResponse;
	}
}
