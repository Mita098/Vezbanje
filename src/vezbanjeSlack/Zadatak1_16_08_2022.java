package vezbanjeSlack;

import java.util.Scanner;

public class Zadatak1_16_08_2022 {

	public static void main(String[] args) {
//		Napisati metodu za sumiranje dva broja. Metoda prima dva broja, racuna sumu i vraca sracunatu vrednost.
//		U glavnom programu iskoristiti metodu za sumiranje za racunanje sledece formule
//		a = proizvoljno
//		b = proizvoljno
//		c = proizvoljno
//		x = 10 + a + b + c
//		U glavnom programu gde god vam je potrebno da izvrsite operaciju + vi izvrsite to preko metode za sumiranje
//		Hint u threadu, pa ko hoce moze da pogleda
		Scanner s = new Scanner (System.in);
		System.out.print("unesite A: ");
		int a = s.nextInt();
		System.out.print("unesite B: ");
		int b = s.nextInt();		
		System.out.print("unesite C: ");
		int c = s.nextInt();
		int x = sumiranje(a , b);
		x = sumiranje (x , c);
		x = sumiranje (x , 10);
		System.out.println("rezultat sumiranje je: " + x);
	}
	public static int sumiranje(int a, int b) {
		return a + b;
	}
}
