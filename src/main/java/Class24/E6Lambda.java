package Class24;

import java.util.ArrayList;

public class E6Lambda {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");
        System.out.println("Before: "+ words);

        words.forEach(x-> System.out.println(x));
        words.removeIf(x->x.contains("e"));

    }
}
