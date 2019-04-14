import framework.HomePage;
import framework.LoginPage;
import org.junit.Test;

public class Test1 extends Base {



    @Test
    public void  Test1(){

        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("arthur7777@gmail.com","123456");
        homePage.verifyLoginSuccess();



        delay(2000);





    }




}
