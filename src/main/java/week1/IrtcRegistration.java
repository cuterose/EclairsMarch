package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IrtcRegistration {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("mohanraj_b");
        driver.findElementById("userRegistrationForm:password").sendKeys("migimatch");
        driver.findElementById("userRegistrationForm:confpasword").sendKeys("migimatch");
        //for selecting a value from dropdown
        Select dropdown = new Select(driver.findElementById("userRegistrationForm:securityQ"));
        dropdown.selectByIndex(1);
        driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Femi");
        Select ln = new Select(driver.findElementById("userRegistrationForm:prelan"));
        ln.selectByVisibleText("English");
        driver.findElementById("userRegistrationForm:firstName").sendKeys("Sasi");
        driver.findElementById("userRegistrationForm:lastName").sendKeys("devi");
        driver.findElementById("userRegistrationForm:gender:1").click();
        driver.findElementById("userRegistrationForm:maritalStatus:0").click();
        driver.findElementById("userRegistrationForm:dobDay").sendKeys("04");
        driver.findElementById("userRegistrationForm:dobMonth").sendKeys("JUL");
        driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1983");
        Select occ = new Select(driver.findElementById("userRegistrationForm:occupation"));
        occ.selectByIndex(3);
        driver.findElementById("userRegistrationForm:email").sendKeys("mailbsasi83@gmail.com");
        driver.findElementById("userRegistrationForm:mobile").sendKeys("9677206074");
        Select nation = new Select(driver.findElementById("userRegistrationForm:nationalityId"));
        nation.selectByVisibleText("India");
        driver.findElementById("userRegistrationForm:address").sendKeys("F2 Plotno 5");
        driver.findElementById("userRegistrationForm:street").sendKeys("school street");
        driver.findElementById("userRegistrationForm:area").sendKeys("Chromepet");
        Select country = new Select(driver.findElementById("userRegistrationForm:countries"));
        country.selectByVisibleText("India");
        driver.findElementById("userRegistrationForm:pincode").sendKeys("600044");
        Thread.sleep(5000);
        //State Name is a Automated generated filed
        driver.findElementById("userRegistrationForm:cityName").sendKeys("Kanchipuram",Keys.TAB);
        driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Chromepet S.O",Keys.TAB);
        driver.findElementById("userRegistrationForm:landline").sendKeys("22457841");
        driver.findElementById("userRegistrationForm:resAndOff:0").click();
                                     
                       
              
       		
	}

}
