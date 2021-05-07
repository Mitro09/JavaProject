import java.util.ArrayList;

public class MenuPiemontese {
	
	
	private ArrayList<PiattoPiemontese> menuPiatti = new ArrayList<PiattoPiemontese>();
	
	
	public void aggiungiPiatto(PiattoPiemontese...piatti) {
		for(PiattoPiemontese piatto: piatti) {
			menuPiatti.add(piatto);
		}
	}


	@Override
	public String toString() {
		String s = "*********************************\n";
		s += "********MENU DELL'OSTERIA********\n";
		s += "*********************************\n";
		
		for (PiattoPiemontese tmp : menuPiatti) {
			s+="\n" + tmp.getNomePiatto().toUpperCase() + ": €" + tmp.getPrezzo();
			s+="\n" + tmp.getIngredienti();
			s+="\n" + tmp.descrizionePiatto() + "\n";
		}
		return s;
		
	}
}
