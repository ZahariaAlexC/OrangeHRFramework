package frame.com.Pages;

import frame.com.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage extends BaseTest {
    @FindBy(xpath="//span[text()='Leave']")
    private WebElement leaveOption;

    @FindBy(xpath = "//a[contains(text(), 'Apply')]")
    private WebElement apllyOption;

    @FindBy(xpath = "//a[contains(text(), 'My Leave')]")
    private WebElement myLeaveOption;

    @FindBy(xpath = " //div[contains(@class, 'oxd-table-filter-header') ]//button")
    private WebElement myLeaveDDLBtn;



    public void leaveOption(){
    find(leaveOption);
    click(leaveOption);
    }

}
