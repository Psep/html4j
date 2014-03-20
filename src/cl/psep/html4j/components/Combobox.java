package cl.psep.html4j.components;

import java.io.Serializable;

/**
 * @author psep
 *
 */
public class Combobox extends AbstractHTML implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 458427721543072517L;
	
	private StringBuilder options;

	/**
	 * @param id
	 * @param name
	 * @param classCss
	 * @param style
	 * @param javascript
	 * @param otherComponent
	 */
	public Combobox(String id, String name, String classCss, String style,
			String javascript, String otherComponent) {
		super();
		super.id = id;
		super.name = name;
		super.classCss = classCss;
		super.style = style;
		super.javascript = javascript;
		super.otherComponent = otherComponent;
		this.options = new StringBuilder();
	}

	/**
	 * @param option
	 * @throws Exception
	 */
	public void add(SelectOption option) {
		try {
			if (option == null) {
				throw new Exception("The object is null");
			} else {
				this.options.append(ENTER);
				this.options.append(option.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder combo = new StringBuilder();
		combo.append("<select");
		
		if (super.id != null
				&& !"".equals(super.id)) {
			combo.append(" id=\"");
			combo.append(super.id);
			combo.append("\"");
		}
		
		if (super.classCss != null
				&& !"".equals(super.classCss)) {
			combo.append(" class=\"");
			combo.append(super.classCss);
			combo.append("\"");
		}
		
		if (super.style != null
				&& !"".equals(super.style)) {
			combo.append(" style=\"");
			combo.append(super.style);
			combo.append("\"");
		}
		
		if (super.javascript != null
				&& !"".equals(super.javascript)) {
			combo.append(" ");
			combo.append(super.javascript);
		}
		
		if (super.otherComponent != null
				&& !"".equals(super.otherComponent)) {
			combo.append(" ");
			combo.append(super.otherComponent);
		}
		
		combo.append(">");
		combo.append(this.options.toString());
		combo.append(ENTER);
		combo.append("</select>");
		
		return combo.toString();
	}

}
