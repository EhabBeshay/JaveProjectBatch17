package Class4;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your total years of work");
        int years=s.nextInt();
        if (years>=5){
            System.out.println("You are eligible for Bonus");
            System.out.println("Please Enter your annual salary");
            int salary=s.nextInt();
            if (salary>50000){
                System.out.println("Congratulations, your Bonus is 5000");
            } else if (salary<50000) {
                System.out.println("Congratulations, your Bonus is 3000");
            }
        }else{
            System.out.println("Sorry you are not eligible for Bonus");
        }
    }
}
