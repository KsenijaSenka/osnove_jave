package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa
// treba ispisati indekse onih clanova niza koji su jednaki broju X.
public class Zadatak5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        int broj = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            numbers.add(broj);
        }
        System.out.print("Unesite X: ");
        int x = s.nextInt();
        System.out.print("Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == x) {
                System.out.print(i + ", ");
            }
        }
    }
}
