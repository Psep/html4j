package cl.psep.html4j.components;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author psep
 * 
 */
public class Table extends AbstractHTML implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String HEAD = "<table";
	private static final String HEAD_CLOSE = "</table>";
	private static final String THEAD = "<thead";
	private static final String THEAD_CLOSE = "</thead>";
	private static final String TH = "<th";
	private static final String TH_CLOSE = "</th>";
	private static final String TR = "<tr";
	private static final String TR_CLOSE = "</tr>";
	private static final String TBODY = "<tbody";
	private static final String TBODY_CLOSE = "</tbody>";
	private static final String TD = "<td";
	private static final String TD_CLOSE = "</td>";

	private ArrayList<String> columns;
	private ArrayList<String> rows;
	private String classCssTh;
	private String classCssTd;
	private String classCssTr;
	private String border;

	public Table() {
		super();
		this.columns = new ArrayList<String>();
		this.rows = new ArrayList<String>();
		super.classCss = "";
		this.classCssTd = "";
		this.classCssTh = "";
		this.classCssTr = "";
		super.javascript = "";
		super.otherComponent = "";
		super.style = "";
		this.border = "";
	}

	@Override
	public String toString() {
		StringBuilder table = new StringBuilder();
		this.head(table);
		table.append(ENTER);
		this.thead(table);
		table.append(ENTER);
		this.tbody(table);
		table.append(ENTER);
		table.append(HEAD_CLOSE);

		return table.toString();
	}

	/**
	 * @param table
	 */
	private void tbody(StringBuilder table) {
		table.append(TBODY);
		table.append(">");
		table.append(ENTER);

		if (this.rows.size() > 0) {
			Iterator<String> iter = this.rows.iterator();
			int contRowColumns = this.columns.size();
			int acumulador = 1;

			while (iter.hasNext()) {
				String row = (String) iter.next();

				if (acumulador == 1) {
					table.append(TR);

					if (!this.classCssTr.equals("")) {
						table.append(" class=\"");
						table.append(this.classCssTr);
						table.append("\"");
					}

					table.append(">");
					table.append(ENTER);
				}

				table.append(TD);

				if (!this.classCssTd.equals("")) {
					table.append(" class=\"");
					table.append(this.classCssTd);
					table.append("\"");
				}

				table.append(">");
				table.append(row);
				table.append(TD_CLOSE);
				table.append(ENTER);

				if (acumulador == contRowColumns) {
					table.append(TR_CLOSE);
					table.append(ENTER);
					acumulador = 1;
				} else {
					acumulador++;
				}
			}
		}

		table.append(TBODY_CLOSE);
	}

	/**
	 * @param table
	 */
	private void thead(StringBuilder table) {
		table.append(THEAD);
		table.append(">");
		table.append(ENTER);

		if (this.columns.size() > 0) {
			Iterator<String> iter = this.columns.iterator();

			while (iter.hasNext()) {
				String column = (String) iter.next();
				table.append(TH);

				if (!this.classCssTh.equals("")) {
					table.append(" class=\"");
					table.append(this.classCssTh);
					table.append("\"");
				}

				table.append(">");
				table.append(column);
				table.append(TH_CLOSE);
				table.append(ENTER);
			}
		}

		table.append(THEAD_CLOSE);
	}

	/**
	 * @param table
	 */
	private void head(StringBuilder table) {
		table.append(HEAD);

		if (!super.classCss.equals("")) {
			table.append(" class=\"");
			table.append(super.classCss);
			table.append("\"");
		}

		if (!super.style.equals("")) {
			table.append(" style=\"");
			table.append(super.style);
			table.append("\"");
		}
		
		if (!this.border.equals("")) {
			table.append(" border=\"");
			table.append(this.border);
			table.append("\"");
		}

		if (!super.otherComponent.equals("")) {
			table.append(" ");
			table.append(super.otherComponent);
		}

		if (!super.javascript.equals("")) {
			table.append(" ");
			table.append(super.javascript);
		}

		table.append(">");
	}

	public ArrayList<String> getColumns() {
		return columns;
	}

	public void setColumns(ArrayList<String> columns) {
		this.columns = columns;
	}

	public ArrayList<String> getRows() {
		return rows;
	}

	public void setRows(ArrayList<String> rows) {
		this.rows = rows;
	}

	public String getClassCssTh() {
		return classCssTh;
	}

	public void setClassCssTh(String classCssTh) {
		this.classCssTh = classCssTh;
	}

	public String getClassCssTd() {
		return classCssTd;
	}

	public void setClassCssTd(String classCssTd) {
		this.classCssTd = classCssTd;
	}

	public String getClassCssTr() {
		return classCssTr;
	}

	public void setClassCssTr(String classCssTr) {
		this.classCssTr = classCssTr;
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}

}
