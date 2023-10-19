package Class13;

public class E4StringBuilder {
    public static void main(String[] args) {
        String str = new String("Habib");
        String name = "Habib";

        StringBuilder stringBuilder = new StringBuilder("Ehab");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.append("d");
        System.out.println(stringBuilder);

    }
}
