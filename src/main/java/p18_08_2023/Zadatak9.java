package p18_08_2023;

import java.util.Scanner;

//Napisati program koji od korisnika ucitava 2 cela broja A i B .
// Program stampa sve brojeve od 1 do 10 osim brojeva A i B.
// Smatramo da korisnik unosi vrednosti od 1 do 10 za A i B vrednosti.
public class Zadatak9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj A");
        int a = s.nextInt();
        System.out.println("Unesite broj B");
        int b = s.nextInt();

        //

        for ( int i = 0; i < 11; i++) {
            if ( i != a && i != b){
            System.out.print(i + ", ");
        }
            //else {...print("_")}

        }

    }
}
