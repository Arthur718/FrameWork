package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef1 {

     private WebDriver driver;

   @Before
    public void setUP(){

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") +"/driver/chromedriver");



        //ChromeDriverManager.chromedriver().setup();
        driver= new ChromeDriver();}

   @After
   public void  tearDown(){

       driver.close();
       driver.quit();
   }




    @Given("Not a validated user")
    public void not_a_validated_user() {
        driver.manage().deleteAllCookies();
    }

    @When("User browse to the site")
    public void user_browse_to_the_site() {
        driver.navigate().to("http://spree.shiftedtech.com/");

    }

    @Then("Spree home page should display")
    public void spree_home_page_should_display() {
        String title = driver.getTitle();
        Assert.assertEquals("Spree Demo Site", title);

    }

    @When("User click login link")
    public void user_click_login_link() {
        WebElement element = driver.findElement(By.xpath("//li[@id='link-to-login']/a"));
        element.click();

    }


    @Then("Home page should display")
    public void home_page_should_display() {
        String title = driver.getTitle();
        Assert.assertEquals("Spree Demo Site", title);

    }

    @Then("Login success message display")
    public void login_success_message_display() {
        WebElement alertMsg = driver.findElement(By.cssSelector(".alert-success"));
        String mString = alertMsg.getText();
        Assert.assertEquals("Logged in successfully", mString);

    }



    @When("^User enter user email as \"([^\"]*)\"$")
    public void userEnterUserEmailAs(String email)  {
        WebElement emailTextBox = driver.findElement(By.id("spree_user_email"));


        emailTextBox.sendKeys(email);

    }

    @And("^User enter password as \"([^\"]*)\"$")
    public void userEnterPasswordAs(String password) {
        WebElement passwordTextBox = driver.findElement(By.id("spree_user_password"));


        passwordTextBox.sendKeys(password);



    }

    @Then("^User click login button$")
    public void user_click_login_button()  {
        WebElement loginButton = driver.findElement(By.name("commit"));


        loginButton.click();


    }



}









