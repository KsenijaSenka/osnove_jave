package p24_08_2023;

import java.util.ArrayList;

//Napisati program koji u sebi ima definisan niz od 5 broja
// (brojevi su proizvoljni) i koji
// zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
public class Zadatak3 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int prviVrednost = numbers.get(0);
       // int indexZadnjiElement = numbers.size() - 1;

        int zadnjiVrednost = numbers.get(numbers.size() - 1);

        numbers.set(0, zadnjiVrednost);
        numbers.set(numbers.size() - 1, prviVrednost);
//

//        System.out.println("nova vrednost na 1. poziciji je: "
//                + zadnjiVrednost);
//        System.out.println("nova vrednost na zadnjoj poziciji je: "
//                + prviVrednost);
    }

}
