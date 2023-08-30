package p25_08_2023;

import java.util.Enumeration;

//Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
// Metoda prima broj N i vraca ga sa negativnom vrednoscu.
public class Zadatak6 {
    public static void main(String[] args) {
        int m = negative(10);
        System.out.println(m);
    }

    public static int negative(int number) {

        int x = -1 * number;
        return x;
    }
}
