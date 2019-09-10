package LYFT;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LyftRiderPage  {









    @FindBy(name = "fare-start")
    WebElement pickup ;
    @FindBy(name = "fare-end")
    WebElement dropoff;
    @FindBy(xpath = "//button[@class='_2ruFd_ _1qRMXN _3z7LES _3b6Vkl _3-LnSL']")
    WebElement estimatebutton;
    @FindBy(xpath = "//div[@class='_3HFHrT']")
    WebElement riderrypes;




   public void enterPickup (String pickupaddress){


        pickup.sendKeys(pickupaddress);



    }
    public  void  enterDropoff(String dropoffaddress){
        dropoff.sendKeys(dropoffaddress);



    }



    public  void clickOnEstimateButton(){
        estimatebutton.click();



    }

    public void chechResulte(){
        String price = riderrypes.getText();
        Assert.assertEquals("RIDE TYPES",price);
    }







}
