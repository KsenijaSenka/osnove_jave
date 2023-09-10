package vezbaTest;

import java.util.Scanner;

//Napisati program koji validira unos lozinke sve dok korisnik ne unese validnu.
//Lozinka je validna ukoliko ima minimum 8 karaktera i sadrzi bar jedan od dva
//specijalna karaktera a specijalni karakteri su @ i #
public class VezbaTest3 {
    public static void main(String[] args) {
        String lozinka = "";

        System.out.print("Unesite lozinku: ");
        String errorMessage = "Lozinka nije validna";

        while (!(lozinka.contains("@") || lozinka.contains("#"))
                || lozinka.length() < 8) {

            Scanner s = new Scanner(System.in);
            lozinka = s.next();

            if (!(lozinka.contains("@") || lozinka.contains("#"))
                    || lozinka.length() < 8) {
                System.out.println(errorMessage);
            }


            if (lozinka.contains("@") || lozinka.contains("#") && lozinka.length() >= 8) {
                System.out.println("Lozinka je validna");
            }
        }

    }
}
