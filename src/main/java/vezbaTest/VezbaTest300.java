package vezbaTest;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji simulira pretragu “IT Bootcamp” na guglu. Program cuva rezultate
//pretrage kao niz podataka (pogledaj link).
public class VezbaTest300 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        

        ArrayList<String> rezultati = new ArrayList<>();
        rezultati.add("ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp");
        rezultati.add("Prijava - Beograd - ITBootcamp");
        rezultati.add("IT Bootcamp kursevi");
        rezultati.add("IT Bootcamp - Education - Belgrade, Serbia - 1 Review - 342 ...");
        rezultati.add("IT Bootcamp - Образовање - Belgrade, Serbia - 1 утисак ");

        System.out.println("Unesite stranu: ");
        int strana=s.nextInt();
        System.out.println("Unesite broj rezultata po strani: ");
int brojRezultata=s.nextInt();
        for (int i = 0; i < rezultati.size() ; i++) {
String rezultat=rezultati.get(i);

        }
    }
}