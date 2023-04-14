package frame.com.Pages;

import frame.com.Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimePage extends BasePage {
    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']")
    private WebElement timeOption;


    public void goToTimeOption() {

    }
}


