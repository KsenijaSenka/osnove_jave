package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji ucitava N brojeva
// koje smesta u niz i NA KRAJU programa ih stampa.
//Potrebne su dve petlje, u jednoj se desava ucitavanje niza
//        a u drugoj stampanje.
public class Zadatak9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Double> numbers = new ArrayList<>();

        System.out.print("Unesite N: ");
        int n=s.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
             double broj=s.nextDouble();
            numbers.add(broj);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+ ", ");

        }

    }
}
