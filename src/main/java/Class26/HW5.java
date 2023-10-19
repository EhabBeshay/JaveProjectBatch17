package Class26;

import java.util.ArrayList;
import java.util.List;

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class HW5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        numbers.add(13);
        numbers.add(15);

        var sum=0;
        for(int n : numbers){
            sum+=n;
        }
        System.out.println("Sum of all numbers is "+sum);
    }
}
