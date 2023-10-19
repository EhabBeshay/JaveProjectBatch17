package Review10;

public class Animal {

    void speak(){
        System.out.println("Animal Speak");
    }
    void eat(){
        System.out.println("Animals eat");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Wuuuf uuuf");
    }

    @Override
    void eat() {
        System.out.println("Dog like to eat bones");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Mewooooooooooooo");
    }

    @Override
    void eat() {
        System.out.println("Cat like to eat milk");
    }
}
