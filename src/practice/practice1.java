package practice;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1. Name and score");
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Point: ");
        int score = scanner.nextInt();
        System.out.println(name + " Have score = " + score);

        System.out.println("\n 2. Rectangle");
        System.out.println("Enter length: ");
        int length = scanner.nextInt();
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Circumference: " + (length+width)*2);
        System.out.println("Area: " + length*width);
        System.out.println("Min: " + Math.min(length, width));

        System.out.println("\n 3. Cube");
        System.out.println("Enter the edge of cube: ");
        int edge = scanner.nextInt();
        System.out.println("Volumn: " + Math.pow(edge, 3));
    }
}
