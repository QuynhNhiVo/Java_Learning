package learn._4OOP;

public class _4OOP {

    //Class Attributes
    String name;
    int age;

    //Constructor
    public _4OOP(){
    }

    public _4OOP(String name, int age){
        this.name =name;
        this.age = age;
    }

    //Class Method
    void learnJava(){
        System.out.println("Class Method");
    }
    //Class Overloading
    void  learnJava(int i){
        System.out.println("Class Overloading");
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
}
