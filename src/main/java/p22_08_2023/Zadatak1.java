package p22_08_2023;

import java.util.Scanner;

//Napisati program koji validira unos input polja za broj.
// Polje za unos prima samo brojeve u opsegu od 10 do 50.
// Korisnik unosi vrednosti dok ne unese validan  broj.
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int broj = -1;

        while (broj < 10 || broj > 50) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();

            if (broj < 10 || broj > 50) {
                System.out.println("Greska: Broj nije u opsegu od 10 do 50.");
            }
        }

        System.out.println("Kraj");
    }
}
