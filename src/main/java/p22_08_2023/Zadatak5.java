package p22_08_2023;

import java.util.Scanner;

//Napisati program koji simulira ponasanje jednog test case-a.
//        Test case ima 5 provera, a program validira jednu po jednu proveru
//        sve dok ne proveri sve ili dok neka provera ne failuje.
public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean hasError = false;
        String errorMessage = "";
        int i = 0;


        while (!hasError && i < 5) {
            System.out.print("Unesite expected: ");
            String expected = s.next();
            System.out.print("Unesite actual: ");
            String actual = s.next();

            if (!actual.equals(expected)) {
                hasError = true;
                errorMessage = "Expected" + expected +
                        " but got " + actual;
            }
            i++;


        }
        if (hasError) {
            System.out.println("test failed " + errorMessage);

        } else {
            System.out.println("test passed");
        }
        //        while (expected.equals(actual) && counter < 5) {
//            System.out.print("Unesite expected: ");
//            expected = s.next();
//            System.out.print("Unesite actual: ");
//            actual = s.next();
//            counter++;
//        }


//        if (!expected.equals(actual)) {
//           System.out.println("Test failed: Expected " + expected +
//                   " but got " + actual);
//        } else {
//            System.out.println("Test passed.");
//        }

    }
}
