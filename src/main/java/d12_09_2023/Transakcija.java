package d12_09_2023;

public class Transakcija {
    private int id;
    private Racun racunUplatioca;
    private Racun racunPrimaoca;

    public Transakcija(int id,Racun racunUplatioca,Racun racunPrimaoca){
        this.id=id;
        this.racunUplatioca=racunUplatioca;
        this.racunPrimaoca=racunPrimaoca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Racun getRacunUplatioca() {
        return racunUplatioca;
    }

    public void setRacunUplatioca(Racun racunUplatioca) {
        this.racunUplatioca = racunUplatioca;
    }

    public Racun getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public void setRacunPrimaoca(Racun racunPrimaoca) {
        this.racunPrimaoca = racunPrimaoca;
    }

    public double racunajProviziju(double svota) {
        double provizija;
        if (svota < 4500) {
            return provizija = 45;
        } else {
            return provizija = 0.01 * svota;
        }
    }
    public void izvrsiTransakciju(double svota){
        this.racunUplatioca.skiniSaRacuna(svota+this.racunajProviziju(svota));
        this.racunPrimaoca.uplatiNaRacun(svota);
    }

    public void stampajTransakciju() {
        System.out.println(this.id);
        System.out.println("Racun sa: " + this.racunUplatioca.getImeIPrezime() + " - " +
                this.racunUplatioca.getBrojRacuna());
        System.out.println("Racun na: " + this.racunPrimaoca.getImeIPrezime() + " - " +
                this.racunPrimaoca.getBrojRacuna());
    }
}
