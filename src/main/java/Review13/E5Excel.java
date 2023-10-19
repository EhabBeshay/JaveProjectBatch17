package Review13;

import Utils.ExcelReader;

import java.util.List;
import java.util.Map;

public class E5Excel {
    public static void main(String[] args) {
        List<Map<String, String>> date = ExcelReader.readExcelData(
                "C:\\Users\\ehabb\\IdeaProjects\\JavaProject\\Files\\Employees.xlsx", "Sheet1");
        System.out.println(date);
    }
}
