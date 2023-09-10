package d08_09_2023;
//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
public class Proizvod {

    public String naziv;
    public double cena;

    public double tezina;

    public void stampaj() {
        System.out.println(this.naziv + ", " + this.cena +
                ", " + this.tezina);
    }

    public void povecajCenu(double povecanje) {
        cena = this.cena + povecanje;
    }

    public double vratiCenuSaPopustom(double popust) {
        double cenaSPopustom;
        if (popust > 0 && popust < 100) {
            return cenaSPopustom = this.cena - popust;
        } else {
            return cenaSPopustom = this.cena;
        }
    }

    public int racunajPostarinu() {
        int postarina;
        if (tezina <= 100) {
            return postarina = 200;
        }
        if (tezina > 100 && tezina <= 500) {
            return postarina = 400;
        }
        if (tezina > 500) {
            return postarina = 1000;
        } else return 0;
    }
}
