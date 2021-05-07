import java.util.ArrayList;

public class Conto {
	
	private static int numeroConti = 1;
	private int numConto;
	private ArrayList<PiattoPiemontese> elencoPortate = new ArrayList<PiattoPiemontese>();
	
	
	Conto(){
		this.numConto = numeroConti;
		numeroConti++;
	}
	
	public void aggiungiPortataAlConto(PiattoPiemontese...portate) {
		for(PiattoPiemontese portata: portate) {
			elencoPortate.add(portata);
		}
	}
	
	public double totConto() {
		double tot=0;
		for (PiattoPiemontese tmp: elencoPortate) {
			tot+=tmp.getPrezzo();
		}
		return tot;
	}

	@Override
	public String toString() {
		String s="-------------------------------";
		s+="\nCONTO:";
		s+="\nNumero Conto: " + this.numConto + "\n";
		for (PiattoPiemontese tmp: elencoPortate) {
			s+="\n" + tmp.getNomePiatto() + ": " + tmp.getPrezzo();
		}
		s+="\nTotale: " + this.totConto();
		s+="\n-------------------------------";
		return s;
	}
	
	

}
