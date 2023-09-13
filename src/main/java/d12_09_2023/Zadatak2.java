package d12_09_2023;

import p12_09_2023.User;

import java.util.ArrayList;

//U glavnoj klasi:
//kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton> kartoni = new ArrayList<>();

        ZeleniKarton karton1 = new ZeleniKarton("Jovica Jovanovic", 234,
                "Fiziologija", "Bosiljka Plecas", 7);
        ZeleniKarton karton2 = new ZeleniKarton("Jelena Jovanovic", 235,
                "Fiziologija", "Bosiljka Plecas", 8);
        ZeleniKarton karton3 = new ZeleniKarton("Zikica Jovic", 256,
                "Mikrobiologija", "Marina Pavlovic", 9);
        ZeleniKarton karton4 = new ZeleniKarton("Milica Zivanovic", 214,
                "Genetika", "Mirka Vukas", 10);
        ZeleniKarton karton5 = new ZeleniKarton("Jovica Milenkovic", 134,
                "Anatomija", "Brankica Petrovic", 5);


        kartoni.add(0, karton1);
        kartoni.add(1, karton2);
        kartoni.add(2, karton3);
        kartoni.add(3, karton4);
        kartoni.add(4, karton5);

        int sumaOcena = 0;
        double prosecnaOcena = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            kartoni.get(i).stampajPodatke();
            sumaOcena = sumaOcena + kartoni.get(i).getOcena();
            prosecnaOcena = (1.0 * sumaOcena) / kartoni.size();
        }

        System.out.println("Prosecna ocena svih ispita je: " + prosecnaOcena);
    }

}
