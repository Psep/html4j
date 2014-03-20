package cl.psep.html4j.components;

import java.io.Serializable;

public class Button extends AbstractHTML implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3776110841423960640L;

	private String type;
	private String value;

	public Button() {
		super();
		this.value = "Send";
	}

	public String toString() {
		StringBuilder button = new StringBuilder();
		button.append("<button type=\"");
		button.append(this.getType());
		button.append("\"");

		if (super.id != null && !"".equals(super.id)) {
			button.append(" id=\"");
			button.append(super.id);
			button.append("\"");
		}

		if (super.classCss != null && !"".equals(super.classCss)) {
			button.append(" class=\"");
			button.append(super.classCss);
			button.append("\"");
		}

		if (super.style != null && !"".equals(super.style)) {
			button.append(" style=\"");
			button.append(super.style);
			button.append("\"");
		}

		if (super.javascript != null && !"".equals(super.javascript)) {
			button.append(" ");
			button.append(super.javascript);
		}

		if (super.otherComponent != null && !"".equals(super.otherComponent)) {
			button.append(" ");
			button.append(super.otherComponent);
		}

		button.append(">");
		button.append(ENTER);
		button.append(this.value);
		button.append(ENTER);
		button.append("</button>");

		return button.toString();
	}

	public String getType() {
		if (this.type == null) {
			this.type = "button";
		}
		
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
