package p21_08_2023;

import java.util.Scanner;

//Napisati program koji sakriva uneti password..
public class Zadatak10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite password: ");
        String password = s.next();
        int length = password.length();
        //ovo moze i u for petlji
        //String skriveniPassword = "";

        //iznad petlje print"skriveni password: "
        for (int i = 0; i < length; i++) {
            System.out.print("*");


            //skriveniPassword = skriveniPassword + "*";

        }
        //System.out.println("Skriveni password: " + skriveniPassword);
    }

}
