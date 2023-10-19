package Class5;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your country name");
        String countryName=s.nextLine();
        switch (countryName){
            case "England":
                System.out.println("English");
                break;
            case "Egypt":
            case "Saudi Arabia":
                System.out.println("Arabic");
                break;
            case "Pakistan":
                System.out.println("Urdu");
                break;
            default:
                System.out.println("Invalid country name");

        }
    }
}
