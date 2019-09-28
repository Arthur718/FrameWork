package StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.WebElementUtils;

public class LyftStepS extends StepBase {

    @Given("^User have no resulet$")
    public void user_have_no_resulet()  {
        driver.manage().deleteAllCookies();

    }

    @When("^User browse to the Lyft Home page  WebSite$")
    public void user_browse_to_the_Lyft_Home_page_WebSite()  {
        driver.get("https://www.lyft.com");

    }


    @Then("^Lyft Home page ride  should display$")
    public void lyft_Home_page_ride_should_display()  {
        String title = driver.getTitle();
        Assert.assertEquals("Become a Driver or Get a Ride Now – Lyft",title);

    }
    @Then("^User click on Rider link button$")
    public void user_click_on_Rider_link_button()  {
        WebElement riderDutton = driver.findElement(By.xpath("//strong[contains(text(),'RIDER')]"));
        riderDutton.click();

    }
    @Then("^Lyft Rider page ride  should display$")
    public void lyft_Rider_page_ride_should_display()  {
        String titleR = driver.getTitle();
        Assert.assertEquals("Ride With Lyft | 9 Options for Every Transportation Need | Lyft",titleR);

    }
    @Then("^User enter pick up Location as \"([^\"]*)\"$")
    public void user_enter_pick_up_Location_as(String PointA)  {

        WebElement pickup = driver.findElement(By.name("fare-start")) ;
        pickup.sendKeys(PointA);
    }

    @Then("^User enter drop off Location as \"([^\"]*)\"$")
    public void user_enter_drop_off_Location_as(String PontB)  {
        WebElement dropoff = driver.findElement(By.name("fare-end"));
        dropoff.sendKeys(PontB);
        delay(2000);
    }

    @Then("^User click on Get Estimate button$")
    public void user_click_on_Get_Estimate_button()  {
        WebElement GetEstim = driver.findElement(By.xpath("//button[@class='_2ruFd_ _1qRMXN _3z7LES _3b6Vkl _3-LnSL']"));
        GetEstim.click();
        delay(2000);


    }

    @Then("^Lyft price estimator table  should display$")
    public void lyft_price_estimator_table_should_display()  {
        WebElement priceT = driver.findElement(By.xpath("//div[@class='_3HFHrT']"));
        String price = priceT.getText();
        Assert.assertEquals("RIDE TYPES",price);
        WebElementUtils webElementUtils = new WebElementUtils(driver);
        webElementUtils.highlight(priceT);

    }





    /*  @When("^User click on Rider button$")
    public void user_click_on_Rider_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Rider page should display$")
    public void rider_page_should_display() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User enter pick up locations as \"([^\"]*)\"$")
    public void user_enter_pick_up_locations_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User enter drop off location as \"([^\"]*)\"$")
    public void user_enter_drop_off_location_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User click on a button \"([^\"]*)\"$")
    public void user_click_on_a_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Lyft price estimation table  should display$")
    public void lyft_price_estimation_table_should_display() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
*/
}
