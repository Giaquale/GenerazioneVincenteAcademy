package gva.model;

public class Atleta extends Sportivo{

	private StileAtletica stile;
	
	protected Atleta(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo, StileAtletica stile ) {
		super(nome, cognome, eta, sesso, ruolo);
		this.stile = stile;
	}
	
	public StileAtletica getStile() {
		return stile;
	}
	
	public void setStile(StileAtletica stile) {
		this.stile = stile;
	}

	@Override
	public String toString() {
		return "Atleta [stile=" + stile + ", getStile()=" + getStile() + ", getNome()=" + getNome() + ", getCognome()="
				+ getCognome() + ", getEta()=" + getEta() + ", getSesso()=" + getSesso() + ", getRuolo()=" + getRuolo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
