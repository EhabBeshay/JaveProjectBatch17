package Class21;

public abstract class WebDriver {
    abstract void openBrowser();
    abstract void loadURL(String url);
    abstract void performTesting();
    abstract void close();
}
class ChromeDriver extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Opening the Google chrome");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the url in Chrome"+ url);

    }

    @Override
    void performTesting() {
        System.out.println("Performing testing on Chrome");
    }

    @Override
    void close() {
        System.out.println("Close chrome");
    }
}
class Firefox extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Open firefox");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Load to firefox"+url);

    }

    @Override
    void performTesting() {
        System.out.println("Load on firefox");

    }

    @Override
    void close() {
        System.out.println("Close firefox");

    }
}
