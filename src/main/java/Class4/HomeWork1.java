package Class4;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("What is the amount you need as a loan");
        int loanNeeded=s.nextInt();
        if (loanNeeded<=200000){
            System.out.println("Congratulations, your loan was approved");
        }else {
            System.out.println("Sorry we weren't able to approve your loan");
        }
    }
}
