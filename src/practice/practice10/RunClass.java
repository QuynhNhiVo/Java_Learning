package practice.practice10;

import java.util.Scanner;

public class RunClass {

    public static int enterID(){
        Scanner scanner = new Scanner(System.in);
        int result;
        while (true){
            System.out.println("Enter your id: ");
            try{
                result = scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("ID Invalid. Enter again with number: ");
                scanner.next();
            }
        }
        scanner.close();
        return result;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int id = enterID();
            SinhVien sinhVien = new SinhVien(id, "Stud", 23, 56);
            System.out.println("Your ID: "+ id);
            System.out.println("Your info: "+sinhVien);
        }
    }
}
