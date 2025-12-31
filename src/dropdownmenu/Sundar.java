package dropdownmenu;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Sundar {
	WebDriver driver;
  @Test
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();  
	  driver.manage().window().maximize();
  }
	 @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
