package MyMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class RahulPagination {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        List<WebElement> webElementsList = driver.findElements(By.xpath("//*[@class='table table-bordered']/tbody/tr/td[1]"));
        //scan the name col and get the text=== if the text return rice return the price
        List<String> price;
        do {
            List<WebElement> rows = driver.findElements(By.xpath("//*[@class='table table-bordered']/tbody/tr/td[1]"));

            price = rows.stream().filter(s -> s.getText().contains("Guava")).
                    map(s -> getPriceVeggie(s)).collect(Collectors.toList());
            price.forEach(s -> System.out.println(s));
            if (price.size() < 1) {
                WebElement nextBtn = driver.findElement(By.cssSelector("[aria-label='Next']"));
                nextBtn.click();
            }
        }while (price.size()<1);


    }
    public static String getPriceVeggie(WebElement s){
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;

    }
}
