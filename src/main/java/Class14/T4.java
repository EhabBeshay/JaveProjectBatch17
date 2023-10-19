package Class14;


public class T4 {
    public static void main(String[] args) {
        System.out.println(T4.vowels("Ibrahim"));
    }
   private static String vowels (String str){
        str = str.replaceAll("[^a e o i u]", "");
        return str;
    }
}
