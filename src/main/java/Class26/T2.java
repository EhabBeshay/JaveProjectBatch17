package Class26;

import java.util.TreeMap;

/*
Create a map of countries(5) with its capital that will store countries in
alphabetical order. Country names will be keys and capitals will be values
Only print those countries which contain more than 5 letters in their country
name and the letter 'a' in their capital names
 */

public class T2 {

    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();

        countries.put("Egypt", "Cairo");
        countries.put("USA", "Washington DC");
        countries.put("UK", "London");
        countries.put("India", "New Delhi");
        countries.put("UAE", "Abu Dhabi");

        countries.forEach((country,capital)-> {
            if (country.length()<5 && capital.contains("a")){
                System.out.println( country+" "+capital );
            }

                });
        System.out.println();
        countries.forEach((country,capital)-> System.out.print(capital+" "));


    }

}
