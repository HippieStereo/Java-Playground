package serializable.one;

import java.io.Serializable;

public class ImplSerializable implements Serializable {

	private static final long serialVersionUID = -9168548731341386047L;
	
	private String textNormal;
	private transient String textTransient;
	private static String textStatic = "static String";
	private transient static String textTransentStatic = "transient static String";
	private final String textFinal = "final String";
	private transient final String textTransientFinal = "transientfinal String";

	public ImplSerializable(String textNormal, String textTransient) {
	
		this.textNormal = textNormal;
		this.textTransient = textTransient;
		
	}

	@Override
	public String toString() {
		return "serialVersionUID = " + serialVersionUID + "\ntextNormal = " + textNormal + "\ntextTransient = " + textTransient +
				"\ntextStatic = " + textStatic + "\ntextTransentStatic = " + textTransentStatic + 
				"\ntextFinal = " + textFinal + "\ntextTransientFinal = " + textTransientFinal;
	}
		
}
