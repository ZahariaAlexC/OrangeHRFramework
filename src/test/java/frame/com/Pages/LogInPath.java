package frame.com.Pages;

import frame.com.Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPath extends BasePage {

    @FindBy(xpath = "//span[text()='Time']")
    private WebElement timeOption;

}

