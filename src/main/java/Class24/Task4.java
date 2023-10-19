package Class24;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");
        System.out.println("Before: "+ words);

        /*for (int i = words.size()-1; i > 0; i--) {
            if (words.get(i).endsWith("e")){
                words.remove(i);
            }*/
        /*words.removeIf((String x)->{
            if(x.endsWith("e")){
                return true;
            }else {
                return  false;
            }
        });*/

        words.removeIf( x->x.endsWith("e"));


        System.out.println("After: "+ words);
    }
}
