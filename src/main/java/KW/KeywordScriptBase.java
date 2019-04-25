package KW;

import in.or.OR;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ExelObjectRepositoryManager;
import utils.ObjectRepositoryReaderManager;

public class KeywordScriptBase {protected WebDriver driver = null;
    protected ObjectRepositoryReaderManager OR  = ObjectRepositoryReaderManager.getInstance();
    // protected ExcelObjectRepositoryManager  or = ExcelObjectRepositoryManager.getInstance();
    //protected ExelObjectRepositoryManager OR = ExelObjectRepositoryManager.getInstance();

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


}
