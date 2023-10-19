package Class20;

public class E4PolyMor {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal [] arr = {new Cat(), new Dog(), new Animal()};
        for (int i = 0;  i< arr.length; i++) {
            arr[i].eat();
            arr[i].sleep();
            arr[i].speak();
        }
    }
}
