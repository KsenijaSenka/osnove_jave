package p24_08_2023;
//Napisati program koji u sebi ima definisan niz od 5 broja
// (brojevi su proizvoljni)
// i prikazuje sumu nultog i zadnjeg elementa tog niza.
import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int nultiElement = numbers.get(0);
        int zadnjiElement = 0;
        int suma = 0;

        //int zadnjiElement = numbers.get(4);
        int duzinaNiza = numbers.size();

        zadnjiElement = numbers.get(duzinaNiza - 1);


        suma = nultiElement + zadnjiElement;

        System.out.println("Suma prvog i zadnjeg elementa: " + suma);

    }
}
