import KW.KeywordDriver;
import org.junit.Test;

public class KeywordDriverScript  extends Base2{
    private String KEYWORD_FILE= System.getProperty("user.dir")+"/ArthurSpreeTC.xlsx";

    @Test
    public void kw(){
        KeywordDriver keywordDriver= new KeywordDriver(KEYWORD_FILE,driver);
        keywordDriver.loadScript();
    }



}
