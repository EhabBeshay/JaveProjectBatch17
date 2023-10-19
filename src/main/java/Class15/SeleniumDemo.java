package Class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver c = new ChromeDriver();
        c.get("https://www.facebook.com/");
        Thread.sleep(3000);
        c.navigate().to("https://www.amazon.com/");
        System.out.println(c.getTitle());
        Thread.sleep(3000);
        c.navigate().back();
        Thread.sleep(3000);
        c.close();

    }
}
