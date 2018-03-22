package app.ricebowl.request;

import java.io.Serializable;

/**
 * Rice Bowl Request Class Input accepted in json format
 * 
 * @author Anushri Srinath Aithal
 *
 */
public class RiceBowlRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String riceType;
	private boolean vegetablesRequired;
	private String meatType;
	private String sauceType;
	private boolean sourCreamRequired;
	private boolean guacamoleRequired;

	public RiceBowlRequest() {
	}

	public RiceBowlRequest(String riceType, boolean vegetablesRequired, String meatType, String sauceType,
			boolean sourCreamRequired, boolean guacamoleRequired) {
		super();
		this.riceType = riceType;
		this.vegetablesRequired = vegetablesRequired;
		this.meatType = meatType;
		this.sauceType = sauceType;
		this.sourCreamRequired = sourCreamRequired;
		this.guacamoleRequired = guacamoleRequired;
	}

	public String getRiceType() {
		return riceType;
	}

	public void setRiceType(String riceType) {
		this.riceType = riceType;
	}

	public boolean isVegetablesRequired() {
		return vegetablesRequired;
	}

	public void setVegetablesRequired(boolean vegetablesRequired) {
		this.vegetablesRequired = vegetablesRequired;
	}

	public String getMeatType() {
		return meatType;
	}

	public void setMeatType(String meatType) {
		this.meatType = meatType;
	}

	public String getSauceType() {
		return sauceType;
	}

	public void setSauceType(String sauceType) {
		this.sauceType = sauceType;
	}

	public boolean isSourCreamRequired() {
		return sourCreamRequired;
	}

	public void setSourCreamRequired(boolean sourCreamRequired) {
		this.sourCreamRequired = sourCreamRequired;
	}

	public boolean isGuacamoleRequired() {
		return guacamoleRequired;
	}

	public void setGuacamoleRequired(boolean guacamoleRequired) {
		this.guacamoleRequired = guacamoleRequired;
	}
}
