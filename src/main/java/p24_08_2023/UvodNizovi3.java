package p24_08_2023;

import java.util.ArrayList;

public class UvodNizovi3 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); //index 0
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);  //index 5 numbers.size() i<6

        //System.out.println(numbers); istampa niz ali format je String

        for (int i = 0; i < numbers.size(); i++) {
            int x = numbers.get(i);
            System.out.print(x + ", ");


        }

    }
}
