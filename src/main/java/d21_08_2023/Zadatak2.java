package d21_08_2023;

import java.util.Scanner;

//Napisati program koji ucitava N brojeva od korisnika
// i sabira samo trocifrene brojeve
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 1; i < n + 1; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if (broj > 99 && broj < 1000) {
                suma = suma + broj;
            }
        }
        System.out.println("Suma je: " + suma);
    }
}
