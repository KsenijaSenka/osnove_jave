package miniProjekat;
//**Zadatak: Simulacija iscrtavanja korisnika na Slacku**
//
//        Napišite program koji simulira prikazivanje korisnika
//        na Slacku.
//        Prikaz korisnika treba da se izvede tako da prvo budu
//        prikazani aktivni korisnici, a potom neaktivni.

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak2 {
    public static void main(String[] args) {

        ArrayList<String> users = new ArrayList<>();
        ArrayList<Boolean> activityInfo = new ArrayList<>();

        users.add("Pera Peric");
        users.add("Darko Darkovic");
        users.add("Marko Markovic");
        users.add("Stefan Stefanovic");
        users.add("Uros Urosevic");
        users.add("Milan Milanovic");

        activityInfo.add(true);
        activityInfo.add(true);
        activityInfo.add(false);
        activityInfo.add(true);
        activityInfo.add(false);
        activityInfo.add(false);


        for (int i = 0; i < users.size(); i++) {

            boolean isActive = activityInfo.get(i);

            if (isActive == true) {

                System.out.println("| slika |o " + users.get(i));
            }


        }
        for (int i = 0; i < users.size(); i++) {
            boolean isActive = activityInfo.get(i);
            if (isActive == false) {
                System.out.println("| slika |x " + users.get(i));
            }

        }
    }
}
