package app.ricebowl.model;

/**
 * 
 * @author Anushri Srinath Aithal
 *
 */
public enum SauceType {

	SPICY("spicy"), SWEET("sweet"), NONE("none");

	private final String type;

	SauceType(String type) {
		this.type = type;
	}

	public String getValue() {
		return type;
	}

	public static SauceType findValue(String type) {
		for (SauceType sauceType : SauceType.values()) {
			if (sauceType.type.equals(type)) {
				return sauceType;
			}
		}
		return null;
	}
}
