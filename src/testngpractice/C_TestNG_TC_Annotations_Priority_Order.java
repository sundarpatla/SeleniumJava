package testngpractice;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class C_TestNG_TC_Annotations_Priority_Order {
	
	WebDriver driver;
	
	@Test(priority=0)
	  public void zomato() {
		  
		  driver.get("https://www.zomato.com");
		  
	  }
	  @Test(priority=2)
	  public void twitter() {
		  
		  driver.get("https://www.x.com");
		  
	  }
	  @Test(priority=1)
	  public void selenium() {
		  
		  driver.get("https://www.selenium.dev");
		  
	  }
	  @Test
	  public void swiggy() {
		  
		  driver.get("https://www.swiggy.com");
		  
	  }
	  @Test
	  public void redmine() {
		  
		  driver.get("https://www.redmine.org");
		  
	  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new EdgeDriver();
	  
	  driver.manage().window().maximize();
	   
  }

}
