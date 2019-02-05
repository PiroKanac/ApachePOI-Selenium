package ApachePOI.ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class NumberOfRowsAndCells {
	public static void main(String[] args) throws IOException {
		
		//Conection with Excel File
		FileInputStream fs = new FileInputStream("C:\\Users\\vnikolic\\Downloads\\Selenium\\UserLogin.xls");
		
		// XSLX - Class name will start from XSSF and in case of XLS, Class name start with HSSF
		
		HSSFWorkbook wk = new HSSFWorkbook(fs);
		HSSFSheet s1 = wk.getSheet("UserAccounts");
		
		System.out.println("Number of Rows " + s1.getPhysicalNumberOfRows());  // Number of Rows
		System.out.println("Index of Last Row - " + s1.getLastRowNum()); // Last Row index
		
		HSSFRow r1 = s1.getRow(0);
		System.out.println(r1.getPhysicalNumberOfCells());
	}
}