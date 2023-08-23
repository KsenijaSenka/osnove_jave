package d22_08_2023;

import java.util.Scanner;

//Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost
// sve dok se ne unese nula.
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int unetBroj = -1;

        while (unetBroj != 0) {
            System.out.print("Unesite broj: ");
            unetBroj = s.nextInt();
            int apsolutnaVrednostNegativnog = -unetBroj;
            if (unetBroj < 0) {
                System.out.println("Apsolutna vrednost je: " + apsolutnaVrednostNegativnog);
            } else {
                System.out.println("Apsolutna vrednost je: " + unetBroj);
            }

        }
        System.out.println("Kraj programa jer je uneta nula.");
    }
}
