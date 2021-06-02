package domaci;

import java.util.Scanner;

public class Nizovi2 {

	public static void main(String[] args) {
	
		/* 
Napisati program koji izracunava proizvod elemenata niza tipa int,  
koji su veci od njihovog indeksa. Za unos niza i za proizvod koristiti zasebno metode. 
Duzina niza i unos niza ucitavaju se sa standardnog ulaza.
Primer ucitanog niza: 3 7 1 4 2 5
Primer izracunatog proizvoda: 84 */


		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzina = sc.nextInt();
		
		int [] niz = new int[duzina];
	
	    for (int i = 0; i < duzina; i++) {
		System.out.println("Unesite " + (i + 1) + " element niza: ");
		niz[i] = sc.nextInt();
		
		
	}
	    
	    int rezultat = mnozenje(niz);
	    System.out.println("Trazeni proizvod iznosi: " + rezultat);
}

public static int mnozenje (int [] nizic) {
int proizvod = 1;
	for (int i = 0; i < nizic.length; i++) {
		if (nizic[i] > i) {
			proizvod = nizic[i] * proizvod;
		}
	}
         return proizvod;
}
      
}
