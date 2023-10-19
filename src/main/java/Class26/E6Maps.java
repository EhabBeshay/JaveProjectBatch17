package Class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Same as E4 but with loop instead of Lambda
public class E6Maps {
    public static void main(String[] args) {
        ArrayList <Double> pricesOfmakeup = new ArrayList<>();
        pricesOfmakeup.add(25.5);
        pricesOfmakeup.add(30.2);
        pricesOfmakeup.add(25.2);

        ArrayList<Double> pricesOffruit = new ArrayList<>();
        pricesOffruit.add(2.5);
        pricesOffruit.add(3.99);
        pricesOffruit.add(4.99);

        ArrayList<Double> pricesOfDairy = new ArrayList<>();

        pricesOfDairy.add(1.99);
        pricesOfDairy.add(2.99);
        pricesOfDairy.add(3.99);
        pricesOfDairy.add(4.99);

        Map<String, ArrayList<Double>> arrayListMap = new HashMap<>();
        arrayListMap.put("pricesOfmakeup", pricesOfmakeup);
        arrayListMap.put("pricesOfFruit", pricesOffruit);
        arrayListMap.put("pricesOfDairy", pricesOfDairy);

}}
