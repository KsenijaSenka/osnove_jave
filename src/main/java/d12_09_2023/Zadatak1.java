package d12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        FizickoLice fizickoLice1 = new FizickoLice("Biljana Biljic", 365489, "0909899234567");
        FizickoLice fizickoLice2 = new FizickoLice("Krstana Krstic", 345898, "0808987898777");
        fizickoLice1.setPrethodnoKupovao(true);

        Ugovor ugovor1 = new Ugovor("2", "3", "2023",
                fizickoLice2, fizickoLice1, 560234, "Jelene Cetkovic 7 Novi Sad");

        ugovor1.racunaProviziju();
        ugovor1.stampajUgovor();

}}
