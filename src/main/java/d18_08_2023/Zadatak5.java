package d18_08_2023;
//Napisati program koji stampa sve brojeve od 1 do 100 tako da:
//        sve parne stampa kao negativne
//        sve neprane kao pozitivne brojeve
public class Zadatak5 {

    public static void main(String[] args){

        for (int i = 1; i < 101; i++) {
            int negativnoI = -1 * i;
            if (i % 2 == 0) {
                System.out.print(negativnoI + ", ");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}

