package eserciziodadi;

public class Dado {

	public int risultato;
	public int lanci;
	public int[] tot_result = new int[11];

	public static int n_lanci;
	public static int uno;
	public static int due;
	public static int tre;
	public static int quattro;
	public static int cinque;
	public static int sei;
	public static int sette;
	public static int otto;
	public static int nove;
	public static int dieci;
	public static int undici;
	public static int dodici;

	Dado() {

	}

	public void lancio() {
		n_lanci++;
		int valore1 = (int) (Math.random() * 6 + 1);
		int valore2 = (int) (Math.random() * 6 + 1);
		this.risultato = valore1 + valore2;
		switch (valore1) {

		case 1:
			System.out.println("LANCIO " + n_lanci);
			System.out.println("*******\r\n" + "*     *\r\n" + "*  o  *\r\n" + "*     *\r\n" + "*******\r\n");
			
			this.lanci++;
			break;

		case 2:
			System.out.println("LANCIO " + n_lanci);
			System.out.println("*******\r\n" + "* o   *\r\n" + "*     *\r\n" + "*   o *\r\n" + "*******\r\n");
			
			this.lanci++;
			break;

		case 3:
			System.out.println("LANCIO " + n_lanci);
			System.out.println("*******\r\n" + "* o   *\r\n" + "*  o  *\r\n" + "*   o *\r\n" + "*******\r\n");
			
			this.lanci++;
			break;

		case 4:
			System.out.println("LANCIO " + n_lanci);
			System.out.println("*******\r\n" + "* o o *\r\n" + "*     *\r\n" + "* o o *\r\n" + "*******\r\n");
			
			this.lanci++;
			break;

		case 5:
			System.out.println("LANCIO " + n_lanci);
			System.out.println("*******\r\n" + "* o o *\r\n" + "*  o  *\r\n" + "* o o *\r\n" + "*******\r\n");
			
			this.lanci++;
			break;

		case 6:
			System.out.println("LANCIO " + n_lanci);
			System.out.println("*******\r\n" + "* o o *\r\n" + "* o o *\r\n" + "* o o *\r\n" + "*******\r\n");
			
			this.lanci++;
			break;
		}

		switch (valore2) {

		case 1:
			System.out.println("LANCIO " + n_lanci);
			System.out.println("*******\r\n" + "*     *\r\n" + "*  o  *\r\n" + "*     *\r\n" + "*******\r\n");
			
			break;

		case 2:
			System.out.println("LANCIO " + n_lanci);
			System.out.println("*******\r\n" + "* o   *\r\n" + "*     *\r\n" + "*   o *\r\n" + "*******\r\n");
			
			break;

		case 3:
			System.out.println("LANCIO " + n_lanci);
			System.out.println("*******\r\n" + "* o   *\r\n" + "*  o  *\r\n" + "*   o *\r\n" + "*******\r\n");
			break;

		case 4:
			System.out.println("LANCIO " + n_lanci);
			System.out.println("*******\r\n" + "* o o *\r\n" + "*     *\r\n" + "* o o *\r\n" + "*******\r\n");
			break;

		case 5:
			System.out.println("LANCIO " + n_lanci);
			System.out.println("*******\r\n" + "* o o *\r\n" + "*  o  *\r\n" + "* o o *\r\n" + "*******\r\n");
			break;

		case 6:
			System.out.println("LANCIO " + n_lanci);
			System.out.println("*******\r\n" + "* o o *\r\n" + "* o o *\r\n" + "* o o *\r\n" + "*******\r\n");
			break;
		}

		switch (this.risultato) {

		case 2:
			due++;
			this.tot_result[0]++;
			break;
			

		case 3:
			tre++;
			this.tot_result[1]++;
			break;

		case 4:
			quattro++;
			this.tot_result[2]++;
			break;

		case 5:
			cinque++;
			this.tot_result[3]++;
			break;

		case 6:
			sei++;
			this.tot_result[4]++;
			break;

		case 7:
			sette++;
			this.tot_result[5]++;
			break;

		case 8:
			otto++;
			this.tot_result[6]++;
			break;

		case 9:
			nove++;
			this.tot_result[7]++;
			break;

		case 10:
			dieci++;
			this.tot_result[8]++;
			break;
			
		case 11:
			undici++;
			this.tot_result[9]++;
			break;
			
		case 12:
			dodici++;
			this.tot_result[10]++;
			break;
		}
	}

}
