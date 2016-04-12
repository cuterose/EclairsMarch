package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo1.opentaps.org/opentaps/control/login");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByLinkText("Create Lead").click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementById("createLeadForm_companyName").sendKeys("Gavs");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sasi");
		driver.findElementByXPath("//*[@id='createLeadForm_lastName']").sendKeys("devi");
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		driver.close();
			
	}

}
