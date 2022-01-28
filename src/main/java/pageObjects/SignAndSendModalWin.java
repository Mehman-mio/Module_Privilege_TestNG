package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

public class SignAndSendModalWin {
    private WebDriver driver;
    public SignAndSendModalWin(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@class='ml-2 btn btn-primary']") private WebElement signAndSendButton;

    public void clickSignAndSendButton(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        signAndSendButton.click();
    }
}