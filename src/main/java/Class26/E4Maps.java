package Class26;

import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipsticks", 22.0);
        makeup.put("BlushOn", 40.0);
        makeup.put("Base", 50.0);
        makeup.put("Foundation", 90.50);
        makeup.put("EyeLiner", 25.5);
        makeup.put("Concealer", 35.5);
        makeup.put("EyeLiner", 25.5);
//      Using Lambda
        makeup.forEach((key, value)-> System.out.println(key+" "+value));


        // Whenever you need more than one parameter you need to put parentheses
        // Similarly if we want to have more than one line of code we need to have curly brackets as well;
        makeup.forEach((key, value)-> {
            if (key.contains("a")){
                System.out.println(value);
            }
        });


    }
}
