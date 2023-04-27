package frame.com.Pages;

import frame.com.Enums.PageLink;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BasePage {
    public static WebDriver driver;

    @BeforeClass(alwaysRun = true)

    public void setUp(ITestContext context){
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(PageLink.pageURL.getValue());
        context.setAttribute("WebDriver",driver);

    }

    @AfterTest(alwaysRun = true)

    public void tearDown(){
        driver.quit();
    }
}
