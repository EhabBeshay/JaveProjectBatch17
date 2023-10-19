package Class14;

public class T1ReverseWords {

    /*
    How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
     */
    public static void main(String[] args) {

        String str = "This is sentence i want to reverse";
//        StringBuilder sb=new StringBuilder("This is sentence i want to reverse");
//        sb.reverse();
//        System.out.println(sb);

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
          String word = arr[i];
          String reversed = reverseStr(word);
            System.out.print(reversed + " ");


        }

    }

    static String reverseStr(String input) {
        String reversed = " ";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);

        }

        return reversed;

    }
}

