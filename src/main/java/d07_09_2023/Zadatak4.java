package d07_09_2023;

import java.util.Scanner;

//U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature.
// Ispisati informacije o filmovima.
public class Zadatak4 {
    public static void main(String[] args) {

        Film film1 = new Film();

        Film film2 = new Film();


        System.out.println("Unesite prvi film na spisak za gledanje: ");
        Scanner s = new Scanner(System.in);
        film1.naslov = s.next();
        System.out.println("Unesite god. izdanja.");
        film1.godinaIzdanja = s.nextInt();
        System.out.println("Unesite rezisera: ");
        film1.reziser = s.next();

        System.out.println("Unesite drugi film na spisak za gledanje: ");
        film2.naslov = s.next();
        System.out.println("Unesite god. izdanja.");
        film2.godinaIzdanja = s.nextInt();
        System.out.println("Unesite rezisera: ");
        film2.reziser = s.next();

        System.out.println("Prvi film: " + film1.naslov);
        System.out.println("Izasao: " + film1.godinaIzdanja);
        System.out.println("Reziser: " + film1.reziser);

        System.out.println("Drugi film: " + film2.naslov);
        System.out.println("Izasao: " + film2.godinaIzdanja);
        System.out.println("Reziser: " + film2.reziser);

    }
}
