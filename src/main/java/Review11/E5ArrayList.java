package Review11;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Cherry");

        fruit.set(2, "Grapes");
        System.out.println(fruit);
        System.out.println(fruit.lastIndexOf("Apple"));
    }
}
