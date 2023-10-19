package Class25;

import java.util.LinkedList;

public class E4ArrayListVsLinkedList {
    public static void main(String[] args) {
        long startingTime = System.currentTimeMillis();

        LinkedList<Integer> number = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            number.add(0,i);

        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(number.get(100000));

        }
        long endTime = System.currentTimeMillis();
        long timeTook = (endTime-startingTime);
        System.out.println(timeTook);
}
}
