package gva;

public class Nuotatore extends Sportivo {
	private Stile stile;
	
	public Nuotatore(String nome, String cognome, short eta, Sesso sesso,Ruolo ruolo,Stile stile) {
		super(nome,cognome,eta,sesso,ruolo);
this.stile=stile;
	}

	@Override
	public String toString() {
		return "Nuotatore{}";
	}



}
