package Class12;

public class HW3Palindrome {
    /*

Create a method that will print
whether given String is palindrome or not.
     */

    boolean isPalindrome (String str){

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
