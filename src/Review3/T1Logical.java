package Review3;

import java.util.Scanner;
//Ask the user to input two boolean values (true or false).
//        Use the logical AND operator (&&) to determine if both are true.
//        Display the result to the user.
public class T1Logical {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter 2 boolean values");
        boolean b1=s.nextBoolean();
        boolean b2=s.nextBoolean();
        if (b1&&b2==true){
            System.out.println(b2&&b1);
        }
    }
}
