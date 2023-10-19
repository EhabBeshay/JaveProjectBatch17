package Class22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTester {

    public static void main(String[] args) throws InterruptedException {
        WebDriver[] a = {new ChromeDriver(), new FirefoxDriver(), new EdgeDriver()};
        for (WebDriver w : a) {
            w.manage().window().maximize();
            Thread.sleep(2000);
            w.navigate().to("https://amazon.com");
            Thread.sleep(2000);
            System.out.println(w.getTitle());
            Thread.sleep(2000);
            w.close();
        }
    }
}