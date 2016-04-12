package practice;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Isdisplayed {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window();
		driver.get("http://google.com");
		
		

	}

}
