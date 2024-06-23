package learn;

import java.util.Scanner;

public class _1Introduce {
    public static void main(String[] args) {
        System.out.println("INTRODUCTION\n");
        System.out.println("1. Variable");
        System.out.println(" <type><variable_name> = <init_value>; \n int a = 3");
        int a = 3;
        System.out.println(" type><variable_name>;");
        System.out.println(" <variable_name> = <init_value>; \n int count; \n count = 4;");
        int count;
        count = 4;
        System.out.println(" Variable start with alphabet(aA-zZ), $, _\n");

        System.out.println("2. Operator");
        System.out.println(" */ -> +-");

        System.out.println("\n 3. Print");
        System.out.println("print println printf");

        System.out.println("\n 4. Scanner");
        System.out.println(" Scanner scanner = new Scanner(System.in);");
        System.out.println(" scanner.nextLine() --> Output: String");
        System.out.println(" scanner.nextInt() --> Output: Integer");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");
        String str = scanner.nextLine();
        int i = scanner.nextInt();
        System.out.println("--> Output String: " + str + ", Output Integer: " + i);

        System.out.println("\n 5. Mathematical functions");
        System.out.println("Enter 2 numbers:");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int max = Math.max(first, second);
        System.out.println(" Math.max("+first+","+second+") = " + max);
        int min = Math.min(first, second);
        System.out.println(" Math.min("+first+","+second+") = " + min);
        double pow = Math.pow(first, second);
        System.out.println(" Math.pow("+first+","+second+") = " + pow);
        double sqrt = Math.sqrt(25);
        System.out.println(" Math.pow(25) = " + sqrt);

    }
}
    