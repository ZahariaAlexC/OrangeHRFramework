package Tests;

import frame.com.Pages.BasePage;
import frame.com.Pages.LogInPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest extends BasePage {
    @Test(priority = 0 )
    @Parameters({"username", "password"})

    public void verifyLogIn(String username, String password){
        LogInPage logInPage = new LogInPage();
        logInPage.userName(username);
        logInPage.password(password);
        logInPage.loginBtn();
    }



}
