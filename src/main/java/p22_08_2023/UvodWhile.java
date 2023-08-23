package p22_08_2023;

import java.util.Scanner;

public class UvodWhile {
    public static void main(String[] args) {
//       za ovo bismo koristili for petlju
//       int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
    //}
        Scanner s = new Scanner(System.in);
        int broj = -1;//razlicit od 0, da bi uopste usao u petlju

        while (broj != 0) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();

            System.out.println("Uneli ste broj: "+ broj);

        }
        System.out.println("kraj");

    }
}
