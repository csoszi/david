package components.elements;

import components.Component;

public class Button implements Component {
	
	public static final String BUTTONTYPE = "<button type=\"";
	public static final String BUTTONMIDDLE = "\">";
	public static final String BUTTONEND = "</button>";

	private String type;
	private String buttonText;

	public Button(String type, String buttonText) {
		super();
		this.type = type;
		this.buttonText = buttonText;
	}

	@Override
	public String display() {
		return BUTTONTYPE + type + BUTTONMIDDLE + buttonText + BUTTONEND;
	}

}
