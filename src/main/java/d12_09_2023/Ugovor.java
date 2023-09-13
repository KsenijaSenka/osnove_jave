package d12_09_2023;

import java.util.Date;

public class Ugovor {
    private String godina;
    private String mesec;
    private String dan;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cena;
    private String adresa;

    public Ugovor(String dan, String mesec, String godina,FizickoLice prodavac, FizickoLice kupac,
                  double cena, String adresa){
        this.dan=dan;
        this.mesec=mesec;
        this.godina=godina;
        this.kupac=kupac;
        this.prodavac=prodavac;
        this.cena=cena;
        this.adresa=adresa;
    }
    public String getDan() {
        return this.dan;
    }

    public double racunaProviziju() {
        double provizija;
        if (this.kupac.getPrethodnoKupovao()) {
            return provizija=0.02;
        } else {
            return provizija=0.03;
        }
    }

    public double racunaZaradu() {
        return 1000 + cena * this.racunaProviziju();
    }

    public void stampajUgovor() {
        System.out.print("Dana " + this.dan + "." + this.mesec + "." + this.godina +
                ". god sklopljen je ugovor izmedju ");
        this.prodavac.stampajFizickoLice();
        System.out.print(" i ");
        this.kupac.stampajFizickoLice();
        System.out.println(" o kupovini nekretnine " +
                this.adresa + " po ceni od " + this.cena + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " +
                this.racunaZaradu());
    }
}
