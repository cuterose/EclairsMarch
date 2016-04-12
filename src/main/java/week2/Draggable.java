package week2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
public class Draggable {
	public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://jqueryui.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByLinkText("Draggable").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		Thread.sleep(5000);
		System.out.println(driver.findElementById("draggable").getText());
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Droppable").click();
		}
}
