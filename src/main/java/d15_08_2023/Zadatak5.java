package d15_08_2023;
// Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.

public class Zadatak5 {
    public static void main(String[] args) {
        double a = 10;
        double squareRoot3 = 1.73;

        double perimeter = 3 * a;
        double area = a * a * squareRoot3 / 4;

        System.out.println("a: " + a);
        System.out.println("Povrsina jednakostranicnog trougla stranice a je " + area);
        System.out.println("Obim jednakostranicnog trougla stranice a je " + perimeter);


    }
}
