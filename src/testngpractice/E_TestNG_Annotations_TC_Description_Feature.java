package testngpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class E_TestNG_Annotations_TC_Description_Feature {
	
	WebDriver driver;
	
  @Test(description="verify the zomato URL")
  public void test1() {
	  
	  driver.get("www.zomato.com");
	  
  }
  @Test(description="verify the twitter URL")
  public void test2() {
	  
	  driver.get("https://www.x.com");
	  
  }
  @Test(description="verify the selenium URL")
  public void test3() {
	  
	  driver.get("https://www.selenium.dev");
	  
  }
  @Test(description="verify the swiggy URL")
  public void test4() {
	  
	  driver.get("www.swiggy.com");
	  
  }
  @Test(description="verify the redmine URL")
  public void test5() {
	  
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
