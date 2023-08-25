package p24_08_2023;

import java.util.ArrayList;

//Napisati program koji u sebi ima definisan niz od 5 broja
// (brojevi su proizvoljni) i
// menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
public class Zadatak2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int trecaPozicijaVrednost = numbers.get(3);
        trecaPozicijaVrednost = 10 * trecaPozicijaVrednost;
        numbers.set(3, trecaPozicijaVrednost);

        //System.out.println("nova vrednost na 4. poziciji je: " +
        //                trecaPozicijaVrednost);


        //numbers.set(3, numbers.get(3)*10); krace resenje


    }
}
