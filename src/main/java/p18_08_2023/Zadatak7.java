package p18_08_2023;
//Napisati program koji od korisnika ucitava jacinu zvuka
// (od 0 do 10) i stampa slikicu za zvuk sa brojem crtica
// koje je korisnik uneo.

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite jacinu zvuka 0-10");
        int zvuk = s.nextInt();

       // zadatak 7
//        System.out.print("<");
//        for (int i = 0; i < n; i++){
//            System.out.print("|");

        //dopuna zadatka
       // Ukoliko je jacina zvuka 0 stampa se slika </ (simulacija za mute) u sprotnom < | | | (sa brojem crtica jacinom zvuka)

        if (zvuk == 0) {
            System.out.print("</");
        } else {
            System.out.print("<");
            for (int i = 0; i < zvuk; i++) {
                System.out.print("|");
            }
    }
}}
