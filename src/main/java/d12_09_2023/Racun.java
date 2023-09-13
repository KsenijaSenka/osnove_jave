package d12_09_2023;

public class Racun {
    private String brojRacuna;
    private String imeIPrezime;

    private double stanje;

    public Racun(String brojRacuna,String imeIPrezime,double stanje){
        this.brojRacuna=brojRacuna;
        this.imeIPrezime=imeIPrezime;
        this.stanje=stanje;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public double getStanje() {
        return stanje;
    }

    public void uplatiNaRacun(double svota) {
        stanje = stanje + svota;
    }

    public void skiniSaRacuna(double svota) {
        stanje = stanje - svota;
    }

    public void stampajRacun() {
        System.out.println(this.imeIPrezime + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je " + this.stanje);
    }
}
