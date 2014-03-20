package cl.psep.html4j.components;

import java.io.Serializable;

public abstract class AbstractHTML implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected static final String ENTER = "\n";
	
	protected String style;
	protected String classCss;
	protected String javascript;
	protected String otherComponent;
	protected String id;
	protected String name;

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getClassCss() {
		return classCss;
	}

	public void setClassCss(String classCss) {
		this.classCss = classCss;
	}

	public String getJavascript() {
		return javascript;
	}

	public void setJavascript(String javascript) {
		this.javascript = javascript;
	}

	public String getOtherComponent() {
		return otherComponent;
	}

	public void setOtherComponent(String otherComponent) {
		this.otherComponent = otherComponent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * 
	 * Gives the name of the input element.
	 */
	public void setName(String name) {
		this.name = name;
	}

}
