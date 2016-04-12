package week2;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dropdowns_IRCTC
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		List <WebElement> dropdown = driver.findElementsByTagName("select");
		System.out.println("The number of dropdown fields are: "+dropdown.size());
		driver.close();	
	}
}
