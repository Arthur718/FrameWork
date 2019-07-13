package LYFT;

import org.openqa.selenium.WebDriver;

public class LyftPageBase {


    protected WebDriver driver;

    public LyftPageBase(WebDriver driver) {
        this.driver = driver;
    }




    public void delay(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
