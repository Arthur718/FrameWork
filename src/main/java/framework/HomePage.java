package framework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

    public HomePage (WebDriver driver){
        super(driver);

    }

    public void goToLoginPage() {
        //WebElement element = driver.findElement(By.xpath("//li[@id='link-to-login']/a"));
        WebElement element = objectRepo.homePage().loginLink();
        //WebElement element = homePage().loginLink();
        element.click();
    }
    public void verifyLoginSuccess() {
        //WebElement alertMsg = driver.findElement(By.cssSelector(".alert-success"));
        WebElement alertMsg = objectRepo.homePage().successMessage();
        //WebElement alertMsg = homePage().successMessage();
        String mString = alertMsg.getText();
        Assert.assertEquals("Logged in successfully", mString);
    }
   public void verifyErrorlogin(){

        WebElement ErrMsg = objectRepo.homePage().ErrorMessage();
        String eString = ErrMsg.getText();
        Assert.assertEquals("Invalid email or password.",eString);


   }







    ///public void verifyLoginError(){
     ///   WebElement errorMsg = objectRepo.homePage().Errormessage();
      ///  String err

       /* public void  LogoutSuccess (){
        WebElement logout = objectRepo.homePage().logOut();
        String lString =logout.getText();
        Assert.assertEquals("Signed out successfully",lString);
        }
      */
}


