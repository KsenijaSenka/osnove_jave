package p17_08_2023;
//Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email  i jmbg korisnika prikazuje u formatu:
//        [Ime] [Prezime] - [JMBG]
//        Broj Tel: [Broj telefona],
//        Email: [Email],

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime =s.next();
        System.out.println("Unesite broj: ");
        String brojTelefona = s.next();
        System.out.println("Unesite email: " );
        String email = s.next();
        System.out.println("Unesite JMBG: ");
        String jmbg = s.next();


        System.out.println(ime + " " + prezime + " - " + jmbg);
       System.out.println("Broj Tel: " + brojTelefona);
       System.out.println("Email: " + email);
    }
}
