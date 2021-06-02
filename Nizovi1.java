package domaci;

import java.util.Scanner;

public class Nizovi1 {

	public static void main(String[] args) {
		
		/* Napisti program koji sa standardnog ulaza ucitava duzinu i elemente niza koji su tipa int.
Zatim niz proslediti metodi koja treba da proveri da li je niz palindrom ili nije. 
Na standradnom izlazu obavestiti krajnjeg korisnika njemu razumljivim tekstom da li je unesen niz palindrom.
Primer ucitanog niza koji je palindrom: 12 46 17 46 12
Primer ucitanog niza koji nije palindrom: 12 46 17 12 64 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzina = sc.nextInt();
		
		int [] niz = new int[duzina];
		

		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i + 1) + " element niza: ");
			niz[i] = sc.nextInt(); 
		
		}
			
			boolean rezultat = palindrom(niz);
			
			if (rezultat) {
				System.out.println("Uneti niz je palindrom");
			} else {
				System.out.println("Uneti niz nije palindrom");
			}
			
		
	

	}

	public static boolean palindrom (int [] niz) {
		int j = niz.length - 1;
		for (int i = 0; i < niz.length; i++) {
				if (niz[i] != niz[j]) {	
					return false;
				} 	
				j--;
				
		}
		return true;
			} 
	
	}
	

