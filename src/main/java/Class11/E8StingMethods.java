package Class11;

public class E8StingMethods {
    public static void main(String[] args) {
        String str = "Hi There how are you. I am good";

        String [] strs = str.split("[.]");
        System.out.println(strs.length);
        System.out.println(strs[1].trim());

    }
}
