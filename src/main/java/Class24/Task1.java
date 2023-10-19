package Class24;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Abi");
        names.add("Ayesha");
        names.add("deepali");
        names.add("Giulia");
        names.add("Jamel");

        System.out.println("Is empty: "+ names.isEmpty());
        System.out.println("Is Deepali present: " + names.contains("Deepali"));
        System.out.println("Number of elements is: " + names.size());
        System.out.println("Elements are: "+ names);

    }
}
