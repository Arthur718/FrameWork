package framework;

import org.openqa.selenium.WebDriver;

public class AplicationControler {
    private WebDriver driver= null;
    private HomePage homePage;
    private LoginPage loginPage;

public AplicationControler(WebDriver driver){

    this.driver=driver;

}
public HomePage homePage(){
    if (homePage== null){
        homePage= new HomePage(driver);
    }

   return homePage;

}
public  LoginPage loginPage(){
    if (loginPage== null){
        loginPage=new LoginPage(driver);

    }
   return loginPage;


}



}
