package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchtoLastWindow {

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
		String currentWindowHandle = allwindows.iterator().next();
		System.out.println("currentWindow Handle"+currentWindowHandle);
		allwindows.remove(allwindows.iterator().next());
		String lastwindow = allwindows.iterator().next();
		System.out.println("last window handle"+lastwindow);
		driver.switchTo().window(lastwindow);
		
	}

}
