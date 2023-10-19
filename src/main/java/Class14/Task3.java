package Class14;

public class Task3 {
    public static void main(String[] args) {

        System.out.println(reversed("Ehab"));
    }

    public static String reversed (String str){

        String rev ="";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev += str.charAt(i);

        }return rev;

    }
}
