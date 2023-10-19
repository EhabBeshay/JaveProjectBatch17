package Class22;

public interface Vehicle {
    void drive();

}
interface Bike extends Vehicle{
    void applyBraks();
}

class HondaBike implements Bike {

    @Override
    public void drive() {

    }

    @Override
    public void applyBraks() {

    }
}