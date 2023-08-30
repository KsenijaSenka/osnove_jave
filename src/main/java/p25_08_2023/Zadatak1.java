package p25_08_2023;
//Napisati metodu koja stampa ime i prezime
// i u glavnom programu pozvati metodu na izvrsenje 5 puta.
public class Zadatak1 {
    public static void main(String[] args) {
        stampaImePrezime();
        stampaImePrezime();
        stampaImePrezime();
        stampaImePrezime();
        stampaImePrezime();

        //moze u for petlju fori {stampaImePrezime();}
    }

    public static void stampaImePrezime() {
        System.out.println("Ksenija Beocanin");
    }
}
