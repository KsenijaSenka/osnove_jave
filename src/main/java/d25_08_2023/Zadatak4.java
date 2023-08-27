package d25_08_2023;

import java.util.Scanner;

//Metoda prima dva parametra N i karakter za stampu.
// Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/)
// stampa se / / / / /
public class Zadatak4 {
    public static void main(String[] args) {
        stampaNKaraktera(6, "%");
    }

    public static void stampaNKaraktera(int n, String karakter) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite željeni broj karaktera: ");
        n = s.nextInt();
        System.out.print("Unesite karakter: ");
        karakter = s.next();
        for (int i = 0; i < n; i++) {
            System.out.print(karakter);

        }

    }
}
