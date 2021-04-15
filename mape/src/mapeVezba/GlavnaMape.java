package mapeVezba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

import model.Osoba;

public class GlavnaMape {

	public static void main(String[] args) {
		
 
		
		
		Osoba osoba1 = new Osoba();
		     osoba1.setIme("Nenad");
		     osoba1.setPrezime("Cvijanovic");
		     osoba1.setJmbg("02393874652");
		Osoba osoba2 = new Osoba("Pera","Zdera","8237649231");
		Osoba osoba3 = new Osoba("Pcelica","Maja","1233459231");
		
		List<Osoba> listaOsoba = new ArrayList<Osoba>();
		   listaOsoba.add(osoba1); 
		   listaOsoba.add(osoba2);
		   
		   try {
			   System.out.println(listaOsoba.get(3).getIme());
		   }catch (Exception e) {
			   System.out.println("Nije dobar broj!");
		   }
		   
		   System.out.println(listaOsoba.get(1).getIme());
		   
		   Map<String, String> mapaImena = new HashMap<String, String>() ; // inicijalizacija mape
		   mapaImena.put("a1", "Nenad");
		   mapaImena.put("s2", "Pera");
		   mapaImena.put("m3", "Maja");
		   
		   System.out.println("Ime osobe je: " + mapaImena.get("s2"));
		   
		   // mapa koja nam vraca na osnovu jmbg
		   
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Unesite jmbg: ");
		   
		   String trazeniJMBG = scanner.nextLine();
		   Map<String, Osoba> mapaOsoba = new HashMap<String, Osoba>();
		        mapaOsoba.put(osoba1.getJmbg(), osoba1);
		        mapaOsoba.put(osoba2.getJmbg(), osoba2);
		        mapaOsoba.put(osoba3.getJmbg(), osoba3);
		        
		        Osoba trazenaOsoba = mapaOsoba.get(trazeniJMBG);
		        if(trazenaOsoba != null) {
		        	System.out.println("Osoba: " + trazenaOsoba.getPrezime() + " " + trazenaOsoba.getIme() );
		        }else {
		        	System.out.println("Ne postoji taj kljuc!");
		        }
		        
		
		
		
		
		
		// pozdrav za GIT!
		
		
	}

}
