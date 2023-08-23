package d21_08_2023;

import java.util.Scanner;

//Napisati program koji simulira ponasanje speak loud programa.
public class Zadatak3 {
    public static void main(String[] args) {
//
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int sumaAgresivnihUnosa=0;

        for(int i = 0; i<n; i++){
            System.out.print("Unesite rec: ");
            String unetaRec = s.next();
            if(unetaRec.contains("!")){
                System.out.println(unetaRec);
                sumaAgresivnihUnosa++;
            }
            else {
                System.out.println(unetaRec+"!");
            }
        }

        int nivoAgresivnosti = sumaAgresivnihUnosa*100/n;
        System.out.print("Nivo agresivnosti: "+nivoAgresivnosti);
    }
}

