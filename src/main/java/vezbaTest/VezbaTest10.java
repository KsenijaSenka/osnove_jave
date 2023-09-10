package vezbaTest;

import java.util.Scanner;

//Napisati program koji za unetu visinu i težinu osobe računa indeks telesne
//mase (BMI) i na osnovu tog rezultata osobu raspoređuje u jednu od četiri kategorije
public class VezbaTest10 {
    public static void main(String[] args) {
        System.out.println("Unesite tezinu osobe (kg): ");
        Scanner s = new Scanner(System.in);
        double tezina = s.nextDouble();
        System.out.println("Unesite visinu osobe (m): ");
        double visina = s.nextDouble();
        String kategorija = "";
        double bmi = tezina / (visina * visina);
        if (bmi < 18.5) {
            kategorija = "Neuhranjenost";
        } else if (18.5 <= bmi && bmi <= 24.99) {
            kategorija = "Normalna tezina";
        } else if (25 <= bmi && bmi <= 29.99) {
            kategorija = "Prekomerna tezina";
        } else if (bmi >= 30) {
            kategorija = "Gojaznost";
        }
        System.out.println("Kategorija je " + kategorija);
    }
}
