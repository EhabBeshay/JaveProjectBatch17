package Class5;

import java.util.Scanner;

public class E1LogicalOperators {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Please enter your birth month");
        String birthmonth=s.nextLine();

        if ((birthmonth.equals("March")||birthmonth.equals("April")||birthmonth.equals("May"))){
            System.out.println("You were born on Spring");
        } else if ((birthmonth.equals("June")||birthmonth.equals("July")||birthmonth.equals("August"))) {
            System.out.println("You were born on Summer");
        } else if ((birthmonth.equals("September")||birthmonth.equals("October")||birthmonth.equals("November"))) {
            System.out.println("You were born on Autumn");
        }else {
            System.out.println("You were born on Winter");
        }


    }
}
