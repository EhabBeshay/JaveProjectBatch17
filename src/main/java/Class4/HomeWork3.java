package Class4;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your city");
        String city = s.next();
        System.out.println("Please enter your city's temperature in Fahrenheit");
        double temp=s.nextDouble();
        double tempConvert = (temp-32)*5/9;
        System.out.println("The temperature in "+city+" is "+tempConvert+"°");






    }
}
