package Review8;

public class Dog {
    String name;
    String color;
    String breed;

    public void add(int num1, int num2) {

        int sum = num1 + num2;
        System.out.println(sum);
    }
}

class DogTester {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "kacy";
        d.color = "Green";
        Dog d2 = new Dog();
        d2.name = "Chum";
        d2.color = "Black";
    }
}
