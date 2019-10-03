import LYFT.LyftBase;
import LYFT.LyftHomePage;
import LYFT.LyftRiderPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)


public class LTest1 extends LyftBase {
    @Parameterized.Parameter (value = 0)
    public String pickupaddress;
    @Parameterized.Parameter(value = 1)
    public String dropoffaddress;

@Test
public  void LTestb() {
    driver.get("https://www.lyft.com/rider");
    WebElement pickA = driver.findElement(By.name("fare-start"));
    pickA.sendKeys(pickupaddress);
    WebElement dropB = driver.findElement(By.name("fare-end"));

    scrollToElement(pickA);


    dropB.sendKeys(dropoffaddress);

    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.ENTER);
    actions.perform();
    actions.build();
    delay(2000);

    WebElement table = driver.findElement(By.xpath("//table[@class='_3a4YA_']"));
    scrollToElement(table);
    /*List<WebElement> rows = table.findElements(By.xpath("./tbody/tr"));
    for (int i = 0; i < rows.size(); i++) {
        List<WebElement> elements = rows.get(i).findElements(By.xpath(".//td"));

        for (int j = 0; j < elements.size(); j++) {
            System.out.print(elements.get(j).getText() + " ");
            //highlight(elements.get(j));



            //delay(1000);


        }*/
        WebElement Lyft = table.findElement(By.xpath("//h3[@class='DcaHMr'][contains(text(),'Lyft')]"));
        String LyftVaul = Lyft.getText();
        highlight(Lyft);
        //delay(1000);
        Assert.assertEquals("Lyft", LyftVaul);
        System.out.println(LyftVaul);
        WebElement LyftLxBlack = table.findElement(By.xpath("//h3[contains(text(),'Lux Black XL')]"));
        highlight(LyftLxBlack);
        String LyftVaulBlack = LyftLxBlack.getText();
        //delay(1000);
        Assert.assertEquals("Lux Black XL", LyftVaulBlack);
        System.out.println(LyftVaulBlack);

    }









    @Test
    public void LTest1() {

        LyftHomePage lyftHomePage = new LyftHomePage();
        PageFactory.initElements(driver, lyftHomePage);

        lyftHomePage.clickonButton();
        delay(3000);
        LyftRiderPage lyftRiderPage = new LyftRiderPage();
        PageFactory.initElements(driver, lyftRiderPage);
        lyftRiderPage.enterPickup(pickupaddress);
        lyftRiderPage.enterDropoff(dropoffaddress);
        //lyftRiderPage.enterPickup("19 Cornish ,Staten Island NY ");
        //lyftRiderPage.enterDropoff("4079 Hylan Blvd, Staten Island NY");
        lyftRiderPage.clickOnEstimateButton();
        delay(7000);
        lyftRiderPage.chechResulte();
        WebElement table = driver.findElement(By.xpath("//table[@class='_3a4YA_']"));
        scrollToElement(table);
        List<WebElement> rows = table.findElements(By.xpath("./tbody/tr"));
        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> elements = rows.get(i).findElements(By.xpath(".//td"));
            for (int j = 0; j < elements.size(); j++) {
                System.out.print(elements.get(j).getText() + " ");
                highlight(elements.get(j));
            }


        }

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












