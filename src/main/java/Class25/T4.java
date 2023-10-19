package Class25;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Create a Set of cities in which you want to make sure that insertion
order is maintained. Then remove any city that starts with “A”;
 */
public class T4 {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();
        cities.add("Cairo");
        cities.add("Alexandria");
        cities.add("Milan");
        cities.add("London");
        cities.add("Frederick");
        System.out.println("Before: "+cities);
        cities.removeIf(x->x.startsWith("A"));
        System.out.println("After: " +cities);

    }
}
