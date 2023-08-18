package p17_08_2023;
//Napisati program koji ucitava brojeve a, b i c sa tastature i za svaki broj proverava da li je validan. Ukoliko broj nije validan, ispisuje se greska za svaki broj.
//        Broj nije validan ukoliko je broj negativan.

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();

        System.out.println("Unesite b: ");
        int b = s.nextInt();

        System.out.println("Unesite c: ");
        int c = s.nextInt();

if (a < 0){
    System.out.println("Unet broj A=" + a + " nije validan");
}
    if (b < 0){
        System.out.println("Unet broj B=" + b + " nije validan");}

    if (c < 0)
    {System.out.println("Unet broj C=" + c + " nije validan");}
}
    }

