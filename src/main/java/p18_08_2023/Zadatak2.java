package p18_08_2023;
//Napisati program koji ucitava broj a i ispisuje poruke:
//        Ukoliko je broj a do 10 stampamo da je jednocifren broj
//        Ukoliko je broj a do 100 stampamo da je dvocifren broj
//        Ukoliko je broj a veci od 100 stampamo da je trocifren.

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj A");
        int a = s.nextInt();

        if (a < 10) {
            System.out.println("jednocifren broj");
        } else if (a < 100) {
            System.out.println("dvocifren broj");
        } else {
            System.out.println("visecifren broj");
        }
    }
}
