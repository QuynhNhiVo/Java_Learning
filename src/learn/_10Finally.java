package learn;

import java.util.Scanner;

public class _10Finally {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("(10/x). Enter x: ");
//        try {
//            int x = scanner.nextInt();
//            System.out.println("Try");
//        } catch (Exception e) {
//            System.out.println("Catch");
//        } finally {
//            System.out.println("Finally");
//            scanner.close();
//        }

        try (Scanner scanner = new Scanner(System.in)){
            int x = scanner.nextInt();
        }

    }

}
