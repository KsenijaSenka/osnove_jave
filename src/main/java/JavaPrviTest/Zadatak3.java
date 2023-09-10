package JavaPrviTest;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int n = 0;
        int unetBroj = -1;
        int broj = -1;
        while (n < 5 || unetBroj != broj) {
            System.out.print("Unesite broj: ");
            broj = rand.nextInt();
            n += n;
            if (unetBroj < broj) {
                System.out.println("Tajni broj je veći");

            } else if (unetBroj > broj) {
                System.out.println("Tajni broj je manji.");
            }
        }
        if (unetBroj == broj) {
            System.out.println("Čestitamo, pogodili ste tajni broj!");
        }
        if (n == 5) {
            System.out.println("Kraj igre! Niste pogodili tajni broj u 5 pokušaja.");
        }
    }
}
