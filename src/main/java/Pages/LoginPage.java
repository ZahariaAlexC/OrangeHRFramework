package Pages;

import Base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.Assert;

import static Pages.BasePage.logger;

public class LoginPage extends BaseTest {
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement userName;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginBtn;
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    private WebElement dasboardText;

    public void username(String username) {
        click(userName);
        addText(userName, username);
    }

    public void password(String password) {
        click(this.password);
        addText(this.password, password);
    }

    public void clickSignInBtn() {
        click(loginBtn);
    }

    public void checkPage() {
        find(dasboardText);
        Assert.assertTrue(dasboardText.isDisplayed(), "Dasboard Title is not displayed");
        logger.log(LogStatus.PASS, "Dashboard title is displayed");
    }

}
