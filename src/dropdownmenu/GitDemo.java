package dropdownmenu;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class GitDemo {
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
  }

}
