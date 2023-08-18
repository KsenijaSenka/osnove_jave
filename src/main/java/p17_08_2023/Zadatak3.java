package p17_08_2023;
//Napisati program koji sa tastature ucitava tri broja a, b i c i ispisuje srednju vrednost za ta tri broja. Sve promenljive u programu su po tipu double

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {


            Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        double a = s.nextDouble();

        System.out.println("Unesite b: ");
        double b = s.nextDouble();

        System.out.println("Unesite c: ");
        double c = s.nextDouble();

        double avg = (a + b + c)/3;
        System.out.println("Srednja vrednost: " + avg);


    }
}
