package cl.psep.html4j.components;

import java.io.Serializable;

/**
 * @author psep
 *
 */
public class Link extends AbstractHTML implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9092442399352676685L;

	private String href;
	private String title;
	private String target;
	private String value;

	public Link() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder a = new StringBuilder();
		a.append("<a href=\"");
		a.append(this.href);
		a.append("\"");

		if (super.id != null && !"".equals(super.id)) {
			a.append(" id=\"");
			a.append(super.id);
			a.append("\"");
		}
		
		if (this.title != null && !"".equals(this.title)) {
			a.append(" title=\"");
			a.append(this.title);
			a.append("\"");
		}

		if (super.classCss != null && !"".equals(super.classCss)) {
			a.append(" class=\"");
			a.append(super.classCss);
			a.append("\"");
		}

		if (super.style != null && !"".equals(super.style)) {
			a.append(" style=\"");
			a.append(super.style);
			a.append("\"");
		}

		if (super.javascript != null && !"".equals(super.javascript)) {
			a.append(" ");
			a.append(super.javascript);
		}

		if (super.otherComponent != null && !"".equals(super.otherComponent)) {
			a.append(" ");
			a.append(super.otherComponent);
		}
		
		if (this.target != null && !"".equals(this.target)) {
			a.append(" target=\"");
			a.append(this.target);
			a.append("\"");
		}

		if (this.value == null || "".equals(this.value.trim())) {
			this.value = this.href;
		}

		a.append(">");
		a.append(ENTER);
		a.append(this.value);
		a.append(ENTER);
		a.append("</a>");

		return a.toString();
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
