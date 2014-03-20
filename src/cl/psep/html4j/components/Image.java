package cl.psep.html4j.components;

import java.io.Serializable;

/**
 * @author psep
 *
 */
public class Image extends AbstractHTML implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2753220479185426100L;

	private String src;
	private String alt;

	public Image(String src) {
		super();
		this.src = src;
	}
	
	@Override
	public String toString() {
		StringBuilder img = new StringBuilder();
		img.append("<img src=\"");
		img.append(this.src);
		img.append("\"");
		
		if (super.id != null && !"".equals(super.id)) {
			img.append(" id=\"");
			img.append(super.id);
			img.append("\"");
		}
		
		if (super.classCss != null && !"".equals(super.classCss)) {
			img.append(" class=\"");
			img.append(super.classCss);
			img.append("\"");
		}
		
		if (this.alt != null && !"".equals(this.alt)) {
			img.append(" alt=\"");
			img.append(this.alt);
			img.append("\"");
		}
		
		if (super.style != null && !"".equals(super.style)) {
			img.append(" style=\"");
			img.append(super.style);
			img.append("\"");
		}
		
		if (super.javascript != null && !"".equals(super.javascript)) {
			img.append(" ");
			img.append(super.javascript);
		}

		if (super.otherComponent != null && !"".equals(super.otherComponent)) {
			img.append(" ");
			img.append(super.otherComponent);
		}
		
		img.append("></img>");
		
		return img.toString();
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

}
