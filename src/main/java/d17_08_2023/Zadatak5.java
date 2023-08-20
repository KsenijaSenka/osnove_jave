package d17_08_2023;

import java.util.Scanner;

//Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = s.nextInt();

        System.out.print("Unesite b: ");
        int b = s.nextInt();

        System.out.print("Unesite operator: ");
        String operator = s.next();

        int rezultat = 0;


        if (operator.equals("+")) {
            rezultat = a + b;

        }
        if (operator.equals("-")) {
            rezultat = a - b;

        }
        if (operator.equals("*")) {
            rezultat = a * b;

        }
        if (operator.equals("/")) {
            rezultat = a / b;

        }

        System.out.println("Rezultat: " + rezultat);
    }
}
