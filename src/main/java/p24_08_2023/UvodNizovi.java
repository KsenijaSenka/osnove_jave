package p24_08_2023;

import java.util.ArrayList;

public class UvodNizovi {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Ford");

        String x1 = cars.get(0);
        String x2 = cars.get(1);

        cars.set(1, "Nissan");

        System.out.println(cars.size());


        System.out.println("Kraj");
    }
}
