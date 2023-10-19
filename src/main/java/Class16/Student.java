package Class16;

public class Student {

    private String name;
    private String address;

    public Student(String name, String address){
        this.name = name;
        this.address = address;
    }
    public void displyInfo(){
        System.out.println(name +" "+ address);
    }

    public static void main(String[] args) {
        new Student("Ashraf", "125 bushpkwy").displyInfo();
    }
}
