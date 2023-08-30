package p25_08_2023;
//Napisati dve metode, jedna metoda sluzi za stampanje imena
//        a druga sluzi za stampanje prezimena.
//        U glavnom programu pozvati metode na izvrsenje
//        tako da se 5 puta ispise ime i prezime u istom redu.
public class Zadatak2 {
    public static void main(String[] args) {
        stampaIme();
        stampaPrezime();
        stampaIme();
        stampaPrezime();
        stampaIme();
        stampaPrezime();
        stampaIme();
        stampaPrezime();
        stampaIme();
        stampaPrezime();
    }

    public static void stampaIme() {
        System.out.print("Ksenija ");
    }

    public static void stampaPrezime() {
        System.out.println("Beocanin");
    }
}
