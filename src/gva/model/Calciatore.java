package gva.model;

public class Calciatore extends Sportivo {
	private short numMaglia;
	private boolean isMancino;
	
	public Calciatore(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo, short numMaglia, boolean isMancino) {
		super(nome, cognome, eta, sesso, ruolo);
		this.numMaglia = numMaglia;
		this.isMancino = isMancino;		
	}

	public short getNumMaglia() {
		return numMaglia;
	}

	protected void setNumMaglia(short numMaglia) throws IncorrectValueException{
		if (numMaglia < 0 || numMaglia > 99) {
			throw new IncorrectValueException("Valore non valido");
		}
		this.numMaglia = numMaglia;
	}

	public boolean isMancino() {
		return isMancino;
	}

	protected void setMancino(boolean isMancino) {
		this.isMancino = isMancino;
	}

	@Override
	public String toString() {
		return super.toString() + "Calciatore {numMaglia=" + numMaglia + ", isMancino=" + isMancino + "}";
	}
}
