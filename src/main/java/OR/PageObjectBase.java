package OR;

import org.openqa.selenium.WebDriver;
import utils.ExelObjectRepositoryManager;

public class PageObjectBase {
    protected WebDriver driver= null;

    //protected ExelObjectRepositoryManager orManager = ExelObjectRepositoryManager.getInstance();
    public  PageObjectBase(WebDriver driver){
        this.driver=driver;

    }






}


