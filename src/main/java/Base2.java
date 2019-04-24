import in.or.IHomePageOr;
import in.or.ILoginPageOR;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ExelObjectRepositoryManager;
import utils.ObjectRepositoryReaderManager;

public class Base2  implements IHomePageOr, ILoginPageOR
{protected WebDriver driver = null;
   // protected ObjectRepositoryReaderManager OR  = ObjectRepositoryReaderManager.getInstance();
   // protected ExcelObjectRepositoryManager  or = ExcelObjectRepositoryManager.getInstance();
   protected ExelObjectRepositoryManager OR = ExelObjectRepositoryManager.getInstance();

    @Before
    public void setUp() {
        //ChromeDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") +"/driver/chromedriver");


        driver = new ChromeDriver();

       // driver.get("http://spree.shiftedtech.com/");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    public void browserToUrl(String url) {
        driver.navigate().to(url);
    }

    public void click(String locator) {
        By by = getLocator(locator);
        WebElement element = driver.findElement(by);
        element.click();
    }
    public void inputText(String locator, String text) {
        By by = getLocator(locator);
        WebElement element = driver.findElement(by);
        element.sendKeys(text);
    }
    public void verifyText(String locator, String expectedText) {
        By by = getLocator(locator);
        WebElement element = driver.findElement(by);

        String actualText = element.getText();

        Assert.assertEquals(expectedText, actualText);
    }
    public void delayFor(int timeToDelay) {
        try {
            Thread.sleep(timeToDelay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public By getLocator(String locator) {
        By by = null;
        String locatorBy = locator.split(":")[0];
        String locatorUsing = locator.split(":")[1];

        if(locatorBy.trim().toUpperCase().contentEquals("ID")) {
            by = By.id(locatorUsing);
        }
        else if(locatorBy.trim().toUpperCase().contentEquals("NAME")) {
            by = By.name(locatorUsing);
        }
        else if(locatorBy.trim().toUpperCase().contentEquals("XPATH")) {
            by = By.xpath(locatorUsing);
        }
        else if(locatorBy.trim().toUpperCase().contentEquals("CSS")) {
            by = By.cssSelector(locatorUsing);
        }
        else if(locatorBy.trim().toUpperCase().contentEquals("LINKTEXT")) {
            by = By.linkText(locatorUsing);
        }
        else if(locatorBy.trim().toUpperCase().contentEquals("PERTIALLINKTEXT")) {
            by = By.partialLinkText(locatorUsing);
        }
        else if(locatorBy.trim().toUpperCase().contentEquals("TAGNAME")) {
            by = By.tagName(locatorUsing);
        }
        else if(locatorBy.trim().toUpperCase().contentEquals("CLASSNAME")) {
            by = By.className(locatorUsing);
        }
        return by;
    }
}
