package d17_08_2023;
//Napisati program koji simulira izvrsenja test case-a za
// redirekciju nakon uspesnog logovanja na sistem.
// Program sa tastature ucitava actual url stranice, expected url stranice i kod o gresci koja treba da se prikaze ukoliko actual stranica nije kao sto je ocekivano.

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter actual url: ");
        String actualUrl = s.next();

        System.out.print("Enter expected url: ");
        String expectedUrl = s.next();

        System.out.print("Enter error code: ");
        String errorCode = s.next();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("1 Test passed.");
        }
        if (!actualUrl.equals(expectedUrl)) {
            System.out.println("Assertion Error: Expected " + expectedUrl +
                    " but got " + actualUrl + ", error code:  " + errorCode);
        }
    }
}
