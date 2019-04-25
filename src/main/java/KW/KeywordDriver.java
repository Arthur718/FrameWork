package KW;

import OR.ObjectRepository;
import org.openqa.selenium.WebDriver;
import utils.ExcelReader;
import utils.ObjectRepositoryReaderManager;

public class KeywordDriver {

    private String scriptFile = null;
    private KeywordLibery keywordLibery;
    public ObjectRepositoryReaderManager or = ObjectRepositoryReaderManager.getInstance();
    public KeywordDriver(String scriptFile, WebDriver driver)
    {
        this.scriptFile=scriptFile;
        keywordLibery=new KeywordLibery(driver);


    }

    public void runScript(String scriptName ){
        ExcelReader reader= new ExcelReader(scriptFile);

        String[][] exelData = reader.getExcelSheetData(scriptName,true);
        for (int i=0;i<exelData.length;i++){
            String steps = exelData[i][0];
            String keyword= exelData[i][1];
            String locator =exelData[i][2];
            String data = exelData[i][3];
            System.out.println("Step:" +steps+ "Keyword:" +keyword+ "Locaror:" +locator+ "Data:" +data);
            //System.out.println("Process Keyword.....");
            processKeywordStep(steps,keyword,locator,data);
        }

    }









    public void runScript(int scriptIndex){
        ExcelReader reader= new ExcelReader(scriptFile);

        String[][] exelData = reader.getExcelSheetData(scriptIndex,true);
        for (int i=0;i<exelData.length;i++){
            String steps = exelData[i][0];
            String keyword= exelData[i][1];
            String locator =exelData[i][2];
            String data = exelData[i][3];
            System.out.println("Step:" +steps+ "Keyword:" +keyword+ "Locaror:" +locator+ "Data:" +data);
            //System.out.println("Process Keyword.....");
           processKeywordStep(steps,keyword,locator,data);
        }

    }
    private void processKeywordStep ( String step , String keyword, String locator,String data){
        System.out.println("Processing step "+ step + ".......");
        if(keyword.equalsIgnoreCase("browserToUrl")){
            keywordLibery.browserToUrl(data);
        }
       else if (keyword.equalsIgnoreCase("click")){
           keywordLibery.click(or.get(locator));
        }
       else if (keyword.equalsIgnoreCase("inputText")){
           keywordLibery.inputText(or.get(locator),data);
        }
        else if (keyword.equalsIgnoreCase("delayFor")){
            keywordLibery.delayFor(Double.valueOf(data).intValue());
        }
        else if (keyword.equalsIgnoreCase("verifyText")){
            keywordLibery.verifyText(or.get(locator),data);
        }


        else {
            System.out.println("********* Unknown keyword ******" );
        }
    }




}
