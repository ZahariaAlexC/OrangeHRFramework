package frame.com.Pages;

import frame.com.Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimePage extends BasePage {
    @FindBy(xpath = "//span[text()='Time']")
    private WebElement timeOption;


    @FindBy(xpath = "//div[@class='oxd-topbar-body")
    private WebElement topBarBodyOption;


    @FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']")
    private WebElement topBarBodyNavOption;


    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElement typeForHintsOption;

    @FindBy(xpath = "//button[text()= ' View ']")
    public WebElement viewButtonOption;

//    --------------------------------------------------------------------------------------

// Timeshhets

    @FindBy(xpath = "//span[text()='Timesheets']")
    private WebElement timesheetsButton;

    @FindBy(xpath = "//ul[@role='menu']")
    private WebElement dropDownMenuOption;

    @FindBy(xpath = "//a[text() = 'My Timesheets' ]")
    private WebElement myTimesheetsOption;

    @FindBy(xpath = "//a[text() = 'Employee Timesheets' ]")
    private WebElement employeeTimesheetsOption;

//    -------------------------------------------------------------------------------------

//    Timesheets/MyTimeshhet

    @FindBy(xpath = "//button[@class ='oxd-icon-button orangehrm-timeperiod-icon --prev']")
    public WebElement timeperiodPrevOption;

    @FindBy(xpath = "//button[@class ='oxd-icon-button orangehrm-timeperiod-icon --next']")
    public WebElement timeperiodNextOption;

    @FindBy(xpath = "//i[@class= 'oxd-icon bi-calendar oxd-date-input-icon']")
    public WebElement calendarAutomatOption;

    @FindBy(xpath = "//div[@class='oxd-date-input']")
    public WebElement calendarManualOption;

    @FindBy(xpath = "//button[text()=' Edit ']")
    public WebElement editbuttonOption;

    @FindBy(xpath = "//button[text()=' Submit ']")
    public WebElement submitbuttonOption;


    //    Methods
    public void goToTimeOption() {

    }
    public void goTotopBarBodyOption() {

    }
    public void goTotopBarBodyNavOption() {

    }
    public void goToTypeForHint() {

    }
    public void goToViewButton() {

    }
    public void goToTimesheetsButton() {

    }
    public void goToDropDownMenu() {

    }
    public void goToMyTimesheets() {

    }
    public void goToEmployeeTimesheets() {

    }
    public void goToTimeperiodPrev() {

    }
    public void goToTimeperiodNext() {

    }

    public void goToCalendarAutomat() {

    }
    public void goToCalendarManual() {

    }
    public void goToEditButton(){

    }
    public void goToSubmitButton(){

    }
}
