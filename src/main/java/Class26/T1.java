package Class26;

import java.util.LinkedHashMap;

public class T1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> company = new LinkedHashMap<>();
        company.put(1,"Google");
        company.put(2,"Syntax");
        company.put(3,"Oracle");
        company.put(4,"BMW");
        company.put(5,"Orange");
        company.put(6,"Syntax");
        company.put(4,"Oracle");
        company.put(7,"IHG");

        System.out.println("Before: "+company);
        System.out.println("Number of elements is: "+company.size());
        company.replace(4, "Toyota");
        company.remove("IHG");
        System.out.println("After: "+company);


    }
}
