package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji u sebi ima definisan niz od 10 broja
// (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K.
// K i novu vrednost unosi korisnik.
public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite poziciju 0-9: ");
        int k = s.nextInt();

        System.out.println("Unesite novu vrednost: ");
        int noviBroj = s.nextInt();
        numbers.set(k, noviBroj);

        System.out.print("Na poziciji " + k + " je nova vrednost " +
                noviBroj + ".");
    }

}
