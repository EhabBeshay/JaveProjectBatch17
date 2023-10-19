package Class26;

import java.util.HashSet;

/*
Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order.
Each student object should have name and studentID. Display name of each student.
 */
public class Hw1 {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Mazen", 1234));
        students.add(new Student("Ali", 12345));
        students.add(new Student("Marwa", 123));
        students.add(new Student("Adam", 123456));
        students.add(new Student("Walid", 1234567));
        students.forEach(x-> System.out.println(x.displayStudentName()));


    }
}
class Student {
    private String name;
    private int id;

    public Student(String name, int id){
        this.name = name;
        this.id=id;
    }
    public String displayStudentName(){
        return name;
    }
}