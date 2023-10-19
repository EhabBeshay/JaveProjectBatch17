package Class26;

import java.util.HashMap;

public class T3 {
    public static void main(String[] args) {
        HashMap<Integer, String> items = new HashMap<>();
        items.put(123, "Smart TV");
        items.put(321, "Stupid TV");
        items.put(145, "Laptop");
        items.put(167, "Printer");

        var entries = items.entrySet();

        for (var e :  entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println("=========");
        items.forEach((k,v)-> System.out.println(k+" "+v));


    }
}
