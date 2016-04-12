package week2;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClosingFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.switchTo().frame(driver.findElementByXPath("//*[@id='childIframe']"));
		driver.findElementByTagName("button").click();		
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		driver.findElementByXPath("/html/body/div[3]/p/button").click();
		driver.switchTo().defaultContent();
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
			}
}
