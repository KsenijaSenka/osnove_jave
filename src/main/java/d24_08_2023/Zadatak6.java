package d24_08_2023;

import java.util.ArrayList;

//Napisati program koji vrsi proveru linkova sa stranice.
// Program cuva 3 niza:
//niz linkova
//niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
//niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)
public class Zadatak6 {
    public static void main(String[] args) {
        ArrayList<String> links = new ArrayList<>();
        ArrayList<String> expectedCodes = new ArrayList<>();
        ArrayList<String> actualCodes = new ArrayList<>();

        links.add("https://cms.demo.katalon.com/cart/");
        links.add("https://cms.demo.katalon.com/shop/");
        links.add("https://cms.demo.katalon.com/account/");
        links.add("https://cms.demo.katalon.com/sample-page/");
        links.add("https://cms.demo.katalon.com/test/");

        expectedCodes.add("200");
        expectedCodes.add("200");
        expectedCodes.add("404");
        expectedCodes.add("204");
        expectedCodes.add("200");

        actualCodes.add("200");
        actualCodes.add("200");
        actualCodes.add("400");
        actualCodes.add("200");
        actualCodes.add("404");

        for (int i = 0; i < links.size(); i++) {
            if (!expectedCodes.get(i).equals((actualCodes.get(i)))) {
                System.out.println("Assertion Error: Link " +
                        links.get(i) + " expected status code " +
                        expectedCodes.get(i) + " but got " + actualCodes.get(i));

            }
        }
    }
}
