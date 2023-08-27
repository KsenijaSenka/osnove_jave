package d25_08_2023;
//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa
// prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
public class Zadatak1 {
    public static void main(String[] args) {
        stampajVrednostZa10Vecu(10);
        stampajVrednostZa10Vecu(20);
        stampajVrednostZa10Vecu(-10);
    }
    public static void stampajVrednostZa10Vecu(int broj){
        broj =broj+10;
        System.out.println(broj);
    }
}
