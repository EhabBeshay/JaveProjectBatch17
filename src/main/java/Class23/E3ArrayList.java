package Class23;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(12);
        arr.add("Ehab");

        checkPrint(arr);
    }
    static void checkPrint(ArrayList aa){
            for(Object d : aa){
                String str = (String) d;
                System.out.println(str.length());
        }

    }
}
