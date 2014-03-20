package cl.psep.html4j.components;

import java.io.Serializable;

/**
 * @author psep
 *
 */
public class Javascript implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3719365379594625927L;

	private String src;
	private String content;

	public Javascript() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder js = new StringBuilder();

		js.append("<script");

		if (this.src != null && !"".equals(this.src)) {
			js.append(" src=\"");
			js.append(this.src);
			js.append("\">");
		} else {
			js.append(">\n");
			js.append(this.content);
			js.append("\n");
		}

		js.append("</script>");

		return js.toString();
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
