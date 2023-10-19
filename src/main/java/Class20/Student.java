package Class20;

public class Student {

    public void study(){
        System.out.println("Study parent");
    }
    public void eat(){
        System.out.println("Eat parent");
    }
    public void drink(){
        System.out.println("Drink parent");
    }
}
class SyntaxStudent extends Student{
    @Override
    public void study() {
        System.out.println("Study hard ");
    }
}
class  CollegeStudent extends Student{
    @Override
    public void eat() {
        System.out.println("College student does not eat");
    }
}
class SchoolStudent extends Student{

}