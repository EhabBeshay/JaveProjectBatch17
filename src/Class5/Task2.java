package Class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the day number as example Monday = 1");
        int daynum=s.nextInt();

        if (daynum==1||daynum==2||daynum==3||daynum==4||daynum==5){
            System.out.println("Weekday");
        } else if (daynum==6||daynum==7) {
            System.out.println("Weekend");
        } else if (daynum<1||daynum>7) {
            System.out.println("Invalid data");
        }
    }
}
