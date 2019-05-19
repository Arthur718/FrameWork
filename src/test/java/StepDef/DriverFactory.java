package StepDef;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static DriverFactory instance = null;
    private ThreadLocal<WebDriver>driverCollection = new ThreadLocal<WebDriver>();
    private DriverFactory() {
    }

    public static DriverFactory getInstance() {



        return getInstance("");
    }
    public static DriverFactory getInstance(String browser){

        if (instance == null){
           instance = new DriverFactory();
        }
       if (browser== null){
           browser="";

       }

        if (instance.driverCollection.get()==null){
            if(browser.equalsIgnoreCase("chrome")) {
                ChromeDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                instance.driverCollection.set(driver);
            }
           else if (browser.equalsIgnoreCase("firefox")){
                FirefoxDriverManager.firefoxdriver().setup();
                WebDriver driver= new FirefoxDriver();
                instance.driverCollection.set(driver);

            }
            else {

                ChromeDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                instance.driverCollection.set(driver);

            }


        }







       return instance;
    }





    public WebDriver getDriver(){
        return driverCollection.get();

}
    public void removeDriver(){
        driverCollection.get().quit();
        driverCollection.remove();
    }


}
