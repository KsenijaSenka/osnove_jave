package p24_08_2023;

import java.util.ArrayList;

//Napisati program koji validira registracionu formu.
// Program treba da održava 2 niza informacija:
public class Zadatak8 {
    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<>();
        ArrayList<Boolean> required = new ArrayList<>();

        inputs.add("first name");
        inputs.add("last name");
        inputs.add("email");
        inputs.add("password");
        inputs.add("phone");
        inputs.add("address");

        required.add(true);
        required.add(true);
        required.add(true);
        required.add(true);
        required.add(false);
        required.add(false);

        for (int i = 0; i < inputs.size(); i++) {
            String input = inputs.get(i);
            System.out.print(input + ": ");
            boolean requiredValue = required.get(i);
            if (requiredValue == true) {
                System.out.println("* ___________");
            } else {
                System.out.println("____________");
            }
        }

    }

}
