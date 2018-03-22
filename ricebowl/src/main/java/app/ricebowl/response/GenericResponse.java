package app.ricebowl.response;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

/**
 * 
 * @author Anushri Srinath Aithal
 *
 */
public class GenericResponse implements Serializable {

	private static final long serialVersionUID = 2233908408608520190L;

	private String message;
	private HttpStatus status;

	public GenericResponse() {

	}

	public GenericResponse(String message, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

}
