package OR;

import org.openqa.selenium.WebDriver;

public class ObjectRepository {
    private HomePageObject homePageObject;
    private LoginPageObject loginPageObject;


    public  ObjectRepository(WebDriver driver){
        homePageObject = new HomePageObject(driver);
        loginPageObject= new LoginPageObject(driver);

    }
    public HomePageObject homePage(){
        return homePageObject;
    }
    public  LoginPageObject loginPage(){
        return loginPageObject;
    }
}
