package d12_09_2023;
//Glavni program koji koristi klase Racun i Transakcija
public class Zadatak3 {
    public static void main(String[] args) {
        Racun rn1=new Racun("200-2348262620-098","Micko Milovanovic",34500);
        Racun rn2=new Racun("200-4748372362-087","Mikica Stupljanin",1267.98);

        Transakcija transakcija1=new Transakcija(1201,rn1,rn2);

        transakcija1.racunajProviziju(450);
        transakcija1.izvrsiTransakciju(450);
        transakcija1.stampajTransakciju();

    }
}
