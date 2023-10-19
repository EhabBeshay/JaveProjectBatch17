package Class24;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> fruits =  new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Melon");
        fruits.add("Tomato");
        System.out.println("Before: "+ fruits);

        fruits.removeIf(x->x.contains("a")||x.endsWith("e"));
        System.out.println("after: "+ fruits);

    }

}
