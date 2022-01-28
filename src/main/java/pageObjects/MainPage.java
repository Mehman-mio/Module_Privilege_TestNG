package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//label[starts-with(@class, 'exampleButton az btn')]") private WebElement selectAzLang;
    @FindBy(id = "sideBarSettingsButton") private WebElement privilegesButton;

    public void setSelectAzLang(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        selectAzLang.click();
    }
    public void clickPrivilegesButton(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        privilegesButton.click();
    }
    public void mainPageMethods(){
        setSelectAzLang();
        clickPrivilegesButton();
    }
}