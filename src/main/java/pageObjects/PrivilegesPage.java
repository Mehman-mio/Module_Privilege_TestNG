package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class PrivilegesPage {
    private WebDriver driver;
    public PrivilegesPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//input[@id='E_PORTAL.MESSAGE_view']/following-sibling::*") private WebElement viewMessageCheckbox;
    @FindBy(xpath = "//button[@class='btn btn-primary']") private WebElement saveButton;

    public void selectViewCheckbox(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        viewMessageCheckbox.click();
    }
    public void clickSaveButton(){
        saveButton.click();
    }
    public void privilegesPageMethods(){
        selectViewCheckbox();
        clickSaveButton();
    }
    public void unselectViewCheckbox(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        viewMessageCheckbox.click();
    }
    public void unselectAndSaveMethods(){
        unselectViewCheckbox();
        clickSaveButton();
    }
}