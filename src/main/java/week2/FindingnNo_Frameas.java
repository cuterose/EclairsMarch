package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingnNo_Frameas {

	public static void main(String[] args) {
		int c_frame=0;
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
	    List <WebElement> fram = driver.findElementsByTagName("iframe");
	    int n_frame = fram.size();
	    System.out.println("The number of parent frames are:"+ n_frame);
	    for (WebElement iterate : fram) {
	    	driver.switchTo().frame(iterate);
	    	List<WebElement> fr= driver.findElementsByTagName("iframe");
	    	 c_frame= fr.size();
	    	 
	    	 for (WebElement iterate2 : fr)
	    	{
	    		driver.switchTo().frame(iterate2);
	    			
	    	    driver.switchTo().defaultContent();		
	    	    c_frame=c_frame+1;
			}
	    	System.out.println("The number of frames are:"+n_frame+ c_frame);
	    		    			
	    }
	    	
		}
	}
	   
	    
			
		
	     
			
		
	    
	


