package handleexcelfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);//make file ready for read operation
		Sheet sh = wb.getSheet("citytour");//go to specified sheet
		Row row = sh.getRow(4);//go to the specified row
		Cell cell = row.createCell(4);//go to specified column
	    cell.setCellValue("automation");
	   FileOutputStream fos = new FileOutputStream("./data/Testdata.xlsx");
		wb.write(fos);
		    		
	}

}
