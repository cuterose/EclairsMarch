package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Prac2_Navigate {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.DemoQA.com");
		driver.findElementById("menu-item-374").click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://www.DemoQA.com");
		driver.navigate().refresh();
		
	
	}

}
