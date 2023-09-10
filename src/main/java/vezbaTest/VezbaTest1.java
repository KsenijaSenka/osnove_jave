package vezbaTest;

import java.util.Scanner;

//Napisati program koji simulira notifikaciju za novu verziju aplikacije. Korisnik unosi
//verziju aplikacije koju ima instaliranu na svom racunaru a zatim najnoviju verziju,
//nakon cega se ispisuje notifikacija
public class VezbaTest1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite major verziju instalirane aplikacije: ");
        int majorInstalirane = s.nextInt();
        System.out.println("Unesite minor verziju instalirane aplikacije: ");
        int minorInstalirane = s.nextInt();
        System.out.println("Unesite major verziju najnovije aplikacije: ");
        int majorNajnovije = s.nextInt();
        System.out.println("Unesite minor verziju najnovije aplikacije: ");
        int minorNajnovije = s.nextInt();
        if (majorInstalirane == majorNajnovije) {
            if (minorInstalirane < minorNajnovije) {
                System.out.println("Nova verzija aplikacije je dostupna za instalaciju.");
            } else if (minorInstalirane == minorNajnovije) {
                System.out.println("Vec imate najnoviju verziju na svom racunaru.");
            }
        } else if (majorInstalirane < majorNajnovije) {
            System.out.println("Nova verzija aplikacije je dostupna za instalaciju.");
        }

    }
}
