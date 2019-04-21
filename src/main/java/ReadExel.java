import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class ReadExel {


    private static final String EXCEL_FILE_LOCATION = System.getProperty("user.dir") + "/SpreeOR.xls";


    public static void main(String[] args) {
        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(new File(EXCEL_FILE_LOCATION));
            Sheet sheet = workbook.getSheet(0);

            Cell cell1 = sheet.getCell(0, 0);
            System.out.println(cell1.getContents());

            Cell cell2 = sheet.getCell(1, 0);
            System.out.println(cell2.getContents());

            Cell cell3 = sheet.getCell(2, 0);
            System.out.println(cell3.getContents());

        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (workbook != null) {
                workbook.close();
            }
        }

    }


}
