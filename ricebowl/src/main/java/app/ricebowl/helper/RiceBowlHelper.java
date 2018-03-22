package app.ricebowl.helper;

import org.springframework.http.HttpStatus;

import app.ricebowl.exception.RiceBowlInvalidInputException;
import app.ricebowl.model.MeatType;
import app.ricebowl.model.RiceType;
import app.ricebowl.model.SauceType;

/**
 * Helper Class to validate and convert input to required format
 * 
 * @author Anushri Srinath Aithal
 *
 */
public class RiceBowlHelper {

	// Validate for appropriate Rice Type
	public static RiceType getRiceType(String riceTypeInput) throws RiceBowlInvalidInputException {
		RiceType riceType = RiceType.findValue(riceTypeInput);
		if (null == riceType) {
			throw new RiceBowlInvalidInputException(HttpStatus.BAD_REQUEST, "Invalid Rice Type");
		}
		return riceType;
	}

	// Validate for appropriate Meat Type
	public static MeatType getMeatType(String meatTypeInput) throws RiceBowlInvalidInputException {
		MeatType meatType = MeatType.findValue(meatTypeInput);
		if (null == meatType) {
			throw new RiceBowlInvalidInputException(HttpStatus.BAD_REQUEST, "Invalid Meat Type");
		}
		return meatType;
	}

	// Validate for appropriate Sauce
	public static SauceType getSauceType(String sauceTypeInput) throws RiceBowlInvalidInputException {
		SauceType sauceType = SauceType.findValue(sauceTypeInput);
		if (null == sauceType) {
			throw new RiceBowlInvalidInputException(HttpStatus.BAD_REQUEST, "Invalid Sauce Type");
		}
		return sauceType;
	}
}
