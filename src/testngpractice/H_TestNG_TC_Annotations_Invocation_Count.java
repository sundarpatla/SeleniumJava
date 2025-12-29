package testngpractice;

import org.testng.annotations.Test;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class H_TestNG_TC_Annotations_Invocation_Count {
	
	WebDriver driver;
	
	  @Test
	  public void method1() throws Exception {
		  
		  driver.get("https://www.techlearn.in/admin");
		  
		  driver.findElement(By.id("user_login")).sendKeys("Sundar");
			
		  Thread.sleep(2000);
			
		  driver.findElement(By.name("pwd")).sendKeys("Hello@123");
			
		  Thread.sleep(2000);
			
		  driver.findElement(By.id("rememberme")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.className("wp-login-lost-password")).click();
		  
	  }
	  @Test(invocationCount=5)
	  public void method2() throws Exception {
		  
		  driver.get("https://www.seleniumlearn.com/admin");
		  
		  driver.findElement(By.id("user_login")).sendKeys("karunakar");
			
		  Thread.sleep(2000);
			
		  driver.findElement(By.name("pwd")).sendKeys("Hello@123");
			
		  Thread.sleep(2000);
			
		  driver.findElement(By.id("rememberme")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("wp-submit")).click();
		  
	  }
	  
	  @Test
	  public void method3() throws Exception {
		  
		  driver.get("https://www.bhanutechsolutions.in/admin");
		  
		  driver.findElement(By.id("user_login")).sendKeys("goutham");
			
		  Thread.sleep(2000);
			
		  driver.findElement(By.name("pwd")).sendKeys("Hello@123");
			
		  Thread.sleep(2000);
			
		  driver.findElement(By.id("rememberme")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.className("wp-login-lost-password")).click();
		  
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  
		  driver = new EdgeDriver();
		  
		  driver.manage().window().maximize();
		   
	  }

}
