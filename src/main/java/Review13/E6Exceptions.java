package Review13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileInputStream fileInputStream = new FileInputStream("dasdasdas");
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();

        }
    }
}
