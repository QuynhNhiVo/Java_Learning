package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter random real number: ");
        ArrayList<Double> arr = new ArrayList<>();
        while (true){
            Double i = scanner.nextDouble();
            arr.add(i);
            scanner.nextLine();
            System.out.println("Continue? Y or N?");
            String option = scanner.nextLine();
            if (option.toUpperCase().equals("N")){
                break;
            }
        }
        System.out.println("Array: " + arr);
        double sum =0;
        for (int i=0; i<arr.size(); i++){
            sum+=arr.get(i);
        }
        System.out.println("Total = "+ sum);
    }
}
