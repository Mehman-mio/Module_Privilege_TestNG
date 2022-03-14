package prePostConditions;

import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.TestUtils;
import java.io.IOException;

public class BaseTest {

    public WebDriver driver;

    @BeforeSuite
    public void setUp() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Config.getUrl());
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @AfterSuite
    public void tearDown(){
        TestUtils.sleep(5000);
        driver.quit();
    }
}