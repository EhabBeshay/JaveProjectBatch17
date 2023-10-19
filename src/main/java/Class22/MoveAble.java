package Class22;

public interface MoveAble {

    public abstract void move();

    void method1();
}

interface WashAble{
    void wash();
    void method1();
}
class Dog implements MoveAble,WashAble{
    public  void move(){
        System.out.println("Dogs can jump, run and can move");
    }

    @Override
    public void method1() {
        System.out.println("I dont care abot the parent interface");
    }

    @Override
    public void wash() {
        System.out.println("You can safely wash a dog");
    }
}
class Car implements MoveAble, WashAble{

    @Override
    public void move() {
        System.out.println("Car can move forward and can go in circles");
    }

    public void method1() {
        System.out.println("I dont care abot the parent interface");
    }

    @Override
    public void wash() {
        System.out.println("You can safely wash cars");
    }
}