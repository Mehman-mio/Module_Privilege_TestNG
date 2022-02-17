package pageObjects;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ProfileSelectionPage {
    private WebDriver driver;
    public ProfileSelectionPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//div[starts-with(@class,'cursor-pointer company-item d-flex justify-content-between')][1]") private WebElement tinButton;

    public void clickTinButton() {
        new WebDriverWait(driver, 20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(tinButton));
        tinButton.click();
    }
}