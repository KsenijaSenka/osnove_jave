package miniProjekat;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

//**Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dužinu lozinke: ");
        int duzina = s.nextInt();


        System.out.println("Da li želite da sadrži specijalan karakter: ");
        boolean withSpecialCharacter = s.nextBoolean();


        String password = generisiLozinku(duzina, withSpecialCharacter);
        System.out.println("Generisana lozinka: " + password);
    }

    public static String generisiNasumicnoZnak() {
        int intRandom = -1;

        Random rand = new Random();

        ArrayList<String> characters = new ArrayList<>();
        characters.add("a");
        characters.add("b");
        characters.add("c");
        characters.add("d");
        characters.add("e");
        characters.add("f");
        characters.add("g");
        characters.add("h");
        characters.add("w");
        characters.add("x");
        characters.add("y");
        characters.add("z");
        characters.add("0");
        characters.add("1");
        characters.add("2");
        characters.add("3");
        characters.add("4");
        characters.add("5");
        characters.add("6");
        characters.add("7");
        characters.add("8");
        characters.add("9");
        characters.add("A");
        characters.add("B");
        characters.add("C");
        characters.add("D");
        characters.add("E");
        characters.add("F");
        characters.add("G");
        characters.add("H");
        characters.add("W");
        characters.add("X");
        characters.add("Y");
        characters.add("Z");

        for (int i = 1; i < characters.size(); i++) {
            intRandom = rand.nextInt(i);
        }
        return String.valueOf(characters.get(intRandom));
    }

    public static String generisiNasumicnoSpecijalanZnak() {
        ArrayList<String> specialCharacters = new ArrayList<>();
        specialCharacters.add("@");
        specialCharacters.add("#");
        specialCharacters.add("&");
        specialCharacters.add("*");
        specialCharacters.add("!");

        int intRandom = -1;

        Random rand = new Random();
        for (int i = 1; i < specialCharacters.size(); i++) {
            intRandom = rand.nextInt(i);
        }
        return String.valueOf(specialCharacters.get(intRandom));
    }

    public static String generisiLozinku(int n, boolean includeSpecialCharacter) {

        String lozinka = "";

        for (int i = 1; i <= n; i++) {
            if (includeSpecialCharacter == true && i == n) {
                lozinka += generisiNasumicnoSpecijalanZnak();
            } else {

                lozinka += generisiNasumicnoZnak();

            }
        }

        return lozinka;
    }
}

