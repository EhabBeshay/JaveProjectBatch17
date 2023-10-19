package Review5;

public class TwoDArrayExample {
    public static void main(String[] args) {
        String[][] countries = {
                {"Canada", "USA"},
                {"Ecuador" ,"Brazil", "Chile", "Argentina"},
                {"Romina", "France","Italy"}
        };
        System.out.println(countries.length);

        for (String[] countryArray : countries){
            for(String country : countryArray){
                System.out.print(country + " ");
            }

        }
    }
}
