package LYFT;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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





    public void scrollToElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void highlight(WebElement element) {
        for (int i = 0; i < 3; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "border: 5px solid red;");
             delay(200);
            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element, "");
               delay(2000);
        }
    }








    public  void delay(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
