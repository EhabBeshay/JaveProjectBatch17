package Class23;

import java.util.ArrayList;

public class E2Arraylist {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Sajana");
        names.add("Avis");
        names.add(10);
        names.add('s');
        names.remove(0);
        System.out.println(names);
        System.out.println(names.size());
    }
}
