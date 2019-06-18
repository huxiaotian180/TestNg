package TestNG_Parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by DELL on 2019/6/17.
 */
public class TestNG_SeleniumParametersParallelExample {

    WebDriver driver;
    String baseURL;

    @BeforeClass
    @Parameters({ "browser" })
    public void setUp(String browser) {
        baseURL = "https://www.imooc.com";
        if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "D:\\Workspace_personal\\Selenium\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Workspace_personal\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();
        }
//		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @Test
    public void testLogin() {
        WebElement loginLink =driver.findElement(By.id("js-signin-btn"));
        loginLink.click();
        WebElement userNameField = driver.findElement(By.xpath("//input[starts-with(@placeholder,'请输入登录')]"));
        userNameField.sendKeys("13888888888");
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@placeholder,'6-16')]"));
        password.sendKeys("abcabcabc");

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='登录']"));
        loginButton.click();

    }

    @AfterClass
    public void cleanUp() {
        driver.quit();
    }
}
