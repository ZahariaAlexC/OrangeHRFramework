package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaveTest extends BaseTest {
    @FindBy(xpath="//span[text()='Leave']")
    private WebElement leaveOption;

    public void goToLeaveOption(){

    }

}
