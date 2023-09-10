package d07_09_2023;
//U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti.
// Ispisati informacije o automobilima.
public class Zadatak2 {

    public static void main(String[] args) {
        Automobil automobil1 = new Automobil();
        automobil1.marka = "Audi";
        automobil1.model = "A3";
        automobil1.godinaProizvodnje = 2000;

        Automobil automobil2 = new Automobil();
        automobil2.marka = "Mazda";
        automobil2.model = "3";
        automobil2.godinaProizvodnje = 2020;

        System.out.println("Informacije o automobilima: ");
        System.out.println("Prvi automobil je " + automobil1.marka + " " +
                automobil1.model + ", proizveden " + automobil1.godinaProizvodnje + ".");

        System.out.println("Drugi automobil je " + automobil2.marka + " " +
                automobil2.model + ", proizveden " + automobil2.godinaProizvodnje + ".");


    }
}
