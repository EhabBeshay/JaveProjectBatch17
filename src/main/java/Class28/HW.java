package Class28;

import Utils.ConfigReader;

import java.io.IOException;

/*
Create a property file to store following configurations:

browser=chrome
url=https://facebook.com/
username
password

Read file and extract values of browser & url
 */
public class HW {
    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+"\\Files\\Credentials.properties";
        String browser = ConfigReader.getProperty(path, "browser");
        String url = ConfigReader.getProperty(path, "url");
        String userName = ConfigReader.getProperty(path, "username");
        String password = ConfigReader.getProperty(path, "password");

        System.out.println("Browser name: "+browser);
        System.out.println("URL: "+url);
        System.out.println("User name: "+userName);
        System.out.println("Password: "+password);

    }
}
