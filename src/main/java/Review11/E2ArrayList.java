package Review11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(15);
        nums.add(45);
        nums.add(50);
        System.out.println(nums);
        nums.remove(new Integer(45));
        System.out.println(nums);


        ArrayList<String> names = new ArrayList<>();
        names.add("Jamil");
        names.add("Artur");
        System.out.println(names);
        names.remove("Artur");
        System.out.println(names);

    }
}
