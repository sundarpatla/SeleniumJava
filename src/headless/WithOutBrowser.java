package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithOutBrowser {
	
	WebDriver driver;
	  @Test
	  public void withoutbrowser() {
		  
		  EdgeOptions co=new EdgeOptions();
		  co.addArguments("headless");
		  driver=new EdgeDriver(co); 
		   
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
		  
		  
		  driver.get("https://www.google.com/");
		  
		  String exptab = "Google";
		  
		  String acttab = driver.getTitle();
		  
		  Assert.assertEquals(acttab, exptab);
	  }
	}
 

