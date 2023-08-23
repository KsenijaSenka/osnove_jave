package p21_08_2023;
//Napisati program koji od korisnika ucitava N brojeva
// i ispisuje sumu tih brojeva. N nam kaze koliko broja ce korisnik da unese.

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            suma = suma + broj;

        }
        System.out.println("Suma je: " + suma);
    }
}
