package log4jframework;

import org.testng.annotations.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Log4jTutorial {
	
	WebDriver driver;
  @Test
  public void tehlearnlogin() {
	  
	  Logger log= Logger.getLogger("Login Module");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  log.info("Test HTML log Entry");
	  
	  driver  = new EdgeDriver();
	  
	  log.info("Edge Browser Launched");
	  
	  driver.manage().window().maximize();
	  
	  log.info("Edge Browser launched and maximized");
	  
	  driver.get("https://www.techlearn.in/admin");
	  
	  log.info("Navigate to techlearn login page");
		
		
	  driver.findElement(By.id("user_login")).sendKeys("Sundar");
		
      log.info("Entered the username");
		
	  driver.findElement(By.name("pwd")).sendKeys("Hello@123");
	  
	  log.info("Entered the password");
	  
	  driver.findElement(By.id("rememberme")).click();
	  
	  log.info("Selected the rememberme check box option");
	  
	  LogManager.shutdown();
  }

}
