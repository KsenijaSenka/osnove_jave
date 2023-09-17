package d15_09_2023;

public class Trener extends Osoba {
    private int godineIskustva;
    private String tip;

    public Trener(String ime, String prezime, String jmbg, int godinaRodjenja, int godineIskustva, String tip) {
        super(ime, prezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println(this.tip + " trener, trenira " + this.godineIskustva + " godina");
    }
}
