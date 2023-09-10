package d07_09_2023;
//Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti.
// Ispisati informacije o studentima.
public class Zadatak1 {
    public static void main(String[] args) {

        Student prvi=new Student();
        prvi.ime="Pera Lazic";
        prvi.brojIndeksa=261;
        prvi.fakultet="Farmaceutski";

        Student drugi=new Student();
        drugi.ime="Pera Lazarevic";
        drugi.brojIndeksa=262;
        drugi.fakultet="Sumarski";

        Student treci=new Student();
        treci.ime="Jovan Micic";
        treci.brojIndeksa=263;
        treci.fakultet="Masinski";

        System.out.println("Informacije o studentima: ");
        System.out.println(prvi.ime + ", br. indeksa - " + prvi.brojIndeksa);
        System.out.println(prvi.fakultet + " fakultet");
        System.out.println(drugi.ime + ", br. indeksa - " + drugi.brojIndeksa);
        System.out.println(drugi.fakultet + " fakultet");
        System.out.println(treci.ime + ", br. indeksa - " + treci.brojIndeksa);
        System.out.println(treci.fakultet + " fakultet");

    }
}
