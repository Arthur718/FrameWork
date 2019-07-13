import LYFT.LyftBase;
import LYFT.LyftHomePage;
import LYFT.LyftRiderPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)


public class LTest1 extends LyftBase {
    @Parameterized.Parameter (value = 0)
    public String pickupaddress;
    @Parameterized.Parameter(value = 1)
    public String dropoffaddress;













    @Test
    public void LTest1() {

        LyftHomePage lyftHomePage = new LyftHomePage();
        PageFactory.initElements(driver, lyftHomePage);
        lyftHomePage.clickonButton();
         delay(3000);
        LyftRiderPage lyftRiderPage= new LyftRiderPage();
        PageFactory.initElements(driver,lyftRiderPage);

        lyftRiderPage.enterPickup(pickupaddress);
        lyftRiderPage.enterDropoff(dropoffaddress);

        //lyftRiderPage.enterPickup("19 Cornish ,Staten Island NY ");
        //lyftRiderPage.enterDropoff("4079 Hylan Blvd, Staten Island NY");
        lyftRiderPage.clickOnEstimateButton();
        delay(7000);
        lyftRiderPage.chechResulte();


    }

    @Parameterized.Parameters()
    public static Collection<String[]> getTestData(){
        String[][]data ={
                { "19 cornish street, Staten Island NY", "4079 Hylan Blvd ,Staten Island NY"},
                { " 19 cornish street, Staten Island NY", "1079 Hylan Blvd ,Staten Island NY"},

        };
        return Arrays.asList(data);


    }








}












