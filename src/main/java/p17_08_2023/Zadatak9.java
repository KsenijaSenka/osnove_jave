package p17_08_2023;
//Napisati program za potrebe Makao igrice. Korisnik unosi 4 informacije:
//        znak karte koja je na stolu
//        broj karte koja je na stolu
//        znak karte koju igrac zeli da odigra
//        broj karte koju igrac zeli da odigra
//        i nakon toga se na ekranu ispisuje da li je potez ispravan. Potez je ispravan ukoliko se karta na stolu i odigrana karta poklapaju po znaku ili broju.
//
//        Znakovi karata: srce, kocka, list, detelina
//        Brojevi karata: 2,3,4,5,6,7,8,9,10,A,J,Q,K

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Znak karte koja je na stolu: ");
        String a = s.next();

        System.out.println("Broj karte koja je na stolu: ");
        String b = s.next();

        System.out.println("Znak karte koju zelis da odigras: ");
        String c = s.next();

        System.out.println("Broj karte koju zelis da odigras: ");
        String d = s.next();

        if ((a.equals(c)) || (b.equals(d))){
            System.out.println("Potez je ispravan!");
        }
        else System.out.println("Potez nije ispravan!");

    }
}
