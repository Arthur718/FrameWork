import KW.KeywordDriver;
import KW.KeywordScriptBase;
import org.junit.Before;
import org.junit.Test;
import utils.ExcelReader;

public class KeywordDriverScript  extends KeywordScriptBase {
    private String KEYWORD_FILE= System.getProperty("user.dir")+"/ArthurSpreeTC.xlsx";

    private KeywordDriver keywordDriver=null;

    @Override
    @Before
    public void setUp(){
        super.setUp();
        keywordDriver= new KeywordDriver(KEYWORD_FILE,driver);
    }

    @Test
    public void kw(){




        String[][]data= getTestScriptList();
        for (int i = 0; i <data.length ; i++) {
            if (data[i][3].contentEquals("Y")){
                keywordDriver.runScript(data[i][2]);
            }

        }


    }
   public String[][] getTestScriptList(){
       ExcelReader reader= new ExcelReader(KEYWORD_FILE);
       String[][] data = reader.getExcelSheetData("TestSuite",true);
       return data;

   }


}
