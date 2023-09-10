package vezbaTest;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli. Program
        //ima niz brojeva duzine 25,
public class VezbaTest2 {
    public static void main(String[] args) {

        ArrayList tabela = new ArrayList<Integer>();

        tabela.add(3);
        tabela.add(1);
        tabela.add(2);
        tabela.add(4);
        tabela.add(5);
        tabela.add(8);
        tabela.add(9);
        tabela.add(0);
        tabela.add(-1);
        tabela.add(-2);
        tabela.add(3);
        tabela.add(6);
        tabela.add(7);
        tabela.add(8);
        tabela.add(9);
        tabela.add(5);
        tabela.add(3);
        tabela.add(4);
        tabela.add(0);
        tabela.add(4);
        tabela.add(6);
        tabela.add(8);
        tabela.add(9);
        tabela.add(0);
        tabela.add(8);


        for (int i = 0; i < tabela.size(); i++) {
            System.out.print(tabela.get(i) + ", ");
            if ((i + 1) % 5 == 0) {
                System.out.println("");
            }

        }
        System.out.println("Unesite kolonu za sumiranje: ");
        Scanner s = new Scanner(System.in);
        int kolona = s.nextInt();
        int sumaKolona = 0;
        for (int i = kolona - 1; i < tabela.size(); i += 5) {

            int broj = (int) tabela.get(i);

            sumaKolona = sumaKolona + broj;


        }
        System.out.println(sumaKolona);
    }
}
