import ILyft.OR.LyftOR;
import KW.KeywordLibery;
import LYFT.LyftBase;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class Ltest33 extends LyftBase {



    @Test

    public  void LyftOR3(){



        KeywordLibery keywordLibery= new KeywordLibery(driver);


        PageFactory.initElements(driver,keywordLibery);

        keywordLibery.click(LyftOR.LyftHomePage.riderLinkButton);
        keywordLibery.inputText(LyftOR.LyftRiderPage.pick,"19 Cornish St, New York");
        delay(2000);
        keywordLibery.inputText(LyftOR.LyftRiderPage.dropoff,"220 Riverside blvd , New York ");
        delay(2000);
        keywordLibery.click(LyftOR.LyftRiderPage.estimatebutton);
        delay(2000);
        keywordLibery.verifyText(LyftOR.LyftRiderPage.riderrypes,"RIDE TYPES");


    }

   @Test
    public  void LyftInerFaceTast(){
       KeywordLibery keywordLibery= new KeywordLibery(driver);


       PageFactory.initElements(driver,keywordLibery);

       keywordLibery.click(LyftHomepage_riderLinkButton);
       keywordLibery.inputText(LyftRiderPage_pick,"19 Cornish St , New York");
       keywordLibery.inputText(LyftRiderPage_dropoff,"220 RiverSide Blvad , New York ");
       keywordLibery.click(LyftRiderPage_estimatebutton);
       delay(3000);

       keywordLibery.verifyText(LyftRiderPage_riderrypes,"RIDE TYPES");






    }




}
