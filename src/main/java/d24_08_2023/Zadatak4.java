package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A
// stampa sve elemente niza koji su veci od nule.
public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        int broj = 0;
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            numbers.add(broj);
        }
        System.out.print("Brojevi veci od nule u nizu A su: ");
        for (i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0) {
                System.out.print(numbers.get(i) + ", ");

            }

        }

    }
}
