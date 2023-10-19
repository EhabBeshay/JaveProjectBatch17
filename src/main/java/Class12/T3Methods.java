package Class12;

public class T3Methods {
    void isPalindrome (String str ){

        boolean isPalindrome = true;

        for (int i = 0, j = str.length()-1; i <  j; i++, j--){
            if (str.charAt(i) == str.charAt(j))
                continue;

            isPalindrome = false;
            break;


        }
        System.out.println(isPalindrome ? "palindrome" : "not Palindrome");



    }
}
