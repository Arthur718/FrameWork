import org.junit.Test;

public class Test1a extends Base1a{
    @Test
    public void  Test1a(){
        homePage.goToLoginPage();
        loginPage.login("arthur7777@gmail.com","123456");
        delay(2000);
        homePage.verifyLoginSuccess();




    }


}
