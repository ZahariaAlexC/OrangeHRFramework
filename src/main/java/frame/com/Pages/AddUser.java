package frame.com.Pages;

import frame.com.Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUser extends BasePage {

    //Add a new user
    @FindBy(xpath="//div[@class = 'orangehrm-header-container']/button")
    private WebElement addUserBtn;

    //User role
    @FindBy(xpath ="(//div[@class='oxd-input-group oxd-input-field-bottom-space']/div)[2]")
    private WebElement userRole;

    @FindBy(xpath = "//div[contains(text(),'Admin')]")
    private WebElement adminRole;

    //Employee Name
    @FindBy(xpath ="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
    private WebElement employeeName;

    //Status
    @FindBy(xpath ="(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
    private WebElement status;

    @FindBy(xpath ="//div[@class='oxd-select-text oxd-select-text--focus']")
    private WebElement enabledStatus;


    //Username
    @FindBy(xpath ="(//input[@class='oxd-input oxd-input--active oxd-input--error'])[1]")
    private WebElement username;

    //Password
    @FindBy(xpath ="(//input[@type='password'])[1]")
    private WebElement password;

    //Confirm Password
    @FindBy(xpath ="(//input[@type='password'])[2]")
    private WebElement confirmPassword;

    //Save button
    @FindBy(xpath ="//button[@type='submit']]")
    private WebElement saveBtn;

    //Cancel button
    @FindBy(xpath ="(//button[@type='button'])[2]")
    private WebElement cancelBtn;

    public void addUserBtn() {
        find(addUserBtn);
        click(addUserBtn);
    }

    public void userRole() {
        find(userRole);
        click(userRole);
        click(adminRole);
    }

    public void employeeName() {
        find(employeeName);
        clear(employeeName);
        click(employeeName);
        addText(employeeName, "Admin");
    }

    public void status() {
        find(status);
        click(status);
        click(enabledStatus);
    }

    public void username() {
        find(username);
        clear(username);
        click(username);
        addText(username, "Admin");
    }

    public void password() {
        find(password);
        clear(password);
        click(password);
        addText(password, "Adminpassword");
    }

    public void confirmPassword() {
        find(confirmPassword);
        clear(confirmPassword);
        click(confirmPassword);
        addText(confirmPassword, "Adminpassword");
    }

    public void saveBtn() {
        find(saveBtn);
        click(saveBtn);
    }
}
