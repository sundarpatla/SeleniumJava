package newtabandnewwindows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchToNewTabandWindows {
	
	WebDriver driver;

	@Test
	public void techlearndownloads() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-12\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post-57\"]/div/div/div/div/div/div/section/div[3]/a")).click();
		Thread.sleep(2000);
		
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[4]/a/span")).click();
		Thread.sleep(2000);

		driver.switchTo().window(tabs.get(0));
		
		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-18\"]/a")).click();
		
	}
	
	@Test
	public void openappandcreatenewtaborwindow() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);

		driver.get("https://www.facebook.com");
	}
	
	
	@Test
	public void techlearnnewtab() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);

		// driver.switchTo().newWindow(WindowType.TAB);  // Selenium 4
		driver.switchTo().newWindow(WindowType.WINDOW);  // Selenium 4

		driver.navigate().to("https://www.selenium.dev");

		// driver.close();
		Thread.sleep(2000);
		
		
	/* 	Set<String> obj = driver.getWindowHandles();
		Object s[] = obj.toArray();
		driver.switchTo().window(s[1].toString()); */


		driver.findElement(By.xpath("//a[normalize-space()='Downloads']")).click();
		Thread.sleep(2000);
		
		Set<String> obj = driver.getWindowHandles();
		Object s[] = obj.toArray();
		driver.switchTo().window(s[0].toString()); 

		driver.findElement(By.xpath("//a[contains(text(),'Placements')]")).click();
	}

  @BeforeTest
  public void beforeTest() {
	  
	  driver = new EdgeDriver();
	  
	  driver.manage().window().maximize();
  }

}
