package week2;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GooglewithName 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.google.co.in");
	    driver.findElementById("lst-ib").sendKeys("Sasi",Keys.ENTER);
	    Thread.sleep(5000);
	    List <WebElement> linname = driver.findElementsByTagName("a");
	    for (WebElement iterate : linname)
	    {
	    if(iterate.getText().toUpperCase().contains("SASI") && iterate.getLocation().getX()>100 && iterate.getText().length()>20)
		 {
	     System.out.println(iterate.getText());
	     }
		 }
    }
}
	    
	    

