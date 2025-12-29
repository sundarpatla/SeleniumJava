package Pagescrolldownandup;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrollDownandUp {
	
	WebDriver driver;

	@Test
	public void scrollDown() throws InterruptedException {
		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("scroll(0,3500)");
	
	//	Thread.sleep(4000);
			
	//	driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
		
	}
	
	
	@Test
	public void scrollUp() throws InterruptedException {
	//	driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("scroll(3500,0)");
	
		Thread.sleep(4000);
			
		
		
	}
	
	
	@Test 
    public void IndentifyLoacatorElement() throws Exception {
		driver.get("https://www.selenium.dev");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
    {
        WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a"));
        Coordinates coordinate = ((Locatable)element).getCoordinates(); 
        coordinate.onPage(); 
        coordinate.inViewPort();
         }    
    driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
      }

  @BeforeTest
  public void beforeTest() {
	  
	  driver  = new EdgeDriver();
	  
	  driver.manage().window().maximize();
  }

}
