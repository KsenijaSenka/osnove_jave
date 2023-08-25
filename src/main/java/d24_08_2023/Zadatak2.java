package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji ucitava N brojeva i smesta ih u niz.
// Zatim, iz niza,
// broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int brojParnih = 0;
        int broj = 0;
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            numbers.add(broj);
        }

        for (i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                brojParnih++;
            }

        }
        System.out.print("U nizu ima " + brojParnih + " parnih brojeva");


    }
}
