package week2;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClosingWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://popuptest.com/");
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		String parentwindow= driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String iterate : allwindows)
		{
		  driver.switchTo().window(iterate);
		  if(!iterate.equals(parentwindow))
				{
					driver.close();
				}
		}
		driver.switchTo().window(parentwindow);
				System.out.println("The title of the parent window is :"+driver.getTitle());
	}
}