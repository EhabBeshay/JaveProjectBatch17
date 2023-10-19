package Class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E1Set {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //we can store duplicate elements in ArrayList and LinkedList.
        numbers.add(10);
        numbers.add(22);
        numbers.add(10);
        numbers.add(22);
        System.out.println(numbers);

        HashSet<Integer> uniqeNumbers = new HashSet<>();
        uniqeNumbers.add(10);
        uniqeNumbers.add(22);
        uniqeNumbers.add(10);
        uniqeNumbers.add(22);
        System.out.println(uniqeNumbers);
    }
}
