package StepDef;

import org.openqa.selenium.WebDriver;

public class StepBase {

    protected WebDriver driver = DriverFactory.getInstance().getDriver();


    public void delay(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}