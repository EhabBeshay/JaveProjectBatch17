package Class21;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] arr = {new ChromeDriver(), new Firefox()};
        for(WebDriver a :arr){
            a.openBrowser();
            a.loadURL("Amazon.com");
            a.performTesting();
            a.close();
        }
    }
}
