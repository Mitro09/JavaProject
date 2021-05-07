package esercizioAnniBisestile;

public class Anno {
	
	private int n_anno;
	private Boolean bisestile;
	
	Anno(int anno){
		this.n_anno = anno;
		this.bisestile = this.calcoloBisestile();
	}
	
	
	public Boolean calcoloBisestile() {
		if(this.n_anno % 4 == 0 && this.n_anno % 100 != 0) {
			return true;
		}
		else if(this.n_anno % 400 == 0){
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public String toString() {
		String bis;
		if(this.bisestile) {
			bis = "è bisestile";
		}
		else {
			bis = "non è bisestile";
		}
		return "L'anno " + n_anno + " " + bis+"\n";
	}

}
