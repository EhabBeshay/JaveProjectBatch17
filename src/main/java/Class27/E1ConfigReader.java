package Class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        //Locate the file
        //String path = "C:\\Users\\ehabb\\IdeaProjects\\JavaProject\\Files\\Config.properties";
        String path = System.getProperty("user.dir")+"\\Files\\Config.properties";
        System.out.println(path);
        // move the file from teh permanent storage to the RAM
        FileInputStream fis = new FileInputStream(path);
        //That one class / software that will assist us to read data from the file
        Properties properties = new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("URL"));
        //This line gives the location of your intelliji project on your computer
        System.out.println(System.getProperty("user.dir"));

    }
}
