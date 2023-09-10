package vezbaTest;

import java.util.ArrayList;
import java.util.Scanner;

//Za potrebe loto igre na srecu, potrebno je napisati program koja ispisuje informaciju da li
//je odigrana loto kombinacija upravo dobitna kombinacija.
public class VezbaTest30 {
    public static void main(String[] args) {
//        ArrayList<Integer> odigrana = new ArrayList<>();
//
//        ArrayList<Integer> izvucena = new ArrayList<>();

        boolean jeLiDobitna=true;
        //int i = 0;
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> odigrani = new ArrayList<>();
//
        ArrayList<Integer> izvuceni = new ArrayList<>();

       System.out.println("Unesite odigranu kombinaciju: ");


       for (int i = 0; i < 7; i++) {
           int broj = s.nextInt();
            odigrani.add(broj);
        }
        System.out.println("Unesite izvucenu kombinaciju: ");
        for (int i = 0; i < 7; i++) {
            int broj = s.nextInt();
           izvuceni.add(broj);}

//        if (odigrani.get(i - 1) == izvuceni.get(i - 1)) {
//            jeLiDobitna = true;
//        } else {
//           jeLiDobitna = false;
//        }
//        while (jeLiDobitna == true) {
//            int broj = s.nextInt();
//            izvuceni.add(broj);
        for (int i = 0; i < 7; i++) {


            if ((odigrani.get(i)!=izvuceni.get(i))) {
                jeLiDobitna=false;

            }
        if (jeLiDobitna == true) {
          System.out.println("Jeste dobitna kombinacija");
       } else {
            System.out.println("Nije dobitna kombinacija");
        }
       }}}



