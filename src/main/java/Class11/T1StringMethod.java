package Class11;

public class T1StringMethod {
    public static void main(String[] args) {
       String name = "Eid";
        for (int i = 0; i < name.length(); i++) {
            if (!name.isEmpty())
            if (name.length() % 2 != 0 && name.length()>=3) {
                System.out.println(name.charAt(name.length()/2));
                break;


            }
        }


    }
}
