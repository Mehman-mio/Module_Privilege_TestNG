package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestUtils;

public class EmployeePage {
    private WebDriver driver;
    public EmployeePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@class='btn btn-primary']") private WebElement editButton;
    @FindBy(xpath = "//button[@class='btn btn-outline-secondary']") private WebElement goToMainPageButton;

    public void clickEditButton(){
        editButton.click();
    }
    public void clickGoToMainPageButton(){
        TestUtils.sleep(15000);
        goToMainPageButton.click();
    }
}