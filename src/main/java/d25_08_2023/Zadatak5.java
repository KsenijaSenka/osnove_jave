package d25_08_2023;

import java.util.Scanner;
//Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB)
     //   a vraca konvertovanu vrednost.
public class Zadatak5 {
    public static void main(String[] args) {

        double konvertovanaVrednost = konvertuj(10, "USD");
        System.out.println(konvertovanaVrednost);
    }

    public static double konvertuj(double vrednost, String valuta) {
        if (valuta.equals("RSD")) {
            return vrednost * 117.5;
        } else if (valuta.equals("USD")) {
            return vrednost * 1.1;
        } else if (valuta.equals("RUB")) {
            return vrednost * 62.98;
        } else return 0;
    }
}

