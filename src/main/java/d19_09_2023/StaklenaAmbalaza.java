package d19_09_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucija;
    private boolean postojiKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza() {
    }

    public StaklenaAmbalaza(String barkod, String nazivArtikla,
                            double neto, double bruto, double kaucija,
                            boolean postojiKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, neto, bruto);
        this.kaucija = kaucija;
        this.postojiKaucija = postojiKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean daLiPostojiKaucija() {
        return postojiKaucija;
    }

    public void setPostojiKaucija(boolean postojiKaucija) {
        this.postojiKaucija = postojiKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double vratiCenuArtikla() {
        if (daLiPostojiKaucija()) {
            return osnovnaCena * 1.2 + kaucija;
        } else {
            return osnovnaCena * 1.2;
        }
    }
    @Override
    public void stampaj() {
        System.out.println("Barkod: " + getBarkod());
        System.out.println("Naziv artikla: " + getNazivArtikla());
        System.out.println("Tezina, bruto: " + getBruto() + ", neto: " + getNeto());
        System.out.println("Da li se placa kaucija: " + postojiKaucija);
        System.out.println("Cena: " + vratiCenuArtikla());
    }
}
