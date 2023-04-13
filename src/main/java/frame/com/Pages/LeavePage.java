package frame.com.Pages;

import frame.com.Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage extends BasePage {
    @FindBy(xpath="//span[text()='Leave']")
    private WebElement leaveOption;

    public void goToLeaveOption(){

    }

}
