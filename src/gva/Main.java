package gva;

import java.util.LinkedList;

import gva.model.Rugbista;
import gva.model.Ruolo;
import gva.model.Sesso;
import gva.model.Sportivo;

public class Main {
    public static void main(String[] args) {
    	LinkedList<Sportivo> eta = new LinkedList<>();
    	System.out.println("VALE' HAI VIST!");
    	
    	LinkedList<Sesso> generi = new LinkedList<>();
    	
    	Rugbista r = new Rugbista("Carmine", "Cinquegrana", (short)27, Sesso.M, Ruolo.ATTACCO); 
    }
}
