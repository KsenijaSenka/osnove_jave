package miniProjekat;

import java.util.Scanner;

//**Zadatak: Zamena Vrednosti u Locust Komandi**
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String komanda = "locust -f $LOCUSTFILE -u $NUMBER_OF_USERS -r $SPAWN_RATE -t $RUN_TIME --headless –host $HOST --html $HTML_FILE";


        while (komanda.contains("$")) {
            System.out.print("Unesite naziv promenljive za zamenu: ");
            String promenljiva = s.next();

            System.out.print("Unesite vrednost: ");
            String vrednost = s.next();

            if (promenljiva.equals("$LOCUSTFILE")) {
                komanda = komanda.replaceAll("\\Q$LOCUSTFILE", vrednost);
                System.out.println("Komanda: " + komanda);
            }
            if (promenljiva.equals("$NUMBER_OF_USERS")) {
                komanda = komanda.replaceAll("\\Q$NUMBER_OF_USERS", vrednost);
                System.out.println("Komanda: " + komanda);
            }
            if (promenljiva.equals("$SPAWN_RATE")) {
                komanda = komanda.replaceAll("\\Q$SPAWN_RATE", vrednost);
                System.out.println("Komanda: " + komanda);
            }
            if (promenljiva.equals("$RUN_TIME")) {
                komanda = komanda.replaceAll("\\Q$RUN_TIME", vrednost);
                System.out.println("Komanda: " + komanda);
            }
            if (promenljiva.equals("$HOST")) {
                komanda = komanda.replaceAll("\\Q$HOST", vrednost);
                System.out.println("Komanda: " + komanda);
            }
            if (promenljiva.equals("$HTML_FILE")) {
                komanda = komanda.replaceAll("\\Q$HTML_FILE", vrednost);
                System.out.println("Komanda: " + komanda);
            }
        }
    }
}
