package Class25;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> alist = new ArrayList<>();
        alist.add("John");
        alist.add("Jane");
        alist.add("James");
        alist.add("Jasmine");
        alist.add("Jane");
        alist.add("James");
        System.out.println(alist);
        Set<String> aSet = new LinkedHashSet<>(alist);

        alist.clear();
        alist.addAll(aSet);
        System.out.println(alist);



    }
}
