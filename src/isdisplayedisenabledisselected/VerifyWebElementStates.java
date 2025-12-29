package isdisplayedisenabledisselected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyWebElementStates {

	WebDriver driver;

	@Test
	public void isDisplayedMethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		
		boolean usroremail = driver.findElement(By.xpath("//*[@id=\"loginform\"]/p[1]/label")).isDisplayed();
		
		if(usroremail==true)
		{
			System.out.println("Username or Email text is Available in Login page");
			
		}
		
		else
		{
		System.out.println("Username or Email text is Not Available in Login page");
		}
		
	}
	
	@Test
	public void isDisplayedMethodOne() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		
		boolean lypswd = driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).isDisplayed();
		
		if(lypswd==true)
		{
			System.out.println("Last your password link is Available in Login page");
			driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
			
		}
		
		else
		{
			System.out.println("Last your password links is Not Available in Login page");
		}
		
	}
	
	
	@Test
	public void isEnabledMethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		
		boolean usrtxtbox = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
		
		if(usrtxtbox==true)
		{
			System.out.println("Username text field is enabled to enter the username");
			driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Karunakar");
		}
		
		else
		{
			System.out.println("Username text field is Not enabled to enter the username");
		}
		
	}
	
	@Test
	public void isSelectedMethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		Thread.sleep(2000);

		boolean checkbox = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
		
		if(checkbox==true)
		{
			System.out.println("Rememeber me checkbox is Selected");
		}
		
		else
		{
			System.out.println("Rememeber me checkbox is Not Selected");	
		}
		
		
	}
	
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
  }

}
