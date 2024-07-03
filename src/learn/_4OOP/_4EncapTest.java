package learn._4OOP;

public class _4EncapTest {
    public static void main(String[] args) {
        System.out.println("Encapsulation");
        _4Encapsulation encObj = new _4Encapsulation("Encap", 2);
        System.out.println("Get Constructor, name: " + encObj.getName() + ", age: " + encObj.getAge());
        encObj.setName("Encap 2");
        System.out.println("Get Constructor, name: " + encObj.getName() + ", age: " + encObj.getAge());
    }
}
