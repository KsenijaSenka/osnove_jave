package d07_09_2023;
//U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti.
// Ispisati informacije o proizvodima.
public class Zadatak3 {
    public static void main(String[] args) {
        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Sir";
        proizvod1.cena = 300.5;

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Mleko";
        proizvod2.cena = 198.8;

        Proizvod proizvod3 = new Proizvod();
        proizvod3.naziv = "Pavlaka";
        proizvod3.cena = 100;

        System.out.println("Informacije o proizvodima: ");
        System.out.println(proizvod1.naziv + " kosta " + proizvod1.cena+" dinara.");
        System.out.println(proizvod2.naziv + " kosta " + proizvod2.cena+" dinara.");
        System.out.println(proizvod3.naziv + " kosta " + proizvod3.cena+" dinara.");

    }
}
