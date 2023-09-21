package d19_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Korpa korpa = new Korpa();
        SuperKartica kartica = new SuperKartica(23, "Joca Mitic", 50);
        Ambalaza ambalaza1 = new Tetrapak("465-987", "t1", 200, 230.5, true, 120.4);
        Ambalaza ambalaza2 = new StaklenaAmbalaza("6575-98", "flasa", 560, 780, 23, true, 200);
        Ambalaza ambalaza3 = new Tetrapak("123-123", "t2", 100, 150, false, 300);
        korpa.dodajAmbalazu(ambalaza1);
        korpa.dodajAmbalazu(ambalaza2);
        korpa.izbaciAmbalazu("465-987");
        korpa.dodajAmbalazu(ambalaza3);
        kartica.stampaj();
        ambalaza2.stampaj();
        ambalaza1.stampaj();
        ambalaza3.stampaj();
        System.out.println("Cena korpe: "+korpa.vratiCenuKorpe(kartica));
    }
}