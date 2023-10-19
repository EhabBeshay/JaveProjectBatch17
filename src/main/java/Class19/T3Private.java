package Class19;

public class T3Private {



    private void print(){
        System.out.println("Hello ! Program 3 Private Method Overloading ");
    }
    private void print(String name){
        System.out.println("Hello  My name is : "+name);
    }
    private void print(double Salary ){
        System.out.println("And My salary is "+ Salary);
    }

    public static void main(String[] args) {
        T3Private obj=new T3Private();
        obj.print();
        obj.print("Ehab");
        obj.print(1200000);

    }
    }


