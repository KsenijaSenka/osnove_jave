package JavaPrviTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int duzina = 0;
        double kabel = 0;
        int rastojanje=-1;
        ArrayList<Integer> duzine = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite rastojanje: ");
            rastojanje = s.nextInt();
            duzine.add(i);
            if (rastojanje < 50 || rastojanje > 100) {
                System.out.println("Rastojanje na poziciji " + i + ", duzine " +
                        rastojanje + "m nije po standardima Evropske unije."
                );
            } else {
                duzina = rastojanje + duzina;
                kabel = 1.5 * duzina;
            }

        }
        for (int i = 0; i < n; i++) {
           String rastojanja= String.valueOf(duzine.get(i));

        System.out.print("| …"+rastojanje);
        }
        System.out.println();
        System.out.println("Potrebna dužina kablova za dalekovodnu infrastrukturu je " +
                kabel);
    }
}
