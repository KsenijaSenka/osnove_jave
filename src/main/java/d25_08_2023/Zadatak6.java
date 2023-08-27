package d25_08_2023;

import java.util.Scanner;

//Napisati funkciju koja pronalazi
// koliko ima celih brojeve izmedju brojeva M i N.
public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unestite 2 broja");
        int x1 = s.nextInt();
        int x2 = s.nextInt();
        int brojCelih = izbroj(x1, x2);
        System.out.println("Između unetih brojeva ima " + brojCelih +
                " celih brojeva ");

        //for (int i = x1 + 1; i < x2; i++) {
           // System.out.print(i + ", ");}
    }

    public static int izbroj(int m, int n) {
        return n - m - 1;
    }
}
