package class8;

import java.util.Scanner;

public class E9BreakKeyword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double total = 0;
        while (true){
            System.out.println("Please enter the price of the item or -1 to terminate");
            double price = s.nextDouble();
            if (price == -1){
                break;
            }else {
                total = total+price;
            }
            System.out.println("Your total is "+total);
        }
        System.out.println("Your total is "+total);
    }
}
