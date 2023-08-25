package d24_08_2023;

import java.util.ArrayList;

//Napisati progam koji stampa niz u obrnutom redosledu tj.
// od zadnjeg elementa do nultog.
//Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
public class Zadatak3 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);


        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(numbers.size() - 1 - i) + ", ");

        }

    }

}


