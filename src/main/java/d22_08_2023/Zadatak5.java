package d22_08_2023;

import java.util.Scanner;

//Napisati program koji proverava uparenost zagrada.
// Korisnik unosi matematicku formulu sve dok ne unese znak =.
// Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String znak = "";
        int brojOtvorenihZagrada = 0;
        int brojZatvorenihZagrada = 0;

        while (!znak.equals("=")) {
            System.out.print("Unos: ");
            znak = s.next();
            if (znak.equals("(")) {
                brojOtvorenihZagrada++;
            }
            if (znak.equals(")")) {
                brojZatvorenihZagrada++;
            }

        }


        if (brojOtvorenihZagrada == brojZatvorenihZagrada) {
            System.out.println("Zagrade su uparene");
        } else {
            System.out.println("Zagrade nisu uparene.");
        }
    }
}

