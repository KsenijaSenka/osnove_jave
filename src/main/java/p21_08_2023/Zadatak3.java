package p21_08_2023;
//Napisati program koji od brojeva od 1 do 10 formira string
//        tako da se na pocetnu vrednost stringa … (tri tacke)
//        sa leve strane dodaju neparni brojevi a sa desne parni.

public class Zadatak3 {
    public static void main(String[] args) {
        String spoj = "...";

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                spoj = spoj + i;
            }
            if (i % 2 != 0) {
                spoj = i + spoj;
                //ovo je ok, Milan uradio sa else umesto ovog uslova
            }

        }

        System.out.println(spoj);
    }
}
