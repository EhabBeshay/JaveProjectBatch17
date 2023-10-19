package Review9;

public class Printer {
     void print(){
        System.out.println("Hello");

    }
     void print(String word){
        System.out.println(word);
    }
     void print( int number,String word){
        System.out.println(number+" "+word);
    }
    // var args
    void print (int ...a){
        System.out.println(a[1]);

    }


    public static void main(String[] args) {

    }


}
