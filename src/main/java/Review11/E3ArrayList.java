package Review11;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Jamel");
        names.add("Rai");
        names.add("Aya");
        names.add("Aya");

        System.out.println(names.size());
        System.out.println(names.get(2));
        names.remove(1);
        System.out.println(names.remove("Aya"));

        names.removeIf(x->x.equalsIgnoreCase("Aya"));
        System.out.println(names);
    }
}
