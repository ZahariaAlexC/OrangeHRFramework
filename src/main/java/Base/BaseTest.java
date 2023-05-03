package Base;


import Pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class BaseTest {
    protected WebDriver driver;
    Actions action;

    public BaseTest() {
        this.driver = BasePage.driver;
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
    }

    private WebDriverWait weitElement() {
        return new WebDriverWait(driver, 30);
    }

    protected WebElement find(WebElement locator) {
        weitElement().until(ExpectedConditions.visibilityOf(locator));
        return locator;
    }

    protected WebElement clickAble(WebElement locator) {
        weitElement().until(ExpectedConditions.elementToBeClickable(locator));
        return locator;
    }

    protected void addText(WebElement locator, String text) {
        locator.clear();
        locator.sendKeys(text);
    }

    protected void clear(WebElement locator) {
        if (getOperationSystem().contains("Windows")) {
            locator.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        } else if (getOperationSystem().contains("Mac OS X")) {
            locator.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        }
    }

    private String getOperationSystem() {
        String operateSystem = System.getProperty("os.name");
        return operateSystem;
    }

    protected void click(WebElement locator) {
        clickAble(locator).click();
    }

    protected String getPageTitle() {
        return driver.getTitle();
    }

    protected String getURL() {
        return driver.getCurrentUrl();
    }

    protected void visit(String url) {
        driver.get(url);
    }

    protected WebElement listOfElements(List<WebElement> elementList, String text) {
        WebElement element = null;
        for (int i = 0; i < elementList.size(); i++) {
            if (elementList.get(i).getText().equalsIgnoreCase(text)) {
                element = elementList.get(i);
                break;
            }

        }
        return element;
    }
    protected void movetoElement(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

}


