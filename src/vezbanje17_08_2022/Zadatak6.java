package vezbanje17_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		
//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//		Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
		Scanner s = new Scanner (System.in);
		System.out.print("Unesite A: ");
		int a = s.nextInt();		
		stampajVrednostZa10Vecu(a);
		a = s.nextInt();
		stampajVrednostZa10Vecu(a);

	
	}
	public static void stampajVrednostZa10Vecu(int a ) {
		System.out.println("vrednost uvecana za 10 je: " + (a + 10));
	}
	
	
}
