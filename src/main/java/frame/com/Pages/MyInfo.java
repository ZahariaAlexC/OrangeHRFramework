package frame.com.Pages;

import frame.com.Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyInfo extends BasePage {

    @FindBy(xpath = "//span[text()='My Info']")
    private WebElement myInfoBtn;
    @FindBy(xpath = "//a[text()='Personal Details'")
    private WebElement personalDetailsBtn;
    @FindBy(xpath = "//input[@name='firstName'")
    private WebElement firstNameTextBox;
    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement middleNameTextBox;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameTextbox;
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[2]/div/div/div[2]")
    private WebElement nickName;
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement employeeIDFirstName;
    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement employeeIDMiddleName;

    @FindBy(xpath = "//form/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/i[1]")
    private WebElement licenseExpiryDateCalendarDDList;

    @FindBy(xpath = "//div[@class='oxd-date-input-link --today']")
    private WebElement todayBtn;

    public void myInfoBtn() {
        find(myInfoBtn);
        click(myInfoBtn);
    }

    public void personalDetailsBtn() {
        find(personalDetailsBtn);
        click(personalDetailsBtn);
    }

    public void firstNameTextBox() {
        find(firstNameTextBox);
        clear(firstNameTextBox);
        click(firstNameTextBox);

    }

    public void middleNameTextBox() {
        find(middleNameTextBox);
        clear(middleNameTextBox);
        click(middleNameTextBox);
    }

    public void lastNameTextbox() {
        find(lastNameTextbox);
        clear(lastNameTextbox);
        click(lastNameTextbox);
    }

    public void nickName() {
        find(nickName);
        clear(nickName);
        click(nickName);
    }

    public void employeeIDFirstName() {
        find(employeeIDFirstName);
        clear(employeeIDFirstName);
        click(employeeIDFirstName);
    }

    public void employeeIDMiddleName() {
        find(employeeIDMiddleName);
        clear(employeeIDMiddleName);
        click(employeeIDMiddleName);
    }

    public void licenseExpiryDateCalendarDDList() {
        find(licenseExpiryDateCalendarDDList);
        click(licenseExpiryDateCalendarDDList);
        click(todayBtn);
    }

}
