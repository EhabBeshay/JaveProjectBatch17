package Class15;

public class T1 {

    private String name;

    public T1(){
        System.out.println("Constructor 1 has no parameters" );
    }
   public T1(String sName){
        name = sName;
        System.out.println("Constructor 2 has 1 parameter " + name);
    }
}
