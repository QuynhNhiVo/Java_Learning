package learn;

import java.util.Arrays;

public class _3For_Whiledo_Array {
    public static void main(String[] args) {
        //For
//        for (int i = 0; i <= 100; i += 10) {
//            System.out.println(i);
//        }
//
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String i : cars) {
//            System.out.println(i);
//        }

        //Array
        String[ ] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Run Array " + Arrays.toString(cars));
        System.out.println("Run Array " + cars.length);
        cars[1] = "Honda";
        System.out.println(cars[1]);
    }
}
