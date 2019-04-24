package utils;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class ExelObjectRepositoryManager {
    private static ExelObjectRepositoryManager instance = null;
    private static final String EXCEL_FILE_LOCATION = System.getProperty("user.dir") + "/SpreeOR.xls";
    private HashMap<String,String> reoository = null;
    private ExelObjectRepositoryManager(){
        reoository= new HashMap<String, String>();
        load();

    }
   public static ExelObjectRepositoryManager getInstance(){
        if (instance==null){
            instance= new ExelObjectRepositoryManager();

        }
       return instance;
    }
    public String get(String key) {
        String value = reoository.get(key);
        return value;
    }
     public String getLocatorBy(String key) {
          String locator = null;
          String value = reoository.get(key);
          locator = value.split(":")[0];
          return locator;
      }
      public String getLocator(String key) {
          String locator = null;
          String value = reoository.get(key);
          locator = value.split(":")[1];
          return locator;
      }
   private void load() {

       Workbook workbook = null;

       try {
           workbook = Workbook.getWorkbook(new File(EXCEL_FILE_LOCATION));
           Sheet sheet = workbook.getSheet(0);
            int rows = sheet.getRows();
           for (int i = 1; i <rows ; i++) {


               Cell cell1 = sheet.getCell(0, i);
               String key = cell1.getContents();

               Cell cell2 = sheet.getCell(1, i);
               String how = cell2.getContents();

               Cell cell3 = sheet.getCell(2, i);
               String by = cell3.getContents();
               reoository.put(key,how +":"+ by);
           }
       } catch (BiffException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           if (workbook != null) {
               workbook.close();
           }
       }

   }



}
