package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	
	public static String getCellData(int row, int col) throws Exception
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\Ashwin\\eclipse-workspace\\HealthInsuranceAutomationSuite\\src\\test\\resources\\TestCasesData.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("Login");
		
		String data = s1.getRow(row).getCell(col).getStringCellValue();
		
		w1.close();

        return data;
	}
	
	


}
