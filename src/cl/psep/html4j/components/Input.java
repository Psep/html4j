package cl.psep.html4j.components;

import java.io.Serializable;

public class Input extends AbstractHTML implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7558732894558952787L;

	private String placeholder;
	private String type;
	private String autocomplete;
	private String list;
	private String maxlength;
	private String pattern;
	private String readonly;
	private String required;
	private String size;
	private String value;

	public Input() {
		super();
		super.classCss = "";
		super.javascript = "";
		super.otherComponent = "";
		super.style = "";
		super.id = "";
		super.name = "";
		this.placeholder = "";
		this.type = "";
		this.autocomplete = "";
		this.list = "";
		this.maxlength = "";
		this.pattern = "";
		this.readonly = "";
		this.required = "";
		this.size = "";
		this.value = "";
	}

	@Override
	public String toString() {
		StringBuilder input = new StringBuilder();
		input.append("<input");

		if (!this.type.equals("")) {
			input.append(" type=\"");
			input.append(this.type);
			input.append("\"");
		}

		if (!super.id.equals("")) {
			input.append(" id=\"");
			input.append(super.id);
			input.append("\"");
		}

		if (!super.name.equals("")) {
			input.append(" name=\"");
			input.append(super.name);
			input.append("\"");
		}

		if (!super.classCss.equals("")) {
			input.append(" class=\"");
			input.append(super.classCss);
			input.append("\"");
		}

		if (!super.style.equals("")) {
			input.append(" style=\"");
			input.append(super.style);
			input.append("\"");
		}

		if (!this.autocomplete.equals("")) {
			input.append(" autocomplete=\"");
			input.append(this.autocomplete);
			input.append("\"");
		}

		if (!this.list.equals("")) {
			input.append(" list=\"");
			input.append(this.list);
			input.append("\"");
		}

		if (!this.maxlength.equals("")) {
			input.append(" maxlength=\"");
			input.append(this.maxlength);
			input.append("\"");
		}

		if (!this.pattern.equals("")) {
			input.append(" pattern=\"");
			input.append(this.pattern);
			input.append("\"");
		}

		if (!this.readonly.equals("")) {
			input.append(" readonly=\"");
			input.append(this.readonly);
			input.append("\"");
		}

		if (!this.required.equals("")) {
			input.append(" required=\"");
			input.append(this.required);
			input.append("\"");
		}

		if (!this.size.equals("")) {
			input.append(" size=\"");
			input.append(this.size);
			input.append("\"");
		}

		input.append(" value=\"");
		input.append(this.value);
		input.append("\"");

		if (!super.javascript.equals("")) {
			input.append(" ");
			input.append(super.javascript);
		}

		if (!this.placeholder.equals("")) {
			input.append(" placeholder=\"");
			input.append(this.placeholder);
			input.append("\"");
		}

		if (!super.otherComponent.equals("")) {
			input.append(" ");
			input.append(super.otherComponent);
		}

		input.append("/>");

		return input.toString();
	}

	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * @param placeholder
	 * 
	 *            Represents a short hint (a word or short phrase) intended to
	 *            aid the user with data entry. A hint could be a sample value
	 *            or a brief description of the expected format. For a longer
	 *            hint or other advisory text, the title attribute is more
	 *            appropriate
	 */
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAutocomplete() {
		return autocomplete;
	}

	/**
	 * @param autocomplete
	 * 
	 *            Options: on/off
	 */
	public void setAutocomplete(String autocomplete) {
		this.autocomplete = autocomplete;
	}

	public String getList() {
		return list;
	}

	/**
	 * @param list
	 * 
	 *            ID Reference:
	 * 
	 *            Identify an element that lists predefined options suggested to
	 *            the user. If present, its value must be the ID of a datalist
	 *            element in the same document.
	 */
	public void setList(String list) {
		this.list = list;
	}

	public String getMaxlength() {
		return maxlength;
	}

	/**
	 * @param maxlength
	 * 
	 *            Positive integer:
	 * 
	 *            Gives the maximum allowed value length of the element.
	 */
	public void setMaxlength(String maxlength) {
		this.maxlength = maxlength;
	}

	public String getPattern() {
		return pattern;
	}

	/**
	 * @param pattern
	 * 
	 *            Specifies a regular expression against which the control's
	 *            value is to be checked. If specified, the attribute's value
	 *            must match the JavaScript Pattern production. When an input
	 *            element has a pattern attribute specified, authors should
	 *            include a title attribute to give a description of the
	 *            pattern.
	 */
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getReadonly() {
		return readonly;
	}

	/**
	 * @param readonly
	 * 
	 *            Controls whether or not the user can edit the form control.
	 */
	public void setReadonly(String readonly) {
		this.readonly = readonly;
	}

	public String getRequired() {
		return required;
	}

	/**
	 * @param required
	 * 
	 *            When specified, the element is required.
	 */
	public void setRequired(String required) {
		this.required = required;
	}

	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 * 
	 *            valid non-negative integer:
	 * 
	 *            The number of options meant to be shown by the control
	 *            represented by its element.
	 */
	public void setSize(String size) {
		this.size = size;
	}

	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 * 
	 *            Gives the default value of the input element.
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
