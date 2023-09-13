package d11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.setImeAutora("Marko");
        autor1.setPrezimeAutora("Markovic");

        Knjiga knjiga1 = new Knjiga("124875398-0", "Zmajev put", 1999, autor1);
        knjiga1.stampajKnjigu();

        Autor autor2 = new Autor();
        autor2.setImeAutora("Jovana");
        autor2.setPrezimeAutora("Avramovic");

        Knjiga knjiga2 = new Knjiga("627921099-0", "Moj svet", 2023, autor2);
        knjiga2.stampajKnjigu();
    }
}
