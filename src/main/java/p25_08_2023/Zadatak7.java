package p25_08_2023;
//Napisati metodu koja proverava da li je trougao pravougli.
// Metoda prima stranice trougla i hipotenuzu trougla.
// Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
public class Zadatak7 {
    public static void main(String[] args) {
        boolean y = checkRightTriangle(3, 4, 5);
        System.out.println(y);
        boolean z = checkRightTriangle(3, 6, 8);
        System.out.println(z);
    }

    public static boolean checkRightTriangle(int a, int b, int c) {
        boolean right = true;
        if (a * a + b * b == c * c) {
            right = true;
        } else {
            right = false;
        }
        return right;
    }
}
