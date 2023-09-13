package d11_09_2023;
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
public class Knjiga {
    private String isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga(String isbn, String naziv, int godinaIzdanja, Autor autor) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public int getGodinaIzdanja() {
        return this.godinaIzdanja;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
public void setAutor(Autor autor){
        this.autor=autor;
}
public Autor getAutor(){
       return this.autor;
}
    public void stampajKnjigu(){
        System.out.println(this.isbn);
        System.out.println(this.naziv+" - "+this.godinaIzdanja);
        this.autor.stampajAutora();
    }
}