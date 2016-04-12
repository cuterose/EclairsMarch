package week1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.findElementById("username").sendKeys("sasi@gavs.com");
		driver.findElementById("password").sendKeys("devi1234");
		driver.findElementById("Login").click();
			}

}
