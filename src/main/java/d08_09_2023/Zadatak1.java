package d08_09_2023;
//U glavnom programu kreirati minimum 2 proizvoda i
// za svaki od njih pozvati svaku od definisanih funkcija.


public class Zadatak1 {
    public static void main(String[] args) {
        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Sir";
        proizvod1.cena = 300.5;
        proizvod1.tezina=450;

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Mleko";
        proizvod2.cena = 198.8;
        proizvod2.tezina=1000;

        proizvod1.stampaj();
        proizvod1.povecajCenu(15.5);
        proizvod1.stampaj();
        proizvod2.stampaj();
        proizvod2.povecajCenu(2);
        proizvod2.stampaj();
        proizvod1.vratiCenuSaPopustom(20);
        proizvod2.vratiCenuSaPopustom(101);
        System.out.println("Postarina za prvi proizvod iznosi: "+
        proizvod1.racunajPostarinu());
        System.out.println("Postarina za drugi proizvod iznosi: "+
                proizvod2.racunajPostarinu());


    }
}
