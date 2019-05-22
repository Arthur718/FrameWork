import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class Test3 extends Base1a {
  @Parameterized.Parameter (value = 0)
  public String emailAddress;
  @Parameterized.Parameter(value = 1)
    public String password;
  @Test
    public void test3(){
      homePage.goToLoginPage();
      loginPage.login(emailAddress,password);
      delay(2000);
      homePage.verifyLoginSuccess();
  }

    @Parameterized.Parameters()
    public static Collection<String[]> getTestData(){
      String[][]data ={
              { "arthur7777@gmail.com", "123456"},
              {  "shiftqa01@gmail.com", "shiftedtech"},

      };
      return Arrays.asList(data);


    }
}
