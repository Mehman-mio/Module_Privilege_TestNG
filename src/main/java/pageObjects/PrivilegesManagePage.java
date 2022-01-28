package pageObjects;

import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PrivilegesManagePage {
    private WebDriver driver;
    String expectedResultGiving = "Verilib";
    String expectedResultTaken = "Verilməyib";
    public PrivilegesManagePage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@class='btn btn-primary']") private WebElement newEmployeeButton;
    @FindBy(name = "fin") private WebElement finField;
    @FindBy(name = "passportSerialNumber") private WebElement passportSerialNumField;
    @FindBy(xpath = "//button[@class='position-relative  btn btn-primary']") private  WebElement checkButton;
    @FindBy(xpath = "//button[@class='position-relative mr-3 btn btn-primary']") private WebElement addButton;
    @FindBy(xpath = "//a[text()='61MJK57']/parent::*/parent::*/parent::*/following-sibling::*[1]") private WebElement actualGivenText;
    @FindBy(xpath = "//a[text()='61MJK57']") private WebElement employeeLink;
    @FindBy(xpath = "//a[text()='61MJK57']/parent::*/parent::*/parent::*/following-sibling::*[1]") private WebElement actualTakenText;
    @FindBy(xpath = "//a[text()='61MJK57']/parent::*/parent::*/parent::*/following-sibling::*[3]//button") private WebElement deleteButton;
    @FindBy(xpath = "//button[@class='position-relative  btn btn-primary']") private WebElement deleteConfirmButton;

    public void clickNewEmployeeButton(){
        newEmployeeButton.click();
    }
    public void inputFinField(String fin){
        finField.sendKeys(fin);
    }
    public void inputCardIdField(String cardId){
        passportSerialNumField.sendKeys(cardId);
    }
    public void clickCheckButton(){
        checkButton.click();
    }
    public void clickAddButton(){
        addButton.click();
    }
    public void employeeAddAllMethods() throws IOException {
        clickNewEmployeeButton();
        inputFinField(Config.getEmployeeFin());
        inputCardIdField(Config.getEmployeeIdCardNumber());
        clickCheckButton();
        clickAddButton();
    }
    public String getActualAndAssertGiven(){
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        return actualGivenText.getText();
    }
    public void assertValuesForGiving(){
        Assert.assertEquals(expectedResultGiving, getActualAndAssertGiven(), "Privileges was not given");
    }
    public void clinkEmployeeLink(){
        employeeLink.click();
    }
    public String getActualAndAssertTaken(){
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        return actualTakenText.getText();
    }
    public void assertValuesForTaken(){
        Assert.assertEquals(expectedResultTaken, getActualAndAssertTaken(), "Privileges was not taken");
    }
    public void deleteEmployee(){
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        deleteButton.click();
    }
    public void clickDeleteConfirmButton(){
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        deleteConfirmButton.click();
    }
    public void deleteEmployeeMethods(){
        deleteEmployee();
        clickDeleteConfirmButton();
    }
}