package framework;

import OR.ObjectRepository;
import org.openqa.selenium.WebDriver;

public class PageBase {
    protected WebDriver driver = null;
    protected ObjectRepository objectRepo;

    public PageBase(WebDriver driver) {
        //super(driver);
        //this.driver=driver;
        objectRepo = new ObjectRepository(driver);
    }

    public void delay(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}