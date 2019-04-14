package framework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

    public LoginPage (WebDriver driver){
        super(driver);
    }

    public void login(String email, String password) {
        WebElement emailTextBox = driver.findElement(By.id("spree_user_email"));
        //WebElement emailTextBox = objectRepo.loginPage().emailTextbox();
        //WebElement emailTextBox = loginPage().emailTextbox();
        emailTextBox.sendKeys(email);

        WebElement passwordTextBox = driver.findElement(By.id("spree_user_password"));
        //WebElement passwordTextBox = objectRepo.loginPage().passwordTextbox();
        //WebElement passwordTextBox = loginPage().passwordTextbox();
        passwordTextBox.sendKeys(password);

        WebElement loginButton = driver.findElement(By.name("commit"));
        //WebElement loginButton = objectRepo.loginPage().loginButton();
        //WebElement loginButton = loginPage().loginButton();
        loginButton.click();

    }
}
