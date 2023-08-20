package d18_08_2023;

import java.util.Scanner;

//Napisati program koji za uneti broj x (smatrajte da korisnik unosi jednocifreni broj) ispisuje tablicu mnozenja za taj broj. Resiti for petljom.
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite x: ");
        int x = s.nextInt();
        int product = 0;

        for (int i = 1; i < 10; i++) {
            product = i * x;
            System.out.println(x + " x " + i + " = " + product);
        }

    }
}
