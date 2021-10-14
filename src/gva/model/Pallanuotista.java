package gva.model;

public class Pallanuotista extends Sportivo{
	
	private short posizione;
	
	protected Pallanuotista(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo) {
		super(nome, cognome, eta, sesso, ruolo);
	}

	public int getPosizione() {
		return posizione;
	}

	public void setPosizione(short posizione) {
		this.posizione = posizione;
	}
	
}
