package mapeVezba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import model.Osoba;

public class GlavnaMape {

	public static void main(String[] args) {
		
 
		
		
		Osoba osoba1 = new Osoba();
		     osoba1.setIme("Nenad");
		     osoba1.setPrezime("Cvijanovic");
		     osoba1.setJmbg("02393874652");
		Osoba osoba2 = new Osoba("Pera","Zdera","8237649231");
		
		List<Osoba> listaOsoba = new ArrayList<Osoba>();
		   listaOsoba.add(osoba1); 
		   listaOsoba.add(osoba2);
		   
		   System.out.println(listaOsoba.get(1).getIme());
		   
		   Map<String, String> mapaImena = new HashMap<String, String>() ; // inicijalizacija mape
		   mapaImena.put("a1", "Nenad");
		   mapaImena.put("s2", "Pera");
		   mapaImena.put("m3", "Maja");
		   
		   System.out.println("Ime osobe je: " + mapaImena.get("s2"));
		
		
		
		
		
		// pozdrav za GIT!
		
		
	}

}
