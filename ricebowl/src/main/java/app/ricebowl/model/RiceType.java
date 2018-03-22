package app.ricebowl.model;

/**
 * 
 * @author Anushri Srinath Aithal
 *
 */
public enum RiceType {

	BROWN_RICE("brown"), WHITE_RICE("white"), NONE("none");

	private final String type;

	RiceType(String type) {
		this.type = type;
	}

	public String getValue() {
		return type;
	}

	public static RiceType findValue(String type) {
		for (RiceType riceType : RiceType.values()) {
			if (riceType.type.equals(type)) {
				return riceType;
			}
		}
		return null;
	}
}
