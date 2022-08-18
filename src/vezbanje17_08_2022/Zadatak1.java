package vezbanje17_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati program koji ucitava N brojeva i smesta ih u niz.
//		Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
		Scanner s = new Scanner (System.in);
		ArrayList<Integer> brojevi = new ArrayList();
		System.out.print("Unesite N: ");
		int n = s.nextInt();
		int broj = 0;
		int brojac = 0;
		for (int i = 0; i < n; i ++) {
			System.out.print("Unesite broj: ");
			broj = s.nextInt();
			brojevi.add(broj);
		}
		for (int i = 0 ; i < n ; i++) {
			if (brojevi.get(i) % 2 ==0) {
				brojac++;
			}
		}
		System.out.println("U nizu ima " + brojac + " parna broja.");
	}

}
