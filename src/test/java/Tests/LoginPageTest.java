package Tests;

import Pages.BasePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;



public class LoginPageTest extends BasePage {


	public LoginPage login(){
		return new LoginPage();
	}


	@Test(priority=0, description = " Happy Test")
	@Parameters({"username", "password"})
	public void verifyLogin(String username, String password) {
		login().username(username);
		logger.log(LogStatus.PASS, "Entering valid username");
		login().password(password);
		logger.log(LogStatus.PASS, "Entering valid password");
		login().clickSignInBtn();
		logger.log(LogStatus.PASS, "Clicking Sign in button");
		login().checkPage();
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		logger.log(LogStatus.PASS, "HomePage is displayed");
	}


	@Test(priority = 1, description = "Negative test")
	@Parameters({"username", "password"})
	public void negativeLoginIn(String username, String password){
		login().username(username);
		logger.log(LogStatus.PASS, "Entering valid username");
		login().password(password);
		logger.log(LogStatus.PASS, "Entering valid password");
		login().clickSignInBtn();
		logger.log(LogStatus.PASS, "Clicking Sign in button");
		login().checkPage();
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		logger.log(LogStatus.PASS, "HomePage is displayed");

	}

	@DataProvider(name = "LoginPage object")
	public Object[] loginInstance(){
		LoginPage login = new LoginPage();
		return new Object[] {new Object[] {login}};
	}


}	
