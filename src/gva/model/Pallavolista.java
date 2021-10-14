package gva.model;

public class Pallavolista extends Sportivo {
	
	private Posizione posizione;
	private short numero;

	public Pallavolista(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo,Posizione posizione,short numero) {
		super(nome, cognome, eta, sesso, ruolo);
		this.posizione = posizione;
		this.numero = numero;
	}
	

	public short getNumero() {
		return numero;
	}


	public void setNumero(short numero) {
		this.numero = numero;
	}
	
	

	public Posizione getPosizione() {
		return posizione;
	}


	public void setPosizione(Posizione posizione) {
		this.posizione = posizione;
	}


	@Override
	public String toString() {
		return "Pallavolista {}";
	}
	
}

