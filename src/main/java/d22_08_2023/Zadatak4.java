package d22_08_2023;

import java.util.Scanner;

//Napisati program koji od korisnika ucitava brojeve
//        sve dok ne unesu bar dve dvojke ili tri jedinice.
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int brojJedinica = 0;
        int brojDvojki = 0;

        while (brojJedinica < 3 && brojDvojki < 2){
            System.out.print("Unesite broj: ");
            int unetBroj = s.nextInt();
            if (unetBroj == 1) {
                brojJedinica++;
            }
            else if (unetBroj == 2) {
                brojDvojki++;
            }
        }
        System.out.println("Kraj programa.");
    }
}
