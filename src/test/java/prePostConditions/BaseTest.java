package prePostConditions;

import config.Config;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import utils.TestUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class BaseTest {

    public WebDriver driver;

    @BeforeSuite
    public void setUp() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //mention the below chrome option to solve timeout exception issue
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
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