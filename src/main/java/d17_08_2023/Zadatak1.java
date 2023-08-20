package d17_08_2023;
//Napisati program koji ima informacije koje ucitava informacije sa tastature:
//        Ime
//        Prezime
//        godinu rodjenja
//        I stampa informaicije u formatu:
//        [ime] [prezime] - [startost] god

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ime:");
        String ime = s.next();

        System.out.println("Prezime:");
        String prezime = s.next();

        System.out.println("Godina rodjenja");
        int godinaRodjenja = s.nextInt();

        int starost = 2023 - godinaRodjenja;

        System.out.println(ime + " " + prezime + " - " + starost + " god");
    }
}
