package Class12;

import java.util.Scanner;

public class HW3Tester {
    public static void main(String[] args) {
        HW3Palindrome palindrome = new HW3Palindrome();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (palindrome.isPalindrome(input)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }

    }
}
