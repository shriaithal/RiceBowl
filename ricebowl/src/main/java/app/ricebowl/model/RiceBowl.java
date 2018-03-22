package app.ricebowl.model;

/**
 * POJO to represent Rice Bowl
 * 
 * @author Anushri Srinath Aithal
 *
 */
public class RiceBowl {

	private RiceType riceType;
	private boolean vegetablesRequired;
	private MeatType meatType;
	private SauceType sauceType;
	private boolean sourCreamRequired;
	private boolean guacamoleRequired;

	public RiceBowl() {
	}

	public RiceBowl(RiceType riceType, boolean vegetablesRequired, MeatType meatType, SauceType sauceType,
			boolean sourCreamRequired, boolean guacamoleRequired) {
		super();
		this.riceType = riceType;
		this.vegetablesRequired = vegetablesRequired;
		this.meatType = meatType;
		this.sauceType = sauceType;
		this.sourCreamRequired = sourCreamRequired;
		this.guacamoleRequired = guacamoleRequired;
	}

	public RiceType getRiceType() {
		return riceType;
	}

	public void setRiceType(RiceType riceType) {
		this.riceType = riceType;
	}

	public boolean isVegetablesRequired() {
		return vegetablesRequired;
	}

	public void setVegetablesRequired(boolean vegetablesRequired) {
		this.vegetablesRequired = vegetablesRequired;
	}

	public MeatType getMeatType() {
		return meatType;
	}

	public void setMeatType(MeatType meatType) {
		this.meatType = meatType;
	}

	public SauceType getSauceType() {
		return sauceType;
	}

	public void setSauceType(SauceType sauceType) {
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
