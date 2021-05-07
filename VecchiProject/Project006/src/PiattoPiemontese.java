import java.util.ArrayList;

public class PiattoPiemontese {
	
	private String nome;
	private double prezzo;
	private ArrayList<String> listaIngredienti = new ArrayList<String>();
	double tot=0;
	
	
	PiattoPiemontese(String nome,double prezzo){
		this.nome = nome;
		this.prezzo = prezzo;
	}
	
	
	
	public void aggiungiIngredienti(String...ing) {
		for (String ingrediente: ing) {
			listaIngredienti.add(ingrediente);
		}
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}
	
	public String getNomePiatto() {
		return this.nome;
	}
	
	public ArrayList<String> getIngredienti(){
		return this.listaIngredienti;
	}
	
	
	public void parlamiDelPiatto() {
		String s = nome.toUpperCase()+": €"+prezzo+"\n";
		s += listaIngredienti+"\n";
		s += this.descrizionePiatto();
		System.out.println(s);
		
	}
	
	
	public String descrizionePiatto() {
		String s="";
		switch(nome.toLowerCase()) {
		case "agnolotti":
			s += "Descrizione: Gli agnolotti sono il tipico primo piatto della cucina Piemontese e rappresentano una ricetta conosciuta ed apprezzata non solo in Italia, ma anche all’estero per la sua bontà e semplicità.";
		
		case "bagna_caoda":
			s += "Descrizione: La bagna caoda o bagna cauda è una preparazione tipica del Piemonte preparata con acciughe, olio e aglio ed utilizzata come intingolo per le verdure fresche della stagione autunnale.";
			
		case "bonet":
			s += "Descrizione: Il bonèt, tipico dolce al cucchiaio di origine piemontese, ottimo per chiudere in dolcezza il pasto.";
			
		case "bollito_misto":
			s += "Descrizione: Il bollito misto è un ottimo piatto unico tipico della gastronomia piemontese, una variante del semplice bollito, una marea di salse!";
			
		default :
			s += "Non lo conosco, è buono?";
		}
		return s;
		
	}

}
