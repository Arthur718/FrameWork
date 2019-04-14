package OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject extends PageObjectBase {
    public LoginPageObject(WebDriver driver){
        super(driver);
    }

    public WebElement emailTextbox(){
        WebElement emailTextBox = driver.findElement(By.id("spree_user_email"));
        return emailTextBox;

    }

  public WebElement passwordTextbox(){
      WebElement passwordTextBox = driver.findElement(By.id("spree_user_password"));
      return passwordTextBox;
  }

  public WebElement loginButton() {
      WebElement loginButton = driver.findElement(By.name("commit"));
      return loginButton;
  }

}



