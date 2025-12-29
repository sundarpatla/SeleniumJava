package testngpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class J_TestNG_Annotations2_Execution_from_groups {
	
	WebDriver driver;
	
  @Test(groups="food")
  public void zomato() {
	  
	  driver.get("https://www.zomato.com");
	  
  }
  @Test(groups="social")
  public void twitter() {
	  
	  driver.get("https://www.x.com");
	  
  }
  @Test(groups={"search","AI"})
  public void google() {
	  
	  driver.get("https://www.google.com");
	  
  }
  @Test(groups="AI")
  public void chatgpt() {
	  
	  driver.get("https://www.chatgpt.com");
	  
  }
  @Test(groups="AI")
  public void deepseek() {
	  
	  driver.get("https://www.deepseek.com"); 
	  
  }
  
  @Test(groups="Technical")
  public void selenium() {
	  
	  driver.get("https://www.selenium.dev");
	  
  }
  @Test(groups="food")
  public void swiggy() {
	  
	  driver.get("https://www.swiggy.com");
	  
  }
  @Test(groups="Technical")
  public void redmine() {
	  
	  driver.get("https://www.redmine.org");
	  
  }
  @BeforeTest(groups="AI")
  public void beforeTest() {
	  
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
