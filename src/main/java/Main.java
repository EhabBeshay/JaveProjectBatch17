import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe"); // Set the path to your ChromeDriver executable.

        WebDriver driver = new ChromeDriver();

        String url = "URL_OF_YOUR_WEB_TABLE"; // Replace with the actual URL of the web page.
        String specificValue = "TargetValue"; // The specific cell value to search for.

        driver.get(url);

        try {
            boolean hasMorePages = true;

            while (hasMorePages) {
                WebElement table = driver.findElement(By.tagName("table"));

                List<WebElement> rows = table.findElements(By.tagName("tr"));

                for (WebElement row : rows) {
                    List<WebElement> cells = row.findElements(By.tagName("td"));
                    for (WebElement cell : cells) {
                        if (cell.getText().contains(specificValue)) {
                            System.out.println(row.getText());
                            break;
                        }
                    }
                }

                // Check if there are more pages to navigate
                try {
                    WebElement nextPageLink = driver.findElement(By.linkText("Next"));
                    nextPageLink.click();
                } catch (org.openqa.selenium.NoSuchElementException e) {
                    hasMorePages = false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
