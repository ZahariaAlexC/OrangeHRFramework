package frame.com.Pages;

import frame.com.Base.BaseTest;
import frame.com.Enums.PageLink;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimePage extends BaseTest {
    @FindBy(xpath = "//span[text()='Time']")
    private WebElement timeOption;


    @FindBy(xpath = "//div[@class='oxd-topbar-body")
    private WebElement topBarBodyOption;


    @FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']")
    private WebElement topBarBodyNavOption;

    @FindBy(xpath = "//span[text()='Timesheets ']")
    private WebElement timesheetsButton;

    @FindBy(xpath = "//span[text()='Attendance ']")
    private WebElement attendanceButton;

    @FindBy(xpath = "//span[text()='Reports ']")
    private WebElement reportsButton;

    @FindBy(xpath = "//span[text()='Project Info ']")
    private WebElement projectInfoButton;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElement typeForHintsOption;

    @FindBy(xpath = "//button[text()= ' View ']")
    public WebElement viewButtonOption;

//    --------------------------------------------------------------------------------------

// Time/Timesheets


    @FindBy(xpath = "//ul[@role='menu']")
    private WebElement dropDownMenuOption;

    @FindBy(xpath = "//a[text() = 'My Timesheets' ]")
    private WebElement myTimesheetsOption;

    @FindBy(xpath = "//a[text() = 'Employee Timesheets' ]")
    private WebElement employeeTimesheetsOption;

//    -------------------------------------------------------------------------------------

//    Timesheets/MyTimesheets

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

//-------------------------------------------------------------------------------------------
//    Time/Attendance





//---------------------------------------------------------------------------------------------
    //    Methods
    public void goToTimeOption() {

    }

    public void goTotopBarBodyOption() {

    }

    public void goTotopBarBodyNavOption() {

    }

    public void goToTimesheetsButton() {

    }
    public void goToAttendanceButton() {

    }
    public void goToReportsButton() {

    }
    public void goToPublicInfoButton() {

    }
    public void goToTypeForHint() {

    }
    public void goToViewButton() {

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

    public void goToEditButton() {

    }

    public void goToSubmitButton() {
        PageLink pageLink = PageLink.pageURL;
        System.out.println(pageLink.getValue());

    }

    public static void main(String[] args) {

        TimePage obj = new TimePage();
        obj.goToSubmitButton();

    }



}
