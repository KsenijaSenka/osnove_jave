package d22_08_2023;

import java.util.Scanner;

//Napisati program koji ucitava RIMSKE brojeva od korisnika
// i na ekranu ispisuje arapsku vrednost
// sve dok korisnik ne unese KRAJ.
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rimskiBroj = "";

        while (!rimskiBroj.equals("KRAJ")) {
            System.out.print("Unesite rimski broj: ");
            rimskiBroj = s.next();


            if (rimskiBroj.equals("I")) {

                System.out.println("Arapski: 1");
            }
            else if (rimskiBroj.equals("V")) {

                System.out.println("Arapski: 5");
            }
            else if (rimskiBroj.equals("X")) {

                System.out.println("Arapski: 10");
            }
            else if (rimskiBroj.equals("L")) {

                System.out.println("Arapski: 50");
            }
            else if (rimskiBroj.equals("C")) {

                System.out.println("Arapski: 100");
            }
            else if (rimskiBroj.equals("D")) {
                System.out.println("Arapski: 500");

            }
            else if (rimskiBroj.equals("M")) {
                System.out.println("Arapski: 1000");

            }


        }
        if (rimskiBroj.equals("KRAJ")) {
            System.out.println("Kraj programa.");

        }
    }
}
