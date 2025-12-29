package alertwindowhandles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopUpAlerts {

	WebDriver driver;

	@Test
	public void alertokbutton() throws InterruptedException {

		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();

		Thread.sleep(2000);

		driver.switchTo().alert().accept(); // accept method for click ok on window alert.

	}

	@Test
	public void alertcancelbutton() throws InterruptedException {

		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();

		Thread.sleep(2000);

		driver.switchTo().alert().dismiss(); // dismiss method for click cancel on window alert.
	}
	
	@Test
	public void alertenterokcancelbutton() throws InterruptedException {

		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();

		Thread.sleep(2000);

		/*driver.switchTo().alert().sendKeys("Sundar");// sendkeys to enter yes/No or any name
		
		Thread.sleep(2000);*/
		
		//driver.switchTo().alert().accept();// accept to click ok on alert of prompt dialog box.
		//driver.switchTo().alert().dismiss(); //dismiss cancel the selection in alert.
		
		Alert alt= driver.switchTo().alert();
		alt.sendKeys("Sundar");
		alt.accept();
		
	}
	
	@Test
	public void noalertwindows() throws InterruptedException {

		driver.get("https://www.techlearn.in/");

		Thread.sleep(2000);

		driver.switchTo().alert().accept(); // dismiss method for click cancel on window alert.
	}
	


	@BeforeTest
	public void beforeTest() {

		driver = new EdgeDriver();

		driver.manage().window().maximize();
	}

}
