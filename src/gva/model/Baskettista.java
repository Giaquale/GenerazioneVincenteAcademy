package gva.model;

public abstract class Baskettista extends Sportivo{

	public Baskettista(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo) {
		super(nome, cognome, eta, sesso, ruolo);
	}
	
	public String toString() {
		return "Giocatore di Basket{}";
	}
	
}
