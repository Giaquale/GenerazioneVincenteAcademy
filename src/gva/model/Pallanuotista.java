package gva.model;

public class Pallanuotista extends Sportivo{
	
	private short posizione;
	
	public Pallanuotista(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo) {
		super(nome, cognome, eta, sesso, ruolo);
	}

	public int getPosizione() {
		return posizione;
	}

	public void setPosizione(short posizione) throws IncorrectValueException {
		if (posizione < 1 || posizione > 7) {
			throw new IncorrectValueException("Il numero inserito non è quello che voleva Gianluca ::CRINGE::");
		}
		this.posizione = posizione;
	}
	
}
