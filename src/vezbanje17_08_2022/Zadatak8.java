package vezbanje17_08_2022;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
//		Napisati funkciju koja za dva jednocifrena broja koja su ulazni
//		parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//		ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//		ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
		int a = 2;
		int b = 6;
		System.out.println(metoda(a,b));
		
		
		
}
	public static int metoda(int a , int b) {
		return Integer.parseInt(a + "" + b);
	}
}