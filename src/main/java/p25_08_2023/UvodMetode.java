package p25_08_2023;

public class UvodMetode {
    //main je metoda
    public static void main(String[] args) {

//        System.out.println("Hello world");
//        System.out.println("Hello world");
//        System.out.println("Hello world");
//
//String ime="Milan";
//String prezime="Jovanovic";
//boolean aktivan=true;
//printUser(ime +", Nebojsa",prezime,aktivan); mozemo i da ubacimo srednje ime npr.

        printUser("Milan", "Jovanovic", true);
    }

    //deklaracija:
    public static void printUser(String ime, String prezime, boolean aktivan) {
        if (aktivan == true) {
            System.out.print("o ");
        } else {
            System.out.print("x ");
        }
        System.out.println(ime + " " + prezime);
    }
    // AKO nije void, vraca vrednost
    //public static String getUser(String ime, String prezime, boolean aktivan){
//     return ime+ " "+prezime"} ili
    //String punoIme=""; if (aktivan){punoIme="o"+ime+prezime}else{"x"+ime+prezime}return punIme;
    //onda ce u main da ide puno ime i prezime
    //String x = getUser("Milan", "Jovanovic")
}
