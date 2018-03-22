package app.ricebowl.model;

/**
 * 
 * @author Anushri Srinath Aithal
 *
 */
public enum MeatType {

	CHICKEN("chicken"), BEEF("beef"), NONE("none");

	private final String type;

	MeatType(String type) {
		this.type = type;
	}

	public String getValue() {
		return type;
	}

	public static MeatType findValue(String type) {
		for (MeatType meatType : MeatType.values()) {
			if (meatType.type.equals(type)) {
				return meatType;
			}
		}
		return null;
	}
}
