package StepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UberSteps  extends StepBase{


    @Given("User have no result")
    public void userHaveNoResult() {
        driver.manage().deleteAllCookies();
    }
    @When("User browse to the Uber ride estimation page")
    public void userBrowseToTheUberRideEstimationPage() {

        driver.get("https://www.uber.com/us/en/price-estimate/");


    }




    @Then("Uber ride estimation  page should display")
    public void uberRideEstimationPageShouldDisplay() {
        String title = driver.getTitle();
        Assert.assertEquals("Uber Estimate - Get a Price Estimate in Your City | Uber", title);



    }

    @Then("User enter pick up location as \"([^\"]*)\"$")
    public void userEnterPickUpLocationAs(String pointA) {

        //WebElement pickup =  driver.findElement(By.name("pickup"));

        //WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.presenceOfElementLocated((By.name(String.valueOf(pointA)))));
        WebElement done = driver.findElement(By.name("pickup"));
        done.sendKeys(pointA);
        //WebDriverWait wait = new WebDriverWait(driver,30);
        delay(3000);

        //WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.presenceOfElementLocated((By.name(String.valueOf(pointA)))));
        Actions actions= new Actions(driver);
        Actions actions1=actions.sendKeys(Keys.ENTER);
        actions1.perform();
        
    }

    @And("User enter drop off location as \"([^\"]*)\"$")
    public void userEnterDropOffLocationAs(String pointB) {

       // WebElement destination =  driver.findElement(By.name("destination"));

        //WebDriverWait wait1 =new WebDriverWait(driver,10);
        //wait1.until(ExpectedConditions.presenceOfElementLocated(By.name(String.valueOf(pointB))));
        WebElement done1 =driver.findElement(By.name("destination"));
        done1.sendKeys(pointB);
       //WebDriverWait wait1 =new WebDriverWait(driver,10);
        //wait1.until(ExpectedConditions.presenceOfElementLocated(By.name(pointB)));
delay(2000);
        Actions actions2= new Actions(driver);
        Actions actions3= actions2.sendKeys(Keys.ENTER);
        actions3.perform();
delay(8000);




    }


    @Then("Uber price estimator table  should display")
    public void uberPriceEstimatorTableShouldDisplay() {
        WebDriverWait wait1 =new WebDriverWait(driver,30);
        //wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(//span[@class='zc l9 zd k6 be ze h0 zf b5 hj hr g3 gp l4 ub zg'])));
           //wait1.wait();
         //wait1.getClass();

        //@FindBy(name = "Your options");
               // WebElement chart ;

        WebElement chart = driver.findElement(By.cssSelector("div.ae.af div.dotcom-price-estimator.ba.bb.bc.bd.be.bf.bg.bh.bi.ae.rd.bl.re.bn.bo.bp.bq.rf.bs.rg.bu.rh.bw.lu.by:nth-child(2) div.bq.bz.c0 div.sd.ec.cs.fz.g0.vd.fa.ej.g2.da.ve.g4.fv.g6.g7.vf div.c3.fi.vg div.vh.vi.c3.c4.ok.vj.vk.vl div.be > h3.wk.zl.zm.zn.gu.bf.u8.u6.lh.li.hl.ff.gw.gv.l1.ke.te"));
          wait1.getClass();
         delay(3000);

        chart.getText();
       String tabele = chart.getText();
        Assert.assertEquals("Your options",tabele);

    }
}
