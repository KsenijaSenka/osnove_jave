package vezbaTest;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji učitava brojeve od korisnika dok ne unese dve nule
//zaredom.Na kraju programa ispisati sumu unetih brojeva
public class VezbaTest20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int unetBroj = -1;
        int brojNula = 0;
        int suma = 0;
boolean dveNule=false;

        ArrayList<Integer> brojevi = new ArrayList<>();
int i=0;
//        for (int i = 1; i <=7; i++) {
        //    System.out.print("Unesite broj: ");
          //int unetBroj = s.nextInt();
//
//            brojevi.add(unetBroj);


//
//            if (dveNule){suma += unetBroj;
//                System.out.println("Suma je " + suma);
////            if (brojevi.get(i) == 0){
////
////                brojNula++;
////            i=brojNula;}
////            suma += unetBroj;
////                if (brojevi.get(i)==0){System.out.println("Suma je " + suma);}
//
//        }
//    }
//        }}
//

        while (!dveNule) {
            System.out.print("Unesite broj: ");
            int unetBroj = s.nextInt();

            brojevi.add(unetBroj);
            int prethodni=brojevi.get(i-1);
            int trenutni =brojevi.get(i);
            suma += unetBroj;
        if (prethodni==0 && trenutni==0){
            dveNule=true;}else {dveNule=false;}}
//ovo dole nije dobro
 /*
            for (int i = 1; i < brojevi.size(); i++) {
                if (brojevi.get(i-1) == 0 && brojevi.get(i)==0){
                    brojNula++;}}
                    //if (0 == brojevi.get(i - 1)) {
                        if (brojNula == 2) {
                            System.out.println("Suma je " + suma);
                        }
*/


        }
    }


