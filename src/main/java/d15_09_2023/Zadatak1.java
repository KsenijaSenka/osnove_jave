package d15_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

//glavni program za klase Osoba, Trener,Igrac
public class Zadatak1 {
    public static void main(String[] args) {
        Igrac igrac1 = new Igrac("Nikola", "Djokic", 2012, "0909012345678", 4, "levi bek", true);
        Igrac igrac2 = new Igrac("Djoko", "Ristic", 2011, "0812011567876", 5, "levo krilo", false);

        Trener trener1 = new Trener("Petar", "Mitic", "2002000345234", 2000, 1, "pomocni");
        Trener trener2 = new Trener("Janko", "Mitic", "0202988676677", 1988, 9, "kondicioni");

        igrac1.stampaj();
        igrac2.stampaj();
        trener1.stampaj();
        trener2.stampaj();

        ArrayList<Igrac> igraci = new ArrayList<>();
        ArrayList<Trener> treneri = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Unesite podatke o novom igracu.");
            System.out.println("Unesite ime: ");
            String ime = s.next();
            System.out.println("Unesite prezime: ");
            String prezime = s.next();
            System.out.println("Unesite jmbg igraca: ");
            String jmbg = s.next();
            System.out.println("Unesite godinu rodjenja igraca: ");
            int godinaRodjenja = s.nextInt();
            System.out.println("Unesite broj na dresu igraca: ");
            int broj = s.nextInt();
            System.out.println("Unesite poziciju igraca: ");
            String pozicija = s.next();
            System.out.println("Da li je igrac kapiten? ");
            boolean kapiten = s.nextBoolean();
            igraci.add(new Igrac(ime, prezime, godinaRodjenja, jmbg, broj, pozicija, kapiten));
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Unesite podatke o novom treneru: ");
            System.out.print("Unesite ime trenera: ");
            String ime = s.next();
            System.out.print("Unesite prezime trenera: ");
            String prezime = s.next();
            System.out.print("Unesite jmbg trenera: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja trenera: ");
            int godinaRodjenja = s.nextInt();
            System.out.print("Unesite godine iskustva trenera: ");
            int godineIskustva = s.nextInt();
            System.out.print("Unesite tip trenera: ");
            String tip = s.next();
            treneri.add(new Trener(ime, prezime, jmbg, godinaRodjenja, godineIskustva, tip));
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampaj();
            System.out.println();
        }


        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();
            System.out.println();
        }
    }
}
