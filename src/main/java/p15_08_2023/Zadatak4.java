package p15_08_2023;
//Napisati program koji na ekranu stampa podatke u formatu:
//        Sifra [SIFRA PROIZVODA]
//        [NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//        [BOJA], [VELICINA]


public class Zadatak4 {
    public static void main(String[] args) {
      String sifraProizvoda = "x932k20";
      String nazivProizvoda = "Nike Patike";
      int cena = 90;
      double popust = 13.5;
      String boja = "Crna";
      double velicina = 46.5;

        System.out.println("Sifra " + sifraProizvoda);
        System.out.println(nazivProizvoda + " - $" + cena +
                " - Popust " + popust + "%");
        System.out.print(boja + ", " + velicina);




    }
}
