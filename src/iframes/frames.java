package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class frames {
	WebDriver driver;

	@Test
	public void frameshandle() throws InterruptedException {
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(3000);
		
	//	WebElement myObj = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	//	driver.switchTo().frame(myObj);
		
	//	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
		
	//	driver.switchTo().frame(1);
		
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(2000);		
		
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);		

		driver.switchTo().alert().accept();
		Thread.sleep(2000);	
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
		
	//	driver.switchTo().parentFrame();
		
	}

  @BeforeTest
  public void beforeTest() {
	  
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();  
  }

}
