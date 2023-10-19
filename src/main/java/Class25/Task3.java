package Class25;

import java.util.Set;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        Set<String> country = new TreeSet<>();
        country.add("Egypt");
        country.add("UK");
        country.add("USA");
        country.add("Spain");
        country.add("Italy");
        country.add("Morocco");
        country.add("Tunisia");
        country.add("Sudan");
        country.add("Georgia");
        country.add("India");
        System.out.println(country);

        country.forEach(x-> System.out.println(x));
    }
}
