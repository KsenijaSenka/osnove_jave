package p17_08_2023;

import java.util.Scanner;

public class UvodGrananje {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("pocetak");
        System.out.println("unesite x: ");
        int x = s.nextInt();

        System.out.println("unesite y: ");
        int y = s.nextInt();


        if (x > y) {
            System.out.println("x is greater than y");
        }
        System.out.println("kraj");
    }
}
