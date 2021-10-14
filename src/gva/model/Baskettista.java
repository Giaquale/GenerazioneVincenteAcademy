package gva.model;

public abstract class Baskettista extends Sportivo{
	
	private short posizione;

	public Baskettista(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo) {
		super(nome, cognome, eta, sesso, ruolo);
	}

	public short getPosizione() {
		return posizione;
	}

	public void setPosizione(short posizione) throws IncorrectValueException{
		if (posizione <= 0 || posizione > 5) {
			throw new IncorrectValueException("Valore non valido");
		}
		this.posizione = posizione;
	}

	@Override
	public String toString() {
		return "Baskettista [posizione=" + posizione + ", getPosizione()=" + getPosizione() + ", getNome()=" + getNome()
				+ ", getCognome()=" + getCognome() + ", getEta()=" + getEta() + ", getSesso()=" + getSesso()
				+ ", getRuolo()=" + getRuolo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
