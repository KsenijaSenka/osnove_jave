package p08_09_2023;
//Kreirati klasu Auto...i metodu za stampu koja stampa podatke
public class Zadatak2 {

    public static void main(String[] args) {
        Auto auto1=new Auto();
        auto1.vozac = "Milan Jovanovic";
        auto1.marka = "BMW";
        auto1.brojVrata = 4;
        auto1.potrosnja = 10;
        auto1.trenutnaBrzina = 180;
        auto1.proizvedenGodina = 1949;
        auto1.rokMesec = 3;
        auto1.kubikaza = 2100;
        auto1.brojRegistracije = "NI 123456";
        auto1.jeUkljucenaKlima=true;
        auto1.maksimalnaBrzina=240;

        auto1.stampajPodatke();
        System.out.println("Da li je ogranicenje prekoraceno: ");

        if (auto1.jePrekoracio(150) == true) {
            System.out.println("da, prekoracio je 150 km/h");
            System.out.println("Kazna iznosi: " +
                    auto1.kazna(150));
        } else {
            System.out.println("Brzina nije prekoracena.");
        }

        System.out.println("Da li je auto oldimer: " +
                auto1.jeOldtimer());
        System.out.println("Da li je istekla registracija: " +
                auto1.jeIsteklaRegistracija(2));

        System.out.println("Cena registracije je: "+
                auto1.racunajCenu()+" rsd");

        auto1.stampajTablu();

    }
}
