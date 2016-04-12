package week3;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
public class WrapperClass {
		RemoteWebDriver driver;
		public void launchApp(String browser, String url) {
			try {
				if (browser.equalsIgnoreCase("firefox")) {
					driver = new FirefoxDriver();
				} else if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
					driver = new ChromeDriver();
				}
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} catch (WebDriverException e) {
				System.out.println("Application could not be launched !!");
			}
		}


		//Input - id of the dropdown and index
		//output- select the value by index in the dropdown
		public void selectvaluebyindexUsingID(String id,int index) 
		{
		try {
			Select sel = new Select(driver.findElement(By.id(id))); 
			sel.selectByIndex(index);
			} catch (NoSuchElementException e) 
		{
		System.out.println("The element with id  : " + id + " could not be found !!");
		}
		}

		//Input-No input
		//output-accept the alert
		public void acceptalert()
		{
		try {
			driver.switchTo().alert().accept();
			} catch (NoAlertPresentException e) 
		   {
		System.out.println("No alert has been found!!");
		   }
		}

		//Input-No input
		//Output - Dismiss the alert
		public void dismissalert()
		{
		try {
			driver.switchTo().alert().dismiss();
			} catch (NoAlertPresentException e) 
		     {
			System.out.println("No alert has been found!!");
			}
		}

		//Input-Give the xpath name
		//output-The element with the specified xpath has been clicked
		public void clickByXpath(String xpath)
		{
		try {
		    driver.findElement(By.xpath(xpath)).click();
			} catch (NoSuchElementException e) 
		 {
		 System.out.println("The element with id : " + xpath + " could not be found !!");
		}
		}
		
		//Input-Give the xpath name
		//output-The value is entered in the textbox
				public void enterByXpath(String xpath,String value )
				{
				try {
				    driver.findElement(By.xpath(xpath)).sendKeys(value);
					} catch (NoSuchElementException e) 
				 {
				 System.out.println("The element with xpath : " + xpath + " could not be found !!");
				}
				}
		
		

		//Input-Id of the textbox and value
		//Output- The value is entered in the textbox
		public void enterbyid(String id,String value)
		{
		try {
			driver.findElement(By.id(id)).sendKeys(value);
			} catch (NoSuchElementException e) 
		    {
			System.out.println("The element with id  : " + id + " could not be found !!");
			}
		}
		//Input-Id of the element 
		//Output-The element with the specified id has been clicked
		public void clickbyid(String id)
		{
		try {
			driver.findElement(By.id(id)).click();
			} catch (NoSuchElementException e) 
		    {
			System.out.println("The element with id  : " + id + " could not be found !!");
			}
		}

		//Input-Name of the textbox and value
		//Output- The Value is entered in the textbox
		public void enterbyname(String name,String value)
		{
			try {
				driver.findElement(By.name(name)).sendKeys(value);
			} catch (NoSuchElementException e ) {
			System.out.println("The element with name  : " + name + " could not be found !!");
			}
		}
		
		//Input-Name of the textbox 
		//Output-The element with the classname has been clicked
				public void clickbyname(String name)
				{
					try {
						driver.findElement(By.name(name)).click();
					} catch (NoSuchElementException e ) {
					System.out.println("The element with name  : " + name + " could not be found !!");
					}
				}

		//Input-Classname of the textbox and value
		//Output-Value is entered in the textbox
		public void enterbyclassname(String cname,String value)
		{
			try {
				driver.findElement(By.className(cname)).sendKeys(value);
			} catch (NoSuchElementException e )
			{
			System.out.println("The element with classname  : " + cname + " could not be found !!");
			}
			}
		

		//Input-Classname 
		//Output-Element with given class name has been clicked
		
		public void clickbyclassname(String cname)
		{
		try {
			driver.findElement(By.className(cname)).click();
		} catch (NoSuchElementException e )
		{
		System.out.println("The element with classname : " + cname + " could not be found !!");
		}
		}
		

		//Input-Give the linktext
		//output- Given link has been clicked
		public void clickbylinkText(String textlink)
		{
			try {
				driver.findElement(By.linkText(textlink)).click();
			} catch (NoSuchElementException e) {
			System.out.println("The element with linktext  : " + textlink + " could not be found !!");
			}
	}
		//Input-Give the linktext and value for textbox
		//output- Given value is entered in  the textbox
		public void enterbylinkText(String textlink,String value){
			try {
				driver.findElement(By.linkText(textlink)).sendKeys(value);
			} catch (NoSuchElementException e) {
			System.out.println("The element with linktext  : " + textlink + " could not be found !!");
			}
	}
		//Input-No
		//Output- Switch to a parent window
		public void switchtoparentwindow()
		{
		try {
			driver.switchTo().window(driver.getWindowHandle());
		} catch (NoSuchWindowException e) {
		System.out.println("The parentwindow could not be found !!");			
		}
		}
		//Input- Frame xpath
		//Output- Switches to the particular frame based on the xpath
		public void switchtoframebyxpath(String xpath){
			try {
				driver.switchTo().frame(driver.findElement(By.xpath(xpath)));
			} catch (NoSuchElementException e) {
				System.out.println("The xpath  : " + xpath + " could not be found !!");
			}
			catch(NoSuchFrameException e){
				System.out.println("Exception in switchtoframebyxpath method");
				}
			}
		//Input- Frame id
		//Output- Switches to the particular frame based on the ID
			public void switchtoframebyid(String id){
				try {
					driver.switchTo().frame(id);
				} catch (NoSuchElementException e) {
					System.out.println("The element with : " + id + " could not be found !!");
				}
				catch(NoSuchFrameException e){
					System.out.println("Exception in switchtoframebyid method");	
				}
				}
		//Input - Frame name
		//Output- Switches to the particular frame based on the name
			public void switchtoframebyname(String name){
				try {
					driver.switchTo().frame(name);
				} catch (NoSuchElementException e) {
					System.out.println("The element with : " + name + " could not be found !!");
				}
				catch(NoSuchFrameException e){
					System.out.println("Exception in switchtoframebyname method");	
				}
				}
	 //Input - No input
	//output - Switches to the firstframe
			public void switchtofirstframe(){
				try {
					driver.switchTo().frame(0);
				} catch (NoSuchFrameException e) {
					System.out.println("The frame couln't be found");
									}
			}
	//Input -  Expected Title
	//Output - Verify the Expected title with the actual title and print the appropriate status
			public void verifytitle(String ExpTitle)
			{
			try {
				if(ExpTitle.equals(driver.getTitle()))
					{
					System.out.println("Verification successful - The correct title is displayed on the web page");
					}
				 else    
				 {
				 System.out.println("Verification Failed - An incorrect title is displayed on the web page");
				}
			} catch (WebDriverException e) {
				
				System.out.println("Browser couldn't be identified to verfy the title");
			}
			}
	//Input - Expected URL	
	//Output - Verify the Expected URL with the current URL and print the appropriate status		
		
			public void verifyurl(String Expurl)
			{
			try {
				if(Expurl.equals(driver.getCurrentUrl()))
					{
					System.out.println("Verification successful - The URL matches with the current URL");
					}
				 else    
				 {
				 System.out.println("Verification Failed - The URL doesn't match with the current URL");
				}
			} catch (WebDriverException e) {
				
				System.out.println("Unable to get the current URL");
			}
			}
	//Input - ExpectedText and id
    //Output - Verify the Expected text with the current text and print the appropriate status
			
		public void verifytextbyid(String ExpText,String id){
		 try {
			if(ExpText.equals(driver.findElement(By.id(id)).getText()))
			 {
			  System.out.println("The text matches");
			 }	
			 else
			 {
			  System.out.println("The text doesn't match");
			 }
		} catch (NoSuchElementException e) {
			System.out.println("The element with id  : " + id + " could not be found !!");
		}
				}
		
		//Input - ExpectedText and xpath
	    //Output - Verify the Expected text with the current text and print the appropriate status
		public void verifytextbyxpath(String ExpText,String xpath){
			 try {
				if(ExpText.equals(driver.findElement(By.xpath(xpath)).getText()))
				 {
				  System.out.println("The text matches");
				 }	
				 else
				 {
				  System.out.println("The text doesn't match");
				 }
			} catch (NoSuchElementException e) {
				System.out.println("The element with xpath  : " + xpath + " could not be found !!");
			}
					}
		//Input - ExpectedText and classname
	    //Output - Verify the Expected text with the current text and print the appropriate status
		public void verifytextbyclassname(String ExpText,String cname){
			 try {
				if(ExpText.equals(driver.findElement(By.className(cname)).getText()))
				 {
				  System.out.println("The text matches");
				 }	
				 else
				 {
				  System.out.println("The text doesn't match");
				 }
			} catch (NoSuchElementException e) {
				System.out.println("The element with classname  : " + cname + " could not be found !!");
			}
					}
		//Input-No input
		//Output-Switches to last window
		public void switchtolastwindow()
		{
		Set<String>	whandles=driver.getWindowHandles();
		int size = whandles.size();
		System.out.println("The total number of windows are" +size);
		for (String i : whandles) {
			if(i.equals(size)){
				driver.switchTo().window(i);
				System.out.println("This is the last window");
			                  }
		}
		}
		
		}
		
		
			
			
			


