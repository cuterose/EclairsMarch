package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeveloperFore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://developer.force.com/chatterdevchallenge/challengeLogin");
		driver.findElementByLinkText("JOIN NOW").click();
		   //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   //This code won't run since i already signed up with the below data
		//signup
		driver.findElementById("first_name").sendKeys("Sasi");
		driver.findElementById("last_name").sendKeys("devi");
		driver.findElementById("email").sendKeys("mailbsasi83@gmail.com");
		Select role = new Select(driver.findElementById("job_role"));
		role.selectByVisibleText("Administrator");
		driver.findElementById("company").sendKeys("GAVS");
		Select country = new Select(driver.findElementById("country"));
		country.selectByVisibleText("India");
		driver.findElementById("postal_code").sendKeys("600044");
		driver.findElementById("username").sendKeys("sasi@gavs.com");
		driver.findElementById("eula").click();
		driver.findElementById("submit_btn").click();
	    }

}
