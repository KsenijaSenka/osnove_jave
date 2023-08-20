package p18_08_2023;
//Napisati program koji stampa 20 pozicija.
//        Za aktivnu poziciju stampa *
//        Za neaktivnu pozciju stampa _
//        Korisnik unosi granice za nekativni opseg, unoseci A i B.

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = s.nextInt();
        System.out.print("Unesite b: ");
        int b = s.nextInt();


        for (int i = 1; i < 21; i++) {

            if (i >= a && i <= b) {
                System.out.print("_");
            } else {
                System.out.print("*");
            }
        }
    }
}






            



