package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice1 {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = "http://www.store.demoqa.com";
		driver.get(url);
		System.out.println("The title of the page is "+driver.getTitle());
		System.out.println("The length of the title is "+driver.getTitle().length());
		String actualurl = driver.getCurrentUrl();
		if(actualurl.equals(url))
		{
		System.out.println("Verfication successful- The current URL is opened");
		}
		else
		{
		System.out.println("Verification failed-An incorrect URL is opened");	
		System.out.println("The actual URL is "+actualurl);
		System.out.println("Expected URL is "+ url);
		}
		
		

	}

}
