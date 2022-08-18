package vezbanje17_08_2022;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
//		Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//		Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite N ");
		int n = s.nextInt();
		System.out.print("Unesite karakter ");
		String karakter = s.next();
		stampa(n , karakter);
	}
	public static void stampa(int n , String karakter) {
		for (int i = 0 ; i < n; i++) {
			System.out.print(karakter);
		}
	}
}