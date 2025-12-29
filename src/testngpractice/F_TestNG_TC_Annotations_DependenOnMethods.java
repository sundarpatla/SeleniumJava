package testngpractice;

import org.testng.annotations.Test;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class F_TestNG_TC_Annotations_DependenOnMethods {
	
	WebDriver driver;
	
	  @Test(dependsOnMethods="method2")
	  public void method1() throws Exception {
		  
		  driver.findElement(By.id("user_login")).sendKeys("Sundar");
			
		  Thread.sleep(2000);
			
		  driver.findElement(By.name("pwd")).sendKeys("Hello@123");
			
		  Thread.sleep(2000);
			
		  driver.findElement(By.id("rememberme")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.className("wp-login-lost-password")).click();
		  
	  }
	  @Test
	  public void method2() {
		  
		  driver.get("https://www.techlearn.in/admin");
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  
		  driver = new EdgeDriver();
		  
		  driver.manage().window().maximize();
		   
	  }

}
