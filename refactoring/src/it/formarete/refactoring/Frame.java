package it.formarete.refactoring;

public class Frame {

	private int columns;
	private int rows;
	private String label;

	public Frame(int columns, int rows, String label) {
		this.columns = columns;
		this.rows = rows;
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public String build() {

		String output = "";

		output += buildFullRows();
		

		// build empty rows
		if (label.length() > (columns-2)*2) {
			output += buildEmptyRowsEven();
		} else {
			output += buildEmptyRows();
		}
		
		
		output += buildLabel();

		
		// build empty rows
		if (rows % 2 == 0) {
			output += buildEmptyRowsEven();
		} else {
			output += buildEmptyRows();
		}
		
		
		output += buildFullRows();

		return output;
	}

	public String buildFullRows() {
		String output = "";
		for (int i = 0; i < columns; i++) {
			output += "* ";
		}
		output += "\n";
		return output;
	}

	public String buildEmptyRows() {
		String output = "";
		int rowsMinusBorders = rows - 2;
		int halfFrame = rowsMinusBorders / 2;
		for (int i = 0; i < halfFrame; i++) {
			output += buildEmptyRow();
		}
		return output;
	}

	public String buildEmptyRowsEven() {
		String output = "";
		int rowsMinusBorders = rows - 2;
		int halfFrame = rowsMinusBorders / 2;
		for (int i = 0; i < halfFrame - 1; i++) {
			output += buildEmptyRow();
		}
		return output;
	}

	public String buildEmptyRow() {
		String output = "";
		output += "* ";
		int charsPerColumn = output.length();
		int columnsMinusBorders = columns - 2;
		int spaces = columnsMinusBorders * charsPerColumn;
		for (int i = 0; i < spaces; i++) {
			output += " ";
		}
		output += "* ";
		output += "\n";
		return output;
	}

	public String buildLabel() {
		String output = "* ";
		int charPerColumn = output.length();
		int borders = 2 * charPerColumn;
		// int columnsMinusBorderAndLabel = columns - borders - label.length();
		int spaces = columns * charPerColumn - borders - label.length();
		if (spaces >= 0) {
			int halfSpaces = spaces / 2;
			for (int i = 0; i < halfSpaces; i++) {
				output += " ";
			}
			output += label;
			for (int i = 0; i < halfSpaces; i++) {
				output += " ";
			}
			output += "* ";
			output += "\n";

		} else {
			String str1 = "";
			String str2 = "";
			char[] charArray = label.toCharArray();
			int arrayIndex = charArray.length / 2;
			for (int i = 0; i < arrayIndex; i++) {
				str1 += charArray[i];
				str2 += charArray[arrayIndex + i];
			}
			spaces = columns * charPerColumn - borders - str1.length();
			int halfSpaces = spaces / 2;
			for (int i = 0; i < halfSpaces; i++) {
				output += " ";
			}
			output += str1;
			for (int i = 0; i < halfSpaces; i++) {
				output += " ";
			}
			output += "* ";
			output += "\n";
			output += "* ";
			for (int i = 0; i < halfSpaces; i++) {
				output += " ";
			}
			output += str2;
			for (int i = 0; i < halfSpaces; i++) {
				output += " ";
			}
			output += "* ";
			output += "\n";

		}
		return output;

	}

	public static void main(String[] args) {
		Frame frame = new Frame(10, 10, "ciiiao");
		System.out.println(frame.build());
	}
}