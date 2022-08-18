package vezbanje17_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
//		Napisati program koji ucitava niz stringova duzine N,
//		tako da ucitavanje elemenata u niz a bude obrnuto. 

		Scanner s = new Scanner (System.in);
		ArrayList<String> A = new ArrayList<String>();
		System.out.print("Unesite N: ");
		int n = s.nextInt();
		for (int i = 0 ; i < n; i++) {
			A.add("");
		}
		for(int i = n - 1 ; i >= 0; i--) {
			System.out.print("Unesite String: ");
			String z = s.next();
			A.set(i, z);
	}
		System.out.print("Niz A:");
		for(int i = 0 ; i < n; i++) {
			System.out.print(A.get(i) + ", ");
		}
}
}