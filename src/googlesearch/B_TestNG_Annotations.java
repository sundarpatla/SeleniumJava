package googlesearch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class B_TestNG_Annotations {
	
	WebDriver driver;
	
  @Test
  public void zomato() {
	  
	  driver.get("https://www.zomato.com");
	  
  }
  @Test
  public void twitter() {
	  
	  driver.get("https://www.x.com");
	  
  }
  @Test
  public void selenium() {
	  
	  driver.get("https://www.selenium.com");
	  
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

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
