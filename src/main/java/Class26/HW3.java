package Class26;

import java.util.Collections;
import java.util.HashMap;

/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000
 */
public class HW3 {
    public static void main(String[] args) {
        HashMap<String, Double> employees = new HashMap<>();
        employees.put("Adam Smith", 200000.00);
        employees.put("Kevin Rodger",150000.00);
        employees.put("Alan George",130000.00);
        employees.put("Ahmed Sayed", 230000.00);
        employees.put("Ramy Reda", 170000.00);

      double maxSalary = (Collections.max(employees.values()));
        var entries=employees.entrySet();
        for(var e : entries){
            if(e.getValue()==maxSalary){
                System.out.println(e.getKey()+" = $"+e.getValue());
            }
        }

    }
}
