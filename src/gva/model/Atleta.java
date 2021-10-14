package gva.model;

public class Atleta extends Sportivo{

	Stile stile;
	protected Atleta(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo, Stile stile ) {
		super(nome, cognome, eta, sesso, ruolo);
		this.stile = stile;
		
		
	}
	
	

}
