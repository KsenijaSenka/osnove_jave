package p21_08_2023;
//Napisati program koji od korisnika ucitava N brojeva
// i ispisuje koliko je parnih brojeva uneo korisnik.
// N nam kaze koliko broja ce korisnik da unese.

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int brojParnih = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj % 2 == 0) {
                brojParnih = brojParnih + 1;
            }
        }
        System.out.println("Uneto je " + brojParnih + " parna broja.");
    }
}
