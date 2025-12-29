package testngpractice;

import org.testng.annotations.Test;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class D_TestNG_TC_Annotations_Skip_Ignore_Disabled {
	
	WebDriver driver;
	
	@Test(priority=0)
	  public void zomato() {
		  
		  driver.get("https://www.zomato.com");
		  
	  }
	  @Test(priority=2,enabled=false)
	  public void twitter() {
		  
		  driver.get("https://www.x.com");
		  
	  }
	  @Test(enabled=false,priority=1,description="selenium")
	  public void selenium() {
		  
		  driver.get("https://www.selenium.dev");
		  
	  }
	  @Test(priority=3)
	  public void swiggy() {
		  
		  driver.get("https://www.swiggy.com");
		  
	  }
	  @Ignore
	  @Test(priority=4)
	  public void redmine() {
		  
		  driver.get("https://www.redmine.org");
		  
	  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new EdgeDriver();
	  
	  driver.manage().window().maximize();
	   
  }

}
