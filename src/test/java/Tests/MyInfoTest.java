package Tests;

import Pages.BasePage;
import Pages.LoginPage;
import Pages.PersonalDetails;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MyInfoTest extends BasePage {


    public PersonalDetails myInfo(){
        return new PersonalDetails();
    }

    public LoginPage login(){
        return new LoginPage();
    }



    @Test(priority = 0, description = "Happy Test MyInfo Page")
    @Parameters({"name", "lastname", "license", "nationality", "maritalStatus"
            ,"gender", "bloodType"})
    public void myInfoPage(String name, String lastname, String license, String nationality,
                           String maritalStatus, String gender, String bloodType){

        login().username("Admin");
        logger.log(LogStatus.PASS, "Entering valid username");
        login().password("admin123");
        logger.log(LogStatus.PASS, "Entering valid password");
        login().clickSignInBtn();
        logger.log(LogStatus.PASS, "Clicking Sign in button");
        login().checkPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        logger.log(LogStatus.PASS, "HomePage is displayed");
        myInfo().goToPage();
        logger.log(LogStatus.PASS, "My info Page is displayed");
        myInfo().name(name);
        logger.log(LogStatus.PASS, "Name value is displayed ");
        myInfo().middleName(lastname);
        logger.log(LogStatus.PASS, "LastName value is displayed ");
        myInfo().driverLicense(license);
        logger.log(LogStatus.PASS, "license value is displayed ");
        myInfo().licenseDate();
        logger.log(LogStatus.PASS, "licenseDate value is displayed ");
        myInfo().nationality(nationality);
        logger.log(LogStatus.PASS, "Nationality value is displayed ");
        myInfo().maritalStatus(maritalStatus);
        logger.log(LogStatus.PASS, "Marital value is displayed ");
        myInfo().dateofBirth();
        logger.log(LogStatus.PASS, "Date value is displayed ");
        myInfo().gender(gender);
        logger.log(LogStatus.PASS, "Gender value is displayed ");
        myInfo().smoker();
        logger.log(LogStatus.PASS, "Smoker value is displayed ");
        myInfo().save();
        myInfo().bloodType(bloodType);
        logger.log(LogStatus.PASS, "BloodType value is displayed ");
    }
}
