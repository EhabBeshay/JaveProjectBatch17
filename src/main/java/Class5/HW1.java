package Class5;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your current time(use 24 hours format)");
        int hour=s.nextInt();
        if (hour>=1&&hour<=11) {
            System.out.println("Morning");
        } else if (hour>=12&&hour<=15) {
            System.out.println("Afternoon");
        } else if (hour>=16&&hour<=20) {
            System.out.println("Evening");
        } else if (hour>=21&&hour<=24) {
            System.out.println("Night");
        } else if (hour<1||hour>24) {
            System.out.println("Invalid entry");
        }


    }
}
