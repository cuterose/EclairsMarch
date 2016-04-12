package week3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excel {

	public static void main(String[] args) throws IOException  {
		
		FileInputStream fis = new FileInputStream(new File(	"./data/Book1.xlsx"));
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Rename");
			System.out.println("Total rows : "+sheet.getLastRowNum());
			for (int i = 1; i <=sheet.getLastRowNum(); i++) {
				XSSFRow currentRow = sheet.getRow(i);
				System.out.println("Item : "+currentRow.getCell(0).getStringCellValue());
				System.out.println("Index: "+currentRow.getCell(1).getNumericCellValue());
							}
		
		
		

	}

}
