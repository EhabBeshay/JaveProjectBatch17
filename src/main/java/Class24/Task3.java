package Class24;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Pepsi");
        drinks.add("Coca-cola");
        drinks.add("Nescafe");
        drinks.add("Apple juice");
        System.out.println("Before " + drinks);

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e"));
            drinks.set(i, "Water");


            }
        System.out.println(drinks);

    }

}
