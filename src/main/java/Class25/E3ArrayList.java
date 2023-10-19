package Class25;

import java.util.LinkedList;

public class E3ArrayList {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);

        System.out.println(numbers);
        numbers.forEach(x-> System.out.println(x));
        numbers.removeIf(x->x>15);
        System.out.println(numbers);

    }
}
