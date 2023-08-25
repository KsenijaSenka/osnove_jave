package p24_08_2023;

import java.util.ArrayList;

//Napisati program koji u sebi ima definisan niz od 5 broja
// (brojevi su proizvoljni)
// i racuna i stampa sumu svih brojeva niza.
public class Zadatak5 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int suma = 0;

        for (int i = 0; i < numbers.size(); i++) {
            //int x = numbers.get(i); suma=suma+x;
            suma = suma + numbers.get(i);
        }
        System.out.print("Suma = " + suma);
    }
}
