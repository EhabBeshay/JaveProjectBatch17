package Class12;
/*
Create a method that will say Hello in different language based on
the country that will be passed when method is executed
 */
public class HW4Method {

    String greeting (String str){

        if (str.equalsIgnoreCase("USA")){
            return "Hello";
        } else if (str.equalsIgnoreCase("Egypt")) {
            return "Marhaba";
        } else if (str.equalsIgnoreCase("Spain")) {
            return "Hola";
        }else {
            return "Try again";
        }
    }
}
