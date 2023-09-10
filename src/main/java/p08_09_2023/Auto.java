package p08_09_2023;

public class Auto {
    public String vozac;
    public String marka;
    public int brojVrata;
    public double potrosnja;
    public int trenutnaBrzina;
    public int proizvedenGodina;
    public int rokMesec;
    public int kubikaza;

    public String brojRegistracije;
    public boolean jeUkljucenaKlima;

    public int maksimalnaBrzina;

    public void stampajPodatke() {
        System.out.println(this.vozac);
        System.out.println(this.marka + " - " + this.brojVrata +
                "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja +
                " na 100km");
        System.out.println(this.trenutnaBrzina + " km/h je trenutna brzina");

    }

    public boolean jePrekoracio(int ogranicenje) {
        if (this.trenutnaBrzina > ogranicenje) {
            return true;
        }
        return false;
    }

    public int kazna(int ogranicenje) {
        int jedinica = 0;
        if (this.jePrekoracio(ogranicenje)) {
            jedinica = this.trenutnaBrzina - ogranicenje;
            return jedinica * 1000;
        } else {
            return 0;
        }
    }

    public boolean jeOldtimer() {
        return this.proizvedenGodina<1950;
//        if (this.proizvedenGodina < 1950) {
//            return true;
//        }
//        return false;
    }

    public boolean jeIsteklaRegistracija(int trenutniMesec) {
        if (trenutniMesec - this.rokMesec > 0) {
            return true;
        }
        return false;
    }

    public double racunajCenu() {
        double cena = 0;
        if (this.kubikaza <= 2000) {
            cena = this.kubikaza * 100;
        } else {
            cena = 1.3 * this.kubikaza * 100;
        }
        return cena;
    }

    public void dodajGas() {

            this.trenutnaBrzina += 10;
            if (trenutnaBrzina>maksimalnaBrzina){
                this.trenutnaBrzina=this.maksimalnaBrzina;
        }
    }

    public void koci() {
        if (trenutnaBrzina >= 10) {
            this.trenutnaBrzina = this.trenutnaBrzina - 10;
        } else {
            this.trenutnaBrzina = 0;
        }
    }

    public double racunajPotrosnju() {
        double faktorKlime = 0;
        if (jeUkljucenaKlima) {
            faktorKlime = 1.2;
        } else {
            faktorKlime = 1.0;
        }
        double trenutnaPotrosnja = (this.trenutnaBrzina / this.potrosnja) * faktorKlime;
        return trenutnaPotrosnja;

    }
    public void stampajTablu(){
        int brojCrtica=(this.trenutnaBrzina * 100) / this.maksimalnaBrzina;
        for (int i = 0; i < 100; i++) {
            if (i < brojCrtica) {
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }
        System.out.println(this.trenutnaBrzina + " / " + this.maksimalnaBrzina + "km/h");
    }
}

