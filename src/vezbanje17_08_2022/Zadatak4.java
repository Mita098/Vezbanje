package vezbanje17_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
//		(Za vezbanje) Napisati program koji ucitava niz a duzine N.
//		Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//		a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)

		Scanner s = new Scanner (System.in);
		ArrayList <Integer> A = new ArrayList<Integer>();
		System.out.print("Unesite N: ");
		int n = s.nextInt();
		int broj = 0;
		for (int i = 0 ; i < n ; i ++) {
			System.out.print("Unesite broj: ");
			broj = s.nextInt();
			A.add(broj);
		
		}
		 ArrayList <Integer> B = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++) {
			if(i < 3) {
				B.add(A.get(i));
			}else {
				B.add(1);
			}
		}
		System.out.print("Niz A: ");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(A.get(i) + ", ");
		}
		System.out.println();
		System.out.print("Niz B: ");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(B.get(i) + ", ");
		}
	}

}
