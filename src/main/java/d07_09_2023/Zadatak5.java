package d07_09_2023;

import java.util.Scanner;

// U glavnoj metodi kreirajte 3 objekta ove klase i
// postavite im vrednosti unosom sa tasture.
// Ispisati informacije o opremi.
public class Zadatak5 {
    public static void main(String[] args) {
        Oprema oprema1 = new Oprema();
        Oprema oprema2 = new Oprema();
        Oprema oprema3 = new Oprema();

        Scanner s = new Scanner(System.in);

        System.out.println("Karakteristike opreme, prvi artikal:");
        oprema1.tip = s.next();
        System.out.println("Unesite marku:");
        oprema1.marka = s.next();
        System.out.println("Unesite cenu: ");
        oprema1.cena = s.nextDouble();
        System.out.println("Karakteristike opreme, drugi artikal:");
        oprema2.tip = s.next();
        System.out.println("Unesite marku:");
        oprema2.marka = s.next();
        System.out.println("Unesite cenu: ");
        oprema2.cena = s.nextDouble();
        System.out.println("Karakteristike opreme, treci artikal:");
        oprema3.tip = s.next();
        System.out.println("Unesite marku:");
        oprema3.marka = s.next();
        System.out.println("Unesite cenu: ");
        oprema3.cena = s.nextDouble();

        System.out.print("U opremu koju poredimo spadaju: " + oprema1.tip + ", " +
                oprema2.tip + " i " + oprema3.tip + ", cije su marke, redom, " +
                oprema1.marka + ", " + oprema2.marka + " i " + oprema3.marka + ", a cene: " +
                oprema1.cena + ", " + oprema2.cena + " i " + oprema3.cena + ".");


    }
}
