package app.ricebowl.exception;

import org.springframework.http.HttpStatus;

/**
 * Custom Exception for invalid inputs
 * 
 * @author Anushri Srinath Aithal
 *
 */
public class RiceBowlInvalidInputException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;
	private HttpStatus status;

	public RiceBowlInvalidInputException(HttpStatus status, String message) {
		super();
		this.message = message;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getStatus() {
		return status;
	}

}
