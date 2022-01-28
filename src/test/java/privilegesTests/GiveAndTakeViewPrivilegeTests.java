package privilegesTests;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.*;
import prePostConditions.BaseTest;
import java.io.IOException;
/**
 * All the test-method names explain the location(page) of executed test
 */
public class GiveAndTakeViewPrivilegeTests extends BaseTest {

    @Test //log in with sender credentials
    public void loginPageTest1() throws IOException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginPageMethodsDirector();
    }
    @Test //select sender TIN
    public void profileSelectionPageTest1(){
        ProfileSelectionPage profileSelectionPage = PageFactory.initElements(driver, ProfileSelectionPage.class);
        profileSelectionPage.clickTinButton();
    }
    @Test
    public void mainPageTest1(){
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.mainPageMethods();
    }
    @Test
    public void privilegesManagesPageTest1() throws IOException{
        PrivilegesManagePage privilegesManagePage = PageFactory.initElements(driver, PrivilegesManagePage.class);
        privilegesManagePage.employeeAddAllMethods();
    }
    @Test
    public void employeePageTest1(){
        EmployeePage employeePage = PageFactory.initElements(driver, EmployeePage.class);
        employeePage.clickEditButton();
    }
    @Test
    public void privilegesPageTest(){
        PrivilegesPage privilegesPage = PageFactory.initElements(driver, PrivilegesPage.class);
        privilegesPage.privilegesPageMethods();
    }
    @Test
    public void signAndSendModalWinTest(){
        SignAndSendModalWin signAndSendModalWin = PageFactory.initElements(driver, SignAndSendModalWin.class);
        signAndSendModalWin.clickSignAndSendButton();
    }
    @Test
    public void employeePageTest2(){
        EmployeePage employeePage = PageFactory.initElements(driver, EmployeePage.class);
        employeePage.clickGoToMainPageButton();
    }
    @Test
    public void privilegesManagesPageTest2(){
        PrivilegesManagePage privilegesManagePage = PageFactory.initElements(driver, PrivilegesManagePage.class);
        privilegesManagePage.assertValuesForGiving();
        privilegesManagePage.clinkEmployeeLink();
    }
    @Test
    public void employeePageTest3(){
        EmployeePage employeePage = PageFactory.initElements(driver, EmployeePage.class);
        employeePage.clickEditButton();
    }
    @Test
    public void privilegesPageTest2(){
        PrivilegesPage privilegesPage = PageFactory.initElements(driver, PrivilegesPage.class);
        privilegesPage.unselectAndSaveMethods();
    }
    @Test
    public void signAndSendModalWinTest2(){
        SignAndSendModalWin signAndSendModalWin = PageFactory.initElements(driver, SignAndSendModalWin.class);
        signAndSendModalWin.clickSignAndSendButton();
    }
    @Test
    public void employeePageTest4(){
        EmployeePage employeePage = PageFactory.initElements(driver, EmployeePage.class);
        employeePage.clickGoToMainPageButton();
    }
    @Test
    public void assertExpectedWithActual(){
        PrivilegesManagePage privilegesManagePage = PageFactory.initElements(driver, PrivilegesManagePage.class);
        privilegesManagePage.assertValuesForTaken();
    }
    @Test
    public void postCondition(){
        PrivilegesManagePage privilegesManagePage = PageFactory.initElements(driver, PrivilegesManagePage.class);
        privilegesManagePage.deleteEmployeeMethods();
    }
}