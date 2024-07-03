package learn._4OOP;

public class _4OOPTest {
    public static void main(String[] args) {
        System.out.println("Learn OOP");
        _4OOP test = new _4OOP();
        System.out.println("Get Class Method "+ test.getName());

        _4OOP test2 = new _4OOP("Learn", 1);
        System.out.println("Get Constructor, name: " + test2.getName() + ", age: " + test2.getAge());
    }
}
