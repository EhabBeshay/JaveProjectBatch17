package Class26;

import java.util.TreeSet;
/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class HW4 {
    public static void main(String[] args) {
        TreeSet<String> objects = new TreeSet<>();
        objects.add("Ehab");
        objects.add("Deepali");
        objects.add("Abi");
        objects.add("Guilia");
        objects.add("Ayesha");
        objects.add("Jamel");
        objects.add("Laura");
        objects.add("Madina");
        objects.add("Arthur");

        objects.forEach(x-> System.out.print(x+" "));


    }
}
