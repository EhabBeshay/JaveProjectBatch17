package Class28;

import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {
       List<Map<String, String>> data =  ExcelReader.readExcelData
               ("C:\\Users\\ehabb\\IdeaProjects\\JavaProject\\Files\\Employees.xlsx","Sheet1");
        System.out.println(data);
    }
}
