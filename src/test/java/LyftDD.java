import LYFT.LyftRiderPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import utils.ExcelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LyftDD  {

    public WebDriver driver= null;

   public XSSFWorkbook workbook;
   public XSSFSheet sheet;
   public XSSFCell cell;



    @BeforeClass
    public static  void BeforeClass(){



        ChromeDriverManager.chromedriver().setup();

    }



    @Before
    public void SetUp(){









        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lyft.com/rider");


    }

    @After
    public  void  tearDown(){
        driver.close();
        driver.quit();

    }




  @Test
    public  void LyftDD() throws IOException, Exception {

      File src = new File("/Users/arthur/arthur718/Lyft.xlsx");
      FileInputStream finput = new FileInputStream(src);
      workbook = new XSSFWorkbook(finput);
      sheet = workbook.getSheet("Art");


      for (int i = 1; i <= sheet.getLastRowNum(); i++) {

          cell = sheet.getRow(i).getCell(0);
          cell.setCellType(CellType.STRING);


         WebElement pick= driver.findElement(By.name("fare-start"));
         pick.sendKeys(cell.getStringCellValue());

         //pick.clear();

          Thread.sleep(2000);


          cell = sheet.getRow(i).getCell(1);
          cell.setCellType(CellType.STRING);


          driver.findElement(By.name("fare-end")).sendKeys(cell.getStringCellValue());
          driver.findElement(By.xpath("//button[@class='_2ruFd_ _1qRMXN _3z7LES _3b6Vkl _3-LnSL']")).click();
          Thread.sleep(2000);

          driver.navigate().refresh();


      }


  }


    @Test
    public void Lyft() {

       // public String [][] GetData () {


            ExcelReader reader = new ExcelReader("Lyft.xlsx");





            ////String[][] data = reader.getExcelSheetData("Art", true);
            //return data;
           int rowcount = reader.hashCode();
            for (int i = 1; i <= rowcount; i++) {

                WebDriver driver = new ChromeDriver();
                driver.get("https://www.lyft.com/rider");

          
           String pickup1= reader.getExcelCellData("Art",i , 0);
            //System.out.println(pickup1);

        //String[] dropoff1 = reader.getExcelColData("Art", 1);
           // String pickup1 = reader.getExcelCellData("Art",,i);
            //String pickup2 = reader.getExcelCellData("Art",2,i);
            //String pickup3 = reader.getExcelCellData("Art",3,0);
            //String pickup4 = reader.getExcelCellData("Art",4,0);

            String dropoff1 = reader.getExcelCellData("Art",i,1);
            //String dropoff2 = reader.getExcelCellData("Art",2,1);
            //String dropoff3 = reader.getExcelCellData("Art",3,1);
            //String dropoff4 = reader.getExcelCellData("Art",4,1);

            WebElement pickup = driver.findElement(By.name("fare-start"));
            pickup.sendKeys(pickup1);
            WebElement dropoff = driver.findElement(By.name("fare-end"));
            dropoff.sendKeys(dropoff1);

            driver.findElement(By.xpath("//button[@class='_2ruFd_ _1qRMXN _3z7LES _3b6Vkl _3-LnSL']")).click();

                driver.navigate().refresh();




        }


    }

@ Test
    public void Lyft333()  {


    ExcelReader excelReader = new ExcelReader("Lyft.xlsx");









    int rowcount =excelReader.getRowCount("Art");


    for (int i = 1; i <rowcount ; i++) {



        String[][] data = excelReader.getExcelSheetData("Art", true);
        //driver.findElement(By.name("fare-start")).clear();
       WebElement art2=  driver.findElement(By.name("fare-start"));
       art2.sendKeys(data[i][0]);
        //driver.findElement(By.name("fare-end")).clear();
        WebElement art3= driver.findElement(By.name("fare-end"));
        art3.sendKeys(data[i][1]);
        art2.clear();
        art3.clear();

        driver.findElement(By.xpath("//button[@class='_2ruFd_ _1qRMXN _3z7LES _3b6Vkl _3-LnSL']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();


    }








}

       @Test
       public  void  LyftDDPOM() {

       // LyftRiderPage  lyftRiderPage = new LyftRiderPage();

        ExcelReader reader= new ExcelReader("Lyft.xlsx");

       int rowcount = reader.getRowCount("Art");

        for (int i = 1; i < rowcount ; i++){

        String pickup  = reader.getExcelCellData("Art",i,0);
        String dropoff = reader.getExcelCellData("Art",i,1);
            WebElement art2=  driver.findElement(By.name("fare-start"));
            art2.sendKeys(pickup);
            WebElement art3= driver.findElement(By.name("fare-end"));
            art3.sendKeys(dropoff);
            driver.findElement(By.xpath("//button[@class='_2ruFd_ _1qRMXN _3z7LES _3b6Vkl _3-LnSL']")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.navigate().refresh();






           // String[][] data = reader.getExcelSheetData("Art", true);

            /*String pickupaddress = data[i][0];
            String dropoffaddress =data[i][1];


            lyftRiderPage.enterPickup(pickupaddress);
            lyftRiderPage.enterDropoff(dropoffaddress);
            lyftRiderPage.clickOnEstimateButton();
            driver.navigate().refresh();


             */





        }











       }

    @Test
    public void Lyft101() {
        ExcelReader reader= new ExcelReader("Lyft.xlsx");

         String[][] data = reader.getExcelSheetData("Art", true);
        LyftRiderPage lyftRiderPage = new LyftRiderPage();
        PageFactory.initElements(driver,lyftRiderPage);
        int rowcount = reader.getRowCount("Art");


        for (int i = 0; i < rowcount-1 ; i++) {


            String pickupaddress = data[i][0];
            String dropoffaddress = data[i][1];


            lyftRiderPage.enterPickup(pickupaddress);
            lyftRiderPage.enterDropoff(dropoffaddress);
            lyftRiderPage.clickOnEstimateButton();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.navigate().refresh();
        }


    }


    }


