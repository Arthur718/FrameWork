package StepDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookSteps  extends  StepBase{
    @Before
    public void setUP() {


        driver = DriverFactory.getInstance().getDriver();
        driver.manage().window().maximize();
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
