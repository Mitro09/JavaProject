package it.formarete.refactoring;

public class TriangleAsterics {

	private int base;

	public TriangleAsterics(int base) {
		this.base = base;
	}

	public String buildTriangle() {
		String triangle = "";
		int noSpaces = 1;
		for (int i = 0; i < base; i++) {
			triangle += writeSpaces(noSpaces);
			triangle += writeTriangle(noSpaces);
			triangle += "\n";
			noSpaces += 2;
		}
		/*
		 * int halfBase; int nAst = 1; int noSpaces = 1; int spaces; for(int
		 * i=0;i<base;i++) { spaces = base-noSpaces; halfBase = spaces/2; for(int j=0;
		 * j<halfBase; j++) { triangle += " "; } for(int j=0; j<nAst && nAst<=base; j++)
		 * { triangle += "*"; } nAst += 2; noSpaces += 2; for(int j=0; j<halfBase; j++)
		 * { triangle += " "; }
		 */
		// triangle += "\n";
		// }
		return triangle;
	}

	public String writeSpaces(int noSpaces) {
		String triangle = "";
		int halfBase;
		int spaces;
		spaces = base - noSpaces;
		halfBase = spaces / 2;
		for (int j = 0; j < halfBase; j++) {
			triangle += " ";
		}
		//triangle += writeTriangle(noSpaces);
		//noSpaces += 2;
		//triangle += "\n";
		return triangle;
	}

	public String writeTriangle(int nAst) {
		String triangle = "";
		// int nAst = 1;
		for (int j = 0; j < nAst && nAst <= base; j++) {
			triangle += "*";
		}
		return triangle;
	}

	public static void main(String[] args) {
		
		TriangleAsterics ta = new TriangleAsterics(10);
		System.out.println(ta.buildTriangle());

	}

}
