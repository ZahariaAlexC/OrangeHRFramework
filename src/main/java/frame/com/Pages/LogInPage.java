package frame.com.Pages;

import frame.com.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BaseTest {
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement userName;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginBtn;
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    private WebElement dasboardText;

    public void userName(String username){
        find(userName);
        clear(userName);
        addText(userName,username);
    }
    public void password(String password){
        find(this.password);
        clear(this.password);
        addText(this.password, password);
    }

    public void loginBtn(){
        find(loginBtn);
        click(loginBtn);
    }

}

