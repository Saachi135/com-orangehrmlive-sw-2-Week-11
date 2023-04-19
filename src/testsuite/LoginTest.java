package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        // Enter Admin username
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Admin1");
        //Enter "admin123" password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin1234");
        //Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        loginButton.click();
        //Verity the Display text 'Dashboard'
        String expectedMessage = "Dashboard";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("DashBoard not Displayed", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
