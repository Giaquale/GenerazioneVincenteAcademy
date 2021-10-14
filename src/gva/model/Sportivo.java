package gva.model;

public abstract class Sportivo {
	private String nome;
	private String cognome;
	private short eta;
	private Sesso sesso;
	private Ruolo ruolo;
	
	protected Sportivo(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.sesso = sesso;
		this.ruolo = ruolo;
	}


	public String getNome() {
		return nome;
	}


	protected void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	protected void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public short getEta() {
		return eta;
	}


	protected void setEta(short eta) {
		this.eta = eta;
	}


	public Sesso getSesso() {
		return sesso;
	}


	protected void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}


	public Ruolo getRuolo() {
		return ruolo;
	}


	protected void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}


	@Override
	public String toString() {
		return "Sportivo [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", sesso=" + sesso + ", ruolo="
				+ ruolo + ", getNome()=" + getNome() + ", getCognome()=" + getCognome() + ", getEta()=" + getEta()
				+ ", getSesso()=" + getSesso() + ", getRuolo()=" + getRuolo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
