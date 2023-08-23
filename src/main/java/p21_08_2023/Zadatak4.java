package p21_08_2023;
//Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju

public class Zadatak4 {
    public static void main(String[] args) {

        int proizvodStepen = 1;
//Milanovo resenje:
       // int osnova=2, stepen=7,prod=1;
        //prod=prod*osnova;
        //sout(stepen+"broja"+osnoav +"je"+prod)


        for (int i = 0; i < 7; i++) {
            proizvodStepen = proizvodStepen * 2;

        }
        System.out.println(proizvodStepen);
    }
}
