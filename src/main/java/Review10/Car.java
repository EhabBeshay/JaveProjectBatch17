package Review10;

public class Car implements Washable{
    public void drive(){
        System.out.println("Driving.....");
    }

    @Override
    public void wash() {
        System.out.println("You can take a car to car wash");
    }
}
class Horse implements Washable{

    @Override
    public void wash() {
        System.out.println("Horse can wash themselves");
    }
}