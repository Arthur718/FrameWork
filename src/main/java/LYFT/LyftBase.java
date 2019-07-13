package LYFT;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LyftBase {

   public WebDriver driver =  null;

    @BeforeClass
    public static void beforeClass() {

        ChromeDriverManager.chromedriver().setup();
    }

    @Before
    public void setDriver() {

        driver = new ChromeDriver();

        driver.get("https://www.lyft.com/");

    }


    @After
    public void tearDown() {
        driver.close();
        driver.quit();

    }









    public  void delay(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
