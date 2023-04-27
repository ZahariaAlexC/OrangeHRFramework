package frame.com.Pages;

import com.google.common.annotations.VisibleForTesting;
import frame.com.Base.BasePage;
import frame.com.Enums.PageLink;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimePage extends BasePage {
    @FindBy(xpath = "//span[text()='Time']")
    private WebElement timeOption;


    @FindBy(xpath = "//span[text()='Timesheets ']")
    private WebElement timesheetsBtn;

    @FindBy(xpath = "//span[text()='Attendance ']")
    private WebElement attendanceBtn;

    @FindBy(xpath = "//span[text()='Reports ']")
    private WebElement reportsBtn;

    @FindBy(xpath = "//span[text()='Project Info ']")
    private WebElement projectInfoBtn;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement typeForHintsOption;

    @FindBy(xpath = "//button[text()= ' View ']")
    private WebElement viewBtn;

//    --------------------------------------------------------------------------------------

// Time/Timesheets


    @FindBy(xpath = "//a[normalize-space()='My Timesheets']")
    private WebElement myTimesheets;

    @FindBy(xpath = "//a[text() = 'Employee Timesheets' ]")
    private WebElement employeeTimesheets;

//    -------------------------------------------------------------------------------------

//    Timesheets/MyTimesheets





    @FindBy(xpath = "//button[@class ='oxd-icon-button orangehrm-timeperiod-icon --prev']")
    private WebElement timeperiodPrev;

    @FindBy(xpath = "//button[@class ='oxd-icon-button orangehrm-timeperiod-icon --next']")
    private WebElement timeperiodNext;

    @FindBy(xpath = "//i[@class= 'oxd-icon bi-calendar oxd-date-input-icon']")
    private WebElement calendarAutomat;

    @FindBy(xpath = "//button[@class='oxd-icon-button']//i[@class='oxd-icon bi-chevron-left']")
    private WebElement chevronLeft;

    @FindBy(xpath = "//button[@class='oxd-icon-button']//i[@class='oxd-icon bi-chevron-right']")
    private WebElement chevronRight;

    @FindBy(xpath = "//div[@class='oxd-calendar-selector-month-selected']")
    private WebElement monthSelector;

    @FindBy(xpath = "//ul[@class='oxd-calendar-dropdown']")
    private WebElement calendarDropDown;

    @FindBy(xpath = "//li[normalize-space()='January']")
    private WebElement january;

    @FindBy(xpath = "//li[@class='oxd-calendar-selector-year']//p[1]")
    private WebElement selectorYear;

    @FindBy(xpath = "//div[@class='oxd-date-input-link --today']")
    private WebElement today;

    @FindBy(xpath = "//div[@class='oxd-date-input-link --clear']")
    private WebElement clear;

    @FindBy(xpath = "//div[@class='oxd-date-input-link --close']")
    private WebElement close;

    @FindBy(xpath = "//button[text()=' Edit ']")
    private WebElement editbtn;

    @FindBy (xpath = "//button[normalize-space()='Submit']")
    private WebElement submit;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement projectBox;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    private WebElement activityTextImput;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
    private WebElement focusInput;

    @FindBy(xpath = "//tbody/tr[@class='orangehrm-timesheet-table-body-row']/td[3]/div[1]/div[2]/input[1]")
    private WebElement tbody;

    @FindBy(xpath = "//i[@class='oxd-icon bi-plus']")
    private WebElement iconPlus;

    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement cancel;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement reset;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement save;

//-------------------------------------------------------------------------------------------
//    Time/Attendance

    @FindBy(xpath = "//a[normalize-space()='My Records']")
    private WebElement myrecords;

    @FindBy(xpath = "//a[normalize-space()='Punch In/Out']")
    private WebElement puchinout;

    @FindBy(xpath = "//a[normalize-space()='Employee Records']")
    private WebElement employeerecords;

    @FindBy(xpath = "//a[normalize-space()='Configuration']")
    private WebElement configuration;

//    ---------------------------------------------------------------------------------------------
//  Atendance->My Records

    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill']")
    private WebElement downfill;

    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    private WebElement calendar;

    //---------------------------------------------------------------------------------------------
    //    Methods
    public void timeOption() {
        find(timeOption);
        click(timeOption);
    }


    public void timesheetsBtn() {
        find(timesheetsBtn);
        click(timesheetsBtn);
    }

    public void attendanceBtn() {
        find(attendanceBtn);
        click(attendanceBtn);
    }

    public void reportsBtn() {
        find(reportsBtn);
        click(reportsBtn);
    }

    public void projectInfoBtn() {
        find(projectInfoBtn);
        click(projectInfoBtn);
    }

    public void typeForHint() {
        find(projectInfoBtn);
        clear(projectInfoBtn);
        click(projectInfoBtn);
    }

    public void viewBtn() {
        find(viewBtn);
        click(viewBtn);
    }

    public void myTimesheets() {
        find(myTimesheets);
        click(myTimesheets);
    }

    public void employeeTimesheets() {

    }

    public void timeperiodPrev() {

    }

    public void timeperiodNext() {

    }

    public void calendarAutomat() {

    }

    public void chevronLeft() {

    }

    public void chevronRight() {

    }

    public void monthSelector() {

    }

    public void calendarDropDown() {

    }

    public void january() {

    }

    public void selectorYear() {

    }


    public void today() {

    }

    public void clear() {

    }

    public void close() {

    }

    public void editBtn() {

    }

    public void submit(){

    }

    public void projectBox() {

    }

    public void activityTextInput() {

    }

    public void focusInput() {

    }

    public void tBody() {

    }

    public void iconPlus() {

    }

    public void cancel() {

    }

    public void reset() {

    }
    public void save() {

    }

    public void attendancebtn() {

    }

    public void myrecords() {

    }

    public void puchinout() {

    }

    public void employeerecords() {

    }

    public void configuration() {

    }

    public void downfill() {

    }

    public void calendar (){

    }







    }

