package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Search {
	
	WebDriver driver;
	
  @Test
  public void googlesearch() {
	  
	  driver.get("https://www.google.com");
	  
	  driver.findElement(By.name("q")).sendKeys("Teachlearn.in");
  }
  
  @Test
  public void googleselenium() {
	  
	  driver.get("https://www.google.com");
	  
	  driver.findElement(By.name("q")).sendKeys("Selenium Jobs");
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new EdgeDriver();
	  
	  driver.manage().window().maximize();
  }

}
