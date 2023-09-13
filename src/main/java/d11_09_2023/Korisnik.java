package d11_09_2023;
//Kreirati klasu Korisnik koja ima
//ime
//prezime
//gettere i settere za ime i prezime
//konstuktore koje mislite da su vam potrebni
public class Korisnik {
    private String ime;
    private String prezime;

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void stampajKorisnika() {
        System.out.println(this.ime + " " + this.prezime);
    }
}
