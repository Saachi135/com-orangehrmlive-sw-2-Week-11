package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl) {
        //lunch the chrome driver
        driver = new ChromeDriver();
        // open url into the browser with variable
        driver.get(baseUrl);

    }

    public void closeBrowser() {
        driver.quit(); // to  closing browser
    }
}
