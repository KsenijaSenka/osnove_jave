package miniProjekat;

import java.util.Scanner;

//**Zadatak: Simulacija skidanja tekstualnog fajla**
//Napišite program koji simulira proces skidanja tekstualnog fajla.
// Skidanje fajla se obavlja u paketima od po 5 karaktera.
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite veličinu fajla: ");
        int n = s.nextInt();
        String sumaPaket = "";
        int brojPaketa = n / 5;

        for (int i = 1; i <= brojPaketa; i++) {
            System.out.println("Unesite paket: ");
            String paket = s.next();
            double skinutDeo = 1.0 * i * (paket.length() * 100) / n;
            double ukupanSkinutDeo = 0;
            ukupanSkinutDeo = ukupanSkinutDeo + skinutDeo;
            sumaPaket = sumaPaket + paket;

            System.out.println("Skinuto: " + ukupanSkinutDeo + " %");
            if (i == brojPaketa) {
                if (!(n % 5 == 0)) {
                    System.out.println("Unesite paket: ");
                    paket = s.next();
                    skinutDeo = 1.0 * (paket.length() * 100) / n;
                    ukupanSkinutDeo = ukupanSkinutDeo + skinutDeo;
                    System.out.println("Skinuto: " + ukupanSkinutDeo + " %");

                    sumaPaket = sumaPaket + paket;
                }
            }
        }
        System.out.println("Sadržaj fajla je: " + sumaPaket);
    }
}
