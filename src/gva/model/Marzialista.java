package gva.model;

public class Marzialista extends Sportivo
{
	private String cintura;
	private Esibizione esibizione;

	protected Marzialista(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo) 
	{
		super(nome, cognome, eta, sesso, ruolo);
	}
	
	public Marzialista(String nome, String cognome, short eta, Sesso sesso, Ruolo ruolo, String cintura, Esibizione esibizione) 
	{
		super(nome, cognome, eta, sesso, ruolo);
		this.cintura = cintura;
		this.esibizione = esibizione;
		
	}
	
	//------------------------------------------------------------------------------------------------------------------------//
	
	public String getCintura()
	{
		return cintura;
	}

	public void setCintura(String cintura) 
	{
		this.cintura = cintura;
	}
	
	public Esibizione getEsibizione() {
		return esibizione;
	}


	protected void setEsibizione(Esibizione esibizione) {
		this.esibizione = esibizione;
	}
	
	//------------------------------------------------------------------------------------------------------------------------//

	@Override
	public String toString()
	{
		return  "Marzialista{ "              + "\n" +
				"Cintura:     " + cintura    + "\n" +
				"Esibizione:  " + esibizione + "\n" +
				 "} ";
	}

}//fine