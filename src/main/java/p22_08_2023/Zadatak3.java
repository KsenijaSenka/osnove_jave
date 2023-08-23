package p22_08_2023;

import java.util.Scanner;

//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu
// makar po jedan broj od 1 do 4.
public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int brojJedinica = 0;
        int brojDvojki = 0;
        int brojTrojki = 0;
        int brojCetvorki = 0;

        while (brojJedinica < 1 || brojDvojki < 1 || brojTrojki < 1 || brojCetvorki < 1) {
            System.out.print("Unesite broj: ");
           int unetBroj = s.nextInt();
            if (unetBroj == 1) {
                brojJedinica++;
            }
            else if (unetBroj == 2) {
                brojDvojki++;
            }
            else if (unetBroj == 3) {
                brojTrojki++;
            }
            else if (unetBroj == 4) {
                brojCetvorki++;
            }

        }
        System.out.println("Kraj programa.");
    }
}
