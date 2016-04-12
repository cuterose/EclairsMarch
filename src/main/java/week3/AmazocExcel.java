package week3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazocExcel {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		FileInputStream fis = new FileInputStream(new File("./data/Amazon.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow currentrow = sheet.getRow(1);
		String Item = currentrow.getCell(0).getStringCellValue();
	    String Index = currentrow.getCell(1).getStringCellValue();
	    driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys(Item);
	   	//driver.findElementByXPath("//*[@id='nav-search']/form/div[2]/div/input").click();
	    driver.findElementByXPath("//*[@class='nav-search-submit nav-sprite']/input").click();
	    System.out.println(driver.findElementByXPath("(//h2[@class='a-size-medium a-color-null s-inline  s-access-title a-text-normal'])[" + Item + "]").getText());
	    driver.close();
	}
}
