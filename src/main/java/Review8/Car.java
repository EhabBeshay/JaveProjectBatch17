package Review8;

public class Car {
    private String make;
    private String model;

    public Car(String make, String model){
        this.make = make;
        this.model = make;
    }
    public Car (String make){
        this();
        this.make=make;
    }
    public Car(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
    }

    public static void main(String[] args) {
        new Car("Toyota");
    }

}
