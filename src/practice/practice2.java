package practice;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//        System.out.println("++ ------------------ ++");
//        System.out.println("| 1. Cộng              |");
//        System.out.println("| 2. Trừ               |");
//        System.out.println("| 3. Kết thúc          |");
//        System.out.println("++ ------------------ ++");
//        System.out.println("Lựa chọn của bạn là : ");
//        int num = scanner.nextInt();
//        switch(num){
//            case 1:
//                System.out.println(" +");
//                break;
//            case 2:
//                System.out.println(" -");
//                break;
//            default:
//                System.exit(0);
//        }
//
//        System.out.println("\n 1. ax + b =0");
//        System.out.println("Enter a: ");
//        int a = scanner.nextInt();
//        System.out.println("Enter b: ");
//        int b = scanner.nextInt();
//        if (a==0 && b==0){
//            System.out.println("Phuong trinh vo so nghiem.");
//        }else if (a==0 && b!=0){
//            System.out.println("Phuong trinh vo nghiem");
//        }else {
//            System.out.println("x = " + b/a);
//        }

        System.out.println("\n 1. ax^2 + bx + c =0");
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("Phuong trinh vo so nghiem.");
            } else if (b == 0 && c != 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("x = " + c / b);
            }
        } else {
            if (delta < 0 ){
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                float x = (float) - b/(2*a);
                System.out.printf("Phuong trinh co nghiem kep x = %.3f", x);
            }else {
                double x = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("Phuong trinh co 2 nghiem x1 = %.3f, x2 = %.3f", x, x2);
            }
        }
    }
}
