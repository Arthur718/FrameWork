package StepDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class HookSteps  extends  StepBase{
    @Before
    public void setUP() {


        driver = DriverFactory.getInstance().getDriver();

        //System.setProperty("webdriver.chrome.driver",
        //System.getProperty("user.dir") +"/driver/chromedriver");


        //ChromeDriverManager.chromedriver().setup();
        //driver= new ChromeDriver();}
    }
    @After
    public void  tearDown() {

        DriverFactory.getInstance().removeDriver();
    }




}
