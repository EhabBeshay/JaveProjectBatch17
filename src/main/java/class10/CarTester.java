package class10;

public class CarTester {
    public static void main(String[] args) {
        Car suv = new Car();
        suv.size = "SUV";
        suv.model = "2011";
        suv.type ="Suv";
        System.out.println(suv.model);
        System.out.println(suv.size);
        suv.speed();


        Car sportCar = new Car();
        sportCar.size = "Small";
        sportCar.type = "Sport Car";
        sportCar.speed();
        System.out.println(sportCar.size);



    }
}
