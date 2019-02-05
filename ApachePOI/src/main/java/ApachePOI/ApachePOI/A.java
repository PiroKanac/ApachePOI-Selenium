package ApachePOI.ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class A {

	public static void main(String[] args) throws IOException {
		
		//Conection with Excel File
		FileInputStream fs = new FileInputStream("C:\\Users\\vnikolic\\Downloads\\Selenium\\UserLogin.xls");
		
		// XSLX - Class name will start from XSSF and in case of XLS, Class name start with HSSF
		
		HSSFWorkbook wk = new HSSFWorkbook(fs);
		HSSFSheet s1 = wk.getSheet("UserAccounts");
		HSSFRow r1 = s1.getRow(3);
		HSSFCell c1 = r1.getCell(1);
        System.out.println(c1.getStringCellValue());
	}
}
