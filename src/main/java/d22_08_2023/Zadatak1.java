package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean isGreaterThanHundred = false;
        String errorMessage = "";
        int suma = 0;

        while (!isGreaterThanHundred) {
            System.out.print("Unesite vrednost: ");
            int broj = s.nextInt();

            if (suma + broj > 100) {
                isGreaterThanHundred = true;
                errorMessage =
                        "Prekoracenje! Kraj programa. Sracunata suma je " + suma + ".";
            }
            suma = suma + broj;

        }
        if (isGreaterThanHundred) {
            System.out.println(errorMessage);


        }
        }
    }
