package d11_09_2023;
//U main metodi, kreirati jedan facebook post
// i jednog korisnika i pozvati svaku od metoda
public class Zadatak2 {
    public static void main(String[] args) {
        Korisnik ksenija = new Korisnik("Ksenija", "Beocanin");

        Korisnik janja = new Korisnik();
        janja.setIme("Janja");
        janja.setPrezime("Janjic");

        FacebookPost post1 = new FacebookPost("O vaznosti medjusobnog uvazavanja na drustvenim mrezama", ksenija);

        ksenija.stampajKorisnika();
        janja.stampajKorisnika();

        janja.getIme();
        janja.getPrezime();

        post1.stampajPost();


    }
}
