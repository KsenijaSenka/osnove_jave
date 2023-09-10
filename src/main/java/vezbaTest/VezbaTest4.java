package vezbaTest;

import java.util.Scanner;

//Napisati metodu koja vrsi konverziju metara u cm, dm, km. Metoda kao parametre
//prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju
public class VezbaTest4 {
    public static void main(String[] args) {
        System.out.print("Unesite vrednost ");
        Scanner s = new Scanner(System.in);
        double vred = s.nextDouble();
        System.out.print("Unesite jedinicu ");
        String jed = s.next();
        double novi = konvertuj(vred, jed);
        System.out.println(vred+"m je "+novi+jed);
    }
    public static double konvertuj (double vrednost, String novaJedinica ){
        double novaVrednost=0;
        if (novaJedinica.equals("cm")) {
           novaVrednost=vrednost*100;}else if(novaJedinica.equals("dm")){
           novaVrednost=vrednost*10;} else if (novaJedinica.equals("km")) {
            novaVrednost=vrednost*0.001;
        }return novaVrednost;
    }
    }

