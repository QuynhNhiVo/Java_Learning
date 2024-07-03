package learn;

import java.util.ArrayList;

public class _5ArrayList {
    public static void main(String[] args) {
        int a =10;
        ArrayList<String> arrl = new ArrayList<String>();
//        arrl.add(2); //integer -> Integer
        arrl.add("New ArrayList1");
        arrl.add("New ArrayList2");
        arrl.add("New ArrayList3");
        System.out.println(arrl.toString()+" " + arrl.size() + " " + arrl.get(0));
        arrl.remove(1);
        System.out.println(arrl.toString()+" " + arrl.size() + " " + arrl.get(0));

    }
}
