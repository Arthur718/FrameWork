import OR.ObjectRepository;
import in.or.OR;
import org.junit.Test;

public class Test2 extends Base2{



        @Test
        public void test1()  {
            browserToUrl("http://spree.shiftedtech.com/");
            click("XPATH://li[@id='link-to-login']/a");
            inputText("ID:spree_user_email", "shiftqa01@gmail.com");
            inputText("ID:spree_user_password", "shiftedtech");
            click("NAME:commit");
            delayFor(2000);
            verifyText("CSS:.alert-success", "Logged in successfully");
        }

        @Test
        public void test2() {
            browserToUrl("http://spree.shiftedtech.com/");
            click(OR.get("HomePage.Loginlink"));
            inputText(OR.get("LoginPage.EmailTextbox"), "shiftqa01@gmail.com");
            inputText(OR.get("LoginPage.PasswordTextbox"), "shiftedtech");
            click(OR.get("LoginPage.LoginButton"));
            delayFor(2000);
            verifyText(OR.get("HomePage.SuccessMessage"), "Logged in successfully");
        }



        @Test
        public void test3() {
            browserToUrl("http://spree.shiftedtech.com/");
            click(HomePage_Loginlink);
            inputText(LoginPage_EmailTextbox, "arthur7777@gmail.com");
            inputText(LoginPage_PasswordTextbox, "123456");
            click(LoginPage_LoginButton);
            delayFor(2000);
            verifyText(HomePage_SuccessMessage, "Logged in successfully");
        }
    @Test
    public void test4() {
        browserToUrl("http://spree.shiftedtech.com/");
        click(in.or.OR.HomePage.Loginlink);
        inputText(in.or.OR.LoginPage.EmailTextbox, "arthur7777@gmail.com");
        inputText(in.or.OR.LoginPage.PasswordTextbox, "123456");
        click(in.or.OR.LoginPage.LoginButton);
        delayFor(2000);
        verifyText(in.or.OR.HomePage.SuccessMessage, "Logged in successfully");
    }

    }

