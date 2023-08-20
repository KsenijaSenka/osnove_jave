package p18_08_2023;
//Napisati program koji ispisuje za uneti broj a
//        da li je deljiv sa 2 ili sa 3.
//        Ispisati poruke na kraju programa u obe situacije.

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj A");
        int a = s.nextInt();

        if (a % 2 == 0) {
            System.out.println("Broj je deljiv sa 2.");
        }  if (a % 3 == 0) {
            System.out.println("Broj je deljiv sa 3.");
        }
//        else {
//            System.out.println("Broj nije deljiv ni sa 2 ni sa 3.");
//        }
    }
}
