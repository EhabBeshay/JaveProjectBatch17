package Review9;

public class Animal {

     void sleep(){
        System.out.println("Animals sleep");
    }
    void speak(){
        System.out.println("Animal Speak");
    }
}
class Dog extends Animal{
    @Override
    void speak() {

        System.out.println("Wuff Suff");

    }
}