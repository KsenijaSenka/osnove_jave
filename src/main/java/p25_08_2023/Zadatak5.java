package p25_08_2023;
//Napisati metodu koja stampa N zvezdica u istom redu,
// na kraju reda stampa novi red..
// Broj zvezdica je odredjen parametrom N.
//(DOPUNA)
//        Napisati main program koji koristi kreiranu metodu
//        tako da stampa sledecu sliku za M. M unosi korisnik.

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        stampaZvezde(5);
//        stampaZvezde(9);
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite M: ");
        int m = s.nextInt();

        for (int i = 1; i <= m; i++) {
            stampaZvezde(i);
        }
    }

    public static void stampaZvezde(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");

        }
        System.out.println();

    }
}
