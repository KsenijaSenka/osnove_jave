package d15_09_2023;

import java.util.ArrayList;

public class Igrac extends Osoba{
    private int broj;
    private String pozicija;
    private boolean kapiten;
    private ArrayList<Karton>kartoni=new ArrayList<>();
    public Igrac(){}
    public Igrac(String ime,String prezime,int godinaRodjenja,String jmbg,
                 int broj,String pozicija,boolean kapiten){
        super(ime,prezime,jmbg,godinaRodjenja);
        this.broj=broj;
        this.pozicija=pozicija;
        this.kapiten=kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj: " + this.broj + ", pozicija: " +
                this.pozicija);
            System.out.println("Da li je kapiten: "+this.kapiten);
        System.out.println("Dobijeni zuti kartoni: "+this.brojZutihKartona());
        }

    public void dodajKarton(Karton noviKarton) {
        this.kartoni.add(noviKarton);
    }

    public int brojZutihKartona() {
        int brojZutih = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (kartoni.get(i).equals("Zuti")) {
                brojZutih++;
            }
        }
        return brojZutih;
    }
}

