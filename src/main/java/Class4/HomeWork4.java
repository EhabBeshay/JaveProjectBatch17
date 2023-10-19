package Class4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Do you have a credit card? please type 'Yes' or 'No' ");
        String que1 = s.next();
        if (que1.equals("Yes")){
            System.out.println("What is the balance in your car");
            int balance=s.nextInt();
            if (balance>1000){
                System.out.println("You must pay off immediately");
            }else{
                System.out.println("You may spend more");
            }


        }else {
            System.out.println("We have a very good credit card that we can offer to you");
        }


    }
}
