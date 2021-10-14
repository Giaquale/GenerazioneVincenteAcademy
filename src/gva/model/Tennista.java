package gva.model;

public class Tennista extends Sportivo {
	private Mano mano;

	public Tennista(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo, Mano mano) {
		super(nome, cognome, eta, sesso, ruolo);
		this.mano = mano;
		
	}

	public Mano getMano() {
		return mano;
	}

	protected void setMano(Mano mano) {
		this.mano = mano;
	}

	@Override
	public String toString() {
		return "Tennista [mano=" + mano + ", getMano()=" + getMano() + ", getNome()=" + getNome() + ", getCognome()="
				+ getCognome() + ", getEta()=" + getEta() + ", getSesso()=" + getSesso() + ", getRuolo()=" + getRuolo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
