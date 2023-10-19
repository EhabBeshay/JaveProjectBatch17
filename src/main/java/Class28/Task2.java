package Class28;

import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> data =  ExcelReader.readExcelData
                ("C:\\Users\\ehabb\\IdeaProjects\\JavaProject\\Files\\Sales.xlsx");
        System.out.println(data);

        List<Map<String,String>> data1 =  ExcelReader.readExcelData
                ("C:\\Users\\ehabb\\IdeaProjects\\JavaProject\\Files\\Sales.xlsx", "Sheet1");
        System.out.println(data1);
        List<Map<String,String>> data2 =  ExcelReader.readExcelData();

    }
}
