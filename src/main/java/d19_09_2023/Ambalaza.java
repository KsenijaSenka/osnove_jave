package d19_09_2023;

public abstract class Ambalaza {
    protected String barkod;
    protected String nazivArtikla;
    protected double neto;
    protected double bruto;

    public Ambalaza() {
    }

    public Ambalaza(String barkod, String nazivArtikla, double neto, double bruto) {
        this.barkod = barkod;
        this.nazivArtikla = nazivArtikla;
        this.neto = neto;
        this.bruto = bruto;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public double getBruto() {
        return bruto;
    }

    public void setBruto(double bruto) {
        this.bruto = bruto;
    }
    public double racunajTezinu(){
        double tezina=bruto-neto;
        return tezina;
    }
    public abstract double vratiCenuArtikla();
    public abstract void stampaj();
}
