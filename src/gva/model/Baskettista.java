package gva.model;

public abstract class Baskettista extends Sportivo{
	
	private short posizione;

	public Baskettista(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo) {
		super(nome, cognome, eta, sesso, ruolo);
	}

	public short getPosizione() {
		return posizione;
	}

	public void setPosizione(short posizione) {
		if (posizione <= 0 || posizione > 5) {
			System.out.println("IMPOSSIBILE");
		}
		this.posizione = posizione;
	}
	
	
	
}
