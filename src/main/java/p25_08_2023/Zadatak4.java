package p25_08_2023;
//Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
// Brojevi su ulazni parametri funkcije.
// U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.
public class Zadatak4 {
    public static void main(String[] args) {
        stampaRezultate(2, 8);
        stampaRezultate(3, 10);
        stampaRezultate(20, 5);
        stampaRezultate(5, 5);
    }

    public static void stampaRezultate(int x1, int x2) {
        int zbir = 0, razlika = 0, proizvod = 0, kolicnik = 0;
        zbir = x1 + x2;
        razlika = x1 - x2;
        proizvod = x1 * x2;
        kolicnik = x1 / x2;
        System.out.println("Zbir je: " + zbir);
        System.out.println("Razlika je: " + razlika);
        System.out.println("Proizvod je: " + proizvod);
        System.out.println("Kolicnik je: " + kolicnik);
    }
}
