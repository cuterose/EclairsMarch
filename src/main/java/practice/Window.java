package practice;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Window {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String parentwindow = driver.getWindowHandle();
		System.out.println("The parent window is"+parentwindow);
		driver.findElementByXPath("//*[@id='content']/p[3]/button").click();
		Set <String>allwindows = driver.getWindowHandles();
		int size = allwindows.size();
		System.out.println("The number of windows are :"+size);
		for (String i : allwindows) {
			System.out.println("getting in to the loop");
			driver.switchTo().window(i);
			System.out.println("The window handle is "+driver.getWindowHandle());
			
		
	}

}
}
