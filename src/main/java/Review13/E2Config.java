package Review13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2Config {
    public static void main(String[] args) {
        String path = "C:\\Users\\ehabb\\IdeaProjects\\JavaProject\\Files\\Config.properties";
        try(FileInputStream fis = new FileInputStream(path);){

            Properties properties = new Properties();
            properties.load(fis);
            System.out.println(properties.getProperty("browser"));
        }catch (IOException e){
            System.out.println("Please check this file that you're trying to read");
        }
    }
}
