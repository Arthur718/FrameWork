import org.junit.Test;

public class Test1b extends Base1b {

    @Test
    public void Test1b() {
        spree().homePage().goToLoginPage();
        spree().loginPage().login("arthur7777@gmail.com", "123456");
        spree().homePage().verifyLoginSuccess();


    }
}
