package ApachePOI.ApachePOI;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToFIle {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fs = new FileOutputStream("C:\\Users\\vnikolic\\Downloads\\Selenium\\Result.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook();
		XSSFSheet s1 = wk.createSheet("Sheet1");
		XSSFRow r1 = s1.createRow(0);
		XSSFCell c1 = r1.createCell(0);
		c1.setCellValue("Hello World");
		wk.write(fs);
		
		wk.close();
		
	}

}
