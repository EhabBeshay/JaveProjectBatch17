package Class18;

/*
Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make fields private
and define printInfo methods as well create the object of each class and call the methods
 */
public class Bird {
    private String name;
    private int age;
    private String color;
    private boolean flies;

    public Bird(String name, int age, String color, boolean flies) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.flies = flies;

    }

    public void printInfo() {
        System.out.println("Bird name: " + name + "\n" +
                " Bird age: " + age + "\n" + " Bird color: " + color+"\n" + " Bird wings: " + flies);

    }
}
    class Sparrow extends Bird{
    public Sparrow (String name, int age, String color, boolean flies){
        super(name, age, color, flies);

    }

    }
    class Parrot extends Bird{
    public Parrot (String name, int age, String color, boolean flies){
        super(name, age, color, flies);

    }}
class BirdTester {
    public static void main(String[] args) {
        Sparrow s = new Sparrow("Adam", 5, "Red", true);
        s.printInfo();
        System.out.println("============================");
        Parrot p = new Parrot("Aywa",4, "Yellow", false);
        p.printInfo();
    }
}