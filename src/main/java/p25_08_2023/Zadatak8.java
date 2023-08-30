package p25_08_2023;
//Napisati metodu koja vrsi konverziju
// rimske(string) u arapske brojeve(int).
public class Zadatak8 {
    public static void main(String[] args) {

        int x=(prikaziArapski("V"));
        System.out.println(x);
        int y=(prikaziArapski("string"));
        System.out.println(y);
    }

    public static int prikaziArapski(String rimskiBroj) {
        int arapski=0;
        if (rimskiBroj.equals("I")) {
            arapski= 1;
        } else if (rimskiBroj.equals("II")) {
            arapski= 2;
        } else if (rimskiBroj.equals("III")) {
            arapski= 3;
        } else if (rimskiBroj.equals("IV")) {
            arapski= 4;
        } else if (rimskiBroj.equals("V")) {
            arapski= 5;
        }
            return arapski;
        }
    }


