package d19_09_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza>ambalaze;

    public Korpa() {
        this.ambalaze=new ArrayList<>();
    }
    public void dodajAmbalazu(Ambalaza novaAmbalaza){
        this.ambalaze.add(novaAmbalaza);
    }

    public void izbaciAmbalazu(String barkod) {
        for (int i = 0; i < ambalaze.size(); i++) {
            if (barkod.equals(this.ambalaze.get(i).getBarkod())) {
                ambalaze.remove(ambalaze.get(i));
            }
        }
    }

    private ArrayList<Double> vratiSnizenuCenu(int popust) {
        double snizenaCena = 0;
        ArrayList<Double> snizeneCene = new ArrayList<>();
        for (int i = 0; i < ambalaze.size(); i++) {
            snizenaCena = this.ambalaze.get(i).vratiCenuArtikla() - popust;
            snizeneCene.add(snizenaCena);
        }
        return snizeneCene;
    }

    public double vratiCenuKorpe(SuperKartica superKartica){
        double suma=0;
        double snizenaCena=0;
        int popust = superKartica.getPopust();
        for (int i = 0; i < ambalaze.size(); i++) {
            snizenaCena=this.vratiSnizenuCenu(popust).get(i);
            suma=suma+snizenaCena;
        }
        return suma;
    }
}
