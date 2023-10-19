package MyMethods;

public class IsPalindrome {
    public static String isPalindrome(String input) {
        boolean isPalindrome = true;

        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
            if (input.charAt(i) == input.charAt(j))
                continue;

            isPalindrome = false;
            break;


        }
        return isPalindrome ? "Palindrome" : "Not Palindrome";
    }
}
