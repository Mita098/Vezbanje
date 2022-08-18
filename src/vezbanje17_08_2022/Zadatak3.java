package vezbanje17_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//		Napisati program koji ucitava niz A duzine N i broj X.
//		Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
		Scanner s = new Scanner (System.in);
		ArrayList<Integer> A = new ArrayList();
		System.out.print("Unesite N: ");
		int n = s.nextInt();
		int broj = 0;
		String brojac = "";
		for (int i = 0 ; i < n ; i++ ) {
			System.out.print("Unesite broj: ");
			broj = s.nextInt();
			A.add(broj);
		
		}
		System.out.print("Unesite X: ");
		int x = s.nextInt();
		
		for(int i = 0; i < n ; i ++) {
			if (A.get(i)==x) {
				brojac = brojac + i + ", ";
			}
		}
		System.out.println("Elementi niza A koji su jednaki broju X imaju indekse: " + brojac);
	
	}

}
