package StepDef;

import org.openqa.selenium.WebDriver;

public class StepBase {

    protected WebDriver driver = DriverFactory.getInstance("firefox").getDriver();

}
