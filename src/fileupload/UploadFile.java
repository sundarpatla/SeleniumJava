package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadFile {
	
	WebDriver driver;

	@Test
	public void fileattachement() throws InterruptedException {
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"myFile\"]")).sendKeys("C:\\Users\\Ganesh\\Downloads\\JNTUGV coverletter.pdf");
		
	}

  @BeforeTest
  public void beforeTest() {
	  
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
  }

}
