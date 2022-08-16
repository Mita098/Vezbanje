package proba1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati program koji simulira iscrtavanje bookmarkova u Google Chrome-u prilikom resajzovanja aplikacije.
//		(Pogledaj video)
//		Koliko ce se bookmarkova iscrtati zavisi od sirine pretrazivaca.
//		Sirina jednog bookmarka je broj karaktera u nazivu bookmarka.
//		Izmedju svaka dva bookmarka postoji razmak od 5 karaktera.
//		Sirina svih bookmarkova ne sme da predje sirinu pretrazivaca,
//		racunajuci i razmake izmedju bookmarkova
//		Niz bookmarkova na pocetku programa definisati fiksno (ne unosi ih korisnik) 
//		a zatim iscrtati bookmarkove na stranici u zavisnosti od sirine pretrazivaca.
        Scanner s = new Scanner(System.in);
		ArrayList<String> bookmarks = new ArrayList<>();
        bookmarks.add("Apps");
        bookmarks.add("YouTube");
        bookmarks.add("Google");
        bookmarks.add("Gmail");
        bookmarks.add("Miro | Online Whiteboard for Visual Collaboration");
        bookmarks.add("Confluence");
        bookmarks.add("JIRA");
        bookmarks.add("Bitbucket");
        bookmarks.add("Google Calendar");
        bookmarks.add("Timesheet");
        bookmarks.add("Google Drive");
        bookmarks.add("IX CIKLUS");

        String rez = "";
        System.out.print("Unesite sirinu pretrazivaca: ");
        int sirina = s.nextInt();

        for (int i = 0; rez.length() + bookmarks.get(i).length()<= sirina; i ++) {
        	rez = rez + bookmarks.get(i) + "     ";
        	System.out.print(bookmarks.get(i) + "     ");
        	if(sirina > 193) {
        		sirina = 193;
        	}
        }

	}

}
