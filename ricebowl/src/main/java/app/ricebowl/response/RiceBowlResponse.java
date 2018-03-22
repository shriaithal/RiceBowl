package app.ricebowl.response;

/**
 * 
 * @author Anushri Srinath Aithal
 *
 */
public class RiceBowlResponse extends GenericResponse {

	private static final long serialVersionUID = 1L;

	private String rice;
	private boolean vegetables;
	private String meat;
	private String sauce;
	private boolean sourCream;
	private boolean guacamole;

	public RiceBowlResponse() {
	}

	public RiceBowlResponse(String rice, boolean vegetables, String meat, String sauce, boolean sourCream,
			boolean guacamole) {
		super();
		this.rice = rice;
		this.vegetables = vegetables;
		this.meat = meat;
		this.sauce = sauce;
		this.sourCream = sourCream;
		this.guacamole = guacamole;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public boolean isVegetables() {
		return vegetables;
	}

	public void setVegetables(boolean vegetables) {
		this.vegetables = vegetables;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public boolean isSourCream() {
		return sourCream;
	}

	public void setSourCream(boolean sourCream) {
		this.sourCream = sourCream;
	}

	public boolean isGuacamole() {
		return guacamole;
	}

	public void setGuacamole(boolean guacamole) {
		this.guacamole = guacamole;
	}

}
