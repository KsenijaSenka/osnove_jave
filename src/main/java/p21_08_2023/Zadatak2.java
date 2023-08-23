package p21_08_2023;
//Napisati program koji od brojeva od 1 do 10
// formira string koji ima spoj svih brojeva.
public class Zadatak2 {
    public static void main(String[] args) {
        String spoj = "";
//ovde je takav primer, ali moze da ima i neku pocetnu vrednost


        for (int i = 1; i < 11; i++) {
            spoj = spoj + i;

        }
        System.out.println("String je " + spoj);
    }
}
