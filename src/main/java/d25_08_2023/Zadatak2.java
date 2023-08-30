package d25_08_2023;
//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
// vraca novu vrednost koja se formira kao na primeru.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23
public class Zadatak2 {
    public static void main(String[] args) {
        int novaVrednost = vratiNovuVrednostx1x2(2, 3);
        int novaVrednost1 = vratiNovuVrednostx1x2(5, 6);
        System.out.println(novaVrednost);
        System.out.println(novaVrednost1);
    }

    public static int vratiNovuVrednostx1x2(int x1, int x2) {
        return 10 * x1 + x2;
    }
}
