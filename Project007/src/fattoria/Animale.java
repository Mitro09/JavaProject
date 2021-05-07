package fattoria;

public class Animale {
	
	private String nome;
	private String verso;
	private String verso2;
	
	Animale(String nome){
		this.nome = nome;
	}

	public String getVerso() {
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}

	public String getVerso2() {
		return verso2;
	}

	public void setVerso2(String verso2) {
		this.verso2 = verso2;
	}

	public void verso() {
		if(this.getVerso() == null) {
			System.out.println("Verso!");
		}
		else {
			System.out.println(this.getVerso()+"!");
		}
	}
	
	public void verso2() {
		if(this.getVerso2() == null) {
			System.out.println("Verso2!");
		}
		else {
			System.out.println(this.getVerso2()+"!");
		}
	}

}
