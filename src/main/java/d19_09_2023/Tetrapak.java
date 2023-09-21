package d19_09_2023;

public class Tetrapak extends Ambalaza{
    private boolean mozeReciklirati;
    private double osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla,
                    double neto, double bruto, boolean mozeReciklirati, double osnovnaCena) {
        super(barkod, nazivArtikla, neto, bruto);
        this.mozeReciklirati = mozeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(){}

    public boolean daLiMozeReciklirati() {
        return mozeReciklirati;
    }

    public void setMozeReciklirati(boolean mozeReciklirati) {
        this.mozeReciklirati = mozeReciklirati;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double vratiCenuArtikla() {
        if (daLiMozeReciklirati()) {
            return racunajTezinu() * 1.5 + osnovnaCena;
        } else {
            return osnovnaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + getBarkod());
        System.out.println("Naziv artikla: " + getNazivArtikla());
        System.out.println("Tezina, bruto: " + getBruto() + ", neto: " + getNeto());
        System.out.println("Da li se moze reciklirati: " + mozeReciklirati);
        System.out.println("Cena: " + vratiCenuArtikla());
    }
}
