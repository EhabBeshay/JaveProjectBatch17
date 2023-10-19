package Class12;

import java.util.Scanner;

public class HW4Tester {
    public static void main(String[] args) {
        HW4Method sayHello = new HW4Method();

        Scanner s =new Scanner(System.in);
        System.out.println("Enter the country name");
        String country = s.nextLine();
        System.out.println(sayHello.greeting(country));



    }
}
