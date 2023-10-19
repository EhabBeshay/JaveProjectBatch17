package Class11;

public class T5StringMethod {
    public static void main(String[] args) {
       String str = "dsgdgdfg2353653^$#^%fhdgjd55242";

       String newstr = str.replaceAll("[^a-zA-Z]","");
        System.out.println(newstr.length());




    }
}
