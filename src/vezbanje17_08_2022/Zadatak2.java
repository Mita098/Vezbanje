package vezbanje17_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati program koji ucitava niz A duzine N,
//		i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
		ArrayList<Integer> A = new ArrayList();
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite N: ");
		int n = s.nextInt();
		int broj = 0;
		String brojac = "";
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Unesite broj: ");
			broj = s.nextInt();
			A.add(broj);
		}
		for (int i = 0 ; i < n ; i++) {
			if(A.get(i) > 0) {
				brojac = brojac + A.get(i) + ", ";
			}
		}
		System.out.println("Brojevi veci od nule u nizu A su: " + brojac);
		
		
		
	}

}
