package class10;public class DogTester {
    public static void main(String[] args) {
        Dog lunasObj = new Dog();
        lunasObj.name = "Luna";
        lunasObj.gender = 'F';
        lunasObj.breed = "Shiba";
        lunasObj.age = 20;
        lunasObj.weight = 10;
        System.out.println(lunasObj.name);
        System.out.println(lunasObj.age);
        System.out.println(lunasObj.breed);
        lunasObj.eat();
        lunasObj.sleep();
        lunasObj.bark();
    }
}
