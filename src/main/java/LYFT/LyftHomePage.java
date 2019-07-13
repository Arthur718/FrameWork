package LYFT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LyftHomePage  {


       @FindBy(xpath = "//strong[contains(text(),'RIDER')]")
       WebElement riderLinkButton ;

       public void  clickonButton (){

           riderLinkButton.click();
       }





   }




