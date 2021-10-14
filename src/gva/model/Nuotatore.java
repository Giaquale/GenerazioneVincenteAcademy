package gva.model;

public class Nuotatore extends Sportivo {
	private StileNuoto stile;
	
	public Nuotatore(String nome, String cognome, short eta, Sesso sesso,Ruolo ruolo, StileNuoto stile) {
		super(nome,cognome,eta,sesso,ruolo);
		this.stile=stile;
	}
	
	
	public StileNuoto getStile() {
		return stile;
	}



	public void setStile(StileNuoto stile) {
		this.stile = stile;
	}

	@Override
	public String toString() {
		return "Nuotatore{}";
	}

}
