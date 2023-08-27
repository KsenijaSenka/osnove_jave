package d25_08_2023;

//Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu
// iskoristi funkciju i ispisti odgovarajucu poruku.
public class Zadatak7 {
    public static void main(String[] args) {
        int minimum = vracaMinimum(4, 7, 11);
        System.out.println("Najmanji od tri data broja je " + minimum);
    }

    public static int vracaMinimum(int a, int b, int c) {
        if (a <= b) {
            if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b <= c) {
                return b;
            } else {
                return c;
            }
        }
    }
}
