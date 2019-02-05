package ApachePOI.ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadCompleteDateFromExcel {

	public static void main(String[] args) throws IOException {
		
		//Conection with Excel File
		FileInputStream fs = new FileInputStream("C:\\Users\\vnikolic\\Downloads\\Selenium\\UserLogin.xls");
		
		// XSLX - Class name will start from XSSF and in case of XLS, Class name start with HSSF
		
		HSSFWorkbook wk = new HSSFWorkbook(fs);
		HSSFSheet s1 = wk.getSheet("UserAccounts");
		
		int r = s1.getPhysicalNumberOfRows();
		
		for(int i = 0; i < r; i++) {
			
			HSSFRow r1 = s1.getRow(i);
			int c = r1.getPhysicalNumberOfCells();		
			for(int j = 0; j < c; j++)
			{
				HSSFCell c11 = r1.getCell(j);
				System.out.print(c11.getStringCellValue() + "   ");
				
			}
			System.out.println();
		}
	}
}