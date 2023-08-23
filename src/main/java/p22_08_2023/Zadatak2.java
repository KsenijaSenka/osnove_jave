package p22_08_2023;

import java.util.Scanner;

//Napisati program koji od korisnika ucitava brojeve
// sve dok ne unesu dve nule.
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int unetBroj = -1;
        int brojNula = 0;//moze u petlji int unetBroj=...

        while (brojNula < 2) {
            System.out.print("Unesite broj: ");
            unetBroj = s.nextInt();
            if (unetBroj == 0) {
                brojNula++;
            }
        }
        System.out.println("Kraj programa jer su unete dve nule.");


    }
}
