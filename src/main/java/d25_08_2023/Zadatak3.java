package d25_08_2023;
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i
// da li je aktivan kao parametre metode.Metoda nista ne vraca.
public class Zadatak3 {
    public static void main(String[] args) {
        stampaPodatkeKorisnika("0203999444777", "Ksenija", "Beočanin", 1999, true);
    }

    public static void stampaPodatkeKorisnika(String jmbg, String ime, String prezime, int god, boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rođenja: " + god);
        System.out.println("Aktivan: " + aktivan);
    }
}
