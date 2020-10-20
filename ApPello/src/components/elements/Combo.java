package components.elements;

import components.Component;

public class Combo implements Component {
	
	public static final String SELECTNAME = "<select name=\"";
	public static final String ENDTAG = "\">";
	public static final String OPTIONVALUE = "<option value=\"";
	public static final String OPTIONEND = "</option>";
	public static final String SELECTEND =  "</select>";
	
	private String selectName;
	private String firstOptionValue;
	private String secondOptionValue;
	private String firstChoiceText;
	private String secondChoiceText;
	
	public Combo(String selectName, String firstOptionValue, String firstChoiceText,
			String secondOptionValue, String secondChoiceText) {
		super();
		this.selectName = selectName;
		this.firstOptionValue = firstOptionValue;
		this.firstChoiceText = firstChoiceText;
		this.secondOptionValue = secondOptionValue;
		this.secondChoiceText = secondChoiceText;		
	}
	
	
	@Override
	public String display()
	{
		return SELECTNAME + selectName + ENDTAG + OPTIONVALUE + firstOptionValue + ENDTAG +
				firstChoiceText + OPTIONEND + OPTIONVALUE + secondOptionValue + ENDTAG +
				secondChoiceText + OPTIONEND + SELECTEND;
	 
	}
	
	public String getSelectName() {
		return selectName;
	}


	public void setSelectName(String selectName) {
		this.selectName = selectName;
	}


	public String getFirstOptionValue() {
		return firstOptionValue;
	}


	public void setFirstOptionValue(String firstOptionValue) {
		this.firstOptionValue = firstOptionValue;
	}


	public String getSecondOptionValue() {
		return secondOptionValue;
	}


	public void setSecondOptionValue(String secondOptionValue) {
		this.secondOptionValue = secondOptionValue;
	}


	public String getFirstChoiceText() {
		return firstChoiceText;
	}


	public void setFirstChoiceText(String firstChoiceText) {
		this.firstChoiceText = firstChoiceText;
	}


	public String getSecondChoiceText() {
		return secondChoiceText;
	}


	public void setSecondChoiceText(String secondChoiceText) {
		this.secondChoiceText = secondChoiceText;
	}

}
