package d11_09_2023;
//Kreirati klasu FacebookPost
//opis
//korisnik (referenca na korisnika koji je kreirao post)
//konstrukore koje mislite da su vam potrebni
//metoda print, stampa u formatu:
//(ime) (prezime)
//(opis post-a)
public class FacebookPost {
    private String opis;
    private Korisnik korisnik;

    public FacebookPost(String opis, Korisnik korisnik) {
        this.opis = opis;
        this.korisnik = korisnik;
    }
    public void stampajPost(){
        this.korisnik.stampajKorisnika();
        System.out.println(this.opis);
    }
}
