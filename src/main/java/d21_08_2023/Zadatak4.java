package d21_08_2023;
//Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//        like
//        smile
//        heart

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int brojLike = 0;
        int brojHeart = 0;
        int brojSmile = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("Reaguj: ");
            String reakcija = s.next();
            if (reakcija.equals("like")) {
                //System.out.print(reakcija);

                brojLike++;
            } else if (reakcija.equals("smile")) {
                //System.out.print(reakcija);

                brojSmile++;
            } else if (reakcija.equals("heart")) {
                //System.out.print(reakcija);
                brojHeart++;
            }

        }
        System.out.println("Summary: like " + brojLike + " | smile " + brojSmile +
                " | heart " + brojHeart);

    }
}
