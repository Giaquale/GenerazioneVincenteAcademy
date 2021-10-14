package gva.model;

public class Pugile extends Sportivo{

	private boolean isDestrorso;
	
	public Pugile(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo, boolean isDestrorso) {
		super(nome, cognome, eta, sesso, ruolo);
		this.isDestrorso = isDestrorso;
	}

	
	public boolean isDestrorso() {
		return isDestrorso;
	}

	public void setDestrorso(boolean isDestrorso) {
		this.isDestrorso = isDestrorso;
	}


	@Override
	public String toString() {
		return "Pugile [isDestrorso=" + isDestrorso + "]";
	}

	
	
	
	
	
}
