package Class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\ehabb\\IdeaProjects\\JavaProject\\Files\\Employees.xlsx";
        //Class that brings the data in the form of bytes into the memory
        FileInputStream fis = new FileInputStream(path);
        // That special Class which knows how to handle Excel files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //Accessing the sheet from the xlsx file
        Sheet sheet = workbook.getSheet("Sheet1");
        // gives us the row at index 1

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
           Row row=sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                System.out.print(row.getCell(j)+" ");
        }

            System.out.println();
        }


    }
}
