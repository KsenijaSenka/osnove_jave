package p15_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {
        double a = 5;
        double r = 3;
        double povrsinaKvadrata = 0;
        povrsinaKvadrata = a * a;
        double povrsinaKruga = 0;
        double PI = 3.14;
        povrsinaKruga = r * r * PI;

        System.out.println("a: " + a);
        System.out.println("Povrsina kvadrata je " + povrsinaKvadrata);
        System.out.println("r: " + r);
        System.out.println("Povrsina kruga je " + povrsinaKruga);
    }
}
