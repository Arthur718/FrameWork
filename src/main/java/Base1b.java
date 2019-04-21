import framework.AplicationControler;
import framework.HomePage;
import framework.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1b {
    private WebDriver driver = null;
    private AplicationControler spree;


    @BeforeClass
    public static void beforeClass(){
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") +"/driver/chromedriver");

    }









    @Before


    public void setDriver() {
        //ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        spree = new AplicationControler(driver);
        driver.get("http://spree.shiftedtech.com/");



        /*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().fullscreen(); */


    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
        spree= null;
    }
    public AplicationControler spree(){
        return spree;
    }

    public void delay(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
