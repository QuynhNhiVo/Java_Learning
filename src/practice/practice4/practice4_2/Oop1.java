package practice.practice4.practice4_2;

import practice.practice4.practice4_0.OOP1;

public class Oop1 extends OOP1 {

    private void test(){
        System.out.println("Different Package Use Inheritance");
        super.a = 10;
        super.c =10;
    }
    public static void main(String[] args) {
    }
}
