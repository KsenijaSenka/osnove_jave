package JavaPrviTest;


import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite kriterijume za traženje vašeg idealnog muškarca.");

        System.out.print("Minimalna visina: ");
        int minVisina = s.nextInt();
        System.out.print("Maksimalna visina: ");
        int maxVisina = s.nextInt();
        System.out.print("Mesto: ");
        String mesto = s.next();
        System.out.print("Minimalna starost: ");
        int minStarost = s.nextInt();
        System.out.print("Maksimalna starost: ");
        int maxStarost = s.nextInt();
        System.out.print("Boja kose: ");
        String boja = s.next();
        System.out.print("Potrebno je da ima bradu: ");
        boolean imaBradu = s.nextBoolean();

        System.out.println("Unesite karakteristike muškarca:");


        System.out.print("Visina: ");
        int visina = s.nextInt();

        System.out.print("Mesto: ");
        String mestoPrebivalista = s.next();
        System.out.print("Starost: ");
        int starost = s.nextInt();

        System.out.print("Boja kose: ");
        String bojaKose = s.next();
        System.out.print("Nosi bradu: ");
        boolean saBradom = s.nextBoolean();
        int brojKriterijuma = 0;


        if (minVisina <= visina && visina <= maxVisina) {
            brojKriterijuma++;
        }
        if (mestoPrebivalista.equals(mesto)) {
            brojKriterijuma++;
        }
        if (minStarost <= starost && starost <= maxVisina) {
            brojKriterijuma++;
        }
        if (bojaKose.equals(boja)) {
            brojKriterijuma++;
        }
        if (imaBradu == saBradom) {
            brojKriterijuma++;
        }

        if (brojKriterijuma >= 3) {
            System.out.println("Pronašli ste svog idealnog muškarca!");
        } else {
            System.out.println("Muškarac ne ispunjava vaše zahteve.");
        }
    }
}