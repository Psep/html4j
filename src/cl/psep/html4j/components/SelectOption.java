package cl.psep.html4j.components;

import java.io.Serializable;

/**
 * @author psep
 *
 */
public class SelectOption extends AbstractHTML implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7943688427527717392L;

	private Boolean disabled;
	private String value;

	public SelectOption(String id, String value) {
		super();
		super.id = id;
		super.classCss = "";
		super.style = "";
		super.otherComponent = "";
		super.javascript = "";
		this.disabled = false;
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder option = new StringBuilder();
		option.append("<option");

		if (super.id != null
				&& !"".equals(super.id)) {
			option.append(" id=\"");
			option.append(super.id);
			option.append("\"");
		}
		
		if (!"".equals(super.classCss)) {
			option.append(" class=\"");
			option.append(super.classCss);
			option.append("\"");
		}
		
		if (!"".equals(super.style)) {
			option.append(" style=\"");
			option.append(super.style);
			option.append("\"");
		}
		
		if (!"".equals(super.javascript)) {
			option.append(" ");
			option.append(super.javascript);
		}
		
		if (!"".equals(this.getOtherComponent())) {
			option.append(" id=\"");
			option.append(this.getOtherComponent());
			option.append("\"");
		}

		option.append(">");
		option.append(this.value);
		option.append("</option>");

		return option.toString();
	}

	@Override
	public String getOtherComponent() {
		if (this.disabled) {
			super.otherComponent = super.otherComponent + " disabled";
		}

		return super.otherComponent;
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
