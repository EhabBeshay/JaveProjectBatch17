package Class28;

import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> data =  ExcelReader.readExcelData
                ("C:\\Users\\ehabb\\IdeaProjects\\JavaProject\\Files\\EmpData1.xlsx");
        System.out.println(data);
    }
}
