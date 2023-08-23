package p21_08_2023;

public class PetljeNastavak {
    public static void main(String[] args) {
        //suma=1+2+3+4....+10;
//suma=0;
//        suma=suma+1;
        //suma=suma+2;
        //dodajemo svaki sledeci
        //sout(suma)

        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma = suma + i;

        }
        System.out.println("suma brojeva 1-10 je " + suma);
    }

}
