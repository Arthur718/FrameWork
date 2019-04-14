package OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject extends PageObjectBase {
    public  HomePageObject(WebDriver driver){
        super(driver);

    }
    public WebElement loginLink(){

        WebElement element = driver.findElement(By.xpath("//li[@id='link-to-login']/a"));
        return element;
    }
    public WebElement successMessage(){
        WebElement alertMsg = driver.findElement(By.cssSelector(".alert-success"));
        return alertMsg;

    }
}
