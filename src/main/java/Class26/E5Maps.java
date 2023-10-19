package Class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
// Same as E4 but with loop instead of Lambda
public class E5Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipsticks", 22.0);
        makeup.put("BlushOn", 40.0);
        makeup.put("Base", 50.0);
        makeup.put("Foundation", 90.50);
        makeup.put("EyeLiner", 25.5);
        makeup.put("Concealer", 35.5);
        makeup.put("EyeLiner", 25.5);
        Set<Map.Entry<String, Double>> entries = makeup.entrySet();
        for (Map.Entry<String, Double> e : entries) {
            System.out.println(e.getKey() + " " + e.getValue());




    }
}}
