package week2;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewFindingframes 
{
	public static void main(String[] args) {
		 int child=0;
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
	    List <WebElement> fframe = driver.findElementsByTagName("iframe");
	   	int parent = fframe.size();
	    System.out.println("The number of Parent frames are:"+ parent);
	    for(int i = 0; i<parent; i++){
	    	driver.switchTo().frame(i);
	    	List <WebElement> sframe = driver.findElementsByTagName("iframe");
	        child = child+ sframe.size();
	        driver.switchTo().defaultContent();
	    }
	     int Total_frames = parent + child;
	     System.out.println("The Total number of frames are:"+ Total_frames);
	    	    }
	}


	    	    
	    	    	    		
	    		