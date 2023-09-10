package p07_09_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Racun a = new Racun();
        a.broj = "5343-39330000-34";
        a.vlasnik = "Pera Peric";
        a.stanje = 45678.99;

        Racun b = new Racun();
        b.broj = "8883-3966969000-34";
        b.vlasnik = "Laza Peric";
        b.stanje = 891678.89;

        System.out.println("Ime prvog korisnika: " + a.vlasnik);
        System.out.println("Broj racuna: " + a.broj);
        System.out.println("Stanje u dinarima: " + a.stanje);

        System.out.println("Ime drugog korisnika: " + b.vlasnik);
        System.out.println("Broj racuna: " + b.broj);
        System.out.println("Stanje u dinarima: " + b.stanje);

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite svotu: ");
        double svota = s.nextDouble();

        a.stanje = a.stanje - svota;
        b.stanje = b.stanje + svota;

        System.out.println("Stanje nakon transakcije: ");
        System.out.println("Sa racuna: " + a.vlasnik);
        System.out.println("Broj racuna: " + a.broj);
        System.out.println("Stanje u dinarima: " + a.stanje);

        System.out.println("Na racun: " + b.vlasnik);
        System.out.println("Broj racuna: " + b.broj);
        System.out.println("Stanje u dinarima: " + b.stanje);

    }
}
