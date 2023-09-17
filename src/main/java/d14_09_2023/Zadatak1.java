package d14_09_2023;
//glavni program za klase Student i Ispit
public class Zadatak1 {
    public static void main(String[] args) {
        Ispit ispit1 = new Ispit("matematika", 5, "Veronika Djukic");
        Ispit ispit2 = new Ispit("fizika", 10, "Veljko Lukic");
        Ispit ispit3 = new Ispit("fizicka hemija", 6, "Ljupka Bozic");

        Student student1 = new Student(261, "Ksenija Beocanin", "osnovne");
        Student student2 = new Student(12, "Jovica Mikic", "doktorske");

        student1.dodajIspit(ispit3);
        student1.dodajIspit(ispit2);

        student2.dodajIspit(ispit1);

        student1.stampaj();
        student2.stampaj();
    }
}
