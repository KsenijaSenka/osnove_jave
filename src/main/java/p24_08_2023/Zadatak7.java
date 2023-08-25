package p24_08_2023;

import java.util.ArrayList;

//Napisati program koji simulira digitalni meni za pasta bar.
// Program ima dva niza informacija paste i cene.
// Program stampa meni u formatu
//naziv paste ………………………….cena rsd
public class Zadatak7 {
    public static void main(String[] args) {
        ArrayList<String> paste = new ArrayList<>();
        paste.add("AGLIO E OLIO");
        paste.add("PRIMAVERA");
        paste.add("ARRABBIATA");
        paste.add("NAPOLITANA");
        paste.add("POLLO E SPINACI");

        ArrayList<Integer> cene = new ArrayList<>();
        cene.add(500);
        cene.add(340);
        cene.add(420);
        cene.add(440);
        cene.add(550);

        for (int i = 0; i < paste.size(); i++) {
//            String pasta = paste.get(i);
//            int cena = cene.get(i);
            //ne mora ovo gore, odmah moze da se ubaci u print:
            System.out.println(paste.get(i) + "............." +
                    cene.get(i) + " rsd");

        //String pasta = "";
       // int cena = 0;
//        int i, j;
//        for (i = 0; i < paste.size(); i++) {
//            pasta = paste.get(i);
//            for (j = 0; j < cene.size(); j++) {
//                cena = cene.get(j);
//                if (i == j) {
//                    System.out.println(pasta + "..........." + cena
//                            + " rsd");
//                }
//
//            }
//        }


        }
    }
}
