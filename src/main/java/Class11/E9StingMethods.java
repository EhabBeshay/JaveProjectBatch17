package Class11;

public class E9StingMethods {
    public static void main(String[] args) {
        String str = "Hi There how are you.I am good. I am driving";

        String [] strs = str.split("[.\\s]");
       // String [] strs = str.split(" ");

        System.out.println(strs.length);
        System.out.println(strs[4]);




    }
}
