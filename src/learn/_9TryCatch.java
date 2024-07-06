package learn;

import java.util.Scanner;

public class _9TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("(10/x). Enter x: ");
            try {
                int x = scanner.nextInt();
                try {
                    System.out.println("10/x = " + 10 / x);
                    break;
                } catch (Exception e) { //x = 0
                    System.out.println(e.getMessage());
                }
            } catch (Exception e) { //x not is number
                scanner.next();
                System.out.println("run error");
            }
        }
    }
}
